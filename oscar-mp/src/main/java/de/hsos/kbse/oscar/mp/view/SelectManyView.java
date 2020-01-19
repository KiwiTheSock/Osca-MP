/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hsos.kbse.oscar.mp.view;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author wihowert
 */
@Named
@SessionScoped
public class SelectManyView implements Serializable{

    private String selectedOptions;
    private boolean showCalendar = false;

    public String getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(String selectedOptions) {
        this.selectedOptions = selectedOptions;
        if(this.selectedOptions != null){
            this.setShowCalendar(true);
        } else {
            this.setShowCalendar(false);
        }
    }

    /**
     * @return the showCalendar
     */
    public boolean isShowCalendar() {
        return showCalendar;
    }

    /**
     * @param showCalendar the showCalendar to set
     */
    public void setShowCalendar(boolean showCalendar) {
        this.showCalendar = showCalendar;
    }

}
