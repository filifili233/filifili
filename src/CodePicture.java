import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.imageio.ImageIO;

public class CodePicture {

	private static final char[] chars = ("0123456789abcdefghijklmnopqrstuvwxyz"
			+ "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

	private static final int SIZE = 4;

	private static final int LINES = 10;

	private static final int WIDTH = 80;

	private static final int HEIGHT = 40;
	
	private static final int FONT_SIZE = 30;
	public static BufferedImage[] createImage;
 
	
	
	public static Object[] createImage() {
		StringBuffer sb = new StringBuffer();
		
		BufferedImage image = new BufferedImage(
			WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		
		Graphics graphic = image.getGraphics();
	
		graphic.setColor(Color.LIGHT_GRAY);
	
		graphic.fillRect(0, 0, WIDTH, HEIGHT);

		Random ran = new Random();
		for (int i = 0; i <SIZE; i++) {
				int n = ran.nextInt(chars.length);
	
			graphic.setColor(getRandomColor());
	
			graphic.setFont(new Font(
				null, Font.BOLD + Font.ITALIC, FONT_SIZE));

			graphic.drawString(
				chars[n] + "", i * WIDTH / SIZE, HEIGHT/2+10);

			sb.append(chars[n]);
		}

		for (int i = 0; i < LINES; i++) {
			
			graphic.setColor(getRandomColor());
		
			graphic.drawLine(ran.nextInt(WIDTH), ran.nextInt(HEIGHT),
					ran.nextInt(WIDTH), ran.nextInt(HEIGHT));
		}

		return new Object[]{sb.toString(), image};
	}
	

	public static Color getRandomColor() {
		Random ran = new Random();
		Color color = new Color(ran.nextInt(256), 
				ran.nextInt(256), ran.nextInt(256));
		return color;
	}
	

	public static void main(String[] args) throws IOException {
		Object[] objs = createImage();
		BufferedImage image = 
			(BufferedImage) objs[1];
		
		OutputStream os = 
			new FileOutputStream("d:/3.png");
		ImageIO.write(image, "png", os);
		os.close();
	}
}
