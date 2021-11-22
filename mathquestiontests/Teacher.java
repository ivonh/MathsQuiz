/*
File Name: Teacher.java
Purpose: Create and sort the math questions and answers.
Author: Ivon Harris
Date last Worked on: 22//21
Version: 1.17
Notes:
        To do:
        -choose and create sorting types for table
        -add incorrect answers to linked list
        -ability to sort binary tree
         */
package mathquestiontests;

//Imports for connection to Student window
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import javax.swing.JOptionPane;

//import linked list for incorrect answers
import java.util.LinkedList;

//imports for table model
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
//import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class Teacher extends javax.swing.JFrame 
{
    // set varibles for student window connections
    static ServerSocket serverSocket;
    static Socket socket;
    static DataInputStream dataInputStream;
    static DataOutputStream dataOutputStream; 
//    static List<Questions> mathList = new ArrayList<Questions>(); 
    private DefaultTableModel questTableModel;
    
    public Teacher() {
                
        //create tableModel for questions
        String [] qustColName = new String [] {"LOP", "op", "ROP", "=", "ANS"};
        //Object[] defaultDataQuest = {"", "", "", "", ""};
        
        questTableModel = new DefaultTableModel();
        questTableModel.setColumnIdentifiers(qustColName);
        //questTableModel.addRow(defaultDataQuest);
        
        initComponents();
        
        //resizeQuestTable();

    }
    void displayTable(){
        DefaultTableModel model =(DefaultTableModel) questionsTable.getModel();
        
        for (int i = 0; i <model.getRowCount(); i++) {
            //Object object = arr[i];
            model.removeRow(i);
        }
        for (int i = 0; i < mathList.size(); i++) {
            Object[] newDataRow = {mathList.get(i).leftOperand(), mathList.get(i).Operator(), mathList.get(i).rightOperand(), "=", mathList.get(i).answer()};
                
            System.out.println("newDataRow="+newDataRow.toString());
            model.addRow(newDataRow);
        }
      //   Object[] newDataRow = {lOP, operator, rOP, "=", ans};
        
      
    }
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        secSortButton1 = new javax.swing.JButton();
        titleJPane = new javax.swing.JPanel();
        titleJLabel = new javax.swing.JLabel();
        questionMakerPane = new javax.swing.JPanel();
        makerLabel = new javax.swing.JLabel();
        fnumLabel = new javax.swing.JLabel();
        opLabel = new javax.swing.JLabel();
        snumLabel = new javax.swing.JLabel();
        ansLabel = new javax.swing.JLabel();
        firstNumTextField = new javax.swing.JTextField();
        opComboBox = new javax.swing.JComboBox<>();
        sNumTextField = new javax.swing.JTextField();
        ansTextField = new javax.swing.JTextField();
        makerSendButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        questionsTable = new javax.swing.JTable();
        sortPane = new javax.swing.JPanel();
        sortLabel = new javax.swing.JLabel();
        firstSortButton = new javax.swing.JButton();
        secSortButton = new javax.swing.JButton();
        thirSortButton2 = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        linkedPane = new javax.swing.JPanel();
        linkedLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        linkedTextArea = new javax.swing.JTextArea();
        binaryPane = new javax.swing.JPanel();
        binaryLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        binaryTreeTextArea = new javax.swing.JTextArea();
        preOrderPane = new javax.swing.JPanel();
        preOrderLabel = new javax.swing.JLabel();
        inOrderPane = new javax.swing.JPanel();
        inOrderLabel = new javax.swing.JLabel();
        postOrderPane = new javax.swing.JPanel();
        postOrderLabel = new javax.swing.JLabel();
        preOrderDisplayButton = new javax.swing.JButton();
        preOrderSaveButton = new javax.swing.JButton();
        inOrderSaveButton = new javax.swing.JButton();
        inOrderDisplayButton = new javax.swing.JButton();
        postOrderSaveButton = new javax.swing.JButton();
        postOrderDisplayButton = new javax.swing.JButton();

        secSortButton1.setText("2 - Sort Type");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(230, 230, 204));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });

        titleJPane.setBackground(new java.awt.Color(0, 0, 255));
        titleJPane.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        titleJLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleJLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleJLabel.setText("Teacher");

        javax.swing.GroupLayout titleJPaneLayout = new javax.swing.GroupLayout(titleJPane);
        titleJPane.setLayout(titleJPaneLayout);
        titleJPaneLayout.setHorizontalGroup(
            titleJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleJPaneLayout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(titleJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titleJPaneLayout.setVerticalGroup(
            titleJPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleJPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        questionMakerPane.setBackground(new java.awt.Color(218, 229, 240));
        questionMakerPane.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        makerLabel.setText("Enter question, then click Send");

        fnumLabel.setText("First Num:");

        opLabel.setText("Operator");

        snumLabel.setText("Second Num:");

        ansLabel.setText("Answer");

        opComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        opComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opComboBoxActionPerformed(evt);
            }
        });

        ansTextField.setEditable(false);
        ansTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ansTextFieldFocusGained(evt);
            }
        });
        ansTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout questionMakerPaneLayout = new javax.swing.GroupLayout(questionMakerPane);
        questionMakerPane.setLayout(questionMakerPaneLayout);
        questionMakerPaneLayout.setHorizontalGroup(
            questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionMakerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(makerLabel)
                    .addGroup(questionMakerPaneLayout.createSequentialGroup()
                        .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnumLabel)
                            .addComponent(opLabel))
                        .addGap(32, 32, 32)
                        .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(opComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(questionMakerPaneLayout.createSequentialGroup()
                        .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(snumLabel)
                            .addComponent(ansLabel))
                        .addGap(18, 18, 18)
                        .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ansTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        questionMakerPaneLayout.setVerticalGroup(
            questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questionMakerPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(makerLabel)
                .addGap(18, 18, 18)
                .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fnumLabel)
                    .addComponent(firstNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(opComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(snumLabel)
                    .addComponent(sNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(questionMakerPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ansLabel)
                    .addComponent(ansTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        makerSendButton.setText("Send");
        makerSendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makerSendButtonActionPerformed(evt);
            }
        });

        questionsTable.setBackground(new java.awt.Color(218, 229, 240));
        questionsTable.setModel(questTableModel);
        questionsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(questionsTable);

        sortPane.setBackground(new java.awt.Color(218, 229, 240));
        sortPane.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        sortLabel.setText("Sort:");

        firstSortButton.setText("1 - Sort Type");

        secSortButton.setText("2 - Sort Type");

        thirSortButton2.setText("3 - Sort Type");

        javax.swing.GroupLayout sortPaneLayout = new javax.swing.GroupLayout(sortPane);
        sortPane.setLayout(sortPaneLayout);
        sortPaneLayout.setHorizontalGroup(
            sortPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sortLabel)
                .addGap(18, 18, 18)
                .addComponent(firstSortButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(secSortButton)
                .addGap(48, 48, 48)
                .addComponent(thirSortButton2)
                .addGap(19, 19, 19))
        );
        sortPaneLayout.setVerticalGroup(
            sortPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sortPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(firstSortButton)
                    .addComponent(secSortButton)
                    .addComponent(thirSortButton2))
                .addContainerGap())
        );

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        linkedPane.setBackground(new java.awt.Color(218, 229, 240));
        linkedPane.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        linkedLabel.setText("Linked List (of all incorrectly answered exercises):");

        javax.swing.GroupLayout linkedPaneLayout = new javax.swing.GroupLayout(linkedPane);
        linkedPane.setLayout(linkedPaneLayout);
        linkedPaneLayout.setHorizontalGroup(
            linkedPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(linkedPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(linkedLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        linkedPaneLayout.setVerticalGroup(
            linkedPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linkedLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setText("Display List");

        linkedTextArea.setColumns(20);
        linkedTextArea.setRows(5);
        jScrollPane2.setViewportView(linkedTextArea);

        binaryPane.setBackground(new java.awt.Color(218, 229, 240));
        binaryPane.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        binaryLabel.setText("Binary Tree (of all questions - added in the order that they were asked):");

        javax.swing.GroupLayout binaryPaneLayout = new javax.swing.GroupLayout(binaryPane);
        binaryPane.setLayout(binaryPaneLayout);
        binaryPaneLayout.setHorizontalGroup(
            binaryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(binaryPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(binaryLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        binaryPaneLayout.setVerticalGroup(
            binaryPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(binaryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        binaryTreeTextArea.setColumns(20);
        binaryTreeTextArea.setRows(5);
        jScrollPane3.setViewportView(binaryTreeTextArea);

        preOrderPane.setBackground(new java.awt.Color(0, 0, 255));
        preOrderPane.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        preOrderLabel.setForeground(new java.awt.Color(255, 255, 255));
        preOrderLabel.setText("Pre - Order");

        javax.swing.GroupLayout preOrderPaneLayout = new javax.swing.GroupLayout(preOrderPane);
        preOrderPane.setLayout(preOrderPaneLayout);
        preOrderPaneLayout.setHorizontalGroup(
            preOrderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preOrderPaneLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(preOrderLabel)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        preOrderPaneLayout.setVerticalGroup(
            preOrderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(preOrderPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(preOrderLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inOrderPane.setBackground(new java.awt.Color(0, 0, 255));
        inOrderPane.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        inOrderLabel.setForeground(new java.awt.Color(255, 255, 255));
        inOrderLabel.setText("In - Order");

        javax.swing.GroupLayout inOrderPaneLayout = new javax.swing.GroupLayout(inOrderPane);
        inOrderPane.setLayout(inOrderPaneLayout);
        inOrderPaneLayout.setHorizontalGroup(
            inOrderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inOrderPaneLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(inOrderLabel)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        inOrderPaneLayout.setVerticalGroup(
            inOrderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inOrderPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inOrderLabel)
                .addContainerGap())
        );

        postOrderPane.setBackground(new java.awt.Color(0, 0, 255));
        postOrderPane.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        postOrderLabel.setForeground(new java.awt.Color(255, 255, 255));
        postOrderLabel.setText("Post - Order");

        javax.swing.GroupLayout postOrderPaneLayout = new javax.swing.GroupLayout(postOrderPane);
        postOrderPane.setLayout(postOrderPaneLayout);
        postOrderPaneLayout.setHorizontalGroup(
            postOrderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postOrderPaneLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(postOrderLabel)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        postOrderPaneLayout.setVerticalGroup(
            postOrderPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(postOrderPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(postOrderLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        preOrderDisplayButton.setText("Display");

        preOrderSaveButton.setText("Save");

        inOrderSaveButton.setText("Save");

        inOrderDisplayButton.setText("Display");

        postOrderSaveButton.setText("Save");

        postOrderDisplayButton.setText("Display");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleJPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(binaryPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(linkedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(makerSendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(questionMakerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addComponent(sortPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(preOrderDisplayButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(preOrderSaveButton))
                            .addComponent(preOrderPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inOrderDisplayButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inOrderSaveButton))
                            .addComponent(inOrderPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(postOrderPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(postOrderDisplayButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(postOrderSaveButton)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(questionMakerPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sortPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(makerSendButton)
                    .addComponent(exitButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(linkedPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(binaryPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(inOrderPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(postOrderPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(preOrderPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(postOrderDisplayButton)
                        .addComponent(postOrderSaveButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inOrderDisplayButton)
                        .addComponent(inOrderSaveButton))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(preOrderDisplayButton)
                        .addComponent(preOrderSaveButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void makerSendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makerSendButtonActionPerformed
        //Send Math question to Student
        try
        {
           String lOP = firstNumTextField.getText();
           String rOP = sNumTextField.getText();
           String operator = opComboBox.getSelectedItem().toString();
           String ans = ansTextField.getText();
                      
           String messageOut = lOP + " " + operator + " " + rOP + " = -" + ans;
                     
           dataOutputStream.writeUTF(messageOut);
           
           //add to binary tree
           int lOPInt = Integer.parseInt(lOP.trim());
           int rOPInt = Integer.parseInt(rOP.trim());
           int ansInt = Integer.parseInt(ans.trim());
           
           BinaryTree<Questions> btMath = new BinaryTree<Questions>();
           btMath.add(new Questions(lOPInt, rOPInt, operator, ansInt));
           btMath.inOrder(btMath.getRoot());
           
           binaryTreeTextArea.setText(binaryTreeTextArea.getText() + " " + btMath.getTraversalString());
           Object[] newDataRow = {lOP, operator, rOP, "=", ans};
           questTableModel.addRow(newDataRow);
                     
           makerSendButton.setEnabled(false);
           
                      
        }
        catch (Exception e)
        {
            String exceptionStr = "Teacher Send Error " + e.getMessage();
            JOptionPane.showMessageDialog(null, exceptionStr, 
            "Teacher Send Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_makerSendButtonActionPerformed

    private void ansTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansTextFieldActionPerformed
        
    }//GEN-LAST:event_ansTextFieldActionPerformed

    private void ansTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ansTextFieldFocusGained
        //Check if the fields are empty
        if (firstNumTextField == null || sNumTextField == null)
        {
            ansTextField.setText("Enter nums");
        }
        else
        {
            //Find answer to Question
            int lOper = Integer.parseInt(firstNumTextField.getText().trim());
            int rOper = Integer.parseInt(sNumTextField.getText().trim());
            String operator = opComboBox.getSelectedItem().toString();
            
            //if statement showing different equations depending on operator varible
            switch (operator) {
                case "+":
                    {
                        int ansInt = lOper + rOper;
                        ansTextField.setText(String.valueOf(ansInt));
                        break;
                    }
                case "-":
                    {
                        int ansInt = lOper - rOper;
                        ansTextField.setText(String.valueOf(ansInt));
                        break;
                    }
                case "/":
                    {
                        int ansInt = lOper / rOper;
                        ansTextField.setText(String.valueOf(ansInt));
                        break;
                    }
                case "*":
                    {
                        int ansInt = lOper * rOper;
                        ansTextField.setText(String.valueOf(ansInt));
                        break;
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Opertaor not found",
                            "Answer Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }//GEN-LAST:event_ansTextFieldFocusGained

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        //Exit window
        JOptionPane.showMessageDialog(null, "Exiting");
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentMoved

    private void opComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opComboBoxActionPerformed

    // Insertion asc sorting
    
    static void sort(String order)
    {
        // check if mathList contains objects (if not, exit the method)
        if (mathList.size() == 0)
        {
            return;
        }
        
        // convert the mathList to a fixed quizzes
        Questions[] quizzes = mathList.toArray(new Questions[mathList.size()]);
        
        for (int i = 0; i < quizzes.length; i++)
        {
            for (int j = 0; j < quizzes.length - 1; j++)
            {
                if ("asc".equals(order))
                {
                    if (quizzes[i].compareTo(quizzes[j]) < 0)
                    {
                        // swap values
                        Questions temp = quizzes[i];
                        quizzes[i] = quizzes[j];
                        quizzes[j] = temp;
                    }
                }
                else if ("desc".equals(order))
                {
                    if (quizzes[i].compareTo(quizzes[j]) > 0)
                    {
                        // swap values
                        Questions temp = quizzes[i];
                        quizzes[i] = quizzes[j];
                        quizzes[j] = temp;
                    }
                }

            } // end inner for loop
        } // end outer for loop
        mathList = new ArrayList<>(Arrays.asList(quizzes));
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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
        
        //Set up Socket
        try
        {
            serverSocket = new ServerSocket(1201);
            socket = serverSocket.accept();
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            
            LinkedList<String> wrongAns = new LinkedList<String>();
            while(true){
            String messageIn = "";
            messageIn = dataInputStream.readUTF();
            
            //linkedTextArea.setText(linkedTextArea.getText() + messageIn);
            if (messageIn.equals("y"))
            {
                linkedTextArea.setText("Student Answered Correctly");
                 //clear sent text
                firstNumTextField.setText("");
                sNumTextField.setText("");
                ansTextField.setText("");
                opComboBox.setSelectedIndex(0);
                makerSendButton.setEnabled(true);
                
            }
            else if (messageIn.equals("n"))
            {
                linkedTextArea.setText("Student Answered Incorrectly");
                wrongAns.add(firstNumTextField.getText() 
                + opComboBox.getSelectedItem() + sNumTextField.getText() + " = " 
                + ansTextField.getText());
                
                //clear sent text
                firstNumTextField.setText("");
                sNumTextField.setText("");
                ansTextField.setText("");
                opComboBox.setSelectedIndex(0);
                makerSendButton.setEnabled(true);
            }
            }
        }
        catch (SocketException se)
        {
            String exceptionStr = "Socket Error " + se.getMessage();
            JOptionPane.showMessageDialog(null, exceptionStr, 
            "Socket Error", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception e)
        {
            String exceptionStr = "Server Error " + e.getMessage();
            JOptionPane.showMessageDialog(null, exceptionStr, 
            "Server Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ansLabel;
    private static javax.swing.JTextField ansTextField;
    private javax.swing.JLabel binaryLabel;
    private javax.swing.JPanel binaryPane;
    private static javax.swing.JTextArea binaryTreeTextArea;
    private javax.swing.JButton exitButton;
    private static javax.swing.JTextField firstNumTextField;
    private javax.swing.JButton firstSortButton;
    private javax.swing.JLabel fnumLabel;
    private javax.swing.JButton inOrderDisplayButton;
    private javax.swing.JLabel inOrderLabel;
    private javax.swing.JPanel inOrderPane;
    private javax.swing.JButton inOrderSaveButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel linkedLabel;
    private javax.swing.JPanel linkedPane;
    private static javax.swing.JTextArea linkedTextArea;
    private javax.swing.JLabel makerLabel;
    private static javax.swing.JButton makerSendButton;
    private static javax.swing.JComboBox<String> opComboBox;
    private javax.swing.JLabel opLabel;
    private javax.swing.JButton postOrderDisplayButton;
    private javax.swing.JLabel postOrderLabel;
    private javax.swing.JPanel postOrderPane;
    private javax.swing.JButton postOrderSaveButton;
    private javax.swing.JButton preOrderDisplayButton;
    private javax.swing.JLabel preOrderLabel;
    private javax.swing.JPanel preOrderPane;
    private javax.swing.JButton preOrderSaveButton;
    private javax.swing.JPanel questionMakerPane;
    private javax.swing.JTable questionsTable;
    private static javax.swing.JTextField sNumTextField;
    private javax.swing.JButton secSortButton;
    private javax.swing.JButton secSortButton1;
    private javax.swing.JLabel snumLabel;
    private javax.swing.JLabel sortLabel;
    private javax.swing.JPanel sortPane;
    private javax.swing.JButton thirSortButton2;
    private javax.swing.JLabel titleJLabel;
    private javax.swing.JPanel titleJPane;
    // End of variables declaration//GEN-END:variables
}
