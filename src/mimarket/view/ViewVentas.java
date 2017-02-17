package mimarket.view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.table.DefaultTableModel;
import mimarket.controller.ProductBLL;
import mimarket.controller.SaleBLL;
import mimarket.entity.ProductTO;
import mimarket.entity.SaleTO;
import mimarket.entity.UserTO;
import mimarket.services.ProductBO;

public class ViewVentas extends javax.swing.JFrame {

    private ArrayList<ProductTO> data;
    private ArrayList<ProductTO> sale;
    private double total = 0;
    private int saleId = -1;
    private SaleBLL saleBLL;
    private ProductBLL productBLL;
    private UserTO userTO;

    public ViewVentas(UserTO userTO) {
        initComponents();
        configureWindow();
        configureData(userTO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_product = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_search = new javax.swing.JTable();
        lbl_quantity = new javax.swing.JLabel();
        spn_quantity = new javax.swing.JSpinner();
        btn_add = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_sale = new javax.swing.JTable();
        lbl_sale_here = new javax.swing.JLabel();
        btn_buy = new javax.swing.JButton();
        lbl_search_here = new javax.swing.JLabel();
        lbl_total_pay = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        lbl_change = new javax.swing.JLabel();
        lbl_vuelto = new javax.swing.JLabel();
        tf_efectivo = new javax.swing.JTextField();
        lbl_efectivo = new javax.swing.JLabel();
        lbl_sale_here1 = new javax.swing.JLabel();
        lbl_sale_id = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_subtitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tf_product.setToolTipText("nombre del producto");
        tf_product.setName("producto"); // NOI18N
        tf_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_productActionPerformed(evt);
            }
        });
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

        tbl_search.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        tbl_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "producto", "precio", "unidad", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_search);
        if (tbl_search.getColumnModel().getColumnCount() > 0) {
            tbl_search.getColumnModel().getColumn(0).setMaxWidth(30);
            tbl_search.getColumnModel().getColumn(2).setMaxWidth(50);
            tbl_search.getColumnModel().getColumn(3).setMaxWidth(60);
            tbl_search.getColumnModel().getColumn(4).setMaxWidth(50);
        }

        lbl_quantity.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_quantity.setText("cantidad");

        spn_quantity.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));

        btn_add.setBackground(new java.awt.Color(76, 175, 80));
        btn_add.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("AGREGAR");
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
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_sale.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_saleKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_sale);
        if (tbl_sale.getColumnModel().getColumnCount() > 0) {
            tbl_sale.getColumnModel().getColumn(1).setMaxWidth(50);
            tbl_sale.getColumnModel().getColumn(2).setMaxWidth(55);
            tbl_sale.getColumnModel().getColumn(3).setMaxWidth(60);
        }

        lbl_sale_here.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_sale_here.setText("Productos en el carrito");

        btn_buy.setBackground(new java.awt.Color(76, 175, 80));
        btn_buy.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_buy.setForeground(new java.awt.Color(255, 255, 255));
        btn_buy.setText("COMPRAR");
        btn_buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buyActionPerformed(evt);
            }
        });

        lbl_search_here.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_search_here.setText("Busque el producto aqui");

        lbl_total_pay.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_total_pay.setText("Total a pagar");

        lbl_total.setFont(new java.awt.Font("Arial Black", 1, 20)); // NOI18N
        lbl_total.setText("s/00.00");

        btn_cancel.setBackground(new java.awt.Color(244, 67, 54));
        btn_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("CANCELAR");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_remove.setBackground(new java.awt.Color(255, 152, 0));
        btn_remove.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(255, 255, 255));
        btn_remove.setText("ELIMINAR");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        lbl_change.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_change.setText("Vuelto");

        lbl_vuelto.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        lbl_vuelto.setText("s/00.00");

        tf_efectivo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_efectivoKeyReleased(evt);
            }
        });

        lbl_efectivo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_efectivo.setText("Efectivo");

        lbl_sale_here1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_sale_here1.setText("Codigo Venta: ");

        lbl_sale_id.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_sale_id.setText("000");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_search_here)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_product, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spn_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_total_pay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_change, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_efectivo)
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
                                    .addComponent(btn_remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_buy, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_sale_here, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_sale_here1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_sale_id, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_sale_here)
                    .addComponent(lbl_search_here)
                    .addComponent(lbl_sale_here1)
                    .addComponent(lbl_sale_id))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_efectivo))
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_vuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_change, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_total_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_buy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_product, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spn_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(63, 81, 181));

        lbl_title.setFont(new java.awt.Font("Arial Black", 1, 35)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("Mi Market");

        lbl_subtitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl_subtitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_subtitle.setText("Módulo de Ventas");

        jPanel3.setBackground(new java.awt.Color(250, 55, 124));

        lbl_user.setBackground(new java.awt.Color(250, 55, 124));
        lbl_user.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user.setText("DIEGUITO");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
                    .addComponent(lbl_subtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_title, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_subtitle))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            calculateChange();
        } else {
            showErrorMessage("Selecciona un producto");
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buyActionPerformed
        buyProducts();
        cleanSale();
        showErrorMessage("VENTA REGISTRADA");
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
            showErrorMessage("Selecciona un producto");
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void tf_efectivoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_efectivoKeyReleased
        calculateChange();
    }//GEN-LAST:event_tf_efectivoKeyReleased

    private void tf_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_productActionPerformed

    }//GEN-LAST:event_tf_productActionPerformed

    private void tbl_saleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_saleKeyReleased
        if (evt.getKeyCode() == 10) {
            int row = tbl_sale.getSelectedRow();
            ProductTO p = sale.get(row);
            total -= p.getProductQuantity() * p.getProductPrice();
            p.setProductQuantity((int) tbl_sale.getValueAt(row, 2));
            double subtotal = p.getProductQuantity() * p.getProductPrice();
            total += subtotal;
            tbl_sale.setValueAt(subtotal, row, 3);
            lbl_total.setText("s/" + total);
            calculateChange();
        }
    }//GEN-LAST:event_tbl_saleKeyReleased

    public void calculateChange() {
        if (!tf_efectivo.getText().equals("")) {
            double efectivo = Double.parseDouble(tf_efectivo.getText());
            if (efectivo >= total) {
                double vuelto = efectivo - total;
                lbl_vuelto.setText("s/" + String.format("%.2f", vuelto));
            } else {
                lbl_vuelto.setText("s/00.00");
            }
        } else {
            lbl_vuelto.setText("s/00.00");
        }
    }

    private void getData() {
        data = productBLL.listAllProducts();
    }

    private void showProductTable(JTable table, ArrayList<ProductTO> data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        // Append a row 
        for (ProductTO p : data) {
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
        if (notExists(((String) tbl_search.getValueAt(row, 1)), sale)) {
            ProductTO p = new ProductTO();
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
    }

    private boolean notExists(String product, ArrayList<ProductTO> sale) {
        for (ProductTO p : sale) {
            if (p.getProductName().equals(product)) {
                return false;
            }
        }
        return true;
    }

    private void removeProduct(int row) {
        ProductTO p = sale.get(row);
        total -= p.getProductPrice() * p.getProductQuantity();
        sale.remove(row);
        lbl_total.setText("s/" + total);
        calculateChange();
    }

    private void showSaleTable(JTable table, ArrayList<ProductTO> data) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        // Append a row 
        for (ProductTO p : data) {
            Vector v = new Vector();
            v.add(p.getProductName());
            v.add(p.getProductPrice());
            v.add(p.getProductQuantity());
            v.add(p.getProductQuantity() * p.getProductPrice());
            model.addRow(v);
        }
    }

    private ArrayList<ProductTO> filterData(ArrayList<ProductTO> data, String name) {
        ArrayList<ProductTO> filter = new ArrayList<>();
        for (ProductTO p : data) {
            if (p.getProductName().toUpperCase().startsWith(name.toUpperCase())) {
                filter.add(p);
            }
        }
        return filter;
    }

    public void cleanSale() {
        tf_product.setText("");
        tf_efectivo.setText("");
        lbl_total.setText("s/" + total);
        lbl_vuelto.setText("s/" + total);
        sale.clear();
        getData();
        updateSaleId();
        showProductTable(tbl_search, data);
        showSaleTable(tbl_sale, sale);
        total = 0;
    }

    private void buyProducts() {
        SaleTO saleTO = new SaleTO(userTO.getUserId(), total);
        ArrayList<ProductBO> products = new ArrayList<>();
        for (int row = 0; row < tbl_sale.getRowCount(); row++) {
            ProductBO p = new ProductBO();
            p.setSaleId(saleId);
            p.setProductId(sale.get(row).getProductId());
            p.setProductPrice(sale.get(row).getProductPrice());
            p.setProductQuantiy((int) tbl_sale.getValueAt(row, 2));
            products.add(p);
        }
        saleBLL.newSale(saleTO, products);
        cleanSale();
    }

    private void setFonts() {
        try {
            Font roboto_bold_title = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Black.ttf")).deriveFont(40f);
            Font roboto_bold_subtitle = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Bold.ttf")).deriveFont(25f);
            Font roboto_regular = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(12f);
            Font roboto_regular_table = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(14f);
            Font roboto_regular_button = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(15f);
            Font roboto_bold_button = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Bold.ttf")).deriveFont(18f);
            lbl_title.setFont(roboto_bold_title);
            lbl_subtitle.setFont(roboto_bold_subtitle);

            lbl_search_here.setFont(roboto_regular);
            lbl_sale_here.setFont(roboto_regular);
            lbl_efectivo.setFont(roboto_regular);
            lbl_quantity.setFont(roboto_regular);
            lbl_total_pay.setFont(roboto_regular);
            lbl_change.setFont(roboto_regular);
            tf_efectivo.setFont(roboto_regular);
            tf_product.setFont(roboto_regular);
            lbl_user.setFont(roboto_regular);

            tbl_sale.setFont(roboto_regular_table);
            tbl_search.setFont(roboto_regular_table);

            lbl_vuelto.setFont(roboto_regular_table);
            lbl_total.setFont(roboto_bold_subtitle);

            btn_add.setFont(roboto_regular_button);
            btn_cancel.setFont(roboto_regular_button);
            btn_remove.setFont(roboto_regular_button);

            btn_buy.setFont(roboto_bold_button);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
    }

    private void configureWindow() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        setFonts();
        tbl_search.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke("ENTER"), "none");
        tbl_sale.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke("UP"), "none");
        tbl_sale.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke("DOWN"), "none");
    }

    private void configureData(UserTO userTO) {
        saleBLL = new SaleBLL();
        productBLL = new ProductBLL();
        getData();
        updateSaleId();
        sale = new ArrayList<>();
        this.userTO = userTO;
        lbl_user.setText(userTO.getUsername());
        showProductTable(tbl_search, data);
    }

    private boolean notEmpty(JTextField tf) {
        if (!tf.getText().equals("")) {
            return true;
        }
        return false;
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(rootPane, message);
    }
    
    private void updateSaleId() {
        saleId = saleBLL.getSaleId();
        lbl_sale_id.setText(saleId + "");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_buy;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_remove;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_change;
    private javax.swing.JLabel lbl_efectivo;
    private javax.swing.JLabel lbl_quantity;
    private javax.swing.JLabel lbl_sale_here;
    private javax.swing.JLabel lbl_sale_here1;
    private javax.swing.JLabel lbl_sale_id;
    private javax.swing.JLabel lbl_search_here;
    private javax.swing.JLabel lbl_subtitle;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_total;
    private javax.swing.JLabel lbl_total_pay;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JLabel lbl_vuelto;
    private javax.swing.JSpinner spn_quantity;
    private javax.swing.JTable tbl_sale;
    private javax.swing.JTable tbl_search;
    private javax.swing.JTextField tf_efectivo;
    private javax.swing.JTextField tf_product;
    // End of variables declaration//GEN-END:variables

}
