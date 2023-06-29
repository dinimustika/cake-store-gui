package cake;

import com.mysql.jdbc.*;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;

public class Menu extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    PreparedStatement pst;
    String id_login = Login.getId_user();
    String id_kue;
        
    public Menu() {
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
        qty = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        add_cart = new javax.swing.JButton();
        view_cart = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        text_id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CakeLAnd");
        setBackground(new java.awt.Color(0, 0, 51));

        jScrollPane1.setBackground(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Quantity");

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

        add_cart.setBackground(new java.awt.Color(255, 204, 204));
        add_cart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add_cart.setForeground(new java.awt.Color(0, 0, 51));
        add_cart.setText("Add to Cart");
        add_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cartActionPerformed(evt);
            }
        });

        view_cart.setBackground(new java.awt.Color(255, 204, 204));
        view_cart.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        view_cart.setForeground(new java.awt.Color(0, 0, 51));
        view_cart.setText("View Cart");
        view_cart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view_cartActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(255, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cake Name", "Cake Price", "Cake Shape", "Cake Size"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(view_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel3)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1)
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(add_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(view_cart, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        id_kue = table.getValueAt(table.getSelectedRow(), 4).toString();
//        id_kue = String.valueOf(table.getColumnCount());
        text_id.setText(id_kue);
    }//GEN-LAST:event_tableMouseClicked

    private void view_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_cartActionPerformed
        Cart ct = new Cart();
        ct.setVisible(true);
    }//GEN-LAST:event_view_cartActionPerformed

    private void add_cartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cartActionPerformed
        try {
            String ssql = "SELECT CakeID FROM cart WHERE CakeID='"+text_id.getText()+"'";
            rs = (ResultSet) stat.executeQuery(ssql);
            if(rs.next()){
                if(rs.getString("CakeID").toString().equals(text_id.getText())){
                   JOptionPane.showMessageDialog(null, "Kue telah ditambah sebelumnya"); 
                }               
            }else{
                sql = "INSERT INTO `cart`(`UserID`, `CakeID`, `Quantity`) VALUES ('"+id_login+"','"+text_id.getText()+"','"+qty.getValue()+"')";
                pst = (PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                text_id.setText("");
                 JOptionPane.showMessageDialog(null, "Successfully added!");
            }             
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_cartActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Index mn = new Index();
        mn.setVisible(true);           
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static final String[] columns = {
        "Cake Name", "Cake Price", "Cake Shape", "Cake Size", ""
    };
    
    private DefaultTableModel mod_tab = new DefaultTableModel(columns, 0);
    
    public void table(){
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setBackground(new Color(255,102,102));        
        try {
            sql = "SELECT CakeName, CakePrice, CakeShape, CakeSize, CakeID FROM cake";
            rs = (ResultSet) stat.executeQuery(sql);
            while(rs.next()){
                mod_tab.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }
            table.setModel(mod_tab);
            table.getColumnModel().getColumn(4).setWidth(0);
            table.getColumnModel().getColumn(4).setMinWidth(0);
            table.getColumnModel().getColumn(4).setMaxWidth(0); 
        } catch (SQLException ex) {
            Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_cart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner qty;
    private javax.swing.JTable table;
    private javax.swing.JTextField text_id;
    private javax.swing.JButton view_cart;
    // End of variables declaration//GEN-END:variables
}
