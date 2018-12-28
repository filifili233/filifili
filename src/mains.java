import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/*
 * mains.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class mains extends javax.swing.JFrame implements Runnable {

	/** Creates new form mains */
	public mains() {
		initComponents();

		this.setLocationRelativeTo(null);
		imgrote();
		Thread myt = new Thread(this);
		myt.start();
		fanju();
		donghua();
		guochuang();
		guichu();
		shishang();
		keji();
		shenghuo();
		yinyue();
		wudao();
		youxi();
		yule();
		yingshi();
	}

	ArrayList<Image> imgs = new ArrayList<Image>();
	int i = 0;

	private void imgrote() {

		for (int i = 1; i <= 3; i++) {
			Image img = new ImageIcon("imgs\\" + i + ".jpg").getImage()
					.getScaledInstance(this.jButton2.getWidth(),
							this.jButton2.getHeight(), Image.SCALE_SMOOTH);
			imgs.add(img);
		}
		this.jButton2.setIcon(new ImageIcon(imgs.get(0)));

	}

	final JPopupMenu fanjuMenu = new JPopupMenu();

	public void fanju() {

		JMenuItem menuItem1 = new JMenuItem("连载动画");
		JMenuItem menuItem2 = new JMenuItem("完结动画");
		JMenuItem menuItem3 = new JMenuItem("资讯");
		JMenuItem menuItem4 = new JMenuItem("官方延伸");
		JMenuItem menuItem5 = new JMenuItem("番剧索引");

		fanjuMenu.add(menuItem1);
		fanjuMenu.add(menuItem2);
		fanjuMenu.add(menuItem3);
		fanjuMenu.add(menuItem4);
		fanjuMenu.add(menuItem5);

	}

	final JPopupMenu donghuaMenu = new JPopupMenu();

	public void donghua() {

		JMenuItem menuItem1 = new JMenuItem("MAD·AMV");
		JMenuItem menuItem2 = new JMenuItem("MMD·3D");
		JMenuItem menuItem3 = new JMenuItem("综合");

		donghuaMenu.add(menuItem1);
		donghuaMenu.add(menuItem2);
		donghuaMenu.add(menuItem3);

	}

	final JPopupMenu guochuangMenu = new JPopupMenu();

	public void guochuang() {

		JMenuItem menuItem1 = new JMenuItem("国产动画");
		JMenuItem menuItem2 = new JMenuItem("布袋戏");
		JMenuItem menuItem3 = new JMenuItem("资讯");
		JMenuItem menuItem4 = new JMenuItem("新番时间表");
		JMenuItem menuItem5 = new JMenuItem("国产动画索引");

		guochuangMenu.add(menuItem1);
		guochuangMenu.add(menuItem2);
		guochuangMenu.add(menuItem3);
		guochuangMenu.add(menuItem4);
		guochuangMenu.add(menuItem5);

	}

	final JPopupMenu guichuMenu = new JPopupMenu();

	public void guichu() {

		JMenuItem menuItem1 = new JMenuItem("鬼畜调教");
		JMenuItem menuItem2 = new JMenuItem("音MAD");
		JMenuItem menuItem3 = new JMenuItem("人力VOCALOID");
		JMenuItem menuItem4 = new JMenuItem("教程演示");

		guichuMenu.add(menuItem1);
		guichuMenu.add(menuItem2);
		guichuMenu.add(menuItem3);
		guichuMenu.add(menuItem4);

	}

	final JPopupMenu shishangMenu = new JPopupMenu();

	public void shishang() {

		JMenuItem menuItem1 = new JMenuItem("美妆");
		JMenuItem menuItem2 = new JMenuItem("服饰");
		JMenuItem menuItem3 = new JMenuItem("健身");
		JMenuItem menuItem4 = new JMenuItem("资讯");

		shishangMenu.add(menuItem1);
		shishangMenu.add(menuItem2);
		shishangMenu.add(menuItem3);
		shishangMenu.add(menuItem4);

	}

	final JPopupMenu kejiMenu = new JPopupMenu();

	public void keji() {

		JMenuItem menuItem1 = new JMenuItem("趣味科普人文");
		JMenuItem menuItem2 = new JMenuItem("野生技术协会");
		JMenuItem menuItem3 = new JMenuItem("演讲·公开课");
		JMenuItem menuItem4 = new JMenuItem("星海");
		JMenuItem menuItem5 = new JMenuItem("数码");
		JMenuItem menuItem6 = new JMenuItem("机械");
		JMenuItem menuItem7 = new JMenuItem("汽车");
		kejiMenu.add(menuItem1);
		kejiMenu.add(menuItem2);
		kejiMenu.add(menuItem3);
		kejiMenu.add(menuItem4);
		kejiMenu.add(menuItem5);
		kejiMenu.add(menuItem6);
		kejiMenu.add(menuItem7);

	}

	final JPopupMenu shenghuoMenu = new JPopupMenu();

	public void shenghuo() {

		JMenuItem menuItem1 = new JMenuItem("搞笑");
		JMenuItem menuItem2 = new JMenuItem("日常");
		JMenuItem menuItem3 = new JMenuItem("手工");
		JMenuItem menuItem4 = new JMenuItem("绘画");
		JMenuItem menuItem5 = new JMenuItem("运动");
		JMenuItem menuItem6 = new JMenuItem("美食圈");
		JMenuItem menuItem7 = new JMenuItem("其他");

		shenghuoMenu.add(menuItem1);
		shenghuoMenu.add(menuItem2);
		shenghuoMenu.add(menuItem3);
		shenghuoMenu.add(menuItem4);
		shenghuoMenu.add(menuItem5);
		shenghuoMenu.add(menuItem6);
		shenghuoMenu.add(menuItem7);

	}

	final JPopupMenu yinyueMenu = new JPopupMenu();

	public void yinyue() {

		JMenuItem menuItem1 = new JMenuItem("原创音乐");
		JMenuItem menuItem2 = new JMenuItem("翻唱");
		JMenuItem menuItem3 = new JMenuItem("VOCALOID·UTAU");
		JMenuItem menuItem4 = new JMenuItem("演奏");
		JMenuItem menuItem5 = new JMenuItem("OP/ED/OST");
		JMenuItem menuItem6 = new JMenuItem("音乐选集");

		yinyueMenu.add(menuItem1);
		yinyueMenu.add(menuItem2);
		yinyueMenu.add(menuItem3);
		yinyueMenu.add(menuItem4);
		yinyueMenu.add(menuItem5);
		yinyueMenu.add(menuItem6);

	}

	final JPopupMenu wudaoMenu = new JPopupMenu();

	public void wudao() {

		JMenuItem menuItem1 = new JMenuItem("宅舞");
		JMenuItem menuItem2 = new JMenuItem("三次元舞");
		JMenuItem menuItem3 = new JMenuItem("舞蹈教程");

		wudaoMenu.add(menuItem1);
		wudaoMenu.add(menuItem2);
		wudaoMenu.add(menuItem3);

	}

	final JPopupMenu yuleMenu = new JPopupMenu();

	public void yule() {

		JMenuItem menuItem1 = new JMenuItem("综艺");
		JMenuItem menuItem2 = new JMenuItem("明星");
		JMenuItem menuItem3 = new JMenuItem("korea相关");

		yuleMenu.add(menuItem1);
		yuleMenu.add(menuItem2);
		yuleMenu.add(menuItem3);

	}

	final JPopupMenu youxiMenu = new JPopupMenu();

	public void youxi() {

		JMenuItem menuItem1 = new JMenuItem("单机游戏");
		JMenuItem menuItem2 = new JMenuItem("手机游戏");
		JMenuItem menuItem3 = new JMenuItem("网络游戏");
		JMenuItem menuItem4 = new JMenuItem("电子竞技");
		JMenuItem menuItem5 = new JMenuItem("桌牌游戏");
		JMenuItem menuItem6 = new JMenuItem("音游");
		JMenuItem menuItem7 = new JMenuItem("游戏赛事");
		youxiMenu.add(menuItem1);
		youxiMenu.add(menuItem2);
		youxiMenu.add(menuItem3);
		youxiMenu.add(menuItem4);
		youxiMenu.add(menuItem5);
		youxiMenu.add(menuItem6);
		youxiMenu.add(menuItem7);

	}

	final JPopupMenu yingshiMenu = new JPopupMenu();

	public void yingshi() {

		JMenuItem menuItem1 = new JMenuItem("影视杂谈");
		JMenuItem menuItem2 = new JMenuItem("影视剪辑");
		JMenuItem menuItem3 = new JMenuItem("短片");
		JMenuItem menuItem4 = new JMenuItem("预告·资讯");
		JMenuItem menuItem5 = new JMenuItem("特摄");

		yingshiMenu.add(menuItem1);
		yingshiMenu.add(menuItem2);
		yingshiMenu.add(menuItem3);
		yingshiMenu.add(menuItem4);
		yingshiMenu.add(menuItem5);

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel15 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jButton6 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jButton7 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jButton8 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jButton10 = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jButton11 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jButton12 = new javax.swing.JButton();
		jLabel11 = new javax.swing.JLabel();
		jButton13 = new javax.swing.JButton();
		jLabel12 = new javax.swing.JLabel();
		jButton14 = new javax.swing.JButton();
		jLabel13 = new javax.swing.JLabel();
		jButton15 = new javax.swing.JButton();
		jLabel14 = new javax.swing.JLabel();
		jButton16 = new javax.swing.JButton();
		jLabel16 = new javax.swing.JLabel();
		jButton17 = new javax.swing.JButton();
		jLabel21 = new javax.swing.JLabel();
		jButton21 = new javax.swing.JButton();
		jLabel17 = new javax.swing.JLabel();
		jButton22 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel19 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jButton23 = new javax.swing.JButton();
		jButton24 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel18 = new javax.swing.JLabel();
		jLabel20 = new javax.swing.JLabel();
		jButton20 = new javax.swing.JButton();
		jButton19 = new javax.swing.JButton();
		jButton18 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jLabel22 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/动图1.gif"))); // NOI18N

		jPanel2.setBackground(new java.awt.Color(255, 255, 255));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton4.setBackground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u756a\u5267 ");
		jButton4.setBorder(null);
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton4MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton4MouseExited(evt);
			}
		});
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton4ActionPerformed(evt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton5.setBackground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u52a8\u753b");
		jButton5.setBorder(null);
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton5MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton5MouseExited(evt);
			}
		});

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton6.setBackground(new java.awt.Color(255, 255, 255));
		jButton6.setText("\u56fd\u521b");
		jButton6.setBorder(null);
		jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton6MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton6MouseExited(evt);
			}
		});

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton7.setBackground(new java.awt.Color(255, 255, 255));
		jButton7.setText("\u9b3c\u755c");
		jButton7.setBorder(null);
		jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton7MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton7MouseExited(evt);
			}
		});

		jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton8.setBackground(new java.awt.Color(255, 255, 255));
		jButton8.setText("\u65f6\u5c1a");
		jButton8.setBorder(null);
		jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton8MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton8MouseExited(evt);
			}
		});

		jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton10.setBackground(new java.awt.Color(255, 255, 255));
		jButton10.setText("\u79d1\u6280");
		jButton10.setBorder(null);
		jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton10MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton10MouseExited(evt);
			}
		});

		jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton11.setBackground(new java.awt.Color(255, 255, 255));
		jButton11.setText("\u751f\u6d3b");
		jButton11.setBorder(null);
		jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton11MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton11MouseExited(evt);
			}
		});

		jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton12.setBackground(new java.awt.Color(255, 255, 255));
		jButton12.setText("\u97f3\u4e50");
		jButton12.setBorder(null);
		jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton12MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton12MouseExited(evt);
			}
		});

		jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton13.setBackground(new java.awt.Color(255, 255, 255));
		jButton13.setText("\u821e\u8e48");
		jButton13.setBorder(null);
		jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton13MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton13MouseExited(evt);
			}
		});

		jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton14.setBackground(new java.awt.Color(255, 255, 255));
		jButton14.setText("\u6e38\u620f");
		jButton14.setBorder(null);
		jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton14MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton14MouseExited(evt);
			}
		});

		jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton15.setBackground(new java.awt.Color(255, 255, 255));
		jButton15.setText("\u5a31\u4e50");
		jButton15.setBorder(null);
		jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton15MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton15MouseExited(evt);
			}
		});

		jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton16.setBackground(new java.awt.Color(255, 255, 255));
		jButton16.setText("\u5e7f\u544a");
		jButton16.setBorder(null);

		jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton17.setBackground(new java.awt.Color(255, 255, 255));
		jButton17.setText("\u5f71\u89c6");
		jButton17.setBorder(null);
		jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				jButton17MouseEntered(evt);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				jButton17MouseExited(evt);
			}
		});

		jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件1.png"))); // NOI18N

		jButton21.setBackground(new java.awt.Color(255, 255, 255));
		jButton21.setText("\u76f4\u64ad");
		jButton21.setBorder(null);

		jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件2.png"))); // NOI18N

		jButton22.setBackground(new java.awt.Color(255, 255, 255));
		jButton22.setText("\u5c0f\u9ed1\u5c4b");
		jButton22.setBorder(null);
		jButton22.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton22ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jLabel2)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton4)
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jLabel3)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton5)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												18,
																												Short.MAX_VALUE)
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel4)
																														.addGroup(
																																jPanel2Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jButton6)
																																		.addGap(
																																				17,
																																				17,
																																				17)
																																		.addGroup(
																																				jPanel2Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jLabel5)
																																						.addGroup(
																																								jPanel2Layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jButton7)
																																										.addGap(
																																												17,
																																												17,
																																												17)
																																										.addGroup(
																																												jPanel2Layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.LEADING)
																																														.addComponent(
																																																jLabel6)
																																														.addComponent(
																																																jButton8))))))))))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel8)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton10)
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel9)
																						.addGroup(
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton11)
																										.addGap(
																												18,
																												18,
																												18)
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel10)
																														.addGroup(
																																jPanel2Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jButton12)
																																		.addGap(
																																				18,
																																				18,
																																				18)
																																		.addGroup(
																																				jPanel2Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.LEADING)
																																						.addComponent(
																																								jLabel11)
																																						.addGroup(
																																								jPanel2Layout
																																										.createSequentialGroup()
																																										.addComponent(
																																												jButton13)
																																										.addGap(
																																												18,
																																												18,
																																												18)
																																										.addGroup(
																																												jPanel2Layout
																																														.createParallelGroup(
																																																javax.swing.GroupLayout.Alignment.LEADING)
																																														.addComponent(
																																																jLabel12)
																																														.addGroup(
																																																jPanel2Layout
																																																		.createSequentialGroup()
																																																		.addComponent(
																																																				jButton14)
																																																		.addGap(
																																																				18,
																																																				18,
																																																				18)
																																																		.addGroup(
																																																				jPanel2Layout
																																																						.createParallelGroup(
																																																								javax.swing.GroupLayout.Alignment.LEADING)
																																																						.addComponent(
																																																								jLabel13)
																																																						.addGroup(
																																																								jPanel2Layout
																																																										.createSequentialGroup()
																																																										.addComponent(
																																																												jButton15)
																																																										.addGap(
																																																												17,
																																																												17,
																																																												17)
																																																										.addGroup(
																																																												jPanel2Layout
																																																														.createParallelGroup(
																																																																javax.swing.GroupLayout.Alignment.LEADING)
																																																														.addComponent(
																																																																jLabel14)
																																																														.addGroup(
																																																																jPanel2Layout
																																																																		.createSequentialGroup()
																																																																		.addComponent(
																																																																				jButton16)
																																																																		.addGap(
																																																																				17,
																																																																				17,
																																																																				17)
																																																																		.addGroup(
																																																																				jPanel2Layout
																																																																						.createParallelGroup(
																																																																								javax.swing.GroupLayout.Alignment.LEADING)
																																																																						.addComponent(
																																																																								jLabel16)
																																																																						.addComponent(
																																																																								jButton17))))))
																																																		.addGap(
																																																				18,
																																																				18,
																																																				18)
																																																		.addGroup(
																																																				jPanel2Layout
																																																						.createParallelGroup(
																																																								javax.swing.GroupLayout.Alignment.LEADING)
																																																						.addComponent(
																																																								jLabel21)
																																																						.addComponent(
																																																								jButton21))))))))))))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton22)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				15,
																				15,
																				15)
																		.addComponent(
																				jLabel17)))
										.addContainerGap(26, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton4))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel3)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton5))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton6))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton7))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton8))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel8)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton10))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel9)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton11))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel10)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton12))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel11)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton13))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel12)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton14))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel13)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton15))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel14)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton16))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel16)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton17))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel21)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton21))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel17)
																		.addGap(
																				6,
																				6,
																				6)
																		.addComponent(
																				jButton22)))
										.addContainerGap()));

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/1.jpg"))); // NOI18N
		jButton2.setBorder(null);

		jLabel7.setBackground(new java.awt.Color(255, 255, 255));
		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/QQ截图20180929212450.png"))); // NOI18N
		jLabel7.addAncestorListener(new javax.swing.event.AncestorListener() {
			public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
			}

			public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
				jLabel7AncestorAdded(evt);
			}

			public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
			}
		});

		jPanel3.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 1003,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 45,
				Short.MAX_VALUE));

		jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/ab.jpg"))); // NOI18N

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/985.png"))); // NOI18N
		jButton3.setBorder(null);

		jPanel4.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 740,
				Short.MAX_VALUE));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 150,
				Short.MAX_VALUE));

		jPanel5.setBackground(new java.awt.Color(255, 255, 255));

		jButton23.setBackground(new java.awt.Color(255, 255, 255));
		jButton23.setText("\u6295\u7a3f");
		jButton23.setBorder(null);

		jButton24.setBackground(new java.awt.Color(255, 255, 255));
		jButton24.setText("\u6211\u7684\u4fe1\u606f");
		jButton24.setBorder(null);
		jButton24.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton24ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createSequentialGroup().addGap(878, 878, 878)
						.addComponent(jButton24,
								javax.swing.GroupLayout.PREFERRED_SIZE, 65,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								49, 49, 49).addComponent(jButton23,
								javax.swing.GroupLayout.PREFERRED_SIZE, 65,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(91, Short.MAX_VALUE)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel5Layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jButton23,
								javax.swing.GroupLayout.DEFAULT_SIZE, 31,
								Short.MAX_VALUE).addComponent(jButton24,
								javax.swing.GroupLayout.DEFAULT_SIZE, 31,
								Short.MAX_VALUE)));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/背景1.png"))); // NOI18N

		jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/gg.png"))); // NOI18N

		jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/有点.png"))); // NOI18N

		jButton20.setBackground(new java.awt.Color(255, 255, 255));
		jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/字4.png"))); // NOI18N
		jButton20.setBorder(null);

		jButton19.setBackground(new java.awt.Color(255, 255, 255));
		jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/字3.png"))); // NOI18N
		jButton19.setBorder(null);

		jButton18.setBackground(new java.awt.Color(255, 255, 255));
		jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/字2.png"))); // NOI18N
		jButton18.setBorder(null);

		jButton9.setBackground(new java.awt.Color(255, 255, 255));
		jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/字1.png"))); // NOI18N
		jButton9.setBorder(null);

		jPanel6.setBackground(new java.awt.Color(246, 249, 250));

		jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/底端.png"))); // NOI18N

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel22,
								javax.swing.GroupLayout.PREFERRED_SIZE, 1109,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(25, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel6Layout.createSequentialGroup().addComponent(jLabel22)
						.addContainerGap(108, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				159,
																				159,
																				159)
																		.addComponent(
																				jPanel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				692,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				36,
																				36,
																				36)
																		.addComponent(
																				jLabel15))
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(
																				jPanel5,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				1148,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				80,
																				80,
																				80)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel18)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGroup(
																																				jPanel1Layout
																																						.createParallelGroup(
																																								javax.swing.GroupLayout.Alignment.TRAILING,
																																								false)
																																						.addComponent(
																																								jLabel20,
																																								javax.swing.GroupLayout.PREFERRED_SIZE,
																																								716,
																																								javax.swing.GroupLayout.PREFERRED_SIZE)
																																						.addGroup(
																																								jPanel1Layout
																																										.createSequentialGroup()
																																										.addGap(
																																												10,
																																												10,
																																												10)
																																										.addComponent(
																																												jButton9)
																																										.addGap(
																																												40,
																																												40,
																																												40)
																																										.addComponent(
																																												jButton18)
																																										.addGap(
																																												31,
																																												31,
																																												31)
																																										.addComponent(
																																												jButton19)
																																										.addPreferredGap(
																																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																												javax.swing.GroupLayout.DEFAULT_SIZE,
																																												Short.MAX_VALUE)
																																										.addComponent(
																																												jButton20)))
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jLabel19))
																														.addComponent(
																																jButton3))
																										.addGap(
																												54,
																												54,
																												54)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING,
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jPanel3,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				Short.MAX_VALUE)
																																		.addGap(
																																				265,
																																				265,
																																				265))
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addGap(
																																				5,
																																				5,
																																				5)
																																		.addComponent(
																																				jPanel4,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton2)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												540,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												1058,
																												javax.swing.GroupLayout.PREFERRED_SIZE))))
														.addComponent(
																jPanel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jPanel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPanel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jPanel2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel15))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jButton2)
																						.addComponent(
																								jLabel7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								183,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel18)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel20,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												92,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jButton9)
																														.addComponent(
																																jButton18)
																														.addComponent(
																																jButton19)
																														.addComponent(
																																jButton20)))
																						.addComponent(
																								jLabel19))
																		.addGap(
																				26,
																				26,
																				26)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				79,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(33, 33, 33)
										.addComponent(
												jPanel6,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1147,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		new video().setVisible(true);
		
	}

	private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {
		new Personal().setVisible(true);
	}

	private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {
		new xiaoheiwu().setVisible(true);
	}

	private void jLabel7AncestorAdded(javax.swing.event.AncestorEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton17MouseExited(java.awt.event.MouseEvent evt) {
		this.yingshiMenu.setVisible(false);
	}

	private void jButton17MouseEntered(java.awt.event.MouseEvent evt) {
		yingshiMenu.show(evt.getComponent(), this.jButton2.getX() - 80,
				jButton2.getY() - 185);
	}

	private void jButton15MouseExited(java.awt.event.MouseEvent evt) {
		this.yuleMenu.setVisible(false);
	}

	private void jButton15MouseEntered(java.awt.event.MouseEvent evt) {
		yuleMenu.show(evt.getComponent(), this.jButton2.getX() - 80, jButton2
				.getY() - 185);
	}

	private void jButton14MouseExited(java.awt.event.MouseEvent evt) {
		this.youxiMenu.setVisible(false);
	}

	private void jButton14MouseEntered(java.awt.event.MouseEvent evt) {
		youxiMenu.show(evt.getComponent(), this.jButton2.getX() - 80, jButton2
				.getY() - 185);
	}

	private void jButton13MouseExited(java.awt.event.MouseEvent evt) {
		this.wudaoMenu.setVisible(false);
	}

	private void jButton13MouseEntered(java.awt.event.MouseEvent evt) {
		wudaoMenu.show(evt.getComponent(), this.jButton2.getX() - 80, jButton2
				.getY() - 185);
	}

	private void jButton12MouseExited(java.awt.event.MouseEvent evt) {
		this.yinyueMenu.setVisible(false);
	}

	private void jButton12MouseEntered(java.awt.event.MouseEvent evt) {
		yinyueMenu.show(evt.getComponent(), this.jButton2.getX() - 80, jButton2
				.getY() - 185);
	}

	private void jButton11MouseExited(java.awt.event.MouseEvent evt) {
		this.shenghuoMenu.setVisible(false);
	}

	private void jButton11MouseEntered(java.awt.event.MouseEvent evt) {
		shenghuoMenu.show(evt.getComponent(), this.jButton2.getX() - 80,
				jButton2.getY() - 185);
	}

	private void jButton10MouseExited(java.awt.event.MouseEvent evt) {
		this.kejiMenu.setVisible(false);
	}

	private void jButton10MouseEntered(java.awt.event.MouseEvent evt) {
		kejiMenu.show(evt.getComponent(), this.jButton2.getX() - 80, jButton2
				.getY() - 185);
	}

	private void jButton8MouseExited(java.awt.event.MouseEvent evt) {
		this.shishangMenu.setVisible(false);
	}

	private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {
		shishangMenu.show(evt.getComponent(), this.jButton2.getX() - 80,
				jButton2.getY() - 185);
	}

	private void jButton7MouseExited(java.awt.event.MouseEvent evt) {
		this.guichuMenu.setVisible(false);
	}

	private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {
		guichuMenu.show(evt.getComponent(), this.jButton2.getX() - 80, jButton2
				.getY() - 185);
	}

	private void jButton6MouseExited(java.awt.event.MouseEvent evt) {
		this.guochuangMenu.setVisible(false);
	}

	private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {
		guochuangMenu.show(evt.getComponent(), this.jButton2.getX() - 80,
				jButton2.getY() - 185);
	}

	private void jButton5MouseExited(java.awt.event.MouseEvent evt) {
		this.donghuaMenu.setVisible(false);
	}

	private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {
		donghuaMenu.show(evt.getComponent(), this.jButton2.getX() - 80,
				jButton2.getY() - 185);
	}

	private void jButton4MouseExited(java.awt.event.MouseEvent evt) {
		this.fanjuMenu.setVisible(false);
	}

	private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {
		fanjuMenu.show(evt.getComponent(), this.jButton2.getX() - 80, jButton2
				.getY() - 185);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new mains().setVisible(true);
			}
		});
	}

	public void run() {

		while (true) {
			if (i == 3)
				i = 0;
			this.jButton2.setIcon(new ImageIcon(imgs.get(i)));
			i++;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton20;
	private javax.swing.JButton jButton21;
	private javax.swing.JButton jButton22;
	private javax.swing.JButton jButton23;
	private javax.swing.JButton jButton24;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel18;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel20;
	private javax.swing.JLabel jLabel21;
	private javax.swing.JLabel jLabel22;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	// End of variables declaration//GEN-END:variables

}