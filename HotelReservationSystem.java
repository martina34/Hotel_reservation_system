/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation.system;

import java.sql.*;
import java.util.Scanner;

/**
 *
 * @author Michael Adel
 */
public class HotelReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (Exception e) {
            e.printStackTrace();

        }

        Connection c;
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3388/hotel", "root", "");
            System.out.println("connected");

        Scanner input = new Scanner(System.in);
        // to add new employee
            System.out.print("Enter employee data\n");
            String Name = input.next();
            int Ssn = input.nextInt();
            String Phone = input.next();
            String Address = input.next();
            double Salary = input.nextDouble();
            String sql = "insert into employee(name,ssn,adress,phone,salary)values('" + Name + "','" + Ssn + "','" + Phone + "','" + Address + "','" + Salary + "')";

            
           Statement st = c.createStatement();
                 //  String sql2 = "insert into employee(name,ssn,adress,phone,salary)values('"+name2+"','"+ssn2+"','"+phone2+"','"+address2+"','"+salary2+"')";

       st.executeUpdate(sql);
//         st.executeUpdate(sql2);*/
 
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
