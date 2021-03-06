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

package matteroverdrive.data.matter;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class MatterEntryBlock extends MatterEntryAbstract<Block, IBlockState> {
    public MatterEntryBlock(Block block) {
        super(block);
    }

    @Override
    public void writeTo(DataOutput output) throws IOException {

    }

    @Override
    public void writeTo(NBTTagCompound tagCompound) {

    }

    @Override
    public void readFrom(DataInput input) throws IOException {

    }

    @Override
    public void readFrom(NBTTagCompound tagCompound) {

    }

    @Override
    public void readKey(String data) {

    }

    @Override
    public String writeKey() {
        return null;
    }

    @Override
    public boolean hasCached() {
        return false;
    }
}
