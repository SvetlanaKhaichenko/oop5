package view;

import Model.DB.DataBase;
import Model.StudentGroup;
import Model.impl.Student;
import Model.impl.Teacher;
import controller.StudentController;
import controller.StudentGroupController;
import controller.TeacherController;

import java.util.List;
import java.util.Scanner;

public class StudentView {

    private StudentController controller = new StudentController();
    private TeacherController teacherController = new TeacherController();
    private StudentGroupController groupController = new StudentGroupController();
    Scanner scan = new Scanner(System.in);

    public void start(){
        DataBase.fillDB();
        while (true){
            System.out.println("1 - Создать студента");
            System.out.println("2 - Найти студента по id");
            System.out.println("3 - Распечатать всех студентов");
            System.out.println("4 - Создать учебную группу");
            System.out.println("5 - Добавить студента в учебную группу");
            System.out.println("6 - Распечатать все группы");
            System.out.println("7 - Распечатать группу по id");
            System.out.println("8 - Выход");
        switch (scan.nextInt()) {
            case 1 -> createStudent();
            case 2 -> getById();
            case 3 -> getAllStudents();
            case 4 -> createStudentGroup();
            case 5 -> addStudentInGroup();
            case 6 -> getAllGroups();
            case 7 -> getByIdGroup();
            case 8 -> System.exit(0);

            default -> System.out.println("Операция не поддерживатся");
        }
        }
    }

    private Student createStudent (){

        System.out.println("Введите имя: ");
        String name = scan.next();
        System.out.println("Введите фамилию: ");
        String lastName = scan.next();
        System.out.println("Введите номер группы: ");
        int idGroup = scan.nextInt();
        Student student =  controller.createStudent(name, lastName, idGroup);
        System.out.println(student);
        return student;
    }

    private Student getById(){
        System.out.println("Введите id студента: ");
        int idGroup = scan.nextInt();
        Student student =  controller.getById(idGroup);
        System.out.println(student);
        return student;

    }

    private List<Student> getAllStudents(){
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    }

    private StudentGroup createStudentGroup (){

        System.out.println("Введите id учителя: ");
        int idTeacher = scan.nextInt();
        Teacher teacher = teacherController.getById(idTeacher);
        System.out.println("Введите номер группы");
        int idGroup = scan.nextInt();
        StudentGroup sGroup =  groupController.createStudentGroup(teacher, idGroup);
        System.out.println(sGroup);
        return sGroup;
    }

    private void addStudentInGroup () {
        System.out.println("Введите id студента: ");
        int idStudent = scan.nextInt();
        System.out.println("Введите номер группы, в которую хотите добавить: ");
        int idGroup = scan.nextInt();
        try {
            groupController.addStudentInGroup(idStudent, idGroup);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        StudentGroup group = groupController.getByIdGroup(idGroup);
        System.out.println(group);

    }
    private List<StudentGroup> getAllGroups(){
        List<StudentGroup> groups = groupController.getALLGroups();
        System.out.println(groups);
        return groups;
    }
    private StudentGroup getByIdGroup(){
        System.out.println("Введите номер группы: ");
        int idGroup = scan.nextInt();
        StudentGroup group = groupController.getByIdGroup(idGroup);
        System.out.println(group);
        return group;
    }
}
