public class Sample6_2 {

	public static void main(String[] args) {
		CarA car1 = new CarA("1號車");
		car1.start();
		
		CarA car2 =new CarA("2號車");
		car2.start();
		
		for(int i = 0;i<5;i++) {
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class CarA extends Thread {
	private String name;
	
	public CarA(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("正在進行" + name + "的處理工作");
		}
	}
}
