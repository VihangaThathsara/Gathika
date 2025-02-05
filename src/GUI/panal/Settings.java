package GUI.panal;

import java.awt.Color;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import modal.DB;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modal.LogCenter;
import modal.Validator;
import modal.WordFormat;
import modal.HomeInfo;
import modal.RoundedPanel;

/**
 *
 * @author isuru priyamntha
 */
public class Settings extends javax.swing.JPanel {

    // store hall fees <k:hallType,v:fee> 
    private final HashMap<String, String> hallMap = new HashMap<>();

    // store emp salary <k:empType,v:salary> 
    private final HashMap<String, String> empMap = new HashMap<>();

    // store Institute Service Charges <k:sevice,v:fee>
    private final HashMap<String, String> serviceMap = new HashMap<>();

    // store user selected new logo's path
    private String logopath;

    public Settings() {
        initComponents();
        loardHallType();
        loardEMPypes();
        loardserviceCharge();
        loardSubjects();
        loardGrades();
        loardCity();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField13 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new RoundedPanel(20, new Color(234,238,244));
        empType = new javax.swing.JComboBox<>();
        empSalary = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        hallTypes = new javax.swing.JComboBox<>();
        hallFee = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        sCharge = new javax.swing.JFormattedTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        hallBtn = new javax.swing.JButton();
        salaryBtn = new javax.swing.JButton();
        serviceBtn = new javax.swing.JButton();
        clean = new javax.swing.JButton();
        jPanel1 = new RoundedPanel(20, new Color(234,238,244));
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gradeCombo = new javax.swing.JComboBox<>();
        subjectName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addGrade = new javax.swing.JButton();
        jPanel4 = new RoundedPanel(20, new Color(250,249,246));
        jScrollPane3 = new javax.swing.JScrollPane();
        subjectTable = new javaswingdev.swing.table.Table();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new RoundedPanel(20, new Color(250,249,246));
        jScrollPane4 = new javax.swing.JScrollPane();
        gradeTable = new javaswingdev.swing.table.Table();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new RoundedPanel(20, new Color(234,238,244));
        jPanel7 = new RoundedPanel(20, new Color(250,249,246));
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        homename = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        line01 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        landLine = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        line02 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        city = new javax.swing.JComboBox<>();
        jPanel9 = new RoundedPanel(20, new Color(250,249,246));
        jPanel10 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        database1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        port1 = new javax.swing.JTextField();
        host1 = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel11 = new RoundedPanel(20, new Color(234,238,244));
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(200, 200, 198));

