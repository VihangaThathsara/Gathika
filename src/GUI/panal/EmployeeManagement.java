package GUI.panal;

import GUI.popup.Employee_Address;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modal.DB;
import modal.Validator;
import modal.IDGenarator;
import modal.LogCenter;
import modal.SetDate;
import modal.beans.Admin;
import modal.RoundedPanel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import raven.toast.Notifications;

public class EmployeeManagement extends javax.swing.JPanel {

    HashMap<String, String> genderMap = new HashMap<>();
    HashMap<String, String> employeeTypeMap = new HashMap<>();
    HashMap<String, String> employeeStatusMap = new HashMap<>();

    private Admin admin;

    public EmployeeManagement(Admin bean) {
        this.admin = bean;
        initComponents();
        loadGender();
        loadEmployeeType();
        loadEmployee("");
    }

    private String AddressId;
    private String EmployeeId;

    // Class-level variable to check if the dialog is open
    private Employee_Address employeeAddressDialog;

    public void setAddressId(String aid) {
        this.AddressId = aid;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new RoundedPanel(20, new Color(234,238,244));
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new RoundedPanel(20, new Color(234,238,244));
        jPanel3 = new RoundedPanel(20, new Color(250,249,246));
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new RoundedPanel(20, new Color(250,249,246));
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javaswingdev.swing.table.Table();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JButton();

        setBackground(new java.awt.Color(200, 200, 198));
        setPreferredSize(new java.awt.Dimension(967, 668));

        jPanel4.setBackground(new java.awt.Color(200, 200, 198));

        jLabel10.setBackground(new java.awt.Color(250, 249, 246));
        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        jLabel10.setText("Employee Management");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(200, 200, 198));

