package GUI.panal;

import GUI.popup.ClassDayTime;
import GUI.popup.TeacherSelectionClass;
import java.awt.Color;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import modal.DB;
import modal.HomeInfo;
import modal.IDGenarator;
import modal.LogCenter;
import modal.SetDate;
import modal.beans.Admin;
import modal.beans.ClassDay;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import net.sf.jasperreports.engine.JRException;
import modal.RoundedPanel;
import raven.toast.Notifications;

public class ClassManagement extends javax.swing.JPanel {

    /**
     * Creates new form ClassManagement
     */
    public ClassManagement(Admin admin) {
        initComponents();
        this.admin = admin;
        loadGrades();
        loadSubjectsReport();
        loadLanguages();
        loadMethod();
        loadModal();
        loadStatus();
        loadHall();
        loadType();
        loadDays();
        generateClassID();
        reset();
        loadClassesTable("");

        SearchReport();
        documentListner();
        jButton4.setEnabled(true);
        jComboBox6.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new RoundedPanel(20, new Color(234,238,244));
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextField25 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        jComboBox34 = new javax.swing.JComboBox<>();
        jComboBox33 = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable4 = new javaswingdev.swing.table.Table();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new RoundedPanel(20, new Color(234,238,244));
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jComboBox11 = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javaswingdev.swing.table.Table();
        jPanel11 = new RoundedPanel(20, new Color(234,238,244));
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(200, 200, 198));
        setPreferredSize(new java.awt.Dimension(967, 668));

