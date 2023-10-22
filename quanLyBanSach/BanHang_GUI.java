package quanLyBanSach;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class BanHang_GUI extends JFrame {
    private JPanel contentPane;
    private JTextField txtSearch;
    private boolean placeholderActive = true;
    private JTextField txtn;
    private int orderNumber = 1;
    private ArrayList<String> orders;
    private JTabbedPane tab;
    private JPanel panel;
    private JPanel pnlPayment;
    private JPanel pnlService;
    private JPanel pnlProduct;
    private JScrollBar scb;
    private JButton btnThanhToan;
    private Panel pnlSanPham;
    private JTable tblSanPham;
    private JScrollPane scrollPane;
    private JButton btnXoaSanPham;
    private JButton btnSuaSanPham;
    private JButton btnGhiChu;
    private JLabel lblTongTien;
    private JLabel lblSLSP;
    private JLabel lblTheTV;
    private JLabel lblTienKhach;
    private JLabel lblKhachTraTien;
    private JLabel lblTienThua;
    private JTextField txtNameCus;
    private JTextField txtTienKhachDua;
    private JLabel lblTienDu;
    private JTextField txtSLSP;
    private JTextField txtTongTien;
    private JTextField textField;

    private JMenuBar menuBar;
	private JMenu mnBanHang;
	private JMenu mnSach;
	private JMenu mnKhachHang;
	private JMenu mnHoaDon;
	private JMenu mnThongKe;
	private JMenuItem mntmSachBanChay;
	private JMenuItem mntmDoanhThu;

    public BanHang_GUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setTitle("PAGEPAL");

        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);
		getContentPane().setLayout(null);

        tab = new JTabbedPane(JTabbedPane.TOP);
        tab.setBounds(0, 48, 786, 415);
        contentPane.add(tab);

        panel = new JPanel();
        tab.addTab("Đơn 0", null, panel, null);
        panel.setLayout(null);

        pnlPayment = new JPanel();
        pnlPayment.setBounds(456, 0, 325, 387);
        panel.add(pnlPayment);
        pnlPayment.setLayout(null);

        btnThanhToan = new JButton("THANH TOÁN");
        btnThanhToan.setBounds(89, 330, 159, 46);
        btnThanhToan.setBackground(new Color(0, 255, 255));
        btnThanhToan.setFont(new Font("Tahoma", Font.BOLD, 15));
        pnlPayment.add(btnThanhToan);

        JLabel lblNameCus = new JLabel("Tên khách hàng");
        lblNameCus.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNameCus.setHorizontalAlignment(SwingConstants.LEFT);
        lblNameCus.setBounds(0, 11, 130, 30);
        pnlPayment.add(lblNameCus);

        lblTongTien = new JLabel("Tổng tiền");
        lblTongTien.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTongTien.setHorizontalAlignment(SwingConstants.LEFT);
        lblTongTien.setBounds(0, 131, 130, 30);
        pnlPayment.add(lblTongTien);

        lblSLSP = new JLabel("Số lượng sản phẩm");
        lblSLSP.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblSLSP.setHorizontalAlignment(SwingConstants.LEFT);
        lblSLSP.setBounds(0, 49, 148, 30);
        pnlPayment.add(lblSLSP);

        lblTheTV = new JLabel("Thẻ thành viên");
        lblTheTV.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTheTV.setHorizontalAlignment(SwingConstants.LEFT);
        lblTheTV.setBounds(0, 90, 130, 30);
        pnlPayment.add(lblTheTV);

        lblTienKhach = new JLabel("Tiền khách đưa");
        lblTienKhach.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTienKhach.setHorizontalAlignment(SwingConstants.LEFT);
        lblTienKhach.setBounds(0, 229, 130, 30);
        pnlPayment.add(lblTienKhach);

        lblKhachTraTien = new JLabel("Khách phải trả");
        lblKhachTraTien.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblKhachTraTien.setHorizontalAlignment(SwingConstants.LEFT);
        lblKhachTraTien.setBounds(0, 185, 130, 30);
        pnlPayment.add(lblKhachTraTien);

        lblTienThua = new JLabel("Tiền thừa");
        lblTienThua.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblTienThua.setHorizontalAlignment(SwingConstants.LEFT);
        lblTienThua.setBounds(0, 270, 130, 30);
        pnlPayment.add(lblTienThua);

        txtNameCus = new JTextField();
        txtNameCus.setBounds(177, 18, 148, 20);
        pnlPayment.add(txtNameCus);
        txtNameCus.setColumns(10);

        JCheckBox chkTheTV = new JCheckBox("");
        chkTheTV.setBounds(304, 97, 21, 23);
        pnlPayment.add(chkTheTV);
        txtTienKhachDua = new JTextField();
        txtTienKhachDua.setBounds(177, 236, 148, 20);
        pnlPayment.add(txtTienKhachDua);
        txtTienKhachDua.setColumns(10);

        // Tạo một PlainDocument cho JTextField
        PlainDocument doc = new PlainDocument();

        // Sử dụng DoubleDocumentFilter để kiểm tra nội dung
        doc.setDocumentFilter(new DoubleDocumentFilter());

        // Gán PlainDocument cho JTextField
        txtTienKhachDua.setDocument(doc);

        lblTienDu = new JLabel("");
        lblTienDu.setBounds(177, 280, 148, 14);
        pnlPayment.add(lblTienDu);
        
        txtSLSP = new JTextField();
        txtSLSP.setEditable(false);
        txtSLSP.setColumns(10);
        txtSLSP.setBounds(177, 59, 148, 20);
        pnlPayment.add(txtSLSP);
        
        txtTongTien = new JTextField();
        txtTongTien.setEditable(false);
        txtTongTien.setColumns(10);
        txtTongTien.setBounds(177, 131, 148, 20);
        pnlPayment.add(txtTongTien);
        
        textField = new JTextField();
        textField.setEditable(false);
        textField.setColumns(10);
        textField.setBounds(177, 195, 148, 20);
        pnlPayment.add(textField);
        


        pnlSanPham = new Panel();
        pnlSanPham.setBounds(0, 0, 450, 387);
        panel.add(pnlSanPham);

        DefaultTableModel data = new DefaultTableModel();
        data.addColumn("STT");
        data.addColumn("Mã đơn hàng");
        data.addColumn("Tên đơn hàng");
        data.addColumn("Số lượng");
        data.addColumn("Giá thành");
        data.addColumn("Tổng giá thành");
        pnlSanPham.setLayout(null);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 440, 340);
        pnlSanPham.add(scrollPane);

        tblSanPham = new JTable();
        scrollPane.setViewportView(tblSanPham);
        tblSanPham.setModel(new DefaultTableModel(
        	new Object[][] {
        		{null, "", "", null, null, null},
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
        		"STT", "M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u00E1ch", "S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1 th\u00E0nh", "T\u1ED5ng gi\u00E1"
        	}
        ) {
        	Class[] columnTypes = new Class[] {
        		Integer.class, String.class, String.class, Integer.class, Object.class, Double.class
        	};
        	public Class getColumnClass(int columnIndex) {
        		return columnTypes[columnIndex];
        	}
        });
        tblSanPham.getColumnModel().getColumn(0).setPreferredWidth(94);
        tblSanPham.getColumnModel().getColumn(1).setPreferredWidth(117);
        tblSanPham.getColumnModel().getColumn(2).setPreferredWidth(153);
        tblSanPham.getColumnModel().getColumn(3).setPreferredWidth(107);
        tblSanPham.getColumnModel().getColumn(4).setPreferredWidth(96);
        tblSanPham.getColumnModel().getColumn(5).setResizable(false);
        tblSanPham.getColumnModel().getColumn(5).setPreferredWidth(120);

        btnXoaSanPham = new JButton("Xóa");
        btnXoaSanPham.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnXoaSanPham.setBackground(Color.BLUE);
        btnXoaSanPham.setIcon(new ImageIcon(BanHang_GUI.class.getResource("/img/iconDel.png")));
        btnXoaSanPham.setBounds(0, 351, 150, 25);
        pnlSanPham.add(btnXoaSanPham);

        btnSuaSanPham = new JButton("Cập nhật");
        btnSuaSanPham.setBackground(new Color(255, 255, 0));
        btnSuaSanPham.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSuaSanPham.setIcon(new ImageIcon(BanHang_GUI.class.getResource("/img/iconUpdate.png")));
        btnSuaSanPham.setBounds(151, 351, 150, 25);
        pnlSanPham.add(btnSuaSanPham);

        btnGhiChu = new JButton("Ghi chú");
        btnGhiChu.setIcon(new ImageIcon(BanHang_GUI.class.getResource("/img/iconNote.png")));
        btnGhiChu.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnGhiChu.setBackground(new Color(0, 255, 0));
        btnGhiChu.setBounds(300, 351, 150, 25);
        pnlSanPham.add(btnGhiChu);
        
                txtSearch = new JTextField("");
                txtSearch.addFocusListener(new FocusAdapter() {
                	@Override
                	public void focusGained(FocusEvent e) {
                		if(txtSearch.getText().equals("Thêm sản phẩm vào đơn hàng")) 
        				{
        					txtSearch.setText("");
        				}
                	}
                	@Override
                	public void focusLost(FocusEvent e) {
                		if(txtSearch.getText().equals("")) 
        				{
        					txtSearch.setText("Thêm sản phẩm vào đơn hàng");
        				}
                	}
                });
                txtSearch.setBounds(0, 25, 255, 26);
                contentPane.add(txtSearch);
                txtSearch.setFont(new Font("Tahoma", Font.BOLD, 11));
                txtSearch.setColumns(10);
                
                        txtn = new JTextField();
                        txtn.setBounds(295, 25, 41, 26);
                        contentPane.add(txtn);
                        txtn.setFont(new Font("Tahoma", Font.BOLD, 11));
                        txtn.setText("Đơn " + orderNumber);
                        txtn.setColumns(10);
                        
                                JButton btnAddOrder = new JButton("");
                                btnAddOrder.setBounds(346, 25, 41, 26);
                                contentPane.add(btnAddOrder);
                                btnAddOrder.setIcon(new ImageIcon(BanHang_GUI.class.getResource("/img/iconAdd.png")));
                                
                                        JButton btnSearch = new JButton("");
                                        btnSearch.setBounds(265, 25, 29, 26);
                                        contentPane.add(btnSearch);
                                        btnSearch.setIcon(new ImageIcon(BanHang_GUI.class.getResource("/img/iconSearch.png")));
                                        
                                        menuBar = new JMenuBar();
                                        menuBar.setFont(new Font("Arial", Font.BOLD, 15));
                                        menuBar.setBounds(0, 0, 786, 26);
                                        contentPane.add(menuBar);
                                        
                                        mnBanHang = new JMenu("Bán hàng");
                                        mnBanHang.setFont(new Font("Tahoma", Font.BOLD, 15));
                                        menuBar.add(mnBanHang);
                                        
                                        mnSach = new JMenu("Quản lý sách");
                                        mnSach.setFont(new Font("Tahoma", Font.BOLD, 15));
                                        menuBar.add(mnSach);
                                        
                                        mnKhachHang = new JMenu("Quản lý KH");
                                        mnKhachHang.setFont(new Font("Tahoma", Font.BOLD, 15));
                                        menuBar.add(mnKhachHang);
                                        
                                        mnHoaDon = new JMenu("Quản lý HĐ");
                                        mnHoaDon.setFont(new Font("Tahoma", Font.BOLD, 15));
                                        menuBar.add(mnHoaDon);
                                        
                                        mnThongKe = new JMenu("Thống kê");
                                        mnThongKe.setFont(new Font("Tahoma", Font.BOLD, 15));
                                        menuBar.add(mnThongKe);
                                        
                                        mntmSachBanChay = new JMenuItem("Sách bán chạy");
                                        mntmSachBanChay.setFont(new Font("Tahoma", Font.BOLD, 14));
                                        mnThongKe.add(mntmSachBanChay);
                                        
                                        mntmDoanhThu = new JMenuItem("Doanh Thu");
                                        mntmDoanhThu.setFont(new Font("Tahoma", Font.BOLD, 14));
                                        mnThongKe.add(mntmDoanhThu);
                                        
                                        
                                
                                        // Thêm ActionListener cho nút "Thêm đơn"
                                        btnAddOrder.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                addOrder();
                                                
                                            }
                                        });
                
                        // Thêm ActionListener cho trường txtSearch
                        txtSearch.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                performSearch();
                            }
                        });
                        
                                // Sử dụng DocumentListener để quản lý placeholder text
                                txtSearch.getDocument().addDocumentListener(new DocumentListener() {
                                    @Override
                                    public void insertUpdate(DocumentEvent e) {
                                        if (placeholderActive && !txtSearch.getText().isEmpty()) {
                                            placeholderActive = false;
                                            txtSearch.setText("");
                                            txtSearch.setForeground(Color.BLACK);
                                        }
                                    }
                        
                                    @Override
                                    public void removeUpdate(DocumentEvent e) {
                                        if (txtSearch.getText().isEmpty()) {
                                            placeholderActive = true;
                                            txtSearch.setText("Nhập mã sách");
                                            txtSearch.setForeground(Color.GRAY);
                                        }
                                    }
                        
                                    @Override
                                    public void changedUpdate(DocumentEvent e) {
                                    }
                                });

        orders = new ArrayList<>(); // Khởi tạo danh sách đơn hàng
    }

    // Phương thức xử lý tìm kiếm và hiển thị thông báo
    private void performSearch() {
    	
        String searchText = txtSearch.getText();
        // Thực hiện tìm kiếm dựa trên searchText 

        // Hiển thị thông báo
        JOptionPane.showMessageDialog(this, "Đã tìm kiếm: " + searchText);
    }
 // Thêm ActionListener cho nút "Tìm kiếm"
    


    // Phương thức thêm đơn hàng mới
    private void addOrder() {
        String orderName = "Đơn " + orderNumber;
        orders.add(orderName);

        // Tạo một trang mới cho đơn hàng
        JPanel orderPanel = new JPanel();
        tab.addTab(orderName, null, orderPanel, null);
        
        // Tạo các thành phần khác cho trang đơn hàng

        // Chuyển đến trang đơn hàng mới
        tab.setSelectedComponent(orderPanel);

        orderNumber++;
        txtn.setText("Đơn " + orderNumber);
    }

    // DoubleDocumentFilter để kiểm tra nội dung
    class DoubleDocumentFilter extends DocumentFilter {
        @Override
        public void insertString(FilterBypass fb, int offset, String text, AttributeSet attr)
                throws BadLocationException {
            // Kiểm tra xem văn bản mới có phải là số kiểu double hay không
            if (isDouble(text)) {
                super.insertString(fb, offset, text, attr);
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs)
                throws BadLocationException {
            // Kiểm tra xem văn bản mới có phải là số kiểu double hay không
            if (isDouble(text)) {
                super.replace(fb, offset, length, text, attrs);
            }
        }

        // Phương thức kiểm tra xem chuỗi có thể chuyển đổi thành double hay không
        private boolean isDouble(String text) {
            try {
                Double.parseDouble(text);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BanHang_GUI frame = new BanHang_GUI();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
