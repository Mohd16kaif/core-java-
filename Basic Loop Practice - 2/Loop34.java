public class Loop34 {

public static void main (String[] args){

int i = 2, number = 4;

while ( i <= number){

if (number % i == 0){
System.out.println(number + "is not a Prime number");
}

i++;
}
System.out.println(number + " is a Prime number");


}
}