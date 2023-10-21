package ManHinhChinh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.ScrollPane;

import javax.swing.JComboBox;
import javax.swing.JTable;

public class frmManHinhChinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu mnBanHang;
	private JMenu mnSach;
	private JMenu mnKhachHang;
	private JMenu mnHoaDon;
	private JMenu mnThongKe;
	private JMenuItem mntmSachBanChay;
	private JMenuItem mntmDoanhThu;
	private JTextField txtSearch;
	private JLabel lblTenKH;
	private JLabel lblSDT;
	private JLabel lblTongTien;
	private JLabel lblDiscount;
	private JLabel lblKhachDua;
	private JLabel lblNote;
	private JLabel lblTienThua;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTable mainTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmManHinhChinh frame = new frmManHinhChinh();
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
	public frmManHinhChinh() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		setTitle("Màn hình chính");
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnBanHang = new JMenu("Bán hàng");
		mnBanHang.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnBanHang);
		
		mnSach = new JMenu("Quản lý sách");
		mnSach.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnSach);
		
		mnKhachHang = new JMenu("Quản lý KH");
		mnKhachHang.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnKhachHang);
		
		mnHoaDon = new JMenu("Quản lý HĐ");
		mnHoaDon.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnHoaDon);
		
		mnThongKe = new JMenu("Thống kê");
		mnThongKe.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		menuBar.add(mnThongKe);
		
		mntmSachBanChay = new JMenuItem("Sách bán chạy");
		mntmSachBanChay.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnThongKe.add(mntmSachBanChay);
		
		mntmDoanhThu = new JMenuItem("Doanh Thu");
		mntmDoanhThu.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		mnThongKe.add(mntmDoanhThu);
		getContentPane().setLayout(null);
		 
		JPanel pNorth = new JPanel();
		pNorth.setBounds(0, 0, 784, 44);
		pNorth.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(pNorth);
		pNorth.setLayout(null);
		
		txtSearch = new JTextField();
		txtSearch.setText("Thêm sản phẩm mới");
		txtSearch.setBounds(28, 11, 139, 20);
		pNorth.add(txtSearch);
		txtSearch.setColumns(15);
		JPanel pWest = new JPanel();
		pWest.setBounds(534, 43, 250, 392);
		pWest.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(pWest);
		pWest.setPreferredSize(new Dimension(250, 0));
		pWest.setLayout(null);
		
		
		JPanel panelTTDH = new JPanel();
		panelTTDH.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelTTDH.setBounds(10, 11, 230, 292);
		pWest.add(panelTTDH);
		panelTTDH.setLayout(null);
		
		JLabel lblttdh = new JLabel("Thông tin đơn hàng");
		lblttdh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblttdh.setBounds(59, 20, 132, 26);
		panelTTDH.add(lblttdh);
		
		lblTenKH = new JLabel("Tên KH:");
		lblTenKH.setBounds(10, 57, 46, 14);
		panelTTDH.add(lblTenKH);
		
		lblSDT = new JLabel("SĐT:");
		lblSDT.setBounds(10, 85, 46, 14);
		panelTTDH.add(lblSDT);
		
		lblTongTien = new JLabel("Tổng tiền:");
		lblTongTien.setBounds(10, 125, 55, 14);
		panelTTDH.add(lblTongTien);
		
		lblDiscount = new JLabel("Giảm giá: ");
		lblDiscount.setBounds(10, 150, 55, 14);
		panelTTDH.add(lblDiscount);
		
		lblKhachDua = new JLabel("Tiền khách đưa:");
		lblKhachDua.setBounds(10, 200, 83, 14);
		panelTTDH.add(lblKhachDua);
		
		lblNote = new JLabel("Ghi chú:");
		lblNote.setBounds(10, 267, 46, 14);
		panelTTDH.add(lblNote);
		
		lblTienThua = new JLabel("Tiền thừa:");
		lblTienThua.setBounds(10, 225, 83, 14);
		panelTTDH.add(lblTienThua);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.control);
		textField.setBounds(59, 54, 86, 20);
		panelTTDH.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(SystemColor.control);
		textField_1.setColumns(10);
		textField_1.setBounds(59, 82, 86, 20);
		panelTTDH.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.control);
		textField_2.setColumns(10);
		textField_2.setBounds(134, 122, 86, 20);
		panelTTDH.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.control);
		textField_3.setColumns(10);
		textField_3.setBounds(134, 147, 86, 20);
		panelTTDH.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.control);
		textField_4.setColumns(10);
		textField_4.setBounds(134, 197, 86, 20);
		panelTTDH.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBackground(SystemColor.control);
		textField_5.setColumns(10);
		textField_5.setBounds(134, 222, 86, 20);
		panelTTDH.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setBackground(SystemColor.control);
		textField_6.setColumns(10);
		textField_6.setBounds(59, 264, 161, 20);
		panelTTDH.add(textField_6);
		
		JButton btnThanhToan = new JButton("Thanh toán");
		btnThanhToan.setBackground(Color.LIGHT_GRAY);
		btnThanhToan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThanhToan.setBounds(70, 314, 110, 36);
		pWest.add(btnThanhToan);
		
		JPanel pCenter = new JPanel();
		pCenter.setBounds(0, 43, 535, 392);
		pCenter.setBorder(new LineBorder(new Color(0, 0, 0)));
		getContentPane().add(pCenter);
		pCenter.setLayout(null);
		
		String[] columnNames = {"STT", "Mã sách", "Tên sách", "Slg", "Đơn giá", "Thành tiền"};
		String [][] data = {
				{"001", "STN01", "Thần đồng Đất Việt", "1", "25000", "25000"},
		};
		mainTable = new JTable(data, columnNames);
//		pCenter.add(mainTable);
		JScrollPane sc = new JScrollPane(mainTable);
		pCenter.add(sc);
		getContentPane().add(pCenter);
	}
}
