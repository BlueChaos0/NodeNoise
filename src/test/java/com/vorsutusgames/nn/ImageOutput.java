package com.vorsutusgames.nn;

import com.vorsutusgames.nn.nodes.Node;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Tyler on 2/13/2015.
 */
public class ImageOutput {

	public static void image(Node node, float scale) throws IOException {
		BufferedImage bufferedImage = new BufferedImage(640, 480,
				BufferedImage.TYPE_INT_ARGB);

		for(int x = 0; x < bufferedImage.getWidth(); x++) {
			for(int y = 0; y < bufferedImage.getHeight(); y++) {
				float v = (float) node.get(x * scale, y * scale);
				v = (v + 1) / 2;
				bufferedImage.setRGB(x, y, new Color(v, v, v).getRGB());
			}
		}

		File outFile = new File("image.png");
		ImageIO.write(bufferedImage, "png", outFile);
	}
}
