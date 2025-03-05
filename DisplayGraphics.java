import javax.swing.*;
import java.awt.*;

public class DisplayGraphics {
    private final int xOffset = 450;

    Color grey = new Color(105, 105, 105);
    public void init() {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 1920, 1080);
        frame.setVisible(true);

        JPanel panel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                //g.drawRect(960, 540, 100, 150);
                drawBoardEmpty(g);
                drawWalls(g);
            }

        };
        frame.add(panel);

    }

    public void drawBoardEmpty(Graphics g) {
        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                g.setColor(grey);
                g.fillRect((i*100) + 450, j*100, 100, 100);
                g.setColor(Color.black);
                g.drawRect((i*100) + 450, j*100, 100, 100);



            }
        }


    }
    public void drawWalls(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(200 + xOffset, 700, 100, 100);
    }
}
