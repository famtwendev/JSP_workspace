package util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class JDBCUtil {
	public static Connection getConnection() {
		Connection c = null;

		try {
			// Đăng ký MySQL Driver với DriverManager
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());

			// Các thông số
			String url = "jdbc:mySQL://localhost:3307/mywebsite";
			String username = "root";
			String password = "admin";

			// Tạo kết nối
			c = DriverManager.getConnection(url, username, password);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

	public static void closeConnection(Connection c) {
		try {
			if (c != null) {
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void printInfo(Connection c) {
		try {
			if (c != null) {
				DatabaseMetaData mtdt = c.getMetaData();
				System.out.println(mtdt.getDatabaseProductName());
				System.out.println(mtdt.getDatabaseProductVersion());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    public static void main(String[] args) {
        // Lấy kết nối từ JDBCUtil
        Connection connection = JDBCUtil.getConnection();

        if (connection != null) {
            System.out.println("Kết nối thành công!");
            // In thông tin về cơ sở dữ liệu
            JDBCUtil.printInfo(connection);
            // Đóng kết nối sau khi sử dụng
            JDBCUtil.closeConnection(connection);
        } else {
            System.out.println("Không thể kết nối đến cơ sở dữ liệu.");
        }
    }
}
