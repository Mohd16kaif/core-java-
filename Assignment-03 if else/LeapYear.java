public class LeapYear {

public static void main (String[] args){


int year2 = 2000;

if(year2%400==0 && year2%100==0 || year2%4==0 && year2%100!=0)
{

System.out.println("Leap year ");

}

}

}