        jTabbedPane1.setBackground(new java.awt.Color(200, 200, 198));
        jTabbedPane1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(967, 668));

        jPanel1.setBackground(new java.awt.Color(200, 200, 198));
        jPanel1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Teacher Selection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Meta", 0, 12)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText(" NIC");

        jLabel11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel11.setText(" First Name");

        jLabel10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel10.setText(" Last Name");

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText(" Gender");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText(" Number of Classes");

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton1.setText("Select Teacher");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jButton2.setBackground(new java.awt.Color(102, 255, 153));
        jButton2.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton2.setText("Search");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(11, 11, 11)))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(89, 89, 89)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Class Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jTextField25.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jLabel65.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel65.setText(" Fee");

        jLabel69.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jLabel66.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jButton21.setBackground(new java.awt.Color(51, 153, 255));
        jButton21.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton21.setText("Set Day & Time");
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jLabel67.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jComboBox5.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel12.setText(" Model");

        jComboBox4.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel13.setText(" Method");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setText(" Language");

        jComboBox3.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText(" Subject");

        jComboBox2.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOT SELECT" }));

        jLabel64.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel64.setText(" Type");

        jComboBox34.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox34.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox33.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox33.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel63.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel63.setText(" Hall ");

        jComboBox1.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText(" Grade");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText(" Class ID");

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel14.setText(" Status");

        jComboBox6.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(jComboBox1, 0, 144, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 146, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, 146, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jComboBox4, 0, 146, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(jComboBox5, 0, 142, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox6, 0, 146, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jComboBox33, 0, 146, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jComboBox34, 0, 146, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jTextField25, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                            .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addGap(6, 6, 6))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Teacher Name", "Class ID", "Grade", "Subject", "Language", "Method", "Modal", "Status", "Hall", "Type", "Fee", "Days", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.getTableHeader().setReorderingAllowed(false);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable4);

        jButton3.setBackground(new java.awt.Color(255, 51, 51));
        jButton3.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton3.setText("Clear All");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 255, 51));
        jButton5.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton5.setText("Register");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 102));
        jButton4.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton4.setText("Update");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Class Registration", jPanel1);

        jPanel2.setBackground(new java.awt.Color(200, 200, 198));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sorting Selection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel8.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel21.setText(" Class ID");

        jTextField3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel26.setText(" Modal");

        jComboBox16.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox16ItemStateChanged(evt);
            }
        });

        jComboBox12.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox12ItemStateChanged(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel27.setText(" Type");

        jComboBox9.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox9ItemStateChanged(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel22.setText(" Grade");

        jLabel23.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel23.setText(" Subject");

        jComboBox10.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox10ItemStateChanged(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel28.setText(" Status");

        jComboBox13.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox13ItemStateChanged(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel24.setText(" Language");

        jComboBox11.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox11ItemStateChanged(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel29.setText(" Hall");

        jComboBox14.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox14ItemStateChanged(evt);
            }
        });

        jComboBox15.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox15ItemStateChanged(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel30.setText(" Day");

        jComboBox17.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox17.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox17ItemStateChanged(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel25.setText(" Method");

        jLabel18.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText(" Teacher Search From NIC & Name");

        jTextField11.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField11KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jComboBox16, 0, 160, Short.MAX_VALUE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                                    .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.LEADING, 0, 160, Short.MAX_VALUE)
                            .addComponent(jComboBox13, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox11, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox14, 0, 160, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox17, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox15, 0, 160, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox15)
                    .addComponent(jComboBox14)
                    .addComponent(jComboBox13)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton7.setText("Clear All");
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
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

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton9.setText("Export As Pdf");
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Teacher Name", "Class ID", "Grade", "Subject", "Language", "Method", "Modal", "Status", "Hall", "Type", "Fee", "Days", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Report & View", jPanel2);

        jPanel11.setBackground(new java.awt.Color(200, 200, 198));

        jLabel1.setBackground(new java.awt.Color(250, 249, 246));
        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        jLabel1.setText("Class Management");

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
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tsc == null || !tsc.isVisible()) {
            tsc = new TeacherSelectionClass(this, true); // Create dialog instance if not already created
            tsc.setVisible(true); // Show the dialog
        } else {
            tsc.toFront(); // Bring the dialog to the front if it’s already open
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        registerClass();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SearchTeacher();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyReleased
        SearchReport();
    }//GEN-LAST:event_jTextField11KeyReleased

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked

        jButton4.setEnabled(true);
        jButton5.setEnabled(false);
        jComboBox6.setEnabled(true);
        int row = jTable4.getSelectedRow();
        try {

            if (row != -1) { // Valid row check
                String tnic = String.valueOf(jTable4.getValueAt(row, 0));
                jTextField7.setText(tnic);

                String classId = String.valueOf(jTable4.getValueAt(row, 2));
                jTextField1.setText(classId);

                String grade = String.valueOf(jTable4.getValueAt(row, 3));
                jComboBox1.setSelectedItem(grade);

                String subject = String.valueOf(jTable4.getValueAt(row, 4));
                jComboBox2.setSelectedItem(subject);

                String language = String.valueOf(jTable4.getValueAt(row, 5));
                jComboBox3.setSelectedItem(language);

                String method = String.valueOf(jTable4.getValueAt(row, 6));
                jComboBox4.setSelectedItem(method);

                String modal = String.valueOf(jTable4.getValueAt(row, 7));
                jComboBox5.setSelectedItem(modal);

                String status = String.valueOf(jTable4.getValueAt(row, 8));
                jComboBox6.setSelectedItem(status);

                String hall = String.valueOf(jTable4.getValueAt(row, 9));
                jComboBox33.setSelectedItem(hall);

                String type = String.valueOf(jTable4.getValueAt(row, 10));
                jComboBox34.setSelectedItem(type);

                String fee = String.valueOf(jTable4.getValueAt(row, 11));
                jTextField25.setText(fee);

            }

        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "jTable4MouseClicked", e);
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        updateClass();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        reportClear();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "jButton9ActionPerformed", e);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        SearchReport();
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jComboBox16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox16ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox16ItemStateChanged

    private void jComboBox12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox12ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox12ItemStateChanged

    private void jComboBox9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox9ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox9ItemStateChanged

    private void jComboBox10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox10ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox10ItemStateChanged

    private void jComboBox11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox11ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox11ItemStateChanged

    private void jComboBox17ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox17ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox17ItemStateChanged

    private void jComboBox15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox15ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox15ItemStateChanged

    private void jComboBox14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox14ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox14ItemStateChanged

    private void jComboBox13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox13ItemStateChanged
        SearchReport();
    }//GEN-LAST:event_jComboBox13ItemStateChanged

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if (cdt == null || !cdt.isVisible()) {
            dayVector = null; // Reset dayVector
            cdt = new ClassDayTime(this, true); // Use the class-level cdt variable
            cdt.setVisible(true); // Show the dialog
        } else {
            cdt.toFront(); // Bring the dialog to the front if it’s already open
        }

    }//GEN-LAST:event_jButton21ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        loadSubjects();
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javaswingdev.swing.table.Table jTable3;
    private javaswingdev.swing.table.Table jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private HashMap<String, String> gradeMap = new HashMap<>();
    private HashMap<String, String> subjectMap = new HashMap<>();
    private HashMap<String, String> classLanguageMap = new HashMap<>();
    private HashMap<String, String> classMethodMap = new HashMap<>();
    private HashMap<String, String> classTypeMap = new HashMap<>();
    private HashMap<String, String> hallMap = new HashMap<>();
    private HashMap<String, String> classModalMap = new HashMap<>();
    private HashMap<String, String> classStatusMap = new HashMap<>();

    private Admin admin;
    private TeacherSelectionClass tsc;
    private ClassDayTime cdt;

    //generate ClassId;
    private void generateClassID() {
        try {
            String classID = IDGenarator.generateID("CL", "class");
            jTextField1.setText(classID);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "generateClassID", e);
        }
    }

    //jdialog side to pass nic
    public JTextField getjTextField7() {
        return jTextField7;

    }

    //jdialog side to pass fname
    public JTextField getjTextField6() {
        return jTextField6;
    }

    //jdialog side to pass lname
    public JTextField getjTextField9() {
        return jTextField9;
    }

    //jdialog side to pass gender
    public JTextField getjTextField8() {
        return jTextField8;
    }

    // store class time & days
    private Vector<ClassDay> dayVector;
    //date format
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    // return the class ID
    public String getClassID() {
        return jTextField1.getText();
    }

    // set jDialogs dates
    public void setDate(Vector date) {
        this.dayVector = date;

    }

    //load grades for combobox and hashmap
    private void loadGrades() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `grade` WHERE `id` IN ('1', '2','3','4','5','6','7','8','9','10','11','12','13','14','16')");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                gradeMap.put(resultSet.getString("name"), resultSet.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox1.setModel(model);
            jComboBox9.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadGrades", e);
        }
    }

    //load subjects for combobox and hashmap
    private void loadSubjects() {

        String selectedGrade = String.valueOf(jComboBox1.getSelectedItem());

        try {

            ResultSet resultSet = DB.search("SELECT subject.name,subject.id FROM grade_has_subject INNER JOIN grade ON grade_has_subject.grade_id=grade.id INNER JOIN subject ON grade_has_subject.subject_id=subject.id WHERE grade.name='" + selectedGrade + "'");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("subject.name"));
                subjectMap.put(resultSet.getString("subject.name"), resultSet.getString("subject.id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox2.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadSubjects", e);
        }
    }

    //load languages for combobox and hashmap
    private void loadLanguages() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `class_language`");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("name"));
                classLanguageMap.put(resultSet.getString("name"), resultSet.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox3.setModel(model);
            jComboBox11.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadLanguages", e);
        }
    }

    //load method for combobox and hashmap
    private void loadMethod() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `class_method`");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("method"));
                classMethodMap.put(resultSet.getString("method"), resultSet.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox4.setModel(model);
            jComboBox17.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadMethod", e);
        }
    }

    //load modal for combobox and hashmap
    private void loadModal() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `class_modal`");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("modal"));
                classModalMap.put(resultSet.getString("modal"), resultSet.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox5.setModel(model);
            jComboBox16.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadModal", e);
        }
    }

    //load status for combobox and hashmap
    private void loadStatus() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `class_status`");
            Vector<String> vector = new Vector<>();

            while (resultSet.next()) {
                vector.add(resultSet.getString("status"));
                classStatusMap.put(resultSet.getString("status"), resultSet.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox6.setModel(model);
            jComboBox13.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadStatus", e);
        }
    }

    //load halls for combobox and hashmap
    private void loadHall() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `room_type`");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("type"));
                hallMap.put(resultSet.getString("type"), resultSet.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox33.setModel(model);
            jComboBox14.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadHall", e);
        }
    }
    //load types for combobox and hashmap

    private void loadType() {
        try {
            ResultSet resultSet = DB.search("SELECT * FROM `class_type`");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("type"));
                classTypeMap.put(resultSet.getString("type"), resultSet.getString("id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox34.setModel(model);
            jComboBox12.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadType", e);
        }
    }
    //register a class

    private void registerClass() {
        try {
            String teacherID = jTextField7.getText();
            String classID = jTextField1.getText();
            String grade = String.valueOf(jComboBox1.getSelectedItem());
            String subject = String.valueOf(jComboBox2.getSelectedItem());
            String language = String.valueOf(jComboBox3.getSelectedItem());
            String method = String.valueOf(jComboBox4.getSelectedItem());
            String model = String.valueOf(jComboBox5.getSelectedItem());
            String status = String.valueOf(jComboBox6.getSelectedItem());
            String hall = String.valueOf(jComboBox33.getSelectedItem());
            String type = String.valueOf(jComboBox34.getSelectedItem());
            String fee = jTextField25.getText();
            String registerDate = SetDate.getDate("yyyy-MM-dd HH:mm:ss");

            if (teacherID.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select Teacher First");
            } else if (classID.isEmpty()) {

                int choice = JOptionPane.showConfirmDialog(this, "class ID is empty generate New ID",
                        "warning", JOptionPane.YES_NO_OPTION);

                // Check the user's choice and display a corresponding message 
                if (choice == JOptionPane.YES_OPTION) {
                    generateClassID();
                    Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER,
                            "generate Id");
                } else if (choice == JOptionPane.NO_OPTION) {
                    // If the user chose 'No', show a message indicating that changes are not saved 
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                            "Changes not saved");
                }

            } else if (grade.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select grade");

            } else if (subject.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select subject");

            } else if (language.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select language");

            } else if (method.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select method");

            } else if (model.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select model");

            } else if (status.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select status");

            } else if (hall.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select hall");

            } else if (type.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select type");

            } else if (fee.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Enter Fee Amount");

            } else if (!fee.matches("\\d+")) {
                // The input is valid, as it contains only digits
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Invalid Amount");
                // Proceed with additional logic here if needed
            } else if (dayVector == null) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please select Day and time");

            } else {

                ResultSet rs = DB.search("SELECT * FROM  `class` WHERE teacher_nic='" + teacherID + "' AND subject_id='" + subjectMap.get(subject) + "' AND grade_id='" + gradeMap.get(grade) + "' AND class_type_id='" + classTypeMap.get(type) + "' AND "
                        + "class_method_id='" + classMethodMap.get(method) + "' AND class_language_id='" + classLanguageMap.get(language) + "' AND class_status_id='" + classStatusMap.get(status) + "' AND room_type_id='" + hallMap.get(hall) + "' AND class_modal_id='" + classModalMap.get(model) + "'");
                if (rs.next()) {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                            "This class Already registered");
                } else {
                    DB.IUD("INSERT INTO `class` (`id`,`fee`,`register_date`,`teacher_nic`,`subject_id`,`grade_id`,"
                            + "`class_type_id`,`class_method_id`,`class_language_id`,`class_status_id`,`room_type_id`,`employee_id`,`class_modal_id`) VALUES"
                            + "('" + classID + "','" + fee + "','" + registerDate + "','" + teacherID + "','" + subjectMap.get(subject) + "','" + gradeMap.get(grade) + "',"
                            + "'" + classTypeMap.get(type) + "','" + classMethodMap.get(method) + "','" + classLanguageMap.get(language) + "','" + classStatusMap.get(status) + "'"
                            + ",'" + hallMap.get(hall) + "','" + admin.getUserID() + "','" + classModalMap.get(model) + "')");

                    for (ClassDay vnm : dayVector) {
                        String time12hr = vnm.getTime();  // Example time
                        SimpleDateFormat format12hr = new SimpleDateFormat("hh:mm a");
                        SimpleDateFormat format24hr = new SimpleDateFormat("HH:mm:ss");
                        Date day = format12hr.parse(time12hr);
                        String time24hr = format24hr.format(day);
                        DB.IUD("INSERT INTO `class_day` (`time`,`week_day_id`,`class_id`) VALUES ('" + time24hr + "','" + vnm.getId() + "','" + jTextField1.getText() + "')");
                    }
                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                            "Register Successfully");
                    reset();

                }
            }
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "registerClass", e);
        }
    }

    //update registered class
    private void updateClass() {
        try {
            String teacherID = jTextField7.getText();
            String classID = jTextField1.getText();
            String grade = String.valueOf(jComboBox1.getSelectedItem());
            String subject = String.valueOf(jComboBox2.getSelectedItem());
            String language = String.valueOf(jComboBox3.getSelectedItem());
            String method = String.valueOf(jComboBox4.getSelectedItem());
            String model = String.valueOf(jComboBox5.getSelectedItem());
            String status = String.valueOf(jComboBox6.getSelectedItem());
            String hall = String.valueOf(jComboBox33.getSelectedItem());
            String type = String.valueOf(jComboBox34.getSelectedItem());
            String fee = jTextField25.getText();
            String registerDate = SetDate.getDate("yyyy-MM-dd HH:mm:ss");

            int row = jTable4.getSelectedRow();
            if (row == -1) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please select a row to update");
            } else if (teacherID.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select Teacher First");

            } else if (classID.isEmpty()) {

                int choice = JOptionPane.showConfirmDialog(this, "class ID is empty generate New ID",
                        "warning", JOptionPane.YES_NO_OPTION);

                // Check the user's choice and display a corresponding message 
                if (choice == JOptionPane.YES_OPTION) {
                    generateClassID();
                    Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER,
                            "generate Id");
                } else if (choice == JOptionPane.NO_OPTION) {
                    // If the user chose 'No', show a message indicating that changes are not saved 
                    Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER,
                            "Changes not saved");
                }

            } else if (grade.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select grade");

            } else if (subject.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select subject");

            } else if (language.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select language");

            } else if (method.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select method");

            } else if (model.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select model");

            } else if (status.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select status");

            } else if (hall.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select hall");

            } else if (type.equals("Select")) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Select type");

            } else if (fee.isEmpty()) {
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Please Enter Fee Amount");

            } else if (!fee.matches("\\d+(\\.\\d+)?")) {
                // The input is valid, as it contains only digits
                Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                        "Invalid Amount");
            } else {

                ResultSet rs = DB.search("SELECT * FROM  `class` WHERE teacher_nic='" + teacherID + "' AND subject_id='" + subjectMap.get(subject) + "' "
                        + "AND grade_id='" + gradeMap.get(grade) + "' AND class_type_id='" + classTypeMap.get(type) + "' AND "
                        + "class_method_id='" + classMethodMap.get(method) + "' AND class_language_id='" + classLanguageMap.get(language) + "' "
                        + "AND class_status_id='" + classStatusMap.get(status) + "' AND room_type_id='" + hallMap.get(hall) + "' "
                        + "AND class_modal_id='" + classModalMap.get(model) + "'AND`fee`='" + fee + "' ");
                if (rs.next() && dayVector == null) {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                            "Nothing to Update");
                } else {
                    if (!rs.next()) {
                        DB.IUD("UPDATE `class` SET `fee` = '" + fee + "', `register_date` = '" + registerDate + "',"
                                + " `teacher_nic` = '" + teacherID + "', `subject_id` = '" + subjectMap.get(subject) + "', `grade_id` = '" + gradeMap.get(grade) + "', "
                                + "`class_type_id` = '" + classTypeMap.get(type) + "', `class_method_id` = '" + classMethodMap.get(method) + "', "
                                + "`class_language_id` = '" + classLanguageMap.get(language) + "', `class_status_id` = '" + classStatusMap.get(status) + "', "
                                + "`room_type_id` = '" + hallMap.get(hall) + "', `employee_id` ='" + admin.getUserID() + "' ,`class_modal_id`='" + classModalMap.get(model) + "'"
                                + "WHERE `id`='" + classID + "'");

                        Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                                "Update Successfully");

                    }

                    if (dayVector != null) {
                        DB.IUD("DELETE FROM `class_day` WHERE `class_id`='" + classID + "'");
                        for (ClassDay vnm : dayVector) {
                            String time12hr = vnm.getTime();  // Example time
                            SimpleDateFormat format12hr = new SimpleDateFormat("hh:mm a");
                            SimpleDateFormat format24hr = new SimpleDateFormat("HH:mm:ss");
                            Date day = format12hr.parse(time12hr);
                            String time24hr = format24hr.format(day);
                            DB.IUD("INSERT INTO `class_day` (`time`,`week_day_id`,`class_id`) VALUES ('" + time24hr + "','" + vnm.getId() + "','" + jTextField1.getText() + "')");
//                            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
//                                    "Update Successfully");
                        }

                    }

                    reset();
                    loadClassesTable("");
                }
            }
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "updateClass", e);
        }
    }

    //load table from database
    private void loadClassesTable(String value) {

        try {
            String query = "SELECT class.*, teacher.nic AS teacher_nic, teacher.fname AS fname, teacher.lname AS lname, "
                    + "grade.name AS grade_name, subject.name AS subject_name, class_language.name AS language_name, "
                    + "class_method.method AS method_name, class_modal.modal AS modal_name, class_status.status AS status_name, "
                    + "room_type.type AS room_type_name, class_type.type AS class_type_name, "
                    + "GROUP_CONCAT(week_day.day ORDER BY week_day.id SEPARATOR ', ') AS days, "
                    + "GROUP_CONCAT(class_day.time SEPARATOR ', ') AS time "
                    + "FROM `class` "
                    + "INNER JOIN `teacher` ON `class`.`teacher_nic` = `teacher`.`nic` "
                    + "INNER JOIN `grade` ON `grade`.`id` = `class`.`grade_id` "
                    + "INNER JOIN `subject` ON `subject`.`id` = `class`.`subject_id` "
                    + "INNER JOIN `class_language` ON `class_language`.`id` = `class`.`class_language_id` "
                    + "INNER JOIN `class_method` ON `class_method`.`id` = `class`.`class_method_id` "
                    + "INNER JOIN `class_modal` ON `class_modal`.`id` = `class`.`class_modal_id` "
                    + "INNER JOIN `class_status` ON `class_status`.`id` = `class`.`class_status_id` "
                    + "INNER JOIN `room_type` ON `room_type`.`id` = `class`.`room_type_id` "
                    + "INNER JOIN `class_type` ON `class_type`.`id` = `class`.`class_type_id` "
                    + "LEFT JOIN `class_day` ON `class_day`.`class_id` = `class`.`id` "
                    + "LEFT JOIN `week_day` ON `week_day`.`id` = `class_day`.`week_day_id` ";

            // Apply the WHERE clause conditionally
            if (!value.matches("")) {
                query += " WHERE `teacher`.`nic`='" + value + "' ";
            }

            // Add the GROUP BY clause
            query += " GROUP BY `class`.`id`";

            ResultSet resultSet = DB.search(query);
            DefaultTableModel model = (DefaultTableModel) jTable4.getModel();

            model.setRowCount(0);

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            jTable4.setDefaultRenderer(Object.class, renderer);

            while (resultSet.next()) {
                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("teacher_nic"));
                vector.add(resultSet.getString("fname") + " " + resultSet.getString("lname"));
                vector.add(resultSet.getString("id"));
                vector.add(resultSet.getString("grade_name"));
                vector.add(resultSet.getString("subject_name"));
                vector.add(resultSet.getString("language_name"));
                vector.add(resultSet.getString("method_name"));
                vector.add(resultSet.getString("modal_name"));
                vector.add(resultSet.getString("status_name"));
                vector.add(resultSet.getString("room_type_name"));
                vector.add(resultSet.getString("class_type_name"));
                vector.add(resultSet.getString("fee"));
                vector.add(resultSet.getString("days"));
                vector.add(resultSet.getString("time"));
                model.addRow(vector);

            }
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadClassesTable", e);
        }
    }

    //teacher class count
    private void teacherClassCount() {
        String tnic = jTextField7.getText();
        try {
            ResultSet rs1 = DB.search("SELECT COUNT(*) AS count FROM `class` WHERE `teacher_nic`='" + tnic + "'");
            if (rs1.next()) {
                int count = rs1.getInt("count");
                jTextField10.setText(String.valueOf(count));
                ResultSet rs2 = DB.search("SELECT * FROM `teacher` INNER JOIN `employee` ON `employee`.`id`=`teacher`.`employee_id` INNER JOIN `gender` ON `gender`.`id`=`employee`.`gender_id` WHERE `teacher`.`nic`='" + tnic + "'");

                if (rs2.next()) {
                    jTextField6.setText(rs2.getString("fname"));
                    jTextField9.setText(rs2.getString("lname"));
                    jTextField8.setText(rs2.getString("gender.name"));

                }
            }
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "teacherClassCount", e);
        }
    }

    //search teacher for classes
    private void SearchTeacher() {

        String value = jTextField7.getText();

        loadClassesTable(value);

    }

    private void documentListner() {
        jTextField7.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                teacherClassCount();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                teacherClassCount();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                teacherClassCount();
            }
        });

    }

    //reset
    private void reset() {

        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField25.setText("");
        jComboBox1.setSelectedItem("Select");
        jComboBox2.setSelectedItem("Select");
        jComboBox3.setSelectedItem("Select");
        jComboBox4.setSelectedItem("Select");
        jComboBox5.setSelectedItem("Select");
        jComboBox6.setSelectedItem("Select");
        jComboBox33.setSelectedItem("Select");
        jComboBox34.setSelectedItem("Select");
        jComboBox6.setEnabled(false);
        loadClassesTable("");
        generateClassID();
        jButton5.setEnabled(true);
        jButton4.setEnabled(true);

    }

    //Class Management Reporting Part//////
    //load table
    private void loadSubjectsReport() {

        try {

            ResultSet resultSet = DB.search("SELECT * FROM `subject`");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("subject.name"));
                //subjectMap.put(resultSet.getString("subject.name"), resultSet.getString("subject.id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox10.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadSubjectsReport", e);
        }
    }

    private void loadDays() {

        try {

            ResultSet resultSet = DB.search("SELECT * FROM `week_day`");
            Vector<String> vector = new Vector<>();
            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("week_day.day"));
                //subjectMap.put(resultSet.getString("subject.name"), resultSet.getString("subject.id"));

            }

            DefaultComboBoxModel model = new DefaultComboBoxModel(vector);
            jComboBox15.setModel(model);
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadDays", e);
        }
    }

    //SEARCH FOR REPORT
    private void SearchReport() {
        // Fetch values from appropriate fields and combo boxes
        String teacherValue = jTextField11.getText().trim(); // Teacher search value
        String classValue = jTextField3.getText().trim();   // Class search value
        String gradeValue = String.valueOf(jComboBox9.getSelectedItem()).trim();
        String subjectValue = String.valueOf(jComboBox10.getSelectedItem()).trim();
        String languageValue = String.valueOf(jComboBox11.getSelectedItem()).trim();
        String methodValue = String.valueOf(jComboBox17.getSelectedItem()).trim();
        String modalValue = String.valueOf(jComboBox16.getSelectedItem()).trim();
        String typeValue = String.valueOf(jComboBox12.getSelectedItem()).trim();
        String statusValue = String.valueOf(jComboBox13.getSelectedItem()).trim();
        String hallValue = String.valueOf(jComboBox14.getSelectedItem()).trim();
        String dayValue = String.valueOf(jComboBox15.getSelectedItem()).trim();

        // Pass all values to loadTableReport
        loadTableReport(teacherValue, classValue, gradeValue, subjectValue, languageValue, methodValue,
                modalValue, typeValue, statusValue, hallValue, dayValue);
    }

    private void loadTableReport(String teacherValue, String classValue, String gradeValue, String subjectValue,
            String languageValue, String methodValue, String modalValue, String typeValue,
            String statusValue, String hallValue, String dayValue) {
        try {
            StringBuilder query = new StringBuilder(
                    "SELECT class.*, teacher.nic AS teacher_nic, teacher.fname AS fname, teacher.lname AS lname, "
                    + "grade.name AS grade_name, subject.name AS subject_name, class_language.name AS language_name, "
                    + "class_method.method AS method_name, class_modal.modal AS modal_name, class_status.status AS status_name, "
                    + "room_type.type AS room_type_name, class_type.type AS class_type_name, "
                    + "GROUP_CONCAT(week_day.day ORDER BY week_day.id SEPARATOR ', ') AS days, "
                    + "GROUP_CONCAT(class_day.time SEPARATOR ', ') AS time "
                    + "FROM `class` "
                    + "INNER JOIN `teacher` ON `class`.`teacher_nic` = `teacher`.`nic` "
                    + "INNER JOIN `grade` ON `grade`.`id` = `class`.`grade_id` "
                    + "INNER JOIN `subject` ON `subject`.`id` = `class`.`subject_id` "
                    + "INNER JOIN `class_language` ON `class_language`.`id` = `class`.`class_language_id` "
                    + "INNER JOIN `class_method` ON `class_method`.`id` = `class`.`class_method_id` "
                    + "INNER JOIN `class_modal` ON `class_modal`.`id` = `class`.`class_modal_id` "
                    + "INNER JOIN `class_status` ON `class_status`.`id` = `class`.`class_status_id` "
                    + "INNER JOIN `room_type` ON `room_type`.`id` = `class`.`room_type_id` "
                    + "INNER JOIN `class_type` ON `class_type`.`id` = `class`.`class_type_id` "
                    + "LEFT JOIN `class_day` ON `class_day`.`class_id` = `class`.`id` "
                    + "LEFT JOIN `week_day` ON `week_day`.`id` = `class_day`.`week_day_id`");

            boolean hasCondition = false;

            // Append conditions dynamically
            if (!teacherValue.isEmpty()) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                if (teacherValue.matches("\\d+")) {
                    query.append("`teacher`.`nic` LIKE '%").append(teacherValue).append("%'");
                } else {
                    query.append("(`teacher`.`fname` LIKE '%").append(teacherValue).append("%' OR `teacher`.`lname` LIKE '%").append(teacherValue).append("%')");
                }
            }

            if (!classValue.isEmpty()) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`class`.`id` LIKE '%").append(classValue).append("%'");
            }

            if (!gradeValue.equals("Select")) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`grade`.`name` = '").append(gradeValue).append("'");
            }

            if (!subjectValue.equals("Select")) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`subject`.`name` = '").append(subjectValue).append("'");
            }

            if (!languageValue.equals("Select")) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`class_language`.`name` = '").append(languageValue).append("'");
            }

            if (!methodValue.equals("Select")) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`class_method`.`method` = '").append(methodValue).append("'");
            }

            if (!modalValue.equals("Select")) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`class_modal`.`modal` = '").append(modalValue).append("'");
            }

            if (!typeValue.equals("Select")) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`class_type`.`type` = '").append(typeValue).append("'");
            }

            if (statusValue != null && !statusValue.isEmpty() && !statusValue.equals("Select")) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`class_status`.`status` = '").append(statusValue).append("'");
            }

            if (!hallValue.equals("Select")) {
                query.append(hasCondition ? " AND " : " WHERE ");
                hasCondition = true;
                query.append("`room_type`.`type` = '").append(hallValue).append("'");
            }

            // Add GROUP BY clause
            query.append(" GROUP BY `class`.`id`");

            // Apply the day filter using HAVING clause
            if (!dayValue.equals("Select")) {
                query.append(" HAVING FIND_IN_SET('").append(dayValue).append("', days)");
            }

            // Execute the query
            ResultSet resultSet = DB.search(query.toString());
            DefaultTableModel model = (DefaultTableModel) jTable3.getModel();

            DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
            renderer.setHorizontalAlignment(SwingConstants.CENTER);
            jTable3.setDefaultRenderer(Object.class, renderer);

            // Clear existing rows
            model.setRowCount(0);

            // Populate table
            while (resultSet.next()) {
                Vector<String> vector = new Vector<>();
                vector.add(resultSet.getString("teacher_nic"));
                vector.add(resultSet.getString("fname") + " " + resultSet.getString("lname"));
                vector.add(resultSet.getString("id"));
                vector.add(resultSet.getString("grade_name"));
                vector.add(resultSet.getString("subject_name"));
                vector.add(resultSet.getString("language_name"));
                vector.add(resultSet.getString("method_name"));
                vector.add(resultSet.getString("modal_name"));
                vector.add(resultSet.getString("status_name"));
                vector.add(resultSet.getString("room_type_name"));
                vector.add(resultSet.getString("class_type_name"));
                vector.add(resultSet.getString("fee"));
                vector.add(resultSet.getString("days"));
                vector.add(resultSet.getString("time"));
                model.addRow(vector);
            }
        } catch (Exception e) {
            LogCenter.logger.log(Level.WARNING, "loadTableReport", e);
        }
    }

    private void reportClear() {
        jTextField11.setText("");
        jTextField3.setText("");
        jComboBox9.setSelectedItem("Select");
        jComboBox10.setSelectedItem("Select");
        jComboBox11.setSelectedItem("Select");
        jComboBox17.setSelectedItem("Select");
        jComboBox16.setSelectedItem("Select");
        jComboBox12.setSelectedItem("Select");
        jComboBox13.setSelectedItem("Ongoing");
        jComboBox14.setSelectedItem("Select");
        jComboBox15.setSelectedItem("Select");
        SearchReport();
    }

}
