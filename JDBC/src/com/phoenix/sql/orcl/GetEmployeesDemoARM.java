package com.phoenix.sql.orcl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.phoenix.dbconfig.OracleConnection;

public class GetEmployeesDemoARM {

	public static void main(String[] args) {
		
		// try - with Clause
		try(Connection con = OracleConnection.getOracleConnection();) {
			
			
			String sql = "SELECT employee_id, first_name, salary FROM EMPLOYEES";
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int empId = rs.getInt(1);
				String firstName = rs.getString(2);
				float sal = rs.getFloat("salary");
				
				System.out.println("Emp Id : " + empId + "\t First Name : " + firstName + "\t Salary : " + sal);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 

	}

}
