/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package majorproject.Modules;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.SQLException;
import java.text.DateFormat; 
import java.text.SimpleDateFormat;
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JOptionPane; 
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author avinash
 */
public class AddCustomers extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomers
     */
    DatabaseUserAndPassword obj = new DatabaseUserAndPassword();
    String user = obj.user;
    String pass = obj.pass;
    
    public AddCustomers() {
        initComponents();
        autoincreament();
    }
    Connection conn;
    PreparedStatement pt;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        aadhar = new javax.swing.JTextField();
        passport = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        contact = new javax.swing.JTextField();
        dob = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        custid = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("First Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Last Name");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Aadhar No.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Passport No.");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));
        jPanel2.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 180, 30));
        jPanel2.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 180, 30));
        jPanel2.add(aadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 180, 30));
        jPanel2.add(passport, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 180, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 360, 290));

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("DOB :");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Contact No.");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Address");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 270, -1));
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 170, 40));
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 139, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Gender");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        male.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        male.setForeground(new java.awt.Color(0, 102, 102));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel3.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        female.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        female.setForeground(new java.awt.Color(0, 102, 102));
        female.setText("Female");
        jPanel3.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 330, 290));

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 140, 40));

        jButton2.setBackground(new java.awt.Color(102, 255, 204));
        jButton2.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, 130, 40));

        jLabel8.setFont(new java.awt.Font("Liberation Mono", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Custromer ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 120, 20));

        custid.setFont(new java.awt.Font("Century Schoolbook L", 1, 18)); // NOI18N
        custid.setForeground(new java.awt.Color(102, 102, 255));
        custid.setText("Ticket NO.");
        jPanel1.add(custid, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 130, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 788, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void autoincreament(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/MyAirlineSystem",user,pass);

           Statement s = conn.createStatement();
           ResultSet rs =s.executeQuery("select MAX(custid) from Customers");
           
           rs.next();
           rs.getString("MAX(custid)");
           
           if(rs.getString("MAX(custid)")==null){
               
               custid.setText("CI001");
           }
           else
           {
               long id = Long.parseLong(rs.getString("MAX(custid)").substring(2, rs.getString("MAX(custid)").length()));
               id++;
               custid.setText("CI"+String.format("%03d", id));
           }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
    
    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        

        String id = custid.getText();
        String first = firstname.getText();
        String last = lastname.getText();
        String aadharno = aadhar.getText();
        String passportno = passport.getText();
        String addrs = address.getText();
        String contactno = contact.getText();

        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(dob.getDate());

        String gender;
        if(male.isSelected()){
            gender ="male";
        }
        else
        {
            gender ="female";
        }

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/MyAirlineSystem",user,pass);

            pt = conn.prepareStatement("insert into Customers (custid,firstname,lastname,aadhar,passport,address,dob,gender,contact) values (?,?,?,?,?,?,?,?,?)");

            pt.setString(1, id);
            pt.setString(2, first);
            pt.setString(3, last);
            pt.setString(4, aadharno);
            pt.setString(5, passportno);
            pt.setString(6, addrs);
            pt.setString(7, date);
            pt.setString(8, gender);
            pt.setString(9, contactno);

            pt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data Inserted Sucessfully");

        }
        catch(SQLException ex){
            ex.getStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel custid;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField passport;
    // End of variables declaration//GEN-END:variables
}