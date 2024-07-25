public class LoopPractice212 {

public static void main (String[] args){


char i = 'A',count = 'A';
while ( i <= 'E'){

char j = 'A';
while ( j <= i){

System.out.print(count);
count++;

j++;
}

System.out.println();
i++;
}

}
}