public class LoopPractice33 {

public static void main (String [] args){

int i = 1;
while ( i <= 5){

int j = 1;
while ( j <= 5){

if ( j == 2 || j == 4){

System.out.print("1");

}

else {

System.out.print("0");

}

j++;

}

System.out.println();
i++;

}


}
}