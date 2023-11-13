import java.util.ArrayList;

public class Main {
    public static void main(String[] arg) {
        B b = new B();

        StudentLogic();

        Triangle triangle = new Triangle(100, 3);
        double area = triangle.getArea();
        System.out.println("Triangle area: " + area);
    }

    public static void StudentLogic() {
        Student stud1 = new Student("Jimmy", "Carter");
        Student stud2 = new Student("Ronald", "Reagan");
        Student stud3 = new Student("George", "Bush");
        Student stud4 = new Student("Bill", "Clinton");

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(stud1);
        students.add(stud2);
        students.add(stud3);
        students.add(stud4);

        for(int i = 0; i < students.size(); i++ ) {
            students.get(i).PrintNames();
        }
        System.out.println("");
    }
}