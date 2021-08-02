import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        Main window = new Main();
        System.out.println("~~~~~");
        System.out.println("Red Vs Blue");
        System.out.println("~~~~~");

    }
    public class Canvas extends JPanel {
        public Canvas(){
            setPreferredSize(new Dimension(720,720));
        }
            @Override
            public void paint (Graphics g){
                for (int i = 10; i < 710; i += 35){
                    for (int j = 10; j < 710; j+= 35){
                        g.setColor(Color.WHITE);
                        g.fillRect(i, j, 35, 35);
                        g.setColor(Color.BLACK);
                        g.drawRect(i, j, 35, 35);
                    }
               
                }
            }
        }
    
    public Main(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.pack();
        this.setVisible(true);
    }
}
