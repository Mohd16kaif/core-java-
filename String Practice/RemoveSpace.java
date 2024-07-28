public class RemoveSpace {

public static void main (String [] args){

String str = "Java is a programming language and it is easy to learn";
String ref = "";

for (int i = 0; i < str.length(); i++){

char ch = str.charAt(i);

if ( ch == ' '){



}

else {

ref = ref + ch;

}


}
System.out.println();
System.out.println("Original String is : " + str);
System.out.println();
System.out.println("Space String is : " + ref);



}
}