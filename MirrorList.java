import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class MirrorList {
    private static HashSet<Mirror> mirrorlist = new HashSet<>();
    File mirror = new File("src/Mirror0.png");
    public static void add(Mirror m){
        mirrorlist.add(m);

    }




    public static void prntmirrorList()  {
        for (Mirror m: mirrorlist) {
            m.prntmirrorvalues();

        }
        System.out.println("----------------------------------------------------------");


    }

    public  static void placemirrorslevel1() throws IOException {
        add(new Mirror(4,8, 45));
        add(new Mirror(9, 8, 0));
        add(new Mirror(6, 5, 0));
        add(new Mirror(2, 5, 0));
        add(new Mirror(6, 1, 0));
        add(new Mirror(6, 1, 0));


    }
    public static void drawMirrors(Graphics g) throws IOException {
        for (Mirror m: mirrorlist) {
            m.drawMirror(g,  460 + (m.getMirrorx() * 100), m.getMirrory() * 102, m.getMirrordeg());


        }


    }



    //}
    //TODO: Mirror level 1 placement: (4,9), (9,9), (6,5), (2,5), (6, 1)
    //TODO: assuming grid is 0 by 10 and topmost left square is (1,1)
    //TODO: print something when clicking on a mirror for 4/9

}
