package quanLyBanSach;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class LogIn_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JPasswordField txtPassword;

	// Đặt tên tài khoản và mật khẩu mặc định 
	private static final String defaultUsername = "admin";
	private static final String defaultPassword = "admin123";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn_GUI frame = new LogIn_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(800,500);
		setTitle("PAGEPAL");
		getContentPane().setLayout(null);

		JLabel lblTaiKhoan = new JLabel("Tài khoản");
		lblTaiKhoan.setBounds(235, 180, 87, 29);
		lblTaiKhoan.setForeground(Color.WHITE);
		lblTaiKhoan.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblTaiKhoan);

		JLabel lblTitleDN = new JLabel("ĐĂNG NHẬP");
		lblTitleDN.setBounds(326, 135, 123, 35);
		lblTitleDN.setForeground(Color.WHITE);
		lblTitleDN.setFont(new Font("Tahoma", Font.BOLD, 20));
		getContentPane().add(lblTitleDN);

		JLabel lblTenDangNhap = new JLabel("Mật khẩu");
		lblTenDangNhap.setBounds(235, 220, 87, 29);
		lblTenDangNhap.setForeground(Color.WHITE);
		lblTenDangNhap.setFont(new Font("Tahoma", Font.BOLD, 15));
		getContentPane().add(lblTenDangNhap);

		txtUserName = new JTextField();
		txtUserName.setBounds(346, 182, 208, 29);
		txtUserName.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(txtUserName);
		txtUserName.setColumns(10);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(346, 222, 208, 29);
		txtPassword.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(txtPassword);

		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StringBuilder sb = new StringBuilder();
				String enteredUsername = txtUserName.getText();
				String enteredPassword = new String(txtPassword.getPassword());

				if (enteredUsername.isEmpty()) {
					sb.append("Tên tài khoản không được trống.\n");
					txtUserName.setBackground(Color.RED);
				} else {
					txtUserName.setBackground(Color.WHITE);
				}

				if (enteredPassword.isEmpty()) {
					sb.append("Mật khẩu không được trống.\n");
					txtPassword.setBackground(Color.RED);
				} else {
					txtPassword.setBackground(Color.WHITE);
				}

				if (sb.length() > 0) {
					JOptionPane.showMessageDialog(btnDangNhap, sb.append("Sai tài khoản hoặc mật khẩu"));
				} else if (enteredUsername.equals(defaultUsername) && enteredPassword.equals(defaultPassword)) {
					// Hiển thị thông báo thành công nếu đăng nhập thành công
					JOptionPane.showMessageDialog(btnDangNhap, "Đăng nhập thành công!");
				} else {
					// Hiển thị thông báo lỗi nếu đăng nhập không thành công
					JOptionPane.showMessageDialog(btnDangNhap, "Sai tài khoản hoặc mật khẩu", "Lỗi", JOptionPane.ERROR_MESSAGE);
				}
			}


		});
		btnDangNhap.setBackground(new Color(0, 0, 255));
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDangNhap.setBounds(235, 304, 120, 29);
		getContentPane().add(btnDangNhap);
		
// Enter để đăng nhập
		txtPassword.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnDangNhap.doClick();
			}
		});
		txtUserName.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnDangNhap.doClick();
			}
		});
/*---------------------------------------------------------------------------------------------------------------------------------------------*/
// Nhớ mật khẩu
		 
/*---------------------------------------------------------------------------------------------------------------------------------------------*/
		
		JButton btnThot = new JButton("Thoát");
		btnThot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		btnThot.setBackground(new Color(0, 0, 255));
		btnThot.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThot.setBounds(442, 304, 120, 29);
		getContentPane().add(btnThot);
		
		JButton btnQuenMK = new JButton("Quên mật khẩu ?");
		btnQuenMK.setBackground(Color.LIGHT_GRAY);
		btnQuenMK.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnQuenMK.setBounds(411, 270, 143, 23);
		getContentPane().add(btnQuenMK);
		
				JLabel lblBG = new JLabel("");
				lblBG.setBounds(10, 0, 776, 463);
				lblBG.setIcon(new ImageIcon(LogIn_GUI.class.getResource("/img/backgroundLogin.png")));
				getContentPane().add(lblBG);
	}
}
