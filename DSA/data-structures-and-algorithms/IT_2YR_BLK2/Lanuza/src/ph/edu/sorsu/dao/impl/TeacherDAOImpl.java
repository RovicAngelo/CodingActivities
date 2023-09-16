package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.dao.TeacherDAO;
import ph.edu.sorsu.entity.Teacher;

public class TeacherDAOImpl implements TeacherDAO<Teacher> {
    private List<Teacher> listOfTeachers = new ArrayList<>();

    @Override
    public void create(Teacher entity) {
        boolean isAdded = listOfTeachers.add(entity);

        if (isAdded) {
            System.out.println("[INFO] You have successfully added a new teacher.");
        } else {
            System.out.println("[ERROR] You have NOT successfully added a new teacher.");
        }

    }

    @Override
    public Teacher read(int indexPosition) {
        System.out.println("[INFO] Retrieving teacher record from  the list...");
        return listOfTeachers.get(indexPosition);
    }

    @Override
    public void update(int indexPosition, Teacher entity) {
        listOfTeachers.remove(indexPosition);
        listOfTeachers.add(indexPosition, entity);
        System.out.println("[INFO] Updating the teacher record in the list...");
        System.out.println("[INFO] You have successfully updated the teacher.");

    }

    @Override
    public void delete(int indexPosition) {
        listOfTeachers.remove(indexPosition);
        System.out.println("[INFO] You have successfully removed a teacher.");
    }

    @Override
    public List<Teacher> readAll() {
        System.out.println("[INFO] Retrieving the list of teachers...");
        System.out.println("[INFO] " + listOfTeachers.size() + " teacher(s) found in your list");
        return listOfTeachers;
    }

}
