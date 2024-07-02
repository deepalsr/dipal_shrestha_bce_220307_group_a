import java.awt.*;

public class Hourglass extends Frame {
    Hourglass(){
        setSize(500,500);
        setVisible(true);

    }
    public void paint(Graphics g){
        super.paint(g);
        g.drawLine(100,100,150,150);
        g.drawLine(150,150,200,200);
        g.drawLine(200,200,100,200);
        g.drawLine(100,200,150,150);
        g.drawLine(150,150,200,100);
        g.drawLine(200,100,100,100);

    }

    public static void main(String[] args) {
        new Hourglass();
    }
}
