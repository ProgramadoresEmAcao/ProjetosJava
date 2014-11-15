package br.com.programadoresemacao.global;

public class Testadora {
	public static void main(String[] args) {
//		UtilitarioseNumero();
//		UtilitariosretiraMascara();
//		Utilitariosretira();
//		UtilitariostoMontainCase();
	}
	
	private static void UtilitarioseNumero(){
		String[] testes = {"4","A","45a","20.6","20L"," 3  "};
		for (String teste : testes) {
			if(Utilitarios.eNumero(teste)){
				System.out.println("\"" + teste + "\" eh numero");
			}else{
				System.out.println("\"" + teste + "\" nao eh numero");
			}
		}
	}
	
	private static void UtilitariosretiraMascara(){
		String[] strs = {"(27)3336-3636","17/08/1960 14:24:03","a(b)c;d.e,f/g\\h\"i'j:k-l"};
		for (String str : strs) {
			System.out.println(str + "\t Sem Mascara fica: \t" + Utilitarios.retiraMascara(str));
		}
	}
	
	private static void Utilitariosretira(){
		String str = "String - antiga//";
		String[] retira = {"-","a"};
		System.out.println(Utilitarios.retira(str, retira));
	}
	
	private static void UtilitariostoMontainCase() {
		String a = "pedro rocha dal cim";
		System.out.println(Utilitarios.toMontainCase(a));
	}

}
