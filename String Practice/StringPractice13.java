public class StringPractice13 {

public static void main (String [] args){

String str = "           Java is a Programming Language and it is Easy to Learn";
String ref = str.trim();

System.out.println("Program using trim(); ");
System.out.println();
System.out.println("Original String : " + str);
System.out.println();
System.out.println("Removed space String : " + ref);

System.out.println();
System.out.println("Program without using trim(); ");
System.out.println();

int count = 0;
String ref2 = "";
for ( int i = 0; i <str.length(); i++){

char ch = str.charAt(i);

if (ch == ' ' ){

count++;

if (count == 1){

ref2 = ref + ch;

}

}


}
System.out.println();
System.out.println(ref2);



}
}