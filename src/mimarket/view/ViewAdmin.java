package mimarket.view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import mimarket.controller.ProductBLL;
import mimarket.entity.ProductTO;
import mimarket.entity.UserTO;

public class ViewAdmin extends javax.swing.JFrame {

    private ArrayList<ProductTO> data;
    private ProductBLL productBLL;
    private UserTO userTO;
    private JFileChooser fileChooser;
    private File excel;
    private int contadorAccion;
    private boolean importExcel = false;

    public ViewAdmin(UserTO userTO) {
        initComponents();
        configureWindow();
        configureData(userTO);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_subtitle = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbl_user = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        tf_product_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_search = new javax.swing.JTable();
        btn_select = new javax.swing.JButton();
        lbl_add_and_update = new javax.swing.JLabel();
        btn_new = new javax.swing.JButton();
        lbl_products_here = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        lbl_product = new javax.swing.JLabel();
        lbl_units = new javax.swing.JLabel();
        lbl_price = new javax.swing.JLabel();
        lbl_stock = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        tf_product = new javax.swing.JTextField();
        tf_price = new javax.swing.JTextField();
        tf_units = new javax.swing.JTextField();
        tf_stock = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lbl_upload = new javax.swing.JLabel();
        btn_import_products = new javax.swing.JButton();
        btn_find_file = new javax.swing.JButton();
        btn_cancel_import = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_instruction = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        lbl_products_here1 = new javax.swing.JLabel();
        cbx_reports = new javax.swing.JComboBox<>();
        btn_show_report = new javax.swing.JButton();
        btn_generate_pdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1026, 900));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(63, 81, 181));

        lbl_title.setFont(new java.awt.Font("Arial Black", 1, 35)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("Mi Market");

        lbl_subtitle.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbl_subtitle.setForeground(new java.awt.Color(255, 255, 255));
        lbl_subtitle.setText("Módulo de administración");

        jPanel3.setBackground(new java.awt.Color(250, 55, 124));

        lbl_user.setBackground(new java.awt.Color(250, 55, 124));
        lbl_user.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_user.setText("JHONNY ARTURO");

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
                    .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_subtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        tf_product_search.setToolTipText("nombre del producto");
        tf_product_search.setName("producto"); // NOI18N
        tf_product_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_product_searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_product_searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_product_searchKeyTyped(evt);
            }
        });

        tbl_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cod", "producto", "precio", "unidad", "stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Integer.class
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

        btn_select.setBackground(new java.awt.Color(76, 175, 80));
        btn_select.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_select.setForeground(new java.awt.Color(255, 255, 255));
        btn_select.setText("SELECCIONAR");
        btn_select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selectActionPerformed(evt);
            }
        });

        lbl_add_and_update.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_add_and_update.setText("Ingreso y/o actualizacion de productos");

        btn_new.setBackground(new java.awt.Color(76, 175, 80));
        btn_new.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_new.setForeground(new java.awt.Color(255, 255, 255));
        btn_new.setText("NUEVO");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        lbl_products_here.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_products_here.setText("Busque el producto aqui");

        btn_delete.setBackground(new java.awt.Color(244, 67, 54));
        btn_delete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("ELIMINAR");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(255, 152, 0));
        btn_update.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("ACTUALIZAR");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        lbl_product.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_product.setLabelFor(tf_product);
        lbl_product.setText("Producto:");

        lbl_units.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_units.setLabelFor(tf_units);
        lbl_units.setText("Unidad:");

        lbl_price.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_price.setLabelFor(tf_price);
        lbl_price.setText("Precio:");

        lbl_stock.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_stock.setLabelFor(tf_stock);
        lbl_stock.setText("Stock:");

        tf_id.setEditable(false);

        tf_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priceActionPerformed(evt);
            }
        });

        tf_stock.setPreferredSize(new java.awt.Dimension(9, 22));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_products_here)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tf_product_search, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_select, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(lbl_add_and_update)
                                .addGap(0, 157, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_product, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_units, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_stock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_units)
                                    .addComponent(tf_price, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_product, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_id, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_stock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_new, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(56, 56, 56))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_products_here)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbl_add_and_update)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_product, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_product, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_price, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_units, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_units, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_product_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_select, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        lbl_upload.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_upload.setForeground(new java.awt.Color(255, 255, 255));
        lbl_upload.setText("Suba sus productos desde un archivo EXCEL");

        btn_import_products.setBackground(new java.awt.Color(76, 175, 80));
        btn_import_products.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btn_import_products.setForeground(new java.awt.Color(255, 255, 255));
        btn_import_products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_csv.png"))); // NOI18N
        btn_import_products.setText("IMPORTAR");
        btn_import_products.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_import_productsActionPerformed(evt);
            }
        });

        btn_find_file.setBackground(new java.awt.Color(33, 150, 243));
        btn_find_file.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btn_find_file.setForeground(new java.awt.Color(255, 255, 255));
        btn_find_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_search.png"))); // NOI18N
        btn_find_file.setText("BUSCAR");
        btn_find_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_find_fileActionPerformed(evt);
            }
        });

        btn_cancel_import.setBackground(new java.awt.Color(244, 67, 54));
        btn_cancel_import.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        btn_cancel_import.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_cancel.png"))); // NOI18N
        btn_cancel_import.setText("CANCELAR");
        btn_cancel_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancel_importActionPerformed(evt);
            }
        });

        ta_instruction.setEditable(false);
        ta_instruction.setColumns(20);
        ta_instruction.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        ta_instruction.setRows(5);
        ta_instruction.setText("\nSiga los siguientes pasos\n\n1. Presione BUSCAR y seleccione el archivo EXCEL\n2. Verifique los datos en la tabla\n3. Presione IMPORTAR para subir los datos\n");
        jScrollPane2.setViewportView(ta_instruction);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_upload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(405, 405, 405))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 34, Short.MAX_VALUE)
                        .addComponent(btn_find_file, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_import_products)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancel_import)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_upload)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancel_import, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_import_products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_find_file, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        lbl_products_here1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lbl_products_here1.setText("Genere reportes de sus ventas");

        cbx_reports.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Resumen de ventas del día", "Productos vendidos en el dia" }));

        btn_show_report.setBackground(new java.awt.Color(76, 175, 80));
        btn_show_report.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_show_report.setForeground(new java.awt.Color(255, 255, 255));
        btn_show_report.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_report.png"))); // NOI18N
        btn_show_report.setText("VER REPORTE");

        btn_generate_pdf.setBackground(new java.awt.Color(33, 150, 243));
        btn_generate_pdf.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_generate_pdf.setForeground(new java.awt.Color(255, 255, 255));
        btn_generate_pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_pdf.png"))); // NOI18N
        btn_generate_pdf.setText("GENERAR PDF");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_products_here1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btn_show_report, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_generate_pdf, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addComponent(cbx_reports, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_products_here1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_reports, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_generate_pdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_show_report, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_product_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_product_searchKeyPressed

    }//GEN-LAST:event_tf_product_searchKeyPressed

    private void tf_product_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_product_searchKeyReleased
        String name = tf_product_search.getText();
        if (!name.equals("")) {
            showProductTable(tbl_search, filterData(data, name));
        } else {
            showProductTable(tbl_search, data);
        }
    }//GEN-LAST:event_tf_product_searchKeyReleased

    private void tf_product_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_product_searchKeyTyped

    }//GEN-LAST:event_tf_product_searchKeyTyped

    private void btn_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selectActionPerformed
        int row = tbl_search.getSelectedRow();
        if (row != -1) {
            selectProduct(row);
        } else {
            showErrorMessage("Selecciona un producto");
        }
    }//GEN-LAST:event_btn_selectActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        if (notEmpty(tf_price) && notEmpty(tf_product) && notEmpty(tf_stock) && notEmpty(tf_units)) {
            ProductTO p = new ProductTO();
            p.setProductName(tf_product.getText());
            p.setProductPrice(Double.parseDouble(tf_price.getText()));
            p.setProductUnits(tf_units.getText());
            p.setProductStock(Integer.parseInt(tf_stock.getText()));
            if (productBLL.insertProduct(p)) {
                getData();
                showProductTable(tbl_search, data);
                cleanProduct();
            } else {
                showErrorMessage("ERROR, VERIFIQUE LOS DATOS");
            }
        } else {
            showErrorMessage("INGRESE INFORMACION COMPLETA DEL PRODUCTO");
        }
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if (notEmpty(tf_id)) {
            if (productBLL.deleteProduct(Integer.parseInt(tf_id.getText()))) {
                getData();
                showProductTable(tbl_search, data);
                cleanProduct();
            } else {
                showErrorMessage("ERROR, VERIFIQUE LOS DATOS");
            }
        } else {
            showErrorMessage("SELECCIONE EL PRODUCTO A ELIMINAR");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        if (notEmpty(tf_id) && notEmpty(tf_price) && notEmpty(tf_product) && notEmpty(tf_stock) && notEmpty(tf_units)) {
            ProductTO productTO = new ProductTO();
            productTO.setProductId(Integer.parseInt(tf_id.getText()));
            productTO.setProductName(tf_product.getText());
            productTO.setProductPrice(Double.parseDouble(tf_price.getText()));
            productTO.setProductUnits(tf_units.getText());
            productTO.setProductStock(Integer.parseInt(tf_stock.getText()));
            if (productBLL.updateProduct(productTO)) {
                getData();
                showProductTable(tbl_search, data);
                cleanProduct();
            } else {
                JOptionPane.showMessageDialog(rootPane, "ERROR, VERIFIQUE LOS DATOS INGRESADOS");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "SELECCIONE EL PRODUCTO A ACTUALIZAR");
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tf_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priceActionPerformed

    }//GEN-LAST:event_tf_priceActionPerformed

    private void btn_find_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_find_fileActionPerformed
        contadorAccion++;
        if (contadorAccion == 1) {
            fileChooser.setFileFilter(new FileNameExtensionFilter("Excel (*.xls)", "xls"));
            fileChooser.setFileFilter(new FileNameExtensionFilter("Excel (*.xlsx)", "xlsx"));
        }
        if (fileChooser.showDialog(null, "Seleccionar archivo") == JFileChooser.APPROVE_OPTION) {
            excel = fileChooser.getSelectedFile();
            if (excel.getName().endsWith("xls") || excel.getName().endsWith("xlsx")) {
                importExcel = productBLL.processExcel(excel, tbl_search);
            }
        }
    }//GEN-LAST:event_btn_find_fileActionPerformed

    private void btn_import_productsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_import_productsActionPerformed
        if (importExcel) {
            productBLL.importExcel(tbl_search);
            getData();
            showProductTable(tbl_search, data);
            importExcel = false;
        } else {
            JOptionPane.showMessageDialog(null, "PRIMERO BUSQUE EL ARCHIVO EXCEL");
        }
    }//GEN-LAST:event_btn_import_productsActionPerformed

    private void btn_cancel_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancel_importActionPerformed
        importExcel = false;
        getData();
        showProductTable(tbl_search, data);

    }//GEN-LAST:event_btn_cancel_importActionPerformed

    private void getData() {
        data = productBLL.listAllProducts();
    }

    private boolean notEmpty(JTextField tf) {
        if (!tf.getText().equals("")) {
            return true;
        }
        return false;
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

    private ArrayList<ProductTO> filterData(ArrayList<ProductTO> data, String name) {
        ArrayList<ProductTO> filter = new ArrayList<>();
        for (ProductTO p : data) {
            if (p.getProductName().toUpperCase().startsWith(name.toUpperCase())) {
                filter.add(p);
            }
        }
        return filter;
    }

    private void selectProduct(int row) {
        tf_id.setText(String.valueOf(tbl_search.getValueAt(row, 0)));
        tf_product.setText(String.valueOf(tbl_search.getValueAt(row, 1)));
        tf_price.setText(String.valueOf(tbl_search.getValueAt(row, 2)));
        tf_units.setText(String.valueOf(tbl_search.getValueAt(row, 3)));
        tf_stock.setText(String.valueOf(tbl_search.getValueAt(row, 4)));
    }

    private void setFonts() {
        try {
            Font roboto_bold_title = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Black.ttf")).deriveFont(40f);
            Font roboto_bold_subtitle = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Bold.ttf")).deriveFont(25f);
            Font roboto_regular = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(14f);
            Font roboto_regular_big = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(14f);
            Font roboto_regular_table = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(12f);
            Font roboto_regular_button = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(15f);
            Font roboto_bold_button = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Bold.ttf")).deriveFont(18f);
            lbl_title.setFont(roboto_bold_title);
            lbl_subtitle.setFont(roboto_bold_subtitle);

            lbl_products_here.setFont(roboto_regular);
            lbl_add_and_update.setFont(roboto_regular);
            ta_instruction.setFont(roboto_regular);
            lbl_upload.setFont(roboto_regular);
            lbl_user.setFont(roboto_regular);

            lbl_stock.setFont(roboto_regular_big);
            lbl_product.setFont(roboto_regular_big);
            lbl_price.setFont(roboto_regular_big);
            lbl_units.setFont(roboto_regular_big);
            tf_id.setFont(roboto_regular_big);
            tf_product.setFont(roboto_regular_big);
            tf_price.setFont(roboto_regular_big);
            tf_stock.setFont(roboto_regular_big);
            tf_units.setFont(roboto_regular_big);
            tf_product_search.setFont(roboto_regular_big);

            tbl_search.setFont(roboto_regular_table);

            btn_select.setFont(roboto_regular_button);
            btn_update.setFont(roboto_regular_button);
            btn_delete.setFont(roboto_regular_button);

            btn_new.setFont(roboto_bold_button);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
    }

    private void configureWindow() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        tf_id.setVisible(false);
        tbl_search.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(KeyStroke.getKeyStroke("ENTER"), "none");
        setFonts();
        fileChooser = new JFileChooser();
    }

    private void configureData(UserTO userTO) {
        productBLL = new ProductBLL();
        this.userTO = userTO;
        lbl_user.setText(userTO.getUsername());
        getData();
        showProductTable(tbl_search, data);
    }

    private void cleanProduct() {
        tf_id.setText("");
        tf_price.setText("");
        tf_product.setText("");
        tf_stock.setText("");
        tf_units.setText("");
    }

    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel_import;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_find_file;
    private javax.swing.JButton btn_generate_pdf;
    private javax.swing.JButton btn_import_products;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_select;
    private javax.swing.JButton btn_show_report;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cbx_reports;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_add_and_update;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_product;
    private javax.swing.JLabel lbl_products_here;
    private javax.swing.JLabel lbl_products_here1;
    private javax.swing.JLabel lbl_stock;
    private javax.swing.JLabel lbl_subtitle;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JLabel lbl_units;
    private javax.swing.JLabel lbl_upload;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextArea ta_instruction;
    private javax.swing.JTable tbl_search;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_product;
    private javax.swing.JTextField tf_product_search;
    private javax.swing.JTextField tf_stock;
    private javax.swing.JTextField tf_units;
    // End of variables declaration//GEN-END:variables

}
