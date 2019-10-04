package com.example.balancedfitness;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayAndSport {
    private String name;
    private String activity;
    private Day day;
    private int number = 0;

    public DayAndSport() {
        day = new Day(name, activity);
    }
    public String getDayTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE");
        String currentDate = sdf.format(new Date());
        return currentDate;
    }

    public String daysSport() {
        while (number <= GlobalModelOfDays.getInstance().getDays().size()) {
            if (getDayTime().equals(GlobalModelOfDays.getInstance().getDay(number).getName())){
                Log.d("BreakCheck", "fds");
                break;
            }
            number++;
        }
        return GlobalModelOfDays.getInstance().getDay(number).getActivity();
    }
}
