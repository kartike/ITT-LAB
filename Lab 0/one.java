import java.awt.*;
import java.applet.*;
 
public class one extends Applet
{
    public void paint(Graphics g)
    {
        Font f = new Font("Helvetica", Font.BOLD,20);
        g.setFont(f);
        g.drawString("Happy Face", 50, 30);
        g.drawOval(60, 60, 200, 200);
        g.fillOval(100, 120, 40, 20);
        g.fillOval(190, 120, 40, 20);
        g.drawLine(165, 125, 165, 160)
        g.drawArc(110, 130, 95, 95, 0, -180);
    }
}
