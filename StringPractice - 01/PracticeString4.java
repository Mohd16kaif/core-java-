public class PracticeString4 {

public static void main (String[] args){

String str1 = "Apple";
String str2 = "Banana";

System.out.println("Solved using equals() and compareTo() methods ");

if (str1.equals(str2)){ 

System.out.println("Strings are equal ");

}
else {

System.out.println("Strings are not equal ");

}


String str3 = "Hello";
String str4 = "Bye";

int result = str3.compareTo(str4);

if (result == 0){

System.out.println("Strings are equal ");

}

else if (result < 0){

System.out.println("String 1 is lexicographically less than String 2 ");

}

else {

System.out.println("String 1 is lexicographically greater than String 2 ");

}

}
}