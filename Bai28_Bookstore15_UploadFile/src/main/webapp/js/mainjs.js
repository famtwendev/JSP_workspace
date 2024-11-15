/**
 * 
 */

// Gọi hàm kiểm tra dữ liệu khi tài liệu được tải hoàn toàn
document.addEventListener('DOMContentLoaded', function() {
    kiemTraDuLieu(); // Gọi hàm kiểm tra dữ liệu khi tài liệu được tải hoàn toàn

    // Gán sự kiện cho các phần tử HTML
    document.getElementById('tenDangNhap').addEventListener('keyup', kiemTraDuLieu);
    document.getElementById('matKhau').addEventListener('keyup', kiemTraDuLieu);
    document.getElementById('matKhauNhapLai').addEventListener('keyup', kiemTraDuLieu);
    document.getElementById('hoVaTen').addEventListener('keyup', kiemTraDuLieu);
    document.getElementById('gioiTinh').addEventListener('change', kiemTraDuLieu);
    document.getElementById('ngaySinh').addEventListener('change', kiemTraDuLieu);
    document.getElementById('diaChiNhanHang').addEventListener('keyup', kiemTraDuLieu);
    document.getElementById('dienThoai').addEventListener('keyup', kiemTraDuLieu);
    document.getElementById('email').addEventListener('keyup', kiemTraDuLieu);
    document.getElementById('dongYDieuKhoan').addEventListener('change', kiemTraDuLieu);
});

// Hàm kiểm tra dữ liệu
function kiemTraDuLieu() {
    // Kiểm tra dữ liệu và điều chỉnh thuộc tính disabled cho nút submit
    var tenDangNhap = document.getElementById('tenDangNhap').value;
    var matKhau = document.getElementById('matKhau').value;
    var matKhauNhapLai = document.getElementById('matKhauNhapLai').value;
    var hoVaTen = document.getElementById('hoVaTen').value;
    var gioiTinh = document.getElementById('gioiTinh').value;
    var ngaySinh = document.getElementById('ngaySinh').value;
    var diaChiNhanHang = document.getElementById('diaChiNhanHang').value;
    var dienThoai = document.getElementById('dienThoai').value;
    var email = document.getElementById('email').value;
    var dongYDieuKhoan = document.getElementById('dongYDieuKhoan').checked;
        

    if (tenDangNhap.trim() !== '' && matKhau.trim() !== '' && matKhauNhapLai.trim() !== '' &&
        hoVaTen.trim() !== '' && gioiTinh.trim() !== '' && ngaySinh.trim() !== '' &&
        diaChiNhanHang.trim() !== '' && dienThoai.trim() !== '' && email.trim() !== '' &&
        dongYDieuKhoan && kiemTraMatKhau()) {
        document.getElementById('submit').removeAttribute('disabled');
    } else {
        document.getElementById('submit').setAttribute('disabled', 'disabled');
    }
}


function kiemTraMatKhau() {
	matKhau = document.getElementById("matKhau").value;
	matKhauNhapLai = document.getElementById("matKhauNhapLai").value;
	if (matKhau != matKhauNhapLai) {
		document.getElementById("msg").textContent = "  Mật khẩu không khớp!";
		return false;
	} else {
		document.getElementById("msg").textContent = "";
		return true;
	}
}