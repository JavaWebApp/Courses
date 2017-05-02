package CourseModel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by TheEndl on 01.05.2017.
 */

    /* Класс 'Course' - Курс*/
public class Course {

    // При создании нового курса создается список студентов, которые слушают курс.
    @SerializedName("Наименование курса")
    private String courseName;
    @SerializedName("Номер курса")
    private int courseNumber;
    @SerializedName("Стоимость курса")
    private float courseCost;
    @SerializedName("Список студентов на курсе")
    private static ArrayList<Student> studentsList = new ArrayList<>();

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
        }
    }
    public static boolean isContains(Student student)
    {
        if (studentsList.contains(student)) return true;
        else return false;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (courseNumber != course.courseNumber) return false;
        if (Float.compare(course.courseCost, courseCost) != 0) return false;
        return courseName.equals(course.courseName);
    }

    @Override
    public int hashCode() {
        int result = courseName.hashCode();
        result = 31 * result + courseNumber;
        result = 31 * result + (courseCost != +0.0f ? Float.floatToIntBits(courseCost) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseNumber=" + courseNumber +
                ", courseCost=" + courseCost +
                '}';
    }
}
