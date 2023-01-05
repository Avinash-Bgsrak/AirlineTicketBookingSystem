/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package majorproject.Modules;

import java.sql.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author avinash
 */
public class BookTickets extends javax.swing.JInternalFrame {

    /**
     * Creates new form Tickets
     */
    DatabaseUserAndPassword obj = new DatabaseUserAndPassword();
    String user = obj.user;
    String pass = obj.pass;
    public BookTickets() {
        initComponents();
        autoincreament();
    }
    
    Connection con;
    PreparedStatement pt;
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
        public void autoincreament(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MyAirlineSystem",user,pass);

           Statement s = con.createStatement();
           ResultSet rs =s.executeQuery("select MAX(ticketno) from Tickets");
           
           rs.next();
           rs.getString("MAX(ticketno)");
           
           if(rs.getString("MAX(ticketno)")==null){
               
               txtticketno.setText("TN001");
           }
           else
           {
               long id = Long.parseLong(rs.getString("MAX(ticketno)").substring(2, rs.getString("MAX(ticketno)").length()));
               id++;
               txtticketno.setText("TN"+String.format("%03d", id));
           }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddCustomers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AddCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    }
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtsource = new javax.swing.JComboBox<>();
        txtdestination = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtflightno = new javax.swing.JTextField();
        txtflightname = new javax.swing.JTextField();
        txtdeparture = new javax.swing.JTextField();
        txtarrival = new javax.swing.JTextField();
        txtclass = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtseat = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        txtticketno = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txttotal = new javax.swing.JLabel();
        txtprice = new javax.swing.JLabel();
        bookbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtcustid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        searchcustbtn = new javax.swing.JButton();
        firstnames = new javax.swing.JLabel();
        lastnames = new javax.swing.JLabel();
        passports = new javax.swing.JLabel();

