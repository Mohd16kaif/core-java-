public class Loop32 {

public static void main (String[]  args){


int  number = 10, i = number, fact = 1;

while(i >= 1){

fact = fact * i;
i--;
}
System.out.println(fact);
}
}