/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.oscar.mp.entity;

import java.util.Objects;
import javax.enterprise.context.Dependent;

/**
 *
 * @author PMark
 */
@Dependent
public class User {
    
    private String id;
    private String studentName;
    private String studentPassword;
    private boolean isDozent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public boolean isIsDozent() {
        return isDozent;
    }

    public void setIsDozent(boolean isDozent) {
        this.isDozent = isDozent;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.studentName);
        hash = 89 * hash + Objects.hashCode(this.studentPassword);
        hash = 89 * hash + (this.isDozent ? 1 : 0);
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
        if (this.isDozent != other.isDozent) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.studentName, other.studentName)) {
            return false;
        }
        if (!Objects.equals(this.studentPassword, other.studentPassword)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", studentName=" + studentName + ", studentPassword=" + studentPassword + ", isDozent=" + isDozent + '}';
    }
}
