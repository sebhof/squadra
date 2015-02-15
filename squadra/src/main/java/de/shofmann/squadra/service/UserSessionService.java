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
package de.shofmann.squadra.service;

import de.shofmann.squadra.beans.UserSessionBean;
import de.shofmann.squadra.pojo.UserSession;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author shofmann
 */
@Stateless
@Path("session")
@Produces("application/json")
@Consumes("application/json")
public class UserSessionService {
    
    @EJB
    private UserSessionBean userSessionBean;
    
    @GET
    @RolesAllowed({"ADMIN", "USER"})
    public UserSession getUserSession() {
        return this.userSessionBean.getUserSession();
    }
}
