public class LoopPractice213 {

public static void main (String[] args){

int i = 1;
while ( i <= 5){

int j = 5;
while ( j >= i){

if ( i == 1 || i == 5 || j == 5 || j == i){

System.out.print("*");

}
else {

System.out.print(" ");

}

j--;

}
i++;
System.out.println();
}

}
}