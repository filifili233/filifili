import java.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



import model.User;

import Server.Client;
import Server.server;
import java.awt.*; /*
 * Login.java
 *
 * Created on __DATE__, __TIME__
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;

/**
 *
 * @author  __USER__
 */
public class Login extends javax.swing.JDialog {

	/** Creates new form Login */
	public Login() {

		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPasswordField2 = new javax.swing.JPasswordField();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jFormattedTextField1 = new javax.swing.JFormattedTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jFormattedTextField2 = new javax.swing.JFormattedTextField();
		jLabel7 = new javax.swing.JLabel();

		jPasswordField2.setText("jPasswordField2");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/背景2.png"))); // NOI18N

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件4.png"))); // NOI18N

		jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件4.png"))); // NOI18N

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/二维码.png"))); // NOI18N

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/小件5.png"))); // NOI18N

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 36));
		jLabel6.setText("\u767b\u5f55");

		jRadioButton1.setText("\u8bb0\u4f4f\u6211");
		jRadioButton1.setBorder(null);

		jButton1.setBackground(new java.awt.Color(51, 204, 255));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u767b\u5f55");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton2.setBackground(new java.awt.Color(255, 255, 255));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jButton2.setForeground(new java.awt.Color(51, 51, 51));
		jButton2.setText("\u6ce8\u518c");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jFormattedTextField1.setForeground(new java.awt.Color(204, 204, 204));
		jFormattedTextField1.setText("\u4f60\u7684\u624b\u673a/\u90ae\u7bb1");
		jFormattedTextField1
				.addFocusListener(new java.awt.event.FocusAdapter() {
					public void focusLost(java.awt.event.FocusEvent evt) {
						jFormattedTextField1FocusLost(evt);
					}
				});
		jFormattedTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jFormattedTextField1KeyTyped(evt);
			}
		});

		jFormattedTextField2.setForeground(new java.awt.Color(204, 204, 204));
		jFormattedTextField2
				.setText("\u8bf7\u8f93\u5165\u9a8c\u8bc1\u7801(\u70b9\u51fb\u5237\u65b0)");
		jFormattedTextField2
				.addFocusListener(new java.awt.event.FocusAdapter() {
					public void focusLost(java.awt.event.FocusEvent evt) {
						jFormattedTextField2FocusLost(evt);
					}
				});
		jFormattedTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyTyped(java.awt.event.KeyEvent evt) {
				jFormattedTextField2KeyTyped(evt);
			}
		});

		jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabel7MouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jLabel1)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				10,
																				10,
																				10)
																		.addComponent(
																				jLabel4)))
										.addGap(7, 7, 7)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																76,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																66,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																483,
																Short.MAX_VALUE)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jRadioButton1)
																		.addContainerGap(
																				430,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jPasswordField1,
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jFormattedTextField1,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								444,
																								Short.MAX_VALUE))
																		.addContainerGap())
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jButton1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												198,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												35,
																												Short.MAX_VALUE)
																										.addComponent(
																												jButton2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												203,
																												javax.swing.GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jFormattedTextField2,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												177,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																												72,
																												Short.MAX_VALUE)
																										.addComponent(
																												jLabel7,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												187,
																												javax.swing.GroupLayout.PREFERRED_SIZE)))
																		.addGap(
																				47,
																				47,
																				47)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																40,
																Short.MAX_VALUE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																40,
																Short.MAX_VALUE)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																40,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								356,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jLabel4,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								407,
																								javax.swing.GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				30,
																				30,
																				30)
																		.addComponent(
																				jFormattedTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				53,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				31,
																				31,
																				31)
																		.addComponent(
																				jPasswordField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				52,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				35,
																				35,
																				35)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jFormattedTextField2,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								48,
																								Short.MAX_VALUE)
																						.addComponent(
																								jLabel7,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								48,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jRadioButton1)
																		.addGap(
																				18,
																				18,
																				18)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jButton1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								52,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								51,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addGap(
																				71,
																				71,
																				71)))
										.addGap(77, 77, 77)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1021,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException {
		try {
			Client c = new Client();
			User u = c.Login(this.jFormattedTextField1.getText(),this.jPasswordField1.getText());
			if (u == null)
				JOptionPane.showMessageDialog(this, "登录失败");
			else {
				new mains().setVisible(true);
				this.dispose();
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {
		ImageIcon img = new ImageIcon(
				(BufferedImage) CodePicture.createImage()[1]);
		this.jLabel7.setIcon(img);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new zhuce().setVisible(true);
	}

	private void jFormattedTextField2KeyTyped(java.awt.event.KeyEvent evt) {
		if (this.jFormattedTextField2.getText().equals("请输入验证码(点击刷新)"))
			this.jFormattedTextField2.setText("");
	}

	private void jFormattedTextField2FocusLost(java.awt.event.FocusEvent evt) {
		if (this.jFormattedTextField2.getText().equals(""))
			this.jFormattedTextField2.setText("请输入验证码(点击刷新)");
	}

	private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {
		if (this.jFormattedTextField1.getText().equals(""))
			this.jFormattedTextField1.setText("你的手机/邮箱");
	}

	private void jFormattedTextField1KeyTyped(java.awt.event.KeyEvent evt) {
		if (this.jFormattedTextField1.getText().equals("你的手机/邮箱"))
			this.jFormattedTextField1.setText("");
		return;

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JFormattedTextField jFormattedTextField1;
	private javax.swing.JFormattedTextField jFormattedTextField2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JRadioButton jRadioButton1;
	// End of variables declaration//GEN-END:variables

}
