

public class LoopPractice29 {


public static void main (String[] args){

int i =  1;
while ( i <= 5){

int j = 1;
while ( j <= i ) {

if ( i == 1 ||  i == 5 || j == 1 ||  i == j ) { 

System.out.print("*");

}

else {
System.out.print(" ");
}

j++;

}

System.out.println();
i++; 
}

}
}