package game;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

/*java���õ����
 * �Զ��廭�岽��
 * 1.������
 * 2.�̳�JPanel
 * 3.дһ����������ȷ�������ص�
 * 
 */
public class Gamepanel extends JPanel {
//������� 
	 static public int score=0;//�����ʼ����
	 static public int caughtfishnumbers =0;//���屻���������
	 
	
	

	// ����һ�ű���ͼ
	BufferedImage bg;
	// ����һ����
	FISH fish = new FISH(this);

	// �������������������
	int fishNUM = 200;
	// ��ļ��ϣ����������е���
	List<FISH> fishes = new ArrayList<>();
	net net = new net();
	// ����������ʾ
	boolean netshow = true;

	public Gamepanel() {
		// ���ñ���ɫ

		// ʹ�ù������ȡָ��·���ϵ�ͼƬ

		bg = imageutil.getImg("../img/bg04.jpg");
		// �������е���װ��������
		// TODO Auto-generated constructor stub
		for (int i = 0; i < fishNUM; i++) {
			fishes.add(new FISH(this));

		}
		creatMouseListener();

		// ��ʼ��������
	}// ��Ϸ��ʼ�ķ���

	public void action() {

		for (int i = 0; i < fishNUM; i++) {

			// ��ȡÿһ����
			FISH fish = fishes.get(i);
			fish.start();
		}
	}

	// ��ͼ�ķ��� g�൱�ڻ���
	public void creatMouseListener() {
		MouseAdapter adapter = new MouseAdapter() {

			public void mouseMoved(MouseEvent e) {

				int mouse_x = e.getX();
				int mouse_y = e.getY();
				net.x = mouse_x - net.w / 2;
				net.y = mouse_y - net.h / 2;
				repaint();

			}

			// ����Ƴ��¼�
			public void mouseExited(MouseEvent e) {

				netshow = false;
				repaint();
			}

			// �������
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseEntered(e);
				netshow = true;
				repaint();
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);

				int key = e.getModifiers();
				// System.out.println(key);
				// �����16 ��4

				if (key == 16) {
					catchFish();

				}
				if (key == 4) {
					// �л������������
					changeNet();
					// ���»�ȡ���λ��
					// �������¸���
					int mouse_x = e.getX();
					int mouse_y = e.getY();
					net.x = mouse_x - net.w / 2;
					net.y = mouse_y - net.h / 2;
					repaint();
				}
			}

		};

		addMouseMotionListener(adapter);
		addMouseListener(adapter);
		// �����
		// ��ȡ���ʵʱλ��

	}

	int power = 1;

	public void catchFish() {

		for (int i = 0; i < fishNUM; i++) {

			FISH fish = fishes.get(i);
			if (net.catchFish(fish)) {
				fish.caught = true;

			}
		}

	}

	private void changeNet() {
		// TODO Auto-generated method stub

		// Ҳ����ʹ����Ŀ�����
		if (power < 7) {
			power++;

		} else {
			power = 1;
		}

		net.change(power);
	}
	public void changescore() {
		   
		 if (score<=100000) {
			score=FISH.catchNUM*10;
			
		 }
		 scoremanager.changescore(score);
		 
	 }

	
	public void paint(Graphics g) {
		// ������ͼ
		// g.drawImge(ͼƬ�������꣬�����꣬null)

		g.drawImage(bg, 0, 0, null);
		for (int i = 0; i < fishNUM; i++) {
			FISH fish = fishes.get(i);

			g.drawImage(fish.img, fish.x, fish.y, fish.w, fish.h, null);

		}
		g.setColor(Color.yellow);
		g.setFont(new Font("����", Font.BOLD, 20));
		//g.drawString(("�ӵ�����100"), 300, 30);
		g.drawString("����ֵ��" + power, 650, 30);
		g.drawString("����:"+score, 20, 30);
		g.drawString("�������Ҽ����ӻ���", 550, 60);
		// ����������
		if (netshow == true) {
			g.drawImage(net.img, net.x, net.y, net.w, net.h, null);
		}

	}
	
	
	
	
}
