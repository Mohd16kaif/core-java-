public class LoopPractice217 {

public static void main (String [] args){

int i = 1;
while ( i <= 5){

int k = 5;
while ( k >= i ){

System.out.print(" ");
k--;
}

int j = 1;
while ( j < i ){

if ( i == 5 || j == 1) {
System.out.print("*");
}
else {

System.out.print(" ");

}
j++;
}

int l = 1;
while ( l <= i){

if (  l == i || i == 5 ){
System.out.print("*");
}
else {

System.out.print(" ");

}
l++;

}

i++;
System.out.println();

}



}
}	