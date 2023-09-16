package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.dao.StudentDAO;
import ph.edu.sorsu.entity.Student;

public class StudentDAOImpl implements StudentDAO<Student> {
    private List<Student> listOfStudents = new ArrayList<>();

    @Override
    public void create(Student entity) {
        boolean isAdded = listOfStudents.add(entity);

        if (isAdded) {
            System.out.println("[INFO] You have successfully added a new student.");
        } else {
            System.out.println("[ERROR] You have NOT successfully added a new student.");
        }
    }

    @Override
    public Student read(int indexPosition) {
        System.out.println("[INFO] Retrieving student record from  the list...");
        return listOfStudents.get(indexPosition);
    }

    @Override
    public void update(int indexPosition, Student entity) {
        listOfStudents.remove(indexPosition);
        listOfStudents.add(indexPosition, entity);
        System.out.println("[INFO] Updating the student record in the list...");
        System.out.println("[INFO] You have successfully updated the student.");

    }

    @Override
    public void delete(int indexPosition) {
        listOfStudents.remove(indexPosition);
        System.out.println("[INFO] You have successfully removed a student.");

    }

    @Override
    public List<Student> readAll() {
        System.out.println("[INFO] Retrieving the list of students...");
        System.out.println("[INFO] " + listOfStudents.size() + " student(s) found in your list");
        return listOfStudents;
    }

}