package CourseModel;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by TheEndl on 01.05.2017.
 */
public class Student extends  University{
    @SerializedName("Имя студента")
    private String name;
    @SerializedName("Город")
    private String address;
    @SerializedName("Телефон")
    private String phone;
    @SerializedName("Эл. почта")
    private String mail;
    @SerializedName("Номер зачетки")
    private Integer recordBookNumber;
    @SerializedName("Средний балл")
    private float studyLevel;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (Float.compare(student.studyLevel, studyLevel) != 0) return false;
        if (!name.equals(student.name)) return false;
        if (!address.equals(student.address)) return false;
        if (!phone.equals(student.phone)) return false;
        if (!mail.equals(student.mail)) return false;
        return recordBookNumber.equals(student.recordBookNumber);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + mail.hashCode();
        result = 31 * result + recordBookNumber.hashCode();
        result = 31 * result + (studyLevel != +0.0f ? Float.floatToIntBits(studyLevel) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", mail='" + mail + '\'' +
                ", recordBookNumber=" + recordBookNumber +
                ", studyLevel=" + studyLevel +
                '}';
    }

    public static void main(String[] args) {







    }
}
