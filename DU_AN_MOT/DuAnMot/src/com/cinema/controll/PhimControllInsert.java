/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinema.controll;

import cinema.QuanLyPhim;
import com.cinema.dao.LoaiPhimDAO;
import com.cinema.dao.PhimDAO;
import com.cinema.model.LoaiPhim;
import com.cinema.model.Phim;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author thanh
 */
public class PhimControllInsert extends javax.swing.JDialog {

    /**
     * Creates new form InsertPhim
     */
    private PhimDAO dao = new PhimDAO();
    private LoaiPhimDAO lpDao = new LoaiPhimDAO();
    private QuanLyPhim jpanel;
    

    public PhimControllInsert(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        this.setItemLoaiPhim();
    }

    Phim getModel() {
        Phim pm = new Phim();
        pm.setTenPhim(txtTenPhim.getText());
        pm.setNhaSanXuat(txtNhaSanXuat.getText());
        pm.setDoTuoi(Integer.valueOf(txtDoTuoi.getText()));
        pm.setThoiLuong(Integer.valueOf(txtThoiLuong.getText()));
        pm.setNgayCongChieu(txtNgayCongChieu.getText());
        pm.setPoster(jlbPoster.getText());
        pm.setMaLoaiPhim(((LoaiPhim)cboTheLoai.getSelectedItem()).getMaLoaiPhim());
        return pm;
    }

    public void insertPhim() {
        Phim pm = getModel();
        try {
            dao.insert(pm);
            this.dispose();
            this.jpanel.fillToTable();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    private void setItemLoaiPhim(){
        List<LoaiPhim> list = lpDao.fillAll();
        for(LoaiPhim lp : list){
            cboTheLoai.addItem(lp);
        }
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
        jlbPoster = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNgayCongChieu = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenPhim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNhaSanXuat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDoTuoi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtThoiLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cboTheLoai = new javax.swing.JComboBox<LoaiPhim>();
        btnKhong1 = new keeptoo.KButton();
        jLabel8 = new javax.swing.JLabel();
        jlbMaPhim = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(0, 102, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbPoster.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jlbPoster, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 190, 230));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Nhà sản xuất: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, 40));
        jPanel1.add(txtNgayCongChieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 340, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Thể loại: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 140, 40));
        jPanel1.add(txtTenPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 340, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tên Phim: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 130, 40));
        jPanel1.add(txtNhaSanXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 340, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Độ tuổi: ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 130, 40));
        jPanel1.add(txtDoTuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 340, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Thời lượng: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 130, 40));
        jPanel1.add(txtThoiLuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 340, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Ngày công chiếu: ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 140, 40));

        cboTheLoai.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        jPanel1.add(cboTheLoai, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 340, 40));

        btnKhong1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnKhong1.setText("THOÁT");
        btnKhong1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnKhong1.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        btnKhong1.setkEndColor(new java.awt.Color(204, 204, 204));
        btnKhong1.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        btnKhong1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        btnKhong1.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        btnKhong1.setkSelectedColor(new java.awt.Color(255, 255, 255));
        btnKhong1.setkStartColor(new java.awt.Color(204, 204, 204));
        btnKhong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhong1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnKhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 240, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Mã: ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, 40));

        jlbMaPhim.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jlbMaPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 150, 40));

        kButton1.setBorder(new javax.swing.border.MatteBorder(null));
        kButton1.setText("THÊM");
        kButton1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(153, 153, 153));
        kButton1.setkEndColor(new java.awt.Color(204, 204, 204));
        kButton1.setkHoverEndColor(new java.awt.Color(153, 153, 153));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(153, 153, 153));
        kButton1.setkSelectedColor(new java.awt.Color(204, 204, 204));
        kButton1.setkStartColor(new java.awt.Color(204, 204, 204));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 260, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKhong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhong1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnKhong1ActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        this.insertPhim();
    }//GEN-LAST:event_kButton1ActionPerformed

    public QuanLyPhim getJpanel() {
        return jpanel;
    }

    public void setJpanel(QuanLyPhim jpanel) {
        this.jpanel = jpanel;
    }
    
    
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
            java.util.logging.Logger.getLogger(PhimControllInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhimControllInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhimControllInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhimControllInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PhimControllInsert dialog = new PhimControllInsert(new javax.swing.JFrame(), true);
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
    private keeptoo.KButton btnKhong1;
    private javax.swing.JComboBox<LoaiPhim> cboTheLoai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbMaPhim;
    private javax.swing.JLabel jlbPoster;
    private keeptoo.KButton kButton1;
    private javax.swing.JTextField txtDoTuoi;
    private javax.swing.JTextField txtNgayCongChieu;
    private javax.swing.JTextField txtNhaSanXuat;
    private javax.swing.JTextField txtTenPhim;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables
}
