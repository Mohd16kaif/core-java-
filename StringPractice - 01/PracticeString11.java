public class PracticeString11 {

public static void main (String [] args){

StringBuffer str1 = new StringBuffer("Core Java");
StringBuilder str2 = new StringBuilder("Advance Java");
String str3 = "reversed string";

System.out.println("Using String Buffer's reverse method");
System.out.println(str1.reverse());

System.out.println();

System.out.println("Using String Builder's reverse method");
System.out.println(str2.reverse());
System.out.println();

System.out.println("Using a more logical approach");

String str4 = "";

for ( int i = str3.length() - 1; i >= 0; i--){

 str4 = str4 + str3.charAt(i);

}

System.out.println("reversed string : " + str4);

}
}