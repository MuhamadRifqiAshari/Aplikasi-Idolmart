/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idolmart;

import java.awt.Graphics;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class home extends javax.swing.JFrame {
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel; 
    Connection cn = koneksiDB.konek();
    String jumlah;    
    String i;
    String n;
    String h;
    String text;
    /**
     * Creates new form home
     */
    public home() {
        
        initComponents();
        judul();
        tampilData("");
        namauser.setText("hello "+getName());
    }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbbarang = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        input = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        namauser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 125));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELAMAT DATANG");

        tbbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbbarang);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("silahkan pilih barang yang anda ingin kan dari tabel di bawah!!");

        input.setText("ok");
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 153, 153));
        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/icons8-close-20.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        namauser.setForeground(new java.awt.Color(255, 255, 255));
        namauser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 47, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namauser)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(namauser))
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(input)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tbbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbbarangMouseClicked
        int tabmodel = tbbarang.getSelectedRow();
        i = tbbarang.getValueAt(tbbarang.getSelectedRow(),0).toString();
        n = tbbarang.getValueAt(tbbarang.getSelectedRow(),1).toString(); 
        h = tbbarang.getValueAt(tbbarang.getSelectedRow(),2).toString();
        jumlah = JOptionPane.showInputDialog(null, "Jumlah pembelian :","0");
        int opsi = JOptionPane.showConfirmDialog(null, "Benarkah anda ingin membeli barang ini ?");
        switch(opsi){
            case JOptionPane.YES_OPTION:
            try{
               Statement st = cn.createStatement();
               st.execute("INSERT INTO `struk` (`namauser`, `jmlbr`, `id`) VALUES ('"+getName()+"', '"+jumlah+"', '"+i+"');");
               
               JOptionPane.showMessageDialog(null, "Barang telah masuk keranjang");
               break;

                }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
                    
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Terima kasih");
                break;
            default:
                break;
        }
        

    }//GEN-LAST:event_tbbarangMouseClicked

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
            try{
            int jawab=JOptionPane.showConfirmDialog(null, "apakah anda ingin checkout?","Konfirmasi",JOptionPane.YES_NO_OPTION);
            if(jawab==0)
            JOptionPane.showMessageDialog(null, "silahkan checkout!");
            switch(jawab){
            case JOptionPane.YES_OPTION:
                cekout em = new cekout();
                em.show();
                this.dispose();
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Terima kasih");
                break;
            default:
                break;
        }
            
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_inputActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    public void judul(){
        Object[] judul = {
            "Id","Nama","Harga"
        };
        tabModel = new DefaultTableModel(null,judul);
        tbbarang.setModel(tabModel);
    }
    public void tampilData(String barang){
        try{
            tabModel.getDataVector().removeAllElements();
            tabModel.fireTableDataChanged();
            st = cn.createStatement();
            rs = st.executeQuery("SELECT * FROM barang");
            
            while(rs.next()){
                Object[] data = {
                    rs.getString("Id"),
                    rs.getString("Nama"),
                    rs.getString("Harga")
                };
                tabModel.addRow(data);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    /**
     * @param args the command line arguments
     */
    public String getName() {
        return SingletonStorage.name;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton input;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel namauser;
    private javax.swing.JTable tbbarang;
    // End of variables declaration//GEN-END:variables


}
