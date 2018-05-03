import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ener Number Between 1 et 5");
		int numb = sc.nextInt();
		String strNumber = "";
		switch (numb){
		case 1:
			strNumber = "one";break;
		case 2:
			strNumber ="tow";break;
		case 3:
			strNumber ="thre";break;
		case 4:
			strNumber ="four";break;
		case 5:
			strNumber ="five";break;
		default:
			strNumber ="other";break;
		}
		System.out.println(strNumber);
	}

}
