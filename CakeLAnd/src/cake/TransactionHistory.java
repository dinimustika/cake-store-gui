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

public class TransactionHistory extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    PreparedStatement pst;
    String id_login = Login.getId_user();
    int total_belanja;
    
    public TransactionHistory() {
        initComponents();
        Koneksi connect = new Koneksi();
        connect.config();
        con = connect.con;
        stat = connect.stm;
        table();
        text_id.setEditable(false);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tables_s = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        text_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Transaction History");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 51, 0));
        jLabel2.setText("CakeLAnd");

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
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Transaction ID", "Transaction Date", "Pick Up Date"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        tables_s.setBackground(new java.awt.Color(255, 204, 204));
        tables_s.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cake Name", "Cake Size", "Cake Shape", "Cake Price", "Quantity", "SubTotal"
            }
        ));
        jScrollPane3.setViewportView(tables_s);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("Selected ID");

        text_id.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Total");

        total.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(40, 40, 40)
                            .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(40, 40, 40)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)))
                .addGap(190, 190, 190))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(33, 33, 33))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
//        clear_table();        
        text_id.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        table_s();  
        total();
        clear_table();
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Index mn = new Index();
        mn.setVisible(true);           
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void total(){
        int price = 0, qty = 0, total_s = 0;        
        for (int i=0; i<tables_s.getRowCount(); i++) 
        {
            total_belanja = Integer.parseInt(tables_s.getValueAt(i, 3).toString())*Integer.parseInt(tables_s.getValueAt(i, 4).toString());                
            total_s += total_belanja;
        }
        total.setText("Rp "+String.valueOf(total_s));
    }
    
    public static final String[] columns_s = {
        "Cake Name", "Cake Size", "Cake Shape", "Cake Price", "Quantity", "SubTotal"
    };
    
    private DefaultTableModel mod_tabs = new DefaultTableModel(columns_s, 0);
    
    public void clear_table(){
        for(int i = 0; i < tables_s.getRowCount(); i--){
            mod_tabs.removeRow(i);
        }                
    }
    
    public void table_s(){
        JTableHeader tableHeader = tables_s.getTableHeader();
        tableHeader.setBackground(new Color(255,102,102)); 
        int price = 0, qty = 0, total_s = 0;         
        try {
//             WHERE UserID='"+id_login+"'
            sql = "SELECT cake.CakeName, cake.CakeSize, cake.CakeShape, cake.CakePrice, Quantity FROM `transactiondetail` JOIN cake ON cake.CakeID = transactiondetail.CakeID JOIN transactionheader ON transactionheader.TransactionID = transactiondetail.TransactionID JOIN user ON user.UserID = transactionheader.UserID WHERE transactiondetail.`TransactionID`='"+text_id.getText()+"' AND user.UserID='"+id_login+"'";
            rs = (ResultSet) stat.executeQuery(sql);
            while(rs.next()){
                mod_tabs.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5), Integer.parseInt(rs.getString(4))*Integer.parseInt(rs.getString(5))});
            }
            tables_s.setModel(mod_tabs);
            total();            
        } catch (SQLException ex) {
            Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static final String[] columns = {
        "Transaction ID", "Transaction Date", "Pick Up Date"
    };
    
    private DefaultTableModel mod_tab = new DefaultTableModel(columns, 0);
    
    public void table(){
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setBackground(new Color(255,102,102));        
        try {
//             WHERE UserID='"+id_login+"'
            sql = "SELECT TransactionID, TransactionDate, PickUpDate FROM transactionheader";
            rs = (ResultSet) stat.executeQuery(sql);
            while(rs.next()){
                mod_tab.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
            table.setModel(mod_tab);
        } catch (SQLException ex) {
            Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionHistory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTable tables_s;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
