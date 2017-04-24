package ch12.exam05;
	// °øÀ¯°´Ã¼
public class Calculator {
	private int memory;
	int nanos = 1;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(nanos);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	
}
