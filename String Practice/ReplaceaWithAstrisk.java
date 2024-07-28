public class ReplaceaWithAstrisk {

public static void main (String [] args){

String str = "Java is a programming languag and it is easy to learn";
String ref = "";

for (int i = 0; i < str.length(); i++){

char ch = str.charAt(i);

if (ch == 'a'){

ref = ref + '*';

}
else {

ref = ref + ch;

}

}
System.out.println();
System.out.println("Original String is : " + str);
System.out.println();
System.out.println("Replaced String is : " + ref);

}
}