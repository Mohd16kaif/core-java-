public class PracticeString10 {

public static void main (String[] args){

String str = "one two three four five";
int words = 0, spaces = 0;

for ( int i = 0; i  < str.length(); i++){

char ch = str.charAt(i);

if ( ch == ' ' ){

spaces++;

}
}

words = spaces + 1;

System.out.println("Words are = " + words);

}
}