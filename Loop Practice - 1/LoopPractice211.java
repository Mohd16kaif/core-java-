public class LoopPractice211 {

public static void main (String[] args){

int i = 1;
while ( i <= 5){

int j = 1;
while ( j <= 5){


if ( i == 1 || i == 5 || j == 3){

System.out.print("A");

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