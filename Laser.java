import java.awt.*;
import java.util.ArrayList;

public class Laser {
    static Color red = new Color(255, 0, 0, 255);
    static ArrayList<int[]> beam = new ArrayList<int[]>();
    public Laser() {


    }

    public static void addPoints(int[] start){
        beam = new ArrayList<int[]>();
        beam.add(start);
        String direction = "up";
        ArrayList<Mirror> axisMirrors = new ArrayList<Mirror>();
        boolean stopped = false;
        while (!stopped) {
            int[] point = beam.get(beam.size()-1);
            if (direction == "up"){
                for (Mirror mirror: MirrorList.getMirrorlist()){
                    if (point[0] == mirror.getMirrorx() && point[1] > mirror.getMirrory()) {
                        axisMirrors.add(mirror);

                    }

                }
                if (axisMirrors.size() > 0){
                    Mirror closestMirror = axisMirrors.get(0);
                    for (Mirror mirror: axisMirrors) {
                        if (mirror.getMirrory() > closestMirror.getMirrory()) {
                            closestMirror = mirror;
                        }
                    }
                    beam.add(new int[]{closestMirror.getMirrorx(), closestMirror.getMirrory()});

                } else{ stopped = true; }


            }


        }
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
