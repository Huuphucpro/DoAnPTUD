//package quanLyBanSach;
//
//import java.awt.Color;
//import java.awt.Font;
//
//public class QuenMatKhau extends javax.swing.JDialog {
//
//    public QuenMatKhau(java.awt.Frame parent, boolean modal) {
//        super(parent, modal);
//        initComponents();
//        init();
//    }
//
//    private void init() {
//        hienThiGoiY();
//        maCapcha();
//    }
//
//    public void hienThiGoiY() {
//        txtEmail.setText("Email...");
//        txtEmail.setForeground(Color.GRAY);
//        txtCapcha.setText("Capcha...");
//        txtCapcha.setForeground(Color.GRAY);
//        txtMaCapcha.setEditable(false);
//        txtMaCapcha.requestFocus();
//    }
//
//    private boolean kiemTraLoi() {
//        if (txtEmail.getText().equalsIgnoreCase("Email...")) {
//            txtEmail.requestFocus();
//            MsgBox.alert(this, "Email không được rỗng");
//            return false;
//        }
//        if (txtCapcha.getText().equalsIgnoreCase("Capcha...")) {
//            txtCapcha.requestFocus();
//            MsgBox.alert(this, "Capcha không được rỗng");
//            return false;
//        }
//        if (!txtCapcha.getText().equalsIgnoreCase(txtMaCapcha.getText())) {
//            txtMaCapcha.requestFocus();
//            MsgBox.alert(this, "Mã Capcha không khớp");
//            maCapcha();
//            return false;
//        }
//        return true;
//    }
//
//    private void maCapcha() {
//        String capcha = new RandomSoNgauNhien().soNgauNhien(5);
//        txtMaCapcha.setText(capcha);
//        txtMaCapcha.setFont(new Font("Default", Font.PLAIN, 14));
//    }
//
//    private void lamMoi() {
//        hienThiGoiY();
//        maCapcha();
//    }
//
//    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {
//        if (txtEmail.getText().equalsIgnoreCase("Email...")) {
//            txtEmail.setText("");
//            txtEmail.setForeground(Color.BLACK);
//        }
//    }
//
//    private void txtEmailFocusLost(java.awt.awt.event.FocusEvent evt) {
//        if (txtEmail.getText().equalsIgnoreCase("")) {
//            txtEmail.setText("Email...");
//            txtEmail.setForeground(Color.GRAY);
//        }
//    }
//
//    private void txtCapchaFocusGained(java.awt.event.FocusEvent evt) {
//        if (txtCapcha.getText().equalsIgnoreCase("Capcha...")) {
//            txtCapcha.setText("");
//            txtCapcha.setForeground(Color.BLACK);
//        }
//    }
//
//    private void txtCapchaFocusLost(java.awt.event.FocusEvent evt) {
//        if (txtCapcha.getText().equalsIgnoreCase("")) {
//            txtCapcha.setText("Capcha...");
//            txtCapcha.setForeground(Color.GRAY);
//        }
//    }
//
//    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
//        this.dispose();
//        LogIn_GUI login = new LogIn_GUI(null, true, false);
//        login.setVisible(true);
//    }
//
//    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {
//        if (kiemTraLoi()) {
//            // Xử lý logic gửi mật khẩu
//        }
//    }
//}
