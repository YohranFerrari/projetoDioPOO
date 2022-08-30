package projetoPoo;

import java.util.Scanner;

public class Iphone {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		reprodutorMusical iphone = new reprodutorMusical();
		aparelhoTelefonico iphone2 = new aparelhoTelefonico();
		navegadorInternet iphone3 = new navegadorInternet();

		System.out.print("Qual Música deseja tocar? :");
		String musica = sc.next();

		iphone.selecionarMusica(musica);
		iphone.pausar();
		iphone.tocar();

		System.out.print("\nPara quem deseja ligar? :");
		String contato = sc.next();

		iphone2.ligar(contato);
		iphone2.atender();
		iphone2.iniciarCorreioVoz();

		System.out.print("\nQual página deseja acessar? :");
		String pagina = sc.next();

		iphone3.exibirPagina(pagina);
		iphone3.adicionarNovaAba();
		iphone3.atualizarPagina();

		sc.close();
	}
}