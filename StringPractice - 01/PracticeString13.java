public class PracticeString13 {

public static void main (String [] args){

String str = "Question number 13";
String revString = "";

for ( int i = str.length() - 1; i >= 0; i--){

char ch = str.charAt(i);

if (ch ==  ' ' ){

revString = revString + str;

}

}

System.out.println(revString);


}
}