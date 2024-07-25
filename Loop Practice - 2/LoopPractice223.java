public class LoopPractice223  {


public static void main (String[] args){

int i = 1;
while ( i <= 5 ){

int j = 5;
while ( j >= i ){

System.out.print("*");
j--;

}

i++;
System.out.println();

}
int p = 1;
while ( p <= 5){
 
int q = 1;
while  ( q < p){

System.out.print(" ");
q++;
}

int r = 5;
while ( r >= p){

System.out.print("*");
r--;
}
p++;
System.out.println();
}

}
}