package db_proj;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;
public class my_mysql {

public  String[][] my_db_select(String queryBuh, int colLen) {
////////////
String[][] data = new String[8][colLen]; // [rows][columns]

try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/dbproject","root","Kirpow3");  
	Statement st=con.createStatement();  
	ResultSet rs=st.executeQuery(queryBuh); 
	
// Looping to store result in returning array data // 
	int i=0;
	while(rs.next())  {
	 for(int j=0;j<colLen;j++) {
	 //System.out.print(rs.getString(j+1));
	 data[i][j]=rs.getString(j+1);
	 }
	 //System.out.println();
	 i=i+1;
	}

con.close();  
}catch(Exception e){ System.out.println(e);} 
//////////////////////////////

return data;
	}
}
	