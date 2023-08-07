import java.util.Scanner;

public class Demo14 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double total = 0;
        double avg = 0;
        String status1 = "";
        String status2 = "";
        String status3 = "";
        String status = "";

        // System.out.print("Please enter your name: ");
        String name = "Tharindu";  //scanner.nextLine();
        // if(name.length() <= 0) {
        //     System.out.println("Invalid Name");      
        // } 

        // System.out.print("Please enter your age: ");
        int age = 12;   //scanner.nextInt();
        // scanner.nextLine();
        // if(age < 10 || age > 18) {
        //     System.out.println("Invalid Age");
        // }  
        
        // System.out.print("Please enter Subject 1: ");
        String sub1 = "ES-1";  //scanner.nextLine();
        // if(!sub1.startsWith("SE-")) {
        //     System.out.println("Invalid Subject");
        // } 

        // System.out.print("Please enter marks for Subject 1: ");
        double marks1 = 67;    //scanner.nextDouble();
        // scanner.nextLine();
        // if(marks1 < 0 || marks1 > 100) {
        //     System.out.println("Invalid Marks");
        // } else{
        //     total += marks1;
        //     if(marks1 >= 75) {
        //         status1 = "Credit Pass";
        //     } else if (75 > marks1 && marks1 >= 55) {
                status1 = "Pass";
        //     } else {
        //         status1 = "Fail";
        //     }                
        // }

        // System.out.print("Please enter Subject 2: ");
        String sub2 = "SE-2";  //scanner.nextLine();
        // if(!sub2.startsWith("SE-")) {
        //     System.out.println("Invalid Subject");
        // } 

        // System.out.print("Please enter marks for Subject 2: ");
        double marks2 = 67;     //scanner.nextDouble();
        // scanner.nextLine();
        // if(marks2 < 0 || marks2 > 100) {
        //     System.out.println("Invalid Marks");
        // } else{
        //     total += marks2;
        //     if(marks2 >= 75) {
        //         status2 = "Credit Pass";
        //     } else if (75 > marks2 && marks2 >= 55) {
                status2 = "Pass";
        //     } else {
        //         status2 = "Fail";
        //     }
        // }

        // System.out.print("Please enter Subject 3: ");
        String sub3 = "SE-3";  //scanner.nextLine();
        // if(!sub3.startsWith("SE-")) {
        //     System.out.println("Invalid Subject");
        // } 

        // System.out.print("Please enter marks for Subject 3: ");
        double marks3 = 89;    //scanner.nextDouble();
        // scanner.nextLine();
        // if(marks3 < 0 || marks3 > 100) {
        //     System.out.println("Invalid Marks");
        // } else{
        //     total += marks3;
        //     if(marks3 >= 75) {
        //         status3 = "Credit Pass";
        //     } else if (75 > marks3 && marks3 >= 55) {
                status3 = "Pass";
        //     } else {
        //         status3 = "Fail";
        //     }

        //     avg = (total / 3);
        //     if(avg >= 75) {
        //         status = "Credit Pass";
        //     } else if (75 > avg && avg >= 55) {
                status = "Pass";
        //     } else {
        //         status = "Fail";
        //     }
        // }

        System.out.printf("+%s+\n", "-".repeat(40));
        System.out.printf("|Name : %-33s|\n", name.toUpperCase());
        System.out.printf("|Age : %s %-31s|\n", age, "years old" );
        System.out.printf("|Status : %-31s|\n", status);
        System.out.printf("|Total : %.2f Average : %-17.2f|\n", total, avg, "%" );
        System.out.printf("+%s+\n", "-".repeat(40));
        
        // System.out.printf("Name : %s \nAge : %d \nSubject : %s, %s, %s\nMarks : %s, %s, %s \nTotal :%s \nAvg :%s", name, age, sub1, sub2, sub3, marks1, marks2, marks3, total, avg, status1, status2, status3 );

        scanner.close();
    }
}