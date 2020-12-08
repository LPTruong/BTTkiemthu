import java.util.Scanner;

public class Date {
    private  int day, month, year;

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public Date() {

    }
    public String getDate(){
        String date = Integer.toString(day)+'/' + Integer.toString(month) + '/' + Integer.toString(year);
        return date;
    }
    public String checkDate(int day, int month, int year){

        boolean check = true;
        int MAX_VALID_YR = 2100;
        int MIN_VALID_YR = 1900;
        if (year > MAX_VALID_YR ||
                year < MIN_VALID_YR)
            check =false;
        if(month < 1 || month > 13|| day <1 || day>31 || year < 1|| year > 2100)  check = false;

        if ( month == 2)
            if ((year % 4 ==0) && ((year % 100 != 0)||(year % 400 == 0) ))
            {
                if(day > 29 ) check = false;
            }
            else if(day >28) check =false;

        int[] m = {4,6,9,11};
        for (int i =0; i <m.length;i++){
            if (month== m[i] &&  day > 30) check = false;
        }
        if(check== false) {
            return "Error";
        } else {
            setDate(day, month,year);
            return getDate();
        }

    }
    public static  void  main(String[] args ){
        Scanner sc = new Scanner(System.in);
        Date a = new Date();

        System.out.println(a.checkDate(0,12,2021));
    }
}
