import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.User;

import Server.Client;
import Server.server;

/*
 * zhuce.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class zhuce extends javax.swing.JFrame {

	/** Creates new form zhuce */
	public zhuce() {
		initComponents();

		this.setLocationRelativeTo(null);
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
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jFormattedTextField1 = new javax.swing.JFormattedTextField();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel4 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jPasswordField3 = new javax.swing.JPasswordField();
		jLabel6 = new javax.swing.JLabel();
		jFormattedTextField2 = new javax.swing.JFormattedTextField();
		jTextField1 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/ע��.png"))); // NOI18N

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel2.setText("\u90ae\u7bb1\uff1a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel3.setText("\u5bc6\u7801\uff1a");

		jPasswordField1.setFont(new java.awt.Font("����", 0, 18));

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel4.setText("\u540d\u5b57\uff1a");

		jButton2.setBackground(new java.awt.Color(0, 204, 255));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 25));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("  \u6211\u586b\u597d\u5566\uff01");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton2ActionPerformed(evt);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jPasswordField3.setFont(new java.awt.Font("����", 0, 18));

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel6.setText("\u786e\u8ba4\u5bc6\u7801\uff1a");

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jLabel5.setText("\u624b\u673a\uff1a");

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
										.addGap(207, 207, 207)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jLabel3)
																		.addComponent(
																				jLabel2)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jPasswordField3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																384,
																Short.MAX_VALUE)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																384,
																Short.MAX_VALUE)
														.addComponent(
																jFormattedTextField1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																384,
																Short.MAX_VALUE))
										.addGap(288, 288, 288))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap(389, Short.MAX_VALUE)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												260,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(355, 355, 355))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(252, 252, 252)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addComponent(jLabel5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jFormattedTextField2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																387,
																Short.MAX_VALUE))
										.addContainerGap(288, Short.MAX_VALUE)));
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
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel2)
																		.addGap(
																				35,
																				35,
																				35)
																		.addComponent(
																				jLabel3))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jFormattedTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				43,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				22,
																				22,
																				22)
																		.addComponent(
																				jPasswordField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				45,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(28, 28, 28)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel6)
														.addComponent(
																jPasswordField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																45,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(33, 33, 33)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addComponent(
																jFormattedTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																43,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(35, 35, 35)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																46,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																39,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(43, 43, 43)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												57, Short.MAX_VALUE).addGap(
												127, 127, 127)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 994,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 679,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)
			throws UnknownHostException, IOException {
		if (!this.jPasswordField1.getText().equals(
				this.jPasswordField3.getText())) {
			JOptionPane.showMessageDialog(this, "�������벻һ��");
			return;
		}

		try {
			Client c = new Client();
			User u = c.zhuce(this.jFormattedTextField1.getText(),
					this.jPasswordField1.getText(), this.jFormattedTextField2
							.getText(),this.jTextField1.getText());
			if (u == null)
				JOptionPane.showMessageDialog(this, "ע��ʧ����T-T��");
			else
				JOptionPane.showMessageDialog(this, "ע��ɹ���>-<��");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton2;
	private javax.swing.JFormattedTextField jFormattedTextField1;
	private javax.swing.JFormattedTextField jFormattedTextField2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField3;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}