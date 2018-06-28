import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.filter.*;

public class My_Inverter implements PlugInFilter {
	

	public int setup(String arg, ImagePlus im) {
		return DOES_8G;
	}

	public void run(ImageProcessor ip) {
		int M = ip.getWidth();
		int N = ip.getHeight();

		for(int u = 0; u < M ; u++){
			for(int v = 0; v < N; v++){
				int p = ip.getPixel(u,v);
				ip.putPixel(u, v, 255-p);
			}
		}
	}
}
