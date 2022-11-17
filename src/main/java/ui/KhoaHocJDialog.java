/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui;

import dao.ChuyenDeDAO;
import dao.KhoaHocDAO;
import entity.ChuyenDe;
import entity.KhoaHoc;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import utills.Auth;
import utills.MsgBox;
import utills.XImage;
import utills.Xdate;

/**
 *
 * @author NAM PC
 */
public class KhoaHocJDialog extends javax.swing.JDialog {

    DefaultTableModel tableModel;
    DefaultComboBoxModel comboBoxModel;
    KhoaHocDAO khoaHocDAO = new KhoaHocDAO();
    ChuyenDeDAO chuyenDeDAO = new ChuyenDeDAO();
    int row = -1;

    /**
     * Creates new form KhoaHocJDialog
     */
    public KhoaHocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        tblchuyende.setDefaultEditor(Object.class, null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbochuyende = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtkhaigiang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthocphi = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtthoiluong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnguoitao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtngaytao = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txa = new javax.swing.JTextArea();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnfirst = new javax.swing.JButton();
        lbltenchuyende = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblchuyende = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản lý khóa học");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        cbochuyende.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbochuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochuyendeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbochuyende, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(cbochuyende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Chuyên đề");

        jLabel2.setText("Khai giảng");

        jLabel3.setText("Học phí");

        jLabel4.setText("Thời lượng (giờ)");

        jLabel5.setText("Người tạo");

        jLabel6.setText("Ngày tạo");

        jLabel7.setText("Ghi chú");

