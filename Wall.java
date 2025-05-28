import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Wall {
    private int x, y;


    public Wall(int px, int py) throws IOException {
        this.x = px;
        this.y = py;
    }

    public void drawWall(Graphics g, int x, int y) throws IOException {
        //BufferedImage mirrorimg = ImageIO.read(img);
        g.fillRect(x, y, 100, 100);
    }

    public int getWallx() {
        return this.x;
    }

    public int getWally() {
        return this.y;
    }



}

