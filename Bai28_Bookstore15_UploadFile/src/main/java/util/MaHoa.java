package util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

import org.apache.tomcat.util.codec.binary.Base64;

public class MaHoa {

	public static String toSHA1(String str) {
		String salt = "a7rlKM6wjtile;Wq@5kVhas62d4kAj3of2j1r@";
		String result = null;

		str = str + salt;
		try {
			byte[] dataBytes = str.getBytes("UTF-8");
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			result = Base64.encodeBase64String(md.digest(dataBytes));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	public static String toBase64Encoding(String str) {
		String salt = "a7rlM6wjl;Wq5kV@4kj3of2j1r";
		String result = null;

		str = str + salt;

		try {
			byte[] dataBytes = str.getBytes(StandardCharsets.UTF_8);
			result = java.util.Base64.getEncoder().encodeToString(dataBytes);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(toSHA1("Guitar2003@"));
		System.out.println(toBase64Encoding("123"));
	}
}
