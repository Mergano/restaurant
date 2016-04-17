package com.kiyoshi.gui;

import com.kiyoshi.core.MainFrame;
import com.kiyoshi.dao.Queuing;
import java.awt.event.KeyEvent;

public class AuthenticateFrame extends javax.swing.JFrame {

    Queuing queue;

    public AuthenticateFrame() {
        initComponents();
        queue = new Queuing();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        forgot_password_dialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        auth_header = new javax.swing.JPanel();
        auth_header_image = new javax.swing.JLabel();
        auth_body = new javax.swing.JPanel();
        auth_title_box = new javax.swing.JPanel();
        auth_title = new javax.swing.JLabel();
        auth_input_box = new javax.swing.JPanel();
        auth_input_layout_box = new javax.swing.JPanel();
        auth_username_label_box = new javax.swing.JPanel();
        auth_username_label = new javax.swing.JLabel();
        auth_username_box = new javax.swing.JPanel();
        auth_username_input = new javax.swing.JTextField();
        auth_password_label_box = new javax.swing.JPanel();
        auth_password_label = new javax.swing.JLabel();
        auth_password_box = new javax.swing.JPanel();
        auth_password_input = new javax.swing.JPasswordField();
        auth_forgot_box = new javax.swing.JPanel();
        auth_forgot_passwd_btn = new javax.swing.JButton();
        auth_error_box = new javax.swing.JPanel();
        auth_error_message_label = new javax.swing.JLabel();
        auth_footer = new javax.swing.JPanel();
        auth_signin_btn = new javax.swing.JButton();
        auth_cancel_btn = new javax.swing.JButton();

        forgot_password_dialog.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        forgot_password_dialog.setTitle("Forgot password");
        forgot_password_dialog.setMaximumSize(new java.awt.Dimension(400, 150));
        forgot_password_dialog.setMinimumSize(new java.awt.Dimension(400, 150));
        forgot_password_dialog.setName("forgot_password_dialog"); // NOI18N
        forgot_password_dialog.setPreferredSize(new java.awt.Dimension(400, 150));
        forgot_password_dialog.setResizable(false);
        forgot_password_dialog.setSize(new java.awt.Dimension(400, 150));
        forgot_password_dialog.getContentPane().setLayout(new javax.swing.BoxLayout(forgot_password_dialog.getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setName("jPanel2"); // NOI18N

        jLabel1.setText("Enter your email address account.");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel2.add(jLabel1);

        forgot_password_dialog.getContentPane().add(jPanel2);

        jPanel1.setName("jPanel1"); // NOI18N

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField1.setName("jTextField1"); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(350, 30));
        jPanel1.add(jTextField1);

        forgot_password_dialog.getContentPane().add(jPanel1);

        jPanel3.setName("jPanel3"); // NOI18N

        jButton1.setText("Submit");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));
        jPanel3.add(jButton1);

        forgot_password_dialog.getContentPane().add(jPanel3);

