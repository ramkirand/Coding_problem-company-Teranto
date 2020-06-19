package com.solution;

/*
 Question 2
 
You are given three strings assuming the length of each string is equal and equal to N.
P = P 1 P 2 P 3 P 4 P 5 … ……… ….. P (n-1) Pn
Q = Q 1 Q 2 Q 3 Q 4 Q 5 … ……… ….. Q (n-1) Qn
R = R 1 R 2 R 3 R 4 R 5 … ……… ….. R (n-1) Rn

Now mix all three strings to generate a new string S that is as follows
S = P 1 Q 1 R 1 P 2 Q 2 R 2 … ……… ….. P (n-1) Q (n-1) R (n-1) P n Q n R n
You are supposed to use “recursive” function to achieve mixing for all three string.

 Author : D Rama Kiron
 */
public class MixStrings {
	// Time complexity O(3n)
	
	public String mixedString(String str1, String str2, String str3) {
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
		}
		return ans.toString();
	}

	// Time Complexity: O(3n)

	public  void mixedStringRecursive(StringBuilder sb, String str1, String str2, String str3, int index) {
		if (index == str1.length())
			return;
		sb.append(str1.charAt(index)).append(str2.charAt(index)).append(str3.charAt(index));
		mixedStringRecursive(sb, str1, str2, str3, index + 1);
	}
}
