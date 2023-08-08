import java.util.Scanner;

public class StudentReport {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int age = 0;
        String sub1 = "";
        String sub2 = "";
        String sub3 = "";
        double marks1 = 0;
        double marks2 = 0;
        double marks3 = 0;
        double total = 0;
        double avg = 0;
        String status1 = "";
        String status2 = "";
        String status3 = "";
        String status = "";

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        
        /*Input name*/
        if(name.length() <= 0) {
            System.out.println("Invalid Name");      
        } else {
            /*Input Age*/
            System.out.print("Please enter your age: ");
            age = scanner.nextInt();
            scanner.nextLine();
            if(age < 10 || age > 18) {
                System.out.println("Invalid Age");
            } else {
                /*Input Subject 1 name */
                System.out.print("Please enter Subject 1: ");
                sub1 = scanner.nextLine();
                if(!sub1.startsWith("SE-")) {
                    System.out.println("Invalid Subject");
                } else {
                    /*Input Subject 1 marks */
                    System.out.print("Please enter marks for Subject 1: ");
                    marks1 = scanner.nextDouble();
                    scanner.nextLine();
                    if(marks1 < 0 || marks1 > 100) {
                        System.out.println("Invalid Marks");
                    } else{
                        total += marks1;
                        if(marks1 >= 75) {
                            status1 = "\033[32mCredit Pass\033[0m";
                        } else if (75 > marks1 && marks1 >= 55) {
                            status1 = "\033[34mPass\033[0m";
                        } else {
                            status1 = "\033[31mFail\033[0m";
                        }   
                        /*Input Subject 2 name */
                        System.out.print("Please enter Subject 2: ");
                        sub2 = scanner.nextLine();
                        if(!sub2.startsWith("SE-") || sub2.equals(sub1)) {
                            System.out.println("Invalid Subject");
                        } else {
                            /*Input Subject 2 marks */
                            System.out.print("Please enter marks for Subject 2: ");
                            marks2 = scanner.nextDouble();
                            scanner.nextLine();
                            if(marks2 < 0 || marks2 > 100) {
                                System.out.println("Invalid Marks");
                            } else{
                                total += marks2;
                                if(marks2 >= 75) {
                                    status2 = "\033[32mCredit Pass\033[0m";
                                } else if (75 > marks2 && marks2 >= 55) {
                                    status2 = "\033[34mPass\033[0m";
                                } else {
                                    status2 = "\033[31mFail\033[0m";
                                }
                                /*Input Subject 3 name */
                                System.out.print("Please enter Subject 3: ");
                                sub3 = scanner.nextLine();
                                if(!sub3.startsWith("SE-") || sub3.equals(sub1) || sub3.equals(sub2)) {
                                    System.out.println("Invalid Subject");
                                } else {
                                    /*Input Subject 3 marks */
                                    System.out.print("Please enter marks for Subject 3: ");
                                    marks3 = scanner.nextDouble();
                                    scanner.nextLine();
                                    if(marks3 < 0 || marks3 > 100) {
                                        System.out.println("Invalid Marks");
                                    } else{
                                        total += marks3;
                                        if(marks3 >= 75) {
                                            status3 = "\033[32mCredit Pass\033[0m";
                                        } else if (75 > marks3 && marks3 >= 55) {
                                            status3 = "\033[34mPass\033[0m";
                                        } else {
                                            status3 = "\033[31mFail\033[0m";
                                        }

                                        avg = (total / 3);
                                        if(avg >= 75) {
                                            status = "\033[32mCredit Pass\033[0m";
                                        } else if (75 > avg && avg >= 55) {
                                            status = "\033[34mPass\033[0m";
                                        } else {
                                            status = "\033[31mFail\033[0m";
                                        }

                                        /*Out put */
                                        System.out.printf("+%s+\n", "-".repeat(47));
                                        System.out.printf("|Name\t: %-49s|\n", "\033[34;1m" + name.toUpperCase() + "\033[0m");
                                        System.out.printf("|Age\t: %s %-35s|\n", age, "years old" );
                                        System.out.printf("|Status\t: %-47s|\n", status);
                                        System.out.printf("|Total\t: %.2f\tAverage : %-14.2f|\n", total, avg, "%" );
                                        System.out.printf("+%s+\n", "-".repeat(47));
                                        System.out.printf("|%-15s|%-12s|%-18s|\n", "Subject", "Marks", "Status" );
                                        System.out.printf("+%s+\n", "-".repeat(47));
                                        System.out.printf("|%-15s|%-12s|%-20s\t|\n", sub1, marks1, status1);
                                        System.out.printf("|%-15s|%-12s|%-20s\t|\n", sub2, marks2, status2);
                                        System.out.printf("|%-15s|%-12s|%-20s\t|\n", sub3, marks3, status3);
                                        System.out.printf("+%s+\n", "-".repeat(47));
                                    }
                                }
                            }
                        }         
                    }
                }
            }
        }

        closer:
        scanner.close();
    }
}