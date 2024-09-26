package service;

import Model.DB.DataBase;
import Model.impl.Student;

import java.util.List;

public class StudentService {

    public Student createStudent (String name, String lastName, int groupId){

        int size = DataBase.studentsDB.size() + 1;
        Student student = new Student(size, name, lastName, groupId);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Student getById(int id) throws Exception {
        Student s = null;
        s = DataBase.studentsDB.stream()
                .filter(student -> student.getId()==id)
                .findFirst()
                .orElse(null);
        if (s==null){
            throw new Exception("Student not found");
        }
        return s;
    }

    public List<Student> getAllStudents(){
        return DataBase.studentsDB;
    }


}
