import java.util.Comparator;

public class StudentComp implements Comparator<Student>{
    
    @Override
    public int compare(Student arg0, Student arg1) {
        return arg0.FirstName.compareTo(arg1.FirstName);
    }    
}
