package computer;

public class PC {
	CPU c;
	HardDisk h;
	void setCPU(CPU c) {
		this.c = c;
	}
	void setHardDisk(HardDisk h) {
		this.h=h;
	}
	void show(){
		System.out.println("CPUÀŸ∂»:"+c.getspeed());
		System.out.println("”≤≈Ã»›¡ø:"+h.getAmount());
	}
}
