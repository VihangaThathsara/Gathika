package GUI.panal;

import java.awt.Color;
import modal.RoundedPanel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Level;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modal.DB;
import modal.HomeInfo;
import modal.LogCenter;
import modal.SetDate;
import modal.beans.Admin;
import modal.beans.Home;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import raven.toast.Notifications;

public class SalaryCalculation extends javax.swing.JPanel {

    private Admin admin;

    public SalaryCalculation(Admin bean) {
        initComponents();
        loadSallary("", "");
        date();
        this.admin = bean;
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton7.setEnabled(false);
        jRadioButton1.setEnabled(false);
        loadTeacherSallary();
    }

    private String attendedDates;
    private String teacherSalaryDate;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new RoundedPanel(20, new Color(234,238,244));
        jPanel4 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jFormattedTextField6 = new javax.swing.JFormattedTextField();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new RoundedPanel(20, new Color(250,249,246));
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        table1 = new javaswingdev.swing.table.Table();
        jPanel2 = new RoundedPanel(20, new Color(234,238,244));
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new RoundedPanel(20, new Color(250,249,246));
        jButton9 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javaswingdev.swing.table.Table();
        jPanel6 = new RoundedPanel(20, new Color(234,238,244));
        jLabel10 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setBackground(new java.awt.Color(200, 200, 198));
        setPreferredSize(new java.awt.Dimension(967, 668));

