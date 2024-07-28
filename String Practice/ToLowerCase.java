public class ToLowerCase {

public static void main (String [] args) {

String str = "Java is a Programming Language and it is Easy to Learn";
String ref = "";

for (int i = 0; i < str.length() ; i++){

char ch = str.charAt(i);

if ( ch >= 97 && ch <= 122){

ref = ref + (char) (ch - 32);

}

else {

ref += ch;

}
}


System.out.println();
System.out.println("Original string  : " + str);
System.out.println();
System.out.println("Replaced string : " + ref);

}
}
