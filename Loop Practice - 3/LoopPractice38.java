public class LoopPractice38 {

public static void main (String[] args){

int i = 1;

while ( i <= 5){

int j = 1;
while ( j <= 5 ){

if ( i == 1 || i == 5 && (j == 2 || j == 3 || j == 4) ){

System.out.print("0");

}

else if  ( i == 2 || i == 4 && ( j == 1 || j == 3 || j == 5 ) ){

System.out.print("0");

}

else if ( i == 3 && (j == 1 || j == 2 || j == 4 || j == 5) ) {

System.out.print("0");

}

else {

System.out.print("1");


}
System.out.println();
j++;
}

i++;
}


}
}