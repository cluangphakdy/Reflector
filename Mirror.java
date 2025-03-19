import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Mirror {
    private int x,y;
    private int rotdegree;
    private BufferedImage img;

    public Mirror(int px, int py, int deg) throws IOException {
       this.x = px;
       this.y = py;
       this.rotdegree = deg;
       this.img = ImageIO.read(new File("src/costume1.png"));


    }
}
