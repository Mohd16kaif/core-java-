public class PracticeString9 {

public static void main (String[] args){

String str1 = "Count Vowel and Consonant";
String str2 = str1.toLowerCase();
int vowel = 0, consonant = 0;

for ( int i = 0; i < str1.length(); i++){

char ch = str2.charAt(i);

if ( ch != ' '){

if ( ch == 'a' || ch == 'i' || ch == 'e' || ch == 'o' || ch == 'u' ){

vowel++;

}
else (ch != ' ' ) {

consonant++;

}

}
}

System.out.println("Vowels = " + vowel);
System.out.println("Consonant = " + consonant);




}
}