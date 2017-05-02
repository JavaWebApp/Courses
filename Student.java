package CourseModel;

import java.util.ArrayList;

/**
 * Created by TheEndl on 01.05.2017.
 */
public class Student {
    public String name;
    public String address;
    public String phone;
    public String mail;
    public Integer recordBookNumber;
    public float studyLevel;

    public Student(String name, String address, String phone, String mail, Integer recordBookNumber) {
       /* Средняя успеваемость на старте равно нулю. */

        this.name = name;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
        this.recordBookNumber = recordBookNumber;
        this.studyLevel = 0;

        /*Study study = new Study();
        study.setRandomMarks();*/

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getRecordBookNumber() {
        return recordBookNumber;
    }

    public void setRecordBookNumber(Integer recordBookNumber) {
        this.recordBookNumber = recordBookNumber;
    }

    public float getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(float studyLevel) {

       this.studyLevel = studyLevel;

    }

    // Получить список прослушанных курсов
    public void test(Student student)
    {

    }
    public static void main(String[] args) {

        // Добавляем 3 студентов

        Student student1 = new Student("John", "Moscow", "+79780537896", "John@gmail.com", 1);
        Student student2 = new Student("Tomas", "Sevastopol", "+79787585496", "Tomas@gmail.com", 2);
        Student student3 = new Student("Anna", "Simferopol", "+79781793456", "Anna@gmail.com", 3);

        // Добавляем 1 курс

        Course math = new Course("Математика", 1, 1000);
        Course phys = new Course("Физика", 2, 1200);

        // Записываем на курсы студентов

        math.addStudent(student1);
        math.addStudent(student2);

        phys.addStudent(student1);
        phys.addStudent(student2);

        // Студенты проходят курсы, получают оценки
        Study study1 = new Study();


        study1.setMarkForStudent(student1);
        study1.setMarkForStudent(student1);
        study1.setMarkForStudent(student1);

        //Получим средние баллы студентов
        study1.getMiddleGrade(student1);


        // Получаем списки студентов по курсу.
        math.getStudentsList();
        // Добавим профессора к курсу.
        Teacher mathTeacher = new Teacher("Andrew", "London", "+0123456789", 500.0F);





    }
}
