package projetoPoo;

public class reprodutorMusical extends Iphone {

	public void tocar() {
		System.out.println("Tocando M�sica!");
	}

	public void pausar() {
		System.out.println("M�sica Pausada!");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Tocando: " + musica + "!");
	}

}