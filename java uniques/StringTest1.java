public class StringTest1 {

public static void main (String[] args){

String s = new String("Java");
s.concat("String");
System.out.println(s);   // Output : Java

StringBuffer b = new StringBuffer("Core");
b.append("java");
System.out.println(b);   //Output : Core java

System.out.println(Math.abs(3.000000008));
System.out.println(Math.log(10)); // 2.302585092994046

System.out.println(Math.PI); //3.141592653589793

}
}