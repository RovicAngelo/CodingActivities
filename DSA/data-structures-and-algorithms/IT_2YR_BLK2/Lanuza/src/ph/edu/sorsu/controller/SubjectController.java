package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;
import ph.edu.sorsu.dao.CourseDAO;
import ph.edu.sorsu.dao.SubjectDAO;
import ph.edu.sorsu.dao.impl.CourseDAOImpl;
import ph.edu.sorsu.dao.impl.SubjectDAOImpl;
import ph.edu.sorsu.entity.Course;
import ph.edu.sorsu.entity.Subject;

public class SubjectController {
    private SubjectDAO<Subject> subjectDAO;
    private CourseDAO<Course> courseDAO;
    private Scanner scanner;

    public SubjectController(Scanner scanner) {
        this.subjectDAO = new SubjectDAOImpl();
        this.courseDAO = new CourseDAOImpl();
        this.scanner = scanner;
    }

    public void createSubject() { // method to create a new subject
        System.out.println("---------------------------------------------------------------------");
        System.out.println("FILL UP THE SUBJECT FORM.");

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.print("Code: ");
        String code = scanner.nextLine();

        System.out.print("Descriptiom: ");
        String description = scanner.nextLine();

        System.out.print("Number Of Units: ");
        Long numberOfUnits = Long.parseLong(scanner.nextLine());

        System.out.println("Course Information: ");
        System.out.print("ID: ");
        Long courseId = Long.parseLong(scanner.nextLine());

        System.out.print("Code: ");
        String courseCodes = scanner.nextLine();

        System.out.print("Description: ");
        String courseDescriptions = scanner.nextLine();

        Course course = new Course();
        // calling the methods to set the attributes from user inputs.
        course.setId(courseId);
        course.setCode(courseCodes);
        course.setDescription(courseDescriptions);

        Subject subject = new Subject();
        subject.setId(id);
        subject.setCode(code);
        subject.setDescription(description);
        subject.setNumberOfUnits(numberOfUnits);
        subject.setCourse(course);

        subjectDAO.create(subject);
        courseDAO.create(course);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getSubject() {// method to get a subject.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To get the subject record, provide the index postion.");

        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());
        Subject subject = subjectDAO.read(indexPositions);
        Course course = courseDAO.read(indexPositions);

        System.out.println("----------------------Subject Information----------------------------");
        System.out.println("ID: " + subject.getId());
        System.out.println("First Name: " + subject.getCode());
        System.out.println("Middle Name: " + subject.getDescription());
        System.out.println("Last Name: " + subject.getNumberOfUnits());

        System.out.println("Course Informations in the Subject: ");
        System.out.println("id: " + course.getId());
        System.out.println("Code: " + course.getCode());
        System.out.println("Description: " + course.getDescription());
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

    }

    public void updateSubject() { // method to update a subject.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To update the subject record, provide the index postion.");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        Subject subject = subjectDAO.read(indexPositions);
        Course course = courseDAO.read(indexPositions);

        System.out.println("----------------------Subject Information----------------------------");
        System.out.println("ID: " + subject.getId());
        System.out.println("First Name: " + subject.getCode());
        System.out.println("Middle Name: " + subject.getDescription());
        System.out.println("Last Name: " + subject.getNumberOfUnits());

        System.out.println("Course Informations in the Subject: ");
        System.out.println("id: " + course.getId());
        System.out.println("Code: " + course.getCode());
        System.out.println("Description: " + course.getDescription());
        System.out.println("---------------------------------------------------------------------");

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.print("Code: ");
        String code = scanner.nextLine();

        System.out.print("Descriptiom: ");
        String description = scanner.nextLine();

        System.out.print("Number Of Units: ");
        Long numberOfUnits = Long.parseLong(scanner.nextLine());

        System.out.println("Course Information: ");
        System.out.print("ID: ");
        Long courseId = Long.parseLong(scanner.nextLine());

        System.out.print("Code: ");
        String courseCodes = scanner.nextLine();

        System.out.print("Description: ");
        String courseDescriptions = scanner.nextLine();

        // calling the methods to set the attributes from user inputs
        course.setId(courseId);
        course.setCode(courseCodes);
        course.setDescription(courseDescriptions);

        subject.setId(id);
        subject.setCode(code);
        subject.setDescription(description);
        subject.setNumberOfUnits(numberOfUnits);
        subject.setCourse(course);

        subjectDAO.update(indexPositions, subject);
        courseDAO.update(indexPositions, course);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void deleteSubject() { // method to delete a subject
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To delete a subject, provide the index postion");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        subjectDAO.delete(indexPositions);
        courseDAO.delete(indexPositions);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getAllSubject() { // method to get all the subject(s) in the list.
        List<Subject> subjects = subjectDAO.readAll();
        List<Course> courses = courseDAO.readAll();
        System.out.println("--------------------------List of Subjects---------------------------");
        System.out.println(
                "ID,FIRST_NAME,MIDDLE_NAME,LAST_NAME,BIRTH_DATE,BIRTH_PLACE,CONTACT_NUMBER,EMAIL_ADDRESS,COURSE_ID,COURSE_CODE,COURSE_DESCRIPTION ");
        // loop to get all the subject(s) in the list based on their index position.
        for (int i = 0; i < subjects.size() & i < courses.size(); i++) {
            System.out.println(
                    subjects.get(i).getId() + "," + subjects.get(i).getCode() + ","
                            + subjects.get(i).getDescription() + "," + subjects.get(i).getNumberOfUnits() + ","
                            + courses.get(i).getId() + "," + courses.get(i).getCode() + ","
                            + courses.get(i).getDescription());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }
}