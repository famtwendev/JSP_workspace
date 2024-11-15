package database;

import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import model.ChiTietDonHang;
import model.DonHang;

public class ChiTietDonHangDAO implements DAOInterface<ChiTietDonHang> {

	private ArrayList<ChiTietDonHang> data = new ArrayList<>();

	@Override
	public ArrayList<ChiTietDonHang> selectAll() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public ChiTietDonHang selectById(ChiTietDonHang t) {
		// TODO Auto-generated method stub
		for (ChiTietDonHang chiTietDonHang : data) {
			if (chiTietDonHang.equals(t)) {
				return chiTietDonHang;
			}
		}
		return null;
	}

	@Override
	public int insert(ChiTietDonHang t) {
		if (this.selectById(t) == null) {
			this.data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<ChiTietDonHang> arr) {

		int dem = 0;
		for (ChiTietDonHang chiTietDonHang : arr) {
			this.insert(chiTietDonHang);
		}
		return dem;
	}

	@Override
	public int delete(ChiTietDonHang t) {
		if (this.selectById(t) != null) {
			this.data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<ChiTietDonHang> arr) {
		int dem = 0;
		for (ChiTietDonHang chiTietDonHang : arr) {
			dem += this.delete(chiTietDonHang);
		}
		return dem;
	}
	
	public int deleteAll(DonHang dh) {
		int dem = 0;
		for (ChiTietDonHang chiTietDonHang : data) {
			if(chiTietDonHang.getDonHang().equals(dh))
			{
				this.delete(chiTietDonHang);
			}
		}
		return dem;
	}

	@Override
	public int update(ChiTietDonHang t) {
		if (this.selectById(t) != null) {
			this.data.remove(t);
			this.data.add(t);
			return 1;
		}
		return 0;
	}

}
