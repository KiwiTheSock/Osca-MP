/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.oscar.mp.entity;

import java.util.Objects;

/**
 *
 * @author Philipp
 */
public class Module {
    
    private int _id;
    private String _name;
    private int _semester;

    public Module() {
        
    }
    
    public Module(int id, String name, int semester) {
        
    }

    public int getId() {
        return _id;
    }

    public void setId(int _id) {
        this._id = _id;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getSemester() {
        return _semester;
    }

    public void setSemester(int _semester) {
        this._semester = _semester;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + this._id;
        hash = 23 * hash + Objects.hashCode(this._name);
        hash = 23 * hash + this._semester;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Module other = (Module) obj;
        if (this._id != other._id) {
            return false;
        }
        if (this._semester != other._semester) {
            return false;
        }
        if (!Objects.equals(this._name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Module{" + "_id=" + _id + ", _name=" + _name + ", _semester=" + _semester + '}';
    }
    
}
