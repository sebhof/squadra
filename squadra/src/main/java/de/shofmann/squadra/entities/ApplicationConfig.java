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
package de.shofmann.squadra.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class holds the application configuration
 * 
 * @author shofmann
 */
@Entity
@Table(name = "application_config")
public class ApplicationConfig implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "username", nullable = false, length = 255)
    private String adminPassword;

    @Column(name = "admin_password_changed", nullable = false)
    private boolean adminPasswordChanged;

    /**
     * Get the value of adminPasswordChanged
     *
     * @return the value of adminPasswordChanged
     */
    public boolean isAdminPasswordChanged() {
        return adminPasswordChanged;
    }

    /**
     * Set the value of adminPasswordChanged
     *
     * @param adminPasswordChanged new value of adminPasswordChanged
     */
    public void setAdminPasswordChanged(boolean adminPasswordChanged) {
        this.adminPasswordChanged = adminPasswordChanged;
    }

    /**
     * Get the value of adminPassword
     *
     * @return the value of adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * Set the value of adminPassword
     *
     * @param adminPassword new value of adminPassword
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }   
    
}
