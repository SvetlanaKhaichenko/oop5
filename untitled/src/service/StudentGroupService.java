package service;

import Model.DB.DataBase;
import Model.StudentGroup;
import Model.impl.Student;
import Model.impl.Teacher;
import controller.StudentController;

import java.util.List;

public class StudentGroupService {

    public StudentGroup createStudentGroup(Teacher teacher, int idGroup){

        return new StudentGroup(teacher, idGroup);
    }

    public StudentGroup getByIdGroup(int idGroup) throws Exception {
        StudentGroup group = null;
        group = DataBase.groups.stream()
                .filter(g->g.getIdGroup()==idGroup)
                .findFirst()
                .orElse(null);
        if (group==null){
            throw new Exception("Student Group not found");
        }
        return group;
    }

    public void addStudentInGroup (int idStudent, int idGroup) throws Exception {
        StudentController controller = new StudentController();
        getByIdGroup(idGroup).getStudents().add(controller.getById(idStudent));
    }
    public List<StudentGroup> getALLGroups(){
        return DataBase.groups;
    }
}


