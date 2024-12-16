class Sample6_6 {
    public static void main(String[] args) {
        // 使用lambda表示式進一步簡化執行緒的建立
        Runnable car1 = new CarE("一號車");
        
        Thread th1 = new Thread(car1);
        th1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行main()的處理工作");
        }
    }
}

class CarE implements Runnable {
    private final String name;

    public CarE(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("正在進行" + name + "的處理工作");
        }
    }
}
