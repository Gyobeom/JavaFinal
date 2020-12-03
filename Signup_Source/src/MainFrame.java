/**
 *
 * @author Jaehyun
 */
import java.util.Vector;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    DB_MAN DBM = new DB_MAN();
    String strSQL = "Select * From UserInfo";
    boolean dup = false; //중복확인을 위한 변수
    
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblSignup = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblPW = new javax.swing.JLabel();
        lblConfirmPW = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnDup = new javax.swing.JButton();
        lblGender = new javax.swing.JLabel();
        cbGender = new javax.swing.JComboBox<>();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSignup = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        ConfirmPassword = new javax.swing.JPasswordField();
        lblName1 = new javax.swing.JLabel();
        Member = new javax.swing.JRadioButton();
        Student = new javax.swing.JRadioButton();
        Readymember = new javax.swing.JRadioButton();
        lblName2 = new javax.swing.JLabel();
        swim = new javax.swing.JCheckBox();
        game = new javax.swing.JCheckBox();
        golf = new javax.swing.JCheckBox();
        ski = new javax.swing.JCheckBox();
        book = new javax.swing.JCheckBox();
        tennis = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSignup.setText("Sign Up");

        lblID.setText("ID");

        lblPW.setText("Password");

        lblConfirmPW.setText("Confirm Password");

        lblName.setText("Name");

        btnDup.setText("중복확인");
        btnDup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDupActionPerformed(evt);
            }
        });

        lblGender.setText("Gender");

        cbGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        lblEmail.setText("Email");

        btnSignup.setText("회원가입");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        lblName1.setText("Member status");

        buttonGroup1.add(Member);
        Member.setText("정회원");

        buttonGroup1.add(Student);
        Student.setText("학생회원");

        buttonGroup1.add(Readymember);
        Readymember.setText("준회원");

        lblName2.setText("Hobby");

        swim.setText("수영");

        game.setText("게임");

        golf.setText("골프");

        ski.setText("스키");

        book.setText("독서");

        tennis.setText("테니스");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblPW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblConfirmPW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ConfirmPassword)
                                    .addComponent(Password)
                                    .addComponent(txtID)
                                    .addComponent(txtName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Member)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Readymember)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Student)))
                                .addGap(18, 18, 18)
                                .addComponent(btnDup))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(swim)
                                    .addComponent(ski))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(game)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(golf))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(book)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tennis)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(lblSignup))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSignup)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSignup)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDup))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPW)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPW)
                    .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Readymember)
                        .addComponent(Student))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName1)
                        .addComponent(Member)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(swim)
                    .addComponent(lblName2)
                    .addComponent(game)
                    .addComponent(golf))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book)
                    .addComponent(tennis, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ski))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(cbGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignup))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        String pw = "";
        String pw1 = "";
        String hobby;
        byte checkbit = 0000;
        char[] password = Password.getPassword();
        char[] confirmPassword = ConfirmPassword.getPassword();             //PasswordField의 데이터를 가져오기위해
        for(char c : password){                                             //배열에 저장하고 for문으로 String형식으로 변환하는 과정
            Character.toString(c);
            pw += (pw.equals("")) ? ""+c+"" : ""+c+"";
        }
        for(char c : confirmPassword){
            Character.toString(c);
            pw1 += (pw1.equals("")) ? ""+c+"" : ""+c+"";
        }
        
        
        strSQL = null;
        strSQL = "Insert Into UserInfo Values (";
        strSQL += "'"+txtID.getText()+"', ";
        strSQL += "'"+pw+"', ";
        strSQL += "'"+txtName.getText()+"', ";
        if(Member.isSelected()){
            strSQL += "'"+"정회원"+"', ";
        }else if(Readymember.isSelected()){
            strSQL += "'"+"준회원"+"', ";
        }else if(Student.isSelected()){
            strSQL += "'"+"학생회원"+"', ";
        }       
        strSQL += "'"+txtEmail.getText()+"', ";
        strSQL += "'"+cbGender.getSelectedItem()+"',";
        if(swim.isSelected()) checkbit = (byte)(checkbit | 1);
        if(game.isSelected()) checkbit = (byte)(checkbit | 2);
        if(golf.isSelected()) checkbit = (byte)(checkbit | 4);
        if(ski.isSelected()) checkbit = (byte)(checkbit | 8);
        if(book.isSelected()) checkbit = (byte)(checkbit | 16);
        if(tennis.isSelected()) checkbit = (byte)(checkbit | 32);
        hobby = Integer.toString(checkbit);
        strSQL += "'"+hobby+"')";
        
        
        
        if(dup==true){
            if(pw.equals(pw1)){ 
                try{                                                            //중복체크시 true고 pw와 p1이 동일하다면 db에 데이터를 저장해주고
                DBM.dbOpen();                                                   //dup을 false로 변경
                DBM.DB_stmt.executeUpdate(strSQL);
                strSQL = "Select * From UserInfo";
                DBM.dbClose();
                dup = false;
                }catch(Exception e){
                    System.out.println("SQLException : "+e.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.");
            }
        }else {
            JOptionPane.showMessageDialog(null, "아이디 중복확인을 해주세요.");
        }
        

    }//GEN-LAST:event_btnSignupActionPerformed

    private void btnDupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDupActionPerformed
        strSQL = "Select ID From UserInfo";
        
        try{
            DBM.dbOpen();                                                       
            DBM.DB_stmt.executeUpdate(strSQL);                                  
            strSQL = "Select * From UserInfo Where ID = '"+txtID.getText()+"'"; //duplicate에 현재 입력된 id를 select문에 넣어 보내준다.
            duplicate(strSQL);
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }//GEN-LAST:event_btnDupActionPerformed
    
    //중복 체크 함수
    public void duplicate(String strQuery){
        String strOutput = "";
        
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                strOutput = DBM.DB_rs.getString("ID");
            }
            DBM.DB_rs.close();                                              
            if(strOutput.equals("")){                                           
                JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.");
                dup = true;
            }else{
                JOptionPane.showMessageDialog(null, "중복된 아이디입니다.");
            }
        }catch (Exception e){
            System.out.println("SQLException : "+e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JRadioButton Member;
    private javax.swing.JPasswordField Password;
    private javax.swing.JRadioButton Readymember;
    private javax.swing.JRadioButton Student;
    private javax.swing.JCheckBox book;
    private javax.swing.JButton btnDup;
    private javax.swing.JButton btnSignup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbGender;
    private javax.swing.JCheckBox game;
    private javax.swing.JCheckBox golf;
    private javax.swing.JLabel lblConfirmPW;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblPW;
    private javax.swing.JLabel lblSignup;
    private javax.swing.JCheckBox ski;
    private javax.swing.JCheckBox swim;
    private javax.swing.JCheckBox tennis;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
