package neu_psa.Comparator;

import java.util.Comparator;
import java.util.Date;

public class SortByDOB implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getDateOfBirth().compareTo(student2.getDateOfBirth());

    }
}
