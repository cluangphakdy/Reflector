import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

        MouseListener clickthingy = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getX()+" "+e.getY());
                getGridLocationFromCursorx(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };


        frame.add(panel);
        frame.addMouseListener(clickthingy);

    }

    public void getGridLocationFromCursorx(MouseEvent e) {
        float Startingnum  = e.getX();
        Startingnum = Startingnum -  450;
        Startingnum = Startingnum / 100;
        Startingnum = (int) Math.floor(Startingnum);
        Startingnum = Startingnum + 1;
        System.out.println(Startingnum);

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
        g.fillRect(300 + xOffset, 700, 100, 100);
        g.fillRect(400 + xOffset, 700, 100, 100);
        g.fillRect(500 + xOffset, 700, 100, 100);
        g.fillRect(600 + xOffset, 700, 100, 100);
    }
}