        forgot_password_dialog.getAccessibleContext().setAccessibleDescription("");
        forgot_password_dialog.getAccessibleContext().setAccessibleParent(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kiyoshi Restaurant Queuing System");
        setMaximumSize(new java.awt.Dimension(640, 480));
        setMinimumSize(new java.awt.Dimension(640, 480));
        setName("Form"); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        auth_header.setName("auth_header"); // NOI18N
        auth_header.setLayout(new java.awt.BorderLayout());

        auth_header_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        auth_header_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kiyoshi/img/auth_header.png"))); // NOI18N
        auth_header_image.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        auth_header_image.setFocusable(false);
        auth_header_image.setName("auth_header_image"); // NOI18N
        auth_header.add(auth_header_image, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipady = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        getContentPane().add(auth_header, gridBagConstraints);

        auth_body.setName("auth_body"); // NOI18N
        auth_body.setPreferredSize(new java.awt.Dimension(100, 160));
        auth_body.setLayout(new javax.swing.BoxLayout(auth_body, javax.swing.BoxLayout.Y_AXIS));

        auth_title_box.setName("auth_title_box"); // NOI18N

        auth_title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        auth_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        auth_title.setText("System Authentication");
        auth_title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        auth_title.setName("auth_title"); // NOI18N
        auth_title.setPreferredSize(new java.awt.Dimension(178, 45));
        auth_title_box.add(auth_title);

        auth_body.add(auth_title_box);

        auth_input_box.setName("auth_input_box"); // NOI18N

        auth_input_layout_box.setName("auth_input_layout_box"); // NOI18N
        auth_input_layout_box.setLayout(new javax.swing.BoxLayout(auth_input_layout_box, javax.swing.BoxLayout.Y_AXIS));

        auth_username_label_box.setName("auth_username_label_box"); // NOI18N
        auth_username_label_box.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        auth_username_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        auth_username_label.setText("Username");
        auth_username_label.setName("auth_username_label"); // NOI18N
        auth_username_label_box.add(auth_username_label);

        auth_input_layout_box.add(auth_username_label_box);

        auth_username_box.setName("auth_username_box"); // NOI18N
        auth_username_box.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        auth_username_input.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        auth_username_input.setName("auth_username_input"); // NOI18N
        auth_username_input.setPreferredSize(new java.awt.Dimension(300, 30));
        auth_username_box.add(auth_username_input);

        auth_input_layout_box.add(auth_username_box);

        auth_password_label_box.setName("auth_password_label_box"); // NOI18N
        auth_password_label_box.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        auth_password_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        auth_password_label.setText("Password");
        auth_password_label.setName("auth_password_label"); // NOI18N
        auth_password_label_box.add(auth_password_label);

        auth_input_layout_box.add(auth_password_label_box);

        auth_password_box.setName("auth_password_box"); // NOI18N
        auth_password_box.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        auth_password_input.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        auth_password_input.setName("auth_password_input"); // NOI18N
        auth_password_input.setPreferredSize(new java.awt.Dimension(300, 30));
        auth_password_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                auth_password_inputKeyPressed(evt);
            }
        });
        auth_password_box.add(auth_password_input);

        auth_input_layout_box.add(auth_password_box);

        auth_forgot_box.setName("auth_forgot_box"); // NOI18N
        auth_forgot_box.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 5));

        auth_forgot_passwd_btn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        auth_forgot_passwd_btn.setText("Forgot password ?");
        auth_forgot_passwd_btn.setActionCommand("Forgot password ?");
        auth_forgot_passwd_btn.setBorder(null);
        auth_forgot_passwd_btn.setContentAreaFilled(false);
        auth_forgot_passwd_btn.setName("auth_forgot_passwd_btn"); // NOI18N
        auth_forgot_passwd_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auth_forgot_passwd_btnActionPerformed(evt);
            }
        });
        auth_forgot_box.add(auth_forgot_passwd_btn);

        auth_input_layout_box.add(auth_forgot_box);

        auth_input_box.add(auth_input_layout_box);

        auth_body.add(auth_input_box);

        auth_error_box.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        auth_error_box.setName("auth_error_box"); // NOI18N
        auth_error_box.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        auth_error_message_label.setForeground(new java.awt.Color(255, 0, 0));
        auth_error_message_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        auth_error_message_label.setName("auth_error_message_label"); // NOI18N
        auth_error_box.add(auth_error_message_label);

        auth_body.add(auth_error_box);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 500;
        gridBagConstraints.ipady = 50;
        getContentPane().add(auth_body, gridBagConstraints);

        auth_footer.setMinimumSize(new java.awt.Dimension(100, 45));
        auth_footer.setName("auth_footer"); // NOI18N
        auth_footer.setPreferredSize(new java.awt.Dimension(100, 45));
        auth_footer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 0));

        auth_signin_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        auth_signin_btn.setText("Sign in");
        auth_signin_btn.setName("auth_signin_btn"); // NOI18N
        auth_signin_btn.setPreferredSize(new java.awt.Dimension(140, 35));
        auth_signin_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auth_signin_btnActionPerformed(evt);
            }
        });
        auth_footer.add(auth_signin_btn);

        auth_cancel_btn.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        auth_cancel_btn.setText("Cancel");
        auth_cancel_btn.setName("auth_cancel_btn"); // NOI18N
        auth_cancel_btn.setPreferredSize(new java.awt.Dimension(140, 35));
        auth_cancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                auth_cancel_btnActionPerformed(evt);
            }
        });
        auth_footer.add(auth_cancel_btn);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 500;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        getContentPane().add(auth_footer, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void auth_forgot_passwd_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auth_forgot_passwd_btnActionPerformed
        forgot_password_dialog.setVisible(true);
    }//GEN-LAST:event_auth_forgot_passwd_btnActionPerformed

    private void auth_signin_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auth_signin_btnActionPerformed
        this.signin();
    }//GEN-LAST:event_auth_signin_btnActionPerformed

    private void auth_cancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_auth_cancel_btnActionPerformed
        this.dispose();
    }//GEN-LAST:event_auth_cancel_btnActionPerformed

    private void auth_password_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_auth_password_inputKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.signin();
        }
    }//GEN-LAST:event_auth_password_inputKeyPressed

    private void signin() {
        if (auth_username_input.getText().isEmpty() && auth_password_input.getText().isEmpty()) {
            auth_error_message_label.setText("Please fill in username and password");
        } else if (auth_username_input.getText().isEmpty()) {
            auth_error_message_label.setText("Please fill in username");
        } else if (auth_password_input.getText().isEmpty()) {
            auth_error_message_label.setText("Please fill in password");
        } else {
            int res;
            res = queue.checkLogin(auth_username_input.getText(), auth_password_input.getPassword());
            System.out.println(res + "");
            switch (res) {
                case 0:
                    auth_error_message_label.setText("No user found");
                    break;
                case 1:
                    auth_error_message_label.setText("Incorrect username or password");
                    break;
                case 2:
                    auth_error_message_label.setText("");
                    MainFrame.setUser(auth_username_input.getText());
                    Queuing.disConnectDb();
                    this.dispose();
                    new MainFrame().setVisible(true);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthenticateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new AuthenticateFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel auth_body;
    private javax.swing.JButton auth_cancel_btn;
    private javax.swing.JPanel auth_error_box;
    private javax.swing.JLabel auth_error_message_label;
    private javax.swing.JPanel auth_footer;
    private javax.swing.JPanel auth_forgot_box;
    private javax.swing.JButton auth_forgot_passwd_btn;
    private javax.swing.JPanel auth_header;
    private javax.swing.JLabel auth_header_image;
    private javax.swing.JPanel auth_input_box;
    private javax.swing.JPanel auth_input_layout_box;
    private javax.swing.JPanel auth_password_box;
    private javax.swing.JPasswordField auth_password_input;
    private javax.swing.JLabel auth_password_label;
    private javax.swing.JPanel auth_password_label_box;
    private javax.swing.JButton auth_signin_btn;
    private javax.swing.JLabel auth_title;
    private javax.swing.JPanel auth_title_box;
    private javax.swing.JPanel auth_username_box;
    private javax.swing.JTextField auth_username_input;
    private javax.swing.JLabel auth_username_label;
    private javax.swing.JPanel auth_username_label_box;
    private javax.swing.JDialog forgot_password_dialog;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}