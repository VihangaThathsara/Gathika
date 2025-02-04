/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.panal;

import java.awt.Color;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modal.LogCenter;
import modal.beans.Admin;
import modal.DB;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import modal.HomeInfo;
import modal.beans.Home;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import raven.toast.Notifications;
import modal.RoundedPanel;

/**
 *
 * @author vihan
 */
public class systemAccess extends javax.swing.JPanel {

    private Admin admin;

    public systemAccess(Admin bean) {
        initComponents();
        this.admin = bean;
        loadEmployee();
        employeeAccessSearch();
        loardLoging();

        txtEmployeeID.setEditable(true);
        txtFirstName.setEditable(true);
        txtLastName.setEditable(true);
    }

    private void loadEmployee() {

        try {
            // Queries
            String query = "SELECT * FROM `employee` "
                    + "INNER JOIN `emp_status` ON `employee`.`emp_status_id` = `emp_status`.`id` "
                    + "INNER JOIN `gender` ON `employee`.`gender_id` = `gender`.`id` "
                    + "INNER JOIN `emp_type` ON `employee`.`emp_type_id` = `emp_type`.`id` "
                    + "LEFT JOIN `emp_access` ON `employee`.`id` = `emp_access`.`employee_id`";

            // Fetch data for table1
            try (ResultSet resultSet = DB.search(query)) {
                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                model.setRowCount(0); // Clear existing data

                while (resultSet.next()) {
                    Vector<String> vector = new Vector<>();
                    vector.add(resultSet.getString("id"));
                    vector.add(resultSet.getString("fname"));
                    vector.add(resultSet.getString("lname"));
                    vector.add(resultSet.getString("mobile"));
                    vector.add(resultSet.getString("join_date"));
                    vector.add(resultSet.getString("emp_status.status"));
                    vector.add(resultSet.getString("gender.name"));
                    vector.add(resultSet.getString("emp_type.name"));
                    vector.add(resultSet.getString("emp_access.user_name"));
                    vector.add(resultSet.getString("emp_access.password"));

                    model.addRow(vector);
                }
            }

            // Center alignment for table cells
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            table1.setDefaultRenderer(Object.class, renderer);

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "Error loading employee data", e);
        }

    }

    private void employeeAccessSearch() {

        try {
            String query = "SELECT "
                    + "    `employee`.id AS Employee_ID, "
                    + "    `employee`.fname AS First_Name, "
                    + "    `employee`.lname AS Last_Name, "
                    + "    `emp_type`.name AS Type, "
                    + "    `emp_access`.user_name AS Username, "
                    + "    `emp_access`.password AS Password "
                    + "FROM "
                    + "    `employee` "
                    + "JOIN "
                    + "    `emp_access` ON `employee`.id = `emp_access`.employee_id "
                    + "JOIN "
                    + "    `emp_type` ON `employee`.emp_type_id = `emp_type`.id";

            // Fetch data for table2
            try (ResultSet resultSet = DB.search(query)) {
                DefaultTableModel dmodel = (DefaultTableModel) table2.getModel();
                dmodel.setRowCount(0); // Clear existing data

                while (resultSet.next()) {
                    Vector<String> vector = new Vector<>();
                    vector.add(resultSet.getString("Employee_ID")); // Matches the alias
                    vector.add(resultSet.getString("First_Name"));  // Matches the alias
                    vector.add(resultSet.getString("Last_Name"));   // Matches the alias
                    vector.add(resultSet.getString("Type"));        // Matches the alias
                    vector.add(resultSet.getString("Username"));    // Matches the alias
                    vector.add(resultSet.getString("Password"));    // Matches the alias

                    dmodel.addRow(vector);
                }
            }

            // Center alignment for table cells
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            table2.setDefaultRenderer(Object.class, renderer);

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "employeeAccessSearch", e);
        }
    }

    private void searchAccess() {

        // Get input from fields
        String employeeID = txtEmployeeID.getText().trim();
        String firstName = txtFirstName.getText().trim();
        String lastName = txtLastName.getText().trim();
        String employeeType = cmbEmployeeType.getSelectedItem().toString();

        // Validation: Ensure at least one search field is filled
        if (employeeID.isEmpty() && firstName.isEmpty() && lastName.isEmpty() && employeeType.equals("Select")) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please fill in at least one search field!");
            return;
        }

        // Build SQL query dynamically based on user input
        String query = "SELECT `employee`.id, `employee`.fname, `employee`.lname, `emp_type`.name AS emp_type, `emp_access`.user_name, `emp_access`.password "
                + "FROM employee INNER JOIN emp_access ON `employee`.id = `emp_access`.employee_id "
                + "INNER JOIN emp_type ON `employee`.emp_type_id = `emp_type`.id WHERE 1=1 "; // Base query

        if (!employeeID.isEmpty()) {
            query += " AND `employee`.id = '" + employeeID + "'";
        }
        if (!firstName.isEmpty()) {
            query += " AND `employee`.fname LIKE '%" + firstName + "%'";
        }
        if (!lastName.isEmpty()) {
            query += " AND `employee`.lname LIKE '%" + lastName + "%'";
        }
        if (!employeeType.equals("Select")) {
            query += " AND `emp_type`.name = '" + employeeType + "'";
        }

        // Execute query using your custom DB class
        try {
            ResultSet rs = DB.search(query);

            // If no results are found
            if (!rs.isBeforeFirst()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "No search results found!");
                employeeAccessSearch(); // Reload full table
                return;
            }

            // Populate the JTable with the results
            DefaultTableModel model = (DefaultTableModel) table2.getModel();
            model.setRowCount(0); // Clear the existing table data
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("fname"),
                    rs.getString("lname"),
                    rs.getString("emp_type"),
                    rs.getString("User_name"),
                    rs.getString("Password")
                });
            }
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "searchAccess", e);
        }
    }

    private void clearFields() {
        txtEmployeeID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        cmbEmployeeType.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new RoundedPanel(20, new Color(234,238,244));
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        jPanel6 = new RoundedPanel(20, new Color(250,249,246));
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        empname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        joineddate = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        empstatus = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        empgender = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        emptype = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        clearall = new javax.swing.JButton();
        deleteclass = new javax.swing.JButton();
        updateclass = new javax.swing.JButton();
        addaccess = new javax.swing.JButton();
        empid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jPanel3 = new RoundedPanel(20, new Color(234,238,244));
        jPanel9 = new RoundedPanel(20, new Color(250,249,246));
        jPanel11 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cmbEmployeeType = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jPanel10 = new RoundedPanel(20, new Color(250,249,246));
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javaswingdev.swing.table.Table();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new RoundedPanel(20, new Color(234,238,244));
        jPanel5 = new RoundedPanel(20, new Color(250,249,246));
        jScrollPane3 = new javax.swing.JScrollPane();
        logingDataTable = new javaswingdev.swing.table.Table();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel12 = new RoundedPanel(20, new Color(250,249,246));
        filterComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser6 = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new RoundedPanel(20, new Color(234,238,244));
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(200, 200, 198));

        jTabbedPane1.setBackground(new java.awt.Color(200, 200, 198));
        jTabbedPane1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(200, 200, 198));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Mobile", "Joined Date", "Employee Status", "Gender", "Employee Type", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(3).setPreferredWidth(70);
            table1.getColumnModel().getColumn(4).setPreferredWidth(120);
            table1.getColumnModel().getColumn(5).setPreferredWidth(90);
            table1.getColumnModel().getColumn(6).setPreferredWidth(60);
            table1.getColumnModel().getColumn(7).setPreferredWidth(85);
            table1.getColumnModel().getColumn(8).setPreferredWidth(50);
            table1.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        jPanel6.setBackground(new java.awt.Color(234, 238, 244));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel8.setFont(new java.awt.Font("Meta", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText(" Employee Name");

        empname.setEditable(false);
        empname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empname.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        empname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empnameActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText(" Employee Contact");

        contact.setEditable(false);
        contact.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setText(" Joined Date");

        joineddate.setEditable(false);
        joineddate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        joineddate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        joineddate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joineddateActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel20.setText(" Employee Status");

        empstatus.setEditable(false);
        empstatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empstatus.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        empstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empstatusActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel21.setText(" Employee Gender");

        empgender.setEditable(false);
        empgender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empgender.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        empgender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empgenderActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel22.setText(" Employee Type");

        emptype.setEditable(false);
        emptype.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emptype.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emptype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contact, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(empname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(joineddate)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emptype)
                            .addComponent(empgender)
                            .addComponent(empstatus)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addContainerGap(103, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(empstatus)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(empgender)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(emptype))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(empname)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(contact)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(joineddate)))
                .addGap(10, 10, 10))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Access", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        clearall.setBackground(new java.awt.Color(255, 255, 255));
        clearall.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        clearall.setText("Clear All");
        clearall.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clearall.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearall.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearallMouseClicked(evt);
            }
        });

        deleteclass.setBackground(new java.awt.Color(255, 51, 51));
        deleteclass.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        deleteclass.setText("Delete Access");
        deleteclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        deleteclass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteclassActionPerformed(evt);
            }
        });

        updateclass.setBackground(new java.awt.Color(255, 255, 102));
        updateclass.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        updateclass.setText("Update Access");
        updateclass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        updateclass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateclassActionPerformed(evt);
            }
        });

        addaccess.setBackground(new java.awt.Color(51, 255, 51));
        addaccess.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        addaccess.setText("Add Access");
        addaccess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addaccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addaccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addaccessActionPerformed(evt);
            }
        });

        empid.setEditable(false);
        empid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        empid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empidActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText(" Password");

        username.setEditable(false);
        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setText(" Username");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText(" Employee ID");

        password.setEditable(false);
        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(empid, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addaccess, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(updateclass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(deleteclass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(clearall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(empid)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(username)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(password))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(addaccess, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(updateclass, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteclass, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(clearall, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("System Access", jPanel2);

        jPanel3.setBackground(new java.awt.Color(200, 200, 198));
        jPanel3.setPreferredSize(new java.awt.Dimension(1003, 606));

        jPanel9.setBackground(new java.awt.Color(234, 238, 244));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setText(" Employee ID");

        txtEmployeeID.setEditable(false);
        txtEmployeeID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtEmployeeID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel17.setText(" Employee First Name");

        txtFirstName.setEditable(false);
        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFirstName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        txtLastName.setEditable(false);
        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLastName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setText(" Employee Last Name");

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel19.setText(" Employee Type");

        cmbEmployeeType.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        cmbEmployeeType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Master Admin", "Admin", "Cashier", "Attendance Marker" }));
        cmbEmployeeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEmployeeTypeActionPerformed(evt);
            }
        });

        search.setBackground(new java.awt.Color(102, 255, 153));
        search.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        search.setText("Search");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 51, 51));
        clear.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        clear.setText("Clear All");
        clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmployeeID)
                    .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFirstName)
                    .addComponent(txtLastName)
                    .addComponent(cmbEmployeeType, 0, 243, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(cmbEmployeeType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(234, 238, 244));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Type", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table2);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton1.setText("Print");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Search Access", jPanel3);

        jPanel1.setBackground(new java.awt.Color(200, 200, 198));

        jPanel5.setBackground(new java.awt.Color(234, 238, 244));

        logingDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Employee ID", "Name", "Username", "Date & Time", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        logingDataTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(logingDataTable);
        if (logingDataTable.getColumnModel().getColumnCount() > 0) {
            logingDataTable.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton2.setText("Print");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton5.setText("Clear All");
        jButton5.setToolTipText("");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(234, 238, 244));

        filterComboBox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        filterComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Today", "Yesterday", "This Week", "This Month" }));
        filterComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterComboBoxItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("FROM");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("TO");

        jButton4.setBackground(new java.awt.Color(102, 255, 153));
        jButton4.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton4.setText("Search");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 255, 153));
        jButton3.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton3.setText("Search");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(filterComboBox, 0, 169, Short.MAX_VALUE)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jDateChooser4, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(filterComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Login History", jPanel1);

        jPanel4.setBackground(new java.awt.Color(200, 200, 198));

        jLabel1.setBackground(new java.awt.Color(250, 249, 246));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        jLabel1.setText("System Access Management");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(661, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void empnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empnameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void joineddateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joineddateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joineddateActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

        if (evt.getClickCount() == 2) {
            buttonToggle();

        }

    }//GEN-LAST:event_table1MouseClicked

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void cmbEmployeeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEmployeeTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbEmployeeTypeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        searchAccess();
    }//GEN-LAST:event_searchActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        clearFields();
        table2.clearSelection();
        employeeAccessSearch();
    }//GEN-LAST:event_clearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            printReportAccess();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        loardLoging();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        loardLoging();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            printReportLogin();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void filterComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterComboBoxItemStateChanged
        loardLoging();
    }//GEN-LAST:event_filterComboBoxItemStateChanged

    private void empstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empstatusActionPerformed

    private void empgenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empgenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empgenderActionPerformed

    private void emptypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emptypeActionPerformed

    private void clearallMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearallMouseClicked
        reset();
    }//GEN-LAST:event_clearallMouseClicked

    private void deleteclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteclassActionPerformed

        int row = table1.getSelectedRow();

        if (row == -1) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Please select employee access");
        } else {

            try {

                String un = String.valueOf(table1.getValueAt(row, 8));
                String pww = String.valueOf(table1.getValueAt(row, 9));
                String empID = String.valueOf(empid.getText());

                DB.IUD("DELETE FROM `emp_access` WHERE `employee_id` ='" + empID + "'");

                loadEmployee();
                reset();

                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Employee Access deleted successfully");

            } catch (Exception e) {
                LogCenter.logger.log(Level.WARNING, "deleteAccess", e);
            }
        }
    }//GEN-LAST:event_deleteclassActionPerformed

    private void updateclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateclassActionPerformed

        String usern = username.getText().trim();
        String passw = password.getText().trim();
        String empID = empid.getText().trim();

        // Get the selected row
        int row = table1.getSelectedRow();
        if (row == -1) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please select a row to update Access");
            return;
        }

        // Get current username and password from the selected row
        String selectedun = String.valueOf(table1.getValueAt(row, 8));
        String selectedpw = String.valueOf(table1.getValueAt(row, 9));

        // Check for empty username
        if (usern.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please enter Username");
            return;
        }

        // Check for empty password
        if (passw.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please enter Password");
            return;
        }

        // Check if new username and password are the same as the current ones
        if (selectedun.equals(usern) && selectedpw.equals(passw)) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please change username or password to update");
            return;
        }

        try {
            // Execute the update query using your DB class
            String query = "UPDATE emp_access SET user_name = '" + usern + "', password = '" + passw + "' WHERE employee_id = '" + empID + "'";
            DB.IUD(query);

            // Notify success
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Access updated successfully");

            // Reload employee table and reset inputs
            loadEmployee();
            reset();
        } catch (Exception e) {
            // Log and notify error
            LogCenter.logger.log(Level.WARNING, "Error updating access", e);
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                    "Failed to update access. Please try again.");
        }
    }//GEN-LAST:event_updateclassActionPerformed

    private void addaccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addaccessActionPerformed

        try {
            // Retrieve user inputs
            String usern = username.getText().trim();
            String passw = password.getText().trim();
            String empID = empid.getText().trim();

            // Check if a row is selected in the table
            int row = table1.getSelectedRow();
            if (row == -1) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please select a row to add Access");
                return;
            }

            // Validate input fields
            if (usern.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please enter Username");
                return;
            }
            if (passw.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please enter Password");
                return;
            }

            // Check for duplicate username or password
            String queryCheck = "SELECT COUNT(*) FROM emp_access WHERE user_name = '" + usern + "' OR password = '" + passw + "'";
            try (ResultSet rs = DB.search(queryCheck)) {
                if (rs.next() && rs.getInt(1) > 0) {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                            "Username or password already exists. Please try different credentials.");
                    return;
                }
            }

            // Insert the new access if validation passes
            String queryInsert = "INSERT INTO emp_access (user_name, password, employee_id) VALUES ('" + usern + "', '" + passw + "', '" + empID + "')";
            DB.IUD(queryInsert);

            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Access added successfully");

            // Reload employee table and reset input fields
            loadEmployee();
            reset();
        } catch (Exception e) {
            // Log and notify error
            LogCenter.logger.log(Level.WARNING, "Error adding access", e);
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                    "Failed to add access. Please try again.");
        }
    }//GEN-LAST:event_addaccessActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void empidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empidActionPerformed

    private void setNotification(JFrame parent) {
        Notifications.getInstance().setJFrame(parent);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addaccess;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearall;
    private javax.swing.JComboBox<String> cmbEmployeeType;
    private javax.swing.JTextField contact;
    private javax.swing.JButton deleteclass;
    private javax.swing.JTextField empgender;
    private javax.swing.JTextField empid;
    private javax.swing.JTextField empname;
    private javax.swing.JTextField empstatus;
    private javax.swing.JTextField emptype;
    private javax.swing.JComboBox<String> filterComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private com.toedter.calendar.JDateChooser jDateChooser6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField joineddate;
    private javaswingdev.swing.table.Table logingDataTable;
    private javax.swing.JTextField password;
    private javax.swing.JButton search;
    private javaswingdev.swing.table.Table table1;
    private javaswingdev.swing.table.Table table2;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JButton updateclass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    private void reset() {

        empname.setText("");
        contact.setText("");
        joineddate.setText("");
        empstatus.setText("");
        empgender.setText("");
        emptype.setText("");
        empid.setText("");
        username.setText("");
        password.setText("");
        table1.clearSelection();
        addaccess.setEnabled(true);
        updateclass.setEnabled(true);
        deleteclass.setEnabled(true);

    }

    private void buttonToggle() {

        int row = table1.getSelectedRow();

        String emp = String.valueOf(table1.getValueAt(row, 0));
        empid.setText(emp);
        empid.setEditable(false);

        String name = String.valueOf(table1.getValueAt(row, 1) + " " + table1.getValueAt(row, 2));
        empname.setText(name);
        empname.setEditable(false);

        String empc = String.valueOf(table1.getValueAt(row, 3));
        contact.setText(empc);
        contact.setEditable(false);

        String empjoineddate = String.valueOf(table1.getValueAt(row, 4));
        joineddate.setText(empjoineddate);
        joineddate.setEditable(false);

        String emps = String.valueOf(table1.getValueAt(row, 5));
        empstatus.setText(emps);
        empstatus.setEditable(false);

        String empg = String.valueOf(table1.getValueAt(row, 6));
        empgender.setText(empg);
        empgender.setEditable(false);

        String empt = String.valueOf(table1.getValueAt(row, 7));
        emptype.setText(empt);
        emptype.setEditable(false);

        String un = String.valueOf(table1.getValueAt(row, 8));
        if (un == "null") {
            username.setText(null);
            username.grabFocus();
        } else {
            username.setText(un);
        }
        username.setEditable(true);

        String pw = String.valueOf(table1.getValueAt(row, 9));
        if (pw == "null") {
            password.setText(null);
        } else {
            password.setText(pw);
        }
        password.setEditable(true);

        String usern = username.getText();
        String passw = String.valueOf(password.getText());

        if (usern.isEmpty() || passw.isEmpty()) {
            addaccess.setEnabled(true);
            updateclass.setEnabled(false);
            deleteclass.setEnabled(false);
        } else {
            addaccess.setEnabled(false);
            updateclass.setEnabled(true);
            deleteclass.setEnabled(true);

        }
    }

    //Reporting 
    private void printReportAccess() throws JRException {

        try {
            // Use JRTableModelDataSource from jTable1's model
            JRTableModelDataSource dataSource = new JRTableModelDataSource(table2.getModel());

            // Get system data
            Home home = new HomeInfo().getHome();

            // Parameters for the report
            HashMap<String, Object> params = new HashMap<>();
            params.put("address", home.getLine01() + "," + home.getLine02() + "," + home.getCity());
            params.put("landLine", home.getLandLine());
            params.put("email", home.getEmail());
            params.put("mobile", home.getMobile());
            params.put("title", "System Access Report");

            // Create an Admin instance (assuming you have access to it in this context)
            // Use saveReport method to save the report
            modal.Reporting reporting = new modal.Reporting();
            boolean isSaved = reporting.saveReport("System_Access_Report", params, dataSource, admin);

            if (isSaved) {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "System Access saved successfully");
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "System Access saving was cancelled");
            }

        } catch (IOException ex) {
            LogCenter.logger.log(Level.WARNING, "I/O error occurred while printing the report", ex);
        } catch (JRException ex) {
            LogCenter.logger.log(Level.WARNING, "Error occurred while generating the report", ex);
        } catch (Exception ex) {
            // Catch any other unexpected exceptions
            LogCenter.logger.log(Level.WARNING, "Unexpected error occurred while printing the report", ex);
        }
    }

    private void printReportLogin() throws JRException {

        try {
            // Use JRTableModelDataSource from jTable1's model
            JRTableModelDataSource dataSource = new JRTableModelDataSource(logingDataTable.getModel());

            // Get system data
            Home home = new HomeInfo().getHome();

            // Parameters for the report
            HashMap<String, Object> params = new HashMap<>();
            params.put("address", home.getLine01() + "," + home.getLine02() + "," + home.getCity());
            params.put("landLine", home.getLandLine());
            params.put("email", home.getEmail());
            params.put("mobile", home.getMobile());
            params.put("title", "System Login Report");

            // Create an Admin instance (assuming you have access to it in this context)
            // Use saveReport method to save the report
            modal.Reporting reporting = new modal.Reporting();
            boolean isSaved = reporting.saveReport("System_Login_Report", params, dataSource, admin);

            if (isSaved) {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "System Login Report saved successfully");
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "System Login Report saving was cancelled");
            }

        } catch (IOException ex) {
            LogCenter.logger.log(Level.WARNING, "I/O error occurred while printing the report", ex);
        } catch (JRException ex) {
            LogCenter.logger.log(Level.WARNING, "Error occurred while generating the report", ex);
        } catch (Exception ex) {
            // Catch any other unexpected exceptions
            LogCenter.logger.log(Level.WARNING, "Unexpected error occurred while printing the report", ex);
        }
    }

    private void loardLoging() {

        try {

            String dateCombo = String.valueOf(filterComboBox.getSelectedItem());
            Date singleDate = jDateChooser4.getDate();
            Date from = jDateChooser5.getDate();
            Date to = jDateChooser6.getDate();

            DefaultTableModel defaultTableModel = (DefaultTableModel) logingDataTable.getModel();
            defaultTableModel.setRowCount(0);

            // Center alignment for table cells
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            logingDataTable.setDefaultRenderer(Object.class, renderer);

            Vector<String[]> vector = new HomeInfo().getlog();
            int row = 1;
            int vLength = vector.size();

            for (String[] log : vector) {

                if (row == vLength) {
                    break;
                }

                String result = log[3].substring(0, 10); // Extract the date part (yyyy/MM/dd)

                if (!dateCombo.equals("Select")) {

                    if (dateCombo.equals("Today")) {
                        // Convert the extracted date to LocalDate
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        LocalDate logDate = LocalDate.parse(result, formatter);

                        String startDateStr = new SimpleDateFormat("yyyy/MM/dd").format(new Date());

                        // Parse the start and end dates
                        LocalDate startDate = LocalDate.parse(startDateStr, formatter);

                        if (logDate.isEqual(startDate)) {
                            Vector<String> v = new Vector<>();
                            v.add(String.valueOf(row)); // #
                            v.add(log[0]); // ID
                            v.add(log[1]); // name
                            v.add(log[2]); // username
                            v.add(log[3]); // datetime
                            v.add(log[4]); // type
                            defaultTableModel.addRow(v);
                            row++;
                        }
                    } else {

                        // yesterday and othere items 
                    }

                } else if (to != null && from != null) {

                    // Convert the extracted date to LocalDate
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                    LocalDate logDate = LocalDate.parse(result, formatter);

                    String startDateStr = new SimpleDateFormat("yyyy/MM/dd").format(to);
                    String endDateStr = new SimpleDateFormat("yyyy/MM/dd").format(from);

                    // Parse the start and end dates
                    LocalDate startDate = LocalDate.parse(startDateStr, formatter);
                    LocalDate endDate = LocalDate.parse(endDateStr, formatter);

                    // Check if the log date is between the start and end dates (inclusive)
                    if ((logDate.isEqual(startDate) || logDate.isAfter(startDate))
                            && (logDate.isEqual(endDate) || logDate.isBefore(endDate))) {

                        Vector<String> v = new Vector<>();
                        v.add(String.valueOf(row)); // #
                        v.add(log[0]); // ID
                        v.add(log[1]); // name
                        v.add(log[2]); // username
                        v.add(log[3]); // datetime
                        v.add(log[4]); // type
                        defaultTableModel.addRow(v);
                        row++;
                    }

                } else if (singleDate != null) {
                    // Convert the extracted date to LocalDate
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                    LocalDate logDate = LocalDate.parse(result, formatter);

                    String startDateStr = new SimpleDateFormat("yyyy/MM/dd").format(singleDate);

                    // Parse the start and end dates
                    LocalDate startDate = LocalDate.parse(startDateStr, formatter);

                    if (logDate.isEqual(startDate)) {
                        Vector<String> v = new Vector<>();
                        v.add(String.valueOf(row)); // #
                        v.add(log[0]); // ID
                        v.add(log[1]); // name
                        v.add(log[2]); // username
                        v.add(log[3]); // datetime
                        v.add(log[4]); // type
                        defaultTableModel.addRow(v);
                        row++;
                    }
                } else {
                    Vector<String> v = new Vector<>();
                    v.add(String.valueOf(row)); // #
                    v.add(log[0]); // ID
                    v.add(log[1]); // name
                    v.add(log[2]); // username
                    v.add(log[3]); // datetime
                    v.add(log[4]); // type
                    defaultTableModel.addRow(v);
                    row++;
                }
            }
            logingDataTable.setModel(defaultTableModel);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadLoging", e);
        }

    }
}
