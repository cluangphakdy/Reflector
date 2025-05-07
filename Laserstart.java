import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Laserstart {
    private int x, y;
    private BufferedImage img; //used to be static


    public Laserstart(int px, int py ) throws IOException {
        this.x = px;
        this.y = py;

        this.img = ImageIO.read(new File("src/Laserstart.png"));
    }

    public void drawStart(Graphics g) throws IOException {

        g.drawImage(this.img, this.x, this.y, 150, 100, null);
    }
}
