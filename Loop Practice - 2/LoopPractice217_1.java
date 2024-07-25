public class LoopPractice217_1 {

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

if ( j == 2 || j == 3  ){

System.out.print(" ");

}
else {

System.out.print("*");

}

j++;
}

int l = 1;
while ( l < i){
 if ( l == 2 || l == 3){

System.out.print(" ");
}
else {

System.out.print("*");

}
l++;

}

i++;
System.out.println();

}



}
}	