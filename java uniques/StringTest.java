public class StringTest {

public static void main (String[] args){

String str = "This is a String ";


//length
System.out.println(str.length());


//Character At 
System.out.println(str.charAt(3)); //s
System.out.println(str.charAt(4)); //empty space


//Index types
System.out.println(str.indexOf('S'));
System.out.println(str.indexOf('s')); //will show the first i in the string
System.out.println(str.lastIndexOf('i'));

//Lower and Upper case
System.out.println(str.toUpperCase());
System.out.println(str.toLowerCase());


//concat
System.out.println(str.concat(" and it concates the the string using concat method"));


//System.out.println(str.concat(10)); //int cannot be converted into string
System.out.println(str.concat("10")); //This is a Stirng 10


//Starts with
System.out.println(str.startsWith("This")); //true
System.out.println(str.startsWith("is")); //false


//Ends with
System.out.println(str.endsWith("ing")); //false
System.out.println(str.endsWith("ing ")); //true


//Repalce and Replace all
System.out.println(str.replace('a' , '@'));
System.out.println(str.replaceAll("his" , "her"));
System.out.println(str.replaceAll("is" , "!s"));
System.out.println(str.replaceAll("[a-z]" , "!"));


System.out.println(.trim());




}
}