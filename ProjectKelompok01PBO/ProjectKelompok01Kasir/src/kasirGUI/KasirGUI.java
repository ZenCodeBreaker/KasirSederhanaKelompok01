package kasirGUI;



// IMPORT LIBRARY
import java.text.NumberFormat;
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;



// TURANA DARI JAVAX SWING JFRAME
public class KasirGUI extends javax.swing.JFrame implements FungsiKasir{

    
    
    // VARIABEL
    NumberFormat angka = NumberFormat.getInstance();
    
    
    
    // CONSTRUCTOR
    public KasirGUI() {
        initComponents();
        
        // METHOD
        kodeBarang();
        totalHarga();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNamaAplikasi = new javax.swing.JLabel();
        panelInputData = new javax.swing.JPanel();
        labelKodeBarang = new javax.swing.JLabel();
        labelNamaBarang = new javax.swing.JLabel();
        labelHargaBarang = new javax.swing.JLabel();
        labelQty = new javax.swing.JLabel();
        labelTotalHarga = new javax.swing.JLabel();
        txtKodeBarang = new javax.swing.JTextField();
        txtNamaBarang = new javax.swing.JTextField();
        txtHargaBarang = new javax.swing.JTextField();
        txtQTY = new javax.swing.JTextField();
        txtTotalHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblList = new javax.swing.JTable();
        labelSubTotal = new javax.swing.JLabel();
        labelBayar = new javax.swing.JLabel();
        labelKembali = new javax.swing.JLabel();
        labelItemDibeli = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        txtKembali = new javax.swing.JTextField();
        txtItemDibeli = new javax.swing.JTextField();
        btnTransaksiBaru = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNamaAplikasi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNamaAplikasi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaAplikasi.setText("APLIKASI KASIR TOKO LAPTOP - PROJECT UJIAN AKHIR SEMESTER PBO");

        panelInputData.setBackground(new java.awt.Color(51, 102, 255));

        labelKodeBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelKodeBarang.setForeground(new java.awt.Color(255, 255, 255));
        labelKodeBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelKodeBarang.setText("Kode Barang");

        labelNamaBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelNamaBarang.setForeground(new java.awt.Color(255, 255, 255));
        labelNamaBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaBarang.setText("Nama Barang");

        labelHargaBarang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelHargaBarang.setForeground(new java.awt.Color(255, 255, 255));
        labelHargaBarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHargaBarang.setText("Harga Barang");

        labelQty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelQty.setForeground(new java.awt.Color(255, 255, 255));
        labelQty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelQty.setText("Qty Barang");

        labelTotalHarga.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelTotalHarga.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalHarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotalHarga.setText("Total Harga");

        txtKodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeBarangActionPerformed(evt);
            }
        });

        txtNamaBarang.setEditable(false);
        txtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaBarangActionPerformed(evt);
            }
        });

        txtHargaBarang.setEditable(false);
        txtHargaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaBarangActionPerformed(evt);
            }
        });

        txtQTY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQTYActionPerformed(evt);
            }
        });

        txtTotalHarga.setEditable(false);
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        tblList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Harga Barang", "Qty", "Total Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblList);
        if (tblList.getColumnModel().getColumnCount() > 0) {
            tblList.getColumnModel().getColumn(0).setMaxWidth(60);
            tblList.getColumnModel().getColumn(1).setMaxWidth(100);
            tblList.getColumnModel().getColumn(4).setMaxWidth(60);
        }

        labelSubTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelSubTotal.setForeground(new java.awt.Color(255, 255, 255));
        labelSubTotal.setText("Sub Total");

        labelBayar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelBayar.setForeground(new java.awt.Color(255, 255, 255));
        labelBayar.setText("Bayar");

        labelKembali.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelKembali.setForeground(new java.awt.Color(255, 255, 255));
        labelKembali.setText("Kembali");

        labelItemDibeli.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelItemDibeli.setForeground(new java.awt.Color(255, 255, 255));
        labelItemDibeli.setText("Item yang di beli");

        txtSubTotal.setEditable(false);

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });

        txtKembali.setEditable(false);

        txtItemDibeli.setEditable(false);
        txtItemDibeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemDibeliActionPerformed(evt);
            }
        });

        btnTransaksiBaru.setText("Transaksi Baru");
        btnTransaksiBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransaksiBaruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInputDataLayout = new javax.swing.GroupLayout(panelInputData);
        panelInputData.setLayout(panelInputDataLayout);
        panelInputDataLayout.setHorizontalGroup(
            panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputDataLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtKodeBarang)
                    .addComponent(labelKodeBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNamaBarang)
                    .addComponent(labelNamaBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputDataLayout.createSequentialGroup()
                        .addComponent(labelHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelQty, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputDataLayout.createSequentialGroup()
                        .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInputDataLayout.createSequentialGroup()
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInputDataLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelItemDibeli, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtItemDibeli, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelInputDataLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelBayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTransaksiBaru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtBayar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(txtKembali, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelInputDataLayout.setVerticalGroup(
            panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInputDataLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKodeBarang)
                    .addComponent(labelNamaBarang)
                    .addComponent(labelHargaBarang)
                    .addComponent(labelQty)
                    .addComponent(labelTotalHarga))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHargaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSubTotal)
                    .addComponent(labelItemDibeli)
                    .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemDibeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelBayar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelInputDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelKembali)
                    .addComponent(txtKembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTransaksiBaru)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelNamaAplikasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelInputData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelNamaAplikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInputData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(783, 507));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void txtKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeBarangActionPerformed

    
    
    private void txtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaBarangActionPerformed

    
    
    private void txtHargaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaBarangActionPerformed

    
    
    private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQTYActionPerformed
        if (txtQTY.getText().equals("")){
            return;
        }
        else {
            DefaultTableModel model = (DefaultTableModel) tblList.getModel();
         
            Object kolom[] = new Object[6];
            
            kolom[1] = txtKodeBarang.getText();
            kolom[2] = txtNamaBarang.getText();
            kolom[3] = txtHargaBarang.getText();
            kolom[4] = txtQTY.getText();
            kolom[5] = txtTotalHarga.getText();
            
            model.addRow(kolom);
            int baris = model.getRowCount();
            for (int row = 0; row < baris; row++){
                String no = String.valueOf(row + 1);
                model.setValueAt(no + ".", row, 0);
            }
            
            // ATUR TINGGI BARIS
            tblList.setRowHeight(30);
            
            // TAMPILKAN JUMLAH TOTAL JENIS BARANG YANG DI BERI
            txtItemDibeli.setText(String.valueOf(baris));
            
            // TAMPILKAN SUB TOTAL
            subTotalHarga();
            
            // KETIKA SUDAH DI ENTER, BERSIHKAN TEXTFIELD UNTUK INPUT DATA
            bersih();
            
        }
    }//GEN-LAST:event_txtQTYActionPerformed

    
    
    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalHargaActionPerformed

    
    
    private void txtItemDibeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemDibeliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemDibeliActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
         int subTotal = Integer.parseInt(txtSubTotal.getText().replaceAll(",", ""));
         int bayar = Integer.parseInt(txtBayar.getText());
         int kembalian = bayar - subTotal;
         txtKembali.setText(angka.format(kembalian));
    }//GEN-LAST:event_txtBayarActionPerformed

    private void btnTransaksiBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransaksiBaruActionPerformed
        // MENGKOSONGKAN TABEL LIST DAN MEMBUAT MODEL BARU
        tblList.setModel(new DefaultTableModel(null, new String[]{"Kode Barang", "Nama Barang", "Harga", "Qty", "Total"}));
        
        // MENGKOSONGKAN
        txtItemDibeli.setText("");
        txtSubTotal.setText("");
        txtBayar.setText("");
        txtKembali.setText("");
    }//GEN-LAST:event_btnTransaksiBaruActionPerformed

    
    
    // MAIN - LOOK AND FEEL
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
            java.util.logging.Logger.getLogger(KasirGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KasirGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KasirGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KasirGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KasirGUI().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransaksiBaru;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBayar;
    private javax.swing.JLabel labelHargaBarang;
    private javax.swing.JLabel labelItemDibeli;
    private javax.swing.JLabel labelKembali;
    private javax.swing.JLabel labelKodeBarang;
    private javax.swing.JLabel labelNamaAplikasi;
    private javax.swing.JLabel labelNamaBarang;
    private javax.swing.JLabel labelQty;
    private javax.swing.JLabel labelSubTotal;
    private javax.swing.JLabel labelTotalHarga;
    private javax.swing.JPanel panelInputData;
    private javax.swing.JTable tblList;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHargaBarang;
    private javax.swing.JTextField txtItemDibeli;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtKodeBarang;
    private javax.swing.JTextField txtNamaBarang;
    private javax.swing.JTextField txtQTY;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables

    
    
    // METHOD KODE BARANG
    private void kodeBarang(){
        txtKodeBarang.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                
                String kodeBarang;
                kodeBarang = txtKodeBarang.getText();
                
                switch (kodeBarang){
                    case "T440P" -> {
                        txtNamaBarang.setText("Lenovo Thinkpad T440P");
                        txtHargaBarang.setText(angka.format(2805000));
                        txtQTY.grabFocus();
                    }
                    case "T430" -> {
                        txtNamaBarang.setText("Lenovo Thinkpad T430");
                        txtHargaBarang.setText(angka.format(2400000));
                        txtQTY.grabFocus();
                    }
                    default -> {
                        txtNamaBarang.setText("");
                        txtHargaBarang.setText("");
                    }
                        
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String kodeBarang;
                kodeBarang = txtKodeBarang.getText();
                
                switch (kodeBarang){
                    case "T440P" -> {
                        txtNamaBarang.setText("Lenovo Thinkpad T440P");
                        txtHargaBarang.setText(angka.format(2805000));
                        txtQTY.grabFocus();
                    }
                    case "T430" -> {
                        txtNamaBarang.setText("Lenovo Thinkpad T430");
                        txtHargaBarang.setText(angka.format(2400000));
                        txtQTY.grabFocus();
                    }
                    default -> {
                        txtNamaBarang.setText("");
                        txtHargaBarang.setText("");
                    }
                        
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            
        });
    }


    
    // METHOD TOTAL HARGA
    private void totalHarga(){
        txtQTY.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent arg0) {
                try {
                    
                    int hasil;

                    if (txtQTY.getText().equals("")){
                        hasil = Integer.parseInt(txtHargaBarang.getText().replace(",", "")) * 0;
                    }
                    else {
                        hasil = Integer.parseInt(txtHargaBarang.getText().replace(",", "")) * 
                                Integer.parseInt(txtQTY.getText());
                    }

                    // TAMPILAKN KE DALAM TOTAL HARGA
                    txtTotalHarga.setText(angka.format(hasil));
                    
                } 
                catch (NumberFormatException e) {
                }
            }

            @Override
            public void removeUpdate(DocumentEvent arg0) {
                try {
                    
                    int hasil;

                    if (txtQTY.getText().equals("")){
                        hasil = Integer.parseInt(txtHargaBarang.getText().replace(",", "")) * 0;
                    }
                    else {
                        hasil = Integer.parseInt(txtHargaBarang.getText().replace(",", "")) * 
                                Integer.parseInt(txtQTY.getText());
                    }

                    // TAMPILAKN KE DALAM TOTAL HARGA
                    txtTotalHarga.setText(angka.format(hasil));
                    
                } 
                catch (NumberFormatException e) {
                }
            }

            @Override
            public void changedUpdate(DocumentEvent arg0) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }

    
    
    // DARI INTERFACE FUNGSI KASIR
    @Override
    public void subTotalHarga() {
        int sub_total = 0;
        
        // JUMLAHKAN TOTAL HARGA 
        for (int a=0; a < tblList.getRowCount(); a++){
            sub_total += Integer.parseInt((String) tblList.getValueAt(a, 5).toString().replace(",", ""));
        }
        
        
        // TAMPILKAN HASIL PERHITUNGAN KE DALAM TEXTFIELD SUB TOTAL
        txtSubTotal.setText(angka.format(sub_total));
        
    }

    
    
    @Override
    public void bersih() {
        // KOSONGKAN TEXTFIELD
        txtKodeBarang.setText("");
        txtKodeBarang.grabFocus();
        txtQTY.setText("");
        txtTotalHarga.setText(""); 
    }


}
