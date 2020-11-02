package assignment.database;

import java.sql.SQLException;

public class NewRecord {

	public static boolean insertRecord(String query1,String query2) {
		boolean inserted=false;
		int rowsEffected=0;
		try {
			rowsEffected=DBConnect.getStatement().executeUpdate(query1);
			if(rowsEffected==1) {//if data is inserted into employee relation then to be inserted into sub type
				DBConnect.getStatement().executeUpdate(query2);
				inserted=true;
			}
				
		} catch (SQLException e) {
			System.err.println("Err:Unable to Store Data to Database");
			e.printStackTrace();
			inserted=false;
		}
		finally{
			DBConnect.disconnect();
		}
		
		return inserted;//either true of false
	}
}
