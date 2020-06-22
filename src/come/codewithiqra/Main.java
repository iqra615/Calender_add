package come.codewithiqra;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
       Calendar c = Calendar.getInstance();
       c.add(Calendar.YEAR,-6);
        System.out.println("After six YEars:" +c.getTime());
        c.add(Calendar.DAY_OF_WEEK,8);
        System.out.println("Beore 8 months: "+ c.getTime());
        c.add(Calendar.ERA,9);
        System.out.println("Era:" +c.getTime());
    }
}
