import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        // 建立 Random 物件
        Random random = new Random();
        
        // 生成隨機整數
        int randomInt = random.nextInt(100);  // 0 到 99 的隨機數
        System.out.println("隨機整數: " + randomInt);
        
        // 生成隨機浮點數
        double randomDouble = random.nextDouble();  // 0.0 到 1.0 之間
        System.out.println("隨機浮點數: " + randomDouble);
    }
}
