import java.sql.*;
import java.util.ArrayList;

public class DBConnector {
	
	public static void main(String args[]){
		ArrayList<Product> product = new ArrayList<>();
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/webshop", "root", "webshop");
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery("Select * from product");
			while(rs.next()){
					Product temp = new Product(rs.getInt("idProduct"), rs.getString("ProductName"), rs.getInt("Price"), rs.getString("Description"));
					product.add(temp);
					System.out.println(temp.toString());
				}
			}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
