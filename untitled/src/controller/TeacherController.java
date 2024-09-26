package controller;

import Model.impl.Teacher;
import service.TeacherService;

public class TeacherController {

    private TeacherService service = new TeacherService();
    public Teacher getById (int idTeacher){

        Teacher teacher = null;
        try {
            teacher = service.getById(idTeacher);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return teacher;
    }
}
