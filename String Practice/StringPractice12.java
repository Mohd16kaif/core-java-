public class StringPractice12 {

public static void main (String [] args){

String str = "Java is a Programming Language and it is Easy to Learn";
String ref = "";

for ( int i = 0; i < str.length(); i++){

char ch = str.charAt(i);

if (ch >= 97 && ch <= 122){

ref = ref + (char) (ch - 32);
}

else {

ref += ch;

}

}

System.out.println("Original String : " + str);
System.out.println();
System.out.println("Changed String : " + ref);
System.out.println();

}
}