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

package matteroverdrive.client.render;

import matteroverdrive.api.inventory.IBionicPart;
import matteroverdrive.api.renderer.IBionicPartRenderRegistry;
import matteroverdrive.api.renderer.IBionicPartRenderer;

import java.util.HashMap;
import java.util.Map;

public class AndroidBionicPartRenderRegistry implements IBionicPartRenderRegistry {
    private final Map<Class<? extends IBionicPart>, IBionicPartRenderer> rendererMap;

    public AndroidBionicPartRenderRegistry() {
        rendererMap = new HashMap<>();
    }

    @Override
    public void register(Class<? extends IBionicPart> partClass, IBionicPartRenderer renderer) {
        rendererMap.put(partClass, renderer);
    }

    @Override
    public IBionicPartRenderer removeRenderer(Class<? extends IBionicPart> partClass) {
        return rendererMap.remove(partClass);
    }

    @Override
    public IBionicPartRenderer getRenderer(Class<? extends IBionicPart> partClass) {
        return rendererMap.get(partClass);
    }
}
