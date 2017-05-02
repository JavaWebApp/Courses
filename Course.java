package CourseModel;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by TheEndl on 01.05.2017.
 */
public class Course {

    // При создании нового курса создается список студентов, которые слушают курс.

    public String courseName;
    public int courseNumber;
    public float courseCost;
    public static ArrayList<Student> studentsList = new ArrayList<>();

    public Course(String courseName, int courseNumber, float courseCost) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.courseCost = courseCost;


    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public float getCourseCost() {
        return courseCost;
    }

    public void setCourseCost(float courseCost) {
        this.courseCost = courseCost;
    }

    // Добавить нового студента на курс.
    public void addStudent(Student student)
    {
        studentsList.add(student);
    }
    // Удалить существующего студента из курса.
    public void deleteStudent(Student student)
    {
        studentsList.remove(student);
    }

    public void getStudentsList()
    {
        Iterator studentsIterator = studentsList.iterator();
        while (studentsIterator.hasNext())
        {
            Student student = (Student)studentsIterator.next();
            System.out.println("Имя студента: " + student.name + "\nНомер зачетной книжки " + student.getRecordBookNumber()
                    + "\ne-mail:" + student.mail + "\nСредняя успеваемость: " + student.studyLevel + "\n");
        }
    }
    public static boolean isContains(Student student)
    {
        if (studentsList.contains(student)) return true;
        else return false;

    }




}
