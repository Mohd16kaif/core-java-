public class LoopPractice48 {

public static void main (String[] args){


int num = 35600789,  LastDigit, FirstDigit = 0;

LastDigit = num % 10;

System.out.println("Last digit is " + LastDigit);

while (num != 0){

FirstDigit =  num;

num = num / 10;

}

System.out.println("First digit is " + FirstDigit);


}
}