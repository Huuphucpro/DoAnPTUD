package quanLyBanSach;

import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ChucNangSach_GUI extends JFrame {
	


	private JPanel contentPane;
	private JTextField txtTimKiemSach;
	private JTable tblSanPham;
	private JTable tblSP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChucNangSach_GUI frame = new ChucNangSach_GUI();
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
	public ChucNangSach_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,500);
		this.setTitle("PAGEPAL");
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 154, 438);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel pnlChucNangSach = new JPanel();
		pnlChucNangSach.setBounds(152, 0, 634, 438);
		getContentPane().add(pnlChucNangSach);
		pnlChucNangSach.setLayout(null);
		
		JButton btnThemSach = new JButton("Thêm sản phẩm\r\n");
		btnThemSach.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnThemSach.setBounds(10, 7, 181, 33);
		pnlChucNangSach.add(btnThemSach);
		
		txtTimKiemSach = new JTextField();
		txtTimKiemSach.addFocusListener(new FocusAdapter() {
			// place holder của thanh tìm kiếm
			@Override
			public void focusGained(FocusEvent e) {
				if(txtTimKiemSach.getText().equals("Tìm kiếm sách")) 
				{
					txtTimKiemSach.setText("");
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtTimKiemSach.getText().equals("")) 
				{
					txtTimKiemSach.setText("Tìm kiếm sách");
				}
			}
		});
		txtTimKiemSach.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTimKiemSach.setText("Tìm kiếm sách");
		txtTimKiemSach.setBounds(390, 11, 176, 29);
		pnlChucNangSach.add(txtTimKiemSach);
		txtTimKiemSach.setColumns(10);
		
		JButton btnSearch = new JButton("");
		btnSearch.setIcon(new ImageIcon(ChucNangSach_GUI.class.getResource("/img/iconSearch.png")));
		btnSearch.setBounds(575, 11, 29, 26);
		pnlChucNangSach.add(btnSearch);
		
		tblSP = new JTable();
		tblSP.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "S\u1ED1 l\u01B0\u1EE3ng", "\u0110\u01A1n v\u1ECB t\u00EDnh", "Lo\u1EA1i", "Tr\u1EA1ng th\u00E1i"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tblSP.getColumnModel().getColumn(0).setPreferredWidth(104);
		tblSP.getColumnModel().getColumn(1).setPreferredWidth(128);
		tblSP.getColumnModel().getColumn(2).setPreferredWidth(58);

		JScrollPane scrollPane = new JScrollPane(tblSP);  // Đặt JTable vào JScrollPane

		scrollPane.setBounds(10, 85, 614, 337);  // Đặt JScrollPane thay vì JTable

		pnlChucNangSach.add(scrollPane);  // Đặt JScrollPane vào panel của bạn
		
		JButton btnNewButton = new JButton("Xóa sản phẩm");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(58, 399, 133, 23);
		pnlChucNangSach.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cập nhật sản phẩm");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(391, 400, 154, 23);
		pnlChucNangSach.add(btnNewButton_1);

		
		

		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnBanHang = new JMenu("Bán hàng");
		mnBanHang.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(mnBanHang);
		
		JMenu mnSach = new JMenu("Quản lý sách");
		mnSach.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(mnSach);
		
		JMenu mnKhachHang = new JMenu("Quản lý KH");
		mnKhachHang.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(mnKhachHang);
		
		JMenu mnHoaDon = new JMenu("Hóa đơn");
		mnHoaDon.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(mnHoaDon);
		
		JMenu mnThongKe = new JMenu("Thống kê");
		mnThongKe.setFont(new Font("Tahoma", Font.BOLD, 15));
		menuBar.add(mnThongKe);
		
		JMenuItem mntmSachBanChay = new JMenuItem("Sách bán chạy");
		mntmSachBanChay.setFont(new Font("Tahoma", Font.BOLD, 14));
		mnThongKe.add(mntmSachBanChay);
		
		JMenuItem mntmDoanhThu = new JMenuItem("Doanh thu");
		mntmDoanhThu.setFont(new Font("Tahoma", Font.BOLD, 14));
		mnThongKe.add(mntmDoanhThu);
		
		


		
	}
}
