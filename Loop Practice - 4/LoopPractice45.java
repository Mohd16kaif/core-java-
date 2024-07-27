public class LoopPractice45 {

public static void main (String[] args){


int i = 2, even = 0;

while (i < 100){

if(i % 2 == 0){

even = even + i;

}
i++;
}
System.out.println(even);


}
}