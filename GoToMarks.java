/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flex;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Shehzar
 */
public class GoToMarks extends javax.swing.JFrame {

    /**
     * Creates new form GoToMarks
     */
    String id;
//    private JPanel panel;
    private JButton[] array;
    private JButton back;

    public GoToMarks() {
        initComponents();
    }

    private void initFrame(String request) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBounds(400, 200, 300, 800);
        if (request.equals("Student")) {
            setBounds(20, 20, 400, 350);
        } else {
            setBounds(20, 20, 400, 700);
        }
        setVisible(true);
    }

    private JComboBox createCombo(String[] text, int x, int y) {
        JComboBox combo = new JComboBox(text);
        panel.add(combo);
        combo.setBounds(x, y, 150, 20);
        // combo.setPreferredSize(new Dimension(200, 100));

        return combo;
    }

    private JButton createbutton(String text, int x, int y, Boolean var) {
        JButton but = new JButton(text);
        panel.add(but);
        if (var == false) {
            but.setBounds(x, y, 70, 30);
        } else {
            but.setBounds(x, y, 170, 40);
        }
        but.setVisible(true);
        return but;
    }

    public GoToMarks(String _id, String request) throws HeadlessException {

        initComponents();
        setSize(900, 500);
        setLocationRelativeTo(null);
//        setTitle("Courses Marks");
        
        int row = 10;
        dbconnectivity db = new dbconnectivity();
        List<Course> c = new ArrayList<Course>();

        if (request.equals("Student")) {
            c = db.getstudentcourses(_id);
        } else {
            c = db.getteachercourses(_id);
        }

        int size = 0;
        for (int i = 0; i < c.size(); i++) {
            if (c.get(i).courseName != "null") {
                size++;
            }
        }

        back = createbutton("Back", 10, row, false);
        row = row + 50;

        array = new JButton[size];

        for (int j = 0, i = 0; j < size; j++, i++) {

            array[j] = createbutton("<html><center><strong>" + c.get(i).courseName + "<br>" + c.get(i).section + "</strong></center></html>", 20, row, true);
            j++;
            i++;
            if (j == size) {
                break;
            }
            array[j] = createbutton("<html><center><strong>" + c.get(i).courseName + "<br>" + c.get(i).section + "</strong></center></html>", 200, row, true);
            row = row + 50;
        }

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                if (request.equals("Teacher")) {
                    new TeacherGUI(TeacherGUI.teacherId, TeacherGUI.teacherName).setVisible(true);
                } else {
                    new StudentGUI(StudentGUI.id, StudentGUI.name, StudentGUI.batch).setVisible(true);
                }
            }
        });

        for (int j = 0, i = 0; j < size; j++, i++) {
            String name = c.get(i).courseName;
            String sec = c.get(i).section;
            array[j].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    dispose();
                    if (request.equals("Student")) {
                        new ViewMarksGUI(StudentGUI.id, name).setVisible(true);
                    } else {
                        new AddEvaluationInfo(name, sec).setVisible(true);
                    }
                }
            });
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        sidepane3 = new javax.swing.JPanel();
        logo3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        courseregistration1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        viewattendance1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        viewmarks1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        viewtranscript1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        feedback1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        viewregisteredcourses1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        changepassword1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        logout1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        viewfeechallan = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        dropCourse = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        sidepane3.setBackground(new java.awt.Color(102, 102, 102));

        logo3.setBackground(new java.awt.Color(102, 102, 102));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage.png"))); // NOI18N

        javax.swing.GroupLayout logo3Layout = new javax.swing.GroupLayout(logo3);
        logo3.setLayout(logo3Layout);
        logo3Layout.setHorizontalGroup(
            logo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logo3Layout.setVerticalGroup(
            logo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logo3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        courseregistration1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseregistration1MouseClicked(evt);
            }
        });

        jLabel17.setText("Course Registration");

        javax.swing.GroupLayout courseregistration1Layout = new javax.swing.GroupLayout(courseregistration1);
        courseregistration1.setLayout(courseregistration1Layout);
        courseregistration1Layout.setHorizontalGroup(
            courseregistration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseregistration1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(38, 38, 38))
        );
        courseregistration1Layout.setVerticalGroup(
            courseregistration1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(courseregistration1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewattendance1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewattendance1MouseClicked(evt);
            }
        });

        jLabel18.setText("View Attendance");

        javax.swing.GroupLayout viewattendance1Layout = new javax.swing.GroupLayout(viewattendance1);
        viewattendance1.setLayout(viewattendance1Layout);
        viewattendance1Layout.setHorizontalGroup(
            viewattendance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewattendance1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        viewattendance1Layout.setVerticalGroup(
            viewattendance1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewattendance1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        viewmarks1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewmarks1MouseClicked(evt);
            }
        });

        jLabel19.setText("View Marks");

        javax.swing.GroupLayout viewmarks1Layout = new javax.swing.GroupLayout(viewmarks1);
        viewmarks1.setLayout(viewmarks1Layout);
        viewmarks1Layout.setHorizontalGroup(
            viewmarks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewmarks1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(57, 57, 57))
        );
        viewmarks1Layout.setVerticalGroup(
            viewmarks1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewmarks1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewtranscript1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtranscript1MouseClicked(evt);
            }
        });

        jLabel20.setText("View Transcript");

        javax.swing.GroupLayout viewtranscript1Layout = new javax.swing.GroupLayout(viewtranscript1);
        viewtranscript1.setLayout(viewtranscript1Layout);
        viewtranscript1Layout.setHorizontalGroup(
            viewtranscript1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewtranscript1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(47, 47, 47))
        );
        viewtranscript1Layout.setVerticalGroup(
            viewtranscript1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewtranscript1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        feedback1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedback1MouseClicked(evt);
            }
        });

        jLabel21.setText("Feedback");

        javax.swing.GroupLayout feedback1Layout = new javax.swing.GroupLayout(feedback1);
        feedback1.setLayout(feedback1Layout);
        feedback1Layout.setHorizontalGroup(
            feedback1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, feedback1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(64, 64, 64))
        );
        feedback1Layout.setVerticalGroup(
            feedback1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(feedback1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewregisteredcourses1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewregisteredcourses1MouseClicked(evt);
            }
        });

        jLabel22.setText("Registered Courses");

        javax.swing.GroupLayout viewregisteredcourses1Layout = new javax.swing.GroupLayout(viewregisteredcourses1);
        viewregisteredcourses1.setLayout(viewregisteredcourses1Layout);
        viewregisteredcourses1Layout.setHorizontalGroup(
            viewregisteredcourses1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewregisteredcourses1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(38, 38, 38))
        );
        viewregisteredcourses1Layout.setVerticalGroup(
            viewregisteredcourses1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewregisteredcourses1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        changepassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changepassword1MouseClicked(evt);
            }
        });

        jLabel23.setText("Change Password");

        javax.swing.GroupLayout changepassword1Layout = new javax.swing.GroupLayout(changepassword1);
        changepassword1.setLayout(changepassword1Layout);
        changepassword1Layout.setHorizontalGroup(
            changepassword1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changepassword1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(43, 43, 43))
        );
        changepassword1Layout.setVerticalGroup(
            changepassword1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changepassword1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout1MouseClicked(evt);
            }
        });

        jLabel24.setText("Logout");

        javax.swing.GroupLayout logout1Layout = new javax.swing.GroupLayout(logout1);
        logout1.setLayout(logout1Layout);
        logout1Layout.setHorizontalGroup(
            logout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logout1Layout.setVerticalGroup(
            logout1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logout1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewfeechallan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewfeechallanMouseClicked(evt);
            }
        });

        jLabel25.setText("View Fee Challan");

        javax.swing.GroupLayout viewfeechallanLayout = new javax.swing.GroupLayout(viewfeechallan);
        viewfeechallan.setLayout(viewfeechallanLayout);
        viewfeechallanLayout.setHorizontalGroup(
            viewfeechallanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewfeechallanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(43, 43, 43))
        );
        viewfeechallanLayout.setVerticalGroup(
            viewfeechallanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewfeechallanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dropCourse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dropCourseMouseClicked(evt);
            }
        });

        jLabel26.setText("Drop Course");

        javax.swing.GroupLayout dropCourseLayout = new javax.swing.GroupLayout(dropCourse);
        dropCourse.setLayout(dropCourseLayout);
        dropCourseLayout.setHorizontalGroup(
            dropCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dropCourseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addGap(53, 53, 53))
        );
        dropCourseLayout.setVerticalGroup(
            dropCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dropCourseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        javax.swing.GroupLayout sidepane3Layout = new javax.swing.GroupLayout(sidepane3);
        sidepane3.setLayout(sidepane3Layout);
        sidepane3Layout.setHorizontalGroup(
            sidepane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(courseregistration1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewattendance1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewmarks1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewtranscript1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(feedback1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewregisteredcourses1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(changepassword1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logout1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(viewfeechallan, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dropCourse, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidepane3Layout.setVerticalGroup(
            sidepane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepane3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(logo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseregistration1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewattendance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewmarks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewtranscript1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(feedback1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewregisteredcourses1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changepassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewfeechallan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidepane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sidepane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void courseregistration1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseregistration1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseRegistrationGUI().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_courseregistration1MouseClicked

    private void viewattendance1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewattendance1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoToAttendance(StudentGUI.id, "Student").setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewattendance1MouseClicked

    private void viewmarks1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewmarks1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoToMarks(StudentGUI.id, "Student").setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewmarks1MouseClicked

    private void viewtranscript1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtranscript1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewTranscript(StudentGUI.id, StudentGUI.name).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewtranscript1MouseClicked

    private void feedback1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedback1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new GoToFeedback(StudentGUI.id).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_feedback1MouseClicked

    private void viewregisteredcourses1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewregisteredcourses1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRegisteredCourses(StudentGUI.id, StudentGUI.name, StudentGUI.batch).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewregisteredcourses1MouseClicked

    private void changepassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changepassword1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new changePassword("student", StudentGUI.id).setVisible(true);
            }
        });
    }//GEN-LAST:event_changepassword1MouseClicked

    private void logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_logout1MouseClicked

    private void viewfeechallanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewfeechallanMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeChallanGUI().setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_viewfeechallanMouseClicked

    private void dropCourseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropCourseMouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DropCourseGUI(StudentGUI.id).setVisible(true);
            }
        });
        dispose();
    }//GEN-LAST:event_dropCourseMouseClicked

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
            java.util.logging.Logger.getLogger(GoToMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GoToMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GoToMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GoToMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GoToMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel changepassword1;
    private javax.swing.JPanel courseregistration1;
    private javax.swing.JPanel dropCourse;
    private javax.swing.JPanel feedback1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel logo3;
    private javax.swing.JPanel logout1;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel sidepane3;
    private javax.swing.JPanel viewattendance1;
    private javax.swing.JPanel viewfeechallan;
    private javax.swing.JPanel viewmarks1;
    private javax.swing.JPanel viewregisteredcourses1;
    private javax.swing.JPanel viewtranscript1;
    // End of variables declaration//GEN-END:variables
}
