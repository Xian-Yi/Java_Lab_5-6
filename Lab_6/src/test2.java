public class test2 {
    public static void main(String[] args) {
        // 使用 String 類別
        String greeting = "Hello, Java!";
        System.out.println("字串長度: " + greeting.length());
        System.out.println("字串轉大寫: " + greeting.toUpperCase());

        // 使用 Math 類別
        double number = 25.0;
        System.out.println("平方根: " + Math.sqrt(number));
        System.out.println("最大值: " + Math.max(10, 20));

        // 使用 Integer 類別
        int num = Integer.parseInt("123"); // 將字串轉換成整數
        System.out.println("轉換後的整數: " + num);

        // 使用 Object 類別
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("物件是否相等: " + obj1.equals(obj2));

        // 使用 System 類別
        long currentTime = System.currentTimeMillis();
        System.out.println("目前時間 (毫秒): " + currentTime);

        // 使用 Thread 類別
        Thread thread = new Thread(() -> System.out.println("執行緒執行中..."));
        thread.start(); // 啟動執行緒
    }
}
