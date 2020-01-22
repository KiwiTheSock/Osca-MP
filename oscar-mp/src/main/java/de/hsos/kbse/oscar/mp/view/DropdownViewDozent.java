/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.oscar.mp.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import logger.interceptorbinding.LevelEnum;
import logger.interceptorbinding.Logable;

/**
 *
 * @author wihowert
 */
@Named
@ViewScoped
public class DropdownViewDozent implements Serializable {

    private Map<String, String> terms = new HashMap<>();
    private Map<String, Integer> durations = new HashMap<>();
    private Map<String, Integer> studentCounts = new HashMap<>();
    private List<String> convertListTerms = new ArrayList<>();
    private List<String> convertListDurations = new ArrayList<>();
    private List<String> convertListStudentCounts = new ArrayList<>();
    private String term;
    private String text;
    private String modulName;
    private int duration = 30;
    private int studentCount = 1;
    private boolean termExists = false;
    private boolean buttonCheck = false;

    @PostConstruct
    public void init() {
        getTerms().put("Semester1", "WiSe 17/18");
        getTerms().put("Semester2", "SoSe 18");
        getTerms().put("Semester3", "WiSe 18/19");
        getTerms().put("Semester4", "SoSe 19");
        getTerms().put("Semester5", "WiSe 19/20");
        getTerms().put("Semester6", "SoSe 20");

        getDurations().put("Duration1", 20);
        getDurations().put("Duration2", 30);

        getStudentCounts().put("1", 1);
        getStudentCounts().put("2", 2);
        getStudentCounts().put("3", 3);
        getStudentCounts().put("4", 4);
        getStudentCounts().put("5", 5);

        for (Map.Entry<String, String> map : getTerms().entrySet()) {
            getConvertListTerms().add(map.getValue());
        }

        getConvertListTerms().sort(Comparator.naturalOrder());

        for (Map.Entry<String, Integer> map : getDurations().entrySet()) {
            getConvertListDurations().add(map.getValue().toString());
        }

        for (Map.Entry<String, Integer> map : getStudentCounts().entrySet()) {
            getConvertListStudentCounts().add(map.getValue().toString());
        }
    }

    public void displayLog() {
        FacesMessage msg;
        if (getTerm() != null) {
            msg = new FacesMessage("Bestätigt: ", "Für das " + getTerm() + " das Modul \"" + getModulName()
                    + "\" mit der Prüfungsdauer " + getDuration() + " für "
                    + getStudentCount() + " Prüfling(e) angelegt");
        } else {
            msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Fehler", "Parameter nicht ausgewählt.");
        }

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    /**
     * @return the terms
     */
    public Map<String, String> getTerms() {
        return terms;
    }

    /**
     * @param terms the terms to set
     */
    public void setTerms(Map<String, String> terms) {
        this.terms = terms;
    }

    /**
     * @return the term
     */
    @Logable(logLevel = LevelEnum.INFO)
    public String getTerm() {
        return term;
    }

    /**
     * @param term the term to set
     */
    @Logable(logLevel = LevelEnum.INFO)
    public void setTerm(String term) {
        System.out.println("Term setted: " + term);
        if (term != null) {
            this.setTermExists(true);
        } else {
            this.setTermExists(false);
        }
        this.term = term;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the termExists
     */
    public boolean isTermExists() {
        return termExists;
    }

    /**
     * @param termExists the termExists to set
     */
    public void setTermExists(boolean termExists) {
        this.termExists = termExists;
    }

    /**
     * @return the convertListTerms
     */
    public List<String> getConvertListTerms() {
        return convertListTerms;
    }

    /**
     * @param convertListTerms the convertListTerms to set
     */
    public void setConvertListTerms(List<String> convertListTerms) {
        this.convertListTerms = convertListTerms;
    }

    /**
     * @return the duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }

    /**
     * @return the studentCount
     */
    public int getStudentCount() {
        return studentCount;
    }

    /**
     * @param studentCount the studentCount to set
     */
    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    /**
     * @return the durations
     */
    public Map<String, Integer> getDurations() {
        return durations;
    }

    /**
     * @param durations the durations to set
     */
    public void setDurations(Map<String, Integer> durations) {
        this.durations = durations;
    }

    /**
     * @return the convertListDurations
     */
    public List<String> getConvertListDurations() {
        return convertListDurations;
    }

    /**
     * @param convertListDurations the convertListDurations to set
     */
    public void setConvertListDurations(List<String> convertListDurations) {
        this.convertListDurations = convertListDurations;
    }

    /**
     * @return the studentCounts
     */
    public Map<String, Integer> getStudentCounts() {
        return studentCounts;
    }

    /**
     * @param studentCounts the studentCounts to set
     */
    public void setStudentCounts(Map<String, Integer> studentCounts) {
        this.studentCounts = studentCounts;
    }

    /**
     * @return the convertListStudentCounts
     */
    public List<String> getConvertListStudentCounts() {
        return convertListStudentCounts;
    }

    /**
     * @param convertListStudentCounts the convertListStudentCounts to set
     */
    public void setConvertListStudentCounts(List<String> convertListStudentCounts) {
        this.convertListStudentCounts = convertListStudentCounts;
    }

    /**
     * @return the buttonCheck
     */
    public boolean isButtonCheck() {
        return buttonCheck;
    }

    /**
     * @param buttonCheck the buttonCheck to set
     */
    @Logable(logLevel = LevelEnum.INFO)
    public void setButtonCheck(boolean buttonCheck) {
        System.out.println("CHECK");
        this.buttonCheck = buttonCheck;
    }

    /**
     * @return the modulName
     */
    public String getModulName() {
        return modulName;
    }

    /**
     * @param modulName the modulName to set
     */
    @Logable(logLevel = LevelEnum.INFO)
    public void setModulName(String modulName) {
        System.out.println("Modulname gesetzt: " + modulName);
        this.modulName = modulName;
    }

}
