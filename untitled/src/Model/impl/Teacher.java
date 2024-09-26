package Model.impl;

import Model.User;

import java.util.ArrayList;
import java.util.List;


public class Teacher extends User {

    protected final List<Integer> groups = new ArrayList<>();

    public Teacher(int id, String name, String lastName) {
        super(id, name, lastName);
    }
// убрать в сервис метод добавления группы
    public void addGroupId(int id){
        groups.add(id);
    }

}
