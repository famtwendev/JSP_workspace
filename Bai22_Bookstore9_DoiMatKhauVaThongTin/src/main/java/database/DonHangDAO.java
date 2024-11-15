
package database;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ChiTietDonHang;
import model.DonHang;
import model.KhachHang;
import util.JDBCUtil;

public class DonHangDAO implements DAOInterface<DonHang> {

	@Override
	public ArrayList<DonHang> selectAll() {
		ArrayList<DonHang> ketQua = new ArrayList<DonHang>();
		try {
			Connection con = JDBCUtil.getConnection();
			
			String sql = "SELECT * FROM donhang";			
			PreparedStatement st = con.prepareStatement(sql);
			
			ResultSet rs = st.executeQuery();
			
			while (rs.next()) {
				String maDonHang = rs.getString(1);
				String maKhachHang = rs.getString(2);
				String diachimuahang = rs.getString(3);
				String diaChiNhanHang = rs.getString(4);
				String trangThai = rs.getString(5);
				String hinhThucThanhToan = rs.getString(6);
				String trangThaiThanhToan = rs.getString(7);
				double soTienDaThanhToan = rs.getDouble(8);
				double soTienConThieu = rs.getDouble(9);
				Date ngayDatHang = rs.getDate(10);
				Date ngayGiaoHang = rs.getDate(11);
	
				KhachHang khachHang = (new KhachHangDAO().selectById(new KhachHang(maKhachHang,"","","","","","","",null,"","",false)));
				
				DonHang dh = new DonHang(maDonHang, khachHang, diachimuahang, diaChiNhanHang, trangThai, hinhThucThanhToan, trangThaiThanhToan, soTienDaThanhToan, soTienConThieu, ngayDatHang, ngayGiaoHang);

				ketQua.add(dh);
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public DonHang selectById(DonHang t) {
		DonHang ketQua = null;
		Connection con = JDBCUtil.getConnection();
		String sql = "SELECT * FROM donhang WHERE madonhang = ?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaDonHang());
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				String maDonHang = rs.getString(1);
				String maKhachHang = rs.getString(2);
				String diachimuahang = rs.getString(3);
				String diaChiNhanHang = rs.getString(4);
				String trangThai = rs.getString(5);
				String hinhThucThanhToan = rs.getString(6);
				String trangThaiThanhToan = rs.getString(7);
				double soTienDaThanhToan = rs.getDouble(8);
				double soTienConThieu = rs.getDouble(9);
				Date ngayDatHang = rs.getDate(10);
				Date ngayGiaoHang = rs.getDate(11);

				KhachHang kh1 = new KhachHang();
				kh1.setMaKhachHang(maKhachHang);
				
				KhachHang khachHang = new KhachHangDAO().selectById(kh1);
				
				DonHang dh = new DonHang(maDonHang, khachHang, diachimuahang, diaChiNhanHang, trangThai, hinhThucThanhToan, trangThaiThanhToan, soTienDaThanhToan, soTienConThieu, ngayDatHang, ngayGiaoHang);

				ketQua = dh;
			}
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public int insert(DonHang t) {
		int kq = 0;
		Connection con = JDBCUtil.getConnection();
		String sql = "INSERT INTO donhang(madonhang, makhachhang, diachimuahang, diachinhanhang, trangthai, thanhtoan,trangthaithanhtoan ,tienthanhtoan, tienconthieu,ngaydathang,ngaygiaohang)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaDonHang());
			st.setString(2, t.getKhachHang().getMaKhachHang());
			st.setString(3, t.getDiaChiMuaHang());
			st.setString(4, t.getDiaChiNhanHang());
			st.setString(5, t.getTrangThai());
			st.setString(6, t.getHinhThucThanhToan());
			st.setString(7, t.getTrangThaiThanhToan());
			st.setDouble(8, t.getSoTienDaThanhToan());
			st.setDouble(9, t.getSoTienConThieu());
			st.setDate(10, t.getNgayDatHang());
			st.setDate(11, t.getNgayGiaoHang());

			kq = st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public int insertAll(ArrayList<DonHang> arr) {
		int kq = 0;
		for (DonHang donHang : arr) {
			kq += this.insert(donHang);
		}
		return kq;
	}

	@Override
	public int delete(DonHang t) {
		int kq = 0;
		Connection con = JDBCUtil.getConnection();
		String sql = "DELETE FROM donhang WHERE madonhang = ?";
		try {
			if (this.selectById(t) != null) {
				 // Viet code xoa tat ca chi tiet don hang co ma don hang t.getMaDonHang()
			    String sqlChiTiet = "DELETE FROM chitietdonhang WHERE madonhang = ?";
			    PreparedStatement stChiTiet = con.prepareStatement(sqlChiTiet);
			    stChiTiet.setString(1, t.getMaDonHang());
			    int kqChiTiet = stChiTiet.executeUpdate();
			    // Check if deletion of chi tiet don hang was successful
			    if (kqChiTiet > 0) {
			        System.out.println("Deleted all chi tiet don hang successfully for ma don hang: " + t.getMaDonHang());
			    } else {
			        System.out.println("No chi tiet don hang found for ma don hang: " + t.getMaDonHang());
			    }
			}
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaDonHang());
			kq = st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return kq;
	}

	@Override
	public int deleteAll(ArrayList<DonHang> arr) {
		int kq = 0;
		for (DonHang t : arr) {
			kq += this.delete(t);
		}
		return kq;
	}

	@Override
	public int update(DonHang t) {
		int kq = 0;
		Connection con = JDBCUtil.getConnection();

		String sql = "UPDATE donhang" + " SET " + "makhachhang=?" + ", diachimuahang=?" + ",diachinhanhang=?"
				+ ",trangthai=?" + ",thanhtoan=?"+ ",trangthaithanhtoan=?" + ",tienthanhtoan=?" + ",tienconthieu=?" + ",ngaydathang=?"
				+ ",ngaygiaohang=?" + " WHERE madonhang=?";
		try {
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaDonHang());
			st.setString(2, t.getKhachHang().getMaKhachHang());
			st.setString(3, t.getDiaChiMuaHang());
			st.setString(4, t.getDiaChiNhanHang());
			st.setString(5, t.getTrangThai());
			st.setString(6, t.getHinhThucThanhToan());
			st.setString(7, t.getTrangThaiThanhToan());
			st.setDouble(8, t.getSoTienDaThanhToan());
			st.setDouble(9, t.getSoTienConThieu());
			st.setDate(10, t.getNgayDatHang());
			st.setDate(11, t.getNgayGiaoHang());

			kq = st.executeUpdate();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return kq;
	}
		
	private static void showDHDao(DonHangDAO dhd) {
		ArrayList<DonHang> dh = dhd.selectAll();
		for(DonHang dhh:dh)
		{
			System.out.println(dhh);
		}
	}
	
/*
//	public static void main(String[] args) {
//		DonHangDAO dhd = new DonHangDAO();
//		showDHDao(dhd);
		
//		KhachHang khachHang = new KhachHang();
//		khachHang.setMaKhachHang("KH6");
//		DonHang dh1 = new DonHang("DH6",khachHang,"Ba Ria", "Vung Tau","da giao", "tien mat", "thanh cong",1234000,0,new Date(2023-1900,10,3),new Date(2023-1900,10,10));
//		dhd.insert(dh1);
//		showDHDao(dhd);
		
		
//		DonHang temp = new DonHang();
//		temp.setMaDonHang("DH6");
//		dhd.delete(temp);
//		dhd.selectAll();
//		showDHDao(dhd);

		
		
	}
*/
}