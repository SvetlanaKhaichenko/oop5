package controller;

import Model.impl.Student;
import service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService service = new StudentService();

    public Student createStudent (String name, String lastName, int groupId){
       return service.createStudent(name, lastName, groupId);
    }

    public Student getById(int id) {

        Student student = null;
       try {
           student = service.getById(id);
       } catch (Exception e){
           System.out.println(e.getMessage());
       }
       return student;
    }

    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }
}
