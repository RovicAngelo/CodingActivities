/*
 ACTIVITY 5, 6, and 7: Enrollment Management System
 Submitted by: Rovic Angelo Lanuza
 Course/Year/Block: BSIT 2-2
 */

package ph.edu.sorsu;

import java.util.Scanner;
import ph.edu.sorsu.controller.*;

public class App {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                 SorSU Enrollment Management System                |" + "\n" +
                "|                         version 1.0-ALPHA                         |" + "\n" +
                "|               By:Rovic Angelo Lanuza & Arnold Ayapana             |");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        while (true) {
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Available Modules" + "\n" +
                    " [1] Student" + "\n" +
                    " [2] Teacher" + "\n" +
                    " [3] Course" + "\n" +
                    " [4] Subject" + "\n" +
                    " [5] Schedule" + "\n" +
                    " [0] Exit Application");
            System.out.println("---------------------------------------------------------------------");
            System.out.println();
            System.out.print("Enter a module number: ");
            int moduleChoice = Integer.parseInt(userInput.nextLine());

            if (moduleChoice >= 0 && moduleChoice <= 5) {
                switch (moduleChoice) {

                    case 1: // if the user selected module #1, go to student module.

                        StudentController studentController = new StudentController(userInput);
                        int studentChoice = -1;
                        do {
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("Student Menu Module" + "\n" +
                                    " [1] Create Student" + "\n" +
                                    " [2] Get Student" + "\n" +
                                    " [3] Update Student" + "\n" +
                                    " [4] Delete Student" + "\n" +
                                    " [5] Get All Student" + "\n" +
                                    " [0] Exit this Module");
                            System.out.println("---------------------------------------------------------------------");

                            System.out.print("Enter a Student menu number: ");
                            int studentModuleChoice = Integer.parseInt(userInput.nextLine());

                            if (studentModuleChoice == 1) { // if the user selected #1,
                                studentController.createStudent(); // Call the method to Create/Add student.

                            } else if (studentModuleChoice == 2) { // if the user selected #2,
                                studentController.getStudent();// Call the method to Get a students in the list.

                            } else if (studentModuleChoice == 3) { // if the user selected #3,
                                studentController.updateStudent();// Call the method to Update a student.

                            } else if (studentModuleChoice == 4) { // if the user selected #4,
                                studentController.deleteStudent();// Call the method to Delete a student in the list.

                            } else if (studentModuleChoice == 5) { // if the user selected #5,
                                studentController.getAllStudent();// Call the method to Get All the students in the list

                            } else if (studentModuleChoice == 0) { // if the user selected #6,Exit the student module.
                                studentChoice = 0;
                            }

                        } while (studentChoice != 0);
                        break;

                    case 2: // if the user selected module #2, go to teacher module.
                        TeacherController teacherController = new TeacherController(userInput);
                        int teacherChoice = -1;
                        do {
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("Teacher Menu Module" + "\n" +
                                    " [1] Create Teacher" + "\n" +
                                    " [2] Get Teacher" + "\n" +
                                    " [3] Update Teacher" + "\n" +
                                    " [4] Delete Teacher" + "\n" +
                                    " [5] Get All Teacher" + "\n" +
                                    " [0] Exit this Module");
                            System.out.println("---------------------------------------------------------------------");

                            System.out.print("Enter a Teacher menu number: ");
                            int teacherModuleChoice = Integer.parseInt(userInput.nextLine());

                            if (teacherModuleChoice == 1) {// if the user selected #1,
                                teacherController.createTeacher();// Call the method to Create/Add teacher.

                            } else if (teacherModuleChoice == 2) {// if the user selected #2,
                                teacherController.getTeacher();// Call the method to Get a teacher in the list.

                            } else if (teacherModuleChoice == 3) {// if the user selected #3,
                                teacherController.updateTeacher();// Call the method to Update a teacher.

                            } else if (teacherModuleChoice == 4) {// if the user selected #4,
                                teacherController.deleteTeacher();// Call the method to Delete a teacher in the list.

                            } else if (teacherModuleChoice == 5) {// if the user selected #5,
                                teacherController.getAllTeacher();// Call the method to Get All the teachers in the
                                                                  // list.

                            } else if (teacherModuleChoice == 0) {// if the user selected #6,Exit the Teacher module.
                                teacherChoice = 0;
                            }

                        } while (teacherChoice != 0);
                        break;
                    case 3: // if the user selected module #3, go to course module.
                        CourseController courseController = new CourseController(userInput);
                        int courseChoice = -1;
                        do {
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("Course Menu Module" + "\n" +
                                    " [1] Create Course" + "\n" +
                                    " [2] Get Course" + "\n" +
                                    " [3] Update Course" + "\n" +
                                    " [4] Delete Course" + "\n" +
                                    " [5] Get All Course" + "\n" +
                                    " [0] Exit this Module");
                            System.out.println("---------------------------------------------------------------------");

                            System.out.print("Enter a Course menu number: ");
                            int courseModuleChoice = Integer.parseInt(userInput.nextLine());

                            if (courseModuleChoice == 1) {// if the user selected menu #1,
                                courseController.createCourse();// Call the method to Create/Add course.

                            } else if (courseModuleChoice == 2) {// if the user selected menu #2,
                                courseController.getCourse();// Call the method to Get a course in the list.

                            } else if (courseModuleChoice == 3) {// if the user selected menu #3,
                                courseController.updateCourse();// Call the method to Update a course.

                            } else if (courseModuleChoice == 4) {// if the user selected menu #4,
                                courseController.deleteCourse();// Call the method to Delete a course in the list.

                            } else if (courseModuleChoice == 5) {// if the user selected menu #5,
                                courseController.getAllCourse();// Call the method to Get All the courses in the
                                                                // list.

                            } else if (courseModuleChoice == 0) {// if the user selected menu #6,Exit the course module
                                courseChoice = 0;
                            }

                        } while (courseChoice != 0);
                        break;

                    case 4:// if the user selected module #4, go to subject module.
                        SubjectController subjectController = new SubjectController(userInput);
                        int subjectChoice = -1;
                        do {
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("Subject Menu Module" + "\n" +
                                    " [1] Create Subject" + "\n" +
                                    " [2] Get Subject" + "\n" +
                                    " [3] Update Subject" + "\n" +
                                    " [4] Delete Subject" + "\n" +
                                    " [5] Get All Subject" + "\n" +
                                    " [0] Exit this Module");
                            System.out.println("---------------------------------------------------------------------");

                            System.out.print("Enter a Subject menu number: ");
                            int subjectModuleChoice = Integer.parseInt(userInput.nextLine());

                            if (subjectModuleChoice == 1) {// if the user selected menu #1,
                                subjectController.createSubject();// Call the method to Create/Add subject.

                            } else if (subjectModuleChoice == 2) {// if the user selected menu #2,
                                subjectController.getSubject();// Call the method to Get a subject in the list.

                            } else if (subjectModuleChoice == 3) {// if the user selected menu #3,
                                subjectController.updateSubject();// Call the method to Update a subject.

                            } else if (subjectModuleChoice == 4) {// if the user selected menu #4,
                                subjectController.deleteSubject();// Call the method to Delete a subject in the list.

                            } else if (subjectModuleChoice == 5) {// if the user selected menu #5,
                                subjectController.getAllSubject();// Call the method to Get All the subjects in the
                                                                  // list.

                            } else if (subjectModuleChoice == 0) {// if the user selected menu #6,Exit the subject
                                                                  // module.
                                subjectChoice = 0;
                            }

                        } while (subjectChoice != 0);
                        break;
                    case 5:// if the user selected module #5, go to schedule module.
                        ScheduleController scheduleController = new ScheduleController(userInput);
                        int scheduleChoice = -1;
                        do {
                            System.out.println("---------------------------------------------------------------------");
                            System.out.println("Schedule Menu Module" + "\n" +
                                    " [1] Create Schedule" + "\n" +
                                    " [2] Get Schedule" + "\n" +
                                    " [3] Update Schedule" + "\n" +
                                    " [4] Delete Schedule" + "\n" +
                                    " [5] Get All Schedule" + "\n" +
                                    " [0] Exit this Module");
                            System.out.println("---------------------------------------------------------------------");

                            System.out.print("Enter a Schedule menu number: ");
                            int scheduleModuleChoice = Integer.parseInt(userInput.nextLine());

                            if (scheduleModuleChoice == 1) {// if the user selected #1,
                                scheduleController.createSchedule();// Call the method to Create/Add schedule.

                            } else if (scheduleModuleChoice == 2) {// if the user selected #2,
                                scheduleController.getSchedule();// Call the method to Get a schedule in the list.

                            } else if (scheduleModuleChoice == 3) {// if the user selected #3,
                                scheduleController.updateSchedule();// Call the method to Update a schedule.

                            } else if (scheduleModuleChoice == 4) {// if the user selected #4,
                                scheduleController.deleteSchedule();// Call the method to Delete a schedule in the list.

                            } else if (scheduleModuleChoice == 5) {// if the user selected #5,
                                scheduleController.getAllSchedule();// Call the method to Get All the
                                                                    // schedules in the list.

                            } else if (scheduleModuleChoice == 0) {// if the user selected menu #6,Exit the schedule
                                                                   // module.
                                scheduleChoice = 0;
                            }

                        } while (scheduleChoice != 0);
                        break;
                    case 0: // if the user selected #6, Exit the Application.
                        System.out.println("---------------------------------------------------------------------");
                        System.out.println("Exiting the SORSU Enrollment Management System ...");
                        System.exit(0);
                        break;

                    default:
                        break;
                }
            }

        }

    }
}
