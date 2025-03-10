/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mdasproject;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.util.Random;

/**
 *
 * @author NEIL SANTOS
 */
public class MDASProject_FGMST extends javax.swing.JFrame {

    /**
     * Creates new form MDASForm
     */
    private Timer timer;  // Timer for countdown
    private int timeLeft;
    private int x, y;
    private Graphics2D pencil;
    private Random random = new Random();
    private double correctAnswer;
    private int scoreCorrect = 0; 
    private int scoreWrong = 0;   

    public MDASProject_FGMST() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        lblMathGame = new javax.swing.JLabel();
        pbGameTime = new javax.swing.JProgressBar();
        lblTimeLeft = new javax.swing.JLabel();
        lblWrong = new javax.swing.JLabel();
        lblCorrect = new javax.swing.JLabel();
        pnlQuestion = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        pnlAnswer = new javax.swing.JPanel();
        tfAnswer = new javax.swing.JTextField();
        lblAnswer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSolution = new javax.swing.JTextArea();
        lblSolution = new javax.swing.JLabel();
        pnlDiff = new javax.swing.JPanel();
        cbDifficulty = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlTitle.setBackground(new java.awt.Color(255, 204, 204));

        lblMathGame.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblMathGame.setText("Math Game");

        lblTimeLeft.setText("Time Left:");

        lblWrong.setText("Wrong: 0");

