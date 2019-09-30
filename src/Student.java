import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);

    }
    // returns the average of the students grades
    public int getGradeAverage(){
        int sum = 0;
       for(Integer avg : grades){
           sum += avg;
       }
        return sum / grades.size();



    }


    public static void main(String[] args) {
        Student one = new Student("dani");
//        dani.grades.add(99);
//        System.out.println(one.getName());
        one.addGrade(99);
        one.addGrade(95);
        one.addGrade(60);

        System.out.println(one.grades.toString());
        System.out.println(one.getGradeAverage());


    }
}
