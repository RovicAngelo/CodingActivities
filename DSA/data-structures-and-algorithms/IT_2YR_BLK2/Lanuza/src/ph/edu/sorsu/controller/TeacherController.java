package ph.edu.sorsu.controller;

import java.util.List;
import java.util.Scanner;
import ph.edu.sorsu.dao.TeacherDAO;
import ph.edu.sorsu.dao.impl.TeacherDAOImpl;
import ph.edu.sorsu.entity.Teacher;

public class TeacherController {
    private TeacherDAO<Teacher> teacherDAO;
    private Scanner scanner;

    public TeacherController(Scanner scanner) {
        this.teacherDAO = new TeacherDAOImpl();
        this.scanner = scanner;
    }

    public void createTeacher() { // methods to create a new teacher.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("FILL UP THE TEACHER FORM.");

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.print("Rank: ");
        String rank = scanner.nextLine();

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Contact Number: (Omit +63) ");
        Long contactNumber = Long.parseLong(scanner.nextLine());

        System.out.print("Email Address: ");
        String emailAddress = scanner.nextLine();

        Teacher teacher = new Teacher();
        // calling the methods to set the attributes from user inputs.
        teacher.setId(id);
        teacher.setRank(rank);
        teacher.setFullName(fullName);
        teacher.setContactNumber(contactNumber);
        teacher.setEmailAddress(emailAddress);

        teacherDAO.create(teacher);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getTeacher() { // method to get a teacher.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To get the teacher record, provide the index postion.");

        System.out.print("Index Position: ");
        int indexPosition = Integer.parseInt(scanner.nextLine());
        Teacher teacher = teacherDAO.read(indexPosition);

        System.out.println("------------------------Teacher Information--------------------------");
        System.out.println("ID: " + teacher.getId());
        System.out.println("Rank: " + teacher.getRank());
        System.out.println("Full Name: " + teacher.getFullName());
        System.out.println("Contact Number: (+63)" + teacher.getContactNumber());
        System.out.println("Email Address: " + teacher.getEmailAddress());
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

    }

    public void updateTeacher() { // methods to update a teacher.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To update the teacher record, provide the index postion.");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        Teacher teacher = teacherDAO.read(indexPositions);

        System.out.println("------------------------Teacher Information--------------------------");
        System.out.println("ID: " + teacher.getId());
        System.out.println("Rank: " + teacher.getRank());
        System.out.println("Full Name: " + teacher.getFullName());
        System.out.println("Contact Number: (+63)" + teacher.getContactNumber());
        System.out.println("Email Address: " + teacher.getEmailAddress());
        System.out.println("---------------------------------------------------------------------");

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        System.out.print("Rank: ");
        String rank = scanner.nextLine();

        System.out.print("Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Contact Number: (Omit +63) ");
        Long contactNumber = Long.parseLong(scanner.nextLine());

        System.out.print("Email Address: ");
        String emailAddress = scanner.nextLine();

        // calling the methods to set the attributes from user inputs.
        teacher.setId(id);
        teacher.setRank(rank);
        teacher.setFullName(fullName);
        teacher.setContactNumber(contactNumber);
        teacher.setEmailAddress(emailAddress);

        teacherDAO.update(indexPositions, teacher);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void deleteTeacher() { // method to delete a teacher.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To delete a teacher, provide the index postion");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        teacherDAO.delete(indexPositions);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getAllTeacher() { // method to get all the teacher(s) in the list.
        System.out.println("---------------------------------------------------------------------");
        List<Teacher> teachers = teacherDAO.readAll();
        System.out.println("--------------------------List of Teachers---------------------------");
        System.out.println("ID,RANK,FULLNAME,CONTACT NUMBER,EMAIL ADDRESS");
        // loop to get all the teacher(s) in the list based on their index position.
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println(
                    teachers.get(i).getId() + "," + teachers.get(i).getRank() + "," + teachers.get(i).getFullName()
                            + ",(+63)" + teachers.get(i).getContactNumber() + "," + teachers.get(i).getEmailAddress());
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }
}