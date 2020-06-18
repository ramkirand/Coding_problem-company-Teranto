package com.solution;

public class MixStrings {

	public static String mixedString(String str1, String str2, String str3) {
		StringBuilder ans = new StringBuilder();
		if (str1 == null || str2 == null || str3 == null)
			return ans.toString();

		int l = str1.length();
		int m = str2.length();
		int n = str3.length();

		for (int i = 0; i < l || i < m || i < n; i++) {
			if (i < l)
				ans.append(str1.charAt(i));
			if (i < m)
				ans.append(str2.charAt(i));
			if (i < n)
				ans.append(str3.charAt(i));
			ans.append("\n");
		}
		return ans.toString();
	}

	public static void main(String[] args) {
		String str1 = "123";
		String str2 = "abc";
		String str3 = "#%&";
		System.out.println(mixedString(str1, str2, str3));
	}

}
