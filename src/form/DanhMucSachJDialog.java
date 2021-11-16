/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import dao.DanhMucSachDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import phuongtien.Auth;
import phuongtien.MsgBox;
import phuongtien.XImage;
import thucthe.DanhMucSach;

/**
 *
 * @author Thanh Lam
 */
public class DanhMucSachJDialog extends javax.swing.JDialog {

    DanhMucSachDAO dmsdao = new DanhMucSachDAO();
    int row = 0;

    /**
     * Creates new form DanhMucSachJDialog
     */
    public DanhMucSachJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
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
        tabDanhMucSach = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhMucSach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HOPE - QUẢN LÝ DANH MỤC SÁCH");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 229, 210), 5));

        tabDanhMucSach.setBackground(new java.awt.Color(255, 255, 255));
        tabDanhMucSach.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã loại :");

        txtMaLoai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtMaLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 229, 210), 2));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên loại :");

        txtTenLoai.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtTenLoai.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 229, 210), 2));

        btnThem.setBackground(new java.awt.Color(255, 229, 210));
        btnThem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/add_48px.png"))); // NOI18N
        btnThem.setText("Thêm ");
        btnThem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 229, 210));
        btnXoa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/delete_40px.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(255, 229, 210));
        btnSua.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/update_48px.png"))); // NOI18N
        btnSua.setText("Cập nhật");
        btnSua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(255, 229, 210));
        btnLamMoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/refresh_48px.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/402439.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaLoai, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                            .addComponent(txtTenLoai))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLamMoi)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnThem))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tabDanhMucSach.addTab("Thông tin từng danh mục", new javax.swing.ImageIcon(getClass().getResource("/hinhanh/book_reading_48px.png")), jPanel2); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblDanhMucSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 3));
        tblDanhMucSach.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblDanhMucSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MÃ LOẠI SÁCH", "TÊN LOẠI SÁCH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhMucSach.setRowHeight(30);
        tblDanhMucSach.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tblDanhMucSach.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblDanhMucSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDanhMucSachMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhMucSach);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabDanhMucSach.addTab("Danh mục sách", new javax.swing.ImageIcon(getClass().getResource("/hinhanh/edit_row_40px.png")), jPanel3); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabDanhMucSach)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabDanhMucSach)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhMucSachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhMucSachMousePressed
        if (evt.getClickCount() == 2) {
            this.row = tblDanhMucSach.rowAtPoint(evt.getPoint());
            edit();
        }
    }//GEN-LAST:event_tblDanhMucSachMousePressed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnLamMoiActionPerformed

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
            java.util.logging.Logger.getLogger(DanhMucSachJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhMucSachJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhMucSachJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhMucSachJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DanhMucSachJDialog dialog = new DanhMucSachJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane tabDanhMucSach;
    private javax.swing.JTable tblDanhMucSach;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables

    private void init() {
        setLocationRelativeTo(null);
        this.setIconImage(XImage.getLogo());
        fillTable();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblDanhMucSach.getModel();
        model.setRowCount(0);
        try {
            List<DanhMucSach> list = dmsdao.selectAll();
            for (DanhMucSach dms : list) {
                Object[] row = {
                    dms.getMaLoaiSach(),
                    dms.getTenLoaiSach(),};
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    private void edit() {
        try {
            String maLoaiSach = (String) tblDanhMucSach.getValueAt(this.row, 0);
            DanhMucSach dms = dmsdao.selectById(maLoaiSach);
            if (dms != null) {
                setForm(dms);
                updateStatus();
                tabDanhMucSach.setSelectedIndex(0);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu !");
        }
    }

    private void setForm(DanhMucSach model) {
        txtMaLoai.setText(model.getMaLoaiSach());
        txtTenLoai.setText(model.getTenLoaiSach());
    }

    private void updateStatus() {
        boolean edit = this.row >= 0;
        txtMaLoai.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
    }

    private void insert() {
        if (validateForm() == true) {
            DanhMucSach model = getForm();
            try {
                dmsdao.insert(model);
                this.fillTable();
                this.clearForm();
                MsgBox.alertSuccessful(this, "Thêm loại sách thành công !");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm loại sách thất bại !");
            }
        } else {
            MsgBox.alert(this, "Vui lòng điền đầy đủ thông tin !");
        }
    }

    private boolean validateForm() {
        if (txtMaLoai.getText().equals("")) {
            MsgBox.alert(this, "Bạn chưa điền mã loại sách !");
            return false;
        }
        DanhMucSach maLoaiSach = dmsdao.selectById(txtMaLoai.getText());
        if (maLoaiSach == null) {
            if (txtTenLoai.getText().equals("")) {
                MsgBox.alert(this, "Bạn chưa điền tên loại sách !");
                return false;
            }
        } else {
            MsgBox.alert(this, "Mã loại sách này đã tồn tại !");
        }
        return true;
    }

    private DanhMucSach getForm() {
        DanhMucSach dms = new DanhMucSach();
        dms.setMaLoaiSach(txtMaLoai.getText());
        dms.setTenLoaiSach(txtTenLoai.getText());
        return dms;
    }

    private void clearForm() {
        this.setForm(new DanhMucSach());
        this.updateStatus();
        row = - 1;
        updateStatus();
    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa danh mục sách !");
        } else {
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa loại sách này ?"));
            String maLoaiSach = txtMaLoai.getText();
            try {
                dmsdao.delete(maLoaiSach);
                this.fillTable();
                this.clearForm();
                MsgBox.alertSuccessful(this, "Loại sách này đã bị xóa !");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa danh mục sách thất bại !");
            }
        }
    }

    private void update() {
        boolean ok = true;
        if (txtTenLoai.getText().equals("")) {
            MsgBox.alert(this, "Bạn chưa điền tên loại sách !");
            ok = false;
        }
        if (ok == true) {
            DanhMucSach model = getForm();
            try {
                dmsdao.update(model);
                this.fillTable();
                MsgBox.alertSuccessful(this, "Cập nhật danh mục sách thành công !");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật danh mục sách thất bại !");
            }
        }
    }
}
