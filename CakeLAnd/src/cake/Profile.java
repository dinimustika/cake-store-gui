package cake;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Profile extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    PreparedStatement pst;
    String id_login = Login.getId_user();
    
    public Profile() {
        initComponents();
        Koneksi connect = new Koneksi();
        connect.config();
        con = connect.con;
        stat = connect.stm;
        String id_user, trans_ids;
        profile_chek();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        password1 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        password2 = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Register");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("CakeLAnd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Username");

        username.setName("username"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Email");

        email.setName("email"); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Gender");

        female.setBackground(new java.awt.Color(255, 153, 153));
        female.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        female.setForeground(new java.awt.Color(153, 153, 153));
        female.setText("Female");
        female.setName("female"); // NOI18N

        male.setBackground(new java.awt.Color(255, 153, 153));
        male.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        male.setForeground(new java.awt.Color(153, 153, 153));
        male.setText("Male");
        male.setName("male"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Date of Birth");

        day.setName("day"); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("-");

        month.setName("month"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("-");

        year.setName("year"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("Phone");

        phone.setName("phone"); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 51));
        jLabel10.setText("Address");

        address.setColumns(20);
        address.setRows(5);
        address.setName("address"); // NOI18N
        jScrollPane2.setViewportView(address);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 51));
        jLabel11.setText("Old Password");

        password.setName("password"); // NOI18N

        register.setBackground(new java.awt.Color(255, 204, 204));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(0, 0, 51));
        register.setText("Save Change");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        password1.setName("password"); // NOI18N

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 51));
        jLabel12.setText("New Password");

        password2.setName("password"); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("Confirm New Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(99, 99, 99)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(131, 131, 131)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel5)
                        .addGap(117, 117, 117)
                        .addComponent(male)
                        .addGap(74, 74, 74)
                        .addComponent(female))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel6)
                        .addGap(80, 80, 80)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel7)
                        .addGap(4, 4, 4)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(123, 123, 123)
                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3))
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4))
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6))
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7))
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8))
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel9))
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(25, 25, 25)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    boolean usernames, phones, addresss, check_emails, passwordd = false;
    Pattern passwords = Pattern.compile("^[a-zA-Z0-9]*$");
    public void check(){
        String address_end = " Street$";
        if(username.getText().length() >= 5 && username.getText().length() <= 15){
            usernames = true;
        }
        if(phone.getText().length()>=10 && phone.getText().length()<=12){
            phones = true;
        }
        addresss = Pattern.compile(address_end).matcher(address.getText()).find();
        String regexs = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+.[A-Za-z0-9.-]+$";
        Pattern pattern = Pattern.compile(regexs);               
        Matcher matcher = pattern.matcher(email.getText());
        if(!matcher.matches()){
            JOptionPane.showMessageDialog(null, "Format email salah");
        }else{
            check_emails = true;
        }        
        if(passwords.matcher(password1.getText()).find() == true){
            passwordd = true;
        }
    }
    
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        try {
            check();
            Login log = new Login();
            sql = "SELECT UserPassword FROM user WHERE UserID = '"+id_login+"'";
            rs = (ResultSet) stat.executeQuery(sql);
            if(rs.next()){
                if(password.getText().equals(rs.getString("UserPassword"))){
                    
                }
            }
            if(usernames && phones && addresss && check_emails){
                try {
                    String jenis_kl = null, tgl_lahir;
                    if(male.isSelected()){
                        jenis_kl = "Male";
                    }else if(female.isSelected()){
                        jenis_kl = "Female";
                    }
                    tgl_lahir = year.getText()+"-"+month.getText()+"-"+day.getText();
                    //                Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(tgl_lahir);
                    sql = "UPDATE user SET Username='"+username.getText()+"',UserEmail='"+email.getText()+"',UserGender='"+jenis_kl+"',UserDOB='"+tgl_lahir+"',UserPhoneNumber='"+phone.getText()+"',UserAddress='"+address.getText()+"' WHERE UserID='"+id_login+"'";
                    pst = (PreparedStatement) con.prepareStatement(sql);
                    pst.execute();
                    //                System.out.println(id_user);
                    JOptionPane.showMessageDialog(null, "Successfully Update!");
                    log.setVisible(true);
                    this.dispose();
                }
                //            catch (ParseException ex) {
                //                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                //            }
                catch (SQLException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }                
            }  
                else{
                    System.out.println(usernames);
                    System.out.println(phones);
                    //            System.out.println(passwordd);
                    System.out.println(addresss);
                    System.out.println(check_emails);
                }
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerActionPerformed

    public void profile_chek(){
        try {
            sql = "SELECT * FROM user WHERE UserID ='"+id_login+"'";
            rs = (ResultSet) stat.executeQuery(sql);
            while(rs.next()){
                username.setText(rs.getString("Username"));
                email.setText(rs.getString("UserEmail"));
                phone.setText(rs.getString("UserPhoneNumber"));
                address.setText(rs.getString("UserAddress"));
                if(rs.getString("UserGender").equals("Male")){
                    male.setSelected(true);
                }
                if(rs.getString("UserGender").equals("Female")){
                    female.setSelected(true);
                }
                LocalDate currentDate = LocalDate.parse(rs.getString("UserDob"));
                // Get day from date
                int days = currentDate.getDayOfMonth();

                // Get month from date
                int months = currentDate.getMonthValue();

                // Get year from date
                int years = currentDate.getYear();
                day.setText(String.valueOf(days));
                month.setText(String.valueOf(months));
                year.setText(String.valueOf(years));
//                password.setText(rs.getString("UserPasswor"));


            }
        } catch (SQLException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JTextField day;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField month;
    private javax.swing.JPasswordField password;
    private javax.swing.JPasswordField password1;
    private javax.swing.JPasswordField password2;
    private javax.swing.JTextField phone;
    private javax.swing.JButton register;
    private javax.swing.JTextField username;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
