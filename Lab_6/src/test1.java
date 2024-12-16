import java.awt.*;  
import java.awt.event.*;  

public class test1 {  
    public static void main(String[] args) {  
        // 創建 Frame 視窗
        Frame frame = new Frame("AWT 範例");  
        
        // 創建標籤
        Label label = new Label("點擊按鈕改變文字");  
        label.setBounds(50, 50, 200, 30);  
        
        // 創建按鈕
        Button button = new Button("點擊我");  
        button.setBounds(50, 100, 80, 30);  

        // 添加按鈕點擊事件
        button.addActionListener(new ActionListener() {  
            public void actionPerformed(ActionEvent e) {  
                label.setText("文字已改變!");  
            }  
        });  
        
        // 將元件加入 Frame
        frame.add(label);  
        frame.add(button);  
        
        // 設定 Frame 佈局和大小
        frame.setSize(300, 200);  
        frame.setLayout(null);  
        
        // 顯示 Frame
        frame.setVisible(true);  
        
        // 關閉視窗事件處理
        frame.addWindowListener(new WindowAdapter() {  
            public void windowClosing(WindowEvent e) {  
                frame.dispose();  
            }  
        });  
    }  
}
