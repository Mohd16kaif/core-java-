public class ReverseString {

public static void main (String [] args){

String str = "Java is a programming language and it is easy to learn";
String ref = "";

for (int i = str.length() - 1; i >= 0; i-- ){

char ch = str.charAt(i);
ref += ch;

}
System.out.println();
System.out.println("Original String is : " + str);
System.out.println();
System.out.println("Reversed String is : " + ref);

}
}