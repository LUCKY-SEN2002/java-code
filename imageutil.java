package game;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/*��ȡͼƬ�Ĺ���
 * 
 * /
 */
public class imageutil {

	public static BufferedImage getImg(String path) {
		// �涨��ȡͼƬ�Ĳ���
		// ImageIO ���ݴ���ͨ�� ��������ˮ��
		// ʹ�õ��������
		try {
			BufferedImage img = ImageIO.read(imageutil.class.getResource(path));

			// ��ȡ���˷���
			// û������ô��
			return img;
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

}
