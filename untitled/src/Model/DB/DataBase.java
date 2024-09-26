package Model.DB;

import Model.StudentGroup;
import Model.impl.Student;
import Model.impl.Teacher;
import service.StudentGroupService;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static final List<StudentGroup> groups = new ArrayList<>();


    public static void fillDB(){
        Teacher teacher = new Teacher(1, "Muxamed", "Ali");
        teacher.addGroupId(1);
        teachersDB.add(teacher);
        Student s1 = new Student(1, "Petr", "Ivanov", 1);
        Student s2 = new Student(2, "Vasya", "Pupkin", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
        StudentGroup group = new StudentGroup(teacher, 1);
        groups.add(group);


    }
}
