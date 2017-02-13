package mimarket.view;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import mimarket.entity.Product;

public class ViewVentas extends javax.swing.JFrame {

    private ArrayList<Product> data;
    private ArrayList<Product> sale;
    private double total = 0;

    public ViewVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        data = getData();
        showProductTable(tbl_search, data);
        sale = new ArrayList<>();

        this.getRootPane().setDefaultButton(btn_add);
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("ENTER"), "none");
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW)
                .put(KeyStroke.getKeyStroke("released ENTER"), "press");

        tbl_search.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke("ENTER"), "none");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_product = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_search = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        spn_quantity = new javax.swing.JSpinner();
        btn_add = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_sale = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btn_buy = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_vuelto = new javax.swing.JLabel();
        tf_efectivo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel1.setText("Mi Market");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Módulo de Ventas");

        tf_product.setToolTipText("nombre del producto");
        tf_product.setName("producto"); // NOI18N
        tf_product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_productKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_productKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_productKeyTyped(evt);
            }
        });

        tbl_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "producto", "precio", "unidad", "stock"
            }
        ));
        jScrollPane1.setViewportView(tbl_search);
        if (tbl_search.getColumnModel().getColumnCount() > 0) {
            tbl_search.getColumnModel().getColumn(0).setMaxWidth(30);
            tbl_search.getColumnModel().getColumn(0).setHeaderValue("cod");
            tbl_search.getColumnModel().getColumn(2).setMaxWidth(50);
            tbl_search.getColumnModel().getColumn(3).setResizable(false);
            tbl_search.getColumnModel().getColumn(3).setMaxWidth(50);
            tbl_search.getColumnModel().getColumn(3).setHeaderValue("unidad");
            tbl_search.getColumnModel().getColumn(4).setMaxWidth(50);
            tbl_search.getColumnModel().getColumn(4).setHeaderValue("stock");
        }

        jLabel5.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel5.setText("cantidad");

        spn_quantity.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        btn_add.setText("Agregar");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        tbl_sale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "producto", "precio", "cantidad", "subtotal"
            }
        ));
        jScrollPane3.setViewportView(tbl_sale);
        if (tbl_sale.getColumnModel().getColumnCount() > 0) {
            tbl_sale.getColumnModel().getColumn(1).setMaxWidth(50);
            tbl_sale.getColumnModel().getColumn(2).setMaxWidth(55);
            tbl_sale.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jLabel7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel7.setText("Productos en el carrito");

        btn_buy.setBackground(new java.awt.Color(51, 255, 0));
        btn_buy.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_buy.setForeground(new java.awt.Color(255, 255, 255));
        btn_buy.setText("COMPRAR");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel8.setText("Busque el producto aqui");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel2.setText("Total a pagar");

        lbl_total.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lbl_total.setText("s/00.00");

        btn_cancel.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("CANCELAR");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_remove.setBackground(new java.awt.Color(255, 102, 0));
        btn_remove.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(255, 255, 255));
        btn_remove.setText("ELIMINAR");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel6.setText("Vuelto");

        lbl_vuelto.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lbl_vuelto.setText("s/00.00");

        tf_efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_efectivoKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel10.setText("Efectivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tf_product)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spn_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel10)
                                                        .addGap(0, 0, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_total, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(tf_efectivo, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_vuelto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btn_cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_remove)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_cancel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_vuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(spn_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_add))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Usuario: Jhonny Arturo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_productKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_productKeyTyped

    }//GEN-LAST:event_tf_productKeyTyped

    private void tf_productKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_productKeyPressed

    }//GEN-LAST:event_tf_productKeyPressed

    private void tf_productKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_productKeyReleased
        String name = tf_product.getText();
        if (!name.equals("")) {
            showProductTable(tbl_search, filterData(data, name));
        } else {
//            ((DefaultTableModel) tbl_search.getModel()).setRowCount(0);
            showProductTable(tbl_search, data);
        }
    }//GEN-LAST:event_tf_productKeyReleased

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        int row = tbl_search.getSelectedRow();
        if (row != -1) {
            addProduct(row);
            showSaleTable(tbl_sale, sale);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecciona un producto");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed
        cleanSale();
        JOptionPane.showMessageDialog(rootPane, "VENTA REGISTRADA");
    }//GEN-LAST:event_btn_buyActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        cleanSale();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        int row = tbl_sale.getSelectedRow();
        if (row != -1) {
            removeProduct(row);
            showSaleTable(tbl_sale, sale);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecciona un producto");
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void tf_efectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_efectivoKeyReleased
        double efectivo = Double.parseDouble(tf_efectivo.getText());
        double vuelto = efectivo - total;
        lbl_vuelto.setText("s/" + vuelto);
    }//GEN-LAST:event_tf_efectivoKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVentas().setVisible(true);
            }
        });
    }

    /*Methods*/
    private ArrayList<Product> getData() {
        ArrayList<Product> data = new ArrayList<>();
        data.add(new Product(1, "Pilsen", "six pack", 10, 14.5));
        data.add(new Product(2, "Coca Cola 1L", "unidad", 10, 5));
        data.add(new Product(3, "Pepsi", "unidad", 30, 1.5));
        data.add(new Product(4, "Coca Cola 3L", "unidad", 20, 9));
        data.add(new Product(5, "Ritz", "unidad", 15, 1));
        return data;
    }

    private void showProductTable(JTable table, ArrayList<Product> data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        // Append a row 
        for (Product p : data) {
            Vector v = new Vector();
            v.add(p.getProductId());
            v.add(p.getProductName());
            v.add(p.getProductPrice());
            v.add(p.getProductUnits());
            v.add(p.getProductStock());
            model.addRow(v);
        }
    }

    private void addProduct(int row) {
        Product p = new Product();
        p.setProductId((int) tbl_search.getValueAt(row, 0));
        p.setProductName((String) tbl_search.getValueAt(row, 1));
        p.setProductPrice((double) tbl_search.getValueAt(row, 2));
        p.setProductUnits((String) tbl_search.getValueAt(row, 3));
        p.setProductQuantity((int) spn_quantity.getValue());
        p.setProductStock((int) tbl_search.getValueAt(row, 4));
        sale.add(p);
        total += p.getProductPrice() * p.getProductQuantity();
        lbl_total.setText("s/" + total);
    }
    
    private void removeProduct(int row) {
        Product p = sale.get(row);
        total -= p.getProductPrice() * p.getProductQuantity();
        sale.remove(row);
        lbl_total.setText("s/" + total);
    }

    private void showSaleTable(JTable table, ArrayList<Product> data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        // Append a row 
        for (Product p : data) {
            Vector v = new Vector();
            v.add(p.getProductName());
            v.add(p.getProductPrice());
            v.add(p.getProductQuantity());
            v.add(p.getProductQuantity() * p.getProductPrice());
            model.addRow(v);
        }
    }

    private ArrayList<Product> filterData(ArrayList<Product> data, String name) {
        ArrayList<Product> filter = new ArrayList<>();
        for (Product p : data) {
            if (p.getProductName().startsWith(name)) {
                filter.add(p);
            }
        }
        return filter;
    }

    public void cleanSale() {
        sale.clear();
        tf_product.setText("");
        showProductTable(tbl_search, data);
        showSaleTable(tbl_sale, sale);
        total = 0;
        tf_efectivo.setText("");
        lbl_total.setText("s/" + total);
        lbl_vuelto.setText("s/" + total);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_vuelto;
    private javax.swing.JSpinner spn_quantity;
    private javax.swing.JTable tbl_sale;
    private javax.swing.JTable tbl_search;
    private javax.swing.JTextField tf_efectivo;
    private javax.swing.JTextField tf_product;
    // End of variables declaration//GEN-END:variables
}
