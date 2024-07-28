public class ReplaceAllLowerCase {

public static void main (String [] args){

String str = "Java is a Programming Language and it is Easy to Learn";
String ref = "";

for (int i = 0; i < str.length(); i++){

char ch = str.charAt(i);

if (ch >= 97 && ch <= 122){

ref += '*';

}

else {

ref += ch;

}

}
System.out.println(ref);

}
}