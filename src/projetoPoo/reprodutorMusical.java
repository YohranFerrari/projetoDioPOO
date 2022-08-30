package projetoPoo;

public class reprodutorMusical extends Iphone {

	public void tocar() {
		System.out.println("Tocando Música!");
	}

	public void pausar() {
		System.out.println("Música Pausada!");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Tocando: " + musica + "!");
	}

}