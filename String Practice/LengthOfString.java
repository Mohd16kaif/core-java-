public class LengthOfString {

public static void main (String [] args){

String str = "find the length of string";
String lowerCase;
int len = 0;
lowerCase = str.toLowerCase();

for (int i = 0; i <=str.length(); i++){

len++;

}

System.out.println("length of String is : " + len);

}
}