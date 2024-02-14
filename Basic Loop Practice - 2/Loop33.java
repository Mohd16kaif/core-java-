public class Loop32 {

public static void main (String[]  args){


int i = 5, fact = 1, number = 5;

while(i >= number){

fact = fact * i;
i--;
}
System.out.println(fact);
}
}