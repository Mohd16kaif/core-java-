
public class LoopPractice36 {

public static void main (String[] args){

int i = 1;
while ( i <= 5){

int j = 1;
while ( j <= 5){

if ( i == 1 || i == 3 || i == 5 || j == 2 || j == 3 )
{

System.out.print("0");

}

else if  ( i == 1 || i == 3 || i == 5 || j == 1 || j == 3 || j == 5){

System.out.print("1");

}

else if ( i == 2 || i == 4 || j == 1 || j == 3 || j == 5){

System.out.print("0");

}

else {

System.out.print("1");

}

j++;

}
System.out.println();
i++;

}


}
}