/*
 * This file is part of MatterOverdrive: Legacy Edition
 * Copyright (C) 2020, Simeon Radivoev/Horizon Studios <contact@hrznstudio.com>, All rights reserved.
 *
 * MatterOverdrive: Legacy Edition is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * MatterOverdrive: Legacy Edition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Matter Overdrive.  If not, see <http://www.gnu.org/licenses>.
 */

package matteroverdrive.multiblock;

import matteroverdrive.machines.MOTileEntityMachine;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class MultiBlockTileStructureMachine extends MultiBlockTileStructureAbstract {
    private final HashSet<IMultiBlockTile> tiles = new HashSet<>();
    private MOTileEntityMachine machine;

    public MultiBlockTileStructureMachine(MOTileEntityMachine machine) {
        this.machine = machine;
    }

    @Override
    public boolean addMultiBlockTile(IMultiBlockTile tile) {
        if (tile != null && !containsMultiBlockTile(tile) && tile.canJoinMultiBlockStructure(this)) {
            tile.setMultiBlockTileStructure(this);
            return tiles.add(tile);
        }
        return false;
    }

    public void update() {
        Iterator<IMultiBlockTile> iterator = tiles.iterator();
        while (iterator.hasNext()) {
            IMultiBlockTile tile = iterator.next();
            if (tile == null)
                continue;
            if (tile.isTileInvalid()) {
                tile.setMultiBlockTileStructure(null);
                iterator.remove();
            }
        }
    }

    public void invalidate() {
        Iterator<IMultiBlockTile> iterator = tiles.iterator();
        while (iterator.hasNext()) {
            iterator.next().setMultiBlockTileStructure(null);
            iterator.remove();
        }
        machine = null;
    }

    @Override
    public void removeMultiBlockTile(IMultiBlockTile tile) {
        tiles.remove(tile);
        tile.setMultiBlockTileStructure(null);
    }

    @Override
    public boolean containsMultiBlockTile(IMultiBlockTile tile) {
        return tiles.contains(tile);
    }

    public MOTileEntityMachine getMachine() {
        return machine;
    }

    public Collection<IMultiBlockTile> getTiles() {
        return tiles;
    }

    public boolean isInvalid() {
        return machine == null || machine.isInvalid();
    }
}
