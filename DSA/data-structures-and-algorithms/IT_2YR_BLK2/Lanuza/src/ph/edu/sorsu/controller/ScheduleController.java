package ph.edu.sorsu.controller;

import ph.edu.sorsu.dao.CourseDAO;
import ph.edu.sorsu.dao.ScheduleDAO;
import ph.edu.sorsu.dao.SubjectDAO;
import ph.edu.sorsu.dao.TeacherDAO;

import ph.edu.sorsu.dao.impl.CourseDAOImpl;
import ph.edu.sorsu.dao.impl.ScheduleDAOImpl;
import ph.edu.sorsu.dao.impl.SubjectDAOImpl;
import ph.edu.sorsu.dao.impl.TeacherDAOImpl;

import ph.edu.sorsu.entity.Course;
import ph.edu.sorsu.entity.Schedule;
import ph.edu.sorsu.entity.Teacher;
import ph.edu.sorsu.entity.Subject;

import java.util.List;
import java.util.Scanner;

public class ScheduleController {
    private ScheduleDAO<Schedule> scheduleDAO;
    private SubjectDAO<Subject> subjectDAO;
    private TeacherDAO<Teacher> teacherDAO;
    private CourseDAO<Course> courseDAO;
    private Scanner scanner;

    public ScheduleController(Scanner scanner) {
        this.scheduleDAO = new ScheduleDAOImpl();
        this.subjectDAO = new SubjectDAOImpl();
        this.teacherDAO = new TeacherDAOImpl();
        this.courseDAO = new CourseDAOImpl();
        this.scanner = scanner;
    }

