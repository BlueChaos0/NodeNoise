package com.vorsutusgames.nn.util;

import org.junit.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class SimplexNoiseTest
{

	@Test
	public void noiseTest() throws Exception
	{
		BufferedImage bufferedImage = new BufferedImage(640, 480, BufferedImage.TYPE_INT_ARGB);

		for (int x = 0; x < bufferedImage.getWidth(); x++) {
			for (int y = 0; y < bufferedImage.getHeight(); y++) {
				float v = (float) SimplexNoise.noise(x * .05, y * .05);
				v = (v + 1) / 2;
//				System.out.println(v);
				bufferedImage.setRGB(x, y, new Color(v, v, v).getRGB());
			}
		}

		File outFile = new File("image.png");
		ImageIO.write(bufferedImage, "png", outFile);
	}

}