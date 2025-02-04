package GUI;

import GUI.panal.ClassManagement;
import GUI.panal.ClassScheduleManagement;
import GUI.panal.CourseManagement;
import GUI.panal.PaymentManagement;

//import GUI.panal.Reporting;
//import GUI.panal.Settings;

//  import GUI.panal.Reporting;
import GUI.panal.Settings;
// import GUI.panal.Settings;

import GUI.panal.StudentAttendance;
import GUI.panal.StudentManagement;
import GUI.panal.TeacherManagement;
import GUI.panal.EmployeeManagement;
import GUI.panal.EnrollmentManagement;
import GUI.panal.HallManagement;
import GUI.panal.SalaryCalculation;
import GUI.panal.sub_dashboard;
import GUI.panal.systemAccess;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import modal.beans.Admin;
import modal.SetDate;
import modal.HomeInfo;

public class Dashboard extends javax.swing.JFrame {

    private Admin admin;

    public Dashboard(Admin bean) {
        initComponents();
        sub_dashboard a = new sub_dashboard();
        main.add(a);
        this.admin = bean;
        pageStart();
        time();
        date();
        setName();

        setIconImage();

        sVGImage2.setSvgImage("source/notification.svg", 30, 30);
        sVGImage3.setSvgImage("source/userprofile.svg", 28, 28);
        sVGImage1.setSvgImage("source/search.svg", 28, 28);
        
        saveLog();
    }

    SignIn lg = new SignIn();

    //Time
    Timer t;
    SimpleDateFormat st;

