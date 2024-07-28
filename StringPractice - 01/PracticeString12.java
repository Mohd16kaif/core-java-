public class PracticeString12 {

public static void main (String [] args){

String originalString = "Bob", referenceString = "";

originalString = originalString.toLowerCase();

for ( int i = originalString.length() - 1; i >= 0; i--){

referenceString = referenceString + originalString.charAt(i);

}

if ( originalString.equals(referenceString)){

System.out.println( "\" + originalString + "\" + " is a Palindrome ");

}
else {

System.out.println( "\" + originalString + "\" + " is not a Palindrome ");

}

}
}