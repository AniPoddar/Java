import java.sql.*;
public class jdbcEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
try {
	//load Driver class for mysql db
	Class.forName("com.mysql.jdbc.Driver");
	// connection url for mysql
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/core", "root", "@niruddha" );
	//methods to execute queries with db
	Statement st = con.createStatement();
	
	ResultSet rs = st.executeQuery("select * from student");
	while(rs.next()) {
		System.out.println(rs.getInt(1)+ " " + rs.getString(2) + " " + rs.getInt(3));
		//getInt-> return column index of current row as int 
		//getString-> return column index of current row as string
	}
	con.close();

}
catch(Exception e) {
	System.out.println(e);
	
}
}
}