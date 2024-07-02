import java.awt.*;

public class PolygonHourglass extends Frame {
  PolygonHourglass(){
      setSize(500,500);
      setVisible(true);
  }
  public void paint(Graphics g){
      super.paint(g);
      int xvalues[] ={100,150,200,100,150,200};
      int yvalues[]={100,150,200,200,150,100};
      int points =6;
      g.drawPolygon(xvalues,yvalues,points);
  }

    public static void main(String[] args) {
        new PolygonHourglass();
    }
}
