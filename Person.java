/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Michael Adel
 */
enum Gender {
    male, female
};

public class Person {

    String name, adress, phone_number;
    int ssn;
    Gender gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Person() {
    }

    public Person(String name, String adress, String phone_number, int ssn, Gender gender) {
        this.name = name;
        this.adress = adress;
        this.phone_number = phone_number;
        this.ssn = ssn;
        this.gender = gender;
    }

    public static void Add() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("enter data\n");
            String Name = input.next();
            int Ssn = input.nextInt();
            String Phone = input.next();
            String Address = input.next();
            double Salary = input.nextDouble();
            String sql = "insert into employee(name,ssn,adress,phone,salary)values('" + Name + "','" + Ssn + "','" + Phone + "','" + Address + "','" + Salary + "')";
            Statement st = c.createStatement();
            int result = st.executeUpdate(sql);
            if (result == 1) {
                System.out.println("done");
            }
            try {
                int executeUpdate = st.executeUpdate(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

}
