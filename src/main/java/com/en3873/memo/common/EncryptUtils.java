package com.en3873.memo.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtils {
	
	// 암호화 기능
	// 생성된 변수를 객체로 사용하므로 ststic을 통해서 객체 생성 없이 해당 메소드를 호출해서 사용.
	public static String md5(String message) {
		String resultData = "";
		
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			
			byte[] bytes = message.getBytes();
			md.update(bytes);
			
			// 암호화된 결과
			byte[] digest = md.digest();
			
			// 16진수 형태의 문자열로 변환
			for(int i = 0; i < digest.length; i++) {
				resultData = resultData + Integer.toHexString(digest[i] & 0xff);
			}
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return resultData;
		
	}

}
