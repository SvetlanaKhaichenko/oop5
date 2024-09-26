package controller;

import Model.DB.DataBase;
import Model.StudentGroup;
import Model.impl.Student;
import Model.impl.Teacher;
import service.StudentGroupService;

import java.util.List;

public class StudentGroupController {

    private StudentGroupService service = new StudentGroupService();


    public StudentGroup createStudentGroup(Teacher teacher, int idGroup)
    {
        StudentGroup group = service.createStudentGroup(teacher, idGroup);
        DataBase.groups.add(group);
        return group;
    }

    public void addStudentInGroup(int idStudent, int idGroup) throws Exception {
        StudentGroup group = null;
        try {
            service.addStudentInGroup(idStudent, idGroup);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public StudentGroup getByIdGroup(int idGroup){
        StudentGroup group = null;
        try {
            group = service.getByIdGroup(idGroup);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return  group;
    }
    public List<StudentGroup> getALLGroups(){
        return service.getALLGroups();

    }
}
