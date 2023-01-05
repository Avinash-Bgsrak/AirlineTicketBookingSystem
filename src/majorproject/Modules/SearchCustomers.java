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
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author avinash
 */
public class SearchCustomers extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddCustomer
     */
    
    DatabaseUserAndPassword obj = new DatabaseUserAndPassword();
    String user = obj.user;
    String pass = obj.pass;
    
    
    public SearchCustomers() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstnames = new javax.swing.JTextField();
        lastnames = new javax.swing.JTextField();
        aadhars = new javax.swing.JTextField();
        passports = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addresss = new javax.swing.JTextArea();
        contacts = new javax.swing.JTextField();
        dobs = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        custid = new javax.swing.JTextField();

        setResizable(false);
        setPreferredSize(new java.awt.Dimension(800, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("First Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 80, 30));

        jLabel2.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Aadhar No.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Pasport No.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        jPanel1.add(firstnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 190, 30));
        jPanel1.add(lastnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 190, 30));
        jPanel1.add(aadhars, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, 30));
        jPanel1.add(passports, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 190, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 68, 370, 330));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("DOB :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 60, 30));

        jLabel7.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Contact No.");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Address");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        addresss.setColumns(20);
        addresss.setRows(5);
        jScrollPane1.setViewportView(addresss);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 260, -1));
        jPanel2.add(contacts, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 160, 30));
        jPanel2.add(dobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 140, 160, 30));

        jLabel10.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Gender");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        male.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        male.setForeground(new java.awt.Color(0, 102, 102));
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        female.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        female.setForeground(new java.awt.Color(0, 102, 102));
        female.setText("Female");
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 68, 340, 290));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(102, 255, 204));
        jButton2.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 110, 40));

        updatebtn.setBackground(new java.awt.Color(102, 255, 204));
        updatebtn.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(204, 0, 0));
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 110, 40));

        searchbtn.setBackground(new java.awt.Color(102, 255, 204));
        searchbtn.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(204, 0, 0));
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel3.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 30));

        jLabel8.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Custromer ID");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 100, 30));
        jPanel3.add(custid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 190, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        
            // TODO add your handling code here:
                   
            
            String id = custid.getText();
            String first = firstnames.getText();
            String last = lastnames.getText();
            String aadharno = aadhars.getText();
            String passportno = passports.getText(); 
            String addrs = addresss.getText();
            String contactno = contacts.getText();
            
            DateFormat da = new SimpleDateFormat("YYYY-MM-DD");
            String date = da.format(dobs.getDate());
            
            String gender;
            
            if(male.isSelected())
            {
                
                gender ="male";
            }
            else 
            {
                
                gender ="female";
            }
          
            
            try{
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/MyAirlineSystem",user,pass);
               
                
                pt = conn.prepareStatement("update Customers set firstname = ?,lastname = ?,aadhar = ?,passport = ?,address = ?,dob = ?,gender = ?,contact = ? where custid = ?");
                
                
                pt.setString(1, first);
                pt.setString(2, last);
                pt.setString(3, aadharno);
                pt.setString(4, passportno);
                pt.setString(5, addrs);
                pt.setString(6, date);
                pt.setString(7, gender);
                pt.setString(8, contactno);
                pt.setString(9, id);
                
                pt.executeUpdate();
               
                JOptionPane.showMessageDialog(this, "Data Updated Sucessfully");
                
                
            }
            catch(SQLException ex){
             ex.getStackTrace();
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
                
            String id = custid.getText();
          
            
            try{
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/MyAirlineSystem",user,pass);
               
                
                pt = conn.prepareStatement("select *from Customers where custid = ?");
                
                pt.setString(1,id);
                
                ResultSet rs =pt.executeQuery();
                
                if(rs.next()==false)
                {
                    JOptionPane.showMessageDialog(this, "Customer Data Not Available");
                }
                else{
                    String firstname = rs.getString("firstname");
                    String lastname = rs.getString("lastname");
                    String aadhar = rs.getString("aadhar");
                    String passport = rs.getString("passport");
                    String address = rs.getString("address");
                    String dob = rs.getString("dob");
                    Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
                    
                    String gender = rs.getString("gender");
                    if(gender.equals("female"))
                    {
                        male.setSelected(false);
                        female.setSelected(true);
                    }
                    else
                    {
                         male.setSelected(true);
                        female.setSelected(false);
                    }
                    String contact = rs.getString("contact");
                    
                    firstnames.setText(firstname);
                    lastnames.setText(lastname);
                    aadhars.setText(aadhar);
                    passports.setText(passport);
                    addresss.setText(address);
                    contacts.setText(contact);
                    dobs.setDate(date);
                    
                }
                
                
               
                JOptionPane.showMessageDialog(this, "Data Fetched Sucessfully");
                
                
            }
            catch(SQLException ex){
             ex.getStackTrace();
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchCustomers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(SearchCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhars;
    private javax.swing.JTextArea addresss;
    private javax.swing.JTextField contacts;
    private javax.swing.JTextField custid;
    private com.toedter.calendar.JDateChooser dobs;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField firstnames;
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
    private javax.swing.JTextField lastnames;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField passports;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}