public class LoopPractice213 {

public static void main (String[] args){


int i = 1;
while ( i <= 5 ){

int k = 5;
while ( k > i){

System.out.print(" ");

k--;
}
int j = 1;
while ( j <= i*2 - 1){

System.out.print("A");

}
} 

System.out.println();
i++;

}
}