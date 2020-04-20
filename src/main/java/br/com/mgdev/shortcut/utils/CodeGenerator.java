package br.com.mgdev.shortcut.utils;

import java.util.Random;

public final class CodeGenerator {
	static String vetor = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
	
	/**
	 * 
	 * @param int (Size)
	 * @return String (Token)
	 */
	public static String GerarCodigoRand(int sizeCode){
		Random rand = new Random();
		String code = "";
		for (int i = 0; i < sizeCode; i ++) {
			code = code + String.valueOf(vetor.charAt(rand.nextInt(62)));	
		}
		
		
		return code;
	}


}
