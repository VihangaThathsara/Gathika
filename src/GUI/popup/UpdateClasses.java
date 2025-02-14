/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package GUI.popup;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import modal.DB;
import modal.LogCenter;
import modal.RoundedPanel;
import java.awt.Color;
import raven.toast.Notifications;

/**
 *
 * @author dell
 */
public class UpdateClasses extends javax.swing.JDialog {

    /**
     * Creates new form UpdateClasses
     */
    public UpdateClasses(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        loadClassSchedulTable("SELECT * FROM `class_schedule`"
                + "INNER JOIN `class` ON `class`.`id`=`class_schedule`.`class_id`"
                + "INNER JOIN `class_room` ON `class_room`.`id`=`class_schedule`.`class_room_id`"
                + "INNER JOIN `employee` ON `employee`.`id`=`class_schedule`.`employee_id`"
                + "INNER JOIN `schedule_status` ON `schedule_status`.`id`=`class_schedule`.`schedule_status_id`"
                + "INNER JOIN `room_type` ON `room_type`.`id`=`class_room`.`room_type_id` ORDER BY `class_schedule`.`id` ASC");
        loadClassId();
        loadScheduleStatus();

        scheduleStatusUpdateCombobox.setEnabled(false);

        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        classScheduleUpdateTable.setDefaultRenderer(Object.class, renderer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(20, new Color(250,249,246));
        classIDComboboxUpdate = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scheduleStatusUpdateCombobox = new javax.swing.JComboBox<>();
        scheduleIDField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        saveChangeButton = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        dateField = new javax.swing.JTextField();
        sTimeField = new javax.swing.JTextField();
        eTimeField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sStatusField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        classScheduleUpdateTable = new javaswingdev.swing.table.Table();
        jPanel4 = new RoundedPanel(20, new Color(234,238,244));
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        jPanel3.setBackground(new java.awt.Color(200, 200, 198));

        jPanel2.setBackground(new java.awt.Color(200, 200, 198));

        classIDComboboxUpdate.setBackground(new java.awt.Color(240, 240, 240));
        classIDComboboxUpdate.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        classIDComboboxUpdate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        classIDComboboxUpdate.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                classIDComboboxUpdateItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Search By Class ID");

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Schedule ID");

        scheduleStatusUpdateCombobox.setBackground(new java.awt.Color(240, 240, 240));
        scheduleStatusUpdateCombobox.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        scheduleStatusUpdateCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));

        scheduleIDField.setEditable(false);
        scheduleIDField.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        scheduleIDField.setForeground(new java.awt.Color(255, 0, 51));
        scheduleIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Schedule Status");

        jPanel1.setBackground(new java.awt.Color(250, 249, 246));

