package br.com.programadoresemacao.global;

public class Utilitarios {
	
	public static boolean eNumero(String teste){
		try {
			Double.valueOf(teste);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static boolean eInteiro(String teste){
		try {
			Integer.valueOf(teste);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public static String retiraMascara(String str){
		// RETIRA ()-,."\/:';
		str = str.replace("(", "").replace(")", "").replace("-", "").replace(",", "").replace(".", "").replace("\"", "").replace("\\", "").replace("/", "").replace(":", "").replace("'", "").replace(";", "").trim();
		return str.trim().replaceAll("\\s+"," ");
	}
	
	public static String retira(String str, String[] replace){
		for (String string : replace) {
			str = str.replace(string, "");
		}
		return str.trim().replaceAll("\\s+"," ");
	}
	
	public static String toMontainCase(String str){
		String[] cadaPalavra = str.trim().replaceAll("\\s+"," ").split(" ");
		str = "";
		for (String string : cadaPalavra) {
			str += " " + string.substring(0,1).toUpperCase() + string.substring(1);
		}
		return str.trim();
	}
	
	
}
