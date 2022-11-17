package utills;

import entity.NhanVien;

public class Auth {

    public static NhanVien user = null;

    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManage() {
        return Auth.isLogin() && user.isVaiTro();
    }
}