    public void createSchedule() {// method to create a new schedule
        System.out.println("---------------------------------------------------------------------");
        System.out.println("FILL UP THE SCHEDULE FORM.");

        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        // THIS IS THE INSTANCE OF THE CLASS SUBJECT
        System.out.println("Subject Informations: ");
        System.out.print("Subject Id: ");
        Long subjectId = Long.parseLong(scanner.nextLine());

        System.out.print("Subject Code: ");
        String subjectCode = scanner.nextLine();

        System.out.print("Subject Description: ");
        String subjectDescription = scanner.nextLine();

        System.out.print("Subject Number of Units: ");
        Long subjectNumberOfUnits = Long.parseLong(scanner.nextLine());

        System.out.println("Course Informations");
        System.out.print("Course Id: ");
        Long courseId = Long.parseLong(scanner.nextLine());

        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Course Description: ");
        String courseDescription = scanner.nextLine();

        // THIS IS THE INSTANCE OF CLASS TEACHER
        System.out.println("Teacher Infomation: ");
        System.out.print("Teacher Id: ");
        Long teacherId = Long.parseLong(scanner.nextLine());

        System.out.print("Teacher Rank:");
        String teacherRank = scanner.nextLine();

        System.out.print("Teacher FullName: ");
        String teacherFullName = scanner.nextLine();

        System.out.print("Teacher Contact Number: (Omit +63) ");
        Long teacherContactNumber = Long.parseLong(scanner.nextLine());

        System.out.print("Teacher Email Address: ");
        String teacherEmailAddress = scanner.nextLine();

        System.out.print("Time Start: ");
        String timeStart = scanner.nextLine();

        System.out.print("Time Ends: ");
        String timeEnds = scanner.nextLine();

        System.out.print("Day of the Week: ");
        String dayOfTheWeek = scanner.nextLine();

        // calling the methods to set the attributes from user inputs.
        Subject subject = new Subject();
        subject.setId(subjectId);
        subject.setCode(subjectCode);
        subject.setDescription(subjectDescription);
        subject.setNumberOfUnits(subjectNumberOfUnits);

        Course course = new Course();
        course.setId(courseId);
        course.setCode(courseCode);
        course.setDescription(courseDescription);
        subject.setCourse(course);

        Teacher teacher = new Teacher();
        teacher.setId(teacherId);
        teacher.setRank(teacherRank);
        teacher.setFullName(teacherFullName);
        teacher.setEmailAddress(teacherEmailAddress);
        teacher.setContactNumber(teacherContactNumber);
        teacher.setEmailAddress(teacherEmailAddress);

        Schedule schedule = new Schedule();
        schedule.setId(id);
        schedule.setTimeStart(timeStart);
        schedule.setTimeEnd(timeEnds);
        schedule.setDayOfTheWeek(dayOfTheWeek);
        schedule.setSubject(subject);
        schedule.setTeacher(teacher);

        scheduleDAO.create(schedule);
        subjectDAO.create(subject);
        courseDAO.create(course);
        teacherDAO.create(teacher);

        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getSchedule() { // method to get a schedule
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To get the schedule record, provide the index postion.");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());
        Schedule schedule = scheduleDAO.read(indexPositions);
        Subject subject = subjectDAO.read(indexPositions);
        Course course = courseDAO.read(indexPositions);
        Teacher teacher = teacherDAO.read(indexPositions);

        System.out.println("------------------------Schedule Information-------------------------");
        System.out.println("ID: " + schedule.getId());

        // getters of subject
        System.out.println("Subject Information in the Schedule:");
        System.out.println("Subject Id: " + subject.getId());
        System.out.println("Subject Code: " + subject.getCode());
        System.out.println("Subject Description: " + subject.getNumberOfUnits());
        System.out.println("Course Information in the Subject:");
        System.out.println("Course Id: " + course.getId());
        System.out.println("Course Code: " + course.getCode());
        System.out.println("Course Description: " + course.getDescription());

        // getters of Teacher
        System.out.println("Teacher Information in the Schedule:");
        System.out.println("Teacher Id: " + teacher.getId());
        System.out.println("Teacher Rank: " + teacher.getRank());
        System.out.println("Teacher FullName: " + teacher.getFullName());
        System.out.println("Teacher ContactNumber: (+63)" + teacher.getContactNumber());
        System.out.println("Teacher EmailAddress: " + teacher.getEmailAddress());

        System.out.println("First Name: " + schedule.getTimeStart());
        System.out.println("Middle Name: " + schedule.getTimeEnd());
        System.out.println("Last Name: " + schedule.getDayOfTheWeek());

        System.out.println("---------------------------------------------------------------------");
        System.out.println();

    }

    public void updateSchedule() { // to update a schedule
        System.out.println("---------------------------------------------------------------------");
        System.out.println("To update the schedule record, provide the index postion.");
        System.out.print("Index Position: ");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        Schedule schedule = scheduleDAO.read(indexPositions);
        Subject subject = subjectDAO.read(indexPositions);
        Course course = courseDAO.read(indexPositions);
        Teacher teacher = teacherDAO.read(indexPositions);

        System.out.println("------------------------Schedule Information-------------------------");
        System.out.println();
        System.out.println("ID: " + schedule.getId());

        // getters of subject
        System.out.println("Subject Information in the Schedule:");
        System.out.println("Subject Id: " + subject.getId());
        System.out.println("Subject Code: " + subject.getCode());
        System.out.println("Subject Description: " + subject.getNumberOfUnits());
        System.out.println("Course Information in the Subject:");
        System.out.println("Course Id: " + course.getId());
        System.out.println("Course Code: " + course.getCode());
        System.out.println("Course Description: " + course.getDescription());

        // getters of Teacher
        System.out.println("Teacher Information in the Schedule:");
        System.out.println("Teacher Id: " + teacher.getId());
        System.out.println("Teacher Rank: " + teacher.getRank());
        System.out.println("Teacher FullName: " + teacher.getFullName());
        System.out.println("Teacher ContactNumber: (+63)" + teacher.getContactNumber());
        System.out.println("Teacher EmailAddress: " + teacher.getEmailAddress());

        System.out.println("First Name: " + schedule.getTimeStart());
        System.out.println("Middle Name: " + schedule.getTimeEnd());
        System.out.println("Last Name: " + schedule.getDayOfTheWeek());

        System.out.println("---------------------------------------------------------------------");
        System.out.print("ID: ");
        Long id = Long.parseLong(scanner.nextLine());

        // THIS IS THE INSTANCE OF THE CLASS SUBJECT
        System.out.println("Subject Informations: ");
        System.out.print("Subject Id: ");
        Long subjectId = Long.parseLong(scanner.nextLine());

        System.out.print("Subject Code: ");
        String subjectCode = scanner.nextLine();

        System.out.print("Subject Description: ");
        String subjectDescription = scanner.nextLine();

        System.out.print("Subject NumberOfUnits: ");
        Long subjectNumberOfUnits = Long.parseLong(scanner.nextLine());

        System.out.println("Course Informations");
        System.out.print("Course Id: ");
        Long courseId = Long.parseLong(scanner.nextLine());

        System.out.print("Course Code: ");
        String courseCode = scanner.nextLine();

        System.out.print("Course Description: ");
        String courseDescription = scanner.nextLine();

        // THIS IS THE INSTANCE OF CLASS TEACHER
        System.out.println("Teacher Infomation: ");
        System.out.print("Teacher Id: ");
        Long teacherId = Long.parseLong(scanner.nextLine());

        System.out.print("Teacher Rank:");
        String teacherRank = scanner.nextLine();

        System.out.print("Teacher FullName: ");
        String teacherFullName = scanner.nextLine();

        System.out.print("Teacher ContactNumber: (Omit +63) ");
        Long teacherContactNumber = Long.parseLong(scanner.nextLine());

        System.out.print("Teacher EmailAddress: ");
        String teacherEmailAddress = scanner.nextLine();

        System.out.print("Time Start: ");
        String timeStart = scanner.nextLine();

        System.out.print("Time Ends: ");
        String timeEnds = scanner.nextLine();

        System.out.print("Day of the Week: ");
        String dayOfTheWeek = scanner.nextLine();

        // calling the methods to set the attributes from user inputs.
        subject.setId(subjectId);
        subject.setCode(subjectCode);
        subject.setDescription(subjectDescription);
        subject.setNumberOfUnits(subjectNumberOfUnits);

        course.setId(courseId);
        course.setCode(courseCode);
        course.setDescription(courseDescription);
        subject.setCourse(course);

        teacher.setId(teacherId);
        teacher.setRank(teacherRank);
        teacher.setFullName(teacherFullName);
        teacher.setEmailAddress(teacherEmailAddress);
        teacher.setContactNumber(teacherContactNumber);
        teacher.setEmailAddress(teacherEmailAddress);

        schedule.setId(id);
        schedule.setTimeStart(timeStart);
        schedule.setTimeEnd(timeEnds);
        schedule.setDayOfTheWeek(dayOfTheWeek);
        schedule.setSubject(subject);
        schedule.setTeacher(teacher);

        scheduleDAO.update(indexPositions, schedule);
        subjectDAO.update(indexPositions, subject);
        courseDAO.update(indexPositions, course);
        teacherDAO.update(indexPositions, teacher);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();

    }

    public void deleteSchedule() { // to delete a schedule
        System.out.println("---------------------------------------------------------------------");
        System.out.print("To delete a schedule, provide the index postion");
        int indexPositions = Integer.parseInt(scanner.nextLine());

        scheduleDAO.delete(indexPositions);
        subjectDAO.delete(indexPositions);
        courseDAO.delete(indexPositions);
        teacherDAO.delete(indexPositions);
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }

    public void getAllSchedule() {// to get all the schedule(s) in the list
        System.out.println("---------------------------------------------------------------------");
        List<Schedule> schedules = scheduleDAO.readAll();
        List<Subject> subjects = subjectDAO.readAll();
        List<Course> courses = courseDAO.readAll();
        List<Teacher> teachers = teacherDAO.readAll();
        System.out.println("--------------------------List of Schedules--------------------------");
        System.out.println(
                "ID,SUBJECT_ID,SUBJECT_CODE,SUBJECT_DESCRIPTION,SUBJECT_NUMBEROFUNITS,COURSE_ID,COURSE_CODE,COURSE_DESCRIPTION,TEACHER_ID,TEACHER_RANK,TEACHER_FULLNAME,TEACHER_CONTACTNUMBER,TEACHER_EMAILADDRESS,TIMESTART,TIMEEND,DAYOFTHEWEEK");
        // loop to get all the schedule(s) in the list based on their index position.
        for (int i = 0; i < schedules.size() & i < subjects.size() & i < courses.size() & i < teachers.size(); i++) {
            System.out.println(
                    schedules.get(i).getId() + "," + subjects.get(i).getId() + ","
                            + subjects.get(i).getCode() + "," + subjects.get(i).getDescription() + ","
                            + subjects.get(i).getNumberOfUnits() + "," + courses.get(i).getId() + ","
                            + courses.get(i).getCode() + "," + courses.get(i).getDescription() + ","
                            + teachers.get(i).getId() + "," + teachers.get(i).getRank() + ",(+63)"
                            + teachers.get(i).getFullName() + ","
                            + teachers.get(i).getContactNumber() + "," + teachers.get(i).getEmailAddress() + ","
                            + schedules.get(i).getTimeStart() + "," + schedules.get(i).getTimeEnd() + ","
                            + schedules.get(i).getDayOfTheWeek());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
    }
}