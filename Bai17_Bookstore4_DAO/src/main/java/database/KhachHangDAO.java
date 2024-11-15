package database;

import java.util.ArrayList;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {

	private ArrayList<KhachHang> data = new ArrayList<>();

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return this.data;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		for (KhachHang KhachHang : data) {
			if (KhachHang.equals(t)) {
				return KhachHang;
			}
		}
		return null;
	}

	@Override
	public int insert(KhachHang t) {
		if (this.selectById(t) == null) {
			this.data.add(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int insertAll(ArrayList<KhachHang> arr) {

		int dem = 0;
		for (KhachHang KhachHang : arr) {
			this.insert(KhachHang);
		}
		return dem;
	}

	@Override
	public int delete(KhachHang t) {
		if (this.selectById(t) != null) {
			this.data.remove(t);
			return 1;
		}
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<KhachHang> arr) {
		int dem = 0;
		for (KhachHang KhachHang : arr) {
			dem += this.delete(KhachHang);
		}
		return dem;
	}

	@Override
	public int update(KhachHang t) {
		if (this.selectById(t) != null) {
			this.data.remove(t);
			this.data.add(t);
			return 1;
		}
		return 0;
	}

}
