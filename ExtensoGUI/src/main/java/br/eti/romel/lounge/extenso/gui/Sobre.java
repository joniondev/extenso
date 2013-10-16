package br.eti.romel.lounge.extenso.gui;

/**
 * @author Carlos Romel <carlos.romel@gmail.com>
 */
public class Sobre extends javax.swing.JDialog {

    public Sobre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(getRootPane());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog = new javax.swing.JDialog();
        jLabelCopyRight = new javax.swing.JLabel();
        jLabeljExtenso = new javax.swing.JLabel();
        jToggleButtonOk = new javax.swing.JToggleButton();
        jLabelEMail = new javax.swing.JLabel();

        org.jdesktop.layout.GroupLayout jDialogLayout = new org.jdesktop.layout.GroupLayout(jDialog.getContentPane());
        jDialog.getContentPane().setLayout(jDialogLayout);
        jDialogLayout.setHorizontalGroup(
            jDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelCopyRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCopyRight.setText("Copyright(c) 2012 Carlos Romel");

        jLabeljExtenso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeljExtenso.setText("jExtenso");

        jToggleButtonOk.setText("Ok");
        jToggleButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonOkActionPerformed(evt);
            }
        });

        jLabelEMail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEMail.setText("carlos.romel@gmail.com");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelCopyRight, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .add(jLabeljExtenso, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabelEMail, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(layout.createSequentialGroup()
                        .add(75, 75, 75)
                        .add(jToggleButtonOk)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabeljExtenso)
                .add(18, 18, 18)
                .add(jLabelCopyRight)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jLabelEMail)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jToggleButtonOk)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonOkActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButtonOkActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabelCopyRight;
    private javax.swing.JLabel jLabelEMail;
    private javax.swing.JLabel jLabeljExtenso;
    private javax.swing.JToggleButton jToggleButtonOk;
    // End of variables declaration//GEN-END:variables
}