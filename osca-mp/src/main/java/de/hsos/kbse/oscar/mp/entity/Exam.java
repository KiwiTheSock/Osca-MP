/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.oscar.mp.entity;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author Philipp
 */
@Entity //Create persisten Unite
public class Exam {
    
    @GeneratedValue
    @Id
    private long _id;
    private float _duration;
    private Time _start;
    private Time _end;
    private int _spaceforStudents;
    private Date _day;
    
    @ManyToMany
    private List<User> users;

    public Exam(long _id, float _duration, Time _start, Time _end, int _space, Date _day) {
        this._id = _id;
        this._duration = _duration;
        this._start = _start;
        this._end = _end;
        this._spaceforStudents = _space;
        this._day = _day;
    }

    public long getId() {
        return this._id;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public float getDuration() {
        return _duration;
    }

    public void setDuration(float _duration) {
        this._duration = _duration;
    }

    public Time getStart() {
        return _start;
    }

    public void setStart(Time _start) {
        this._start = _start;
    }

    public Time getEnd() {
        return _end;
    }

    public void setEnd(Time _end) {
        this._end = _end;
    }

    public int getSpace() {
        return _spaceforStudents;
    }

    public void setSpace(int _space) {
        this._spaceforStudents = _space;
    }

    public Date getDay() {
        return _day;
    }

    public void setDay(Date _day) {
        this._day = _day;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this._id ^ (this._id >>> 32));
        hash = 67 * hash + Float.floatToIntBits(this._duration);
        hash = 67 * hash + Objects.hashCode(this._start);
        hash = 67 * hash + Objects.hashCode(this._end);
        hash = 67 * hash + this._spaceforStudents;
        hash = 67 * hash + Objects.hashCode(this._day);
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
        final Exam other = (Exam) obj;
        if (this._id != other._id) {
            return false;
        }
        if (Float.floatToIntBits(this._duration) != Float.floatToIntBits(other._duration)) {
            return false;
        }
        if (this._spaceforStudents != other._spaceforStudents) {
            return false;
        }
        if (!Objects.equals(this._start, other._start)) {
            return false;
        }
        if (!Objects.equals(this._end, other._end)) {
            return false;
        }
        if (!Objects.equals(this._day, other._day)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exam{" + "_id=" + _id + ", _duration=" + _duration + ", _start=" + _start + ", _end=" + _end + ", _space=" + _spaceforStudents + ", _day=" + _day + '}';
    }

}
