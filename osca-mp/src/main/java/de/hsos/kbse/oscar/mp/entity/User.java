/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.oscar.mp.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.enterprise.context.Dependent;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author PMark
 */

@Entity
@Table
public class User {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String _id;
    private String _studentName;
    private String _email;
    private String _studentPassword;
    private boolean _isDozent;
    
    //Relation zu Modul (OOAD, Mathe 2,...)
    @ManyToMany
    private List<Module> modules;
    
    
    public User() {
        //
    }

    public User(String id, String studentName, String email, String studentPassword, boolean isDozent) {
        this._id = id;
        this._studentName = studentName;
        this._email = email;
        this._studentPassword = studentPassword;
        this._isDozent = isDozent;
    }
   
    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getStudentName() {
        return _studentName;
    }

    public void setStudentName(String _studentName) {
        this._studentName = _studentName;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String _email) {
        this._email = _email;
    }

    public String getStudentPassword() {
        return _studentPassword;
    }

    public void setStudentPassword(String _studentPassword) {
        this._studentPassword = _studentPassword;
    }

    public boolean isIsDozent() {
        return _isDozent;
    }

    public void setIsDozent(boolean _isDozent) {
        this._isDozent = _isDozent;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this._id);
        hash = 37 * hash + Objects.hashCode(this._studentName);
        hash = 37 * hash + Objects.hashCode(this._email);
        hash = 37 * hash + Objects.hashCode(this._studentPassword);
        hash = 37 * hash + (this._isDozent ? 1 : 0);
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
        final User other = (User) obj;
        if (this._isDozent != other._isDozent) {
            return false;
        }
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        if (!Objects.equals(this._studentName, other._studentName)) {
            return false;
        }
        if (!Objects.equals(this._email, other._email)) {
            return false;
        }
        if (!Objects.equals(this._studentPassword, other._studentPassword)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "_id=" + _id + ", _studentName=" + _studentName + ", _email=" + _email + ", _studentPassword=" + _studentPassword + ", _isDozent=" + _isDozent + '}';
    }
}
