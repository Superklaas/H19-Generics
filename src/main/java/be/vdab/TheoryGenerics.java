package be.vdab;

import java.util.ArrayList;
import java.util.Date;

public class TheoryGenerics {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add(String.valueOf(new Integer(1)));

        ArrayList<Date> dates =
                new ArrayList<>();
        dates.add(new Date());
        Date date = dates.get(0);
    }
}
