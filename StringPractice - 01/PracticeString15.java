public class PracticeString15 {

public static void main (String [] args){

String str = "This is Question number fifteen";
boolean found = false;

for ( int i = str.length() - 1;  i >= 0; i--){

char ch = str.charAt(i);

if ( ch == 'i'){

System.out.println("Last occurance of \"i\" is " + i );
found = true;
break;

}
}

if (!found){

System.out.println("Character \"i\" not found in the String ");

}

}
}