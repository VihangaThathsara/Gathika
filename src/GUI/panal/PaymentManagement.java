package GUI.panal;

import java.io.FileNotFoundException;
import java.io.IOException;
import modal.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modal.HomeInfo;
import modal.LogCenter;
import modal.SetDate;
import modal.Validator;
import modal.beans.Admin;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import modal.RoundedPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import raven.toast.Notifications;

/**
 * @author isuru priyamntha
 */
public class PaymentManagement extends javax.swing.JPanel {

    private Admin admin;

    public PaymentManagement(Admin user) {
        this.admin = user;
        initComponents();
        cleanClass();
        cleanCourse();
        cheackCondition();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new RoundedPanel(20, new Color(234,238,244));
        jPanel6 = new RoundedPanel(20, new Color(250,249,246));
        jPanel4 = new javax.swing.JPanel();
        studentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        subject01 = new javax.swing.JTextField();
        classIdCombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        teacher01 = new javax.swing.JTextField();
        grade01 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        class_add = new javax.swing.JButton();
        dueM_01 = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        classFee01 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        hallfee01 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new RoundedPanel(20, new Color(250,249,246));
        jLabel6 = new javax.swing.JLabel();
        classTotal = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        classPayment = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        classBalance = new javax.swing.JFormattedTextField();
        paymentBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        classTable = new javaswingdev.swing.table.Table();
        jPanel5 = new RoundedPanel(20, new Color(234,238,244));
        jPanel8 = new RoundedPanel(20, new Color(250,249,246));
        jPanel9 = new javax.swing.JPanel();
        student_id = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        student_name = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        subject_id = new javax.swing.JTextField();
        course_id = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        teacher_name = new javax.swing.JTextField();
        leval = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        due_fee = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        paying_fee = new javax.swing.JFormattedTextField();
        courese_fee = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel13 = new RoundedPanel(20, new Color(250,249,246));
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        course_balacnce = new javax.swing.JFormattedTextField();
        course_payment = new javax.swing.JFormattedTextField();
        course_total = new javax.swing.JFormattedTextField();
        course_pay = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        course_table = new javaswingdev.swing.table.Table();
        jPanel3 = new RoundedPanel(20, new Color(234,238,244));
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jPanel14 = new RoundedPanel(20, new Color(250,249,246));
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javaswingdev.swing.table.Table();
        jPanel12 = new RoundedPanel(20, new Color(234,238,244));
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(200, 200, 198));

