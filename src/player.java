import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.media.Controller;
import javax.media.ControllerAdapter;
import javax.media.ControllerListener;
import javax.media.EndOfMediaEvent;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.PrefetchCompleteEvent;
import javax.media.RealizeCompleteEvent;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
// ��Ƶ���ų���
@SuppressWarnings("serial")
public class player extends JFrame {
	
	private Player player; // ����������
	private Component visualMedia; // ��Ƶ��ʾ���
	private Component mediaControl; // ��Ƶ���ſ������
	private Container container; // ������
	private File mediaFile; //ý���ļ�
	private URL fileURL; //ý���ļ�URL��ַ
	public player() { // ���캯��
		
		super("����"); //���ø��๹�캯��
		container = getContentPane(); //�õ���������
		JToolBar toobar = new JToolBar(); //ʵ����������
		JButton openFile = new JButton("��ý���ļ�"); //ʵ������ť
		toobar.add(openFile); //���Ӱ�ť��������
		JButton openURL = new JButton("�������ַ");
		toobar.add(openURL);
		container.add(toobar, BorderLayout.NORTH); //���ù�����
		openFile.addActionListener(new ActionListener() { //���ļ���ť�¼�����
			public void actionPerformed(ActionEvent event) {
				JFileChooser fileChooser = new JFileChooser(); //ʵ�����ļ�ѡ����
				fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);//�����ļ���ģʽΪ�����ļ�				
				int result = fileChooser.showOpenDialog(player.this);//��ʾ�Ի���				
				if (result == JFileChooser.APPROVE_OPTION) { //�õ��û���Ϊ
					mediaFile = fileChooser.getSelectedFile(); //�õ�ѡ����ļ�
				}
				if (mediaFile != null) {
					try {
						fileURL = mediaFile.toURL(); //�õ��ļ���URL��ַ
					} catch (MalformedURLException ex) {
						ex.printStackTrace(); //���������Ϣ
						showMessage("�򿪴���"); //��ʾ������Ϣ
					}
					startPlayer(fileURL.toString()); //��ʼ���Ŵ򿪵��ļ�
				}
			}
		});
		openURL.addActionListener(new ActionListener() { //��URL��ť�¼�����
			public void actionPerformed(ActionEvent event) {
				String addressName =JOptionPane.showInputDialog(player.this, "����URL��ַ");
				if (addressName != null)
					startPlayer(addressName); //��ʼ���Ŵ򿪵�URL
			}
		});
		Manager.setHint(Manager.LIGHTWEIGHT_RENDERER, Boolean.TRUE);

		
		setSize(800, 600); //���ô��ڴ�С
		setVisible(true); //���ô���Ϊ����
		
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
	}
	//��ʼ��������
	public void startPlayer(String mediaLocation) {
		if (player != null)
			//����������ǿ�����ȥ��ǰ�Ĳ��������
			if (visualMedia != null)
				container.remove(visualMedia); //�������visualMedia�ǿ�����ȥ
		if (mediaControl != null) {
			container.remove(mediaControl); //�������mediaControl�ǿ�����ȥ
			player.close(); //�رղ�����
		}
		MediaLocator mediaLocator = new MediaLocator(mediaLocation); //ý�嶨λ��
		if (mediaLocator == null) {
			showMessage("���ļ�����"); //��ʾ������Ϣ
			return;
		}
		try {
			player = Manager.createPlayer(mediaLocator); //�õ�������ʵ��
			((Controller) player).addControllerListener((ControllerListener) new PlayerEventHandler()); //���Ӳ��ſ�����
			player.realize();
		} catch (Exception ex) {
			ex.printStackTrace();
			showMessage("�򿪴���"); //��ʾ������Ϣ
		}
	}
	//ȡ��ý�����
	public void getMediaComponents() {
		visualMedia = player.getVisualComponent(); //ȡ����Ƶ��ʾ���
		//�������visualMedia�ǿ�����뵽�������ݴ���
		if (visualMedia != null) {
			container.add(visualMedia, BorderLayout.CENTER);
			pack();
		}
		mediaControl = player.getControlPanelComponent(); //ȡ�ò��ſ������
		//�������visualMedia�ǿ�����뵽�������ݴ���
		if (mediaControl != null)
			container.add(mediaControl, BorderLayout.SOUTH);
	}
	//�������¼�����
	private class PlayerEventHandler extends ControllerAdapter {

		public void realizeComplete(RealizeCompleteEvent realizeDoneEvent) {
			player.prefetch(); //Ԥȡý������
		}
		//���Ԥȡý�����ݺ󣬿�ʼ����ý��
		public void prefetchComplete(PrefetchCompleteEvent prefetchDoneEvent) {
			getMediaComponents();
			validate();
			player.start(); //��ʼ����ý��
		}
		//���ý�岥����ϣ���������ý��ʱ�䲢ֹͣý�岥����
		public void endOfMedia(EndOfMediaEvent mediaEndEvent) {
			
			player.stop(); // ֹͣý�岥��
		}
	}
	public void showMessage(String s) {
		JOptionPane.showMessageDialog(this, s);	//��ʾ��ʾ��Ϣ
	}
	public static void main(String args[]) {
		new player();
	}
}