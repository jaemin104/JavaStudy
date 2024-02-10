package jam.study.day19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class WeekDayList {
    public static void main(String[] args) {
        ArrayList<String> weekdays = new ArrayList<>();
        weekdays.add("월");
        weekdays.add("금");
        weekdays.add("일");

        weekdays.add(1, "수");
        weekdays.remove("수");

        for (String day : weekdays) {
            System.out.println(day);
        }

        Collections.reverse(weekdays);

        for (String day : weekdays) {
            System.out.println(day);
        }

        System.out.println("---------------------------");


        Vector<String> veclist = new Vector<>();
        veclist.add("월");
        veclist.add("금");
        veclist.add("일");

        veclist.add(1, "화");
        veclist.remove("금");

        for (String s : veclist) {
            System.out.println(s);
        }

        Collections.reverse(veclist);

        for (String day : veclist) {
            System.out.println(day);
        }


    }
}
