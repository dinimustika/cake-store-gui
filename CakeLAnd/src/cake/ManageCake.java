
package cake;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class ManageCake extends javax.swing.JFrame {

    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    PreparedStatement pst;
    String cake_id, shapes, sizes;
    
    public ManageCake() throws SQLException {
        initComponents();
        Koneksi connect = new Koneksi();
        connect.config();
        con = connect.con;
        stat = connect.stm;   
        text_id.setVisible(false);
        text_id1.setVisible(false);
        load_table();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane2 = new java.awt.ScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        shape = new javax.swing.JComboBox<>();
        oval_sz = new javax.swing.JComboBox<>();
        rectangle_sz = new javax.swing.JComboBox<>();
        remove_cake = new javax.swing.JButton();
        add_cake = new javax.swing.JButton();
        text_id = new javax.swing.JTextField();
        text_id1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CakeLAnd");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        table.setBackground(new java.awt.Color(255, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cake ID", "Cake Name", "Cake Price", "Cake Shape", "Cake Size"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 51, 0));
        jLabel1.setText("CakeLAnd");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Cake List");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 51));
        jButton1.setText("Back to Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Cake Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Cake Price");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Shape");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Rectangle Size");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("Oval Size");

        name.setBackground(new java.awt.Color(255, 204, 204));

        price.setBackground(new java.awt.Color(255, 204, 204));

        shape.setBackground(new java.awt.Color(255, 204, 204));
        shape.setForeground(new java.awt.Color(0, 0, 51));
        shape.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Bentuk", "Oval", "Rectangle" }));
        shape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeActionPerformed(evt);
            }
        });

        oval_sz.setBackground(new java.awt.Color(255, 204, 204));
        oval_sz.setForeground(new java.awt.Color(0, 0, 51));
        oval_sz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "15 cm", "20 cm", "25 cm" }));
        oval_sz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oval_szActionPerformed(evt);
            }
        });

        rectangle_sz.setBackground(new java.awt.Color(255, 204, 204));
        rectangle_sz.setForeground(new java.awt.Color(0, 0, 51));
        rectangle_sz.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10 x 10 cm", "20 x 20 cm", "30 x 30 cm" }));
        rectangle_sz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rectangle_szActionPerformed(evt);
            }
        });

        remove_cake.setBackground(new java.awt.Color(255, 204, 204));
        remove_cake.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        remove_cake.setForeground(new java.awt.Color(0, 0, 51));
        remove_cake.setText("Remove Cake");
        remove_cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_cakeActionPerformed(evt);
            }
        });

        add_cake.setBackground(new java.awt.Color(255, 204, 204));
        add_cake.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add_cake.setForeground(new java.awt.Color(0, 0, 51));
        add_cake.setText("Add Cake");
        add_cake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_cakeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(227, 227, 227)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6))
                            .addGap(65, 65, 65)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(shape, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(oval_sz, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(rectangle_sz, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(remove_cake, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(add_cake, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 37, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(text_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel4)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(shape, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(oval_sz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(rectangle_sz, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(remove_cake, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(add_cake, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(text_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(text_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        scrollPane2.add(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    public void clear(){
        text_id.setText("");
        text_id1.setText("");
        name.setText("");
        price.setText("");
        shape.setSelectedItem("");
        oval_sz.setSelectedItem("");
        rectangle_sz.setSelectedItem("");
    }
    
    private void add_cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_cakeActionPerformed
        try {  
            String ukuran = null;
            if(shape.getSelectedItem()=="Oval"){
                ukuran = oval_sz.getSelectedItem().toString();
            }
            if(shape.getSelectedItem()=="Rectangle"){
                ukuran = rectangle_sz.getSelectedItem().toString();
            }
            sql = "INSERT INTO cake(CakeID, CakeName, CakePrice, CakeSize, CakeShape) VALUES ('"+text_id.getText()+"','"+name.getText()+"','"+price.getText()+"','"+ukuran+"','"+shape.getSelectedItem()+"')";
            pst = (PreparedStatement) con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cake successfuly inputted to the database!");
            load_table();
            clear();
        } catch (SQLException ex) {
            Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add_cakeActionPerformed

    private void shapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeActionPerformed
        
        if(shape.getSelectedItem()=="Oval"){
            rectangle_sz.setEnabled(false);
            oval_sz.setEnabled(true);
            shapes = "O";
        }
        if(shape.getSelectedItem()=="Rectangle"){
            oval_sz.setEnabled(false);
            rectangle_sz.setEnabled(true);
            shapes = "R";
        }
    }//GEN-LAST:event_shapeActionPerformed
   
    public void ids() throws SQLException{
        String trans_ids = "";
        int trans_id;
        rs=(ResultSet) stat.executeQuery("SELECT MAX(REGEXP_SUBSTR(CakeID,'[0-9]+')) as cake_ids FROM cake");        
        if(rs.next()){
            if(rs.getString("cake_ids") == null){
                trans_id = 0;
                for (int num = trans_id+1; num < trans_id+2; num++) {
                    trans_ids = String.format("%04d", num);                        
                }
//                System.out.println(trans_ids);
            }else{
                trans_id = Integer.valueOf(rs.getString("cake_ids"));
                for (int num = trans_id+1; num < trans_id+2; num++) {
                    trans_ids = String.format("%04d", num);                        
                }
//                System.out.println(trans_ids);
            }            
            cake_id = "C"+shapes+sizes+trans_ids;
            text_id.setText(cake_id);
        }
        
    }
    
    private void oval_szActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oval_szActionPerformed
        try {
            if(oval_sz.getSelectedItem()=="15 cm"){
                sizes = "F";
            }
            if(oval_sz.getSelectedItem()=="20 cm"){
                sizes = "N";
            }
            if(oval_sz.getSelectedItem()=="25 cm"){
                sizes = "V";
            }
            ids();
        } catch (SQLException ex) {
            Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_oval_szActionPerformed

    private void rectangle_szActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rectangle_szActionPerformed
        try {
            if(rectangle_sz.getSelectedItem()=="10 x 10 cm"){
                sizes = "T";
            }
            if(rectangle_sz.getSelectedItem()=="20 x 20 cm"){
                sizes = "W";
            }
            if(rectangle_sz.getSelectedItem()=="30 x 30 cm"){
                sizes = "H";
            }
            ids();
        } catch (SQLException ex) {
            Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rectangle_szActionPerformed

    private void remove_cakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_cakeActionPerformed
        if(text_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Select cake you want to remove!");
        }else{
            try {
                sql = "DELETE FROM cake WHERE CakeID='"+text_id1.getText()+"'";
                pst = (PreparedStatement) con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Cake successfuly removed!");
                load_table();
            } catch (SQLException ex) {
                Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_remove_cakeActionPerformed
    
    public void load_table(){
        JTableHeader tableHeader = table.getTableHeader();
        tableHeader.setBackground(new Color(255,102,102));
        table.setAutoCreateRowSorter(true);
        DefaultTableModel mod_tab = new DefaultTableModel();
        mod_tab.addColumn("Cake ID");
        mod_tab.addColumn("Cake Name");
        mod_tab.addColumn("Cake Price");
        mod_tab.addColumn("Cake Shape");
        mod_tab.addColumn("Cake Size");
        try {
            sql = "SELECT CakeID, CakeName, CakePrice, CakeShape, CakeSize FROM cake";
            rs = (ResultSet) stat.executeQuery(sql);
            while(rs.next()){
                mod_tab.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)});
            }
            table.setModel(mod_tab);            
        } catch (SQLException ex) {
            Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        text_id1.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
        name.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
        price.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        shape.setSelectedItem(table.getValueAt(table.getSelectedRow(), 3).toString());
        oval_sz.setSelectedItem(table.getValueAt(table.getSelectedRow(), 4).toString());
        rectangle_sz.setSelectedItem(table.getValueAt(table.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Index mn = new Index();
        mn.setVisible(true);           
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManageCake().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ManageCake.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_cake;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> oval_sz;
    private javax.swing.JTextField price;
    private javax.swing.JComboBox<String> rectangle_sz;
    private javax.swing.JButton remove_cake;
    private java.awt.ScrollPane scrollPane2;
    private javax.swing.JComboBox<String> shape;
    private javax.swing.JTable table;
    private javax.swing.JTextField text_id;
    private javax.swing.JTextField text_id1;
    // End of variables declaration//GEN-END:variables
}
