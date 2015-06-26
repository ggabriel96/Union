class Counter {
	private int i;
	
	public Counter(int i) {
		this.i = i;
	}
	
	public int inc() {
		return this.i++;
	}
	
	public int dec() {
		return this.i--;
	}
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return this.i;
	}
}
