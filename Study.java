package CourseModel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by TheEndl on 01.05.2017.
 */

    /* Класс 'Study' - прохождение курса.*/

public class Study {
    @SerializedName("Оценки студента")
    private ArrayList<Integer> marks = new ArrayList<>();

    // Получить средний балл
    public void getMiddleGrade(Student student)
    {
        float sum = 0;
        float middle = 0;
        for (int i=0; i < marks.size(); i++)
        {
            sum = sum + marks.get(i);
        }
        middle = sum / marks.size();
        if (middle > 0)
            student.setStudyLevel(middle);
        else System.out.println("Студент" + student + " еще не получал оценок");

    }

    // Получить 10 случайных оценок в диапазоне от 0 до 5
   /* public void setRandomMarks()
    {

            Integer mark=0;

            Random randomGenerator = new Random();

            for (int idx = 1; idx <= 10; ++idx){
                int randomInt = randomGenerator.nextInt(5);

                marks.add(randomInt);
            }

    }*/

   // Получить случайную оценку
    public void setMarkForStudent(Student student)
    {

        Integer mark=0;
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(5);
        marks.add(randomInt);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Study study = (Study) o;

        return marks.equals(study.marks);
    }

    @Override
    public int hashCode() {
        return marks.hashCode();
    }

    @Override
    public String toString() {
        return "Study{" +
                "marks=" + marks +
                '}';
    }
}
