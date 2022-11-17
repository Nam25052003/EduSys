package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utills.Xjdbc;

public class ThongKeDAO {

    public String SP_BANGDIEM = "{CALL sp_BangDiem (?)}";
    public String SP_LUONGNGUOIHOC = "{CALL sp_LuongNguoiHoc}";
    public String SP_DIEMCHUYENDE = "{CALL sp_DiemChuyenDe}";
    public String SP_DOANHTHU = "{CALL sp_DoanhThu (?)}";

    public List<Object[]> getBangDiem(Integer makh) {
        String cols[] = {"MaNH", "HoTen", "Diem"};
        return this.getListOfArray(SP_BANGDIEM, cols, makh);
    }

    public List<Object[]> getLuongNguoiHoc() {
        String cols[] = {"Nam", "SoLuong", "DauTien", "CuoiCung"};
        return this.getListOfArray(SP_LUONGNGUOIHOC, cols);
    }

    public List<Object[]> getDiemChuyenDe() {
        String cols[] = {"ChuyenDe", "SoHV", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(SP_DIEMCHUYENDE, cols);
    }

    public List<Object[]> getDoanhThu(int nam) {
        String cols[] = {"ChuyenDe", "SoKH", "SoHV", "DoanhThu", "ThapNhat", "CaoNhat", "TrungBinh"};
        return this.getListOfArray(SP_DOANHTHU, cols, nam);
    }

    public List<Object[]> getListOfArray(String sql, String cols[], Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = Xjdbc.excuteQuery(sql, args);
            while (rs.next()) {
                Object vals[] = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
