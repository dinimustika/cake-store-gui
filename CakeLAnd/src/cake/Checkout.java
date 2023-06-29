package cake;

import com.mysql.jdbc.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class Checkout extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    PreparedStatement pst;
    int total_belanja;
    String trans_ids = "";
    String id_login = Login.getId_user();
    
    public Checkout() throws SQLException {
        initComponents();
        Koneksi connect = new Koneksi();
        connect.config();
        con = connect.con;
        stat = connect.stm;
        load_cart();
        ids();
        total();
        text_id.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        pick_up = new javax.swing.JTextField();
        checkout = new javax.swing.JButton();
        add_cart1 = new javax.swing.JButton();
        text_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("CakeLAnd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Cake List");

        table.setBackground(new java.awt.Color(255, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cake Name", "Cake Shape", "Cake Size", "Cake Price", "Quantity"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Total");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Pick Up Date");

        total.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 51));

        checkout.setBackground(new java.awt.Color(255, 204, 204));
        checkout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkout.setForeground(new java.awt.Color(0, 0, 51));
        checkout.setText("Check Out");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        add_cart1.setBackground(new java.awt.Color(255, 204, 204));
        add_cart1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add_cart1.setForeground(new java.awt.Color(0, 0, 51));
        add_cart1.setText("Back to Main Menu");
        add_cart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cart1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(add_cart1)
                        .addGap(49, 49, 49))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(429, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pick_up, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addGap(311, 311, 311))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(pick_up, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add_cart1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

    }//GEN-LAST:event_tableMouseClicked

    public static final String[] columns = {
        "Cake Name", "Cake Shape", "Cake Size", "Cake Price", "Quantity", ""
    };
    
    private DefaultTableModel mod_tab = new DefaultTableModel(columns, 0);
    
    public void load_cart(){
        System.out.println(id_login);
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setBackground(new Color(255,102,102));        
        try {
            sql = "SELECT CakeName, cakeShape, cakeSize, cakePrice, Quantity, cart.CakeID FROM `cart` JOIN cake ON cake.CakeID = cart.CakeID";
            rs = (ResultSet) stat.executeQuery(sql);
            while(rs.next()){
                mod_tab.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
            }
            table.setModel(mod_tab);
//            table.getColumnModel().getColumn(5).setWidth(0);
//            table.getColumnModel().getColumn(5).setMinWidth(0);
//            table.getColumnModel().getColumn(5).setMaxWidth(0); 
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void total(){
        int price = 0, qty = 0, total_s = 0;
        try {
            sql = "SELECT cakePrice, Quantity FROM `cart` JOIN cake ON cake.CakeID = cart.CakeID";
            rs = (ResultSet) stat.executeQuery(sql);
            while(rs.next()){
                price = Integer.parseInt(rs.getString("cakePrice").toString());
                qty = Integer.parseInt(rs.getString("Quantity").toString());                
            }
            table.setModel(mod_tab);
            for (int i=0; i<table.getRowCount(); i++) 
            {
                total_belanja = Integer.parseInt(table.getValueAt(i, 3).toString())*Integer.parseInt(table.getValueAt(i, 4).toString());                
                total_s += total_belanja;
            }            
            System.out.println(total_s);
            total.setText("Rp "+String.valueOf(total_s));
        } catch (SQLException ex) {
            Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ids() throws SQLException{        
        int trans_id;
        rs=(ResultSet) stat.executeQuery("SELECT MAX(REGEXP_SUBSTR(TransactionID,'[0-9]+')) as trans_id FROM transactionheader");        
        if(rs.next()){
            if(rs.getString("trans_id") == null){
                trans_id = 0;
                for (int num = trans_id+1; num < trans_id+2; num++) {
                    trans_ids = String.format("%04d", num);                        
                }
//                System.out.println(trans_ids);
            }else{
                trans_id = Integer.valueOf(rs.getString("trans_id"));
                for (int num = trans_id+1; num < trans_id+2; num++) {
                    trans_ids = String.format("%04d", num);                        
                }
//                System.out.println(trans_ids);
            }
            text_id.setText("T"+trans_ids);
        }        
    }
    
    LocalDate myObj = LocalDate.now(); 
    
    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        int qty;
        String cake_ids;
        try {
            sql = "INSERT INTO `transactionheader`(`TransactionID`, `UserID`, `TransactionDate`, `PickUpDate`) VALUES ('"+text_id.getText()+"','"+id_login+"','"+myObj+"','"+pick_up.getText()+"')";
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.execute();
            for(int i=0; i<table.getRowCount();i++){
                qty = Integer.parseInt(table.getValueAt(i, 4).toString());
                cake_ids = table.getValueAt(i, 5).toString();
                String sqls = "INSERT INTO `transactiondetail`(`TransactionID`, `CakeID`, `Quantity`) VALUES ('"+text_id.getText()+"','"+cake_ids+"','"+qty+"')";
                pst = (PreparedStatement) con.prepareStatement(sqls);
                pst.execute();
                String sqll = "DELETE FROM `cart` WHERE CakeID='"+cake_ids+"'";
                pst = (PreparedStatement) con.prepareStatement(sqll);
                pst.execute();
            }
            JOptionPane.showMessageDialog(null, "Operation successful!");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void add_cart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cart1ActionPerformed
        Index mn = new Index();
        mn.setVisible(true);           
        this.dispose();
    }//GEN-LAST:event_add_cart1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Checkout().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_cart1;
    private javax.swing.JButton checkout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField pick_up;
    private javax.swing.JTable table;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
