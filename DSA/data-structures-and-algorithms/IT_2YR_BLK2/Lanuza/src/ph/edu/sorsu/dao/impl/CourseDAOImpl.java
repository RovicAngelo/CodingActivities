package ph.edu.sorsu.dao.impl;

import java.util.ArrayList;
import java.util.List;
import ph.edu.sorsu.dao.CourseDAO;
import ph.edu.sorsu.entity.Course;

public class CourseDAOImpl implements CourseDAO<Course> {
    private List<Course> listOfCourses = new ArrayList<>();

    @Override
    public void create(Course entity) {
        boolean isAdded = listOfCourses.add(entity);

        if (isAdded) {
            System.out.println("[INFO] You have successfully added a new course.");
        } else {
            System.out.println("[ERROR] You have NOT successfully added a new course.");
        }
    }

    @Override
    public Course read(int indexPosition) {
        System.out.println("[INFO] Retrieving course record from  the list...");
        return listOfCourses.get(indexPosition);
    }

    @Override
    public void update(int indexPosition, Course entity) {
        listOfCourses.remove(indexPosition);
        listOfCourses.add(indexPosition, entity);
        System.out.println("[INFO] Updating the course record in the list...");
        System.out.println("[INFO] You have successfully updated the course.");
    }

    @Override
    public void delete(int indexPosition) {
        listOfCourses.remove(indexPosition);
        System.out.println("[INFO] You have successfully removed a course.");
    }

    @Override
    public List<Course> readAll() {
        System.out.println("[INFO] Retrieving the list of courses...");
        System.out.println("[INFO] " + listOfCourses.size() + " course(s) found in your list");
        return listOfCourses;
    }

}