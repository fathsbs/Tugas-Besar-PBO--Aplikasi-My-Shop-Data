/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myshopdata;

import java.awt.Color;
import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

/**
 *
 * @author ACER
 */
public class homeView extends javax.swing.JFrame {

    /**
     * Creates new form homeView
     */
    public homeView() {
        initComponents();
        homeView.this.getRootPane().setBorder(new LineBorder(Color.yellow));
    }
    int xx,xy;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new keeptoo.KGradientPanel();
        barpanel1 = new javax.swing.JPanel();
        exit1 = new javax.swing.JLabel();
        maximalize1 = new javax.swing.JLabel();
        minimalize1 = new javax.swing.JLabel();
        menupanel = new keeptoo.KGradientPanel();
        btnhome = new javax.swing.JLabel();
        btndata = new javax.swing.JLabel();
        btnaccount = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        homepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        dataPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        accountPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        kButton1 = new keeptoo.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barpanel1.setOpaque(false);
        barpanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barpanel1MouseDragged(evt);
            }
        });
        barpanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barpanel1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barpanel1MousePressed(evt);
            }
        });

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myshopdata/img/clear-button.png"))); // NOI18N
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exit1MousePressed(evt);
            }
        });

        maximalize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myshopdata/img/maximize.png"))); // NOI18N
        maximalize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                maximalize1MousePressed(evt);
            }
        });

        minimalize1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myshopdata/img/minimize.png"))); // NOI18N
        minimalize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimalize1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout barpanel1Layout = new javax.swing.GroupLayout(barpanel1);
        barpanel1.setLayout(barpanel1Layout);
        barpanel1Layout.setHorizontalGroup(
            barpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barpanel1Layout.createSequentialGroup()
                .addGap(1363, 1363, 1363)
                .addComponent(minimalize1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(maximalize1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(exit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        barpanel1Layout.setVerticalGroup(
            barpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(barpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit1)
                    .addComponent(minimalize1)
                    .addComponent(maximalize1))
                .addGap(6, 6, 6))
        );

        bg.add(barpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1492, -1));

        menupanel.setOpaque(false);

        btnhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myshopdata/img/home.png"))); // NOI18N
        btnhome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhomeMouseClicked(evt);
            }
        });

        btndata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myshopdata/img/online-shop.png"))); // NOI18N
        btndata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndataMouseClicked(evt);
            }
        });

        btnaccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myshopdata/img/account.png"))); // NOI18N
        btnaccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnaccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnaccount)
                    .addComponent(btndata)
                    .addComponent(btnhome))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnhome)
                .addGap(50, 50, 50)
                .addComponent(btndata)
                .addGap(50, 50, 50)
                .addComponent(btnaccount)
                .addContainerGap(498, Short.MAX_VALUE))
        );

        bg.add(menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 100, 850));

        mainPanel.setBackground(new java.awt.Color(209, 216, 224));
        mainPanel.setLayout(new java.awt.CardLayout());

        homepanel.setBackground(new java.awt.Color(209, 216, 224));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel1.setText("Home");

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(1235, Short.MAX_VALUE))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addContainerGap(721, Short.MAX_VALUE))
        );

        mainPanel.add(homepanel, "card2");

        dataPanel.setBackground(new java.awt.Color(209, 216, 224));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setText("Data Produk");

        javax.swing.GroupLayout dataPanelLayout = new javax.swing.GroupLayout(dataPanel);
        dataPanel.setLayout(dataPanelLayout);
        dataPanelLayout.setHorizontalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(1080, Short.MAX_VALUE))
        );
        dataPanelLayout.setVerticalGroup(
            dataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataPanelLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addContainerGap(717, Short.MAX_VALUE))
        );

        mainPanel.add(dataPanel, "card3");

        accountPanel.setBackground(new java.awt.Color(209, 216, 224));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel3.setText("Account");

        kButton1.setBorder(null);
        kButton1.setText("Log Out");
        kButton1.setFont(new java.awt.Font("EngraversGothic BT", 1, 36)); // NOI18N
        kButton1.setkBorderRadius(100);
        kButton1.setkFillButton(false);
        kButton1.setkForeGround(new java.awt.Color(255, 0, 255));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(accountPanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(accountPanelLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(517, Short.MAX_VALUE))
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 612, Short.MAX_VALUE)
                .addComponent(kButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        mainPanel.add(accountPanel, "card4");

        bg.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 1390, 850));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void barpanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barpanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_barpanel1MousePressed

    private void barpanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barpanel1MouseClicked
        if (evt.getClickCount() == 2 &&!evt.isConsumed())
        {
            if (homeView.this.getExtendedState()==MAXIMIZED_BOTH)
            {
                homeView.this.setExtendedState(JFrame.NORMAL);
            }
            else
            {
                homeView.this.setExtendedState(WIDTH);
            }
        }
    }//GEN-LAST:event_barpanel1MouseClicked

    private void barpanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barpanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_barpanel1MouseDragged

    private void minimalize1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimalize1MousePressed
        homeView.this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_minimalize1MousePressed

    private void maximalize1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximalize1MousePressed
        if (homeView.this.getExtendedState()==MAXIMIZED_BOTH)
        {
            homeView.this.setExtendedState(JFrame.NORMAL);
        }
        else
        {
            homeView.this.setExtendedState(MAXIMIZED_BOTH);
        }
    }//GEN-LAST:event_maximalize1MousePressed

    private void exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MousePressed
        System.exit(0);
    }//GEN-LAST:event_exit1MousePressed

    private void btnhomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhomeMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add
        mainPanel.add(homepanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnhomeMouseClicked

    private void btndataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndataMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add
        mainPanel.add(dataPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btndataMouseClicked

    private void btnaccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnaccountMouseClicked
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        //add
        mainPanel.add(accountPanel);
        mainPanel.repaint();
        mainPanel.revalidate();
    }//GEN-LAST:event_btnaccountMouseClicked

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        loginView login = new loginView();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(homeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel accountPanel;
    private javax.swing.JPanel barpanel;
    private javax.swing.JPanel barpanel1;
    private keeptoo.KGradientPanel bg;
    private javax.swing.JLabel btnaccount;
    private javax.swing.JLabel btndata;
    private javax.swing.JLabel btnhome;
    private javax.swing.JPanel dataPanel;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private keeptoo.KButton kButton1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel maximalize;
    private javax.swing.JLabel maximalize1;
    private keeptoo.KGradientPanel menupanel;
    private javax.swing.JLabel minimalize;
    private javax.swing.JLabel minimalize1;
    // End of variables declaration//GEN-END:variables
}
