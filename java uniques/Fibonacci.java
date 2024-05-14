public class Fibonacci {

public static void main (String [] args){

int num1 = 0, num2 = 1, sum, count = 10;

int i = 1;


while ( i <= count){
 
System.out.println(num1 + " ");
 
sum = num1 + num2;
num1 = num2;
num2 = sum;


i++;
}


}

}