        setForeground(java.awt.Color.darkGray);
        setResizable(false);
        setPreferredSize(new java.awt.Dimension(800, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)), "Select Your Journey", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 13), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtsource.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ranchi", "Delhi ", "Mumbai", "Kolkata", "Hydrabad" }));
        txtsource.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsourceActionPerformed(evt);
            }
        });
        jPanel1.add(txtsource, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, -1));

        txtdestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi ", "Mumbai", "Kolkata", "Hydrabad", "Ranchi" }));
        jPanel1.add(txtdestination, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 190, -1));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("Source");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 153));
        jLabel3.setText("Destination");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 160, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 430, 140));

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Flight ID", "Flight Name", "Source", "Destination", "Arrival Time", "Departure Time", "Date", "Price"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 770, 80));

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)), "Ticket Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 13), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Flight No.");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Flight Name");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel8.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Class");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Departure");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel10.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Arrival");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("Seats");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));
        jPanel2.add(txtflightno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 150, -1));
        jPanel2.add(txtflightname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 150, -1));
        jPanel2.add(txtdeparture, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 150, -1));
        jPanel2.add(txtarrival, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, -1));

        txtclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Economy", "Business", "First Class", " " }));
        jPanel2.add(txtclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, -1));

        jLabel13.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Ticket No.");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 20));

        txtseat.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtseatStateChanged(evt);
            }
        });
        jPanel2.add(txtseat, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 150, -1));

        jLabel14.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Date");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        jPanel2.add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 150, -1));

        txtticketno.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        txtticketno.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(txtticketno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 60, 20));

        jLabel15.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Price/Ticket");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Total Price");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txttotal.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        txttotal.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 260, 150, -1));

        txtprice.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        txtprice.setForeground(new java.awt.Color(0, 153, 51));
        jPanel2.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 140, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 330, 310));

        bookbtn.setBackground(new java.awt.Color(102, 255, 204));
        bookbtn.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        bookbtn.setForeground(new java.awt.Color(204, 0, 0));
        bookbtn.setText("Book");
        bookbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookbtnActionPerformed(evt);
            }
        });
        jPanel3.add(bookbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 418, 90, -1));

        jButton3.setBackground(new java.awt.Color(102, 255, 204));
        jButton3.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 0, 0));
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 418, 92, -1));

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Liberation Sans", 1, 13), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Customer ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtcustid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcustidActionPerformed(evt);
            }
        });
        jPanel4.add(txtcustid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 13, 145, 30));

        jLabel12.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Full Name");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 90, 20));

        jLabel5.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Passport NO.");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        searchcustbtn.setBackground(new java.awt.Color(102, 255, 204));
        searchcustbtn.setFont(new java.awt.Font("Liberation Sans", 1, 13)); // NOI18N
        searchcustbtn.setForeground(new java.awt.Color(204, 0, 0));
        searchcustbtn.setText("Search Customer ");
        searchcustbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchcustbtnActionPerformed(evt);
            }
        });
        jPanel4.add(searchcustbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 160, 30));
        jPanel4.add(firstnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 90, -1));
        jPanel4.add(lastnames, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 70, -1));
        jPanel4.add(passports, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 150, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 430, 160));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtsourceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsourceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsourceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
            String source = txtsource.getSelectedItem().toString();
            String destination =txtdestination.getSelectedItem().toString();
        try {
            // TODO add your handling code here:
            
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MyAirlineSystem",user,pass);
            
            
            pt = con.prepareStatement("select *from Flights where source=? and destination=?");
            
            
            
            pt.setString(1, source);
            pt.setString(2, destination);
            
            ResultSet rs =pt.executeQuery();
            ResultSetMetaData rm = rs.getMetaData();
            
            int c;
            c =rm.getColumnCount();
            
            DefaultTableModel table  = (DefaultTableModel)jTable1.getModel();
            table.setRowCount(0);
            
            while(rs.next())
            {
                Vector vect = new Vector();
                for(int i=1;i<=c;i++)
                {
                    vect.add(rs.getString("flightid"));
                    vect.add(rs.getString("flightname"));
                    vect.add(rs.getString("source"));
                    vect.add(rs.getString("destination"));
                    vect.add(rs.getString("arrival"));
                    vect.add(rs.getString("departure"));
                    vect.add(rs.getString("date"));
                    vect.add(rs.getString("price"));
                }
                table.addRow(vect);
            }
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookTickets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(BookTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bookbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookbtnActionPerformed
         // TODO add your handling code here:
        
        String ticketno = txtticketno.getText();
        String flightno    = txtflightno.getText();
        String flightname = txtflightname.getText();
        String classs = txtclass.getSelectedItem().toString();
        String source  = txtsource.getSelectedItem().toString();
        String destination = txtdestination.getSelectedItem().toString();
        String arrival = txtarrival.getText();
        String departure = txtdeparture.getText();
       
        DateFormat da = new SimpleDateFormat("yyyy-MM-dd");
        String date = da.format(txtdate.getDate());
        
        String price = txtprice.getText();
        String seats = txtseat.getValue().toString();
        String custid = txtcustid.getText();
        
        String first = firstnames.getText();
        String last = lastnames.getText();

        

       

        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/MyAirlineSystem",user,pass);

            pt = con.prepareStatement("insert into Tickets (ticketno,flightno,flightname,class,source,destination,arrival,departure,date,price,seats,custid,firstname,lastname) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");

            pt.setString(1, ticketno);
            pt.setString(2, flightno);
            pt.setString(3, flightname);
            pt.setString(4, classs);
            pt.setString(5, source);
            pt.setString(6, destination);
            pt.setString(7, arrival);
            pt.setString(8, departure);
            pt.setString(9, date);
            pt.setString(10, price);
            pt.setString(11, seats);
            pt.setString(12, custid);
            pt.setString(13, first);
            pt.setString(14, last);
            
            

            pt.executeUpdate();

            JOptionPane.showMessageDialog(this, "Ticket Booked Sucessfully");

        }
        catch(SQLException ex){
            ex.getStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_bookbtnActionPerformed

    private void searchcustbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchcustbtnActionPerformed
        // TODO add your handling code here:
        
         String id = txtcustid.getText();
          
            
            try{
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/MyAirlineSystem",user,pass);
               
                
                pt = con.prepareStatement("select *from Customers where custid =?");
                
                pt.setString(1, id);
                
                ResultSet rs =pt.executeQuery();
                
                if(rs.next()==false)
                {
                    JOptionPane.showMessageDialog(this, "Customer Data Not Available");
                }
                else{
                    String firstname = rs.getString("firstname");
                    String lastname = rs.getString("lastname");
                    String passport = rs.getString("passport");
  
                    firstnames.setText(firstname);
                    lastnames.setText(lastname);
                    passports.setText(passport);
                        
                }
                
               
                
                
            }
            catch(SQLException ex){
             ex.getStackTrace();
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookTickets.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_searchcustbtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel table  = (DefaultTableModel)jTable1.getModel();
        
        int index = jTable1.getSelectedRow();
        
        txtflightno.setText(table.getValueAt(index, 0).toString());
        txtflightname.setText(table.getValueAt(index, 1).toString());
        txtdeparture.setText(table.getValueAt(index, 5).toString());
        txtarrival.setText(table.getValueAt(index, 4).toString());
        txtprice.setText(table.getValueAt(index, 7).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtseatStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtseatStateChanged
        // TODO add your handling code here:
        
        int price = Integer.parseInt(txtprice.getText());
        int quantity = Integer.parseInt(txtseat.getValue().toString());
        
        int total = price*quantity;
        
        txttotal.setText(String.valueOf(total));
        
        
    }//GEN-LAST:event_txtseatStateChanged

    private void txtcustidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcustidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcustidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookbtn;
    private javax.swing.JLabel firstnames;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lastnames;
    private javax.swing.JLabel passports;
    private javax.swing.JButton searchcustbtn;
    private javax.swing.JTextField txtarrival;
    private javax.swing.JComboBox<String> txtclass;
    private javax.swing.JTextField txtcustid;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtdeparture;
    private javax.swing.JComboBox<String> txtdestination;
    private javax.swing.JTextField txtflightname;
    private javax.swing.JTextField txtflightno;
    private javax.swing.JLabel txtprice;
    private javax.swing.JSpinner txtseat;
    private javax.swing.JComboBox<String> txtsource;
    private javax.swing.JLabel txtticketno;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables
}