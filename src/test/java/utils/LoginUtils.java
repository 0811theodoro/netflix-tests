package utils;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class LoginUtils {
	public static String pegaSenhaValida() throws UnsupportedEncodingException {
		byte[] decodedBytes = Base64.getDecoder().decode(System.getenv("SENHA_VALIDA"));
		String senha = new String(decodedBytes, "utf-8");
		return senha;
	}

}
