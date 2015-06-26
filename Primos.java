import java.util.*;

class Primos {
	private Scanner s;
	private Counter a, b;
	private int[] nums;
	
    public Primos() {
        this.s = new Scanner(System.in);
        
        System.out.print("N: ");
        this.a = new Counter(s.nextInt());
        this.nums = new int[this.a.getI()];
    }
    
    public boolean prim(int x) {
		int nx = Math.abs(x);
		if (nx == 0 || nx == 1) return false;
		if (nx == 2) return true;
		return this.isPrime(nx, new Counter(2));
	}
	
	public boolean isPrime(int x, Counter div) {
		if (div.getI() <= Math.sqrt(x)) {
			if (x % div.getI() == 0) return false;
			else {
				div.inc();
				return this.isPrime(x, div);
			}
		}
		else return true;
	}
	
	public void printPrimes(Counter a, Counter b) {
		if (a.getI() <= b.getI()) {
			if (prim(a.getI())) System.out.println(a.getI());
			a.inc();
			this.printPrimes(a, b);
		}
	}
	
	public void readS() {
		this.read(new Counter(0));
	}
	
	public void read(Counter c) {
		if (c.getI() < this.a.getI()) {
			System.out.print("Numero " + (c.getI() + 1) + ": ");
			this.nums[c.getI()] = s.nextInt();
			c.inc();
			this.read(c);
		}
	}
	
	public void printS() {
		this.print(new Counter(0));
	}
	
	public void print(Counter c) {
		if (c.getI() < this.a.getI()) {
			System.out.print("Closest prime of " + this.nums[c.getI()] + ": ");
			this.closestPrime(new Counter(this.nums[c.getI()]), new Counter(this.nums[c.getI()]));
			c.inc();
			this.print(c);
		}
	}
	
	public void closestPrime(Counter a, Counter b) {
		if (prim(a.getI())) {
			//System.out.println(">> a" + a.getI());
			System.out.println(a.getI());
			return;
		}
		else if (prim(b.getI())) {
			//System.out.println(">> b" + b.getI());
			System.out.println(b.getI());
			return;
		}
		else {
			a.dec();
			b.inc();
			this.closestPrime(a, b);
		}
	}
	
	public void invPrintS() {
		this.invPrint(new Counter(this.nums.length - 1));
	}
	
	public void invPrint(Counter c) {
		if (c.getI() >= 0) {
			System.out.println(this.nums[c.getI()]);
			c.dec();
			this.invPrint(c);
		}
	}
}
