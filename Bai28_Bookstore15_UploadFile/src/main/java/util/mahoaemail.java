package util;

public class mahoaemail {
	public static String maHoaSao(String email) {
		String username = email.substring(0, 10); // Lấy 6 ký tự đầu
		String domain = email.substring(email.indexOf('@')); // Lấy phần sau ký tự '@'
		String maskedUsername = username + "********";
		String maskedEmail = maskedUsername + domain;
		return maskedEmail;
	}
}
