package database;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.TheLoai;
import util.JDBCUtil;

public class TheLoaiDAO implements DAOInterface<TheLoai>{
	@Override
	public ArrayList<TheLoai> selectAll() {
		ArrayList<TheLoai> ketQua = new ArrayList<TheLoai>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM theloai";
			PreparedStatement st = con.prepareStatement(sql);
			
			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();
			
			// Bước 4:
			while(rs.next()) {
				String maTheLoai = rs.getString("matheLoai");
				String tenTheLoai = rs.getString("tentheloai");
				
				TheLoai tl = new TheLoai(maTheLoai, tenTheLoai);
				ketQua.add(tl);
			}
			
			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public TheLoai selectById(TheLoai t) {
		TheLoai ketQua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM theloai WHERE matheloai=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaTheLoai());
			
			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();
			
			// Bước 4:
			while(rs.next()) {
				String maTheLoai = rs.getString("matheloai");
				String tenTheLoai = rs.getString("tentheloai");
				
				ketQua = new TheLoai(maTheLoai, tenTheLoai);
				break;
			}
			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}


	@Override
	public int insert(TheLoai t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "INSERT INTO theloai (matheloai, tentheloai) "+
					" VALUES (?,?)";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaTheLoai());
			st.setString(2, t.getTenTheLoai());
		
			
			// Bước 3: thực thi câu lệnh SQLA
			ketQua = st.executeUpdate();
			
			// Bước 4:
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Có "+ ketQua+" dòng bị thay đổi!");
			
			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int insertAll(ArrayList<TheLoai> arr) {
		int dem = 0;
		for (TheLoai theloai : arr) {
			dem+=this.insert(theloai);
		}
		return dem;
	}

	@Override
	public int delete(TheLoai t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "DELETE from theloai "+
					 " WHERE matheloai=?";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaTheLoai());
			
			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ketQua = st.executeUpdate();
			
			// Bước 4:
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Có "+ ketQua+" dòng bị thay đổi!");
			
			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}

	@Override
	public int deleteAll(ArrayList<TheLoai> arr) {
		int dem = 0;
		for (TheLoai theloai : arr) {
			dem+=this.delete(theloai);
		}
		return dem;
	}

	@Override
	public int update(TheLoai t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "UPDATE theloai "+
					 " SET " +
					 " tentheloai=?"+
					 " WHERE maTheLoai=?";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getTenTheLoai());
			st.setString(2, t.getMaTheLoai());
			// Bước 3: thực thi câu lệnh SQL

			System.out.println(sql);
			ketQua = st.executeUpdate();
			
			// Bước 4:
			System.out.println("Bạn đã thực thi: "+ sql);
			System.out.println("Có "+ ketQua+" dòng bị thay đổi!");
			
			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ketQua;
	}
	
/*
	
	public static void main(String[] args) {
		TheLoaiDAO tgd = new TheLoaiDAO();
		ArrayList<TheLoai> kq = tgd.selectAll();
		for (TheLoai TheLoai : kq) {
			System.out.println(TheLoai.toString());
		}
		
		
//		TheLoai tg = tgd.selectById(new TheLoai("CT", "Chính trị"));
//		System.out.println(tg);
		
		
//		TheLoai tg_new = new TheLoai("IT", "Công nghệ thông tin");
//		tgd.insert(tg_new);
		
//		TheLoai tg_new = new TheLoai("IT", "Công nghệ thông tin");
//		tgd.delete(tg_new);
		
//		
//		TheLoai tg = tgd.selectById(new TheLoai("TT", "Trinh thám"));
//		System.out.println(tg);
//		tg.setTenTheLoai("Trinh Thám");
//		
//		tgd.update(tg);
	}
*/
}