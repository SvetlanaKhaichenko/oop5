package service;

import Model.DB.DataBase;
import Model.impl.Teacher;

public class TeacherService {

    public Teacher getById (int idTeacher) throws Exception {
    Teacher teach = null;
    teach = DataBase.teachersDB.stream()
            .filter(t->t.getId()==idTeacher)
            .findFirst()
            .orElse(null);
    if (teach==null){
        throw new Exception("Teacher not found");
    }
    return teach;
    }
}
