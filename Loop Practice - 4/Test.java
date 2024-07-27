public class Test {

public static void main (String[] args){


int num = 98765432, FirstDigit = 0;

while (num != 0){

FirstDigit =  num;

num = num / 10;

}

System.out.println("First digit is " + FirstDigit);




}
}