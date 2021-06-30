package calculadora;

import java.awt.Color;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author angel
 */
public class Calculadora extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript");

    public Calculadora() {
        initComponents();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtOperacion = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIgual = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(157, 179, 237));

        txtOperacion.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 28)); // NOI18N
        txtOperacion.setForeground(new java.awt.Color(115, 132, 148));
        txtOperacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtOperacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtResultado.setBackground(new java.awt.Color(102, 102, 102));
        txtResultado.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 36)); // NOI18N
        txtResultado.setForeground(new java.awt.Color(81, 81, 81));
        txtResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        btnCambiar.setBackground(new java.awt.Color(157, 179, 237));
        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lightMode.jpg"))); // NOI18N
        btnCambiar.setFocusPainted(false);
        btnCambiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 41)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(206, 232, 242));
        jLabel1.setText("×");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addComponent(txtOperacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(txtOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));

        jPanel2.setBackground(new java.awt.Color(249, 249, 249));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIgual.setBackground(new java.awt.Color(255, 255, 255));
        btnIgual.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(81, 81, 81));
        btnIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btnIgual.setText("=");
        btnIgual.setToolTipText("");
        btnIgual.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnIgual.setFocusPainted(false);
        btnIgual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIgual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel2.add(btnIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 90, 90));

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn7.setForeground(new java.awt.Color(81, 81, 81));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn7.setText("7");
        btn7.setToolTipText("");
        btn7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn7.setFocusPainted(false);
        btn7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 90));

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn8.setForeground(new java.awt.Color(81, 81, 81));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn8.setText("8");
        btn8.setToolTipText("");
        btn8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn8.setFocusPainted(false);
        btn8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 90));

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn9.setForeground(new java.awt.Color(81, 81, 81));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn9.setText("9");
        btn9.setToolTipText("");
        btn9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn9.setFocusPainted(false);
        btn9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 90, 90));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn4.setForeground(new java.awt.Color(81, 81, 81));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn4.setText("4");
        btn4.setToolTipText("");
        btn4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn4.setFocusPainted(false);
        btn4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 90, 90));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn5.setForeground(new java.awt.Color(81, 81, 81));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn5.setText("5");
        btn5.setToolTipText("");
        btn5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn5.setFocusPainted(false);
        btn5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 90, 90));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn6.setForeground(new java.awt.Color(81, 81, 81));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn6.setText("6");
        btn6.setToolTipText("");
        btn6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn6.setFocusPainted(false);
        btn6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 90, 90));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn1.setForeground(new java.awt.Color(81, 81, 81));
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn1.setText("1");
        btn1.setToolTipText("");
        btn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn1.setFocusPainted(false);
        btn1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 90, 90));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn2.setForeground(new java.awt.Color(81, 81, 81));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn2.setText("2");
        btn2.setToolTipText("");
        btn2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn2.setFocusPainted(false);
        btn2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 90, 90));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn3.setForeground(new java.awt.Color(81, 81, 81));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn3.setText("3");
        btn3.setToolTipText("");
        btn3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn3.setFocusPainted(false);
        btn3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 90, 90));

        btn0.setBackground(new java.awt.Color(255, 255, 255));
        btn0.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btn0.setForeground(new java.awt.Color(81, 81, 81));
        btn0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btn0.setText("0");
        btn0.setToolTipText("");
        btn0.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btn0.setFocusPainted(false);
        btn0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 90, 90));

        btnPunto.setBackground(new java.awt.Color(255, 255, 255));
        btnPunto.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        btnPunto.setForeground(new java.awt.Color(81, 81, 81));
        btnPunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1.jpg"))); // NOI18N
        btnPunto.setText(".");
        btnPunto.setToolTipText("");
        btnPunto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnPunto.setFocusPainted(false);
        btnPunto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPunto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn1-pressed.jpg"))); // NOI18N
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel2.add(btnPunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 90, 90));

        btnSumar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnSumar.setForeground(new java.awt.Color(102, 102, 102));
        btnSumar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.jpg"))); // NOI18N
        btnSumar.setText("+");
        btnSumar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSumar.setFocusPainted(false);
        btnSumar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSumar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2-pressed.jpg"))); // NOI18N
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        jPanel2.add(btnSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 130, 60));

        btnLimpiar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(102, 102, 102));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.jpg"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnLimpiar.setFocusPainted(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2-pressed.jpg"))); // NOI18N
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 130, 60));

        btnDividir.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnDividir.setForeground(new java.awt.Color(102, 102, 102));
        btnDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.jpg"))); // NOI18N
        btnDividir.setText("/");
        btnDividir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDividir.setFocusPainted(false);
        btnDividir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDividir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2-pressed.jpg"))); // NOI18N
        btnDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividirActionPerformed(evt);
            }
        });
        jPanel2.add(btnDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 130, 60));

        btnMultiplicar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnMultiplicar.setForeground(new java.awt.Color(102, 102, 102));
        btnMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.jpg"))); // NOI18N
        btnMultiplicar.setText("x");
        btnMultiplicar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMultiplicar.setFocusPainted(false);
        btnMultiplicar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMultiplicar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2-pressed.jpg"))); // NOI18N
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 130, 60));

        btnRestar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnRestar.setForeground(new java.awt.Color(102, 102, 102));
        btnRestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.jpg"))); // NOI18N
        btnRestar.setText("-");
        btnRestar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnRestar.setFocusPainted(false);
        btnRestar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRestar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2-pressed.jpg"))); // NOI18N
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 130, 60));

        btnBorrar.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(102, 102, 102));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2.jpg"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBorrar.setFocusPainted(false);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn2-pressed.jpg"))); // NOI18N
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 130, 60));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 400, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try {
            String resultado = se.eval(txtOperacion.getText()).toString();
            txtResultado.setText(resultado);
        } catch (Exception ex) {
            btnLimpiar.doClick();
        }
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        addNumero("7");
        btnIgual.doClick();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        addNumero("8");
        btnIgual.doClick();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        addNumero("9");
        btnIgual.doClick();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        addNumero("4");
        btnIgual.doClick();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        addNumero("5");
        btnIgual.doClick();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        addNumero("6");
        btnIgual.doClick();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        addNumero("1");
        btnIgual.doClick();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        addNumero("2");
        btnIgual.doClick();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        addNumero("3");
        btnIgual.doClick();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        addNumero("0");
        btnIgual.doClick();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        addNumero(".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try {
            String texto = txtOperacion.getText().substring(0, txtOperacion.getText().length() - 1);
            txtOperacion.setText(texto);
            btnIgual.doClick();
        } catch (StringIndexOutOfBoundsException e) {
        }   
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtOperacion.setText("");
        txtResultado.setText(""); 
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividirActionPerformed
        addNumero("/");
    }//GEN-LAST:event_btnDividirActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        addNumero("*");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        addNumero("-");
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        addNumero("+");
    }//GEN-LAST:event_btnSumarActionPerformed

    boolean darkMode = false;
    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        if(!darkMode){
            jPanel1.setBackground(Color.decode("#172d67"));
            jPanel2.setBackground(Color.decode("#050c26"));
            txtOperacion.setForeground(Color.decode("#c8daee"));
            txtResultado.setForeground(Color.decode("#f9fbff"));
            btnCambiar.setIcon(new ImageIcon(getClass().getResource("/images/darkMode.jpg")));

            cambiarBtn1DarkMode(btn0);
            cambiarBtn1DarkMode(btn1);
            cambiarBtn1DarkMode(btn2);
            cambiarBtn1DarkMode(btn3);
            cambiarBtn1DarkMode(btn4);
            cambiarBtn1DarkMode(btn5);
            cambiarBtn1DarkMode(btn6);
            cambiarBtn1DarkMode(btn7);
            cambiarBtn1DarkMode(btn8);
            cambiarBtn1DarkMode(btn9);
            cambiarBtn1DarkMode(btnPunto);
            cambiarBtn1DarkMode(btnIgual);

            cambiarBtn2DarkMode(btnLimpiar);
            cambiarBtn2DarkMode(btnBorrar);
            cambiarBtn2DarkMode(btnDividir);
            cambiarBtn2DarkMode(btnMultiplicar);
            cambiarBtn2DarkMode(btnRestar);
            cambiarBtn2DarkMode(btnSumar);
            darkMode = true;
        } else {
            Calculadora ventana = new Calculadora();
            this.dispose();
            ventana.setVisible(true);
            
        }
        
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }
    
    public void addNumero(String digito){
        txtOperacion.setText(txtOperacion.getText() + digito);
    }
    public void cambiarBtn1DarkMode(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn1-dark.jpg")));
        btn.setForeground(Color.decode("#8b9cca"));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn1-dark.jpg")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn1-dark-pressed.jpg")));
    }
    public void cambiarBtn2DarkMode(JButton btn){
        btn.setIcon(new ImageIcon(getClass().getResource("/images/btn2-dark.jpg")));
        btn.setForeground(Color.decode("#8b9cca"));
        btn.setPressedIcon(new ImageIcon(getClass().getResource("/images/btn2-dark.jpg")));
        btn.setRolloverIcon(new ImageIcon(getClass().getResource("/images/btn2-dark-pressed.jpg")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtOperacion;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
