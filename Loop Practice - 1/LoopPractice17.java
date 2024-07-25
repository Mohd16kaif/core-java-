public class LoopPractice17 {

public static void main (String[] args){

char i = 'A';

while ( i <= 'E'){

char j = 'A';

while (j <= i){

System.out.print(j);

j++;
}
System.out.println();
i++;
}


}
}