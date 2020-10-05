package computer;

public class Test {
	public static void main(String args[]) {
		CPU c = new CPU();
		HardDisk h=new HardDisk();
		c.setSpeed(3700);
		h.setAmount(512);
		PC pc =new PC();
		pc.setCPU(c);
		pc.setHardDisk(h);
		pc.show();
	    }
}
