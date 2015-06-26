import java.util.*;

class Ordem {
	private int qtty;
	private Scanner s;
	private Double[] nums;
	
	public Ordem() {
		s = new Scanner(System.in);
	}
	
	public void askQtty() {
		System.out.print("Digite a quantidade de numeros: ");
		this.qtty = s.nextInt();
	}
	
	public void read() {
		this.nums = new Double[this.qtty];
		
		for (int i = 0; i < this.nums.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			this.nums[i] = s.nextDouble();
		}
	}
	
	public void invPrint() {
		for (int i = this.nums.length - 1; i >= 0; i--) {
			System.out.println(this.nums[i]);
		}
	}
}
