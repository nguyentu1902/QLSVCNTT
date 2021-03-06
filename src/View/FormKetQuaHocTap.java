/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.ChiTietMonHocDAO;
import Model.ChiTietMonHoc;
import Model.MonHoc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS RG
 */
public class FormKetQuaHocTap extends javax.swing.JFrame {

    /**
     * Creates new form FormBangDiem
     */
    public FormKetQuaHocTap() {
        initComponents();
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCTMH = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        txtMaMH = new javax.swing.JTextField();
        txtNgayBD = new javax.swing.JTextField();
        txtNgayKT = new javax.swing.JTextField();
        txtDiemQT = new javax.swing.JTextField();
        txtDiemCK = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnLuuDangKy = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnReLoad = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDiemTLHe4 = new javax.swing.JTextField();
        btnInBangDiem = new javax.swing.JButton();
        txtTongSTC = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Form K???t Qu??? H???c T???p");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setText("TH??NG TIN - K???T QU??? H???C T???P C???A SINH VI??N");

        tableCTMH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "M?? m??n", "Ng??y B??", "Ng??y KT", "??i???m QT", "??i???m CK", "??i???m h??? 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCTMH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCTMHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCTMH);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Th??ng tin ????ng k?? m??n h???c:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("M?? s??? SV:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 49, 58, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("M?? M??n:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 89, 51, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Ng??y B??:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 129, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("Ng??y KT:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 171, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel7.setText("??i???m s???:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 201, 76, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("??i???m Qu?? Tr??nh:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 232, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setText("??i???m Cu???i K??:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 232, 81, -1));
        jPanel3.add(txtMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 47, 163, -1));
        jPanel3.add(txtMaMH, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 87, 163, -1));
        jPanel3.add(txtNgayBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 127, 163, -1));
        jPanel3.add(txtNgayKT, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 167, 163, -1));
        jPanel3.add(txtDiemQT, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 256, 73, -1));
        jPanel3.add(txtDiemCK, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 256, 73, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 269, 290));

        btnThem.setText("????ng K?? M??n");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel2.add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 311, -1, -1));

        btnXoa.setText("H???y m??n");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel2.add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 311, -1, -1));

        btnCapNhat.setText("C???p nh???t");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        jPanel2.add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 311, -1, -1));

        btnTimKiem.setText("T??m theo MSSV");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel2.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        btnLuuDangKy.setText("L??u ??i???m H??? 4");
        btnLuuDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuDangKyActionPerformed(evt);
            }
        });
        jPanel2.add(btnLuuDangKy, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnThoat.setText(" Tho??t");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnReLoad.setText("Reload");
        btnReLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReLoadActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel10.setText("??i???m T??ch L??y H??? 4:");

        txtDiemTLHe4.setEditable(false);

        btnInBangDiem.setText("In B???ng ??i???m");
        btnInBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInBangDiemActionPerformed(evt);
            }
        });

        txtTongSTC.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        jLabel11.setText("T???ng S??? T??n Ch???:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnReLoad)
                        .addGap(320, 320, 320)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDiemTLHe4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnThoat)
                        .addGap(341, 341, 341)
                        .addComponent(btnInBangDiem)
                        .addGap(183, 183, 183)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTongSTC, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReLoad)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDiemTLHe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTongSTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThoat)
                            .addComponent(btnInBangDiem)))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void loadData() 
    {
        txtDiemCK.setText("0.0");
        txtDiemQT.setText("0.0");

        ///load du lieu len talbe
        ChiTietMonHocDAO CTMHDAO = new ChiTietMonHocDAO();
        ArrayList<ChiTietMonHoc> arrCTMH = CTMHDAO.DanhSachCTHM();
        DefaultTableModel tableCTMHShow = (DefaultTableModel) this.tableCTMH.getModel();
        tableCTMHShow.setRowCount(0);
        for (ChiTietMonHoc ctmh : arrCTMH) {
            Object[] row = new Object[]{ ctmh.getIdSinhVien(), ctmh.getIdMonHoc(),ctmh.getNgayBatDau(), ctmh.getNgayKetThuc(), ctmh.getDiemQT(), ctmh.getDiemCK(), ctmh.getDiemTLH4()};
            tableCTMHShow.addRow(row);
        }
        
        //kiem tra mon hoc da dang ky
        for(int i = 0; i<tableCTMH.getRowCount()-1; i++)
        {
            for(int j = i+1; j<tableCTMH.getRowCount(); j++)
            {
                if(tableCTMH.getValueAt(i, 0).toString().equals(tableCTMH.getValueAt(j, 0).toString()) && tableCTMH.getValueAt(i, 1).toString().equals(tableCTMH.getValueAt(j, 1).toString()))
                    JOptionPane.showMessageDialog(null, "M??n " + tableCTMH.getValueAt(j, 1) + " ???? ???????c ????ng k?? tr?????c ???? b???i sinh vi??n " + tableCTMH.getValueAt(j, 0) ,"Y??u c???u x??a m??n h???c b??? tr??ng!",
                    JOptionPane.WARNING_MESSAGE);
            }
        }
        
        loadDiemTichLuyHe4();
    }
    
    public void loadDiemTichLuyHe4()
    {
        float dtl = 0.00f;
        for (int i = 0; i < tableCTMH.getRowCount(); i++) 
        {
            dtl = (Float.parseFloat(tableCTMH.getValueAt(i, 4).toString()) + Float.parseFloat(tableCTMH.getValueAt(i, 5).toString())) / 2;
            tableCTMH.setValueAt(dtl, i, 6);
            
            if(0.0f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 2.9f)
                tableCTMH.setValueAt(0.0, i, 6);
            else if(3.0f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 3.9f)
                tableCTMH.setValueAt(0.5, i, 6);
            else if(4.0f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 4.7f)
                tableCTMH.setValueAt(1.0, i, 6);
            else if(4.8f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 5.4f)
                tableCTMH.setValueAt(1.5, i, 6);
            else if(5.5f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 6.2f)
                tableCTMH.setValueAt(2.0, i, 6);
            else if(6.3f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 6.9f)
                tableCTMH.setValueAt(2.5, i, 6);
            else if(7.0f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 7.7f)
                tableCTMH.setValueAt(3.0, i, 6);
            else if(7.8f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 8.4f)
                tableCTMH.setValueAt(3.5, i, 6);
            else// if(8.5f <= Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) && Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()) <= 10.0f)
                tableCTMH.setValueAt(4.0, i, 6);
        }
    }
    
    public void loadSoTinChi()
    {
        ChiTietMonHocDAO CTMHDAO = new ChiTietMonHocDAO();
        MonHoc mh = CTMHDAO.SoTinChi(txtMSSV.getText());
        txtTongSTC.setText(String.valueOf(mh.getSoTinChi()));
    }
    
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        if (JOptionPane.showConfirmDialog(null,
                "B???n c?? ch???c ch???n mu???n ????ng c???a s??? n??y?", "Tho??t?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tableCTMHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTMHMouseClicked
        txtMSSV.setText(tableCTMH.getValueAt(tableCTMH.getSelectedRow(), 0).toString());
        txtMaMH.setText(tableCTMH.getValueAt(tableCTMH.getSelectedRow(), 1).toString());
        txtNgayBD.setText(tableCTMH.getValueAt(tableCTMH.getSelectedRow(), 2).toString());
        txtNgayKT.setText(tableCTMH.getValueAt(tableCTMH.getSelectedRow(), 3).toString());
        txtDiemQT.setText(tableCTMH.getValueAt(tableCTMH.getSelectedRow(), 4).toString());
        txtDiemCK.setText(tableCTMH.getValueAt(tableCTMH.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tableCTMHMouseClicked

    private void btnReLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReLoadActionPerformed
        txtMSSV.setText(null);
        txtMaMH.setText(null);
        txtDiemCK.setText("0.0");
        txtDiemQT.setText("0.0");
        txtNgayBD.setText(null);
        txtNgayKT.setText(null);
        txtDiemTLHe4.setText(null);
        
        loadData();
    }//GEN-LAST:event_btnReLoadActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
                             
        if("".equals(txtMSSV.getText()) || "".equals(txtMaMH.getText()) || "".equals(txtNgayBD.getText()) || "".equals(txtNgayKT.getText()))
        {
            JOptionPane.showMessageDialog(null, "Y???u c???u nh???p ?????y ????? th??ng tin!", "C???nh B??o!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            ChiTietMonHocDAO CTMHDAO = new ChiTietMonHocDAO();
            ChiTietMonHoc ctmh = new ChiTietMonHoc();
            ctmh.setNgayBatDau(txtNgayBD.getText());
            ctmh.setNgayKetThuc(txtNgayKT.getText());
            ctmh.setDiemCK(Float.parseFloat(txtDiemCK.getText()));
            ctmh.setDiemQT(Float.parseFloat(txtDiemQT.getText()));
            ctmh.setIdMonHoc(txtMaMH.getText());
            ctmh.setIdSinhVien(txtMSSV.getText());
            
            if (CTMHDAO.ThemCTMH(ctmh) == -1) {
                JOptionPane.showMessageDialog(null, "MSSV v?? M?? l???p ph???i t???n t???i!", "Sai d??? li???u ?????u v??o!",
                        JOptionPane.WARNING_MESSAGE);
            } 
            else 
            {
                for (int i = 0; i < tableCTMH.getRowCount(); i++) 
                {
                    if (txtMSSV.getText() == tableCTMH.getValueAt(i, 0) && txtMaMH.getText() == tableCTMH.getValueAt(i, 1)) 
                    {
                        JOptionPane.showMessageDialog(null, "M??n h???c " + txtMaMH.getText() + " ???? ???????c ????ng k?? cho sinh vi??n " + txtMSSV.getText(), "C???nh B??o!",
                                JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                }
                JOptionPane.showMessageDialog(null, "????ng k?? th??nh c??ng m??n h???c " + txtMaMH.getText() +" cho sinh vi??n " + txtMSSV.getText());
            }
        }
        loadData();

    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if("".equals(txtMSSV.getText()) || "".equals(txtMaMH.getText()))
        {
            JOptionPane.showMessageDialog(null, "Y??u c???u nh???p MSSV v?? M?? m??n h???c ????? x??a!","Th??ng b??o!", JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
            ChiTietMonHocDAO CTMHDAO = new ChiTietMonHocDAO();
            ChiTietMonHoc ctmh = new ChiTietMonHoc();
            ctmh.setIdSinhVien(txtMSSV.getText());
            ctmh.setIdMonHoc(txtMaMH.getText());
            if (CTMHDAO.XoaCTMH(ctmh) == -1) {
                JOptionPane.showMessageDialog(null, "X??a th???t b???i", "Th??ng b??o!",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "H???y th??nh c??ng m??n h???c " + txtMaMH.getText());
            }
        }

        loadData();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        ChiTietMonHocDAO CTMHDAO = new ChiTietMonHocDAO();
        ChiTietMonHoc ctmh = new ChiTietMonHoc();
        if("".equals(txtMSSV.getText()) || "".equals(txtMaMH.getText()) || "".equals(txtNgayBD.getText()) || "".equals(txtNgayKT.getText()))
        {
            JOptionPane.showMessageDialog(null, "Y???u c???u nh???p ?????y ????? th??ng tin!", "C???nh B??o!",
                    JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            ctmh.setNgayBatDau(txtNgayBD.getText());
            ctmh.setNgayKetThuc(txtNgayKT.getText());
            ctmh.setDiemCK(Float.parseFloat(txtDiemCK.getText()));
            ctmh.setDiemQT(Float.parseFloat(txtDiemQT.getText()));
            ctmh.setIdMonHoc(txtMaMH.getText());
            ctmh.setIdSinhVien(txtMSSV.getText());
            
            if (CTMHDAO.CapNhatCTMH(ctmh) == -1) {
                JOptionPane.showMessageDialog(null, "C???p nh???t th???t b???i!", "Th??ng b??o!",
                        JOptionPane.WARNING_MESSAGE);
            } 
            else 
            {
                JOptionPane.showMessageDialog(null, "C???p nh???t th??nh c??ng m??n h???c " + txtMaMH.getText() +" cho sinh vi??n " + txtMSSV.getText());
            }
        }
        loadData();
        
            
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        if ("".equals(txtMSSV.getText())) 
        {
            JOptionPane.showMessageDialog(null, "Nh???p MSSV ????? t??m!", "Th??ng b??o!",
                    JOptionPane.WARNING_MESSAGE);
        } 
        else 
        {
            ChiTietMonHocDAO CTMHDAO = new ChiTietMonHocDAO();
            ArrayList<ChiTietMonHoc> dsCTMH = CTMHDAO.TimKiemCTMH(Integer.parseInt(txtMSSV.getText()));

            DefaultTableModel tableCTMHShow = (DefaultTableModel) this.tableCTMH.getModel();
            tableCTMHShow.setRowCount(0);
            for (ChiTietMonHoc ctmh : dsCTMH) 
            {
                Object[] row = new Object[]{ctmh.getIdSinhVien(), ctmh.getIdMonHoc(), ctmh.getNgayBatDau(), ctmh.getNgayKetThuc(), ctmh.getDiemQT(), ctmh.getDiemCK(), ctmh.getDiemTLH4()};
                tableCTMHShow.addRow(row);
            }
        }
        loadDiemTichLuyHe4();

        float diemTongHe4 = 0.0f;
        for (int i = 0; i < tableCTMH.getRowCount(); i++) 
        {
            diemTongHe4 += (Float.parseFloat(tableCTMH.getValueAt(i, 6).toString())) / tableCTMH.getRowCount();
        }
        txtDiemTLHe4.setText(String.valueOf(Math.ceil(diemTongHe4 * 100.0) / 100.0));    //lam tron sau dau phay 2 chu so
        loadSoTinChi();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnLuuDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuDangKyActionPerformed
        for(int i = 0; i<tableCTMH.getRowCount(); i++)
        {
            ChiTietMonHocDAO CTMHDAO = new ChiTietMonHocDAO();
            ChiTietMonHoc ctmh = new ChiTietMonHoc();
            ctmh.setIdSinhVien(tableCTMH.getValueAt(i, 0).toString());
            ctmh.setIdMonHoc(tableCTMH.getValueAt(i, 1).toString());
            ctmh.setDiemTLH4(Float.parseFloat(tableCTMH.getValueAt(i, 6).toString()));
            CTMHDAO.CapNhatDiemTLHe4(ctmh);
        }
        JOptionPane.showMessageDialog(null, "??i???m h??? 4 c???a t???t c??? sinh vi??n ???? ???????c l??u v??o CSDL!" );
    }//GEN-LAST:event_btnLuuDangKyActionPerformed

    private void btnInBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInBangDiemActionPerformed
        if (txtMSSV.getText().length() <= 0) {
            return;
        }
        if (tableCTMH.getRowCount() <= 0) {
            return;
        }

        Hashtable map = new Hashtable();
        try {
            JasperReport jpt = JasperCompileManager.compileReport("src/Report/PrintScore.jrxml");
            map.put("idSinhVien", txtMSSV.getText());
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/qlsv", "root", "admin12345");
            JasperPrint p = JasperFillManager.fillReport(jpt, map, con);
            JasperViewer.viewReport(p, false);
        } catch (JRException ex) {
            Logger.getLogger(FormKetQuaHocTap.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FormKetQuaHocTap.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInBangDiemActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FormKetQuaHocTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormKetQuaHocTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormKetQuaHocTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormKetQuaHocTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormKetQuaHocTap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnInBangDiem;
    private javax.swing.JButton btnLuuDangKy;
    private javax.swing.JButton btnReLoad;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCTMH;
    private javax.swing.JTextField txtDiemCK;
    private javax.swing.JTextField txtDiemQT;
    private javax.swing.JTextField txtDiemTLHe4;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMaMH;
    private javax.swing.JTextField txtNgayBD;
    private javax.swing.JTextField txtNgayKT;
    private javax.swing.JTextField txtTongSTC;
    // End of variables declaration//GEN-END:variables
}
