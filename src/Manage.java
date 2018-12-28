import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Server.server;




public class Manage extends JFrame  {
	private static final long serialVersionUID = 5870864087464173884L;

	private final int maxPageNum = 99;

	private JPanel jPanelNorth, jPanelSouth, jPanelCenter;
	private JButton jButtonFirst, jButtonLast, jButtonNext, jButtonPre, jButtonAdd, jButtonDelete, jButtonUpdate,
			jButtonFind;
	private JLabel currPageNumJLabel;
	private JTextField condition;
	public static JTable jTable;
	private JScrollPane jScrollPane;
	private DefaultTableModel myTableModel;

	public static String[] column = { "id","昵称", "邮箱",
			"粉丝", "电话","密码",
			 };
	public static int currPageNum = 1;

	public Manage() throws Exception {
		init();
		this.setLocationRelativeTo(null);
	}

	private void init() throws Exception {
		setTitle("后台用户管理");

		// north panel
		jPanelNorth = new JPanel();
		jPanelNorth.setLayout(new GridLayout(1, 5));
		condition = new JTextField("");
		condition.addKeyListener(new FindListener());
		jPanelNorth.add(condition);
		// query by name
		jButtonFind = new JButton("查找");
		jButtonFind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					find();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jButtonFind.addKeyListener(new FindListener());
		// add
		jPanelNorth.add(jButtonFind);
		jButtonAdd = new JButton("添加");
		jButtonAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jPanelNorth.add(jButtonAdd);
		// delete
		jButtonDelete = new JButton("删除");
		jButtonDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jPanelNorth.add(jButtonDelete);
		// update
		jButtonUpdate = new JButton("更新");
		jButtonUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		jPanelNorth.add(jButtonUpdate);

		// center panel
		jPanelCenter = new JPanel();
		jPanelCenter.setLayout(new GridLayout(1, 1));

		// init jTable
		String[][] result = server.list(currPageNum);
		myTableModel = new DefaultTableModel(result, column);
		jTable = new JTable(myTableModel);
		DefaultTableCellRenderer cr = new DefaultTableCellRenderer();
		cr.setHorizontalAlignment(JLabel.CENTER);
		jTable.setDefaultRenderer(Object.class, cr);
		initJTable(jTable, result);

		jScrollPane = new JScrollPane(jTable);
		jPanelCenter.add(jScrollPane);

		// south panel
		jPanelSouth = new JPanel();
		jPanelSouth.setLayout(new GridLayout(1, 5));

		jButtonFirst = new JButton("首页");
		jButtonFirst.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currPageNum = 1;
				String[][] result = null;
				try {
					result = server.list(currPageNum);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				initJTable(jTable, result);
				currPageNumJLabel.setText("第 " + currPageNum
						+ "/99 页");
			}
		});
		jButtonPre = new JButton("上一页");
		jButtonPre.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				currPageNum--;
				if (currPageNum <= 0) {
					currPageNum = 1;
				}
				String[][] result = null;
				try {
					result = server.list(currPageNum);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				initJTable(jTable, result);
				currPageNumJLabel.setText("第 " + currPageNum
						+"/99 页");
			}
		});
		jButtonNext = new JButton("下一页");
		jButtonNext.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currPageNum++;
				if (currPageNum > maxPageNum) {
					currPageNum = maxPageNum;
				}
				String[][] result = null;
				try {
					result = server.list(currPageNum);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				initJTable(jTable, result);
				currPageNumJLabel.setText("第 " + currPageNum
						+"/99 页");
			}
		});
		jButtonLast = new JButton("末页");
		jButtonLast.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currPageNum = maxPageNum;
				String[][] result = null;
				try {
					result = server.list(currPageNum);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				initJTable(jTable, result);
				currPageNumJLabel.setText("第 " + currPageNum
						+"/99 页");
			}
		});

		currPageNumJLabel = new JLabel(
				"第 " + currPageNum + "/99 页");
		currPageNumJLabel.setHorizontalAlignment(JLabel.CENTER);

		jPanelSouth.add(jButtonFirst);
		jPanelSouth.add(jButtonPre);
		jPanelSouth.add(currPageNumJLabel);
		jPanelSouth.add(jButtonNext);
		jPanelSouth.add(jButtonLast);

		this.add(jPanelNorth, BorderLayout.NORTH);
		this.add(jPanelCenter, BorderLayout.CENTER);
		this.add(jPanelSouth, BorderLayout.SOUTH);

		setBounds(400, 200, 750, 340);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}

	public static void initJTable(JTable jTable, String[][] result) {
		((DefaultTableModel) jTable.getModel()).setDataVector(result, column);
		jTable.setRowHeight(20);
		TableColumn firsetColumn = jTable.getColumnModel().getColumn(0);
		firsetColumn.setPreferredWidth(30);
		firsetColumn.setMaxWidth(30);
		firsetColumn.setMinWidth(30);
		TableColumn secondColumn = jTable.getColumnModel().getColumn(1);
		secondColumn.setPreferredWidth(60);
		secondColumn.setMaxWidth(60);
		secondColumn.setMinWidth(60);
		TableColumn thirdColumn = jTable.getColumnModel().getColumn(2);
		thirdColumn.setPreferredWidth(90);
		thirdColumn.setMaxWidth(90);
		thirdColumn.setMinWidth(90);
		TableColumn fourthColumn = jTable.getColumnModel().getColumn(3);
		fourthColumn.setPreferredWidth(30);
		fourthColumn.setMaxWidth(30);
		fourthColumn.setMinWidth(30);
		TableColumn seventhColumn = jTable.getColumnModel().getColumn(6);
		seventhColumn.setPreferredWidth(30);
		seventhColumn.setMaxWidth(30);
		seventhColumn.setMinWidth(30);
		TableColumn ninthColumn = jTable.getColumnModel().getColumn(8);
		ninthColumn.setPreferredWidth(90);
		ninthColumn.setMaxWidth(90);
		ninthColumn.setMinWidth(90);
		
	}

	private class FindListener extends KeyAdapter {

		@Override
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				try {
					find();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}

	private void find() throws Exception {
		currPageNum = 0;
		String param = condition.getText();
		if ("".equals(param) || param == null) {
			initJTable(Manage.jTable, null);
			currPageNumJLabel.setText("查询结果");
			return;
		}
		String[][] result = server.queryByName(param);
		condition.setText("");
		initJTable(Manage.jTable, result);
		currPageNumJLabel.setText("查询结果");
	}
}
