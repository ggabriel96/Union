import java.util.*;

class OrdemS {
	private int qtty;
	private Scanner s;
	private Counter i;
	private CharSequence[] words;
	
	public OrdemS() {
		this.i = new Counter(0);
		s = new Scanner(System.in);
	}
	
	public void askQtty() {
		System.out.print("Digite a quantidade de palavras: ");
		this.qtty = s.nextInt();
		this.words = new String[this.qtty];
		s.nextLine();
	}
	
	public void readS() {
		this.read(this.i);
	}
	
	public void read(Counter c) {
		if (c.getI() < this.qtty) {
			System.out.print("Palavra " + (c.getI() + 1) + ": ");
			this.words[c.getI()] = s.nextLine();
			c.inc();
			this.read(c);
		}
	}
	
	public void invPrintS() {
		this.invPrint(new Counter(this.words.length - 1));
	}
	
	public void invPrint(Counter c) {
		if (c.getI() >= 0) {
			System.out.println(this.words[c.getI()]);
			c.dec();
			this.invPrint(c);
		}
	}
}
