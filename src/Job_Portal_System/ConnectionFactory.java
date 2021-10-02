/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Job_Portal_System;
import java.sql.*;
/**
 *
 * @author Biswajit Samanta
 */
public class ConnectionFactory {
    Connection cn=null;
public Connection getConn()
{
	try
	{
	Class.forName("com.mysql.jdbc.Driver");//REGISTER AND LOAD THE DRIVER
	cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jps","root","90936");
	
	}
	catch(ClassNotFoundException ce)
	{
		ce.printStackTrace();
	}
	catch(SQLException se)
	{
		se.printStackTrace();
	}
	return cn;
}
    
}
