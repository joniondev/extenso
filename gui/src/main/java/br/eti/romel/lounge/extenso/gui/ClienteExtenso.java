/*
 * Copyright(c) 2012 Carlos Romel Pereira da Silva <carlos.romel@gmail.com>
 */
/*
 * TODO:
 * 1. Embutir a biblioteca swing-layout-1.0.3.jar na solução final do projeto;
 * 2. Configurar o JFormattedText para forçar o uso da máscara de valores
 *    monetários.
 * 3. Mostrar os detalhes da composição do número, destacando os valores
 *    absolutos e ralativos, classes e detalhes especiais.
 * 4. Gravar (JavaDB) os valores informados pelo usuário, permitindo sua
 *    reutilização futura.
 * 5. Acrescentar uma aba, contendo o código fonte para revisão.
 */
package br.eti.romel.lounge.extenso.gui;

import br.eti.romel.lounge.extenso.Extenso;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.JFrame;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class ClienteExtenso extends javax.swing.JFrame {
    final DecimalFormat df = new DecimalFormat("R$ ###,###.00");

    public ClienteExtenso() {
        initComponents();
        this.setLocationRelativeTo(getRootPane());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonTraduzir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaExtenso = new javax.swing.JTextArea();
        jFormattedTextFieldValorMonetario = new javax.swing.JFormattedTextField();
        jLabelValorMonetario = new javax.swing.JLabel();
        jLabelValorFormatado = new javax.swing.JLabel();
        jButtonLimpar = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuArquivo = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Extenso de valores monetários");

        jButtonTraduzir.setText("Traduzir");
        jButtonTraduzir.setToolTipText("Clique para traduzir o valor em seu extenso.");
        jButtonTraduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTraduzirActionPerformed1(evt);
            }
        });

        jTextAreaExtenso.setEditable(false);
        jTextAreaExtenso.setColumns(20);
        jTextAreaExtenso.setLineWrap(true);
        jTextAreaExtenso.setRows(5);
        jTextAreaExtenso.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaExtenso);

        jFormattedTextFieldValorMonetario.setColumns(69);
        jFormattedTextFieldValorMonetario.setToolTipText("Informe um valor, por exemplo: 123.45");
        jFormattedTextFieldValorMonetario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTraduzirActionPerformed(evt);
            }
        });
        jFormattedTextFieldValorMonetario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextFieldValorMonetarioFocusLost(evt);
            }
        });

        jLabelValorMonetario.setText("Informe um valor monetário:");

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        jMenuArquivo.setText("Arquivo");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.setToolTipText("Encerrar aplicação.");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuArquivo.add(jMenuItemSair);

        jMenuBar.add(jMenuArquivo);

        jMenuAjuda.setText("Ajuda");

        jMenuItemSobre.setText("Sobre...");
        jMenuItemSobre.setToolTipText("Informações sobre o autor.");
        jMenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSobreActionPerformed(evt);
            }
        });
        jMenuAjuda.add(jMenuItemSobre);

        jMenuBar.add(jMenuAjuda);

        setJMenuBar(jMenuBar);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabelValorMonetario)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1)
                            .add(jFormattedTextFieldValorMonetario, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabelValorFormatado, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButtonTraduzir)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButtonLimpar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabelValorMonetario)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jFormattedTextFieldValorMonetario, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabelValorFormatado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 31, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonLimpar)
                    .add(jButtonTraduzir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTraduzirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTraduzirActionPerformed
        if (!jFormattedTextFieldValorMonetario.getText().isEmpty()) {
            final String valorInformado = jFormattedTextFieldValorMonetario.getText();
            final BigDecimal valor = new BigDecimal(valorInformado.replace(",", "."));
            final String extenso = new Extenso(valor).toStringFormatted();
            jLabelValorFormatado.setText(df.format(valor));
            jTextAreaExtenso.setText(extenso);
        }

        jFormattedTextFieldValorMonetario.requestFocusInWindow();
    }//GEN-LAST:event_jButtonTraduzirActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jFormattedTextFieldValorMonetarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextFieldValorMonetarioFocusLost
        jButtonTraduzirActionPerformed(null);
    }//GEN-LAST:event_jFormattedTextFieldValorMonetarioFocusLost

    private void jMenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSobreActionPerformed

        Sobre sobre = new Sobre(new JFrame(), true);
        sobre.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                this.windowDeactivated(null);
            }
        });

        sobre.setVisible(true);
    }//GEN-LAST:event_jMenuItemSobreActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        jTextAreaExtenso.setText("");
        jLabelValorFormatado.setText("");
        jFormattedTextFieldValorMonetario.setText("");
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonTraduzirActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTraduzirActionPerformed1
    }//GEN-LAST:event_jButtonTraduzirActionPerformed1

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ClienteExtenso().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonTraduzir;
    private javax.swing.JFormattedTextField jFormattedTextFieldValorMonetario;
    private javax.swing.JLabel jLabelValorFormatado;
    private javax.swing.JLabel jLabelValorMonetario;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenu jMenuArquivo;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemSobre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaExtenso;
    // End of variables declaration//GEN-END:variables

}
