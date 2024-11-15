package database;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.SanPham;
import model.TacGia;
import model.TheLoai;
import util.JDBCUtil;

public class SanPhamDAO implements DAOInterface<SanPham>{
	@Override
	public ArrayList<SanPham> selectAll() {
		ArrayList<SanPham> ketQua = new ArrayList<SanPham>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM sanpham";
			PreparedStatement st = con.prepareStatement(sql);
			
			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();
			
			// Bước 4:
			while(rs.next()) {
				String maSanPham = rs.getString("masanpham");
				String tenSanPham = rs.getString("tensanpham");
				String maTacGia = rs.getString("matacgia");
				int namXuatBan = rs.getInt("namxuatban");
				double giaNhap = rs.getDouble("gianhap");
				double giaGoc = rs.getDouble("giagoc");
				double giaBan = rs.getDouble("giaban");
				double soLuong = rs.getDouble("soluong");
				String maTheLoai = rs.getString("matheloai");
				String ngonNgu = rs.getString("ngonngu");
				String moTa = rs.getString("mota");
				
				TacGia tacGia = (new TacGiaDAO().selectById(new TacGia(maTacGia, "", null, "")));
				TheLoai theLoai = (new TheLoaiDAO().selectById(new TheLoai(maTheLoai, "")));

				SanPham sp = new SanPham(maSanPham, tenSanPham, tacGia, namXuatBan, giaNhap, giaGoc, giaBan, soLuong,
						theLoai, ngonNgu, moTa);
				ketQua.add(sp);
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
	public SanPham selectById(SanPham t) {
		SanPham ketQua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM sanpham WHERE masanpham=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaSanPham());
			
			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();
			
			// Bước 4:
			while(rs.next()) {
				String maSanPham = rs.getString("masanpham");
				String tenSanPham = rs.getString("tensanpham");
				String maTacGia = rs.getString("matacgia");
				int namXuatBan = rs.getInt("namxuatban");
				double giaNhap = rs.getDouble("gianhap");
				double giaGoc = rs.getDouble("giagoc");
				double giaBan = rs.getDouble("giaban");
				double soLuong = rs.getDouble("soluong");
				String maTheLoai = rs.getString("matheloai");
				String ngonNgu = rs.getString("ngonngu");
				String moTa = rs.getString("mota");
				
				TacGia tacGia = (new TacGiaDAO().selectById(new TacGia(maTacGia, "", null, "")));
				TheLoai theLoai = (new TheLoaiDAO().selectById(new TheLoai(maTheLoai, "")));

				
				ketQua = new SanPham(maSanPham, tenSanPham, tacGia, namXuatBan, giaNhap, giaGoc, giaBan, soLuong,
						theLoai, ngonNgu, moTa);
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
	public int insert(SanPham t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "INSERT INTO sanpham (masanpham, tensanpham, matacgia, namxuatban, gianhap, giagoc, giaban, soluong, matheloai, ngonngu, mota) "+
					" VALUES (?,?,?,?,?,?,?,?,?,?,?)";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaSanPham());
			st.setString(2, t.getTenSanPham());
			st.setString(3, t.getTacGia().getMaTacGia());
			st.setInt(4, t.getNamXuatBan());
			st.setDouble(5, t.getGiaNhap());
			st.setDouble(6, t.getGiaGoc());
			st.setDouble(7, t.getGiaBan());
			st.setDouble(8, t.getSoLuong());
			st.setString(9, t.getTheLoai().getMaTheLoai());
			st.setString(10, t.getNgonNgu());
			st.setString(11, t.getMoTa());
			
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
	public int insertAll(ArrayList<SanPham> arr) {
		int dem = 0;
		for (SanPham sanpham : arr) {
			dem+=this.insert(sanpham);
		}
		return dem;
	}

	@Override
	public int delete(SanPham t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "DELETE from sanpham "+
					 " WHERE masanpham=?";
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaSanPham());
			
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
	public int deleteAll(ArrayList<SanPham> arr) {
		int dem = 0;
		for (SanPham sanpham : arr) {
			dem+=this.delete(sanpham);
		}
		return dem;
	}

	@Override
	public int update(SanPham t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();
			
			// Bước 2: tạo ra đối tượng statement
			String sql = "UPDATE sanpham "+
					 " SET " +
					 " tensanpham=?"+
					 ", matacgia=?"+
					 ", namxuatban=?"+
					 ", gianhap=?"+
					 ", giagoc=?"+
					 ", giaban=?"+
					 ", soluong=?"+
					 ", matheloai=?"+
					 ", ngonngu=?"+
					 ", mota=?"+
					 " WHERE masanpham=?";
				
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getTenSanPham());
			st.setString(2, t.getTacGia().getMaTacGia());
			st.setInt(3, t.getNamXuatBan());
			st.setDouble(4, t.getGiaNhap());
			st.setDouble(5, t.getGiaGoc());
			st.setDouble(6, t.getGiaBan());
			st.setDouble(7, t.getSoLuong());
			st.setString(8, t.getTheLoai().getMaTheLoai());
			st.setString(9, t.getNgonNgu());
			st.setString(10, t.getMoTa());
			st.setString(11, t.getMaSanPham());
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
		SanPhamDAO tgd = new SanPhamDAO();
		ArrayList<SanPham> kq = tgd.selectAll();
		for (SanPham sanpham : kq) {
			System.out.println(sanpham.toString());
		}
		
		
//		sanpham tg = tgd.selectById(new sanpham("TG1", "", null, ""));
//		System.out.println(tg);
		
		
//		sanpham tg_new = new sanpham("TG10", "David", new Date(2000-1900, 10, 15), "");
//		tgd.insert(tg_new);
		
//		sanpham tg_new = new sanpham("TG10", "David", new Date(2000-1900, 10, 15), "");
//		tgd.delete(tg_new);
		
//		
//		sanpham tg = tgd.selectById(new sanpham("TG1", "", null, ""));
//		System.out.println(tg);
//		tg.setTieuSu("TIỂU SỬ ĐÃ BỊ THAY ĐỔI");
//		
//		tgd.update(tg);
	}
*/
}