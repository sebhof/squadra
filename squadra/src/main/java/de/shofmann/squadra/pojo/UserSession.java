/*
 * Copyright (C) 2015 shofmann
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.shofmann.squadra.pojo;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author shofmann
 */
@XmlRootElement
public class UserSession {
    
    private String userRole;

    /**
     * Get the value of userRole
     *
     * @return the value of userRole
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Set the value of userRole
     *
     * @param userRole new value of userRole
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

}
