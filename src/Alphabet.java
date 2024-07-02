import java.awt.*;

public class Alphabet extends Frame {
    Alphabet(){
        setSize(500,500);
        setVisible(true);
    }
    public void paint(Graphics g){
        int x=100,y=100;
        super.paint(g);
        char[] array = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        g.setFont(new Font(Font.SANS_SERIF,Font.ITALIC,16));
        for(int i =0;i<array.length;i=i+5){
            if(i==25){
g.drawChars(array,i,1,x,y);
            }
            else {
                g.drawChars(array, i, 5, x, y);
                y = y + 20;
            }

    }}

    public static void main(String[] args) {
        new Alphabet();
    }

}
