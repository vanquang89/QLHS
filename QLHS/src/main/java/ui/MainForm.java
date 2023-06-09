/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import helpers.SharedData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author PC
 */
public class MainForm extends javax.swing.JFrame {

    private QLHSPanel mQLHSPanel;
    private QLDIEMHS mQLDIEMHS;
    private PhuHuynh mPhuhuynh;
            
    public MainForm() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
         
        LoginDialog dialog = new LoginDialog(this,true);
        dialog.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        tbrLogout = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnQLHS = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnQLDiem = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnTTPH = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnThongTin = new javax.swing.JButton();
        tplMainBoard = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuFile_exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuManageStudent = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuPhuHuynh = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuQLDIEM = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuThongTin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        tbrLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout-icon-32.png"))); // NOI18N
        tbrLogout.setText("Đăng xuất");
        tbrLogout.setFocusable(false);
        tbrLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbrLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbrLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbrLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(tbrLogout);
        jToolBar1.add(jSeparator4);

        btnQLHS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/10207-man-student-light-skin-tone-icon-24.png"))); // NOI18N
        btnQLHS.setText("Quản lý học sinh");
        btnQLHS.setFocusable(false);
        btnQLHS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLHS.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHSActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLHS);
        jToolBar1.add(jSeparator5);

        btnQLDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gpa-icon-32.png"))); // NOI18N
        btnQLDiem.setText("Quản lý điểm");
        btnQLDiem.setFocusable(false);
        btnQLDiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnQLDiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQLDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLDiemActionPerformed(evt);
            }
        });
        jToolBar1.add(btnQLDiem);
        jToolBar1.add(jSeparator6);

        btnTTPH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Person-Male-Light-icon-24.png"))); // NOI18N
        btnTTPH.setText("Thông tin phu huynh học sinh");
        btnTTPH.setToolTipText("");
        btnTTPH.setFocusable(false);
        btnTTPH.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTTPH.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTTPH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTTPHActionPerformed(evt);
            }
        });
        jToolBar1.add(btnTTPH);
        jToolBar1.add(jSeparator8);

        btnThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Actions-help-about-icon-32.png"))); // NOI18N
        btnThongTin.setText("Giới thiệu");
        btnThongTin.setToolTipText("");
        btnThongTin.setFocusable(false);
        btnThongTin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnThongTin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinActionPerformed(evt);
            }
        });
        jToolBar1.add(btnThongTin);

        jMenu1.setText("Hệ thống");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Đăng xuất");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        menuFile_exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuFile_exit.setText("Thoát");
        menuFile_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile_exitActionPerformed(evt);
            }
        });
        jMenu1.add(menuFile_exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        mnuManageStudent.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuManageStudent.setText("Quản lý học sinh");
        mnuManageStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuManageStudentActionPerformed(evt);
            }
        });
        jMenu2.add(mnuManageStudent);
        jMenu2.add(jSeparator2);

        mnuPhuHuynh.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuPhuHuynh.setText("Quản lý phụ huynh");
        mnuPhuHuynh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPhuHuynhActionPerformed(evt);
            }
        });
        jMenu2.add(mnuPhuHuynh);
        jMenu2.add(jSeparator7);

        mnuQLDIEM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuQLDIEM.setText("Quản lý điểm");
        mnuQLDIEM.setToolTipText("");
        mnuQLDIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuQLDIEMActionPerformed(evt);
            }
        });
        jMenu2.add(mnuQLDIEM);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Trợ giúp");

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem5.setText("Nội dung");
        jMenu3.add(jMenuItem5);
        jMenu3.add(jSeparator3);

        menuThongTin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuThongTin.setText("Giới thiệu");
        menuThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuThongTinActionPerformed(evt);
            }
        });
        jMenu3.add(menuThongTin);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tplMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFile_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuFile_exitActionPerformed

    private void mnuManageStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuManageStudentActionPerformed
        if(mQLHSPanel==null){
        mQLHSPanel = new QLHSPanel();
        tplMainBoard.addTab("Quản lý học sinh", mQLHSPanel);
    }
        tplMainBoard.setSelectedComponent(mQLHSPanel);
    }//GEN-LAST:event_mnuManageStudentActionPerformed

    private void mnuPhuHuynhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPhuHuynhActionPerformed
        if(mPhuhuynh==null){
            mPhuhuynh = new PhuHuynh();
            tplMainBoard.addTab("Quản lý thông tin phụ huynh học sinh", mPhuhuynh);
        }
        tplMainBoard.setSelectedComponent(mPhuhuynh);
    }//GEN-LAST:event_mnuPhuHuynhActionPerformed

    private void mnuQLDIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuQLDIEMActionPerformed
        if(mQLDIEMHS==null){
            mQLDIEMHS = new QLDIEMHS();
            tplMainBoard.addTab("Quản lý điểm học sinh", mQLDIEMHS);
        }
        tplMainBoard.setSelectedComponent(mQLDIEMHS);
    }//GEN-LAST:event_mnuQLDIEMActionPerformed

    private void menuThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuThongTinActionPerformed
        btnThongTinActionPerformed (evt);
    }//GEN-LAST:event_menuThongTinActionPerformed

    private void tbrLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbrLogoutActionPerformed

        LoginDialog login = new LoginDialog(this,true);
        login.setVisible(true);
       
    }//GEN-LAST:event_tbrLogoutActionPerformed


            
    private void btnQLHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHSActionPerformed
        mnuManageStudentActionPerformed(evt);
    }//GEN-LAST:event_btnQLHSActionPerformed

    private void btnQLDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLDiemActionPerformed
        mnuQLDIEMActionPerformed(evt);
    }//GEN-LAST:event_btnQLDiemActionPerformed

    private void btnTTPHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTTPHActionPerformed
        mnuPhuHuynhActionPerformed(evt);
    }//GEN-LAST:event_btnTTPHActionPerformed

    private void btnThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinActionPerformed
        ThongTin thongtin = new ThongTin(this,true);
        thongtin.setVisible(true);
    }//GEN-LAST:event_btnThongTinActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       tbrLogoutActionPerformed(evt);
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQLDiem;
    private javax.swing.JButton btnQLHS;
    private javax.swing.JButton btnTTPH;
    private javax.swing.JButton btnThongTin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuFile_exit;
    private javax.swing.JMenuItem menuThongTin;
    private javax.swing.JMenuItem mnuManageStudent;
    private javax.swing.JMenuItem mnuPhuHuynh;
    private javax.swing.JMenuItem mnuQLDIEM;
    private javax.swing.JButton tbrLogout;
    private javax.swing.JTabbedPane tplMainBoard;
    // End of variables declaration//GEN-END:variables
}
