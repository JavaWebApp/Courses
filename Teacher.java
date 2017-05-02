package CourseModel;

/**
 * Created by TheEndl on 01.05.2017.
 */
public class Teacher {
    private String name;
    private String address;
    private String phone;
    private Float payment;

    public Teacher(String name, String address, String phone, Float payment) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.payment = payment;
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

    public Float getPayment() {
        return payment;
    }

    public void setPayment(Float payment) {
        this.payment = payment;
    }
}
