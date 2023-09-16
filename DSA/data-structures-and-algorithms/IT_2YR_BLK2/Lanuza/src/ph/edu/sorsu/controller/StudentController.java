package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;
import ph.edu.sorsu.dao.CourseDAO;
import ph.edu.sorsu.dao.StudentDAO;
import ph.edu.sorsu.dao.impl.CourseDAOImpl;
import ph.edu.sorsu.dao.impl.StudentDAOImpl;
import ph.edu.sorsu.entity.Course;
import ph.edu.sorsu.entity.Student;

public class StudentController {
    private StudentDAO<Student> studentDAO;
    private CourseDAO<Course> courseDAO;
    private Scanner scanner;

    public StudentController(Scanner scanner) {
        this.studentDAO = new StudentDAOImpl();
        this.courseDAO = new CourseDAOImpl();
        this.scanner = scanner;
    }

    public void createStudent() { // method to create a new student
        System.out.println("---------------------------------------------------------------------");
        System.out.println("FILL UP THE STUDENT FORM.");

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Birth Date: ");
        String birthDate = scanner.nextLine();

        System.out.print("Birth Place: ");
        String birthPlace = scanner.nextLine();

        System.out.print("Contact Number: (Omit +63) ");
        Long contactNumber = Long.parseLong(scanner.nextLine());

        System.out.print("Email Address: ");
        String emailAddress = scanner.nextLine();

        System.out.println("Course Information: ");
        System.out.print("ID: ");
        Long courseId = Long.parseLong(scanner.nextLine());

        System.out.print("Code: ");
        String code = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        Course course = new Course();
        // calling the methods to set the attributes from user inputs.
        course.setId(courseId);
        course.setCode(code);
        course.setDescription(description);

        Student student = new Student();
        student.setId(id);
        student.setFirstName(firstName);
        student.setMiddleName(middleName);
        student.setLastName(lastName);
        student.setBirthDate(birthDate);
        student.setBirthPlace(birthPlace);
        student.setContactNumber(contactNumber);
        student.setEmailAddress(emailAddress);
        student.setCourse(course);

        studentDAO.create(student);
        courseDAO.create(course);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getStudent() { // method to get a student
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To get the student record, provide the index postion.");

        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());
        Student student = studentDAO.read(indexPositions);
        Course course = courseDAO.read(indexPositions);

        System.out.println("-------------------------Student Information-------------------------");
        System.out.println("ID: " + student.getId());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Birth Date: " + student.getBirthDate());
        System.out.println("Birth Place: " + student.getBirthPlace());
        System.out.println("Contact Number: (+63)" + student.getContactNumber());
        System.out.println("Email Address: " + student.getEmailAddress());
        System.out.println("Course Information in the Student: ");
        System.out.println("id: " + course.getId());
        System.out.println("Code: " + course.getCode());
        System.out.println("Description: " + course.getDescription());
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

    }

    public void updateStudent() { // method to update a student
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To update the student record, provide the index postion.");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());
        Course course = courseDAO.read(indexPositions);
        Student student = studentDAO.read(indexPositions);

        System.out.println("-------------------------Student Information-------------------------");
        System.out.println();
        System.out.println("ID: " + student.getId());
        System.out.println("First Name: " + student.getFirstName());
        System.out.println("Middle Name: " + student.getMiddleName());
        System.out.println("Last Name: " + student.getLastName());
        System.out.println("Birth Date: " + student.getBirthDate());
        System.out.println("Birth Place: " + student.getBirthPlace());
        System.out.println("Contact Number: (+63)" + student.getContactNumber());
        System.out.println("Email Address: " + student.getEmailAddress());
        System.out.println("Course Information in the Student: ");
        System.out.println("id: " + course.getId());
        System.out.println("Code: " + course.getCode());
        System.out.println("Description: " + course.getDescription());
        System.out.println("---------------------------------------------------------------------");

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("MiddleName: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Birth Date: ");
        String birthDate = scanner.nextLine();

        System.out.print("Birth Place: ");
        String birthPlace = scanner.nextLine();

        System.out.print("Contact Number: (Omit +63) ");
        Long contactNumber = Long.parseLong(scanner.nextLine());

        System.out.print("emailAddress: ");
        String emailAddress = scanner.nextLine();

        System.out.println("Course Information: ");
        System.out.print("ID: ");
        Long courseId = Long.parseLong(scanner.nextLine());

        System.out.print("Code: ");
        String code = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        // calling the methods to set the attributes from user inputs.
        course.setId(courseId);
        course.setCode(code);
        course.setDescription(description);

        student.setId(id);
        student.setFirstName(firstName);
        student.setMiddleName(middleName);
        student.setLastName(lastName);
        student.setBirthDate(birthDate);
        student.setBirthPlace(birthPlace);
        student.setContactNumber(contactNumber);
        student.setEmailAddress(emailAddress);
        student.setCourse(course);

        studentDAO.update(indexPositions, student);
        courseDAO.update(indexPositions, course);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void deleteStudent() { // method to delete a student
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To delete a student, provide the index postion");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        studentDAO.delete(indexPositions);
        courseDAO.delete(indexPositions);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getAllStudent() { // method to get all the student(s) in the list.
        System.out.println("---------------------------------------------------------------------");
        List<Student> students = studentDAO.readAll();
        List<Course> course = courseDAO.readAll();
        System.out.println("-------------------------List of Students----------------------------");
        System.out.println(
                "ID,FIRST_NAME,MIDDLE_NAME,LAST_NAME,BIRTH_DATE,BIRTH_PLACE,CONTACT_NUMBER,EMAIL_ADDRESS,COURSE_ID,COURSE_CODE,COURSE_DESCRIPTION ");
        // loop to get all the student(s) in the list based on their index position.
        for (int i = 0; i < students.size() & i < course.size(); i++) {
            System.out.println(
                    students.get(i).getId() + "," + students.get(i).getFirstName() + ","
                            + students.get(i).getMiddleName() + "," + students.get(i).getLastName() + ","
                            + students.get(i).getBirthDate() + "," + students.get(i).getBirthPlace() + ",(+63)"
                            + students.get(i).getContactNumber() + "," + students.get(i).getEmailAddress() + ","
                            + course.get(i).getId() + "," + course.get(i).getCode() + ","
                            + course.get(i).getDescription());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }
}