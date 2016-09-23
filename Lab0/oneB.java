import java.awt.*;
import java.applet.*;
 
public class oneB extends Applet
{
    public void paint(Graphics g)
    {
        Font f = new Font("Helvetica", Font.BOLD,20);
        g.setFont(f);
        g.drawString("Sad Face", 50, 30);
        g.drawOval(60, 60, 200, 200);
        g.fillOval(100, 120, 40, 20);
        g.fillOval(190, 120, 40, 20);
        g.drawLine(165, 125, 165, 160);
        g.drawArc(120, 180, 95, 95, 0, 180);
    }
}
