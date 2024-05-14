public class AmstrongNumber {

public static void main (String[] args){

int number = 153, number2, remainder, armstrong = 0;

number2 = number;

while ( number > 0){

remainder = number % 10;
armstrong = (remainder*remainder*remainder) + armstrong;
number = number / 10;
}

if ( number2 == armstrong){

System.out.println("Number is armstrong");


}
else {

System.out.println("Number is not armstrong");

}

}
}