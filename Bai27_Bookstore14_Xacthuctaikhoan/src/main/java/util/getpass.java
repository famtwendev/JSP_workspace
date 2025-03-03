package util;

import java.util.Random;

public class getpass {

	private static final String ALLOWED_CHARACTERS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#&/";

	public static String generatePassword(int length) {
		Random rd = new Random();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = rd.nextInt(ALLOWED_CHARACTERS.length());
			char randomChar = ALLOWED_CHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		String password = generatePassword(15);
		System.out.println("Generated password: " + password);

	}
}
