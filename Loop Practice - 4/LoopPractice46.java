public class LoopPractice46 {

public static void main (String[] args){


int i = 1, odd = 0;

while (i < 100){

if(i % 2 != 0){

odd = odd + i;

}
i++;
}
System.out.println(odd);


}
}