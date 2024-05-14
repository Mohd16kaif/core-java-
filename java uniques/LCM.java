public class LCM {

public static void main (String[] args){

int num1 = 10, num2 = 20;

for ( int i = num1; i <= num1 * num2; i++){

if ( i % num1 == 0 && i % num2 == 0){

System.out.println(i + " is LCM");
break;

}

}


}
}