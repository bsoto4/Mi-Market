package mimarket.view;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import mimarket.controller.UserBLL;
import mimarket.entity.UserTO;

public class ViewLogin extends javax.swing.JFrame {

    private UserBLL userBLL;
    private UserTO userTO;

    public ViewLogin() {
        initComponents();
        configureWindow();
        configureData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tf_user = new javax.swing.JTextField();
        btn_login = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        icon_user = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        icon_pass = new javax.swing.JLabel();
        tf_password = new javax.swing.JPasswordField();
        lbl_error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Market");

        jPanel1.setBackground(new java.awt.Color(63, 81, 181));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lbl_title.setFont(new java.awt.Font("Arial Black", 1, 25)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Mi Market");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_title, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btn_login.setBackground(new java.awt.Color(63, 81, 181));
        btn_login.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("ENTRAR");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        jPanel3.setPreferredSize(new java.awt.Dimension(50, 16));

        icon_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_user.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_user, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_user, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        icon_pass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_pass.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(icon_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        lbl_error.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lbl_error.setForeground(new java.awt.Color(244, 67, 54));
        lbl_error.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_error.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mimarket/resources/images/icon_login_error.png"))); // NOI18N
        lbl_error.setText("Usuario y/o contraseña incorrecto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_login, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lbl_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_error)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(tf_user))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        if (notEmpty(tf_user) && notEmpty(tf_password)) {
            userTO = userBLL.login(tf_user.getText(), tf_password.getText());
            if (userTO != null) {
                switch (userTO.getType()) {
                    case "ventas":
                        new ViewVentas(userTO);
                        this.setVisible(false);
                        break;
                    case "admin":
                        new ViewAdmin(userTO);
                        this.setVisible(false);
                        break;
                    default:
                        break;
                }
            } else {
                showErrorMessage("Usuario y/o contraseña incorrecto");
            }
        } else {
            showErrorMessage("Ingrese su usuario y/o contraseña");
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void setFonts() {
        try {
            Font roboto_bold_title = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Black.ttf")).deriveFont(40f);
            Font roboto_regular = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(15f);
            Font roboto_regular_button = Font.createFont(Font.TRUETYPE_FONT, new File("src\\mimarket\\resources\\fonts\\Roboto-Medium.ttf")).deriveFont(20f);
            lbl_title.setFont(roboto_bold_title);
            lbl_error.setFont(roboto_regular);
            btn_login.setFont(roboto_regular_button);
            tf_user.setFont(roboto_regular);
            tf_password.setFont(roboto_regular);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FontFormatException e) {
            e.printStackTrace();
        }
    }

    private void configureWindow() {
        this.setLocationRelativeTo(null);
        this.getRootPane().setDefaultButton(btn_login);
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ENTER"), "none");
        this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("released ENTER"), "press");
        setFonts();
        lbl_error.setVisible(false);
    }

    private void configureData() {
        userBLL = new UserBLL();
    }

    private boolean notEmpty(JTextField tf) {
        if (!tf.getText().equals("")) {
            return true;
        }
        return false;
    }

    private void showErrorMessage(String message) {
        lbl_error.setText(message);
        lbl_error.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel icon_pass;
    private javax.swing.JLabel icon_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbl_error;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_user;
    // End of variables declaration//GEN-END:variables

}
