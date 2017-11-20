/*
 * Copyright 2017 riddles.io (developers@riddles.io)
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 *     For the full copyright and license information, please view the LICENSE
 *     file that was distributed with this source code.
 */

package de.bjma.goladai.move;

import java.awt.Point;

/**
 * move.KillMove - Created on 24-2-17
 *
 * Used to output a kill move to the engine
 *
 * @author Jim van Eeden - jim@riddles.io
 */
public class KillMove extends AbstractMove {

    private Point killPoint;

    public KillMove(Point killPoint) {
        this.moveType = MoveType.KILL;
        this.killPoint = killPoint;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.moveType.toString(), pointToString(this.killPoint));
    }
}