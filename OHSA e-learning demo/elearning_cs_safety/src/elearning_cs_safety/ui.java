
package elearning_cs_safety;

import java.sql.*;
import java.util.Objects;
import javax.swing.JOptionPane;

public class ui extends javax.swing.JFrame {
int score;
int current;
int qScore;
int sc;
//int incorrectP;
int incorrect;
boolean a;
boolean b;
boolean c;
boolean d;
char A;
char B;
char C;
char D;
char cA;
char cB;
char cC;
char cD;
String sCount;
String totq;
String potqScore;
moduleUi modle = new moduleUi();
    public ui() {
        initComponents();
        sc = 0;
        current = 1;
        qScore = 0;
        test_q();
       sCount = Integer.toString(current - 1);
       lbl_currQ.setText(sCount);
       lbl_qNo.setText(sCount);
       lbl_totQ.setText("" + 6);
        System.out.println(" "+ current);
        //genTot();
        
    }


    public void test_q()
    {
        incorrect = 0;
       txa_q.setText("");
       a = false;
       b = false;
       c = false;
       d = false;
       
    try{ 
        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
        
        try{
        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/elearningDemo", "demo", "demo");
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM DEMO.QA WHERE QNUM = " + current);
       
        while (rs.next()) {
        String question = rs.getString("QUESTION");
        txa_q.append(question);
        a = rs.getBoolean("A");
        b = rs.getBoolean("B");
        c = rs.getBoolean("C");
        d = rs.getBoolean("D");
        //sc = rs.getInt("POTENTIALSCORE");
        //potqScore = Integer.toString(sc);
        }
        }catch(SQLException e){
            System.err.println(e);
        }          
        
     current++;
      }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_answers = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        btn_Next = new javax.swing.JButton();
        btn_Exit = new javax.swing.JButton();
        scrlpn_q = new javax.swing.JScrollPane();
        txa_q = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        lbl_currQ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_totQ = new javax.swing.JLabel();
        pnl_media = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbl_qNo = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCheckBox1.setText("A");

        jCheckBox2.setText("B");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setText("C");

        jCheckBox4.setText("D");

        jLabel1.setText("Tick all answers that apply");

        javax.swing.GroupLayout pnl_answersLayout = new javax.swing.GroupLayout(pnl_answers);
        pnl_answers.setLayout(pnl_answersLayout);
        pnl_answersLayout.setHorizontalGroup(
            pnl_answersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_answersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_answersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox4)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_answersLayout.setVerticalGroup(
            pnl_answersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_answersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox4)
                .addGap(22, 22, 22))
        );

        btn_Next.setText("Next");
        btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextActionPerformed(evt);
            }
        });

        btn_Exit.setText("Exit");
        btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExitActionPerformed(evt);
            }
        });

        txa_q.setEditable(false);
        txa_q.setColumns(20);
        txa_q.setRows(5);
        txa_q.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        scrlpn_q.setViewportView(txa_q);

        jLabel2.setText("Question");

        lbl_currQ.setText("jLabel3");

        jLabel4.setText("/");

        lbl_totQ.setText("jLabel5");

        jLabel3.setText("NOTE: many bugs are still present in the code, use for prototyping and proof of concept only");

        javax.swing.GroupLayout pnl_mediaLayout = new javax.swing.GroupLayout(pnl_media);
        pnl_media.setLayout(pnl_mediaLayout);
        pnl_mediaLayout.setHorizontalGroup(
            pnl_mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mediaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addContainerGap(102, Short.MAX_VALUE))
        );
        pnl_mediaLayout.setVerticalGroup(
            pnl_mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mediaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbl_qNo.setText("0");

        btnCheck.setText("Check Answer");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        jLabel5.setText("Check answer button is required");

        jLabel6.setText("Program will throw incorrect values if not used");

        jLabel7.setText("can be debugged and fixed in the final product");

        jMenu1.setText("Menu");

        jMenuItem1.setText("Main Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scrlpn_q))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_qNo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(pnl_media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(124, 124, 124)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_answers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_currQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCheck))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_totQ)
                                    .addGap(83, 83, 83)
                                    .addComponent(btn_Exit)
                                    .addGap(28, 28, 28)
                                    .addComponent(btn_Next)))
                            .addComponent(jLabel7))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl_answers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCheck)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Next)
                            .addComponent(btn_Exit)
                            .addComponent(lbl_currQ)
                            .addComponent(jLabel4)
                            .addComponent(lbl_totQ)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_qNo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(scrlpn_q)
                        .addGap(4, 4, 4)
                        .addComponent(pnl_media, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void genCbool(){
        
        if (jCheckBox1.isSelected()) {
            cA = 'a';
            }
        else{
            cA = 'g';
        }
        if (jCheckBox2.isSelected()) {
            cB = 'b';
            }
        else{
            cB = 'g';
        }
        if (jCheckBox3.isSelected()) {
            cC = 'c';
        }
        else{
            cC = 'g';
       }
        if (jCheckBox4.isSelected()) {
            cD = 'd';
        }
        else{
            cD = 'g';
       }
    }
    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    
       
    private void btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextActionPerformed
        //bkgSetVar();
        //genCbool();
        //System.out.println(" "+ cC + c);
        if(incorrect >0 )
        { 
        if (sc == qScore) {
           
            score++;
            test_q();
            sCount = Integer.toString(current - 1);
            lbl_currQ.setText(sCount);
            lbl_qNo.setText(sCount);
           
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "incorrect");
        }
        if ((current-1) > 6) {
            JOptionPane.showMessageDialog(null, "the quiz is now complete");
            this.dispose();
            modle.setVisible(true);
        }
        //System.out.println(" " + potqScore);
        System.out.println("\n"+ sc);
        System.out.println("\n" + qScore);
        System.out.println("\n" + score);
        sc = 0;
        qScore = 0;
    
    }//GEN-LAST:event_btn_NextActionPerformed

    private void btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_ExitActionPerformed

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        genCbool();
        bkgSetVar();
        inCrrct();
        checkAns();
    }//GEN-LAST:event_btnCheckActionPerformed
    public void inCrrct(){
        if (A == 'f' && cA == 'g') {
            incorrect = incorrect+1;
        }
        if (B == 'f' && cB == 'g') {
            incorrect = incorrect+1;
        }
        if (C == 'f' && cC == 'g') {
            incorrect = incorrect+1;
        }
        if (D == 'f' && cD == 'g') {
            incorrect = incorrect+1;
        }
        
    }
    public void checkAns(){
        if (Objects.equals(A, cA)) {
            qScore++;
        }
        if (Objects.equals(B, cB) ) {
            qScore++;
        }
        if (Objects.equals(C, cC)) {
            qScore++;
        }
        if (Objects.equals(D, cD)) {
            qScore++;
        }
    }
    private void bkgSetVar(){
        if (a == true) {
            A = 'a';
            sc = sc + 1;
        }
        else{
            A = 'f';
           // incorrectP = incorrectP + 1;
            
        }
        if (b == true) {
            B = 'b';
            sc = sc + 1;
        }
        else{
            B = 'f';
         //   incorrectP = incorrectP + 1;
           
        }
        if (c == true) {
            C = 'c';
            sc = sc + 1;
        }else{
            C = 'f';
        //    incorrectP = incorrectP + 1;
        }
        if (d == true) {
            D = 'd';
            sc = sc + 1;
        }
        else{
            D = 'f';
       //    incorrectP = incorrectP + 1;
        }
    }
  
    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btn_Exit;
    private javax.swing.JButton btn_Next;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lbl_currQ;
    private javax.swing.JLabel lbl_qNo;
    private javax.swing.JLabel lbl_totQ;
    private javax.swing.JPanel pnl_answers;
    private javax.swing.JPanel pnl_media;
    private javax.swing.JScrollPane scrlpn_q;
    private javax.swing.JTextArea txa_q;
    // End of variables declaration//GEN-END:variables
}