        jPanel3.setBackground(new java.awt.Color(234, 238, 244));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setBackground(new java.awt.Color(0, 102, 204));
        jButton4.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton4.setText("Address");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 255, 51));
        jButton3.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton3.setText("Add Employee");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton1.setText("Update Employee");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setText(" First Name");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText(" Last Name");

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText(" Mobile");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText(" Gender");

        jComboBox1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText(" Employee Type");

        jComboBox2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active" }));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setText(" Employee Status");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 261, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, 261, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(91, 91, 91)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(0, 0, 0)
                                .addComponent(jTextField3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, 0)
                                .addComponent(jComboBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(0, 0, 0)
                                .addComponent(jComboBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addGap(0, 0, 0)
                                .addComponent(jComboBox3)))
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(234, 238, 244));

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Search");

        jTextField5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton5.setText("Clear");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Mobile", "Address", "Employee Status", "Gender", "Employee Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton2.setText("Print");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 51, 51));
        jLabel8.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jLabel8.setText("Clear All");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        searchEmployee();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField5.setText("");
        loadEmployee("");
        jTextField5.grabFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        loadEmployeeStatus();
        int selected_row = jTable1.getSelectedRow();

        this.EmployeeId = String.valueOf(jTable1.getValueAt(selected_row, 0));

        String firstname = String.valueOf(jTable1.getValueAt(selected_row, 1));
        jTextField1.setText(firstname);

        String lastname = String.valueOf(jTable1.getValueAt(selected_row, 2));
        jTextField2.setText(lastname);

        String mobile = String.valueOf(jTable1.getValueAt(selected_row, 3));
        jTextField3.setText(mobile);

        String gender = String.valueOf(jTable1.getValueAt(selected_row, 6));
        jComboBox1.setSelectedItem(gender);

        String emp_type = String.valueOf(jTable1.getValueAt(selected_row, 7));
        jComboBox2.setSelectedItem(emp_type);

        String emp_status = String.valueOf(jTable1.getValueAt(selected_row, 5));
        jComboBox3.setSelectedItem(emp_status);

        jButton3.setEnabled(false);
        jButton4.setEnabled(false);

        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);

        if (evt.getClickCount() == 2) {
            int row = jTable1.getSelectedRow();

            if (row != -1) {

                String id = String.valueOf(jTable1.getValueAt(row, 0));

                try {
                    ResultSet rs = DB.search("SELECT * FROM `employee` WHERE `id` = '" + id + "'");

                    if (rs.next()) {
                        String adId = rs.getString("address_id");

                        Employee_Address employee_Address = new Employee_Address(this, true, adId);

                        employee_Address.addWindowListener(new java.awt.event.WindowAdapter() {

                            @Override
                            public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                                loadEmployee(""); // Refresh employee data when dialog closes
                            }
                        });

                        employee_Address.setVisible(true);

                    }

                } catch (Exception e) {
                    LogCenter.logger.log(Level.WARNING, "jTable1MouseClicked", e);
                }

            } else {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please select a row to view the address");
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "jButton2ActionPerformed", e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        refresh();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        address();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        add();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        update();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javaswingdev.swing.table.Table jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    private void loadEmployee(String value) {
        try {

            String query = "SELECT * FROM employee "
                    + "INNER JOIN address ON employee.address_id = address.id "
                    + "INNER JOIN emp_status ON employee.emp_status_id = emp_status.id "
                    + "INNER JOIN gender ON employee.gender_id = gender.id "
                    + "INNER JOIN emp_type ON employee.emp_type_id = emp_type.id";

            if (value.matches("\\d+")) {
                query += " WHERE employee.mobile LIKE '%" + value + "%'";

            } else if (value.matches("^EMP\\d*$")) {
                query += " WHERE employee.id LIKE '%" + value + "%'";

            } else {
                query += " WHERE employee.fname LIKE '%" + value + "%'";
            }

            ResultSet resultSet = DB.search(query);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1.setDefaultRenderer(Object.class, renderer);

            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("id"));
                vector.add(resultSet.getString("fname"));
                vector.add(resultSet.getString("lname"));
                vector.add(resultSet.getString("mobile"));
                vector.add(resultSet.getString("address.line_01") + " , " + resultSet.getString("address.line_02"));
                vector.add(resultSet.getString("emp_status.status"));
                vector.add(resultSet.getString("gender.name"));
                vector.add(resultSet.getString("emp_type.name"));

                model.addRow(vector);
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadEmployee", e);
        }
    }

    private void loadGender() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `gender`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                genderMap.put(resultSet.getString("name"), resultSet.getString("id"));
            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox1.setModel(model);

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadGender", e);
        }
    }

    private void loadEmployeeType() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `emp_type`");

            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {

                String name = resultSet.getString("name");

                if (!"Master Admin".equals(name)) {
                    vector.add(resultSet.getString("name"));
                }
                employeeTypeMap.put(resultSet.getString("name"), resultSet.getString("id"));
            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox2.setModel(model);

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadEmployeeType", e);
        }

    }

    private void loadEmployeeStatus() {

        try {
            ResultSet resultSet = DB.search("SELECT * FROM `emp_status`");

            Vector<String> vector = new Vector<>();

            while (resultSet.next()) {
                vector.add(resultSet.getString("status"));
                employeeStatusMap.put(resultSet.getString("status"), resultSet.getString("id"));
            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox3.setModel(model);

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadEmployeeStatus", e);
        }

    }


    public void refresh() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField5.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Active"}));
        jTable1.clearSelection();
        loadEmployee("");
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jComboBox1.setEnabled(true);
        jComboBox2.setEnabled(true);
        jTextField1.grabFocus();
        this.EmployeeId = null;
        this.AddressId = null;
    }

    private void searchEmployee() {
        String value = jTextField5.getText(); // Get the input from the JTextField
        loadEmployee(value);
    }

    private void update() {
        try {
            String employee_id = this.EmployeeId;
            String fname = jTextField1.getText();
            String lname = jTextField2.getText();
            String mobile = jTextField3.getText();
            String gender = String.valueOf(jComboBox1.getSelectedItem());
            String employee_type = String.valueOf(jComboBox2.getSelectedItem());
            String employee_status = String.valueOf(jComboBox3.getSelectedItem());

            if (employee_id == null) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Select An Employee First");
                jTable1.grabFocus();

            } else if (fname.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter the Employee's First Name");
                jTextField1.grabFocus();

            } else if (!Validator.NAME.validate(fname)) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "First Name Must Contaion Only Letters");
                jTextField1.grabFocus();

            } else if (lname.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter the Employee's Last Name");
                jTextField2.grabFocus();

            } else if (!Validator.NAME.validate(lname)) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Last Name Must Contaion Only Letters");
                jTextField2.grabFocus();

            } else if (mobile.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter A Mobile Number");
                jTextField2.grabFocus();

            } else if (!Validator.MOBILE_NUMBER.validate(mobile)) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter A Valid Mobile Number");
                jTextField2.grabFocus();

            } else {

                ResultSet resultSet = DB.search("SELECT * FROM `employee` INNER JOIN `emp_status` ON `employee`.`emp_status_id` = `emp_status`.`id`"
                        + " WHERE `employee`.`id` ='" + this.EmployeeId + "' ");

                boolean Update = false;

                if (resultSet.next()) {

                    String exfname = resultSet.getString("fname");
                    String exlname = resultSet.getString("lname");
                    String exmobile = resultSet.getString("mobile");
                    String exemployee_status = resultSet.getString("emp_status.status");

                    if (!exfname.equals(fname) || !exlname.equals(lname) || !exmobile.equals(mobile) || !exemployee_status.equals(employee_status)) {
                        Update = true;

                    } else {
                        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "No changes detected. Please Update at least one Detail");

                    }

                }

                if (Update) {
                    DB.IUD("UPDATE  `employee` SET `fname` = '" + fname + "' ,`lname` = '" + lname + "',`mobile`='" + mobile + "',"
                            + "`emp_status_id` = '" + employeeStatusMap.get(employee_status) + "',`gender_id` = '" + genderMap.get(gender) + "',"
                            + "`emp_type_id` ='" + employeeTypeMap.get(employee_type) + "' WHERE `id` = '" + employee_id + "' ");

                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Employee Details Updated Successfully");
                    refresh();
                }

            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "update", e);
        }
    }

    private void add() {
        try {
            String fname = jTextField1.getText();
            String lname = jTextField2.getText();
            String mobile = jTextField3.getText();
            String gender = String.valueOf(jComboBox1.getSelectedItem());
            String employee_type = String.valueOf(jComboBox2.getSelectedItem());
            String employee_status = String.valueOf(jComboBox3.getSelectedItem());

            String newID = IDGenarator.generateID("EMP", "employee");
            String Date = SetDate.getDate("yyyy-MM-dd HH:mm:ss");

            if (fname.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter the Employee's First Name");
                jTextField1.grabFocus();

            } else if (!Validator.NAME.validate(fname)) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "First Name Must Contaion Only Letters");
                jTextField1.grabFocus();

            } else if (lname.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter the Employee's Last Name");
                jTextField2.grabFocus();

            } else if (!Validator.NAME.validate(lname)) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Last Name Must Contaion Only Letters");
                jTextField2.grabFocus();

            } else if (mobile.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter A Mobile Number");
                jTextField2.grabFocus();

            } else if (!Validator.MOBILE_NUMBER.validate(mobile)) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter A Valid Mobile Number");
                jTextField2.grabFocus();

            } else if (gender.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Select A Gender");
                jComboBox1.grabFocus();

            } else if (employee_type.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Select An Employee Type");
                jComboBox2.grabFocus();

            } else if (this.AddressId == null) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter An Address");
                jButton3.grabFocus();

            } else {

                ResultSet resultSet = DB.search("SELECT * FROM `employee` WHERE `mobile` ='" + mobile + "' ");

                if (resultSet.next()) {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "This Provided Mobile Number Already Have Been Used");
                    jTextField2.grabFocus();

                } else {
                    ResultSet resultSet2 = DB.search("SELECT `id` FROM `emp_status` WHERE `status` ='" + employee_status + "' ");
                    if (resultSet2.next()) {

                        String emp_status = resultSet2.getString("id");

                        DB.IUD("INSERT INTO `employee` (`id`,`fname`,`lname`,`mobile`,`join_date`,`address_id`,`emp_status_id`,`gender_id`,`emp_type_id`) VALUES"
                                + "('" + newID + "','" + fname + "','" + lname + "','" + mobile + "','" + Date + "','" + AddressId + "','" + emp_status + "','" + genderMap.get(gender) + "','" + employeeTypeMap.get(employee_type) + "')");

                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "New Employee Added Successfully");
                        refresh();
                    } else {
                        Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER,
                    "There is No Employee Status Like That In the database");
                        refresh();
                    }
                }

            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "add", e);
        }
    }

    private void address() {

        // Check if the Address ID already exists
        if (AddressId != null) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Address ID already exists");
            return; // Exit if the ID exists
        }

        // If the dialog is already created, just bring it to the front
        if (employeeAddressDialog != null && employeeAddressDialog.isVisible()) {
            employeeAddressDialog.toFront(); // Bring the dialog to the front if it's already visible
        } else {
            // Otherwise, create and show a new dialog
            employeeAddressDialog = new Employee_Address(this, true, null);
            employeeAddressDialog.setVisible(true);
        }
    }

}
