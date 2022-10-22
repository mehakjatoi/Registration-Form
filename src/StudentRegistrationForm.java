//import javax.swing.*;
//import java.awt.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import java.io.IOException;
import java.io.FileWriter;

public class StudentRegistrationForm extends javax.swing.JFrame {

     JSONObject js = new JSONObject();
     Printinfo f2 = new Printinfo();
     Frame3 f3=new Frame3();
      
   
    public StudentRegistrationForm() {
        initComponents();
        setTitle("Student Registration Form");
        setBounds(250, 50, 565, 600);
        f2.getContentPane().setBackground(Color.red);
        f2.setBounds(250, 50, 565, 600);
        f3.getContentPane().setBackground(Color.orange);
        f3.setBounds(250, 50, 565, 600);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        labelCountry = new javax.swing.JLabel();
        Countryitem = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        Matric = new javax.swing.JCheckBox();
        SectionTb = new javax.swing.JTextField();
        labelQualification = new javax.swing.JLabel();
        intermediate = new javax.swing.JCheckBox();
        Graduate = new javax.swing.JCheckBox();
        pgraduate = new javax.swing.JCheckBox();
        labelAddress = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelBatch = new javax.swing.JLabel();
        labelSection = new javax.swing.JLabel();
        RollnoTb = new javax.swing.JTextField();
        BatchTb = new javax.swing.JTextField();
        NameTb = new javax.swing.JTextField();
        labelRollno = new javax.swing.JLabel();
        labelGender = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AddressTa = new javax.swing.JTextArea();
        storedb = new javax.swing.JButton();
        DisplayDb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        labelCountry.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelCountry.setText("Country");

        Countryitem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Countryitem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pakistan", "South Korea", "India", "China" }));
        Countryitem.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                CountryitemHierarchyChanged(evt);
            }
        });
        Countryitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CountryitemActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        male.setText("Male");

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        female.setText("Female");

        buttonGroup2.add(Matric);
        Matric.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Matric.setText("Matric");
        Matric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MatricActionPerformed(evt);
            }
        });

        labelQualification.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelQualification.setText("Qualification");

        buttonGroup2.add(intermediate);
        intermediate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        intermediate.setText("Intermediate");

        buttonGroup2.add(Graduate);
        Graduate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Graduate.setText("Graduate");

        buttonGroup2.add(pgraduate);
        pgraduate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pgraduate.setText("Post Graduate");
        pgraduate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pgraduateActionPerformed(evt);
            }
        });

        labelAddress.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelAddress.setText("Address");

        labelName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelName.setText("Name");

        labelBatch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelBatch.setText("Batch");

        labelSection.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelSection.setText("Section");

        BatchTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatchTbActionPerformed(evt);
            }
        });

        labelRollno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelRollno.setText("Roll number");

        labelGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelGender.setText("Gender");

        AddressTa.setColumns(20);
        AddressTa.setRows(5);
        jScrollPane2.setViewportView(AddressTa);

        storedb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        storedb.setText("Store in Database");
        storedb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                storedbMouseClicked(evt);
            }
        });
        storedb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storedbActionPerformed(evt);
            }
        });

        DisplayDb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DisplayDb.setText("Display from Database");
        DisplayDb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DisplayDbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SectionTb, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BatchTb, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(female, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Matric, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Graduate, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Countryitem, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)))
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelSection, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelQualification)
                                    .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(119, 119, 119)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(intermediate)
                                    .addComponent(pgraduate)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(storedb, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCountry, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(DisplayDb))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RollnoTb, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(211, Short.MAX_VALUE)
                    .addComponent(NameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(79, 79, 79)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(labelName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RollnoTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BatchTb, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSection, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SectionTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGender)
                    .addComponent(female)
                    .addComponent(male))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQualification, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Matric)
                    .addComponent(intermediate))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Graduate)
                    .addComponent(pgraduate))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Countryitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(storedb)
                            .addComponent(DisplayDb)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(NameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(484, Short.MAX_VALUE)))
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
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet Rs=null,Rs1=null;
    Statement St=null,St1=null;
    private void CountryitemHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_CountryitemHierarchyChanged
       
    }//GEN-LAST:event_CountryitemHierarchyChanged

    private void CountryitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CountryitemActionPerformed
       
    }//GEN-LAST:event_CountryitemActionPerformed

    private void MatricActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MatricActionPerformed
      
    }//GEN-LAST:event_MatricActionPerformed

    private void BatchTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatchTbActionPerformed
        
    }//GEN-LAST:event_BatchTbActionPerformed

    private void pgraduateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pgraduateActionPerformed
      
    }//GEN-LAST:event_pgraduateActionPerformed
   
    //Save Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        if (RollnoTb.getText().length() == 0 || BatchTb.getText().length() == 0 || NameTb.getText().length() == 0 || SectionTb.getText().length() == 0) {

            JOptionPane.showMessageDialog(null, "Complete the Form");
        }
        //Labels
       
        f2.Name.setText(labelName.getText());
        f2.rollno.setText(labelRollno.getText());
        f2.section.setText(labelSection.getText());
        f2.batch.setText(labelBatch.getText());
        f2.Gender.setText(labelGender.getText());
        f2.qualification.setText(labelQualification.getText());
        f2.address.setText(labelAddress.getText());
        f2.country.setText(labelCountry.getText());
         
        //Textfields
        
         f2.name2.setText(NameTb.getText());
         f2.rollno2.setText(RollnoTb.getText());
         f2.section2.setText(SectionTb.getText());
         f2.batch2.setText(BatchTb.getText());
         if(female.isSelected()){
         f2.gender2.setText(female.getText());
         }else if(male.isSelected()){
         f2.gender2.setText(male.getText());
         }
         if(Matric.isSelected()){
         f2.qualification2.setText(Matric.getText());
         }else if(intermediate.isSelected()){
         f2.qualification2.setText(intermediate.getText());
         }else if(Graduate.isSelected()){
         f2.qualification2.setText(Graduate.getText());
         }else if(pgraduate.isSelected()){
         f2.qualification2.setText(pgraduate.getText());
         }
         f2.address2.setText(AddressTa.getText());
         f2.country2.setText(Countryitem.getSelectedItem().toString());
         
         js.put("1", RollnoTb.getText());
         js.put("2", BatchTb.getText());
         js.put("3", NameTb.getText());
         js.put("4", SectionTb.getText());
         js.put("5", labelAddress.getText());
         js.put("6", labelGender.getText());
         js.put("7", labelQualification.getText());
         js.put("8", labelCountry.getText());
        
         try {
           
            FileWriter file1 = new FileWriter("E:/2nd semester/Jsonf.json");
            file1.write(js.toJSONString());
            file1.close();
            
            
         } catch (IOException e) {
           System.out.print("Error occured"+e.getMessage());
         } 
         System.out.println("JSON file created: " );

        
    }//GEN-LAST:event_jButton1ActionPerformed
     
    //Clear Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);       
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //Print Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (RollnoTb.getText().length() == 0 || BatchTb.getText().length() == 0 || NameTb.getText().length() == 0 || SectionTb.getText().length() == 0) {

            JOptionPane.showMessageDialog(null, " Complete the Form");
            f2.setVisible(false);    
        }else{
            setVisible(false);
            f2.setVisible(true);
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void storedbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storedbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storedbActionPerformed
//Store In database
    private void storedbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_storedbMouseClicked
         
       if(NameTb.getText().isEmpty() || RollnoTb.getText().isEmpty() || SectionTb.getText().isEmpty() ||BatchTb.getText().isEmpty()){
          JOptionPane.showMessageDialog(this,"Complete the details");
      }else{
      try{
          
          con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregisterform","root","");
          PreparedStatement Add =con.prepareStatement("insert into studentdetails  values(?,?,?,?,?,?,?,?)");          Add.setString(1,NameTb.getText() );
          Add.setString(1, NameTb.getText());
          Add.setString(2, RollnoTb.getText());
          Add.setString(3, BatchTb.getText());
          Add.setString(4,SectionTb.getText());
          if(female.isSelected()){
          Add.setString(5, female.getText());
          }else if(male.isSelected()){
          Add.setString(5, male.getText());
          }
          if(Matric.isSelected()){
          Add.setString(6, Matric.getText());
          }else if(intermediate.isSelected()){
          Add.setString(6, intermediate.getText());
          }else if(Graduate.isSelected()){
          Add.setString(6, Graduate.getText());
          }else if(pgraduate.isSelected()){
          Add.setString(6, pgraduate.getText());
          }
          Add.setString(7, AddressTa.getText());
          Add.setString(8, Countryitem.getSelectedItem().toString());
          int row=Add.executeUpdate();
          JOptionPane.showMessageDialog(this,"Student Added");
          con.close();
         
    }catch(Exception e)
    {
          JOptionPane.showMessageDialog(this,e);
    }                                    
    }
    
    }//GEN-LAST:event_storedbMouseClicked
    //Display Data from database
    private void DisplayDbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DisplayDbMouseClicked
    try{
      con= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentregisterform","root","");
      St=con.createStatement();
      Rs = St.executeQuery("Select * from studentdetails");
      while(Rs.next()){
      f3.NameTb3.setText(Rs.getString(5));
      f3.RollnoTb3.setText(Rs.getString(2));
      f3.BatchTb3.setText(Rs.getString(3));
      f3.SectionTb3.setText(Rs.getString(4));
      f3.GenderTb3.setText(Rs.getString(1));
      f3.QualificationTb3.setText(Rs.getString(6));
      f3.AddressTb.setText(Rs.getString(7));
      f3.CountryTb.setText(Rs.getString(8));
      
     }//System.out.println(Rs.getString(1));
      f3.setVisible(true);
    }catch(Exception e){
    JOptionPane.showMessageDialog(this,e);
   
    }
    
    }//GEN-LAST:event_DisplayDbMouseClicked

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new StudentRegistrationForm().setVisible(true);
        }
        });
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AddressTa;
    private javax.swing.JTextField BatchTb;
    private javax.swing.JComboBox<String> Countryitem;
    private javax.swing.JButton DisplayDb;
    private javax.swing.JCheckBox Graduate;
    private javax.swing.JCheckBox Matric;
    private javax.swing.JTextField NameTb;
    private javax.swing.JTextField RollnoTb;
    private javax.swing.JTextField SectionTb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton female;
    private javax.swing.JCheckBox intermediate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelBatch;
    private javax.swing.JLabel labelCountry;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelQualification;
    private javax.swing.JLabel labelRollno;
    private javax.swing.JLabel labelSection;
    private javax.swing.JRadioButton male;
    private javax.swing.JCheckBox pgraduate;
    private javax.swing.JButton storedb;
    // End of variables declaration//GEN-END:variables

}
