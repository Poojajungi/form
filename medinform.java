/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalstore;

/**
 *
 * @author poojajungi
 */
public class medinform extends javax.swing.JFrame {

    /**
     * Creates new form medinform
     */
    public medinform() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pro_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pac = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mf_g = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mr_p = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        exp_date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rat = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        amt = new javax.swing.JTextField();
        canbtn = new javax.swing.JButton();
        savebtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Medicine Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 20, 360, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Product Name :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 160, 180, 30);
        getContentPane().add(pro_name);
        pro_name.setBounds(250, 160, 390, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Qty :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 110, 80, 30);
        getContentPane().add(qty);
        qty.setBounds(250, 110, 390, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Pack :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 220, 80, 30);
        getContentPane().add(pac);
        pac.setBounds(250, 220, 390, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Mfg :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 280, 60, 30);
        getContentPane().add(mf_g);
        mf_g.setBounds(250, 280, 390, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("MRP :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 340, 80, 30);
        getContentPane().add(mr_p);
        mr_p.setBounds(250, 340, 390, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Expiry Date :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 390, 150, 30);
        getContentPane().add(exp_date);
        exp_date.setBounds(250, 390, 390, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Rate :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(130, 440, 80, 30);
        getContentPane().add(rat);
        rat.setBounds(250, 440, 390, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Amount :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(100, 490, 100, 30);
        getContentPane().add(amt);
        amt.setBounds(250, 490, 390, 30);

        canbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        canbtn.setText("Cancel");
        getContentPane().add(canbtn);
        canbtn.setBounds(360, 570, 120, 40);

        savebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        savebtn.setText("Save");
        getContentPane().add(savebtn);
        savebtn.setBounds(200, 570, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(medinform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medinform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medinform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medinform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medinform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amt;
    private javax.swing.JButton canbtn;
    private javax.swing.JTextField exp_date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mf_g;
    private javax.swing.JTextField mr_p;
    private javax.swing.JTextField pac;
    private javax.swing.JTextField pro_name;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField rat;
    private javax.swing.JButton savebtn;
    // End of variables declaration//GEN-END:variables
}
