import java.applet.Applet;
import java.awt.Graphics;


public class KADAI13 extends Applet{
	/*     <applet code=KADAI13.class width=300 height=300>     
		Ballet
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		int n = 9;
		int xdata[] = new int[n];
		int ydata[] = new int[n];

		xdata[0] = 30;        ydata[0] = 45;
		xdata[1] = 30;        ydata[1] = 150;
		xdata[2] = 50;        ydata[2] = 165;
		xdata[3] = 130;        ydata[3] = 165;
		xdata[4] = 150;        ydata[4] = 150;
		xdata[5] = 150;        ydata[5] = 45;
		xdata[6] = 130;        ydata[6] = 60;
		xdata[7] = 50;        ydata[7] = 60;
		xdata[8] = 30;        ydata[8] = 45;

		g.drawPolygon(xdata, ydata, n);
	}
}
