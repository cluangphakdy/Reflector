import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Mirror {
    private int x, y;
    private int rotdegree;
    private BufferedImage img;

    public Mirror(int px, int py, int deg) throws IOException {
        this.x = px;
        this.y = py;
        this.rotdegree = deg;
        this.img = ImageIO.read(new File("src/costume1.png"));
    }

    public void prntmirrorvalues() {
        System.out.println(this.x + " " + this.y + " " + this.rotdegree);
    }

    @Override
    public boolean equals(Object m) {
        if (this == m) return true;
        if (m == null || getClass() != m.getClass()) return false;
        Mirror mirror = (Mirror) m;
        return x == mirror.x && y == mirror.y;
    }

    @Override
    public int hashCode() {
        // Typically, you would combine relevant fields' hash codes to compute a new hash
        return 31 * x + 31 * y; // A simple way to hash based on x and y
    }

    public int getMirrorx() {
        return this.x;
    }
    public int getMirrory() {
        return this.y;
    }
    public int getMirrordeg() {
        return this.rotdegree;
    }
}
