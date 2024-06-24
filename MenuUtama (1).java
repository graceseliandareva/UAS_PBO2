
package main;
import java.awt.Color;
import static java.awt.SystemColor.menu;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



/**
 *
 * @author User
 */
public class MenuUtama extends javax.swing.JFrame {
int xx,xy;
    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pn_navbar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pn_content = new javax.swing.JPanel();
        pn_sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pn_home = new javax.swing.JLabel();
        Task = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Settings = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pn_newtask = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pn_navbar.setBackground(new java.awt.Color(0, 102, 204));
        pn_navbar.setPreferredSize(new java.awt.Dimension(850, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_cancel_20px.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_navbarLayout = new javax.swing.GroupLayout(pn_navbar);
        pn_navbar.setLayout(pn_navbarLayout);
        pn_navbarLayout.setHorizontalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_navbarLayout.createSequentialGroup()
                .addContainerGap(824, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        pn_navbarLayout.setVerticalGroup(
            pn_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(pn_navbar, java.awt.BorderLayout.PAGE_START);

        pn_content.setBackground(new java.awt.Color(255, 255, 255));

        pn_sidebar.setBackground(new java.awt.Color(0, 102, 204));
        pn_sidebar.setPreferredSize(new java.awt.Dimension(280, 445));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Taskify");

        Home.setBackground(new java.awt.Color(0, 102, 204));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_60px.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        pn_home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pn_home.setForeground(new java.awt.Color(255, 255, 255));
        pn_home.setText("Home");
        pn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_homeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_homeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(109, 109, 109))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(pn_home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Task.setBackground(new java.awt.Color(0, 102, 204));
        Task.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TaskMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_brief_60px.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Task");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TaskLayout = new javax.swing.GroupLayout(Task);
        Task.setLayout(TaskLayout);
        TaskLayout.setHorizontalGroup(
            TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TaskLayout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(111, Short.MAX_VALUE)))
        );
        TaskLayout.setVerticalGroup(
            TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TaskLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel10)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        Settings.setBackground(new java.awt.Color(0, 102, 204));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_New_Copy_60px.png"))); // NOI18N
        jLabel6.setText("jLabel6");

        pn_newtask.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        pn_newtask.setForeground(new java.awt.Color(255, 255, 255));
        pn_newtask.setText("NewTask");
        pn_newtask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_newtaskMouseClicked(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(0, 102, 204));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_logout_60px.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Logout");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LogoutLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout SettingsLayout = new javax.swing.GroupLayout(Settings);
        Settings.setLayout(SettingsLayout);
        SettingsLayout.setHorizontalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_newtask, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SettingsLayout.setVerticalGroup(
            SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SettingsLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(3, 3, 3))
                    .addGroup(SettingsLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(pn_newtask, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_sidebarLayout = new javax.swing.GroupLayout(pn_sidebar);
        pn_sidebar.setLayout(pn_sidebarLayout);
        pn_sidebarLayout.setHorizontalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_sidebarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
        );
        pn_sidebarLayout.setVerticalGroup(
            pn_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_sidebarLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Task, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_contentLayout = new javax.swing.GroupLayout(pn_content);
        pn_content.setLayout(pn_contentLayout);
        pn_contentLayout.setHorizontalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contentLayout.createSequentialGroup()
                .addComponent(pn_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_contentLayout.setVerticalGroup(
            pn_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_contentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pn_sidebar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        getContentPane().add(pn_content, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void formMousePressed(java.awt.event.MouseEvent evt) {                                  
     xx = evt.getX();
     xy = evt.getY();
    
    }                                 

    private void formMouseDragged(java.awt.event.MouseEvent evt) {                                  
      int x = evt.getXOnScreen();
         int y = evt.getYOnScreen();
         this.setLocation(x -xx , y -xy);
    }                                 
  private void switchPanel(JPanel panel) {
        pn_content.removeAll();
        pn_content.add(panel);
        pn_content.revalidate();
        pn_content.repaint();
    }
    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {                                  
   
    }                                 

    private void TaskMouseClicked(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    private void pn_homeMouseClicked(java.awt.event.MouseEvent evt) {                                     
pn_utama.removeAll();
pn_utama.add(new MenuHome());
pn_utama.repaint();
pn_utama.revalidate();
    }                                    

    private void pn_homeMouseEntered(java.awt.event.MouseEvent evt) {                                     
      pn_home.setBackground(new Color(0, 153, 255));
    }                                    

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {                                      
    pn_utama.removeAll();
pn_utama.add(new MenuTask());
pn_utama.repaint();
pn_utama.revalidate();
    }                                     

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {                                     
// Munculkan dialog konfirmasi
    int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi Logout", JOptionPane.YES_NO_OPTION);
    
    // Periksa pilihan yang dipilih oleh pengguna
    if (confirm == JOptionPane.YES_OPTION) {
        // Jika pengguna memilih "Ya", logout dan tampilkan form login
        new form_login().setVisible(true);
        dispose(); // Tutup jendela MenuUtama
    } else if (confirm == JOptionPane.NO_OPTION) {
        // Jika pengguna memilih "Batal", tidak melakukan apa-apa
        // Pengguna tetap berada di MenuUtama
    }
    }                                    

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
     dispose();
    }                                    

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
    }                                 

    private void pn_homeMouseExited(java.awt.event.MouseEvent evt) {                                    
      pn_home.setBackground(new Color(0, 102, 204));
    }                                   

    private void pn_newtaskMouseClicked(java.awt.event.MouseEvent evt) {                                        
      pn_utama.removeAll();
pn_utama.add(new NewTask());
pn_utama.repaint();
pn_utama.revalidate();
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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Logout;
    private javax.swing.JPanel Settings;
    private javax.swing.JPanel Task;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pn_content;
    private javax.swing.JLabel pn_home;
    private javax.swing.JPanel pn_navbar;
    private javax.swing.JLabel pn_newtask;
    private javax.swing.JPanel pn_sidebar;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration                   
}














