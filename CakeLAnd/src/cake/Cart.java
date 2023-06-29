
package cake;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Cart extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    PreparedStatement pst;
    String id_login = Login.getId_user();
    
    public Cart() {
        initComponents();
        Koneksi connect = new Koneksi();
        connect.config();
        con = connect.con;
        stat = connect.stm;
        table();
        text_id.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        qty = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        remove = new javax.swing.JButton();
        update = new javax.swing.JButton();
        checkout = new javax.swing.JButton();
        menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("CakeLAnd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Cake List");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Back to Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Quantity");

        remove.setBackground(new java.awt.Color(255, 204, 204));
        remove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remove.setForeground(new java.awt.Color(0, 0, 51));
        remove.setText("Remove from Cart");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 204, 204));
        update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        update.setForeground(new java.awt.Color(0, 0, 51));
        update.setText("Update Cake Order");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        checkout.setBackground(new java.awt.Color(255, 204, 204));
        checkout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        checkout.setForeground(new java.awt.Color(0, 0, 51));
        checkout.setText("Check Out");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        menu.setBackground(new java.awt.Color(255, 204, 204));
        menu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        menu.setForeground(new java.awt.Color(0, 0, 51));
        menu.setText("View All Menu");
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3)))
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(32, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(429, 429, 429)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(395, Short.MAX_VALUE)))
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
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static final String[] columns = {
        "Cake Name", "Cake Shape", "Cake Size", "Cake Price", "Quantity", ""
    };   
    
    private DefaultTableModel mod_tab = new DefaultTableModel(columns, 0);
    
    public void table(){
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setBackground(new Color(255,102,102));        
        try {
            sql = "SELECT CakeName, cakeShape, cakeSize, cakePrice, Quantity, cart.CakeID FROM `cart` JOIN cake ON cake.CakeID = cart.CakeID WHERE UserID='"+id_login+"'";
            rs = (ResultSet) stat.executeQuery(sql);
            while(rs.next()){
                mod_tab.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)});
            }
            table.setModel(mod_tab);
            table.getColumnModel().getColumn(5).setWidth(0);
            table.getColumnModel().getColumn(5).setMinWidth(0);
            table.getColumnModel().getColumn(5).setMaxWidth(0);             
        } catch (SQLException ex) {
            Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void clear_table(){
        for(int i = table.getRowCount() - 1; i >= 0; i--){
            mod_tab.removeRow(i);
        }
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        text_id.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        try {
            if(text_id.getText()==""){
                JOptionPane.showMessageDialog(null, "Select cake you want to remove!");
            }else{
                sql = "DELETE FROM cart WHERE CakeID='"+text_id.getText()+"'";
                pst = (PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Cake successfuly removed!");
                clear_table();
                table();
            }            
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_removeActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            if(text_id.getText()==""){
                JOptionPane.showMessageDialog(null, "Select cake you want to update!");
            }else{
                sql = "UPDATE cart SET Quantity=Quantity+'"+qty.getValue()+"' WHERE CakeID='"+text_id.getText()+"'";
                pst = (PreparedStatement) con.prepareStatement(sql);
                pst.execute(); 
                JOptionPane.showMessageDialog(null, "Cake successfuly update!");      
                clear_table();
                table();   
            }
                    
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_updateActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        if(table.getRowCount()>0){
            try {
                Checkout ck = new Checkout();
                ck.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ypur cart is empty");
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        Menu mn = new Menu();
        mn.setVisible(true);
    }//GEN-LAST:event_menuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Index mn = new Index();
        mn.setVisible(true);           
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkout;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton menu;
    private javax.swing.JSpinner qty;
    private javax.swing.JButton remove;
    private javax.swing.JTable table;
    private javax.swing.JTextField text_id;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