        lblCorrect.setText("Correct: 0");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTitleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pbGameTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlTitleLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblTimeLeft)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlTitleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCorrect)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblWrong)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblMathGame)
                .addGap(169, 169, 169))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMathGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTimeLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWrong, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(pbGameTime, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lblWrong.getAccessibleContext().setAccessibleDescription("");
        lblCorrect.getAccessibleContext().setAccessibleDescription("");

        pnlQuestion.setBackground(new java.awt.Color(204, 255, 204));
        pnlQuestion.setLayout(new java.awt.BorderLayout());

        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("Question");
        lblQuestion.setToolTipText("");
        pnlQuestion.add(lblQuestion, java.awt.BorderLayout.CENTER);

        pnlAnswer.setBackground(new java.awt.Color(204, 255, 255));

        tfAnswer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfAnswerKeyTyped(evt);
            }
        });

        lblAnswer.setText("Answer: ");

        taSolution.setColumns(20);
        taSolution.setRows(5);
        taSolution.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                taSolutionMouseDragged(evt);
            }
        });
        taSolution.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                taSolutionMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                taSolutionMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(taSolution);

        lblSolution.setText("Solution/Scratch Area");

        javax.swing.GroupLayout pnlAnswerLayout = new javax.swing.GroupLayout(pnlAnswer);
        pnlAnswer.setLayout(pnlAnswerLayout);
        pnlAnswerLayout.setHorizontalGroup(
            pnlAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAnswerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnswerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnswerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(tfAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
            .addGroup(pnlAnswerLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(lblSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlAnswerLayout.setVerticalGroup(
            pnlAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAnswerLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblSolution)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAnswerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnswer)
                    .addComponent(tfAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        pnlDiff.setBackground(new java.awt.Color(255, 255, 204));

        cbDifficulty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Difficulties:", "Easy ", "Normal", "Hard" }));
        cbDifficulty.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDifficultyItemStateChanged(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDiffLayout = new javax.swing.GroupLayout(pnlDiff);
        pnlDiff.setLayout(pnlDiffLayout);
        pnlDiffLayout.setHorizontalGroup(
            pnlDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiffLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(cbDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        pnlDiffLayout.setVerticalGroup(
            pnlDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiffLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(pnlDiffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDifficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubmit))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDiff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAnswer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(pnlDiff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbDifficultyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDifficultyItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String GameMode = (String) cbDifficulty.getSelectedItem();
            String selectAgain = "Select Difficulties:";
            if (selectAgain.equals(GameMode)) {
                GameReset();
            }
            else{
                GameReset();
                startTimer();
                startNewQuestion();
            }
        }
    }//GEN-LAST:event_cbDifficultyItemStateChanged

    private void GameReset() {
        // Resets Everything
        scoreCorrect = 0;
        scoreWrong = 0;
        lblCorrect.setText("Correct: 0");
        lblWrong.setText("Wrong: 0");

        if (timer != null) {
            timer.stop();
        }
        pbGameTime.setValue(0);
        lblTimeLeft.setText("Time Left: 0 sec");

        tfAnswer.setText("");
        lblQuestion.setText("Question");
    }
    
    private void taSolutionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taSolutionMousePressed
        pencil = (Graphics2D) taSolution.getGraphics();
        pencil.setStroke(new BasicStroke(2));
        pencil.setColor(Color.BLACK);
        
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_taSolutionMousePressed

    private void taSolutionMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taSolutionMouseReleased
        pencil = null;
    }//GEN-LAST:event_taSolutionMouseReleased

    private void taSolutionMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taSolutionMouseDragged
        if(pencil != null){
            int currentX = evt.getX();
            int currentY = evt.getY();
            
            pencil.drawLine(x, y, currentX, currentY);
            x = currentX;
            y = currentY;
            
        }
    }//GEN-LAST:event_taSolutionMouseDragged

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        int userAnswer = Integer.parseInt(tfAnswer.getText().trim());
        
        if (userAnswer == correctAnswer) {
            scoreCorrect++;
            lblCorrect.setText("Correct: " + scoreCorrect);
        } 
        else {
            scoreWrong++;
            lblWrong.setText("Wrong: " + scoreWrong);
        }
        
        startNewQuestion();
        taSolution.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

   
    private void tfAnswerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAnswerKeyTyped
        //this is a cathcer if the user tries to type anything besides a number and the traditional backsapce and stuff
        char input = evt.getKeyChar();
        String text = tfAnswer.getText();

        if (!Character.isDigit(input) && input != KeyEvent.VK_BACK_SPACE && input != KeyEvent.VK_DELETE) {
            if (input == '-' && text.isEmpty()) {
            } 
            
            else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfAnswerKeyTyped

    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        btnSubmit.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnSubmitMouseEntered

    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        btnSubmit.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnSubmitMouseExited
    private void startNewQuestion() {
        String difficulty = ((String) cbDifficulty.getSelectedItem()).trim();
        int num1, num2, num3, num4;
        char op1, op2, op3;
        String question = "";

        // Get Random numbers from 1 - 99
        num1 = random.nextInt(99) + 1;
        num2 = random.nextInt(99) + 1;
        num3 = random.nextInt(99) + 1;
        num4 = random.nextInt(99) + 1;

        // Generate the Random operators for more fun
        op1 = getRandomOperator();
        op2 = getRandomOperator();
        op3 = getRandomOperator();

        double computingAnswer = 0;

        switch (difficulty) {
            case "Easy":
                if (op1 == '/' && num2 == 0) num2 = 1; // Avoid zero division
                computingAnswer = computeResult(num1, num2, op1);
                question = String.format("%d %c %d", num1, op1, num2);
                break;

            case "Normal":
                if (op1 == '/' && num2 == 0) num2 = 1;
                if (op2 == '/' && num3 == 0) num3 = 1;
                computingAnswer = computeResult(num1, num2, op1);
                computingAnswer = computeResult(computingAnswer, num3, op2);
                question = String.format("(%d %c %d) %c %d", num1, op1, num2, op2, num3);
                break;

            case "Hard":
                if (op1 == '/' && num2 == 0) num2 = 1;
                if (op2 == '/' && num3 == 0) num3 = 1;
                if (op3 == '/' && num4 == 0) num4 = 1;
                computingAnswer = computeResult(num1, num2, op1);
                computingAnswer = computeResult(computingAnswer, num3, op2);
                computingAnswer = computeResult(computingAnswer, num4, op3);
                question = String.format("((%d %c %d) %c %d) %c %d", num1, op1, num2, op2, num3, op3, num4);
                break;

            default:
                lblQuestion.setText("Please select a difficulty.");
                return;
        }

        correctAnswer = Math.round(computingAnswer);
        
        //This is the question part where the question is displayed
        lblQuestion.setText("What is the result of: " + question + " ?");
        tfAnswer.setText("");
        System.out.println("Correct Answer (If you dont know): " + (int)correctAnswer);
    }

    private char getRandomOperator() {
        //random operator go!!
        char[] operators = {'+', '-', '*', '/'};
        return operators[random.nextInt(4)];
    }
    
    private double computeResult(double a, double b, char operator) {
        //Computes for the right answer
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return (b != 0) ? a / b : 0; // Avoid division by zero
            default: return 0;
        }
    }

     private void startTimer() {
        String difficulty = ((String) cbDifficulty.getSelectedItem()).trim();
        if ("Select Difficulties:".equals(difficulty)) return;

        // Set time based on difficulty
        switch (difficulty) {
            case "Easy":
                timeLeft = 30;
                break;
            case "Normal":
                timeLeft = 45;
                break;
            case "Hard":
                timeLeft = 60;
                break;
            default:
                timeLeft = 30;
                break;
        }

        // Reset progress bar and start timer
        pbGameTime.setMaximum(timeLeft);
        pbGameTime.setValue(timeLeft);
        lblTimeLeft.setText("Time Left: " + timeLeft + " sec");

        if (timer != null) {
            timer.stop();
        }

        // Timer logic
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timeLeft > 0) {  
                    timeLeft--;
                    pbGameTime.setValue(timeLeft);
                    lblTimeLeft.setText("Time Left: " + timeLeft + " sec");
                } else {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Time's up! Your Total Score is: " + scoreCorrect);
                }
            }
        });
        timer.start();
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
            java.util.logging.Logger.getLogger(MDASProject_FGMST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDASProject_FGMST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDASProject_FGMST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDASProject_FGMST.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDASProject_FGMST().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbDifficulty;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAnswer;
    private javax.swing.JLabel lblCorrect;
    private javax.swing.JLabel lblMathGame;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblSolution;
    private javax.swing.JLabel lblTimeLeft;
    private javax.swing.JLabel lblWrong;
    private javax.swing.JProgressBar pbGameTime;
    private javax.swing.JPanel pnlAnswer;
    private javax.swing.JPanel pnlDiff;
    private javax.swing.JPanel pnlQuestion;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTextArea taSolution;
    private javax.swing.JTextField tfAnswer;
    // End of variables declaration//GEN-END:variables
}
