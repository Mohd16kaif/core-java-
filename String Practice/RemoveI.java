public class RemoveI {

public static void main (String [] args){

String str = "Java is a programming language and it is easy to learn";
String ref = "";

for (int i = 0; i < str.length(); i++)
{

char ch  = str.charAt(i);

if (ch == 'i'){

}
else {

ref = ref + ch;

}
}

System.out.println("String after i removed : "  + ref);

}
}