import java.util.*;

class OrdemS {
	private int qtty;
	private Scanner s;
	private String[] words;
	
	public OrdemS() {
		s = new Scanner(System.in);
	}
	
	public void askQtty() {
		System.out.print("Digite a quantidade de palavras: ");
		this.qtty = s.nextInt();
		s.nextLine();
	}
	
	public void read() {
		this.words = new String[this.qtty];
		
		for (int i = 0; i < this.words.length; i++) {
			System.out.print("Palavra " + (i + 1) + ": ");
			this.words[i] = s.nextLine();
		}
	}
	
	public void invPrint() {
		for (int i = this.words.length - 1; i >= 0; i--) {
			System.out.println(this.words[i]);
		}
	}
}
