public class LoopPractice24 {

public static void main (String[] args){

int i = 1;
while( i <= 5){

int k = 5;
while ( k > i ){

System.out.print(" ");

k--;
}

int j = 1;
while ( j <= 5) {

System.out.print("*");

j++;
}
System.out.println();
i++;
}


}

}