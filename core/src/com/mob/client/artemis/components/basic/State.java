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
package com.mob.client.artemis.components.basic;

import com.artemis.Component;

/**
 * @author Rodrigo
 *
 */
public class State extends Component {

	// ===========================================================
	// Constants
	// ===========================================================
	public static final int STATE_NORMAL = 0;

	// ===========================================================
	// Fields
	// ===========================================================
	public int current = STATE_NORMAL;
	public float time = 0.0f;

	// ===========================================================
	// Constructors
	// ===========================================================
    public State(int state) {
        this.current = state;
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
