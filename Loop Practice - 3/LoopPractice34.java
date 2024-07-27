public class LoopPractice34 {

public static void main (String[] args){

int i = 1;
while ( i <= 5){

int j = 1;
while ( j <= 5)

{

if ( i == 1 || i == 5 || j == 1 || j == 5 ){

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