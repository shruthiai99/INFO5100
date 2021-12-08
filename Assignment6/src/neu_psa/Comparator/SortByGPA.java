package neu_psa.Comparator;

import java.util.Comparator;

public class SortByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.getGpa() < student2.getGpa()){
            return 1;
        }
        if(student1.getGpa() > student2.getGpa()){
            return -1;
        }
        return 0;
    }
}