        saveChangeButton.setBackground(new java.awt.Color(51, 255, 51));
        saveChangeButton.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        saveChangeButton.setText("Save Change");
        saveChangeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        saveChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangeButtonActionPerformed(evt);
            }
        });

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        idField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dateField.setEditable(false);
        dateField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        dateField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sTimeField.setEditable(false);
        sTimeField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        sTimeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        eTimeField.setEditable(false);
        eTimeField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        eTimeField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Class Date");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Class ID");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Start Time");

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("End Time");

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Schedule Status");

        sStatusField.setEditable(false);
        sStatusField.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        jButton1.setText("Reset");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idField)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(sTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(130, 130, 130)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eTimeField)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sStatusField))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sTimeField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eTimeField, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(sStatusField))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        classScheduleUpdateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Schedule ID", "Class ID", "Class Date", "Employee", "Schedule Status", "Hall No", "Hall Type", "Hall Capacity", "Start Time", "End Time", "Scheduled Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        classScheduleUpdateTable.getTableHeader().setReorderingAllowed(false);
        classScheduleUpdateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classScheduleUpdateTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(classScheduleUpdateTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classIDComboboxUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scheduleIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(scheduleStatusUpdateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(scheduleStatusUpdateCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(classIDComboboxUpdate)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scheduleIDField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(200, 200, 198));

        jLabel9.setBackground(new java.awt.Color(250, 249, 246));
        jLabel9.setFont(new java.awt.Font("Poppins SemiBold", 1, 20)); // NOI18N
        jLabel9.setText("Update Class");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangeButtonActionPerformed

        updateClasse();
    }//GEN-LAST:event_saveChangeButtonActionPerformed

    private void classIDComboboxUpdateItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_classIDComboboxUpdateItemStateChanged
        search();
        reset1();
    }//GEN-LAST:event_classIDComboboxUpdateItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        reset();
        resetTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void classScheduleUpdateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classScheduleUpdateTableMouseClicked
        try {
            if (evt.getClickCount() == 2) { // Detect double-click
                int selectedRow = classScheduleUpdateTable.getSelectedRow();

                if (selectedRow != -1) {
                    // Get values from the table and set in respective fields
                    scheduleIDField.setText(String.valueOf(classScheduleUpdateTable.getValueAt(selectedRow, 0)));
                    idField.setText(String.valueOf(classScheduleUpdateTable.getValueAt(selectedRow, 1)));
                    dateField.setText(String.valueOf(classScheduleUpdateTable.getValueAt(selectedRow, 2)));
                    sTimeField.setText(String.valueOf(classScheduleUpdateTable.getValueAt(selectedRow, 8)));
                    eTimeField.setText(String.valueOf(classScheduleUpdateTable.getValueAt(selectedRow, 9)));
                    sStatusField.setText(String.valueOf(classScheduleUpdateTable.getValueAt(selectedRow, 4)));
                }
                scheduleStatusUpdateCombobox.setEnabled(true);
            }

        } catch (Exception e) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "classScheduleUpdateTableMouseClicked", e);
        }
    }//GEN-LAST:event_classScheduleUpdateTableMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> classIDComboboxUpdate;
    private javaswingdev.swing.table.Table classScheduleUpdateTable;
    private javax.swing.JTextField dateField;
    private javax.swing.JTextField eTimeField;
    private javax.swing.JTextField idField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField sStatusField;
    private javax.swing.JTextField sTimeField;
    private javax.swing.JButton saveChangeButton;
    private javax.swing.JTextField scheduleIDField;
    private javax.swing.JComboBox<String> scheduleStatusUpdateCombobox;
    // End of variables declaration//GEN-END:variables

    // hash Map
    private static HashMap<String, String> scheduleStautusMap = new HashMap<>(); //for get id from schedule status

    private void loadClassSchedulTable(String query) {
        try {

            ResultSet resultSet = DB.search(query);

            DefaultTableModel tableModel = (DefaultTableModel) classScheduleUpdateTable.getModel();
            tableModel.setRowCount(0);

            while (resultSet.next()) {
                Vector vector = new Vector();
                vector.add(resultSet.getString("class_schedule.id"));
                vector.add(resultSet.getString("class.id"));
                vector.add(resultSet.getString("class_date"));
                vector.add(resultSet.getString("employee.fname") + " " + resultSet.getString("employee.lname"));
                vector.add(resultSet.getString("schedule_status.statats"));
                vector.add(resultSet.getString("class_room.id"));
                vector.add(resultSet.getString("room_type.type"));
                vector.add(resultSet.getString("class_room.capacity"));
                vector.add(resultSet.getString("start_time"));
                vector.add(resultSet.getString("end_time"));
                vector.add(resultSet.getString("shedule_time"));

                tableModel.addRow(vector);
            }

        } catch (ClassNotFoundException | SQLException e) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "loadClassSchedulTable", e);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }
    }

    private void loadClassId() {
        try {

            ResultSet resultSet = DB.search("SELECT * FROM `class`");

            Vector vector = new Vector();

            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("id"));
            }

            DefaultComboBoxModel ComboBoxModel = new DefaultComboBoxModel(vector);

            classIDComboboxUpdate.setModel(ComboBoxModel);

        } catch (ClassNotFoundException | SQLException e) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "loadClassId", e);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }

    }

    // load class schedule status for combo box
    private void loadScheduleStatus() {

        try {

            ResultSet resultSet = DB.search("SELECT * FROM `schedule_status`");

            Vector<String> vector = new Vector<>();

            vector.add("Select");

            while (resultSet.next()) {
                vector.add(resultSet.getString("statats"));
                scheduleStautusMap.put(resultSet.getString("statats"), resultSet.getString("id"));

            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(vector);
            scheduleStatusUpdateCombobox.setModel(comboBoxModel);

        } catch (ClassNotFoundException | SQLException e) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "loadScheduleStatus", e);
        } catch (IOException ex) {
            LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
        }

    }

    private void search() {
        String cID = String.valueOf(classIDComboboxUpdate.getSelectedItem());

        loadClassSchedulTable("SELECT * FROM `class_schedule`"
                + "INNER JOIN `class` ON `class`.`id`=`class_schedule`.`class_id`"
                + "INNER JOIN `class_room` ON `class_room`.`id`=`class_schedule`.`class_room_id`"
                + "INNER JOIN `employee` ON `employee`.`id`=`class_schedule`.`employee_id`"
                + "INNER JOIN `schedule_status` ON `schedule_status`.`id`=`class_schedule`.`schedule_status_id`"
                + "INNER JOIN `room_type` ON `room_type`.`id`=`class_room`.`room_type_id` WHERE `class`.`id` = '" + cID + "' ORDER BY `class_schedule`.`id` ASC");
    }

    private void reset() {
        scheduleStatusUpdateCombobox.setSelectedIndex(0);
        scheduleStatusUpdateCombobox.setEnabled(false);
        classIDComboboxUpdate.setSelectedIndex(0);
        idField.setText("");
        dateField.setText("");
        sTimeField.setText("");
        eTimeField.setText("");
        scheduleIDField.setText("");
        sStatusField.setText("");
    }

    private void reset1() {
        scheduleStatusUpdateCombobox.setSelectedIndex(0);
        idField.setText("");
        dateField.setText("");
        sTimeField.setText("");
        eTimeField.setText("");
        scheduleIDField.setText("");
        sStatusField.setText("");
    }

    private void resetTable() {
        loadClassSchedulTable("SELECT * FROM `class_schedule`"
                + "INNER JOIN `class` ON `class`.`id`=`class_schedule`.`class_id`"
                + "INNER JOIN `class_room` ON `class_room`.`id`=`class_schedule`.`class_room_id`"
                + "INNER JOIN `employee` ON `employee`.`id`=`class_schedule`.`employee_id`"
                + "INNER JOIN `schedule_status` ON `schedule_status`.`id`=`class_schedule`.`schedule_status_id`"
                + "INNER JOIN `room_type` ON `room_type`.`id`=`class_room`.`room_type_id` ORDER BY `class_schedule`.`id` ASC");
    }

    private void updateClasse() {
        String statushange = String.valueOf(scheduleStatusUpdateCombobox.getSelectedItem());
        String cidCombobox = String.valueOf(classIDComboboxUpdate.getSelectedItem());
        String cid = idField.getText();
        String cDate = dateField.getText();
        String cSt = sTimeField.getText();
        String cEt = eTimeField.getText();
        String sid = scheduleIDField.getText();
        String sStatus = sStatusField.getText();

        if (statushange.equals("Select")) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Schedule Status is required");
        } else if (statushange.equals(sStatus)) {
            Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "No any Updates");
            reset();
            resetTable();
            scheduleStatusUpdateCombobox.setEnabled(false);
        } else {
            try {
                ResultSet resultSet = DB.search("SELECT * FROM `class_schedule`"
                        + "WHERE `class_id` = '" + cid + "'"
                        + "AND `class_date`='" + cDate + "'"
                        + "AND `start_time` = '" + cSt + "'"
                        + "AND `end_time` = '" + cEt + "'");
                if (!resultSet.next()) {
                    Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER,
                    "Can not Update");
                } else {
                    DB.IUD("UPDATE `class_schedule` SET `schedule_status_id` = '" + scheduleStautusMap.get(statushange) + "'"
                            + "WHERE `id` = '" + sid + "'");

                    resetTable();
                    reset();

                    Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER,
                    "Update Successfully");
                    this.dispose();

                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "updateClasse", e);
            } catch (IOException ex) {
                LogCenter.logger.log(java.util.logging.Level.WARNING, "Database Connecting Problem", ex);
            }
        }
    }
}
