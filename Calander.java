import java.util.HashMap;
public class Calander {
    public static void main(String[] args) {
        Calander cl = new Calander();
        String day = cl.findDay(07, 03, 2028);
        System.out.println(day);
    }
    public String findDay(int day,int month,int year)
    {
        HashMap<Integer,String> days = new HashMap<>();
        String[] ds = {"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
        for(int i=0;i<ds.length;i++)
        {
            days.put(i, ds[i]);
        }
        System.out.println(days);
        // reference 01-01-2000 is saturday
        int totalDays =0;
        for(int i = 2000;i<year;i++) totalDays += isLeap(i) ? 366 :365;
        int[] daysInMonths = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(isLeap(year)) daysInMonths[1]=29;
        for(int i=0;i<month-1;i++) totalDays+=daysInMonths[i];
        totalDays+=day-1;
        int dayinIndex = totalDays%7;
        return ds[dayinIndex];
    }

    public boolean isLeap(int year)
    {
        return (year%4==0 && (year%100!=00 || year%400==0));
    }
}
