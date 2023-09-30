package br.com.abc.intro;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encriptar {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		String orignal = "{\"email\":\"bfg@ecomp.poli.br\", \"cpf\":\"454654\",\"idEmpresa\":\"45\",\"grupo\":\"1\"}";

		String cookie = "469bfdbd";
		String keyString = "1111111111111111"; 
		String initialVectorParam = "2222222222222222";
		 
		SecretKeySpec key = new SecretKeySpec(keyString.getBytes(), "AES");
		IvParameterSpec initalVector = new IvParameterSpec(initialVectorParam.getBytes());
		 
		Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
		 
		/////////////// encrypt /////////////////
		cipher.init(Cipher.ENCRYPT_MODE, key, initalVector);
		byte[] test = cipher.doFinal(orignal.getBytes());
		System.out.println(bytes2Hex(test));
		 
		/////////////// decrypt /////////////////
		cipher.init(Cipher.DECRYPT_MODE, key, initalVector);
		// byte[] encrypted = new BigInteger(1,cookie.getBytes()).toByteArray();
		// byte[] encrypted = new BigInteger(cookie,16).toByteArray();
		byte[] encrypted = hex2byte(cookie);
//		byte[] decryptedValue = cipher.doFinal(encrypted);
		 
		System.out.println("key:"+new String(key.getEncoded()));
		System.out.println("IV:"+new String(initalVector.getIV())); 
		System.out.println("encrypted:"+new String(encrypted));
//		System.out.println("decrypted:"+new String(decryptedValue));
		}
		 
		private static byte[] hex2byte(String s){
		if(s == null) return null;
		int l = s.length();
		if(l%2 == 1) return null;
		byte[] b = new byte[l/2];
		for(int i = 0 ; i < l/2 ;i++) {
		b[i] = (byte)Integer.parseInt(s.substring(i*2,i*2+2),16);
		}
		return b;
		}
		 
		private static String byte2Hex(byte b) {
		String[] HEX_DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"}; 
		int nb = b & 0xFF;
		int i_1 = (nb >> 4) & 0xF;
		int i_2 = nb & 0xF;
		return HEX_DIGITS[i_1] + HEX_DIGITS[i_2];
		}
		 
		private static String bytes2Hex(byte[] b) {
		StringBuffer sb = new StringBuffer(b.length * 2);
		for (int x = 0; x < b.length; x++) {
		sb.append(byte2Hex(b[x]));
		}
		return sb.toString();
		} 
}
