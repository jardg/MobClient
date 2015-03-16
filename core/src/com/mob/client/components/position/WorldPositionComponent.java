/*******************************************************************************
 * Copyright (C) 2014  Rodrigo Troncoso
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as
 *     published by the Free Software Foundation, either version 3 of the
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package com.mob.client.components.position;

import com.badlogic.ashley.core.Component;
import com.badlogic.gdx.math.Vector3;
import com.mob.client.data.WorldPosition;

/**
 * WorldPositionComponent Class
 *
 * @author Rodrigo
 * @package com.mob.client.components.position
 */
public class WorldPositionComponent extends Component {

	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================
    public int map;
    public int x;
    public int y;

	// ===========================================================
	// Constructors
	// ===========================================================
    public WorldPositionComponent(int x, int y, int map) {
        this.x = x;
        this.y = y;
        this.map = map;
    }

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================


	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================

}