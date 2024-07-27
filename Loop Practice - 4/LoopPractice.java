public class LoopPractice {

public static void main (String[] args){

int n = 123, count = 0;
int i = 1;
while(i <= 123){
if ( n % i == 0){
count++;
}
if (count == 2){
System.out.println("prime");
}
else {
System.out.println("non prime");
}
i++;

}


}
}