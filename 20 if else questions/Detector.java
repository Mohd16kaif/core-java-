public class Detector {

public static void main(String[] args){

char chr1 = 'A', chr2 = 'B', chr3 = 'C';
char chr4 = '/', chr5 = '@', chr6 = '%';

if (chr1 == 'A' && chr2 == 'B' || chr3 == 'Z'){

System.out.println("Character found ");

}

else if (chr4 == '/' || chr5 == '@' || chr6 == '#') {

System.out.println("Special Character found ");

}

}


}