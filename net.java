package game;

import java.awt.image.BufferedImage;

public class net {
//
	static public int score1;boolean hit;
	
	BufferedImage img;
	int x;// ����ͼƬ��λ�ã���߶�
	int y;// ����ͼƬ��λ�ã���߶�
	int w;// ����ͼƬ��λ�ã���߶�
	int h;// ����ͼƬ��λ�ã���߶�

	public net() {
		// ȷ��������ͼƬ
		// TODO Auto-generated constructor stub

		img = imageutil.getImg("../img/net_1.png");
		// ȱ���߶�����
		w = img.getWidth();
		h = img.getHeight();

		// ȷ��������ʼλ��
		x = 200;
		y = 200;

	}

//�������л�
	public void change(int power) {
		// TODO Auto-generated method stub

		img = imageutil.getImg("../img/net_" + power + ".png");//
		// ���»�ȡ
		w = img.getWidth();
		h = img.getHeight();
	}

	// ����
	public boolean catchFish(FISH f) {

		boolean hit = f.x <= x + w && f.x >= x - f.w && f.y <= y + h && f.y >= y - f.h;
				return hit;

	}
	

}
