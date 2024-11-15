package model;

import java.sql.Date;

public class DonHang {
	private String maDonHang;
	private String diaChiMuaHang;
	private String diaChiNhanHang;
	private String trangThai;
	private String trangThaiThanhToan;
	private String hinhThucThanhToan;
	private double soTienDaThanhToan;
	private Date ngayDatHang;
	private Date ngayGiaoHang;

	public DonHang(String maDonHang, String diaChiMuaHang, String diaChiNhanHang, String trangThai,
			String trangThaiThanhToan, String hinhThucThanhToan, double soTienDaThanhToan, Date ngayDatHang,
			Date ngayGiaoHang) {
		this.maDonHang = maDonHang;
		this.diaChiMuaHang = diaChiMuaHang;
		this.diaChiNhanHang = diaChiNhanHang;
		this.trangThai = trangThai;
		this.trangThaiThanhToan = trangThaiThanhToan;
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.soTienDaThanhToan = soTienDaThanhToan;
		this.ngayDatHang = ngayDatHang;
		this.ngayGiaoHang = ngayGiaoHang;
	}

	public DonHang() {
	}

	public String getMaDonHang() {
		return maDonHang;
	}

	public void setMaDonHang(String maDonHang) {
		this.maDonHang = maDonHang;
	}

	public String getDiaChiMuaHang() {
		return diaChiMuaHang;
	}

	public void setDiaChiMuaHang(String diaChiMuaHang) {
		this.diaChiMuaHang = diaChiMuaHang;
	}

	public String getDiaChiNhanHang() {
		return diaChiNhanHang;
	}

	public void setDiaChiNhanHang(String diaChiNhanHang) {
		this.diaChiNhanHang = diaChiNhanHang;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public String getTrangThaiThanhToan() {
		return trangThaiThanhToan;
	}

	public void setTrangThaiThanhToan(String trangThaiThanhToan) {
		this.trangThaiThanhToan = trangThaiThanhToan;
	}

	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}

	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}

	public double getSoTienDaThanhToan() {
		return soTienDaThanhToan;
	}

	public void setSoTienDaThanhToan(double soTienDaThanhToan) {
		this.soTienDaThanhToan = soTienDaThanhToan;
	}

	public Date getNgayDatHang() {
		return ngayDatHang;
	}

	public void setNgayDatHang(Date ngayDatHang) {
		this.ngayDatHang = ngayDatHang;
	}

	public Date getNgayGiaoHang() {
		return ngayGiaoHang;
	}

	public void setNgayGiaoHang(Date ngayGiaoHang) {
		this.ngayGiaoHang = ngayGiaoHang;
	}

}
