public class Grade {

public static void main(String[] args){

int marks = 85;

if (marks > 95 && marks <= 100){

System.out.println("Your Grade is A+");

}

else if (marks > 90 && marks < 95){

System.out.println("Your Grade is A");

}

else if (marks > 80 && marks < 90){

System.out.println("Your Grade is B+");

}

else if (marks < 70 && marks < 80){

System.out.println("Your Grade is B");

}

else if (marks < 33 ){

System.out.println("Failed");

}
else {

System.out.println("You passed ");

}


}

}