/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.oscar.mp.entity;

import java.sql.Time;
import java.util.Objects;

/**
 *
 * @author Philipp
 */
public class TimeSlot {
    
    private String _timeID;
    private float _duration;
    private Time _startTime;
    private Time _endTime;

    public TimeSlot() {
        //
    }
    
    public TimeSlot(String timeID, float duration, Time startTime, Time endTime) {
        this._timeID = timeID;
        this._duration = duration;
        this._startTime = startTime;
        this._endTime = endTime;
    }

    public String getTimeID() {
        return _timeID;
    }

    public void setTimeID(String timeID) {
        this._timeID = timeID;
    }

    public float getDuration() {
        return _duration;
    }

    public void setDuration(float duration) {
        this._duration = duration;
    }

    public Time getStartTime() {
        return _startTime;
    }

    public void setStartTime(Time startTime) {
        this._startTime = startTime;
    }

    public Time getEndTime() {
        return _endTime;
    }

    public void setEndTime(Time endTime) {
        this._endTime = endTime;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this._timeID);
        hash = 97 * hash + Float.floatToIntBits(this._duration);
        hash = 97 * hash + Objects.hashCode(this._startTime);
        hash = 97 * hash + Objects.hashCode(this._endTime);
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
        final TimeSlot other = (TimeSlot) obj;
        if (Float.floatToIntBits(this._duration) != Float.floatToIntBits(other._duration)) {
            return false;
        }
        if (!Objects.equals(this._timeID, other._timeID)) {
            return false;
        }
        if (!Objects.equals(this._startTime, other._startTime)) {
            return false;
        }
        if (!Objects.equals(this._endTime, other._endTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "TimeSlot{" + "_timeID=" + _timeID + ", _duration=" + _duration + ", _startTime=" + _startTime + ", _endTime=" + _endTime + '}';
    }
    
}
