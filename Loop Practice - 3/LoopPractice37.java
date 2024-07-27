public class LoopPractice37 {

public static void main (String[] args){

int i = 1;
while ( i <= 5){

int j = 1;
while ( j <= 5){

if ( j == 3 || i == 3){

System.out.print("0");

}
else {
 
System.out.print("1");

}
j++;
}
System.out.println();
i++;
}



}
}