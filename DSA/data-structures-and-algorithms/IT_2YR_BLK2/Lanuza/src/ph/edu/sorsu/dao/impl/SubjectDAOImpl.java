package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.dao.SubjectDAO;
import ph.edu.sorsu.entity.Subject;

public class SubjectDAOImpl implements SubjectDAO<Subject> {
    private List<Subject> listOfSubjects = new ArrayList<>();

    @Override
    public void create(Subject entity) {
        boolean isAdded = listOfSubjects.add(entity);

        if (isAdded) {
            System.out.println("[INFO] You have successfully added a new subject.");
        } else {
            System.out.println("[ERROR] You have NOT successfully added a new subject.");
        }

    }

    @Override
    public Subject read(int indexPosition) {
        System.out.println("[INFO] Retrieving subject record from  the list...");
        return listOfSubjects.get(indexPosition);
    }

    @Override
    public void update(int indexPosition, Subject entity) {
        listOfSubjects.remove(indexPosition);
        listOfSubjects.add(indexPosition, entity);
        System.out.println("[INFO] Updating the subject record in the list...");
        System.out.println("[INFO] You have successfully updated the subject.");
    }

    @Override
    public void delete(int indexPosition) {
        listOfSubjects.remove(indexPosition);
        System.out.println("[INFO] You have successfully removed a subject.");
    }

    @Override
    public List<Subject> readAll() {
        System.out.println("[INFO] Retrieving the list of subjects...");
        System.out.println("[INFO] " + listOfSubjects.size() + " subject(s) found in your list");
        return listOfSubjects;
    }

}
