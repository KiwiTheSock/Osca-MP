/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.oscar.mp.view;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author wihowert
 */
@Named
@ViewScoped
public class DropdownViewStudent implements Serializable {

    private Map<String, Map<String, String>> modulDay = new HashMap<String, Map<String, String>>();
    private Map<String, Map<String, String>> dayTime = new HashMap<String, Map<String, String>>();
    private String modul;
    private String day;
    private String time;
    private Map<String, String> moduls = new HashMap<>();
    private Map<String, String> days = new HashMap<>();;
    private Map<String, String> times = new HashMap<>();;

    @PostConstruct
    public void init() {
        setModuls(new HashMap<>());
        setTimes(new HashMap<>());
        
        getModuls().put("Mathe1", "Mathe 1");
        getModuls().put("KBSE", "KBSE");
        getModuls().put("OOAD", "OOAD");
        
        getTimes().put("13:00", "13:00");
        getTimes().put("14:00", "14:00");
        getTimes().put("15:00", "15:00");
        //(K,V)
        days.put("15.10.2019", "15.10.2019");
        days.put("16.10.2019", "16.10.2019");
        days.put("17.10.2019", "17.10.2019");
        getModulDay().put("Mathe 1", days);

        days.put("18.10.2019", "18.10.2019");
        days.put("19.10.2019", "19.10.2019");
        days.put("20.10.2019", "20.10.2019");
        getModulDay().put("KBSE", days);

        days.put("15.10.2019", "15.10.2019");
        days.put("16.10.2019", "16.10.2019");
        days.put("17.10.2019", "17.10.2019");
        getModulDay().put("OOAD", days);
        
        getDayTime().put("15.10.2019", times);
    }

    public Map<String, Map<String, String>> getModulDay() {
        return modulDay;
    }

    public String getModul() {
        return modul;
    }

    public void setModul(String modul) {
        this.modul = modul;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Map<String, String> getModuls() {
        return moduls;
    }

    public Map<String, String> getDays() {
        return days;
    }

    public void onCountryChange() {
        if (getModul() != null && !modul.equals("")) {
            setDays(getModulDay().get(getModul()));
        } else {
            setDays(new HashMap<String, String>());
        }
    }

    public void displayLocation() {
        FacesMessage msg;
        if (getDay() != null && getModul() != null && getTime() != null) {
            msg = new FacesMessage("Bestätigt: ", getModul() + " am " + getDay() + " um " + getTime() + " Uhr.");
        } else {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fehler", "Modul ist nicht ausgewählt.");
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * @param modulDay the modulDay to set
     */
    public void setModulDay(Map<String, Map<String, String>> modulDay) {
        this.modulDay = modulDay;
    }

    /**
     * @param moduls the moduls to set
     */
    public void setModuls(Map<String, String> moduls) {
        this.moduls = moduls;
    }

    /**
     * @param days the days to set
     */
    public void setDays(Map<String, String> days) {
        this.days = days;
    }

    /**
     * @return the times
     */
    public Map<String, String> getTimes() {
        return times;
    }

    /**
     * @param times the times to set
     */
    public void setTimes(Map<String, String> times) {
        this.times = times;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the dayTime
     */
    public Map<String, Map<String, String>> getDayTime() {
        return dayTime;
    }

    /**
     * @param dayTime the dayTime to set
     */
    public void setDayTime(Map<String, Map<String, String>> dayTime) {
        this.dayTime = dayTime;
    }

}