    public void time() {

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");

                String tt = st.format(dt);
                time.setText(tt);

            }
        });
        t.start();

    }

    //Date
    public void date() {
        DateTimeFormatter dates = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime now = LocalDateTime.now();
        date.setText(dates.format(now));
    }

    private void setName() {

        String userName = admin.getFname();
        jLabel3.setText(userName);
    }

    private void changeColor() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new RoundedPanel(20, Color.white);
        jPanel9 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        systemAManagement = new javax.swing.JButton();
        salaryCalculation = new javax.swing.JButton();
        employeeManagement = new javax.swing.JButton();
        paymentManagement = new javax.swing.JButton();
        attendance = new javax.swing.JButton();
        classSManagement = new javax.swing.JButton();
        studentEnrollment = new javax.swing.JButton();
        hallManagement = new javax.swing.JButton();
        courseManagement = new javax.swing.JButton();
        classManagement = new javax.swing.JButton();
        teacherManagement = new javax.swing.JButton();
        studentManagement = new javax.swing.JButton();
        subDashboard = new javax.swing.JButton();
        settings = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jPanel3 = new RoundedPanel(20, new Color(200,200,198));
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jPanel7 = new RoundedPanel(300, Color.white);
        sVGImage3 = new modal.SVGImage();
        jPanel12 = new RoundedPanel(300, Color.white);
        sVGImage1 = new modal.SVGImage();
        jPanel11 = new RoundedPanel(300, Color.white);
        sVGImage2 = new modal.SVGImage();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        main = new RoundedPanel(20, new Color(200,200,198));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("The Tution Class");

        jPanel1.setBackground(new java.awt.Color(200, 200, 198));

        jPanel2.setBackground(new java.awt.Color(200, 200, 198));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Mainlogo.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(67, 67, 67))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.setOpaque(false);

        systemAManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        systemAManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/access.png"))); // NOI18N
        systemAManagement.setText(" System access management");
        systemAManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        systemAManagement.setContentAreaFilled(false);
        systemAManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        systemAManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        systemAManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemAManagementActionPerformed(evt);
            }
        });

        salaryCalculation.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        salaryCalculation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/payment.png"))); // NOI18N
        salaryCalculation.setText(" Salary Calculation");
        salaryCalculation.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        salaryCalculation.setContentAreaFilled(false);
        salaryCalculation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salaryCalculation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        salaryCalculation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryCalculationActionPerformed(evt);
            }
        });

        employeeManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        employeeManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/employee.png"))); // NOI18N
        employeeManagement.setText(" Employee Management");
        employeeManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        employeeManagement.setContentAreaFilled(false);
        employeeManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employeeManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        employeeManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeManagementActionPerformed(evt);
            }
        });

        paymentManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        paymentManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/payment.png"))); // NOI18N
        paymentManagement.setText(" Payment Management");
        paymentManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        paymentManagement.setContentAreaFilled(false);
        paymentManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paymentManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        paymentManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentManagementActionPerformed(evt);
            }
        });

        attendance.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        attendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/attendance.png"))); // NOI18N
        attendance.setText(" Attendance");
        attendance.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        attendance.setContentAreaFilled(false);
        attendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });

        classSManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        classSManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/add class.png"))); // NOI18N
        classSManagement.setText(" Schedule Management");
        classSManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        classSManagement.setContentAreaFilled(false);
        classSManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        classSManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        classSManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classSManagementActionPerformed(evt);
            }
        });

        studentEnrollment.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        studentEnrollment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/student enroll.png"))); // NOI18N
        studentEnrollment.setText(" Student Enrollment");
        studentEnrollment.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        studentEnrollment.setContentAreaFilled(false);
        studentEnrollment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentEnrollment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentEnrollment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentEnrollmentActionPerformed(evt);
            }
        });

        hallManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        hallManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/mainhall.jpg"))); // NOI18N
        hallManagement.setText(" Hall Management");
        hallManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        hallManagement.setContentAreaFilled(false);
        hallManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hallManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        hallManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hallManagementActionPerformed(evt);
            }
        });

        courseManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        courseManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/course.png"))); // NOI18N
        courseManagement.setText(" Course Management");
        courseManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        courseManagement.setContentAreaFilled(false);
        courseManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        courseManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        courseManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseManagementActionPerformed(evt);
            }
        });

        classManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        classManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/add class.png"))); // NOI18N
        classManagement.setText(" Class Management");
        classManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        classManagement.setContentAreaFilled(false);
        classManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        classManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        classManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classManagementActionPerformed(evt);
            }
        });

        teacherManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        teacherManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/teacher.png"))); // NOI18N
        teacherManagement.setText(" Teacher Management");
        teacherManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        teacherManagement.setContentAreaFilled(false);
        teacherManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        teacherManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        teacherManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherManagementActionPerformed(evt);
            }
        });

        studentManagement.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        studentManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/student.png"))); // NOI18N
        studentManagement.setText(" Student Management");
        studentManagement.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        studentManagement.setContentAreaFilled(false);
        studentManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentManagement.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        studentManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentManagementActionPerformed(evt);
            }
        });

        subDashboard.setBackground(new java.awt.Color(255, 255, 255));
        subDashboard.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        subDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/dashboard icon.png"))); // NOI18N
        subDashboard.setText(" Dashboard");
        subDashboard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        subDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subDashboardMouseExited(evt);
            }
        });
        subDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subDashboardActionPerformed(evt);
            }
        });

        settings.setFont(new java.awt.Font("SchulbuchNord", 0, 14)); // NOI18N
        settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/source/settings.png"))); // NOI18N
        settings.setText(" Settings");
        settings.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        settings.setContentAreaFilled(false);
        settings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(systemAManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(courseManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hallManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentEnrollment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classSManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(paymentManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeeManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salaryCalculation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(settings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(subDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(studentManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(teacherManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(classManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(courseManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hallManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(classSManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paymentManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employeeManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salaryCalculation, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(systemAManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(settings, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton15.setBackground(new java.awt.Color(51, 255, 255));
        jButton15.setFont(new java.awt.Font("SchulbuchNord", 0, 18)); // NOI18N
        jButton15.setText("LOG OUT");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel3.setBackground(new java.awt.Color(200, 200, 198));

        jLabel2.setFont(new java.awt.Font("SchulbuchNord", 0, 28)); // NOI18N
        jLabel2.setText("Hi,");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3.setText("Vihanga");

        date.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        date.setText("Date");

        time.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 24)); // NOI18N
        time.setText("Time");

        jPanel7.setBackground(new java.awt.Color(200, 200, 198));
        jPanel7.setPreferredSize(new java.awt.Dimension(40, 40));

        sVGImage3.setText("sVGImage1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(sVGImage3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sVGImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(200, 200, 198));
        jPanel12.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sVGImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sVGImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(200, 200, 198));
        jPanel11.setPreferredSize(new java.awt.Dimension(40, 40));

        sVGImage2.setText("sVGImage1");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(sVGImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sVGImage2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(200, 200, 198));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel18.setBackground(new java.awt.Color(200, 200, 198));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
            .addComponent(date, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(time, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        main.setBackground(new java.awt.Color(200, 200, 198));
        main.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salaryCalculationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaryCalculationActionPerformed
        loadPanal(new SalaryCalculation(admin));
    }//GEN-LAST:event_salaryCalculationActionPerformed

    private void employeeManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeManagementActionPerformed
        loadPanal(new EmployeeManagement(admin));
    }//GEN-LAST:event_employeeManagementActionPerformed

    private void paymentManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentManagementActionPerformed
        loadPanal(new PaymentManagement(admin));
    }//GEN-LAST:event_paymentManagementActionPerformed

    private void attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceActionPerformed
        loadPanal(new StudentAttendance(admin));
    }//GEN-LAST:event_attendanceActionPerformed

    private void classSManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classSManagementActionPerformed
        loadPanal(new ClassScheduleManagement(admin));
    }//GEN-LAST:event_classSManagementActionPerformed

    private void studentEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentEnrollmentActionPerformed
        loadPanal(new EnrollmentManagement(admin));
    }//GEN-LAST:event_studentEnrollmentActionPerformed

    private void hallManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hallManagementActionPerformed
        loadPanal(new HallManagement(admin));
    }//GEN-LAST:event_hallManagementActionPerformed

    private void courseManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseManagementActionPerformed
        loadPanal(new CourseManagement(admin));
    }//GEN-LAST:event_courseManagementActionPerformed

    private void classManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classManagementActionPerformed
        loadPanal(new ClassManagement(admin));
    }//GEN-LAST:event_classManagementActionPerformed

    private void teacherManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherManagementActionPerformed
        loadPanal(new TeacherManagement(admin));
    }//GEN-LAST:event_teacherManagementActionPerformed

    private void studentManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentManagementActionPerformed
        loadPanal(new StudentManagement(admin));
    }//GEN-LAST:event_studentManagementActionPerformed

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        this.dispose();
        lg.setVisible(true);
    }//GEN-LAST:event_jButton15MouseClicked

    private void systemAManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemAManagementActionPerformed
        loadPanal(new systemAccess(admin));
    }//GEN-LAST:event_systemAManagementActionPerformed

    private void settingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsActionPerformed
        loadPanal(new Settings());
    }//GEN-LAST:event_settingsActionPerformed

    private void subDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subDashboardMouseExited
        subDashboard.setBackground(Color.white); // Change color on hover
    }//GEN-LAST:event_subDashboardMouseExited

    private void subDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subDashboardMouseEntered
        subDashboard.setBackground(Color.green); // Change color on hover
    }//GEN-LAST:event_subDashboardMouseEntered

    private void subDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subDashboardActionPerformed
        loadPanal(new sub_dashboard());

        subDashboard.addActionListener(new ActionListener() {
            private boolean isClicked = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (isClicked) {
                    subDashboard.setBackground(new Color(240, 240, 240)); // Original color
                } else {
                    subDashboard.setBackground(Color.black); // New color
                }
                isClicked = !isClicked; // Toggle state
            }
        });
    }//GEN-LAST:event_subDashboardActionPerformed

    private void pageStart() {

        String userType = admin.getType();

        if (userType.equals("Master Admin")) {
            studentManagement.setEnabled(true);
            teacherManagement.setEnabled(true);
            classManagement.setEnabled(true);
            courseManagement.setEnabled(true);
            hallManagement.setEnabled(true);
            studentEnrollment.setEnabled(true);
            classSManagement.setEnabled(true);
            attendance.setEnabled(true);
            paymentManagement.setEnabled(true);
            employeeManagement.setEnabled(true);
            salaryCalculation.setEnabled(true);
            systemAManagement.setEnabled(true);
            settings.setEnabled(true);

        } else if (userType.equals("Admin")) {
            studentManagement.setEnabled(true);
            teacherManagement.setEnabled(true);
            classManagement.setEnabled(true);
            courseManagement.setEnabled(true);
            hallManagement.setEnabled(true);
            studentEnrollment.setEnabled(true);
            classSManagement.setEnabled(true);
            paymentManagement.setEnabled(false);
            attendance.setEnabled(true);
            employeeManagement.setEnabled(true);
            salaryCalculation.setEnabled(false);
            systemAManagement.setEnabled(false);
            settings.setEnabled(false);

        } else if (userType.equals("Cashier")) {
            studentManagement.setEnabled(true);
            teacherManagement.setEnabled(false);
            classManagement.setEnabled(false);
            courseManagement.setEnabled(false);
            hallManagement.setEnabled(false);
            studentEnrollment.setEnabled(false);
            classSManagement.setEnabled(false);
            attendance.setEnabled(false);
            paymentManagement.setEnabled(true);
            employeeManagement.setEnabled(false);
            salaryCalculation.setEnabled(false);
            systemAManagement.setEnabled(false);
            settings.setEnabled(false);

        } else if (userType.equals("Attendance Marker")) {
            studentManagement.setEnabled(false);
            teacherManagement.setEnabled(false);
            classManagement.setEnabled(false);
            courseManagement.setEnabled(false);
            hallManagement.setEnabled(false);
            studentEnrollment.setEnabled(false);
            classSManagement.setEnabled(false);
            attendance.setEnabled(true);
            paymentManagement.setEnabled(false);
            employeeManagement.setEnabled(false);
            salaryCalculation.setEnabled(false);
            systemAManagement.setEnabled(false);
            settings.setEnabled(false);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendance;
    private javax.swing.JButton classManagement;
    private javax.swing.JButton classSManagement;
    private javax.swing.JButton courseManagement;
    private javax.swing.JLabel date;
    private javax.swing.JButton employeeManagement;
    private javax.swing.JButton hallManagement;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel main;
    private javax.swing.JButton paymentManagement;
    private modal.SVGImage sVGImage1;
    private modal.SVGImage sVGImage2;
    private modal.SVGImage sVGImage3;
    private javax.swing.JButton salaryCalculation;
    private javax.swing.JButton settings;
    private javax.swing.JButton studentEnrollment;
    private javax.swing.JButton studentManagement;
    private javax.swing.JButton subDashboard;
    private javax.swing.JButton systemAManagement;
    private javax.swing.JButton teacherManagement;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

    private void loadPanal(JPanel panal) {
        main.removeAll();
        main.add(panal, BorderLayout.CENTER);
        SwingUtilities.updateComponentTreeUI(main);
    }

    //title and logo
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Mainlogo.png")));
    }
    
    // contrall loging history
    private void saveLog() {
        try {

            // ser access Obj
            HomeInfo serObj = new HomeInfo();

            // get log info sofar
            Vector<String[]> v = serObj.getlog();

            // make current loged data array
            String[] currentLog = {
                admin.getUserID(),
                admin.getFname() + " " + admin.getLname(),
                admin.getUserName(),
                SetDate.getDate("yyyy/MM/dd hh:mm:ss a"),
                admin.getType(),
            };

            // add current loging date 
            v.add(currentLog);
            
            //save updated log list
            serObj.setlog(v);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //rounded panel
    class RoundedPanel extends JPanel {

        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;

        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//             
        }
    }
    
}
