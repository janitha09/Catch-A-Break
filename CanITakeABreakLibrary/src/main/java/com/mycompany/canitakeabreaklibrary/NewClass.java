/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.canitakeabreaklibrary;

import java.util.ArrayList;
import java.util.stream.IntStream;

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

    int [] getPeakIndices(int[] ts, int threshold) {
        int [] ret;
        ret = IntStream.range(0, ts.length).filter(i -> ts[i] >= threshold).toArray();
//        IntStream
//        for (int i = 0; i< ts.length; ++i){
//            if (ts[i] > threshold){//how do you get to the last value otherwise
//                ret.add(i);
//            }
//        }
        return ret;
    }
}
