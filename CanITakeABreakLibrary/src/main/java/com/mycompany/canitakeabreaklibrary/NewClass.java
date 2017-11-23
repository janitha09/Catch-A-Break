/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.canitakeabreaklibrary;

/**
 *
 * @author janitha
 */
public class NewClass {

    public boolean canITakeABreak() {
        return false;
    }

    boolean ShouldIBeAtWorkNow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param i day of the week starting sunday;
     * @return true or false
     */
    boolean ShouldIGotoWorkToday(int day, int weekStart, int weekEnd) {
        return (day > weekStart) || (day < weekEnd);
    }
}
