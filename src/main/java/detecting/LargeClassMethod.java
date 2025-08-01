package main.src.main.java.detecting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LargeClassMethod {

    // Fields related to students
    private final Map<Integer, String> studentNames;
    // Fields related to teachers
    private final List<String> teacherNames;
    // Fields related to courses
    private final Map<Integer, String> courseNames;


    // Constructor
    public TestLargeClassMethod() {
        studentNames = new HashMap<>();
        teacherNames = new ArrayList<>();
        courseNames = new HashMap<>();
    }

    // Methods for managing students
    public void addStudent(int id, String name) {
        studentNames.put(id, name);
    }

    public void assignGrade(int studentId, double grade) {
        studentGrades.put(studentId, grade);
    }

    public void enrollStudentInCourse(int studentId, int courseId) {
        studentCourses.computeIfAbsent(studentId, k -> new ArrayList<>()).add(courseId);
    }

    // Methods for managing teachers
    public void addTeacher(String name) {
        teacherNames.add(name);
    }

    public void assignSubjectToTeacher(String teacherName, String subject) {
        teacherSubjects.put(teacherName, subject);
    }

    // Methods for managing courses
    public void addCourse(int courseId, String courseName, int credits) {
        courseNames.put(courseId, courseName);
        courseCredits.put(courseId, credits);
    }

    public void assignTeacherToCourse(int courseId, String teacherName) {
        courseTeachers.put(courseId, teacherName);
    }

    public void assignStudentToCourse(int courseId, int studentId) {
        courseStudents.computeIfAbsent(courseId, k -> new ArrayList<>()).add(studentId);
    }

    // Methods for getting information
    public String getStudentName(int studentId) {
        return studentNames.get(studentId);
    }

    public double getStudentGrade(int studentId) {
        return studentGrades.get(studentId);
    }
}