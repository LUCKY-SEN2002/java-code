package game;

import javax.swing.JFrame;

//1.��Ϸ���壬������أ��̶���Ϸ����
//2.�̳�JFrame��
//3.дһ����������ȷ�����������
public class GameFrame extends JFrame {

	public GameFrame() {

		// ���ô���ı���
		setTitle("��������Ϸ");

		setSize(800, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	// �������
	public static void main(String[] args) {
		// ʹ��ģ�ߴ�������Ϸ��Ϸ����
		// ��ʽ������ ������
		// �������������������
		// ������Ϸ�������

		GameFrame frame = new GameFrame();
		Gamepanel panel = new Gamepanel();
		frame.add(panel);//��ʼ��Ϸ
		panel.action();
		frame.setVisible(true);
      
	}

}
