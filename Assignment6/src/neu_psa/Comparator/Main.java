package neu_psa.Comparator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");

	    Student s1 = new Student();
        String date1 = "01/02/1994";
        s1.setId(1);
        s1.setName("Aaron");
        s1.setGpa(2.3);
        s1.setDateOfBirth(sdf1.parse(date1));

        Student s2 = new Student();
        String date2 = "01/02/1993";
        s2.setId(2);
        s2.setName("Ben");
        s2.setGpa(3.2);
        s2.setDateOfBirth(sdf1.parse(date2));

        Student s3 = new Student();
        String date3 = "01/02/2001";
        s3.setId(3);
        s3.setName("Claire");
        s3.setGpa(5.0);
        s3.setDateOfBirth(sdf1.parse(date3));

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Collections.sort(students, new SortByGPA());
        for(Student student : students){
            System.out.println(student.getId()+","+student.getName()+","+student.getGpa()+","+student.getDateOfBirth());
        }
    }
}
