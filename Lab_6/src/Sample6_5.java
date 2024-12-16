class Sample6_5 {

	public static void main(String[] args) {
		CarD car1 = new CarD("1號車");
		car1.start();
			
			try {
				car1.join();
			}
			catch(InterruptedException e) {
			}
			System.out.println("正在進行main()的處理工作");	
	}
}

class CarD extends Thread {
	private String name;
	
	public CarD(String nm) {
		name = nm;
	}
	
	public void run() {
		for(int i=0;i<5;i++)
		{
			System.out.println("正在進行" + name + "的處理工作");
		}
	}
}