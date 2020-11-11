package net.codejava.sql;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class JavaConnect2SQL {

	public static void main(String[] args) {
		String url ="jdbc:sqlserver://DESKTOP-OIGOK3I\\ZAHEERSQL;databaseName=EMPLOYEE";
		String user = "sa";
		String password = "123";
		try {
		Connection connection = (Connection) DriverManager.getConnection(url,user,password);
		System.out.println("CONNECTED TO MICROSOFT SQL ERROR");
		} catch(SQLException e) {
			System.out.println("THERE'S AN ERROR:");
			e.printStackTrace();
		}

	}

}
