import java.util.HashMap;

public class GradesApplication {




    public static void main(String[] args) {
    HashMap <String, Student> students = new HashMap<>();
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
    students.put("danilane1821",one);
    students.put("EddyisCool",two);
    students.put("Bevislame18",three);
    students.put("annetteisrad45",four);

    //looping to show that each student was given a github username
    for(String x: students.keySet()){
        System.out.println("x = " + x);
    }


    }
}
