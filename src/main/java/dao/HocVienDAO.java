package dao;

import entity.HocVien;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utills.Xjdbc;

public class HocVienDAO extends EduSysDAO<HocVien, String> {

    @Override
    public void insert(HocVien entity) {
        String sql = "INSERT INTO HocVien(MaKH, MaNH, Diem) VALUES(?, ?, ?)";
        Xjdbc.executeUpdate(sql,
                entity.getMaKH(),
                entity.getMaNH(),
                entity.getDiem());

    }

    @Override
    public void update(HocVien entity) {
        String sql = "UPDATE HocVien SET MaKH=?, MaNH=?, Diem=? WHERE MaHV=?";
        Xjdbc.executeUpdate(sql,
                entity.getMaKH(),
                entity.getMaNH(),
                entity.getDiem(),
                entity.getMaHV());
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM HocVien WHERE MaHV=?";
        Xjdbc.executeUpdate(sql, id);
    }

    public void delete(Integer id) {
        String sql = "DELETE FROM HocVien WHERE MaHV=?";
        Xjdbc.executeUpdate(sql, id);
    }

    @Override
    public HocVien selectById(String id) {
        String sql = "SELECT * FROM HocVien WHERE MaHV=?";
        List<HocVien> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public HocVien selectById(Integer id) {
        String sql = "SELECT * FROM HocVien WHERE MaHV=?";
        List<HocVien> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HocVien> selectAll() {
        String sql = "SELECT * FROM HocVien";
        return this.selectBySql(sql);
    }

    public List<HocVien> selectByKhoaHoc(int makh) {
        String sql = "SELECT * FROM HocVien WHERE MaKH =?";
        return this.selectBySql(sql, makh);
    }

    @Override
    protected List<HocVien> selectBySql(String sql, Object... args) {
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.excuteQuery(sql, args);
            while (rs.next()) {
                HocVien entity = new HocVien();
                entity.setMaHV(rs.getInt("MaHV"));
                entity.setMaKH(rs.getInt("MaKH"));
                entity.setMaNH(rs.getString("MaNH"));
                entity.setDiem(rs.getDouble("Diem"));
                list.add(entity);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
