public class LoopPractice211  {

public static void main (String[] args){

int i = 1;
while ( i <= 5){

int k = 5;
while ( k > i ){

System.out.print(" ");

k--;
}

int j = 1;
while ( j <= i){

if ( i == 1 || i == 5 || j == 1 || j == i){

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