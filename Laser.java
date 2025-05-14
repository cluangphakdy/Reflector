import java.awt.*;
import java.util.ArrayList;

public class Laser {
    static Color red = new Color(255, 0, 0, 255);
    static ArrayList<int[]> beam = new ArrayList<int[]>();
    public Laser() {


    }

    public static void addPoints(){
        beam = new ArrayList<int[]>();
        beam.add(new int[]{400, 400});
        beam.add(new int[]{600, 600});
        beam.add(new int[]{700, 900});

    }
    static public void drawLaser(Graphics g){
        g.setColor(Color.red);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        for (int i = 1; i < beam.size(); i++){
            int[] point1 = beam.get(i-1);
            int[] point2 = beam.get(i);
            g2.drawLine(point1[0], point1[1], point2[0], point2[1]);

        }
        System.out.println(beam.size());

    }

}












//TODO:45 or 225 degree mirrors move the laser diagonally (up and left or right)
//TODO:90 or 270 degree mirrors move the laser up
//TODO:180 degree mirrors move the mirror left and right
//TODO: 0 or 360 degree mirrors move the lasers back in the direction it came from (regardless of reflections)
//TODO:laser is made up of tiny cubes and is asserted an angle after each mirror it comes in contact with
