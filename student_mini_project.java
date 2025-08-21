import java.util.Scanner;
public class student_mini_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = sc.nextLine();
        System.out.println("enter a student ID:");
        long id = sc.nextLong();
        System.out.println("Enter the student phone number:");
        long phone = sc.nextLong();
        System.out.println("Enter the student email:");
        String email = sc.next();
        System.out.println("Enter the student marks:");
        int subject1 = sc.nextInt();
        int subject2 = sc.nextInt();
        int subject3 = sc.nextInt();
        int subject4 = sc.nextInt();
        int average = (subject1 + subject2 + subject3 + subject4) / 4;
        System.out.println();
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student Phone Number: " + phone);
        System.out.println("Student Email: " + email);
        System.out.println("average marks: " + average);
        if(subject1 < 35 || subject2 < 35 || subject3 < 35 || subject4 < 35) {
            System.out.println("grade = F");}else{
        if(average >= 35 && average < 50) {
            System.out.println(" grade = D");
        }else if(average >= 50 && average < 70) {
            System.out.println("grade = C");
        } else if(average >= 70 && average < 90) { 
            System.out.println("grade = B");
        } else if(average >= 90 && average <= 100) {
            System.out.println("grade = A");
        }
    }
    }
}
