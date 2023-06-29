package cake;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    PreparedStatement pst;
    String id_user, trans_ids;
    
    public Register() {
        initComponents();
        Koneksi connect = new Koneksi();
        connect.config();
        con = connect.con;
        stat = connect.stm;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CakeLAnd");
        setPreferredSize(new java.awt.Dimension(580, 600));

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
        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        female.setForeground(new java.awt.Color(153, 153, 153));
        female.setText("Female");
        female.setName("female"); // NOI18N

        male.setBackground(new java.awt.Color(255, 153, 153));
        buttonGroup1.add(male);
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
        jLabel11.setText("Password");

        password.setName("password"); // NOI18N

        register.setBackground(new java.awt.Color(255, 204, 204));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(0, 0, 51));
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addGap(109, 109, 109)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel11)
                .addGap(100, 100, 100)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel10))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel11))
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void id_users(){
        int trans_id;
        try {
            rs=(ResultSet) stat.executeQuery("SELECT MAX(REGEXP_SUBSTR(UserID,'[0-9]+')) as id_user FROM user");
            if(rs.next()){
                if(rs.getString("id_user")==null){
                    trans_id = 0;
                    for (int num = trans_id+1; num < trans_id+2; num++) {
                        trans_ids = String.format("%03d", num);
                        id_user = "US"+trans_ids;
                    }
                }else{
                    trans_id = Integer.valueOf(rs.getString("id_user"));
                    for (int num = trans_id+1; num < trans_id+2; num++) {
                        trans_ids = String.format("%03d", num);
                        id_user = "US"+trans_ids;
                    }
                }                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    boolean usernames, phones, addresss, check_emails = false;
//    Pattern passwords = Pattern.compile("^[a-zA-Z0-9]*$");
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
//        if(passwords.matcher(password.getText()).find() == false){
//            passwordd = false;
//        }
    }
    
    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        check();    
        id_users();
        Login log = new Login();
        if(usernames && phones && addresss && check_emails){
            try {
                String jenis_kl = null, tgl_lahir;
                if(male.isSelected()){
                    jenis_kl = "Male";
                }else if(female.isSelected()){
                    jenis_kl = "Female";
                }   tgl_lahir = year.getText()+"-"+month.getText()+"-"+day.getText();
//                Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(tgl_lahir);
                sql = "INSERT INTO `user`(`UserID`, `Username`, `UserEmail`, `UserPassword`, `UserGender`, `UserDOB`, `UserPhoneNumber`, `UserAddress`, `UserRole`) VALUES ('"+id_user+"','"+username.getText()+"','"+email.getText()+"','"+password.getText()+"','"+jenis_kl+"','"+tgl_lahir+"','"+phone.getText()+"','"+address.getText()+"','Customer')";
                pst = (PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                System.out.println(id_user);
                JOptionPane.showMessageDialog(null, "Successfully Registered!"); 
                log.setVisible(true);
                this.dispose();
            } 
//            catch (ParseException ex) {
//                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
//            }
            catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println(usernames);
            System.out.println(phones);
//            System.out.println(passwordd);
            System.out.println(addresss);
            System.out.println(check_emails);
        }
    }//GEN-LAST:event_registerActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField day;
    private javax.swing.JTextField email;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField month;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JButton register;
    private javax.swing.JTextField username;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
