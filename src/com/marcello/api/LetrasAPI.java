package com.marcello.api;

public class LetrasAPI {
	public static boolean ContemLetra(final String s) {
		final char[] c = s.toCharArray();
		boolean d = false;
		for (int i = 0; i < c.length; ++i) {
			if (!Character.isDigit(c[i])) {
				d = true;
				break;
			}
		}
		return d;
	}
}
