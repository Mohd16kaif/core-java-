public class LoopPractice220 {

public static void main (String[] args ){

int i = 1;
while ( i <= 5){

int j = 1;
while ( j <= i){


System.out.print("*");
j++;

}
i++;
System.out.println();
}

int p = 1;
while ( p <= 4 ){

int q = 4;
while ( q >= p){


System.out.print("*");
q--;
}

p++;
System.out.println();
}


}
}