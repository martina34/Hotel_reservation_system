package hotel.reservation.system;

public class Employee extends Person {

    double salary, bonus, deductions;
    String position;

   

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Employee() {
    }

    public Employee(double salary, double bonus, double deductions, String position, String name, String adress, String phone_number, int ssn, Gender gender) {
        super(name, adress, phone_number, ssn, gender);
        this.salary = salary;
        this.bonus = bonus;
        this.deductions = deductions;
        this.position = position;
    }

    
    
       public double calculate_salary() {
        return (salary + bonus) - deductions;
    }

    public void book_room(int room_number) {
        //Room Booking

    }
    
    
    
    

}
