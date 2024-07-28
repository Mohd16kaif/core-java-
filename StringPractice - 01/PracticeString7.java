public class PracticeString7 {

public static void main (String [] args){
String str = "Hello World!!";
String resultString = "";

for ( int i = 0; i < str.length(); i++){

char ch = str.charAt(i);

if ( ch >= 'A' && ch <= 'Z'){ // A to Z is 65 to 90

resultString += (char)(ch + 32);

}

else if ( ch >= 'a' && ch <= 'z'){

resultString += (char)(ch - 32);

}

else {

resultString += ch;

}
}

System.out.println("Original string : " + str);
System.out.println("Toggled string : " + resultString);

}
}