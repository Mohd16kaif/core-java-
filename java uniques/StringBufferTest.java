public class StringBufferTest {

public static void main (String [] args){

StringBuffer sb = new StringBuffer("This is a Stringbuffer class ");

System.out.println(sb.length()); //29

System.out.println(sb.insert(0, "That"));

System.out.println(sb.append("String Appended")); 

System.out.println(sb.length()); //44

System.out.println(sb.replace(6,7, "!S");

//System.out.println(sb.delete(1,2,3,4,5,6,7,8)); //illegal start of expresision

//System.out.println(sb.capacity(“”)); //error

System.out.println(sb.reverse());




}
}