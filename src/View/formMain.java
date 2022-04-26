/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DAO.LopHocDAO;
import DAO.SinhVienDAO;
import Model.LopHoc;
import Model.SinhVien;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS RG
 */
public class formMain extends javax.swing.JFrame {

    /**
     * Creates new form formMain
     */
    public formMain() {
        initComponents();
        LoadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        lbThongTinSV = new javax.swing.JLabel();
        lbSoLuongSV = new javax.swing.JLabel();
        txtSoLuongSV = new javax.swing.JTextField();
        cbbMaLop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lbMSSV = new javax.swing.JLabel();
        lbTTSV = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        lbHoTen = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHoTen = new javax.swing.JTextPane();
        lbGioiTinh = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbNgaySinh = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtEmail = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtNgaySinh = new javax.swing.JTextPane();
        lbMaLop = new javax.swing.JLabel();
        txtMaLop = new javax.swing.JTextField();
        checkboxNam = new javax.swing.JCheckBox();
        checkboxNu = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnReLoad = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        itemDangXuat = new javax.swing.JMenuItem();
        itemThoat = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemQuanLyLop = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cửa Sổ Chính");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "Họ Tên", "Giới Tính", "Ngày Sinh", "SDT", "Quê Quán", "Email", "Mã lớp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSV);
        if (tableSV.getColumnModel().getColumnCount() > 0) {
            tableSV.getColumnModel().getColumn(0).setPreferredWidth(20);
            tableSV.getColumnModel().getColumn(2).setPreferredWidth(20);
            tableSV.getColumnModel().getColumn(3).setPreferredWidth(20);
            tableSV.getColumnModel().getColumn(4).setPreferredWidth(25);
            tableSV.getColumnModel().getColumn(5).setPreferredWidth(25);
            tableSV.getColumnModel().getColumn(7).setPreferredWidth(2);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 790, 470));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 78, -1));

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 83, -1));

        lbThongTinSV.setFont(new java.awt.Font("Segoe UI Black", 0, 22)); // NOI18N
        lbThongTinSV.setText("QUẢN LÝ SINH VIÊN KHOA CNTT");
        getContentPane().add(lbThongTinSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 380, -1));

        lbSoLuongSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbSoLuongSV.setText("Số lượng sinh viên:");
        getContentPane().add(lbSoLuongSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 560, -1, -1));

        txtSoLuongSV.setEditable(false);
        getContentPane().add(txtSoLuongSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 560, 82, -1));

        cbbMaLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbMaLopActionPerformed(evt);
            }
        });
        getContentPane().add(cbbMaLop, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 90, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        lbMSSV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMSSV.setText(" Mã Số :");

        lbTTSV.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbTTSV.setText("Thông tin sinh viên");

        lbHoTen.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbHoTen.setText("Họ Tên:");

        jScrollPane2.setViewportView(txtHoTen);

        lbGioiTinh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbGioiTinh.setText("Giới Tính:");

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbEmail.setText("Email :");

        lbNgaySinh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbNgaySinh.setText("Ngày Sinh:");

        jScrollPane3.setViewportView(txtEmail);

        jScrollPane4.setViewportView(txtNgaySinh);

        lbMaLop.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbMaLop.setText("Mã Lớp:");

        checkboxNam.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        checkboxNam.setText("Nam");

        checkboxNu.setFont(new java.awt.Font("Segoe UI", 3, 13)); // NOI18N
        checkboxNu.setText("Nữ");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("SDT:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Quê Quán:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTTSV, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMaLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNgaySinh)
                                    .addComponent(lbHoTen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbGioiTinh, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMSSV, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(checkboxNam, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(checkboxNu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(txtMSSV)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jScrollPane4))
                                        .addGap(14, 14, 14))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTTSV)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMSSV)
                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbHoTen)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkboxNam)
                    .addComponent(checkboxNu)
                    .addComponent(lbGioiTinh))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNgaySinh)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMaLop))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 300, 400));

        btnReLoad.setText("Reload");
        btnReLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReLoadActionPerformed(evt);
            }
        });
        getContentPane().add(btnReLoad, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 70, -1));

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 480, 90, -1));

        btnTimKiem.setText("Tìm theo MSSV");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 130, 30));

        jMenu2.setText("Tác Vụ");

        itemDangXuat.setText("Đăng xuất");
        itemDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDangXuatActionPerformed(evt);
            }
        });
        jMenu2.add(itemDangXuat);

        itemThoat.setText("Thoát");
        itemThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemThoatActionPerformed(evt);
            }
        });
        jMenu2.add(itemThoat);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Hệ Thống");

        itemQuanLyLop.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemQuanLyLop.setText("Quản lý lớp");
        itemQuanLyLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQuanLyLopActionPerformed(evt);
            }
        });
        jMenu3.add(itemQuanLyLop);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Quản lý môn");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setText("Quản lý giảng viên");
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setCheckBox()
    {
        boolean x = checkboxNam.isSelected();
        while(x==true)
        {
            checkboxNu.setSelected(false);
        }
//        else
//            checkboxNu.setSelected(true);
    }
    public void LoadData()
    {       
        //Do du lieu vao combobox
        LopHocDAO lhDAO = new LopHocDAO();
        Vector<LopHoc> vec = lhDAO.DanhSachLop();
 //       List<String> tenLop = new ArrayList<>();

        DefaultComboBoxModel cbb = new DefaultComboBoxModel();
        for (LopHoc lh : vec) 
        {
            cbb.addElement(lh);
        }
        cbbMaLop.setModel(cbb);
        
        //Do du lieu vao table
        SinhVienDAO svDAO = new SinhVienDAO();
        ArrayList<SinhVien> arrSV = svDAO.DanhSachSinhVien();
        DefaultTableModel tableSV = (DefaultTableModel) this.tableSV.getModel();
            tableSV.setRowCount(0);
        for(SinhVien sv : arrSV)
        {
            Object[] row = new Object[]{sv.getIdSinhVien(),sv.getHoTen(),sv.getGioiTinh(),sv.getNgaySinh(),sv.getSdt(), sv.getDiaChi(),sv.getEmail(), sv.getIdLop()};
            tableSV.addRow(row);
        }
        int sl = tableSV.getRowCount();
        txtSoLuongSV.setText(String.valueOf(sl));
           
    }
    
    private void tableSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSVMouseClicked

        txtMSSV.setText(tableSV.getValueAt(tableSV.getSelectedRow(), 0).toString());
        txtHoTen.setText(tableSV.getValueAt(tableSV.getSelectedRow(), 1).toString());

        String gender = "Nam";
        if(gender.equals(tableSV.getValueAt(tableSV.getSelectedRow(), 2).toString()))
        {
            checkboxNam.setSelected(true);
            checkboxNu.setSelected(false);
        }
        else
        {
            checkboxNu.setSelected(true);
            checkboxNam.setSelected(false);
        }

        txtNgaySinh.setText(tableSV.getValueAt(tableSV.getSelectedRow(), 3).toString());
        txtSDT.setText(tableSV.getValueAt(tableSV.getSelectedRow(), 4).toString());
        txtDiaChi.setText(tableSV.getValueAt(tableSV.getSelectedRow(), 5).toString());
        txtEmail.setText(tableSV.getValueAt(tableSV.getSelectedRow(), 6).toString());
        txtMaLop.setText(tableSV.getValueAt(tableSV.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tableSVMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed

        if (((("".equals(txtMSSV.getText()) || "".equals(txtHoTen.getText()))
            || "".equals(txtNgaySinh.getText())) || "".equals(txtEmail.getText())) 
                || "".equals(txtMaLop.getText()) || "".equals(txtDiaChi.getText()) || "".equals(txtSDT.getText())) 
        {
            JOptionPane.showMessageDialog(null, "Yều cầu nhập đầy đủ thông tin!", "Cảnh Báo!",
            JOptionPane.WARNING_MESSAGE);
        }

        else 
        {
            SinhVienDAO svDAO = new SinhVienDAO();
            SinhVien a = new SinhVien();
            a.setIdSinhVien(txtMSSV.getText());
            a.setHoTen(txtHoTen.getText());
            if (checkboxNam.isSelected()) {
                a.setGioiTinh(checkboxNam.getText());
            } else {
                a.setGioiTinh(checkboxNu.getText());
            }
            a.setNgaySinh(txtNgaySinh.getText());
            a.setSdt(Integer.parseInt(txtSDT.getText()));
            a.setDiaChi(txtDiaChi.getText());
            a.setEmail(txtEmail.getText());
            a.setIdLop(txtMaLop.getText());
            //Bat loi input tu nguoi dung
            if (svDAO.ThemSinhVien(a) == -1) {
                JOptionPane.showMessageDialog(null, "Format ngày sinh yyyy/mm/dd!\nMSSV không được trùng!\nMã lớp phải tồn tại!", "Sai dữ liệu đầu vào!",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thành công sinh viên " + txtHoTen.getText());
            }
        }


        //Load lai data sau khi them sinh vien
        LoadData();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        SinhVienDAO svDAO = new SinhVienDAO();
        SinhVien sv = new SinhVien();
        sv.setIdSinhVien(txtMSSV.getText());
        if(svDAO.XoaSinhVien(sv)==-1)
        {
            JOptionPane.showMessageDialog(null, "Xóa thất bại", "Thông báo!",
                JOptionPane.ERROR_MESSAGE);
        }
        else
        JOptionPane.showMessageDialog (null, "Xóa thành công sinh viên "+ txtHoTen.getText());

        LoadData();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void cbbMaLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbMaLopActionPerformed
        SinhVienDAO svDAO = new SinhVienDAO();
        ArrayList<SinhVien> arrSV = svDAO.DanhSachSinhVienTheoLop(cbbMaLop.getSelectedItem().toString());
        DefaultTableModel tableSV = (DefaultTableModel) this.tableSV.getModel();
        tableSV.setRowCount(0);
        for(SinhVien sv : arrSV)
        {
            Object[] row = new Object[]{sv.getIdSinhVien(),sv.getHoTen(),sv.getGioiTinh(),sv.getNgaySinh(),sv.getSdt(), sv.getDiaChi(),sv.getEmail(), sv.getIdLop()};
            tableSV.addRow(row);
        }
        int sl = tableSV.getRowCount();
        txtSoLuongSV.setText(String.valueOf(sl));
    }//GEN-LAST:event_cbbMaLopActionPerformed

    private void btnReLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReLoadActionPerformed
        // TODO add your handling code here:
        LoadData();
        txtMSSV.setText("");
        txtEmail.setText("");
        txtHoTen.setText("");
        txtNgaySinh.setText("");
        txtMSSV.setText("");
        txtMaLop.setText("");
        txtSDT.setText("");
        txtDiaChi.setText("");
        checkboxNam.setSelected(false);
        checkboxNu.setSelected(false);
    }//GEN-LAST:event_btnReLoadActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        SinhVienDAO svDAO = new SinhVienDAO();
        SinhVien sv = new SinhVien();

        sv.setIdSinhVien(txtMSSV.getText());
        sv.setHoTen(txtHoTen.getText());
        if (checkboxNam.isSelected()) {
            sv.setGioiTinh(checkboxNam.getText());
        } else {
            sv.setGioiTinh(checkboxNu.getText());
        }
        sv.setNgaySinh(txtNgaySinh.getText());
        sv.setSdt(Integer.parseInt(txtSDT.getText()));
        sv.setDiaChi(txtDiaChi.getText());
        sv.setEmail(txtEmail.getText());
        sv.setIdLop(txtMaLop.getText());
        
        if (svDAO.CapNhatSinhVien(sv) == -1) {
            JOptionPane.showMessageDialog(null, "Format ngày sinh yyyy/mm/dd!\nMã lớp phải tồn tại!", "Thông báo!",
                JOptionPane.ERROR_MESSAGE);
        } else
        JOptionPane.showMessageDialog(null, "Cập nhật thành công sinh viên " + txtHoTen.getText());

        LoadData();

    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        SinhVienDAO svDAO = new SinhVienDAO();
        ArrayList<SinhVien> dssv = svDAO.TimKiemSinhVien(Integer.parseInt(txtMSSV.getText()));

        DefaultTableModel tableSV = (DefaultTableModel) this.tableSV.getModel();
        tableSV.setRowCount(0);
        for (SinhVien sv : dssv) {
            Object[] row = new Object[]{sv.getIdSinhVien(),sv.getHoTen(),sv.getGioiTinh(),sv.getNgaySinh(),sv.getSdt(), sv.getDiaChi(),sv.getEmail(), sv.getIdLop()};
            tableSV.addRow(row);
        }
        int sl = tableSV.getRowCount();
        txtSoLuongSV.setText(String.valueOf(sl));
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void itemDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDangXuatActionPerformed
        this.dispose();
        formDangNhap a = new formDangNhap();
        a.setVisible(true);
    }//GEN-LAST:event_itemDangXuatActionPerformed

    private void itemThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemThoatActionPerformed
        if (JOptionPane.showConfirmDialog(null,
            "Bạn có chắc chắn muốn đóng ứng dụng?", "Thoát?",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
        System.exit(0);
        }
    }//GEN-LAST:event_itemThoatActionPerformed

    private void itemQuanLyLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQuanLyLopActionPerformed
        formLopHoc a = new formLopHoc();
        a.setVisible(true);
    }//GEN-LAST:event_itemQuanLyLopActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        formMonHoc a = new formMonHoc();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnReLoad;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbMaLop;
    private javax.swing.JCheckBox checkboxNam;
    private javax.swing.JCheckBox checkboxNu;
    private javax.swing.JMenuItem itemDangXuat;
    private javax.swing.JMenuItem itemQuanLyLop;
    private javax.swing.JMenuItem itemThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMSSV;
    private javax.swing.JLabel lbMaLop;
    private javax.swing.JLabel lbNgaySinh;
    private javax.swing.JLabel lbSoLuongSV;
    private javax.swing.JLabel lbTTSV;
    private javax.swing.JLabel lbThongTinSV;
    private javax.swing.JTable tableSV;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextPane txtEmail;
    private javax.swing.JTextPane txtHoTen;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextPane txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuongSV;
    // End of variables declaration//GEN-END:variables
}