        txa.setColumns(20);
        txa.setRows(5);
        jScrollPane2.setViewportView(txa);

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnmoi.setText("Mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });

        btnlast.setText(">|");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnprev.setText("<<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        lbltenchuyende.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbltenchuyende.setForeground(new java.awt.Color(255, 0, 0));
        lbltenchuyende.setText("abc");
        lbltenchuyende.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthocphi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(txtnguoitao)
                            .addComponent(lbltenchuyende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkhaigiang)
                            .addComponent(txtthoiluong)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtngaytao)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnmoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(btnfirst)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnprev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlast)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtkhaigiang)
                    .addComponent(lbltenchuyende, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthocphi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtthoiluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnguoitao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnmoi)
                    .addComponent(btnlast)
                    .addComponent(btnnext)
                    .addComponent(btnprev)
                    .addComponent(btnfirst))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", jPanel2);

        tblchuyende.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblchuyende.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblchuyendeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblchuyende);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabs)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblchuyendeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblchuyendeMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblchuyende.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblchuyendeMouseClicked

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(1);
        clearForm();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnfirstActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnlastActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tabs.setSelectedIndex(1);
    }//GEN-LAST:event_formWindowOpened

    private void cbochuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochuyendeActionPerformed
        // TODO add your handling code here:
        chonChuyenDe();
    }//GEN-LAST:event_cbochuyendeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhoaHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                KhoaHocJDialog dialog = new KhoaHocJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbochuyende;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltenchuyende;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblchuyende;
    private javax.swing.JTextArea txa;
    private javax.swing.JTextField txthocphi;
    private javax.swing.JTextField txtkhaigiang;
    private javax.swing.JTextField txtngaytao;
    private javax.swing.JTextField txtnguoitao;
    private javax.swing.JTextField txtthoiluong;
    // End of variables declaration//GEN-END:variables
    void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());

        initTable();
        initComboBox();

        fillTable();
        this.updateStatus();
        isEnable();
    }

    void initTable() {
        tableModel = (DefaultTableModel) tblchuyende.getModel();
        tableModel.setRowCount(0);

        tableModel.setColumnIdentifiers(new String[]{"MÃ KH", "THỜI LƯỢNG", "HỌC PHÍ", "KHAI GIẢNG", "TẠO BỞI", "NGÀY TẠO"});
    }

    void initComboBox() {
        comboBoxModel = (DefaultComboBoxModel) cbochuyende.getModel();
        comboBoxModel.removeAllElements();

        List<ChuyenDe> list = chuyenDeDAO.selectAll();
        for (ChuyenDe cd : list) {
            comboBoxModel.addElement(cd);
        }
    }

    void isEnable() {
        lbltenchuyende.setEnabled(false);
        txtnguoitao.setEnabled(false);
        txtngaytao.setEnabled(false);
    }

    void fillTable() {
        tableModel = (DefaultTableModel) tblchuyende.getModel();
        tableModel.setRowCount(0);

        try {
            ChuyenDe cd = (ChuyenDe) cbochuyende.getSelectedItem();
            List<KhoaHoc> list = khoaHocDAO.selectByChuyenDe(cd.getMaCD());
            for (KhoaHoc kh : list) {
                tableModel.addRow(new Object[]{kh.getMaKH(),
                    kh.getThoiLuong(), kh.getHocPhi(),
                    Xdate.toString(kh.getNgayKG(), "MM/dd/yyyy"),
                    kh.getMaNV(),
                    Xdate.toString(kh.getNgayTao(), "MM/dd/yyyy")});
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void chonChuyenDe() {
        ChuyenDe cd = (ChuyenDe) cbochuyende.getSelectedItem();
        if (cd != null) {
            txtthoiluong.setText(String.valueOf(cd.getThoiLuong()));
            txthocphi.setText(String.valueOf(cd.getHocPhi()));
            lbltenchuyende.setText(cd.getTenCD());
            txa.setText(cd.getTenCD());

            fillTable();
            
            this.updateStatus();
            tabs.setSelectedIndex(1);
        }
    }

    void insert() {
        KhoaHoc kh = getForm();
        try {
            khoaHocDAO.insert(kh);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm mới thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm mới thất bại!");
        }
    }

    void update() {
        KhoaHoc kh = getForm();
        try {
            khoaHocDAO.update(kh);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    void delete() {
        if (!Auth.isManage()) {
            MsgBox.alert(this, "Bạn không có quyền xóa khóa học");
        } else {
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa khóa học này?")) {
                String makh = String.valueOf(cbochuyende.getToolTipText());
                try {
                    khoaHocDAO.delete(makh);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    void clearForm() {
        this.row = -1;
        ChuyenDe chuyenDe = (ChuyenDe) cbochuyende.getSelectedItem();
        KhoaHoc kh = new KhoaHoc();
        kh.setMaCD(chuyenDe.getMaCD());
        kh.setMaNV(Auth.user.getMaNV());
        kh.setNgayKG(Xdate.addDays(new Date(), 30));
        kh.setNgayTao(new Date());
        this.setForm(kh);
        this.updateStatus();
    }

    void edit() {
        ChuyenDe chuyenDe = (ChuyenDe) cbochuyende.getSelectedItem();
        int makh = (Integer) tblchuyende.getValueAt(this.row, 0);
        KhoaHoc kh = khoaHocDAO.selectById(makh);
        this.setForm(kh);
        tabs.setSelectedIndex(0);
        this.updateStatus();
        lbltenchuyende.setText(chuyenDe.getTenCD());
    }

//    void setForm(KhoaHoc kh) {
//        lbltenchuyende.setText(String.valueOf(cbochuyende.getSelectedItem()));
////        cbochuyende.setSelectedItem(chuyenDeDAO.selectById(kh.getMaCD()));
//        txtkhaigiang.setText(Xdate.toString(kh.getNgayKG()));
//        txthocphi.setText(String.valueOf(kh.getHocPhi()));
//        txtthoiluong.setText(String.valueOf(kh.getThoiLuong()));
//        txtnguoitao.setText(kh.getMaNV());
//        txtngaytao.setText(Xdate.toString(kh.getNgayTao()));
//        txa.setText(kh.getGhiChu());
//    }
//
//    KhoaHoc getForm() {
//        KhoaHoc kh = new KhoaHoc();
//        ChuyenDe cd = (ChuyenDe) cbochuyende.getSelectedItem();
//
////        kh.setMaKH(Integer.valueOf(cbochuyende.getToolTipText()));
//        kh.setMaKH(Integer.valueOf(kh.getMaKH()));
//        kh.setMaCD(cd.getMaCD());
//        kh.setHocPhi(Double.parseDouble(txthocphi.getText()));
//        kh.setThoiLuong(Integer.parseInt(txtthoiluong.getText()));
//        kh.setNgayKG(Xdate.toDate(txtkhaigiang.getText()));
//        kh.setMaNV(Auth.user.getMaNV());
//        kh.setNgayTao(Xdate.now());
//        kh.setGhiChu(txa.getText());
//        return kh;
//    }
    void setForm(KhoaHoc kh) {
        cbochuyende.setToolTipText(String.valueOf(kh.getMaKH()));
        cbochuyende.setSelectedItem(chuyenDeDAO.selectById(kh.getMaCD()));
        txtkhaigiang.setText(Xdate.toString(kh.getNgayKG(), "MM/dd/yyyy"));
        txthocphi.setText(String.valueOf(kh.getHocPhi()));
        txtthoiluong.setText(String.valueOf(kh.getThoiLuong()));
        txtnguoitao.setText(kh.getMaNV());
        txtngaytao.setText(Xdate.toString(kh.getNgayTao(), "MM/dd/yyyy"));
        txa.setText(kh.getGhiChu());
    }

    KhoaHoc getForm() {
        ChuyenDe chuyenDe = (ChuyenDe) cbochuyende.getSelectedItem();
        KhoaHoc kh = new KhoaHoc();
        kh.setMaCD(chuyenDe.getMaCD());
        kh.setNgayKG(Xdate.toDate(txtkhaigiang.getText(), "MM/dd/yyyy"));
        kh.setHocPhi(Float.parseFloat(txthocphi.getText()));
        kh.setThoiLuong(Integer.valueOf(txtthoiluong.getText()));
        kh.setGhiChu(txa.getText());
        if (txtnguoitao.getText().equals("")) {
            kh.setMaNV(Auth.user.getMaNV());
        } else {
            kh.setMaNV(txtnguoitao.getText());
        }
        kh.setNgayTao(Xdate.toDate(txtngaytao.getText(), "MM/dd/yyyy"));
        kh.setMaKH(Integer.valueOf(cbochuyende.getToolTipText()));
        return kh;
    }

    void first() {
        this.row = 0;
        this.edit();
    }

    void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    void next() {
        if (this.row < tblchuyende.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    void last() {
        this.row = tblchuyende.getRowCount() - 1;
        this.edit();
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblchuyende.getRowCount() - 1);

        btnthem.setEnabled(!edit);
        btnsua.setEnabled(edit);
        btnxoa.setEnabled(edit);

        btnfirst.setEnabled(edit && !first);
        btnprev.setEnabled(edit && !first);
        btnnext.setEnabled(edit && !last);
        btnlast.setEnabled(edit && !last);
    }
   
}
