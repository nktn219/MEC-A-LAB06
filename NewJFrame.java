
import javax.swing.JOptionPane;
import javax.swing.Icon;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class NewJFrame extends javax.swing.JFrame {
int monedas = 20;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        play = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lbmonedas = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("adasda");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MAQUINA TRAGAMONEDAS");

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb1.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frutas/corazon.jpg"))); // NOI18N
        jPanel5.add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        lb3.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        lb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frutas/siete.jpg"))); // NOI18N
        jPanel5.add(lb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 100, -1));

        lb2.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frutas/diamante.jpg"))); // NOI18N
        jPanel5.add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frutas/molde.jpg"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        play.setBackground(new java.awt.Color(255, 204, 0));
        play.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        play.setText("Gira la ruleta");
        play.setBorderPainted(false);
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 204, 0));

        lbmonedas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbmonedas.setText("Monedas 20");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(lbmonedas)
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbmonedas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(90, 90, 90))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(play)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(221, 221, 221))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        monedas -= 1;
        int fruta1 = (int)(Math.random()*16)*1;
        int fruta2 = (int)(Math.random()*16)*1;
        int fruta3 = (int)(Math.random()*16)*1;
        Icon manzana = new javax.swing.ImageIcon(getClass().getResource("/frutas/manzana.jpg"));
        Icon cereza = new javax.swing.ImageIcon(getClass().getResource("/frutas/cereza.jpg"));
        Icon campana = new javax.swing.ImageIcon(getClass().getResource("/frutas/campana.jpg"));
        Icon bar = new javax.swing.ImageIcon(getClass().getResource("/frutas/bar.jpg"));
        Icon cerrojo = new javax.swing.ImageIcon(getClass().getResource("/frutas/cerrojo.jpg"));
        Icon corazon = new javax.swing.ImageIcon(getClass().getResource("/frutas/corazon.jpg"));
        Icon diamante = new javax.swing.ImageIcon(getClass().getResource("/frutas/diamante.jpg"));
        Icon mango = new javax.swing.ImageIcon(getClass().getResource("/frutas/mango.jpg"));
        Icon moneda = new javax.swing.ImageIcon(getClass().getResource("/frutas/moneda.jpg"));
        Icon naranja = new javax.swing.ImageIcon(getClass().getResource("/frutas/naranja.jpg"));
        Icon pregunta = new javax.swing.ImageIcon(getClass().getResource("/frutas/pregunta.jpg"));
        Icon sandia = new javax.swing.ImageIcon(getClass().getResource("/frutas/sandia.jpg"));
        Icon siete = new javax.swing.ImageIcon(getClass().getResource("/frutas/siete.jpg"));
        Icon trebol = new javax.swing.ImageIcon(getClass().getResource("/frutas/trebol.jpg"));
        Icon uvas = new javax.swing.ImageIcon(getClass().getResource("/frutas/uvas.jpg"));
        Icon verengena = new javax.swing.ImageIcon(getClass().getResource("/frutas/verengena.jpg"));
        
        switch(fruta1){
                 case 0: lb1.setIcon(manzana);break;
                 case 1: lb1.setIcon(cereza);break;
                 case 2: lb1.setIcon(campana);break;
                 case 3: lb1.setIcon(bar);break;
                 case 4: lb1.setIcon(cerrojo);break;
                 case 5: lb1.setIcon(corazon);break;
                 case 6: lb1.setIcon(diamante);break;
                 case 7: lb1.setIcon(mango);break;
                 case 8: lb1.setIcon(moneda);break;
                 case 9: lb1.setIcon(naranja);break;
                 case 10: lb1.setIcon(pregunta);break;
                 case 11: lb1.setIcon(sandia);break;
                 case 12: lb1.setIcon(siete);break;
                 case 13: lb1.setIcon(trebol);break;
                 case 14: lb1.setIcon(uvas);break;
                 case 15: lb1.setIcon(verengena);break;
                
             }
        switch(fruta2){
                 case 0: lb2.setIcon(manzana);break;
                 case 1: lb2.setIcon(cereza);break;
                 case 2: lb2.setIcon(campana);break;
                 case 3: lb2.setIcon(bar);break;
                 case 4: lb2.setIcon(cerrojo);break;
                 case 5: lb2.setIcon(corazon);break;
                 case 6: lb2.setIcon(diamante);break;
                 case 7: lb2.setIcon(mango);break;
                 case 8: lb2.setIcon(moneda);break;
                 case 9: lb2.setIcon(naranja);break;
                 case 10: lb2.setIcon(pregunta);break;
                 case 11: lb2.setIcon(sandia);break;
                 case 12: lb2.setIcon(siete);break;
                 case 13: lb2.setIcon(trebol);break;
                 case 14: lb2.setIcon(uvas);break;
                 case 15: lb2.setIcon(verengena);break;
                 
                 }
        switch(fruta3){
                 case 0: lb3.setIcon(manzana);break;
                 case 1: lb3.setIcon(cereza);break;
                 case 2: lb3.setIcon(campana);break;
                 case 3: lb3.setIcon(bar);break;
                 case 4: lb3.setIcon(cerrojo);break;
                 case 5: lb3.setIcon(corazon);break;
                 case 6: lb3.setIcon(diamante);break;
                 case 7: lb3.setIcon(mango);break;
                 case 8: lb3.setIcon(moneda);break;
                 case 9: lb3.setIcon(naranja);break;
                 case 10: lb3.setIcon(pregunta);break;
                 case 11: lb3.setIcon(sandia);break;
                 case 12: lb3.setIcon(siete);break;
                 case 13: lb3.setIcon(trebol);break;
                 case 14: lb3.setIcon(uvas);break;
                 case 15: lb3.setIcon(verengena);break;
                
                 }
             
        if(fruta1==fruta2&&fruta2==fruta3){
            switch(fruta1){
                case 0:
                    monedas+=30+1;
                JOptionPane.showMessageDialog(this,"Ganaste 30 monedas");
                break;
                case 1:
                monedas+=50+1;
                JOptionPane.showMessageDialog(this,"Ganaste 50 monedas");
                break;
                case 2:
                    monedas+=100+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 100 monedas");
                    break;
                    case 3:
                    monedas+=10+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 10 monedas");
                    break;
                    case 4:
                    monedas+=20+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 20 monedas");
                    break;
                    case 5:
                    monedas+=40+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 40 monedas");
                    break;
                    case 6:
                    monedas+=60+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 60 monedas");
                    break;
                    case 7:
                    monedas+=70+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 70 monedas");
                    break;
                    case 8:
                    monedas+=80+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 80 monedas");
                    break;
                    case 9:
                    monedas+=90+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 90 monedas");
                    break;
                    case 10:
                    monedas+=1000+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 1000 monedas");
                    break;
                    case 11:
                    monedas+=500+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 500 monedas");
                    break;
                    case 12:
                    monedas+=150+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 150 monedas");
                    break;
                    case 13:
                    monedas+=130+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 130 monedas");
                    break;
                    case 14:
                    monedas+=5000+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 5000 monedas");
                    break;
                    case 15:
                    monedas+=250+1;
                    JOptionPane.showMessageDialog(this,"Ganaste 250 monedas");
                    break;
                
            }
        }
        
        lbmonedas.setText("MONEDAS "+String.valueOf(monedas));
        if(monedas == 0){
        int numero = JOptionPane.showConfirmDialog(this,"quieres jugar de nuevo","maquina tragamonedas",JOptionPane.YES_NO_OPTION);
        if(numero == 0){
            monedas = 20;
            lbmonedas.setText("MONEDAS "+String.valueOf(monedas));
            }else{
            System.exit(0);
        }
    }//GEN-LAST:event_playActionPerformed
    
    }
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lbmonedas;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
