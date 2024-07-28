public class PracticeString16 {

public static void main (String [] args){

String str = "This is sixteenth question";
boolean found = false;

for (int k = 0; k < str.length(); k++){

char ch = str.charAt(k);

if (ch == 'i'){

System.out.println(k);
found = true;

}

}

if (!found){

System.out.println("Character 'i' not found in the string");

}


}
}