/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author aksha
 */
public class about_company extends javax.swing.JFrame {

    /**
     * Creates new form about_company
     */
    public about_company() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText(" SB International is an Indian based company established in 2003, engaged in the manufacture and export of high quality \n Equestrian Products and boots in Western Styles.SB International has been honoured with the “Government of India recognized\n Export House” certification by Council for Leather Exports in India. With over a decade of experience and innovation in this\n industry, we are fully equipped for the latest tack business developments, and we always move parallel to the latest business\n trend. This is the reason we are successfully exporting quality tack to leading importers in US with continuous growth in \n goodwill and business.\n\n Excellence, competitive pricing, best quality, prompt delivery, all of them make our business larger & larger, business friends\n more and more. Innovation, maintained Quality and attention to detail have always been and continue to be the essence of \n what we do. For the past so many years we, at SB International are dedicated to design and create superior equestrian \n equipments’. We take great pride in always delivering the best service and product.\n\n We have a large number of satisfied clients, proof of our dedicated service and excellent quality. We pay utmost attention\n to this aspect of our production. We believe that we can only progress if we have satisfied customers, a belief that has paid\n dividends.\n\n Our unit is a wide spread set up with sophisticated infrastructure, well equipped with the latest technology machineries, hi-tech\n facilities, qualified & experienced administrative unit, skilled labour so as to serve good quality products with acceptable prices\n at all times to all our valuable customers offering services to them till the products reaches the door of our customers in good \n condition and time. Our Mission is to become the Supreme Innovator, Supplier & Brand of the Equestrian Industry through our\n hard work and dedication to satisfy our customers with the finest quality of products with timely deliveries and competitive\n prices ensuring long lasting relationship.\n\nWe are exclusively into the production of Western Cowboy Boots, Western Saddles, Western tack products like Headstalls,\n Halters, Breast Collars, Spur Straps, Nose Bands, Reins, Bosals, Girths, Lead Ropes, Nylon Halters, Rugs, Saddle Blankets and\n many more Saddle Accessories. We are also into the production of Western Ladies Bag, Luggage Bag, Belts & Pet Products using high quality leather and latest styles and patterns as per the changes in the market.\n\n ");
        jScrollPane1.setViewportView(jTextArea1);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setText("About the Company.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(419, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(about_company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(about_company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(about_company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(about_company.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about_company().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}