package game;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * ����
 * /
 */
public class FISH extends Thread {
	// �ص��������
	// ���ͼƬ
	// �������
	// ��Ĵ�С(��ȣ��߶ȣ�
	BufferedImage img;
	int x;
	int y;
	int w;
	int h;
	// ���������
	Random ran = new Random();

	// ����һ�����ζ��ļ��ϣ�
	List<BufferedImage> animation = new ArrayList<BufferedImage>();
//����һ�����
	Gamepanel panel;
	// �����㱻��

	boolean caught = false;

	List<BufferedImage> catchanimation = new ArrayList<BufferedImage>();

	// ����һ���뱻��ʱ������
	 static int catchNUM;

	public FISH(Gamepanel panel) {
		this.panel = panel;
		// ����������
		int index = ran.nextInt(9) + 1;

		String fishName = "../img/fish0" + index + "_";
		// �������ζ�ʱ��ͼƬ
		for (int i = 1; i < 11; i++) {

			// С��10��ʱ�� 01 02 03 ....10
			String prefix = (i == 10 ? "" : "0") + i;
			// ƴ������·��
			String path = fishName + prefix + ".png";
			BufferedImage img = imageutil.getImg(path);
			animation.add(img);
		}
		catchNUM = index <= 7 ? 2 : 4;
//����Ķ���ͼƬװ��������

		for (int i = 1; i <= catchNUM; i++) {
			// ƴ��ͼƬ·��
			String path = fishName + "catch_0" + i + ".png";
			// ����·������ͼƬ
			BufferedImage img = imageutil.getImg(path);

			catchanimation.add(img);
		}
		// ��ʼ�������������
		// ȷ������ʾ��ͼƬ

		// img=imageutil.getImg("../img/fish02_01.png");
		img = animation.get(0);

		w = img.getWidth();
		h = img.getHeight();

		x = ran.nextInt(800 - w);
		y = ran.nextInt(480 - h);

		// TODO Auto-generated constructor stub
	}

	// ���ƶ��Ĳ���
	int stepnum = 0;//

//���ƶ��ķ���
	public void move() {
		stepnum++;
		// �л�ͼƬ
		img = animation.get(stepnum % 10);// ����Ҫʹ��if�����������жϣ�ֱ��ʹ��ȡ�����ķ������ѭ��
//
		w = img.getWidth();
		h = img.getHeight();

		x -= ran.nextInt(3) + 1;
		if (x <= -w) {

			x = 800;
			y = ran.nextInt(480 - h);

		}
	}

	// �������ƶ�
	public void run() {
		// ��ѭ��
		// ��������ƶ�
		super.run();
		for (;;) {
			// ������Ƿ񱻲�
			if (caught) {
				// ��ʾ��������
				fishOver();
				x = 800;
				y = ran.nextInt(480 - h);

			}
			move();
			// ��̫�죬����
			try {
				Thread.sleep(100);
				panel.repaint();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}
	}

//�㱻���Ķ���
	private void fishOver() {
		for (int j = 0; j < 4; j++) {
			// TODO Auto-generated method stub
			// �Ӽ����б�����ͼƬ
			for (int i = 0; i < catchNUM; i++) {
				img = catchanimation.get(i);
				w = img.getWidth();
				h = img.getHeight();
				try {
					Thread.sleep(100);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}

			}

		}

	}

}