        jTabbedPane1.setBackground(new java.awt.Color(200, 200, 198));
        jTabbedPane1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(967, 668));

        jPanel1.setBackground(new java.awt.Color(200, 200, 198));
        jPanel1.setPreferredSize(new java.awt.Dimension(967, 668));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Employee Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setToolTipText("Employee ID");

        jButton3.setBackground(new java.awt.Color(0, 102, 204));
        jButton3.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton3.setText("Pay");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jRadioButton2.setText("Unpaid");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jRadioButton1.setText("Paid");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jFormattedTextField6.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField6.setText("0");
        jFormattedTextField6.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField6.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jFormattedTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField6KeyReleased(evt);
            }
        });

        jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField7.setText("0");
        jFormattedTextField7.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField7.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("0");
        jLabel19.setOpaque(true);

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setOpaque(true);

        jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField5.setToolTipText("Total");
        jFormattedTextField5.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jFormattedTextField5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Salary Per Day");

        jLabel20.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setOpaque(true);

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel21.setText("Employee ID");

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Bonus");

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Sub Total");

        jLabel24.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("From");

        jLabel25.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("To");

        jButton11.setBackground(new java.awt.Color(255, 0, 0));
        jButton11.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton11.setText("Clear");
        jButton11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(102, 255, 153));
        jButton6.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton6.setText("Search");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 0, 0));
        jButton7.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton7.setText("Calculate");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                        .addGap(95, 95, 95)
                        .addComponent(jRadioButton2))
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(126, 126, 126)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jFormattedTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(98, 98, 98)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jFormattedTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFormattedTextField6))
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                            .addComponent(jTextField3))))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(4, 4, 4)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(4, 4, 4)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );

        jPanel3.setBackground(new java.awt.Color(234, 238, 244));

        jLabel17.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Search");

        jTextField5.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jDateChooser4.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser4PropertyChange(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton5.setText("Clear All");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton4.setText("Print");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "Paid Date", "Salary Per Day", "Worked Days", "Bonus", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(table1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 452, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDateChooser4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Employee", jPanel1);

        jPanel2.setBackground(new java.awt.Color(200, 200, 198));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teacher Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Teacher NIC :");

        jTextField1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/icons8-search-client-24.png"))); // NOI18N
        jLabel9.setToolTipText("Search");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText("Name :");

        jTextField2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Last Payement Date :");

        jDateChooser1.setDateFormatString("y-M-d");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("Earning Fee :");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.setText("0.00");
        jFormattedTextField1.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField2.setText("0.00");
        jFormattedTextField2.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        jFormattedTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField2KeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setText("Institute Commition :");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText("Total :");

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField3.setText("0.00");
        jFormattedTextField3.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton8.setText("Clear All");
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton2.setText("Pay");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jFormattedTextField1)
                            .addComponent(jFormattedTextField2)
                            .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(234, 238, 244));

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton9.setText("Print");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "NIC", "Payment Date", "Earning Fee", "Institute Commission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Teachers", jPanel2);

        jPanel6.setBackground(new java.awt.Color(200, 200, 198));

        jLabel10.setBackground(new java.awt.Color(250, 249, 246));
        jLabel10.setFont(new java.awt.Font("Poppins SemiBold", 0, 20)); // NOI18N
        jLabel10.setText("Salary Calculation");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        employeePayment();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jFormattedTextField6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField6KeyReleased
        giveBonus();
    }//GEN-LAST:event_jFormattedTextField6KeyReleased

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        teachersalaryData();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        refresh();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jFormattedTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField2KeyReleased
        addCommission();
    }//GEN-LAST:event_jFormattedTextField2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String teacherNic = jTextField1.getText();
        calculateTeacherSalary(teacherNic);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        teacherPay();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jDateChooser4PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser4PropertyChange
        searchBydate();
    }//GEN-LAST:event_jDateChooser4PropertyChange

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        searchSallary();
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        reset();
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        searchEmployee();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        total();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField5.setText("");
        jDateChooser4.setDate(null);
        table1.clearSelection();
        loadSallary("", "");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            printEmployeeSalaryReport();
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "jButton4", e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
            printTeacherSalaryReport();
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "jButton9", e);
        }
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JFormattedTextField jFormattedTextField6;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javaswingdev.swing.table.Table jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javaswingdev.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables

    private void loadSallary(String eid, String formattedDate) {

        try {

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            table1
                    .setDefaultRenderer(Object.class,
                            renderer);

            String query = "SELECT * FROM `emp_sallary`";

            if (!eid.isEmpty() && formattedDate.isEmpty()) {
                query += " WHERE employee_id LIKE '%" + eid + "%'";

            } else if (eid.isEmpty() && !formattedDate.isEmpty()) {
                query += " WHERE payment_day LIKE '%" + formattedDate + "%'";
            }

            ResultSet resultSet = DB.search(query);

            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            model.setRowCount(0);

            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("employee_id"));
                vector.add(resultSet.getString("payment_day"));
                vector.add(resultSet.getString("sallay_per_day"));
                vector.add(resultSet.getString("working_day"));
                vector.add(resultSet.getString("bonus"));
                vector.add(resultSet.getString("sub_total"));

                model.addRow(vector);
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadSallary", e);
        }

    }

    private void date() {
        String Date = SetDate.getDate("yyyy-MM-dd");
        jLabel18.setText(Date);
        this.teacherSalaryDate = Date;
    }

    private void loadLastPaidDate(String emp_id) {

        // Convert the date from jLabel18 to java.sql.Date
        String toDateS = jLabel18.getText();
        java.sql.Date today = java.sql.Date.valueOf(toDateS); // Ensure jLabel18 is in "YYYY-MM-DD" format

        try {

            ResultSet resultSet = DB.search("SELECT * "
                    + "FROM `emp_sallary`"
                    + "RIGHT JOIN `employee` ON `emp_sallary`.`employee_id` = `employee`.`id`"
                    + "WHERE `employee`.`id` = '" + emp_id + "'"
                    + "ORDER BY `payment_day` DESC LIMIT 1");

            if (resultSet.next()) {
                // Retrieve the most recent payment date
                java.sql.Date lastPaidDate = resultSet.getDate("payment_day");
                java.sql.Date joinedDate = resultSet.getDate("employee.join_date");
                String jD = joinedDate.toString();
                // String lD = lastPaidDate.toString();

                if (lastPaidDate == null) {

                    jLabel20.setText(jD);
                    jRadioButton2.setSelected(true);
                    jRadioButton2.setEnabled(true);
                    jRadioButton1.setEnabled(false);

                } else if (lastPaidDate.equals(today)) {

                    jRadioButton1.setSelected(true);
                    jRadioButton1.setEnabled(true);
                    jRadioButton2.setSelected(false);
                    jRadioButton2.setEnabled(false);
                    Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER,
                    "This Months' Salary Has Paid For This Employee");

                } else {

                    // Add one day to the last paid date
                    LocalDate localDate = lastPaidDate.toLocalDate().plusDays(1);
                    java.sql.Date fromDate = Date.valueOf(localDate);
                    String fD = fromDate.toString();

                    jLabel20.setText(fD);
                    jRadioButton2.setSelected(true);
                    jRadioButton2.setEnabled(true);
                    jRadioButton1.setSelected(false);
                    jRadioButton1.setEnabled(false);
                }

            } else {
                // Clear the date if no records found
                jLabel20.setText("");
                jRadioButton2.setSelected(true);
                jRadioButton2.setEnabled(true);
                jRadioButton1.setEnabled(false);
                jRadioButton1.setSelected(false);
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadLastPaidDate", e);
        }

    }

    private double total = 0;
    private double bonus = 0;

    private void calculate() {

        this.total = Double.parseDouble(jFormattedTextField5.getText());

        // Give Bonus
        if (jFormattedTextField6.getText().isEmpty()) {
            bonus = 0;
        } else {
            bonus = Double.parseDouble(jFormattedTextField6.getText());
        }

        this.total += bonus;

        jFormattedTextField7.setText(String.valueOf(this.total));

    }

    private void total() {

        try {
            String employee_id = jTextField3.getText();
            String fDate = jLabel20.getText(); // Assuming this is in "YYYY-MM-DD" format

            if (employee_id.isEmpty() || employee_id.isBlank()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter An Employee ID");

            } else {
                // Convert fDate to java.sql.Date
                java.sql.Date fromDate = java.sql.Date.valueOf(fDate);

                String toDate = jLabel18.getText(); // Assuming this is in "YYYY-MM-DD" format

                double salaryPerDay = Double.parseDouble(jLabel19.getText()); // Convert salary per day to double

                // SQL query to count distinct dates
                ResultSet rs = DB.search("SELECT `employee_id`, COUNT(DISTINCT `date`) AS days_attended FROM `emp_attendance` WHERE `employee_id` = '" + employee_id + "'"
                        + " AND `date` BETWEEN '" + fromDate + "' AND '" + toDate + "' GROUP BY `employee_id`");

                if (rs.next()) {
                    this.attendedDates = rs.getString("days_attended");
                    int daysAttended = Integer.parseInt(attendedDates); // Convert to integer

                    // Calculate total salary
                    double totalSalary = salaryPerDay * daysAttended;

                    // Update total in the relevant field
                    jFormattedTextField5.setText(String.valueOf(totalSalary));
                    jFormattedTextField7.setText(String.valueOf(totalSalary));
                    jButton3.setEnabled(true);
                } else {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "This employee hasn't attended work during the above period");
                    reset();
                }
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "total", e);
        }
    }

    private void reset() {
        jTextField3.setText("");
        jLabel20.setText("");
        jFormattedTextField5.setText("0");
        jFormattedTextField6.setText("0");
        jLabel19.setText("0");
        jFormattedTextField7.setText("0");
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(true);
        jRadioButton2.setSelected(true);
        jTextField3.grabFocus();
        jButton3.setEnabled(false);
        jButton7.setEnabled(false);
        loadSallary("", "");
    }

    private void searchSallary() {
        String eid = jTextField5.getText();
        loadSallary(eid, "");
    }

    private void loadTeacherSallary() {

        try {

            ResultSet rs = DB.search("SELECT * FROM `teacher_paymet` INNER JOIN `teacher` ON `teacher_paymet`.`teacher_nic` = `teacher`.`nic`");

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1.setDefaultRenderer(Object.class, renderer);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("teacher.fname") + " " + rs.getString("teacher.lname"));
                vector.add(rs.getString("teacher.nic"));
                vector.add(rs.getString("date"));
                vector.add(rs.getString("earn"));
                vector.add(rs.getString("commission"));

                model.addRow(vector);
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadTeacherSallary", e);
        }

    }

    private void loadTeacherSalaryData(String teacherNic) {

        try {

            ResultSet resultSet = DB.search(
                    "SELECT * FROM teacher "
                    + "LEFT JOIN teacher_paymet ON teacher.nic = teacher_paymet.teacher_nic "
                    + "WHERE teacher.nic = '" + teacherNic + "' "
                    + "ORDER BY teacher_paymet.date DESC LIMIT 1");

            if (resultSet.next()) {

                //get Teacher Data
                String teacherName = resultSet.getString("teacher.fname") + " " + resultSet.getString("teacher.lname");
                java.sql.Date registeredDate = resultSet.getDate("teacher.join_date");
                java.sql.Date lastPaidDate = resultSet.getDate("teacher_paymet.date");

                jTextField2.setText(teacherName);
                java.sql.Date toady = java.sql.Date.valueOf(this.teacherSalaryDate);  // Convert LocalDate to java.sql.Date

                if (lastPaidDate == null) {
                    jLabel4.setText("Registerd Date :");
                    jDateChooser1.setDate(registeredDate);
                    jDateChooser1.setEnabled(false);

                } else if (lastPaidDate.equals(toady)) {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "The salary has already been paid for this teacher");
                    refresh();

                } else {
                    jLabel4.setText("Last Payement Date :");
                    jDateChooser1.setDate(lastPaidDate);
                    jDateChooser1.setEnabled(false);

                }
                //get Teacher Data

                jButton1.setEnabled(true);

            } else {
                //if there is no valid teacher nic
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please enter a Valid Teacher NIC");
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadTeacherSalaryData", e);
        }

    }

    private void calculateTeacherSalary(String teacherNic) {

        java.util.Date paidDay = jDateChooser1.getDate(); // Convert utilDate to sqlDate for the SQL query

        try {
            //Calculate Payment
            ResultSet rs = DB.search(
                    "SELECT 'total' AS type, teacher_nic, SUM(total_fee) AS monthly_income FROM ( "
                    + "SELECT 'class' AS type, class.teacher_nic, SUM(class.fee) AS total_fee "
                    + "FROM payment "
                    + "JOIN class_pay ON class_pay.payment_id = payment.id "
                    + "JOIN class ON class.id = class_pay.class_id "
                    + "WHERE class.teacher_nic = '" + teacherNic + "' "
                    + "AND payment.date BETWEEN '" + paidDay + "' AND '" + this.teacherSalaryDate + "' "
                    + "UNION ALL "
                    + "SELECT 'course' AS type, course.teacher_nic, SUM(course_pay.fee) AS total_fee "
                    + "FROM payment "
                    + "JOIN course_pay ON course_pay.payment_id = payment.id "
                    + "JOIN course ON course.id = course_pay.course_id "
                    + "WHERE course.teacher_nic = '" + teacherNic + "' "
                    + "AND payment.date BETWEEN '" + paidDay + "' AND '" + this.teacherSalaryDate + "' "
                    + ") AS fee_summary "
                    + "GROUP BY teacher_nic");

            if (rs.next()) {
                String count = rs.getString("monthly_income");

                if (count == null || count.isEmpty()) {
                    Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER,
                    "No payment records found for this teacher's Classes or Courses");
                    refresh();
                } else {
                    jFormattedTextField1.setText(count);
                    jFormattedTextField3.setText(count);
                    jButton2.setEnabled(true);
                }
            }
            //Calculate Payment

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "calculateTeacherSalary", e);
        }

    }

    //Cut Institute Commission From Teachers' Monthly Income
    private double teacherSalarytotal = 0;
    private double instituteCommission = 0;

    private void addCommission() {

        // Give Bonus
        if (jFormattedTextField2.getText().isEmpty()) {
            instituteCommission = 0;
        } else {
            instituteCommission = Double.parseDouble(jFormattedTextField2.getText());
        }

        this.teacherSalarytotal = Double.parseDouble(jFormattedTextField1.getText());
        this.teacherSalarytotal -= instituteCommission;

        jFormattedTextField3.setText(String.valueOf(this.teacherSalarytotal));
    }

    private void refresh() {

        jTextField1.setText("");
        jTextField2.setText("");
        jDateChooser1.setDate(null);
        jFormattedTextField1.setText("0.00");
        jFormattedTextField2.setText("0.00");
        jFormattedTextField3.setText("0.00");
        jTable1.clearSelection();
        jTextField1.grabFocus();
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        loadTeacherSallary();
    }

    private void printEmployeeSalaryReport() throws JRException {

        try {
            // Use JRTableModelDataSource from jTable1's model
            JRTableModelDataSource dataSource = new JRTableModelDataSource(table1.getModel());

            // Get system data
            Home home = new HomeInfo().getHome();

            // Parameters for the report
            HashMap<String, Object> params = new HashMap<>();
            params.put("address", home.getLine01() + "," + home.getLine02() + "," + home.getCity());
            params.put("landLine", home.getLandLine());
            params.put("email", home.getEmail());
            params.put("mobile", home.getMobile());
            params.put("title", "Employees Salary Report");

            // Use saveReport method to save the report
            modal.Reporting reporting = new modal.Reporting();
            boolean isSaved = reporting.saveReport("EMP_Salary_Report", params, dataSource, this.admin);

            if (isSaved) {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Employee Salary Report saved successfully");
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                    "Employee Salary Report saving was canceled");
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "printEmployeeSalaryReport", e);
        }

    }

    private void printTeacherSalaryReport() throws JRException {

        try {
            // Use JRTableModelDataSource from jTable1's model
            JRTableModelDataSource dataSource = new JRTableModelDataSource(jTable1.getModel());

            // Get system data
            Home home = new HomeInfo().getHome();

            // Parameters for the report
            HashMap<String, Object> params = new HashMap<>();
            params.put("address", home.getLine01() + "," + home.getLine02() + "," + home.getCity());
            params.put("landLine", home.getLandLine());
            params.put("email", home.getEmail());
            params.put("mobile", home.getMobile());
            params.put("title", "Teachers Salary Report");

            // Use saveReport method to save the report
            modal.Reporting reporting = new modal.Reporting();
            boolean isSaved = reporting.saveReport("Teacher_Salary_Report", params, dataSource, this.admin);

            if (isSaved) {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Teacher Salary Report saved successfully");
            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                    "Teacher Salary Report saving was canceled");
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "printTeacherSalaryReport", e);
        }

    }

    private void printPayment(HashMap data) throws JRException {

        try {
            // Retrieve system data
            Home home = new HomeInfo().getHome();

            String topic0 = (String) data.get("t0");
            String topic1 = (String) data.get("t1");
            String topic2 = (String) data.get("t2");
            String topic3 = (String) data.get("t3");

            String p0 = (String) data.get("p0");
            String p1 = (String) data.get("p1");
            Double p2 = (Double) data.get("p2");
            Double p3 = (Double) data.get("p3");

            // Parameters for the report
            HashMap<String, Object> parm = new HashMap<>();

            parm.put("institute", home.getHomeName());
            parm.put("title", "Payment Invoice");
            parm.put("address", home.getLine01() + ", " + home.getLine02() + ", " + home.getCity());
            parm.put("mobile", home.getMobile());
            parm.put("land", home.getLandLine());
            parm.put("email", home.getEmail());

            parm.put("topic0", topic0); // Pass the actual EMP name or Teacher name
            parm.put("topic1", topic1); // Pass the actual worked Days or earn
            parm.put("topic2", topic2); // Pass the actual bonus or commission
            parm.put("topic3", topic3); // Pass the actual total

            parm.put("p0", p0); // Pass the actual EMP name or Teacher name data
            parm.put("p1", p1); // Pass the actual worked Days or earn data
            parm.put("p2", p2); // Pass the actual bonus or commission data
            parm.put("p3", p3); // Pass the actual total data

            // Save the report (assuming saveReport is part of your modal.Reporting logic)
            boolean print = new modal.Reporting().printReport("Payment_Report", parm);

            // Display the report
            if (print) {
                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Invoice Printing Success");

            } else {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                    "Invoice Printing Failed");
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "printPayment", e);
        }

    }

    private void employeePayment() {
        try {
            Double sallaryPerDay = null;
            Double bonus = null;
            Double total = null;
            java.sql.Date today;

            String employeId = jTextField3.getText();
            String eName;

            if (sallaryPerDay == null) {
                String salary = jLabel19.getText();
                sallaryPerDay = Double.parseDouble(salary);
            }

            if (bonus == null) {
                String bonusString = jFormattedTextField6.getText();
                bonus = Double.parseDouble(bonusString);
            }

            if (total == null) {
                String totalString = jFormattedTextField7.getText();
                total = Double.parseDouble(totalString);
            }

            today = java.sql.Date.valueOf(jLabel18.getText());
            String workedDays = this.attendedDates;

            if (employeId == null || employeId.trim().isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                    "Employee ID is required");
            } else if (total < 0) {
                Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                    "Total must be a non-negative number");
            } else {

                ResultSet rs = DB.search("SELECT (`fname`) FROM `employee` WHERE `id` = '" + employeId + "'");

                if (rs.next()) {
                    eName = rs.getString("fname"); // Concatenate first and last name

                    DB.IUD("INSERT INTO `emp_sallary` (`payment_day`,`sallay_per_day`,`working_day`,`bonus`,`sub_total`,`employee_id`)"
                            + "VALUES ('" + today + "','" + sallaryPerDay + "','" + workedDays + "','" + bonus + "','" + total + "','" + employeId + "')");

                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Successfully Paid");
                    loadSallary("", "");

                    // Parameters for the report
                    HashMap<String, Object> data = new HashMap<>();

                    data.put("t0", "Employee Name :");
                    data.put("t1", "Worked Days :");
                    data.put("t2", "Bonus :");
                    data.put("t3", "Total :");

                    data.put("p0", eName);
                    data.put("p1", workedDays);
                    data.put("p2", bonus);
                    data.put("p3", total);

                    printPayment(data);
                    reset();
                }
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "employeePayment", e);
        }
    }

    private void giveBonus() {

        String totalText = jFormattedTextField5.getText();

        if (totalText == null || totalText.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Calculate Total Salary For Employee");
            jFormattedTextField6.setText("0.00");

        } else {

            String num = jFormattedTextField6.getText();

            if (num.matches(".*[a-zA-Z!@#$%^&*()_+=\\[\\]{}|;:',<>,./?`~].*") || num.isEmpty() || num.isBlank()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "You can't add Letters or Special Characters here");
                jFormattedTextField6.setText("0.00");

            } else {
                calculate();
            }
        }
    }

    private void searchEmployee() {
        try {

            String emp_id = jTextField3.getText();

            if (emp_id.isEmpty() || emp_id.isBlank()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter An Employee ID");

            } else {
                ResultSet resultSet = DB.search("SELECT * FROM `employee` INNER JOIN `emp_type` ON `employee`.`emp_type_id` = `emp_type`.`id` WHERE "
                        + "`employee`.`id` = '" + emp_id + "'");

                if (resultSet.next()) {
                    String employeeType = resultSet.getString("emp_type_id");

                    if (employeeType.equals("1")) {
                        Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "This Id Owns For Master Admin, Enter Another One");
                        reset();

                    } else {
                        jLabel19.setText(resultSet.getString("emp_type.salary"));
                        jButton7.setEnabled(true);
                        jButton7.grabFocus();
                        loadLastPaidDate(emp_id);
                    }
                } else {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter Valid Employee ID");
                    reset();
                }
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "searchEmployee", e);
        }
    }

    private void searchBydate() {
        java.util.Date selectedDate = jDateChooser4.getDate();

        if (selectedDate != null) {
            String formattedDate = new SimpleDateFormat("yyyy-MM-dd").format(selectedDate);
            loadSallary("", formattedDate);
        }
    }

    private void teachersalaryData() {
        String teacherNic = jTextField1.getText();

        if (teacherNic.isEmpty()) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Please Enter a Teacher NIC to Calculate Payment");
        } else {
            loadTeacherSalaryData(teacherNic);
        }
    }

    private void teacherPay() {
        String Earningfee = jFormattedTextField1.getText();

        try {

            Double comission = null;
            Double earn = null;
            String employeeUserName = admin.getUserName();
            String tNic = jTextField1.getText();
            String tName = null;

            ResultSet rs = DB.search("SELECT `fname` AS tname FROM teacher WHERE nic = '" + tNic + "'");
            if (rs.next()) {
                tName = rs.getString("tname");
            }
            ResultSet resultSet = DB.search("SELECT * FROM emp_access WHERE user_name = '" + employeeUserName + "'");

            if (resultSet.next()) {

                String empID = resultSet.getString("employee_id");
                String today = this.teacherSalaryDate;

                if (comission == null) {
                    String commissionS = jFormattedTextField2.getText();
                    comission = Double.parseDouble(commissionS);
                }

                if (earn == null) {
                    String earnS = jFormattedTextField3.getText();
                    earn = Double.parseDouble(earnS);
                }

                DB.IUD("INSERT INTO `teacher_paymet` (`teacher_nic`,`employee_id`,`date`,`commission`,`earn`)"
                        + "VALUES ('" + tNic + "','" + empID + "','" + today + "','" + comission + "','" + earn + "')");

                Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Payment Succeed");

                // Parameters for the report
                HashMap<String, Object> data = new HashMap<>();

                data.put("t0", "Teacher Name :");
                data.put("t1", "Monthly Earn :");
                data.put("t2", "Comission :");
                data.put("t3", "Total :");

                data.put("p0", tName);
                data.put("p1", Earningfee);
                data.put("p2", comission);
                data.put("p3", earn);

                printPayment(data);
                refresh();
            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "teacherPay", e);
        }
    }
}
