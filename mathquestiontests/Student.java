package mathquestiontests;

/*
File Name: Student.java
Purpose: To recieve math questions and send answers
Author: Ivon Harris
Date last Worked on: 22/11/21
Version: 1
Notes:
        ToDo:
        -exit button

*/
//Imports for sockets and comunication between teacher + student      
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.net.SocketException;

import javax.swing.JOptionPane;
        
        
public class Student extends javax.swing.JFrame 
{
    //declare stream and socket varibles
    static Socket socket;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream;
    static String ans;
    

    public Student() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePane = new javax.swing.JPanel();
        studentLabel = new javax.swing.JLabel();
        answerPanel = new javax.swing.JPanel();
        bluePanel = new javax.swing.JPanel();
        submitLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        questionTextField = new javax.swing.JTextField();
        answerTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        studentExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePane.setBackground(new java.awt.Color(0, 0, 255));
        titlePane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        studentLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentLabel.setForeground(new java.awt.Color(255, 255, 255));
        studentLabel.setText("Student");

        javax.swing.GroupLayout titlePaneLayout = new javax.swing.GroupLayout(titlePane);
        titlePane.setLayout(titlePaneLayout);
        titlePaneLayout.setHorizontalGroup(
            titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePaneLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(studentLabel)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        titlePaneLayout.setVerticalGroup(
            titlePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePaneLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(studentLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        answerPanel.setBackground(new java.awt.Color(218, 229, 240));
        answerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bluePanel.setBackground(new java.awt.Color(0, 0, 255));

        submitLabel.setBackground(new java.awt.Color(0, 0, 255));
        submitLabel.setForeground(new java.awt.Color(255, 255, 255));
        submitLabel.setText("Enter your answer then click Submit");

        javax.swing.GroupLayout bluePanelLayout = new javax.swing.GroupLayout(bluePanel);
        bluePanel.setLayout(bluePanelLayout);
        bluePanelLayout.setHorizontalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(submitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bluePanelLayout.setVerticalGroup(
            bluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bluePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        questionLabel.setText("Question:");

        answerLabel.setText("Your Answer:");

        questionTextField.setEditable(false);
        questionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionTextFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.setEnabled(false);
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout answerPanelLayout = new javax.swing.GroupLayout(answerPanel);
        answerPanel.setLayout(answerPanelLayout);
        answerPanelLayout.setHorizontalGroup(
            answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bluePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(answerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(answerPanelLayout.createSequentialGroup()
                        .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLabel)
                            .addComponent(answerLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(answerTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(questionTextField)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(submitButton)))
                .addContainerGap())
        );
        answerPanelLayout.setVerticalGroup(
            answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, answerPanelLayout.createSequentialGroup()
                .addComponent(bluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(questionLabel)
                    .addComponent(questionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answerLabel)
                    .addComponent(answerTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addContainerGap())
        );

        studentExitButton.setText("Exit");
        studentExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(studentExitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(answerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(studentExitButton)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void questionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_questionTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        //Send answer back to Teacher
        
        try
        {
            String messageOut = "";
            String studentAns = answerTextField.getText().trim();
            if (studentAns.equals(ans))
            {
                messageOut = "y";  
            }   
            else if (studentAns != ans)
            {
                messageOut= "n";
            }
                
            dataOutputStream.writeUTF(messageOut);
            questionTextField.setText("");
            answerTextField.setText("");
            submitButton.setEnabled(false);

        }
        catch (Exception e)
        {
            String exceptionStr = "Student Error " + e.getMessage();
            JOptionPane.showMessageDialog(null, exceptionStr, 
            "Student Send Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_submitButtonActionPerformed

    private void studentExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentExitButtonActionPerformed
        // Close frame
        System.exit(0);
    }//GEN-LAST:event_studentExitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
        
        //Set up socket
        try
        {
            socket = new Socket("127.0.0.1", 1201);  
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while(true)
            {                
                String messageIn = dataInputStream.readUTF();
                System.out.println(messageIn);
                String splitQuest = getSplitData(messageIn,0);
                ans = getSplitData(messageIn,1);

                questionTextField.setText(splitQuest);
                submitButton.setEnabled(true);
            }
                     
        }
        catch (SocketException se)
        {
            String exceptionStr = "Student Socket Error " + se.getMessage();
            JOptionPane.showMessageDialog(null, exceptionStr, 
            "Socket Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception e)
        {
            String exceptionStr = "Student Server Error " + e.getMessage();
            JOptionPane.showMessageDialog(null, exceptionStr, 
            "Server Error", JOptionPane.ERROR_MESSAGE);
        }      
        
    }
    private static String getSplitData(String message, int count)
    {
        String newMessage = message.split("-")[count];
        return newMessage;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerLabel;
    private javax.swing.JPanel answerPanel;
    private javax.swing.JTextField answerTextField;
    private javax.swing.JPanel bluePanel;
    private javax.swing.JLabel questionLabel;
    private static javax.swing.JTextField questionTextField;
    private javax.swing.JButton studentExitButton;
    private javax.swing.JLabel studentLabel;
    private static javax.swing.JButton submitButton;
    private javax.swing.JLabel submitLabel;
    private javax.swing.JPanel titlePane;
    // End of variables declaration//GEN-END:variables
}
