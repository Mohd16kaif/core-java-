public class PracticeString8 {

public static void main (String[] args){

String str = "Heyy,,, this is 8 string question";

int digitCount = 0, letterCount = 0, specialCharacterCount = 0;

for ( int i = 0; i < str.length(); i++){

char ch = str.charAt(i);

if ( Character.isDigit(ch)){

digitCount++;

}
else if ( Character.isLetter(ch)){

letterCount++;

}

else if ( ch != ' ' ) {

specialCharacterCount++;

}


}

System.out.println(" Values using isDigit and isNumber methods" );
System.out.println();
System.out.println("Digits in string : " + digitCount );
System.out.println("Letters in string : " + letterCount );
System.out.println("Special character in string : " + specialCharacterCount);

String str2 = "He!!o, how are y0u";

int letter = 0, digit = 0, specialcharacter = 0;

for ( int i = 0; i < str2.length(); i++){

char ch = str2.charAt(i);

if ( ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ){

letter++;

}

else if ( ch >= '0' && ch <= '9'){

digit++;

}
else if (ch != ' '){

specialcharacter++;

}
}
System.out.println();
System.out.println(" Values without using isDigit and isNumber methods" );

System.out.println();

System.out.println("Letters are : " + letter );
System.out.println("digtis are : " + digit);
System.out.println("special characters are : " + specialcharacter );


}
}