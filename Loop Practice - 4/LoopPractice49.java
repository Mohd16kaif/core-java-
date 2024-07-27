public class LoopPractice49 {

public static void main (String[] args){

int num = 3445507, LastDigit, FirstDigit = 0, sum;

LastDigit = num % 10;

while ( num != 0){

FirstDigit = num;

num = num / 10;

}

sum = LastDigit + FirstDigit;

System.out.println("Sum of First & Last digit is " + sum);

}
}