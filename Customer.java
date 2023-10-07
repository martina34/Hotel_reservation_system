package hotel.reservation.system;
import java.util.Date;

public class Customer extends Person {
    
    int room_number;
    String nationality;
    double bill;
    Date entery_date = new Date();
    Date leave_date = new Date();
    boolean check_in;

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getBill() {
        return bill;
    }

    public void setBill(double bill) {
        this.bill = bill;
    }

    public Date getEntery_date() {
        return entery_date;
    }

    public void setEntery_date(Date entery_date) {
        this.entery_date = entery_date;
    }

    public Date getLeave_date() {
        return leave_date;
    }

    public void setLeave_date(Date leave_date) {
        this.leave_date = leave_date;
    }

    public boolean isCheck_in() {
        return check_in;
    }

    public void setCheck_in(boolean check_in) {
        this.check_in = check_in;
    }

    public Customer() {
    }

    public Customer(int room_number, String nationality, double bill, boolean check_in, String name, String adress, String phone_number, int ssn, Gender gender) {
        super(name, adress, phone_number, ssn, gender);
        this.room_number = room_number;
        this.nationality = nationality;
        this.bill = bill;
        this.check_in = check_in;
    }

    
    
    
    
    
    
}
