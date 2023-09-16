package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;
import ph.edu.sorsu.dao.CourseDAO;
import ph.edu.sorsu.dao.impl.CourseDAOImpl;
import ph.edu.sorsu.entity.Course;

public class CourseController {
    private CourseDAO<Course> courseDAO;
    private Scanner scanner;

    public CourseController(Scanner scanner) {
        this.courseDAO = new CourseDAOImpl();
        this.scanner = scanner;
    }

    public void createCourse() { // method to create a new course
        System.out.println("---------------------------------------------------------------------");
        System.out.println("FILL UP THE COURSE FORM.");

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.print("Code: ");
        String code = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        Course course = new Course();
        // calling the methods to set the attributes from user inputs.
        course.setId(id);
        course.setCode(code);
        course.setDescription(description);

        courseDAO.create(course);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getCourse() { // Method to get a course.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To get the course record, provide the index postion.");

        System.out.print("Index Position: ");
        int indexPosition = Integer.parseInt(scanner.nextLine());
        Course course = courseDAO.read(indexPosition);

        System.out.println("-------------------------Course Information--------------------------");
        System.out.println("ID: " + course.getId());
        System.out.println("Code: " + course.getCode());
        System.out.println("Description: " + course.getDescription());
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

    }

    public void updateCourse() { // method to update a course.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To update the course record, provide the index postion.");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        Course course = courseDAO.read(indexPositions);
        System.out.println("-------------------------Course Information--------------------------");
        System.out.println("ID: " + course.getId());
        System.out.println("Code: " + course.getCode());
        System.out.println("Description: " + course.getDescription());

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.print("Code: ");
        String code = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        // calling the methods to set the attributes from user inputs.
        course.setId(id);
        course.setCode(code);
        course.setDescription(description);

        courseDAO.update(indexPositions, course);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void deleteCourse() { // method to delete a course
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To delete a course, provide the index postion");
        System.out.print("Index Postion: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        courseDAO.delete(indexPositions);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getAllCourse() { // method to get all the course(s) in the list.
        List<Course> courses = courseDAO.readAll();
        System.out.println("----------------------------List of Courses--------------------------");
        System.out.println("ID,CODE,DESCRIPTION");

        // loop to get all the course(s) in the list based on their index position.
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(
                    courses.get(i).getId() + "," + courses.get(i).getCode() + "," + courses.get(i).getDescription());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }
}