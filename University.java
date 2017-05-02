package CourseModel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.ietf.jgss.GSSName;

/**
 * Created by TheEndl on 02.05.2017.
 */
public class University {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args) {
        // Добавляем студента
        Student student1 = new Student("John", "Moscow", "+79780537896", "John@gmail.com", 1);

        // Добавляем 2 курса

        Course mathCourse = new Course("Математика", 1, 1000);
        Course phys = new Course("Физика", 2, 1200);

        // Записываем на курсы студента

        mathCourse.addStudent(student1);
        phys.addStudent(student1);

        // Студент проходит курс, получает оценки
        Study firstCourse = new Study();

        firstCourse.setMarkForStudent(student1);
        firstCourse.setMarkForStudent(student1);
        firstCourse.setMarkForStudent(student1);

        //Получим средний балл студента
        firstCourse.getMiddleGrade(student1);

        // Получаем списки студентов по курсам.
        mathCourse.getStudentsList();


        // Добавим профессора к курсу по математике
        Teacher mathTeacher = new Teacher("Andrew", "London", "+0123456789", 500.0F);


        // Сериализуем объекты модели 'CourseModel' в JSON
        String jsonStudent1 = GSON.toJson(student1);
        String jsonFirstCourse = GSON.toJson(firstCourse);
        String jsonMathTeacher = GSON.toJson(mathTeacher);
        String jsonMathCourse = GSON.toJson(mathCourse);

        System.out.println("Объект 'Student' в формате JSON\n" + jsonStudent1);
        System.out.println("Объект 'Study' в формате JSON\n" + jsonFirstCourse);
        System.out.println("Объект 'Course' в формате JSON\n" + jsonMathCourse);
        System.out.println("Объект 'Teacher' в формате JSON\n" + jsonMathTeacher);



        // Десериализация объектов модели 'CourseModel' из JSON

        Student student1FromJSON = GSON.fromJson(jsonStudent1, Student.class);
        Study firstCourseFromJSON = GSON.fromJson(jsonFirstCourse, Study.class);
        Course mathCourseFromJSON = GSON.fromJson(jsonMathCourse, Course.class);
        Teacher mathTeacherFromJSON = GSON.fromJson(jsonMathTeacher, Teacher.class);




    }

}
