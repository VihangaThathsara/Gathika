package GUI;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import modal.LogCenter;
import java.sql.Connection;
import java.sql.DriverManager;
import modal.HomeInfo;
import modal.beans.Home;

public class AddDB extends javax.swing.JFrame {

    public AddDB() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        host = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        port = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        database = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(234, 238, 244));

        jLabel16.setFont(new java.awt.Font("Advert", 0, 14)); // NOI18N
        jLabel16.setText("Host");

        jLabel17.setFont(new java.awt.Font("Advert", 0, 14)); // NOI18N
        jLabel17.setText("Port");

        port.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Advert", 0, 14)); // NOI18N
        jLabel18.setText("Database");

        jLabel19.setFont(new java.awt.Font("Advert", 0, 14)); // NOI18N
        jLabel19.setText("UserName");

        jLabel20.setFont(new java.awt.Font("Advert", 0, 14)); // NOI18N
        jLabel20.setText("Password");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Save");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Database Cnfiguration");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(port, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(password))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(database, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(jLabel2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(host, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(database, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        saveData();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void portActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField database;
    private javax.swing.JTextField host;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField password;
    private javax.swing.JTextField port;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private boolean createSER() {
        // creaate file
        try {

            File file = new File(System.getProperty("user.dir") + "\\homeinfo.ser");
            if (!file.isFile()) {
                file.createNewFile();
            }
            return file.isFile();

        } catch (IOException e) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Error occurred While Creating SER file", e);
        }
        return false;
    }

    /*
    * Create SER file And Validate Wathere It is Exsit 
    * Is file return True
    * Is not file return False
     */
    private void saveData() {

        String host = this.host.getText();
        String port = this.port.getText();
        String database = this.database.getText();
        String admin = username.getText();
        String password = this.password.getText();

        if (host.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Host is required");
        } else if (port.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Port is required");
        } else if (database.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Database name is required");
        } else if (admin.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Admin username is required");
        } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password is required");
        } else {
            boolean isConnection = ValidateConnection(host, port, database, admin, password);

            if (isConnection) {
                if (createSER()) {

                    //create bean that include data
                    Home home = new Home();
                    home.setHost(host);
                    home.setPort(port);
                    home.setDatabase(database);
                    home.setAdmin(admin);
                    home.setPassword(password);

                    try {
                        new HomeInfo().setHome(home);
                        new AddCompaney(home).setVisible(true);
                        this.dispose();
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(this, "Process Incompeted Please Try Again");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "File Creation Faild, Try Again");
                }
            }
        }

    }

    private boolean ValidateConnection(String host, String port, String db, String admin, String ps) {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db;
        String user = admin;
        String password = ps;

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            if (conn != null) {
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Wrong Database Connection");
            this.host.setText("");
            this.port.setText("");
            this.database.setText("");
            username.setText("");
            this.password.setText("");
            return false;
        }
        return false;
    }
}
