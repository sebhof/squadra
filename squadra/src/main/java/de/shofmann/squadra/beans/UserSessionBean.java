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
package de.shofmann.squadra.beans;

import de.shofmann.squadra.pojo.UserSession;
import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateful;

/**
 *
 * @author shofmann
 */
@Stateful
public class UserSessionBean {
    
    @Resource
    private SessionContext sessionContext;
    
    public UserSession getUserSession() {
        UserSession session = new UserSession();
        if(this.sessionContext.isCallerInRole(USER_ROLES.ADMIN.toString())) {
            session.setUserRole(USER_ROLES.ADMIN.toString());
        } else {
            session.setUserRole(USER_ROLES.USER.toString());
        }
        return session;
    }
    
    private static enum USER_ROLES {
        
        ADMIN,
        
        USER
        
    }
}
