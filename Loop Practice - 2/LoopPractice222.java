public class LoopPractice222 {

public static void main (String[] args){


int i = 1;
while ( i <= 5){

int k = 5;
while ( k > i){

System.out.print(" ");
k--;

}

int j = 1;
while ( j <= i){

System.out.print("*");
j++;

}

int l = 1;
while ( l < i ){

System.out.print("*");

l++;
}


i++;
System.out.println();

}

int p = 1;
while ( p <= 4 ) {

int q = 1;
while ( q <= p) {

System.out.print(" ");
q++;

}
int r = 5;
while ( r > p){

System.out.print("*");
r--;
}

int s = 4;
while ( s > p){

System.out.print("*");

s--;
}

p++;
System.out.println();

}


}
}