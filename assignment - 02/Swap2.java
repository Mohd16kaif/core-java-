public class Swap2 {

public static void main (String[] args)
{

int var1 = 10, var2 = 20, temp;

System.out.println("Before swapping : " );
System.out.println(var1);
System.out.println(var2);

var1 = var1 + var2;
var2 = var1 - var2;
var1 = var1 - var2;

System.out.println("After swapping : " );
System.out.println(var1);
System.out.println(var2);


}

}