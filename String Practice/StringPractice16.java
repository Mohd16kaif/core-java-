public class StringPractice16 {

public static void main (String [] args ){

String str = "bob";
String ref = "";

for ( int i = str.length() - 1; i >= 0; i--){

char ch = str.charAt(i);

ref = ref + i;

}
if (ref.equalsTo(str) ){

System.out.println("Palinfrome");


}
else {

System.out.println("not a palindrome");

}
}
}


