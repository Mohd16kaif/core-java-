public class PracticeString17 {

public static void main (String [] args){

String str = "This is Question number seventeen";
boolean found = false;
int countOfE = 0;

for (int i = 0; i < str.length(); i++){

char ch = str.charAt(i);

if (ch == 'e'){

countOfE++;
found = true;

}
}

if (!found){

System.out.println("Character 'e' not found in the string");

}

System.out.println("The total number of occurances of character 'e' is : " + countOfE);


}
}