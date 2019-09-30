import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Student> students = new HashMap<>();
        //Creating new student
        Student one = new Student("Dani");
        Student two = new Student("Eddy");
        Student three = new Student("Bev");
        Student four = new Student("Anette");

        //adding grades for students
        one.addGrade(90);
        one.addGrade(80);
        one.addGrade(70);
        two.addGrade(95);
        two.addGrade(90);
        two.addGrade(85);
        three.addGrade(78);
        three.addGrade(92);
        three.addGrade(100);
        four.addGrade(76);
        four.addGrade(87);
        four.addGrade(91);

        //adding students to HashMap
        students.put("danilane1821", one);
        students.put("EddyisCool", two);
        students.put("Bevislame18", three);
        students.put("annetteisrad45", four);

        //looping to show that each student was given a github username

        do {

            System.out.println("Welcome!\n" +
                    "\n" +
                    "Here are the GitHub usernames of our students:\n");
            for (String userName : students.keySet()) {
                System.out.print(userName + " | ");
            }

            System.out.println("\nWhat student would you like to see more information on?");
            String x = input.nextLine();

            if (!students.containsKey(x)) {
                System.out.println("That is not a valid response");
                System.out.println("\nWhat student would you like to see more information on?");
            }
            if (students.containsKey(x)) {
//                System.out.println("x = " + x);
                System.out.println("Name : " + students.get(x).getName());
                System.out.println("Username : " + x);
                System.out.println("Grade Average : " + students.get(x).getGradeAverage());

            }
            System.out.println("Do you want to see another user? Y/N");

        }while(input.nextLine().equalsIgnoreCase("y"));

        }

    }

