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
		System.out.println("CPU�ٶ�:"+c.getspeed());
		System.out.println("Ӳ������:"+h.getAmount());
	}
}