        jTabbedPane1.setBackground(new java.awt.Color(200, 200, 198));
        jTabbedPane1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(200, 200, 198));

        empType.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        empType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EMP Type" }));
        empType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                empTypeItemStateChanged(evt);
            }
        });

        empSalary.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        empSalary.setFont(new java.awt.Font("Advert", 0, 14)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel4.setText("Hall Fee ");

        hallTypes.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        hallTypes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hall Fee" }));
        hallTypes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                hallTypesItemStateChanged(evt);
            }
        });

        hallFee.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        hallFee.setFont(new java.awt.Font("Advert", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel5.setText("Institute Fee");

        sCharge.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0"))));
        sCharge.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Class");
        jRadioButton1.setActionCommand("1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jRadioButton2.setText("Course");
        jRadioButton2.setActionCommand("2");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel17.setFont(new java.awt.Font("Poppins SemiBold", 1, 18)); // NOI18N
        jLabel17.setText("Employee Salary  ");

        hallBtn.setBackground(new java.awt.Color(51, 255, 51));
        hallBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        hallBtn.setText("Save");
        hallBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        hallBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hallBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallBtnActionPerformed(evt);
            }
        });

        salaryBtn.setBackground(new java.awt.Color(51, 255, 51));
        salaryBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        salaryBtn.setText("Save");
        salaryBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        salaryBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryBtnActionPerformed(evt);
            }
        });

        serviceBtn.setBackground(new java.awt.Color(51, 255, 51));
        serviceBtn.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        serviceBtn.setText("Save");
        serviceBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        serviceBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serviceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceBtnActionPerformed(evt);
            }
        });

        clean.setBackground(new java.awt.Color(255, 51, 51));
        clean.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        clean.setText("Clear All");
        clean.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        clean.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(hallTypes, javax.swing.GroupLayout.Alignment.LEADING, 0, 254, Short.MAX_VALUE)
                            .addComponent(hallFee, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hallBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(empType, javax.swing.GroupLayout.Alignment.LEADING, 0, 258, Short.MAX_VALUE)
                                    .addComponent(empSalary, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salaryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(35, 35, 35)))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sCharge)
                            .addComponent(serviceBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(31, 31, 31)
                                        .addComponent(jRadioButton2)))
                                .addGap(0, 105, Short.MAX_VALUE)))))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(empType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(empSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(salaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(hallTypes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hallFee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hallBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(sCharge, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(serviceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(clean, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jTabbedPane1.addTab("Financial Control", jPanel2);

        jPanel1.setBackground(new java.awt.Color(200, 200, 198));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("Add New Subject");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel6.setText("Grades");

        gradeCombo.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        gradeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        subjectName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subjectName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                subjectNameKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText("Subject Name :");

        addGrade.setBackground(new java.awt.Color(51, 255, 51));
        addGrade.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        addGrade.setText("Add Grade");
        addGrade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        addGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGradeActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(234, 238, 244));

        subjectTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        subjectTable.getTableHeader().setReorderingAllowed(false);
        subjectTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subjectTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(subjectTable);

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton9.setText("Clear");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton5.setText("Add New Subject");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(234, 238, 244));

        gradeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        gradeTable.getTableHeader().setReorderingAllowed(false);
        gradeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(gradeTable);

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton7.setText("Update Subject");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subjectName))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(336, 336, 336)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(gradeCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gradeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Subject Control", jPanel1);

        jPanel3.setBackground(new java.awt.Color(200, 200, 198));

        jPanel7.setBackground(new java.awt.Color(234, 238, 244));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Institute Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText(" Institute Name");

        homename.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setText(" Address 01");

        line01.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText(" Landline");

        landLine.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText(" Address 02");

        line02.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText(" Mobile");

        mobile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setText(" City");

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel13.setText(" Email");

        email.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        city.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        city.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(homename)
                    .addComponent(line01, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(landLine, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(line02)
                    .addComponent(mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 162, Short.MAX_VALUE))
                    .addComponent(city, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(4, 4, 4)
                        .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(4, 4, 4)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(4, 4, 4)
                        .addComponent(homename, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(4, 4, 4)
                                .addComponent(line01, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(4, 4, 4)
                                .addComponent(landLine, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(4, 4, 4)
                                .addComponent(line02, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(4, 4, 4)
                                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(234, 238, 244));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database Cnfiguration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        username.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        database1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel15.setText(" Username");

        port1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        host1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        password.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel16.setText(" Password");

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setText(" Port");

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel14.setText(" Host");

        jLabel19.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel19.setText(" Database");

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(host1)
                    .addComponent(username))
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(port1)
                    .addComponent(password))
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(database1)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(4, 4, 4)
                        .addComponent(database1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)
                        .addComponent(host1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(4, 4, 4)
                        .addComponent(port1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(4, 4, 4)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(13, 13, 13))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Institute Data", jPanel3);

        jPanel11.setBackground(new java.awt.Color(200, 200, 198));

        jLabel1.setBackground(new java.awt.Color(250, 249, 246));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        jLabel1.setText("Settings");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Hall Type ComboBox
    private void hallTypesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_hallTypesItemStateChanged
        loardHallFee();
    }//GEN-LAST:event_hallTypesItemStateChanged

    // EMP ComboBox
    private void empTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_empTypeItemStateChanged
        loardSalary();
    }//GEN-LAST:event_empTypeItemStateChanged

    // Class Redio
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        loardServiceFee();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    // Course Redio
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        loardServiceFee();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    //  subject Name Text Feild
    private void subjectNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_subjectNameKeyReleased
        loardSubjects();
    }//GEN-LAST:event_subjectNameKeyReleased

    // Clear Button of Subject Panal Data
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        clearSubject();
    }//GEN-LAST:event_jButton9ActionPerformed

    //addGrade Button
    private void addGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGradeActionPerformed
        addGrade();
    }//GEN-LAST:event_addGradeActionPerformed

    //Update Subject Button
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        updateSubject();
    }//GEN-LAST:event_jButton7ActionPerformed

    // Add new Subject Button
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        newSubject();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void hallBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallBtnActionPerformed
        updateHallFee();
    }//GEN-LAST:event_hallBtnActionPerformed

    private void salaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryBtnActionPerformed
        updateEmpSalary();
    }//GEN-LAST:event_salaryBtnActionPerformed

    private void serviceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceBtnActionPerformed
        updateServiseFee();
    }//GEN-LAST:event_serviceBtnActionPerformed

    private void cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanActionPerformed
        cleanAll();
    }//GEN-LAST:event_cleanActionPerformed

    private void subjectTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subjectTableMouseClicked
        if (evt.getClickCount() == 2) {
            selectSubject();
        }
    }//GEN-LAST:event_subjectTableMouseClicked

    private void gradeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeTableMouseClicked
        if (evt.getClickCount() == 2) {
            dropGrade();
        }
    }//GEN-LAST:event_gradeTableMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGrade;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> city;
    private javax.swing.JButton clean;
    private javax.swing.JTextField database1;
    private javax.swing.JTextField email;
    private javax.swing.JFormattedTextField empSalary;
    private javax.swing.JComboBox<String> empType;
    private javax.swing.JComboBox<String> gradeCombo;
    private javaswingdev.swing.table.Table gradeTable;
    private javax.swing.JButton hallBtn;
    private javax.swing.JFormattedTextField hallFee;
    private javax.swing.JComboBox<String> hallTypes;
    private javax.swing.JTextField homename;
    private javax.swing.JTextField host1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField landLine;
    private javax.swing.JTextField line01;
    private javax.swing.JTextField line02;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField password;
    private javax.swing.JTextField port1;
    private javax.swing.JFormattedTextField sCharge;
    private javax.swing.JButton salaryBtn;
    private javax.swing.JButton serviceBtn;
    private javax.swing.JTextField subjectName;
    private javaswingdev.swing.table.Table subjectTable;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables

    // loard hallType into combobox[hallType] & add hall type price into hallMap [HashMap]
    private void loardHallType() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `room_type`");
            DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
            comboBoxModel.addElement("Select Type");
            while (resultSet.next()) {
                hallMap.put(resultSet.getString("type"), resultSet.getString("fee"));
                comboBoxModel.addElement(resultSet.getString("type"));
            }
            hallTypes.setModel(comboBoxModel);
            loardHallFee();
        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
    }

    // display hall Fee on the jTextfield [hallfee]
    private void loardHallFee() {
        String type = (String) hallTypes.getSelectedItem();
        if (type.equals("Select Type")) {
            hallFee.setText("");
        } else {
            hallFee.setText(hallMap.get(type));
        }
        textFieldContaller(hallTypes, hallFee);
    }

    // loard EMP types into combobox[empType] & add emp salary into hallMap [HashMap]
    private void loardEMPypes() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `emp_type`");
            DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
            comboBoxModel.addElement("Select Type");
            while (resultSet.next()) {
                if (!resultSet.getString("name").equals("Master Admin")) {
                    empMap.put(resultSet.getString("name"), resultSet.getString("salary"));
                    comboBoxModel.addElement(resultSet.getString("name"));
                }
            }
            empType.setModel(comboBoxModel);
            loardSalary();
        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
    }

    // display emp salary on the jTextfield [empSalary]
    private void loardSalary() {
        String type = (String) empType.getSelectedItem();
        if (type.equals("Select Type")) {
            empSalary.setText("");
        } else {
            empSalary.setText(empMap.get(type));
        }
        textFieldContaller(empType, empSalary);
    }

    // set text feild active and inactive
    private void textFieldContaller(JComboBox box, JTextField field) {
        String status = (String) box.getSelectedItem();
        if (status.equals("Select Type")) {
            field.setEditable(false);
        } else {
            field.setEditable(true);
        }
    }

    // put service charge into hashMap [serviceMap]
    private void loardserviceCharge() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `service_charge`");
            while (resultSet.next()) {
                serviceMap.put(resultSet.getString("service_type_id"), resultSet.getString("fee"));
            }
        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
        loardServiceFee();
    }

    // view [sCharge] Service charges that are get from teachers (n%)
    private void loardServiceFee() {
        String redio = buttonGroup1.getSelection().getActionCommand();
        sCharge.setText(serviceMap.get(redio));
    }

    // update hall fees [btn : hallBtn]
    private void updateHallFee() {
        String fee = hallFee.getText().replace(",", "");
        String type = (String) hallTypes.getSelectedItem();
        if (Validator.AMOUNT.validate(fee)) {
            int status = JOptionPane.showConfirmDialog(this, "Are you sure you want to change the Class Room charges?", "Confirmation Message", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_OPTION) {
                try {
                    DB.IUD("UPDATE `room_type` SET `fee`= '" + fee + "' WHERE `type`='" + type + "'");
                    loardHallType();
                    hallTypes.setSelectedItem(type);
                    JOptionPane.showMessageDialog(this, "Hall Fee Updated");
                } catch (ClassNotFoundException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
                } catch (SQLException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
                } catch (IOException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
                }
            } else {
                loardHallFee();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Fee", "Warning", JOptionPane.WARNING_MESSAGE);
            loardHallFee();
        }
    }

    // update EMP Salary fees [btn : salaryBtn]
    private void updateEmpSalary() {
        String salary = empSalary.getText().replace(",", "");
        String type = (String) empType.getSelectedItem();
        if (Validator.AMOUNT.validate(salary)) {
            int status = JOptionPane.showConfirmDialog(this, "Are you sure you want to change the Employee's Salary ?", "Confirmation Message", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_OPTION) {
                try {
                    DB.IUD("UPDATE `emp_type` SET `salary`='" + salary + "' WHERE `name`='" + type + "'");
                    loardEMPypes();
                    empType.setSelectedItem(type);
                    JOptionPane.showMessageDialog(this, "Employee's Salary Updated");
                } catch (ClassNotFoundException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
                } catch (SQLException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
                } catch (IOException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
                }
            } else {
                loardSalary();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Salary", "Warning", JOptionPane.WARNING_MESSAGE);
            loardSalary();
        }
    }

    // update Service Fee [btn : salaryBtn]
    private void updateServiseFee() {
        String fee = sCharge.getText().replace(",", "");
        if (Validator.AMOUNT.validate(fee)) {
            int status = JOptionPane.showConfirmDialog(this, "Are you sure you want to change the Servise Charges ?", "Confirmation Message", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_OPTION) {
                try {
                    DB.IUD("UPDATE `service_charge` SET `fee`='" + fee + "' WHERE `service_type_id`='" + buttonGroup1.getSelection().getActionCommand() + "'");
                    loardserviceCharge();
                    loardServiceFee();
                    JOptionPane.showMessageDialog(this, "Servise Charges Updated");
                } catch (ClassNotFoundException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
                } catch (SQLException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
                } catch (IOException ex) {
                    LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
                }
            } else {
                loardServiceFee();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Fee", "Warning", JOptionPane.WARNING_MESSAGE);
            loardServiceFee();
        }
    }

    // reaset data fiels [brn: clean]
    private void cleanAll() {
        loardEMPypes();
        loardHallType();
        loardServiceFee();
    }

    //view Subjects In jTable [subjectTable]
    private void loardSubjects() {
        String name = subjectName.getText();
        try {
            ResultSet resultSet = DB.search("SELECT `name` FROM `subject` WHERE `name` LIKE '%" + name + "%' ");
            DefaultTableModel model = (DefaultTableModel) subjectTable.getModel();
            model.setRowCount(0);

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            subjectTable.setDefaultRenderer(Object.class, renderer);
            renderer.setHorizontalAlignment(SwingConstants.CENTER);

            while (resultSet.next()) {
                Vector v = new Vector();
                v.add(resultSet.getString("name"));
                model.addRow(v);
            }
            subjectTable.setModel(model);
        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
    }

    // View Grades on ComboBox [gradeCombo]
    private void loardGrades() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `grade`");
            DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
            comboBoxModel.addElement("Select a Grade");

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            gradeTable.setDefaultRenderer(Object.class, renderer);
            renderer.setHorizontalAlignment(SwingConstants.CENTER);

            while (resultSet.next()) {
                comboBoxModel.addElement(resultSet.getString("name"));
            }
            gradeCombo.setModel(comboBoxModel);
            cleanGardes();
        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
    }

    // View Subject on jTbale [gradeTable]
    private void selectSubject() {
        try {
            int row = subjectTable.getSelectedRow();
            String query = "SELECT * FROM `subject`"
                    + "INNER JOIN `grade_has_subject` ON grade_has_subject.subject_id = subject.id "
                    + "INNER JOIN `grade` ON grade_has_subject.grade_id = grade.id "
                    + "WHERE `subject`.`name` = '" + subjectTable.getValueAt(row, 0) + "';";
            ResultSet resultSet = DB.search(query);

            DefaultTableModel model = (DefaultTableModel) gradeTable.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString(7)); // Grade Name
                model.addRow(vector);
            }
            gradeTable.setModel(model);
            loardGrades();
        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
    }

    // Clear Action on Subject Panal 
    private void clearSubject() {
        subjectTable.clearSelection();
        DefaultTableModel model = (DefaultTableModel) gradeTable.getModel();
        model.setRowCount(0);
        subjectName.setText("");
        loardSubjects();
        loardGrades();
    }

    // Remove Selected Subject Form ComboBox [gradeCombo]
    private void cleanGardes() {
        for (int row = 0; row < gradeTable.getRowCount(); row++) {
            Object cellValue = gradeTable.getValueAt(row, 0);
            gradeCombo.removeItem(cellValue);
        }
    }

    // View Added Grade of a Subject on jTbale [gradeTbale]
    private void addGrade() {
        if (subjectTable.getSelectedRow() >= 0) {
            if (gradeCombo.getSelectedItem().equals("Select a Grade")) {
                JOptionPane.showMessageDialog(this, "Please Select a Grade");
            } else {
                Object[] garde = {(String) gradeCombo.getSelectedItem()};
                DefaultTableModel model = (DefaultTableModel) gradeTable.getModel();
                model.addRow(garde);
                loardGrades();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select a Subject");
        }
    }

    // Remove Grade of a Subject From jTbale [gradeTbale]
    private void dropGrade() {
        if (gradeTable.getSelectedRow() >= 0) {
            int status = JOptionPane.showConfirmDialog(this, "Are you sure you want to Remove [" + gradeTable.getValueAt(gradeTable.getSelectedRow(), 0) + " ]", "Warning", JOptionPane.YES_NO_OPTION);
            if (status == JOptionPane.YES_OPTION) {

                DefaultTableModel model = (DefaultTableModel) gradeTable.getModel();
                model.removeRow(gradeTable.getSelectedRow());
                loardGrades();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please Select a Grade");
        }
    }

    // Update Subject data on Database 
    private void updateSubject() {
        String subject = (String) subjectTable.getValueAt(subjectTable.getSelectedRow(), 0);
        String delete = "DELETE `grade_has_subject` FROM `grade_has_subject` "
                + "INNER JOIN `subject` ON `subject`.`id` = `grade_has_subject`.`subject_id` "
                + "WHERE `subject`.`name` = '" + subject + "';";
        int rowCount = gradeTable.getRowCount();
        try {
            DB.IUD(delete);
            for (int row = 0; row < rowCount; row++) {
                DB.IUD("INSERT INTO grade_has_subject (`subject_id`, `grade_id`) "
                        + "SELECT subject.id, grade.id FROM subject `subject` "
                        + "INNER JOIN `grade` ON subject.name = '" + subject + "' AND grade.name = '" + gradeTable.getValueAt(row, 0) + "'");
            }
            clearSubject();
            cleanGardes();
            JOptionPane.showMessageDialog(this, "Subject Update Success", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }

    }

    // add new Subject to database 
    private void newSubject() {
        int subjectCount = subjectTable.getRowCount();
        if (subjectCount == 0) {
            try {
                DB.IUD("INSERT INTO `subject` (`name`) VALUES ('" + WordFormat.capitalizedStart(subjectName.getText()) + "')");
                JOptionPane.showMessageDialog(this, "New Subject Added [" + WordFormat.capitalizedStart(subjectName.getText()) + "]", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (ClassNotFoundException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            } catch (SQLException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
            } catch (IOException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            }
        } else {
            if (subjectName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Subject Name is required", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "This subject already Exists", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    // loard City into comboBox [city]
    private void loardCity() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `city` ORDER BY `name` ASC");
            DefaultComboBoxModel comboBoxModel = new DefaultComboBoxModel();
            comboBoxModel.addElement("Select City");
            while (resultSet.next()) {
                comboBoxModel.addElement(resultSet.getString("name"));
            }
            city.setModel(comboBoxModel);
        } catch (ClassNotFoundException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        } catch (SQLException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "SQL Query Problem", ex);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
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
            return false;
        }
        return false;
    }

}
