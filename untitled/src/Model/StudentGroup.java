package Model;

import Model.impl.Student;
import Model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {

    Teacher teacher;
    List<Student> students = new ArrayList<>();
    int idGroup;

    public StudentGroup(Teacher teacher, int idGroup) {
        this.teacher = teacher;
        this.idGroup = idGroup;
    }

    public int getIdGroup() {
        return idGroup;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                ", idGroup=" + idGroup +
                '}';
    }

    public List<Student> getStudents() {
        return students;
    }
}
