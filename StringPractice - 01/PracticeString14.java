public class PracticeString14 {

public static void main (String [] args){

String str = "hello";
boolean found = false;

for ( int i = 0; i <str.length(); i++){

char ch = str.charAt(i);

if ( ch == 'o'){

System.out.println("The first occurance of \"o\" is at index : " + i );
found = true;
break;

}
}

if (!found){

System.out.println("Character \"o\" not found in the String " );


}

}
}