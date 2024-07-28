public class LastIndexOfY {

public static void main (String [] args){

String str = "Java is a programming language and it is easy to learn";

for (int i = str.length() - 1; i >= 0; i--){

char ch = str.charAt(i);

if (ch == 'y'){

System.out.println("Last index of y is : " + i);
break;

}

}

}
}