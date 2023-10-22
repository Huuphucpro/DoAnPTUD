//package quanLyBanSach;
//
//import java.security.SecureRandom;
//
//import javax.swing.JFrame;
//
//public class RandomSoNgauNhien extends JFrame {
//
//    // Dãy ký tự bao gồm chữ cái, chữ số và khoảng cách
//    private final String az = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//    private final SecureRandom rd = new SecureRandom();
//
//    public RandomSoNgauNhien() {
//    }
//
//    public String soNgauNhien(int n) {
//        StringBuilder str = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            str.append(az.charAt(rd.nextInt(az.length())));
//        }
//        return str.toString();
//    }
//}