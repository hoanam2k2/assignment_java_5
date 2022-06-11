package com.example.demo.utils;

import org.mindrot.jbcrypt.BCrypt;

public class EncryptUtils {
	public static String encrypt(String origin) {
		return BCrypt.hashpw(origin, BCrypt.gensalt());
	}

	public static boolean check(String origin, String encrypted) {
		return BCrypt.checkpw(origin, encrypted);
	}
}