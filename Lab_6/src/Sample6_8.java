class Sample6_8 {
    public static void main(String[] args) {
        CompanyA cmp = new CompanyA();

        Thread drv1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                cmp.add(50);
            }
        });
        drv1.start();

        Thread drv2 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                cmp.add(50);
            }
        });
        drv2.start();
    }
}

class CompanyA {
    private int sum = 0;

    public synchronized void add(int a) {
        int tmp = sum;
        System.out.println("目前的合計金額是" + tmp + "元");
        System.out.println("賺到" + a + "元");
        tmp = tmp + a;
        System.out.println("合計金額是" + tmp + "元");
        sum = tmp;
    }
}