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

    boolean shouldIBeAtWorkAtThisTime(int hour, int peakStart, int peakEnd) {
        return (hour > peakStart) && (hour < peakEnd);
    }

    /**
     *
     * @param i day of the week starting sunday;
     * @return true or false
     */
    boolean ShouldIGotoWorkToday(int day, int weekStart, int weekEnd) {
        return (day > weekStart) && (day < weekEnd);
    }

    int bestLocationForPopup(int[] in) {
        int a = 0;
        for (int i = 0; i<in.length;++i){
            a = in[i]>a?a=in[i]:a;
        }
        return a;
    }
}
