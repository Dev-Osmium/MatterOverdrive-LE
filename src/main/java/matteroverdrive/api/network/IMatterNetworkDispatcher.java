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

package matteroverdrive.api.network;

import matteroverdrive.matter_network.MatterNetworkTaskQueue;
import net.minecraft.util.math.BlockPos;

/**
 * Created by Simeon on 4/20/2015.
 * This is used by Machines that can issue tasks (orders) to other Machines on the Matter Network.
 */
public interface IMatterNetworkDispatcher {
    /**
     * Gets the Task queue of the Machine at the given ID.
     *
     * @param queueID the ID of the Queue.
     * @return the task queue at the given ID.
     */
    MatterNetworkTaskQueue getTaskQueue(int queueID);

    /**
     * @return the number of task queues in the machine.
     */
    int getTaskQueueCount();

    BlockPos getPosition();
}
