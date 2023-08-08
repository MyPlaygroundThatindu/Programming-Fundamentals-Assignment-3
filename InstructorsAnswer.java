import java.util.Scanner;

public class InstructorsAnswer {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String DISTINGUISHED_PASS = "\033[35;1m" + "Distinguished Pass" + "\033[0m";
        final String CREDIT_PASS = "\033[34;1m" + "Credit Pass" + "\033[0m";
        final String PASS = "\033[34;1m" + "Pass" + "\033[0m";
        final String FAIL = "\033[31;1m" + "Fail" + "\033[0m";
        final String RESET = "\033[0m";

        String name;
        int age;
        String subject1;
        String subject2;
        String subject3;
        double marks1;
        double marks2;
        double marks3;

        final String ERROR_MSG = String.format("%s%s%s", COLOR_RED_BOLD, "%s", RESET);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        app : {    
            if(name.length() == 0) {
                System.out.printf(ERROR_MSG, "Name can't be empty\n");
                break app;
            }

            System.out.print("Enter your age : ");
            age = scanner.nextInt();
            scanner.nextLine();
            // scanner.skip(System.lineSeparator()); // \n

            if(age < 10 || age > 18) {
                System.out.printf(ERROR_MSG, "Invalid age\n");
                break app;
            }

            System.out.print("Enter Subject 1 : ");
            subject1 = scanner.nextLine();

            if(subject1.isBlank()) {
                System.out.printf(ERROR_MSG, "Subject 1 can not be empty \n");
                break app;
            } else if(!subject1.startsWith("SE-")) {
                System.out.printf(ERROR_MSG, "Invalid Subject 1 \n");
                break app;
            } 

            System.out.printf("Enter marks for %s : ", subject1);
            marks1 = scanner.nextDouble();
            scanner.nextLine();

            if(marks1 < 0 || marks1 > 100) {
                System.out.printf(ERROR_MSG, "Invalid Marks \n");
                break app;
            }

            System.out.print("Enter Subject 2 : ");
            subject2 = scanner.nextLine();

            if(subject2.isBlank()) {
                System.out.printf(ERROR_MSG, "Subject 2 can not be empty \n");
                break app;
            } else if(!subject2.startsWith("SE-")) {
                System.out.printf(ERROR_MSG, "Invalid Subject 2 \n");
                break app;
            } else if(subject1.equals(subject2)){
                System.out.printf(ERROR_MSG, "Subject already exist \n");
                break app;
            }

            System.out.printf("Enter marks for %s : ", subject2);
            marks2 = scanner.nextDouble();
            scanner.nextLine();

            if(marks2 < 0 || marks2 > 100) {
                System.out.printf(ERROR_MSG, "Invalid Marks \n");
                break app;
            }

            System.out.print("Enter Subject 3 : ");
            subject3 = scanner.nextLine();

            if(subject3.isBlank()) {
                System.out.printf(ERROR_MSG, "Subject 3 can not be empty \n");
                break app;
            } else if(!subject3.startsWith("SE-")) {
                System.out.printf(ERROR_MSG, "Invalid Subject 3 \n");
                break app;
            } else if(subject1.equals(subject2) || subject2.equals(subject3)){
                System.out.printf(ERROR_MSG, "Subject already exist \n");
                break app;
            }

            System.out.printf("Enter marks for %s : ", subject3);
            marks3 = scanner.nextDouble();
            scanner.nextLine();

            if(marks3 < 0 || marks3 > 100) {
                System.out.printf(ERROR_MSG, "Invalid Marks \n");
                break app;
            }

        double total = marks1 + marks2 + marks3;
        double avg = total / 3;

        String status;
        String subject1Status;
        String subject2Status;
        String subject3Status;

        if(avg > 75) status = DISTINGUISHED_PASS;
        else if (avg >= 65) status = CREDIT_PASS;
        else if (avg >= 55) status = PASS;
        else status = FAIL;

        if(marks1 > 75) subject1Status = DISTINGUISHED_PASS;
        else if (marks1 >= 65) subject1Status = CREDIT_PASS;
        else if (marks1 >= 55) subject1Status = PASS;
        else subject1Status = FAIL;

        if(marks2 > 75) subject2Status = DISTINGUISHED_PASS;
        else if (marks2 >= 65) subject2Status = CREDIT_PASS;
        else if (marks2 >= 55) subject2Status = PASS;
        else subject2Status = FAIL;

        if(marks3 > 75) subject3Status = DISTINGUISHED_PASS;
        else if (marks3 >= 65) subject3Status = CREDIT_PASS;
        else if (marks3 >= 55) subject3Status = PASS;
        else subject3Status = FAIL;

        final String LINE = "+".concat(("-").repeat(7)).concat("+").concat(("-").repeat(12)).concat("+").concat(("-").repeat(19)).concat("+");

        subject1 = String.format("SE-%03d", Integer.valueOf(subject1.substring(3)));
        subject2 = String.format("SE-%03d", Integer.valueOf(subject2.substring(3)));
        subject3 = String.format("SE-%03d", Integer.valueOf(subject3.substring(3)));

        name = String.format("%s%s%s", COLOR_BLUE_BOLD, name.toUpperCase(), RESET);

        //Generate table
        System.out.println("+".concat(("-").repeat(40)).concat("+"));
        System.out.printf("|%10s: %-39s|\n", "Name", name);
        System.out.printf("|%10s: %-28s|\n", "Age", age + " years old");
        System.out.printf("|%10s: %-39s|\n", "Staus", status);
        System.out.printf("|%10s: %-28s|\n", "Total", String.format("%.2f", total));
        System.out.printf("|%10s: %-28s|\n", "Average", String.format("%.2f", avg).concat("%"));
        System.out.println(LINE);
        System.out.printf("|%-7s|%-12s|%-19s|\n", "SUBJECT", "MARKS", "GRADE");
        System.out.println(LINE);
        System.out.printf("|%-7s|%-12.2f|%-30s|\n", subject1, marks1, subject1Status);
        System.out.printf("|%-7s|%-12.2f|%-30s|\n", subject2, marks2, subject2Status);
        System.out.printf("|%-7s|%-12.2f|%-30s|\n", subject3, marks3, subject3Status);
        System.out.println(LINE);

        }
        
    }
}