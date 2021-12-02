/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;
import java.lang.Math;
import java.awt.event.KeyEvent;

/**
 *
 * @author Calvin C M
 */
public class Main extends javax.swing.JFrame {
    Kalkulator calcu;
    /**
     * Creates new form Main
     */
    public Main() {
        this.calcu=new Kalkulator();
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

        inputs = new javax.swing.JTextField();
        buttonOptions = new javax.swing.JPanel();
        number0 = new javax.swing.JButton();
        number1 = new javax.swing.JButton();
        number2 = new javax.swing.JButton();
        number3 = new javax.swing.JButton();
        number4 = new javax.swing.JButton();
        number5 = new javax.swing.JButton();
        number6 = new javax.swing.JButton();
        number7 = new javax.swing.JButton();
        number8 = new javax.swing.JButton();
        number9 = new javax.swing.JButton();
        decimalButton = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        sinButton = new javax.swing.JButton();
        cosButton = new javax.swing.JButton();
        tanButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        powerButton = new javax.swing.JButton();
        rootButton = new javax.swing.JButton();
        factorialButton = new javax.swing.JButton();
        logButton = new javax.swing.JButton();
        piButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setBackground(new java.awt.Color(0, 51, 102));

        inputs.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        inputs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputsKeyPressed(evt);
            }
        });

        buttonOptions.setBackground(new java.awt.Color(0, 102, 102));
        buttonOptions.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        number0.setText("0");
        number0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ActionPerformed(evt);
            }
        });

        number1.setText("1");
        number1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ActionPerformed(evt);
            }
        });

        number2.setText("2");
        number2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ActionPerformed(evt);
            }
        });

        number3.setText("3");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });

        number4.setText("4");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });

        number5.setText("5");
        number5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ActionPerformed(evt);
            }
        });

        number6.setText("6");
        number6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ActionPerformed(evt);
            }
        });

        number7.setText("7");
        number7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ActionPerformed(evt);
            }
        });

        number8.setText("8");
        number8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ActionPerformed(evt);
            }
        });

        number9.setText("9");
        number9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ActionPerformed(evt);
            }
        });

        decimalButton.setText(".");
        decimalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decimalButtonActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(204, 102, 0));
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        sinButton.setBackground(new java.awt.Color(51, 51, 51));
        sinButton.setText("sin");
        sinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinButtonActionPerformed(evt);
            }
        });

        cosButton.setBackground(new java.awt.Color(51, 51, 51));
        cosButton.setText("cos");
        cosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosButtonActionPerformed(evt);
            }
        });

        tanButton.setBackground(new java.awt.Color(51, 51, 51));
        tanButton.setText("tan");
        tanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanButtonActionPerformed(evt);
            }
        });

        divideButton.setBackground(new java.awt.Color(204, 102, 0));
        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        multiplyButton.setBackground(new java.awt.Color(204, 102, 0));
        multiplyButton.setText("x");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        subtractButton.setBackground(new java.awt.Color(204, 102, 0));
        subtractButton.setText("-");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(204, 102, 0));
        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(51, 51, 51));
        clearButton.setText("C");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        powerButton.setBackground(new java.awt.Color(51, 51, 51));
        powerButton.setText("x^y");
        powerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powerButtonActionPerformed(evt);
            }
        });

        rootButton.setBackground(new java.awt.Color(51, 51, 51));
        rootButton.setText("√x");
        rootButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rootButtonActionPerformed(evt);
            }
        });

        factorialButton.setBackground(new java.awt.Color(51, 51, 51));
        factorialButton.setText("x!");
        factorialButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factorialButtonActionPerformed(evt);
            }
        });

        logButton.setBackground(new java.awt.Color(51, 51, 51));
        logButton.setText("log");
        logButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logButtonActionPerformed(evt);
            }
        });

        piButton.setBackground(new java.awt.Color(51, 51, 51));
        piButton.setText("𝞹");
        piButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonOptionsLayout = new javax.swing.GroupLayout(buttonOptions);
        buttonOptions.setLayout(buttonOptionsLayout);
        buttonOptionsLayout.setHorizontalGroup(
            buttonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonOptionsLayout.createSequentialGroup()
                        .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonOptionsLayout.createSequentialGroup()
                        .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(piButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonOptionsLayout.createSequentialGroup()
                        .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonOptionsLayout.createSequentialGroup()
                        .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonOptionsLayout.createSequentialGroup()
                        .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(powerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonOptionsLayout.setVerticalGroup(
            buttonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonOptionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(buttonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cosButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rootButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(factorialButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(buttonOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decimalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(piButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputs))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void number0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number0ActionPerformed
        inputs.setText(inputs.getText() + "0");
    }//GEN-LAST:event_number0ActionPerformed

    private void number1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number1ActionPerformed
        inputs.setText(inputs.getText() + "1");
    }//GEN-LAST:event_number1ActionPerformed

    private void number2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number2ActionPerformed
        inputs.setText(inputs.getText() + "2");
    }//GEN-LAST:event_number2ActionPerformed

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        inputs.setText(inputs.getText() + "3");
    }//GEN-LAST:event_number3ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        inputs.setText(inputs.getText() + "4");
    }//GEN-LAST:event_number4ActionPerformed

    private void number5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number5ActionPerformed
        inputs.setText(inputs.getText() + "5");
    }//GEN-LAST:event_number5ActionPerformed

    private void number6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number6ActionPerformed
        inputs.setText(inputs.getText() + "6");
    }//GEN-LAST:event_number6ActionPerformed

    private void number7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number7ActionPerformed
        inputs.setText(inputs.getText() + "7");
    }//GEN-LAST:event_number7ActionPerformed

    private void number8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number8ActionPerformed
        inputs.setText(inputs.getText() + "8");
    }//GEN-LAST:event_number8ActionPerformed

    private void number9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number9ActionPerformed
        inputs.setText(inputs.getText() + "9");
    }//GEN-LAST:event_number9ActionPerformed

    private void piButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piButtonActionPerformed
        inputs.setText(inputs.getText() + "𝜋");
    }//GEN-LAST:event_piButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        inputs.setText("");
        this.calcu.setOperand("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("+");
        inputs.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue2(Math.PI);
        } else {
            this.calcu.setValue2(Double.parseDouble(inputs.getText()));
        }
        double number1=(double)this.calcu.getValue1();
        double number2=(double)this.calcu.getValue2();
        switch(this.calcu.getOperand()) {
            case "+":
                inputs.setText(String.valueOf(number1+number2));
                break;
                
            case "-":
                inputs.setText(String.valueOf(number1-number2));
                break;
                
            case "X":
                inputs.setText(String.valueOf(number1*number2));
                break;
                
            case "/":
                inputs.setText(String.valueOf(number1/number2));
                break;
                
            case "^":
                inputs.setText(String.valueOf(Math.pow(number1, number2)));
                break;
                
            case "v":
                double root=Math.pow(number2, 1.0/number1);
                inputs.setText(String.valueOf(Math.round(root)));
                break;
                
            case "sin":
                inputs.setText(String.valueOf(Math.sin(Math.toRadians(number1))));
                break;
                
            case "cos":
                inputs.setText(String.valueOf(Math.cos(Math.toRadians(number1))));
                break;
                
            case "tan":
                inputs.setText(String.valueOf(Math.tan(Math.toRadians(number1))));
                break;
                
            case "log":
                inputs.setText(String.valueOf(Math.log(number1)));
                break;
                
            case "fac":
                double fac=factorial(number1);
                inputs.setText(String.valueOf(fac));
                break;
        }
    }//GEN-LAST:event_equalsActionPerformed

    public double factorial(double number) {
        if(number >= 1) {
            return number * factorial(number-1);
        }
        return 1;
    }

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("-");
        inputs.setText("");
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("X");
        inputs.setText("");
    }//GEN-LAST:event_multiplyButtonActionPerformed

    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("/");
        inputs.setText("");
    }//GEN-LAST:event_divideButtonActionPerformed

    private void sinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("sin");
        this.equalsActionPerformed(evt);
    }//GEN-LAST:event_sinButtonActionPerformed

    private void cosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("cos");
        this.equalsActionPerformed(evt);
    }//GEN-LAST:event_cosButtonActionPerformed

    private void tanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("tan");
        this.equalsActionPerformed(evt);
    }//GEN-LAST:event_tanButtonActionPerformed

    private void powerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powerButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("^");
        inputs.setText("");
    }//GEN-LAST:event_powerButtonActionPerformed

    private void rootButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rootButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("v");
        inputs.setText("");
    }//GEN-LAST:event_rootButtonActionPerformed

    private void factorialButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factorialButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("fac");
        this.equalsActionPerformed(evt);
    }//GEN-LAST:event_factorialButtonActionPerformed

    private void logButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logButtonActionPerformed
        if(inputs.getText().equals("𝜋")) {
            this.calcu.setValue1(Math.PI);
        } else {
            this.calcu.setValue1(Double.parseDouble(inputs.getText()));
        }
        this.calcu.setOperand("log");
        this.equalsActionPerformed(evt);
    }//GEN-LAST:event_logButtonActionPerformed

    private void decimalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decimalButtonActionPerformed
        if(inputs.getText().equals("")) {
            inputs.setText("0.");
        } else {
            inputs.setText(inputs.getText() + ".");
        }
    }//GEN-LAST:event_decimalButtonActionPerformed

    private void inputsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputsKeyPressed
        switch(evt.getKeyCode()) {
            case java.awt.event.KeyEvent.VK_SHIFT + java.awt.event.KeyEvent.VK_PLUS:
                if(inputs.getText().equals("𝜋")) {
                    this.calcu.setValue1(Math.PI);
                } else {
                    this.calcu.setValue1(Double.parseDouble(inputs.getText()));
                }
                this.calcu.setOperand("+");
                inputs.setText("");
                break;

            case java.awt.event.KeyEvent.VK_MINUS:
                if(inputs.getText().equals("𝜋")) {
                    this.calcu.setValue1(Math.PI);
                } else {
                    this.calcu.setValue1(Double.parseDouble(inputs.getText()));
                }
                this.calcu.setOperand("-");
                inputs.setText("");
                break;

            case java.awt.event.KeyEvent.VK_X:
                if(inputs.getText().equals("𝜋")) {
                    this.calcu.setValue1(Math.PI);
                } else {
                    this.calcu.setValue1(Double.parseDouble(inputs.getText()));
                }
                this.calcu.setOperand("X");
                inputs.setText("");
                break;

            case java.awt.event.KeyEvent.VK_SLASH:
                if(inputs.getText().equals("𝜋")) {
                    this.calcu.setValue1(Math.PI);
                } else {
                    this.calcu.setValue1(Double.parseDouble(inputs.getText()));
                }
                this.calcu.setOperand("/");
                inputs.setText("");
                break;                
        }
    }//GEN-LAST:event_inputsKeyPressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel buttonOptions;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton cosButton;
    private javax.swing.JButton decimalButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton equals;
    private javax.swing.JButton factorialButton;
    private javax.swing.JTextField inputs;
    private javax.swing.JButton logButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton number0;
    private javax.swing.JButton number1;
    private javax.swing.JButton number2;
    private javax.swing.JButton number3;
    private javax.swing.JButton number4;
    private javax.swing.JButton number5;
    private javax.swing.JButton number6;
    private javax.swing.JButton number7;
    private javax.swing.JButton number8;
    private javax.swing.JButton number9;
    private javax.swing.JButton piButton;
    private javax.swing.JButton powerButton;
    private javax.swing.JButton rootButton;
    private javax.swing.JButton sinButton;
    private javax.swing.JButton subtractButton;
    private javax.swing.JButton tanButton;
    // End of variables declaration//GEN-END:variables
}
