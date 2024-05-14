public class GreatestAmongThreeNums {

public static void main (String [] args){

int num1 = 1000, num2 = 220, num3 = 30, largest = num1;

if ( num2 > largest ){

largest = num2;
}

if ( num3 > largest ){

largest = num3;
}
System.out.println("Largest number is  = " + largest);


}

}