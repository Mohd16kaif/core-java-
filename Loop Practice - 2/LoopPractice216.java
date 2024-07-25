public class LoopPractice216 {

public static void main (String [] args){

int i = 1;
while ( i <= 5){

int k = 5;
while ( k >= i ){

System.out.print(" ");
k--;
}

int j = 1;
while ( j <= i ){

System.out.print("*");
j++;
}

int l = 1;
while ( l < i){

System.out.print("*");
l++;

}

i++;
System.out.println();

}



}
}	