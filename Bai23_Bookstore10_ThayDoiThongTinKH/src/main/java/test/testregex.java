package test;

import java.util.regex.Pattern;

public class testregex {
	private Pattern pattern;
	private static final String USERNAME_PATTERN = "^[a-z0-9._-]{3,15}$";

	public testregex() {
		pattern = Pattern.compile(USERNAME_PATTERN);
	}

	public boolean validate(final String username) {
		return pattern.matcher(username).matches();
	}

	public static void main(String[] args) {
		testregex validator = new testregex();
		// true
		System.out.println(validator.validate("absherzad"));
		System.out.println(validator.validate("ab.sherzad"));
		System.out.println(validator.validate("ab-sherzad"));
		System.out.println(validator.validate("ab_sherzad"));
		System.out.println(validator.validate("oxus20"));
		System.out.println(validator.validate("ars"));
		// false
		System.out.println(validator.validate("Absherzad"));
		System.out.println(validator.validate("ab sherzad"));
		System.out.println(validator.validate("ab"));
		System.out.println(validator.validate("abdulrahmansherzad"));
		System.out.println(validator.validate("Fam twen"));
	}
}