        jTabbedPane1.setBackground(new java.awt.Color(200, 200, 198));
        jTabbedPane1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(200, 200, 198));

        jPanel6.setBackground(new java.awt.Color(234, 238, 244));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Meta", 0, 12)); // NOI18N

        studentID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        studentID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                studentIDKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText(" Student ID");

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText(" Full Name");

        stName.setEditable(false);

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stName)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(studentID, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentID, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText(" Class ID");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText(" Subject");

        subject01.setEditable(false);
        subject01.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        classIdCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classIdComboItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setText(" Teacher Name");

        teacher01.setEditable(false);
        teacher01.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        grade01.setEditable(false);
        grade01.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText(" Grade");

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText(" Due Month");

        class_add.setBackground(new java.awt.Color(51, 255, 51));
        class_add.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        class_add.setText("Add");
        class_add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        class_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                class_addActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel32.setText(" class Fee");

        classFee01.setEditable(false);
        classFee01.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel33.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel33.setText(" Hall Fee");

        hallfee01.setEditable(false);
        hallfee01.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jCheckBox1.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jCheckBox1.setText("Free Card");
        jCheckBox1.setActionCommand("true");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classIdCombo, 0, 154, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(subject01, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(teacher01, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grade01, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(dueM_01, 0, 170, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classFee01, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(hallfee01, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(class_add, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addComponent(jLabel33))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classIdCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacher01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(grade01, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dueM_01)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(classFee01, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(hallfee01, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(class_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(234, 238, 244));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 1, 15)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        classTotal.setEditable(false);
        classTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        classTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 1, 15)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Payment");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        classPayment.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        classPayment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        classPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                classPaymentKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 1, 15)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Balance");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        classBalance.setEditable(false);
        classBalance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        classBalance.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        paymentBTN.setBackground(new java.awt.Color(0, 102, 204));
        paymentBTN.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        paymentBTN.setText("Make Payment");
        paymentBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        paymentBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBTNActionPerformed(evt);
            }
        });

        classTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Class ID", "Subject", "Grade", "Teacher Name", "Due Month", "Hall Fee", "Class Fee", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        classTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(classTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(classPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(classTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(classBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(paymentBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(classPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Class Payments", jPanel2);

        jPanel5.setBackground(new java.awt.Color(200, 200, 198));

        jPanel8.setBackground(new java.awt.Color(234, 238, 244));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        student_id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        student_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                student_idKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel13.setText(" Student ID");

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel14.setText(" Full Name");

        student_name.setEditable(false);
        student_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton4.setText("Clear");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 46, Short.MAX_VALUE))
                            .addComponent(student_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(student_name))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(student_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setText(" Course ID");

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel17.setText(" Subject");

        subject_id.setEditable(false);
        subject_id.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        course_id.setFont(new java.awt.Font("Meta", 0, 12)); // NOI18N
        course_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                course_idItemStateChanged(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setText(" Teacher Name");

        teacher_name.setEditable(false);
        teacher_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        leval.setEditable(false);
        leval.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel19.setText(" Level");

        due_fee.setEditable(false);
        due_fee.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel20.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel20.setText(" Due Payment");

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton5.setText("Add");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel31.setText(" Paying Fee");

        paying_fee.setEditable(false);
        paying_fee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        paying_fee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paying_feeKeyReleased(evt);
            }
        });

        courese_fee.setEditable(false);
        courese_fee.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel34.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel34.setText(" Course Fee");

        jCheckBox2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jCheckBox2.setText("Free");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courese_fee, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(due_fee, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(paying_fee, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox2)
                                .addGap(24, 24, 24)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(course_id, 0, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subject_id)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(0, 110, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(teacher_name, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leval, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel19))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subject_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teacher_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(leval, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel31)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(due_fee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courese_fee, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paying_fee, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(234, 238, 244));

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 1, 15)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Total");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 1, 15)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Payment");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 1, 15)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Balance");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        course_balacnce.setEditable(false);
        course_balacnce.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        course_balacnce.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        course_payment.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,###.00"))));
        course_payment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        course_payment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                course_paymentKeyReleased(evt);
            }
        });

        course_total.setEditable(false);
        course_total.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        course_total.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        course_pay.setBackground(new java.awt.Color(0, 51, 255));
        course_pay.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        course_pay.setText("Make Payment");
        course_pay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        course_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course_payActionPerformed(evt);
            }
        });

        course_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Subject", "Teacher Name", "Course Fee", "Due Payment", "Paid Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        course_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(course_table);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 673, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(course_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(course_total, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(course_balacnce, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(course_pay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(course_total, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(course_payment)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(course_balacnce, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(course_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Course Payments", jPanel5);

        jPanel3.setBackground(new java.awt.Color(200, 200, 198));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sorting Section", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel11.setFont(new java.awt.Font("Advert", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel25.setText(" Student ID");

        jTextField16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField16KeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel26.setText(" Class ID");

        jTextField17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField17KeyReleased(evt);
            }
        });

        jTextField18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField18KeyReleased(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel27.setText(" Course ID");

        jTextField20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField20KeyReleased(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel29.setText(" Teacher ID");

        jLabel30.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel30.setText(" Time");

        jComboBox3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "This Month", "Last Month", "This Quarter", "This Semiannual", "This Year", "Last Year" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField16)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField17)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField18)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField20)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(256, 256, 256))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jComboBox3))))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel14.setBackground(new java.awt.Color(234, 238, 244));

        jButton9.setBackground(new java.awt.Color(255, 51, 51));
        jButton9.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton9.setText("Clear");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 102, 204));
        jButton8.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton8.setText("View");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton7.setText("Export As PDF");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NO", "Student ID", "Class ID", "Teacher NIC", "Date", "Fee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View & Reporting", jPanel3);

        jPanel12.setBackground(new java.awt.Color(200, 200, 198));

        jLabel4.setBackground(new java.awt.Color(250, 249, 246));
        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        jLabel4.setText("Student Payments Management");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void classIdComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classIdComboItemStateChanged
        selectClass();
    }//GEN-LAST:event_classIdComboItemStateChanged

    private void class_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_class_addActionPerformed
        addPayment();
    }//GEN-LAST:event_class_addActionPerformed

    private void classPaymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_classPaymentKeyReleased
        makeBalace();
    }//GEN-LAST:event_classPaymentKeyReleased

    private void paymentBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBTNActionPerformed
        makePayment();
    }//GEN-LAST:event_paymentBTNActionPerformed

    private void student_idKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_student_idKeyReleased
        loardClass();
    }//GEN-LAST:event_student_idKeyReleased

    private void course_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_course_idItemStateChanged
        selectCourse();
    }//GEN-LAST:event_course_idItemStateChanged

    private void paying_feeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paying_feeKeyReleased
        validateFee();
    }//GEN-LAST:event_paying_feeKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        addCourse();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void course_paymentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_course_paymentKeyReleased
        getBalance();
    }//GEN-LAST:event_course_paymentKeyReleased

    private void course_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_payActionPerformed
        makeCoursePay();
    }//GEN-LAST:event_course_payActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearAll();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyReleased
        cheackCondition();
    }//GEN-LAST:event_jTextField16KeyReleased

    private void jTextField17KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyReleased
        cheackCondition();
    }//GEN-LAST:event_jTextField17KeyReleased

    private void jTextField20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyReleased
        cheackCondition();
    }//GEN-LAST:event_jTextField20KeyReleased

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        cheackCondition();
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jTextField18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyReleased
        cheackCondition();
    }//GEN-LAST:event_jTextField18KeyReleased

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cleanReport();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void studentIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_studentIDKeyReleased
        findStudent();
    }//GEN-LAST:event_studentIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField classBalance;
    private javax.swing.JTextField classFee01;
    private javax.swing.JComboBox<String> classIdCombo;
    private javax.swing.JFormattedTextField classPayment;
    private javaswingdev.swing.table.Table classTable;
    private javax.swing.JFormattedTextField classTotal;
    private javax.swing.JButton class_add;
    private javax.swing.JTextField courese_fee;
    private javax.swing.JFormattedTextField course_balacnce;
    private javax.swing.JComboBox<String> course_id;
    private javax.swing.JButton course_pay;
    private javax.swing.JFormattedTextField course_payment;
    private javaswingdev.swing.table.Table course_table;
    private javax.swing.JFormattedTextField course_total;
    private javax.swing.JComboBox<String> dueM_01;
    private javax.swing.JTextField due_fee;
    private javax.swing.JTextField grade01;
    private javax.swing.JTextField hallfee01;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
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
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javaswingdev.swing.table.Table jTable3;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField leval;
    private javax.swing.JFormattedTextField paying_fee;
    private javax.swing.JButton paymentBTN;
    private javax.swing.JTextField stName;
    private javax.swing.JTextField studentID;
    private javax.swing.JTextField student_id;
    private javax.swing.JTextField student_name;
    private javax.swing.JTextField subject01;
    private javax.swing.JTextField subject_id;
    private javax.swing.JTextField teacher01;
    private javax.swing.JTextField teacher_name;
    // End of variables declaration//GEN-END:variables

    // seach student and view data by ID
    private void findStudent() {
        String sid = this.studentID.getText();
        if (sid.length() >= 8) {
            try {
                ResultSet rs = DB.search("SELECT `fname`, `lname` FROM `student` "
                        + "WHERE `student`.`id` = '" + sid + "'");

                if (rs.next()) {
                    ResultSet classData = DB.search("SELECT `class_enrollment`.`class_id` FROM `class_enrollment` WHERE `class_enrollment`.`student_id` = '" + sid + "' ");
                    Vector<String> v = new Vector<>();
                    v.add("Select Class");
                    while (classData.next()) {
                        v.add(classData.getString("class_id"));
                    }
                    DefaultComboBoxModel boxModel = new DefaultComboBoxModel(v);

                    classIdCombo.setModel(boxModel);
                    stName.setText(rs.getString("fname") + " " + rs.getString("fname"));
                    classIdCombo.setEnabled(true);
                } else {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Student Not Found");
                    cleanClass();
                }
            } catch (ClassNotFoundException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            } catch (SQLException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
            } catch (IOException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            }
        } else {
            cleanClass();
        }
    }

    // clear fields
    private void cleanClass() {

        jCheckBox1.setEnabled(false); // is_free check 

        studentID.setEditable(true);
        studentID.grabFocus();

        classFee01.setText(""); // class fee
        hallfee01.setText(""); // hall fee
        stName.setText(""); // student name
        subject01.setText(""); // subject
        teacher01.setText(""); // teacher
        grade01.setText(""); // grade

        dueM_01.removeAllItems(); // due month combo
        dueM_01.setEnabled(false);

        classIdCombo.setEnabled(false); // classID combo
        classIdCombo.removeAllItems();

        class_add.setEnabled(false); // add button

        DefaultTableModel dtm = (DefaultTableModel) classTable.getModel(); // clear table
        dtm.setRowCount(0);
        
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        classTable.setDefaultRenderer(Object.class, renderer);

        classTotal.setText("");
        classBalance.setText("");
        classPayment.setText("");

        paymentBTN.setEnabled(false);
    }

    // find class by student ID
    private void selectClass() {
        studentID.setEditable(false);
        String classID = String.valueOf(classIdCombo.getSelectedItem());

        if (classID == null || !classID.equals("Select Class")) {
            try {
                ResultSet rs = DB.search("SELECT "
                        + "`class`.`id`,"
                        + " `subject`.`name` AS `subject`, "
                        + "`grade`.`name` AS `grade`,"
                        + "CONCAT(`teacher`.`fname`, ' ', `teacher`.`lname`) AS `teacher`, "
                        + "`class`.`fee` AS `fee`, "
                        + "`room_type`.`fee` AS `room_fee`,"
                        + "`class_enrollment`.`payment_modal_id` AS `is_free`"
                        + "FROM `class`"
                        + "INNER JOIN `subject` ON `subject`.`id` = `class`.`subject_id`"
                        + "INNER JOIN `grade` ON `grade`.`id` = `class`.`grade_id`"
                        + "INNER JOIN `teacher` ON `teacher`.`nic` = `class`.`teacher_nic`"
                        + "INNER JOIN `room_type` ON `room_type`.`id` = `class`.`room_type_id`"
                        + "INNER JOIN `class_enrollment` ON `class_enrollment`.`class_id` = `class`.`id`"
                        + "WHERE `class`.`id` = '" + classID + "'AND `class_enrollment`.`student_id` = '" + studentID.getText() + "'");
                if (rs.next()) {
                    loardDue(classID);
                    classFee01.setText(rs.getString("fee"));
                    hallfee01.setText(rs.getString("room_fee"));
                    subject01.setText(rs.getString("subject"));
                    teacher01.setText(rs.getString("teacher"));
                    grade01.setText(rs.getString("grade"));
                    jCheckBox1.setSelected(rs.getString("is_free").equals("2"));

                }
            } catch (ClassNotFoundException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            } catch (SQLException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
            } catch (ParseException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Date Problem", ex);
            } catch (IOException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            }
        } else {
            studentID.setEnabled(true);
            classFee01.setText("");
            hallfee01.setText("");
            subject01.setText("");
            teacher01.setText("");
            grade01.setText("");
            dueM_01.removeAllItems();
            dueM_01.setEnabled(false);
        }
    }

    // find class last due date by student ID
    private void loardDue(String ID) throws ClassNotFoundException, SQLException, ParseException, IOException {

        dueM_01.setEnabled(true);
        //select last due date
        ResultSet lastPayment = DB.search("SELECT MAX(`class_pay`.`due_month`) AS `lastdue` FROM `class_pay` "
                + "INNER JOIN `payment` ON `payment`.`id` = class_pay.payment_id "
                + "WHERE `class_pay`.`class_id` = '" + ID + "' AND `payment`.`student_id` = '" + studentID.getText() + "' ");
        if (lastPayment.next()) {
            if (lastPayment.getString("lastdue") != null) {
                //get last due year and month
                String date = lastPayment.getString("lastdue").substring(0, 7);
                YearMonth lastDue = YearMonth.parse(date);

                // get curren year and month
                String toDay = new SimpleDateFormat("yyyy-MM").format(new Date());
                YearMonth thisMonth = YearMonth.parse(toDay);

                // if not last and curent month are not equal
                if (!lastDue.equals(thisMonth)) {
                    class_add.setEnabled(true);

                    Vector<YearMonth> monthsBetween = new Vector<>();

                    YearMonth current = lastDue;

                    while (!current.isAfter(thisMonth)) {
                        if (!current.equals(lastDue)) {
                            monthsBetween.add(current);
                        }
                        current = current.plusMonths(1);
                    }

                    DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel(monthsBetween);
                    dueM_01.setModel(comboBoxModel);

                } else {
                    dueM_01.removeAllItems();
                    dueM_01.addItem("Payment Completed");
                    class_add.setEnabled(false);
                }

            } else {

                ResultSet rs = DB.search("SELECT `class_enrollment`.`register_date` "
                        + "FROM `class_enrollment` "
                        + "WHERE `class_enrollment`.`class_id` = '" + ID + "' "
                        + "AND `class_enrollment`.`student_id` = '" + studentID.getText() + "'");
                rs.next();
                //get enroled year and month
                String date = rs.getString(1).substring(0, 7);
                YearMonth lastDue = YearMonth.parse(date);

                // get curren year and month
                String toDay = new SimpleDateFormat("yyyy-MM").format(new Date());
                YearMonth thisMonth = YearMonth.parse(toDay);

                // if not last and curent month are not equal
//                if (lastDue != thisMonth) {
                class_add.setEnabled(true);

                Vector<YearMonth> monthsBetween = new Vector<>();

                YearMonth current = lastDue;
                monthsBetween.add(current);
                while (!current.isAfter(thisMonth)) {
                    if (!current.equals(lastDue)) {
                        monthsBetween.add(current);
                    }
                    current = current.plusMonths(1);
                }

                DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel(monthsBetween);
                dueM_01.setModel(comboBoxModel);
            }
            //}
        }
    }
    // satge payment into jtable

    private void addPayment() {
        int status = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to make the payment?",
                "Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        int ODstatus = JOptionPane.YES_OPTION;
        if (checkOverDue()) {
            ODstatus = JOptionPane.showConfirmDialog(
                    this,
                    "You Have overdue payment, You need to Complete them Fist",
                    "Confirmation", JOptionPane.YES_NO_OPTION,
                    JOptionPane.INFORMATION_MESSAGE);
            dueM_01.setSelectedIndex(0);
        }

        if (status == JOptionPane.YES_OPTION && ODstatus == JOptionPane.YES_OPTION) {

            DefaultTableModel dtm = (DefaultTableModel) classTable.getModel();

            Vector v = new Vector();
            v.add(String.valueOf(classIdCombo.getSelectedItem()));
            v.add(subject01.getText());
            v.add(grade01.getText());
            v.add(teacher01.getText());
            v.add(String.valueOf(dueM_01.getSelectedItem()));

            if (CheckIsFree(String.valueOf(dueM_01.getSelectedItem()))) {
                v.add("N/L");
                v.add("N/L");
                v.add("Free Card");
            } else {
                v.add(hallfee01.getText());
                v.add(classFee01.getText());
                double total = Double.parseDouble(hallfee01.getText()) + Double.parseDouble(classFee01.getText());
                v.add(String.valueOf(total));
            }

            dtm.addRow(v);
            classTable.setModel(dtm);
            claculate();

            updateCombo(dueM_01.getSelectedItem(), String.valueOf(classIdCombo.getSelectedItem()));
        }
    }

    // calculate the grand total
    private void claculate() {
        classBalance.setText("");
        classPayment.setText("");
        int rows = classTable.getRowCount();
        double grandTotal = 0.0;
        for (int i = 0; i < rows; i++) {
            String total = String.valueOf(classTable.getValueAt(i, 7));
            if (!total.equals("Free Card")) {
                grandTotal = grandTotal + Double.parseDouble(total);
            }
        }
        classTotal.setText(String.valueOf(grandTotal));
    }

    // calculate the balance
    private void makeBalace() {
        String paymet = classPayment.getText();
        if (!paymet.isEmpty()) {
            if (Validator.AMOUNT.validate(paymet)) {
                double pay = Double.parseDouble(paymet);
                double total = Double.parseDouble(classTotal.getText().replace(",", ""));
                double balance = (pay) - (total);
                if (balance >= 0) {
                    classBalance.setText(String.valueOf(balance));
                    paymentBTN.setEnabled(true);
                } else {
                    classBalance.setText("");
                }
            } else {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Wrong Input");
            }
        }
    }
    // update due motnhs combobox when staging the payment

    private void updateCombo(Object due, String classID) {
        dueM_01.removeItem(due);
        if (dueM_01.getItemCount() == 0) {
            dueM_01.setEnabled(false);
            classIdCombo.removeItem(classID);
            classIdCombo.setSelectedIndex(0);
        } else {
            dueM_01.setEnabled(true);
        }
    }

    // check is there any over due in the combobox
    private boolean checkOverDue() {
        return dueM_01.getSelectedIndex() != 0;
    }

    // check due month is equal with this month
    private boolean CheckIsFree(String dueDate) {
        YearMonth today = YearMonth.now();
        YearMonth date = YearMonth.parse(dueDate);
        boolean isThisM = !(today.isAfter(date)); // false if this == due month
        boolean isfee = jCheckBox1.isSelected();
        return isThisM & isfee;
    }

    // clean everything
    private void clear() {
        studentID.setText("");
        cleanClass();
    }

    // make payments
    private void makePayment() {
        try {
            String currentTime = SetDate.getDate("yyyy-MM-dd hh:MM:ss");
            DB.IUD("INSERT INTO `payment` (`total`, `date`, `student_id`, `employee_id`) VALUES ('" + classTotal.getText() + "', '" + currentTime + "', '" + studentID.getText() + "', '" + admin.getUserID() + "')");

            ResultSet rs = DB.search("SELECT LAST_INSERT_ID() AS id");

            if (rs.next()) {
                int paymentID = rs.getInt("id");
                int rows = classTable.getRowCount();
                int is_free = 0; // 0 = not free
                for (int i = 0; i < rows; i++) {
                    String classID = String.valueOf(classTable.getValueAt(i, 0));
                    String due_month = (String) classTable.getValueAt(i, 4) + "-01";
                    String hall_fee = (String) classTable.getValueAt(i, 5);

                    if (hall_fee.equals("N/L")) {
                        hall_fee = "0";
                        is_free = 1;
                    }
                    DB.IUD("INSERT INTO `class_pay` (`class_id`, `due_month`, `payment_id`, `hall_fee`,`is_free`) VALUES ('" + classID + "', '" + due_month + "', '" + paymentID + "','" + hall_fee + "','" + is_free + "')");
                }
                HashMap<String, String> data = new HashMap<>();
                data.put("ST", studentID.getText());
                data.put("TO", classTotal.getText());
                data.put("CA", classPayment.getText());
                data.put("BA", classBalance.getText());
                // prin invoice
                //printInvoive(data, classTable, true);
                clear();
            }

        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
    }

    // loard and find course by student ID
    private void loardClass() {
        String sid = this.student_id.getText();
        if (sid.length() >= 8) {
            try {
                ResultSet rs = DB.search("SELECT `fname`, `lname` FROM `student` "
                        + "WHERE `student`.`id` = '" + sid + "'");

                if (rs.next()) {
                    ResultSet classData = DB.search("SELECT `course_enrollment`.`course_id` FROM `course_enrollment` WHERE `course_enrollment`.`student_id` = '" + sid + "' ");
                    Vector<String> v = new Vector<>();
                    v.add("Select Course");
                    while (classData.next()) {
                        v.add(classData.getString("Course_id"));
                    }
                    DefaultComboBoxModel boxModel = new DefaultComboBoxModel(v);

                    course_id.setModel(boxModel);
                    student_name.setText(rs.getString("fname") + " " + rs.getString("lname"));
                    course_id.setEnabled(true);
                } else {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Student Not Found");
                    cleanCourse();
                }
            } catch (ClassNotFoundException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            } catch (SQLException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
            } catch (IOException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            }
        } else {
            cleanCourse();
        }
    }

    // clean all feilds
    private void cleanCourse() {

        student_id.grabFocus();
        student_name.setText("");

        course_id.removeAllItems();
        course_id.setEnabled(false);
        subject_id.setText("");
        teacher_name.setText("");
        leval.setText("");
        courese_fee.setText("");
        due_fee.setText("");
        paying_fee.setText("");
        paying_fee.setText("");
        paying_fee.setEditable(false);
        jCheckBox2.setEnabled(false);
        jCheckBox2.setSelected(false);
        jButton5.setEnabled(false);

        DefaultTableModel dtm = (DefaultTableModel) course_table.getModel(); // clear table
        dtm.setRowCount(0);

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        course_table.setDefaultRenderer(Object.class, renderer);

        course_total.setText("");
        course_payment.setText("");
        course_balacnce.setText("");
        course_pay.setEnabled(false);
        student_id.setEditable(true);
    }

    private void selectCourse() {
        String courseId = String.valueOf(course_id.getSelectedItem());
        if (courseId != null && !courseId.equals("Select Course")) {
            student_id.setEditable(false);
            try {
                ResultSet rs = DB.search("SELECT "
                        + "`course`.`id`,"
                        + " `subject`.`name` AS `subject`, "
                        + "`grade`.`name` AS `grade`,"
                        + "CONCAT(`teacher`.`fname`, ' ', `teacher`.`lname`) AS `teacher`, "
                        + "`course`.`fee` AS `fee`, "
                        + "`room_type`.`fee` AS `room_fee`,"
                        + "`course_enrollment`.`payment_modal_id` AS `is_free`"
                        + "FROM `course`"
                        + "INNER JOIN `subject` ON `subject`.`id` = `course`.`subject_id`"
                        + "INNER JOIN `grade` ON `grade`.`id` = `course`.`grade_id`"
                        + "INNER JOIN `teacher` ON `teacher`.`nic` = `course`.`teacher_nic`"
                        + "INNER JOIN `room_type` ON `room_type`.`id` = `course`.`room_type_id`"
                        + "INNER JOIN `course_enrollment` ON `course_enrollment`.`course_id` = `course`.`id`"
                        + "WHERE `course`.`id` = '" + courseId + "'");

                if (rs.next()) {
                    courese_fee.setText(rs.getString("fee"));
                    subject_id.setText(rs.getString("subject"));
                    teacher_name.setText(rs.getString("teacher"));
                    leval.setText(rs.getString("grade"));
                    jCheckBox2.setSelected(rs.getString("is_free").equals("2"));

                    if (jCheckBox2.isSelected()) {
                        due_fee.setText("Free Card");
                        due_fee.setEnabled(false);
                        paying_fee.setEnabled(false);
                    } else {
                        due_fee.setEnabled(true);
                        paying_fee.setEnabled(true);
                        loardCourseDue(courseId, student_id.getText());
                    }
                }

            } catch (ClassNotFoundException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            } catch (SQLException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
            } catch (IOException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            }
        } else {
            subject_id.setText("");
            teacher_name.setText("");
            leval.setText("");
            courese_fee.setText("");
            due_fee.setText("");
            paying_fee.setText("");
            jCheckBox2.setSelected(false);
            jButton5.setEnabled(false);
        }
    }

    private void loardCourseDue(String courseId, String stId) throws SQLException, ClassNotFoundException, IOException {

        //select last due date
        ResultSet paidFee = DB.search("SELECT SUM(`fee`) AS `paidFee` FROM `course_pay` "
                + "INNER JOIN `payment` ON `payment`.id = `course_pay`.`payment_id` "
                + "WHERE `course_pay`.`course_id` = '" + courseId + "' AND `payment`.`student_id` ='" + stId + "'");

        double paid = 0;
        if (paidFee.next()) {
            String pFee = paidFee.getString("paidFee");
            if (pFee != null) {
                paid = Double.parseDouble(pFee);
            }
        }

        double fee = Double.parseDouble(courese_fee.getText());
        double payable = fee - paid;

        if (payable == 0) {
            due_fee.setText("Payment Completed");
            paying_fee.setEditable(false);
        } else {
            due_fee.setText(String.valueOf(payable));
            paying_fee.setEditable(true);
        }

    }

    private void validateFee() {
        String paymet = paying_fee.getText();
        if (!paymet.isEmpty()) {
            if (Validator.AMOUNT.validate(paymet)) {
                double pay = Double.parseDouble(paymet);
                double dueFee = Double.parseDouble(due_fee.getText());

                double balance = dueFee - pay;

                if (balance < 0) {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Unacceptable Amount");
                    paying_fee.setText("0");
                    jButton5.setEnabled(false);
                } else {
                    if (pay != 0) {
                        jButton5.setEnabled(true);
                    } else {
                        jButton5.setEnabled(false);
                    }
                }
            } else {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Wrong Input");
            }
        } else {
            jButton5.setEnabled(false);
        }
    }

    private void addCourse() {
        int status = JOptionPane.showConfirmDialog(
                this,
                "Are you sure you want to make the payment?",
                "Confirmation", JOptionPane.YES_NO_OPTION,
                JOptionPane.INFORMATION_MESSAGE);

        if (status == JOptionPane.YES_OPTION) {

            DefaultTableModel dtm = (DefaultTableModel) course_table.getModel();

            Vector v = new Vector();
            v.add(String.valueOf(course_id.getSelectedItem()));
            v.add(subject_id.getText());
            v.add(teacher_name.getText());
            v.add(courese_fee.getText());
            v.add(due_fee.getText());
            v.add(paying_fee.getText());

            dtm.addRow(v);
            classTable.setModel(dtm);

            course_id.removeItem(course_id.getSelectedItem());
            course_id.setSelectedIndex(0);
            paying_fee.setText("");
            subject_id.setText("");
            teacher_name.setText("");
            leval.setText("");
            courese_fee.setText("");
            due_fee.setText("");
            paying_fee.setText("");
            jCheckBox2.setSelected(false);
            jButton5.setEnabled(false);

            getTotal();
        }
    }

    private void getTotal() {
        course_payment.setText("");
        course_balacnce.setText("");
        int rows = course_table.getRowCount();
        double grandTotal = 0.0;
        for (int i = 0; i < rows; i++) {
            String total = String.valueOf(course_table.getValueAt(i, 5)).replaceAll(",", "");
            grandTotal = grandTotal + Double.parseDouble(total);
        }
        course_total.setText(String.valueOf(grandTotal));
    }

    private void getBalance() {
        String paymet = course_payment.getText().replaceAll(",", "");
        if (!paymet.isEmpty()) {
            if (Validator.AMOUNT.validate(paymet)) {
                double pay = Double.parseDouble(paymet);
                double total = Double.parseDouble(course_total.getText().replace(",", ""));
                double balance = (pay) - (total);
                if (balance >= 0) {
                    course_balacnce.setText(String.valueOf(balance));
                    course_pay.setEnabled(true);
                } else {
                    course_balacnce.setText("");
                    course_pay.setEnabled(false);
                }
            } else {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Wrong Input");
            }
        }

    }

    private void makeCoursePay() {

        try {
            String EMP = admin.getUserID();
            String currentTime = SetDate.getDate("yyyy-MM-dd hh:MM:ss");
            DB.IUD("INSERT INTO `payment` (`total`, `date`, `student_id`, `employee_id`) VALUES ('" + course_total.getText().replaceAll(",", "") + "', '" + currentTime + "', '" + student_id.getText() + "', '" + EMP + "')");

            ResultSet rs = DB.search("SELECT LAST_INSERT_ID() AS id");

            if (rs.next()) {
                int paymentID = rs.getInt("id");
                int rows = course_table.getRowCount();
                int is_free = 0; // 0 = not free
                for (int i = 0; i < rows; i++) {
                    String courdeID = String.valueOf(course_table.getValueAt(i, 0));
                    String fee = String.valueOf(course_table.getValueAt(i, 5)).replaceAll(",", "");

                    DB.IUD("INSERT INTO `course_pay` (`course_id`, `fee`, `payment_id`, `is_free`) VALUES ('" + courdeID + "', '" + fee + "', '" + paymentID + "', 0);");
                }

                HashMap<String, String> data = new HashMap<>();
                data.put("ST", student_id.getText());
                data.put("TO", course_total.getText());
                data.put("CA", course_payment.getText());
                data.put("BA", course_balacnce.getText());
                // prin invoice
                //printInvoive(data, course_table, false);
                clearAll();
            }

        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }

    }

    // clear all 
    private void clearAll() {
        student_id.setText("");
        cleanCourse();
    }

    private void cheackCondition() {
        String studentID = jTextField16.getText();
        String classID = jTextField17.getText();
        String courseID = jTextField18.getText();
        String teacherID = jTextField20.getText();
        int date = jComboBox3.getSelectedIndex();

        boolean isChecked = false;

        StringBuilder query_1 = new StringBuilder(""
                + "SELECT payment.student_id,"
                + "class_pay.class_id AS related_id,"
                + "class.teacher_nic,"
                + "payment.date AS date_column, "
                + "class.fee AS fee "
                + "FROM payment "
                + "JOIN class_pay ON class_pay.payment_id = payment.id "
                + "JOIN class ON class.id = class_pay.class_id ");

        StringBuilder query_2 = new StringBuilder(""
                + "SELECT payment.student_id, "
                + "`course_pay`.`course_id` AS `related_id`, "
                + "`course`.`teacher_nic`, "
                + "payment.date AS date_column, "
                + "`course_pay`.`fee` "
                + "FROM payment "
                + "JOIN course_pay ON course_pay.payment_id = payment.id "
                + "JOIN course ON course.id = course_pay.course_id ");

        if (!studentID.isEmpty()) {
            if (!isChecked) {
                query_1.append("WHERE ");
                query_2.append("WHERE ");
            }
            query_1.append("`payment`.`student_id` = '" + studentID + "' AND ");
            query_2.append("`payment`.`student_id` = '" + studentID + "' AND ");
            isChecked = true;
        }

        if (!classID.isEmpty() || !courseID.isEmpty()) {
            if (!isChecked) {
                query_1.append("WHERE ");
                query_2.append("WHERE ");
            }
            query_1.append("`class_pay`.`class_id` = '" + classID + "' AND ");
            query_2.append("`course_pay`.`course_id` = '" + courseID + "' AND ");
            isChecked = true;
        }

        if (!teacherID.isEmpty()) {
            if (!isChecked) {
                query_1.append("WHERE ");
                query_2.append("WHERE ");
            }
            query_1.append("`class`.`teacher_nic` = '" + teacherID + "' AND ");
            query_2.append("`course`.`teacher_nic` = '" + teacherID + "' AND ");
            isChecked = true;
        }

        // Set of Date 
        Year thisYear = Year.now();
        String thisMonth = YearMonth.now().format(DateTimeFormatter.ofPattern("MM"));
        String lastMonth = YearMonth.now().minusMonths(1).format(DateTimeFormatter.ofPattern("MM"));
        String quarter = YearMonth.now().minusMonths(2).format(DateTimeFormatter.ofPattern("MM"));
        String semiannual = YearMonth.now().minusMonths(5).format(DateTimeFormatter.ofPattern("MM"));
        Year lastYear = thisYear.minusYears(1);

        switch (date) {
            case 0:
                if (!isChecked) {
                    query_1.append("WHERE ");
                    query_2.append("WHERE ");
                }
                query_1.append("YEAR(date) = '" + thisYear + "' AND MONTH(DATE) = '" + thisMonth + "' ");
                query_2.append("YEAR(date) = '" + thisYear + "' AND MONTH(DATE) = '" + thisMonth + "' ");
                break;

            case 1:
                if (!isChecked) {
                    query_1.append("WHERE ");
                    query_2.append("WHERE ");
                }
                query_1.append("YEAR(date) = '" + thisYear + "' AND MONTH(DATE) = '" + lastMonth + "' ");
                query_2.append("YEAR(date) = '" + thisYear + "' AND MONTH(DATE) = '" + lastMonth + "' ");
                break;

            case 2:
                if (!isChecked) {
                    query_1.append("WHERE ");
                    query_2.append("WHERE ");
                }
                query_1.append("YEAR(date) = '" + thisYear + "' AND MONTH(DATE) >= '" + quarter + "' ");
                query_2.append("YEAR(date) = '" + thisYear + "' AND MONTH(DATE) >= '" + quarter + "' ");
                break;

            case 3:
                if (!isChecked) {
                    query_1.append("WHERE ");
                    query_2.append("WHERE ");
                }
                query_1.append("YEAR(date) = '" + thisYear + "' AND MONTH(DATE) >= '" + semiannual + "' ");
                query_2.append("YEAR(date) = '" + thisYear + "' AND MONTH(DATE) >= '" + semiannual + "' ");
                break;

            case 4:
                if (!isChecked) {
                    query_1.append("WHERE ");
                    query_2.append("WHERE ");
                }
                query_1.append("YEAR(date) = '" + thisYear + "' ");
                query_2.append("YEAR(date) = '" + thisYear + "' ");
                break;

            case 5:
                if (!isChecked) {
                    query_1.append("WHERE ");
                    query_2.append("WHERE ");
                }
                query_1.append("YEAR(date) = '" + lastYear + "' ");
                query_2.append("YEAR(date) = '" + lastYear + "' ");
                break;
        }

        StringBuilder query = new StringBuilder(query_1);
        query.append("UNION ALL ");
        query.append(query_2);
        query.append(" ORDER BY `date_column` DESC");
        makeReport(query.toString());
    }

    private void makeReport(String query) {
        try {
            ResultSet resultSet = DB.search(query);

            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
            model.setRowCount(0);
            
            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            jTable3.setDefaultRenderer(Object.class, renderer);

            int row = 1;
            while (resultSet.next()) {
                Vector v = new Vector();
                v.add(String.valueOf(row));
                v.add(resultSet.getString("student_id"));
                v.add(resultSet.getString("related_id"));
                v.add(resultSet.getString("teacher_nic"));
                v.add(resultSet.getString("date_column"));
                v.add(resultSet.getString("fee"));
                row++;
                model.addRow(v);
            }
            jTable3.setModel(model);

        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
    }

    private void cleanReport() {
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField20.setText("");
        jComboBox3.setSelectedIndex(0);

        cheackCondition();
    }

}
