import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class MirrorList {
    private static HashSet<Mirror> mirrorlist = new HashSet<>();
    public static void add(Mirror m){
        mirrorlist.add(m);

    }

    public static HashSet<Mirror> getMirrorlist() {
        return mirrorlist;
    }





    public static void prntmirrorList()  {
        for (Mirror m: mirrorlist) {
            m.prntmirrorvalues();

        }
        System.out.println("----------------------------------------------------------");


    }

    public  static void placemirrorslevel1() throws IOException {
        add(new Mirror(4,8, 0));
        add(new Mirror(9, 8, 0));
        add(new Mirror(6, 5, 0));
        add(new Mirror(2, 5, 0));
        add(new Mirror(6, 1, 0));
        add(new Mirror(6, 1, 0));


    }
    public static void drawMirrors(Graphics g) throws IOException {
        for (Mirror m: mirrorlist) {
            m.drawMirror(g,  460 + (m.getMirrorx() * 100), m.getMirrory() * 102);


        }


    }

    public static void checkifMirrorhere(int clickX, int clickY) throws IOException {
        for (Mirror m: mirrorlist) {
            //System.out.println("CLICKX: "+ clickX + "CLICKY: " + clickY + "MIRRORX: " + m.getMirrorx() + "MIRRORY: "+ m.getMirrory() );
            if (clickX-1 == m.getMirrorx() && clickY-1 == m.getMirrory()) {
                System.out.println("Mirror clicked");
                m.mirrorRotate();
            }
        }
    }




}
