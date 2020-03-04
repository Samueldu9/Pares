
package trabajo;


public class FrmMemoria extends javax.swing.JFrame {
    int [] numeros=new int [16];

    int suma,igual;
    int aleatorio,condicion,posicion,posicion2;
    int x=0;
    int b=1;
    
    int click=0;
    int anterior=0;
    int valor=0;
    
    public FrmMemoria() {  //Este es el método constructor
        
        initComponents();
        btn1.setText(String.valueOf("*"));
        btn2.setText(String.valueOf("*"));
        btn3.setText(String.valueOf("*"));
        btn4.setText(String.valueOf("*"));
        btn5.setText(String.valueOf("*"));
        btn6.setText(String.valueOf("*"));
        btn7.setText(String.valueOf("*"));
        btn8.setText(String.valueOf("*"));
        btn9.setText(String.valueOf("*"));
        btn10.setText(String.valueOf("*"));
        btn11.setText(String.valueOf("*"));
        btn12.setText(String.valueOf("*"));
        btn13.setText(String.valueOf("*"));
        btn14.setText(String.valueOf("*"));
        btn15.setText(String.valueOf("*"));
        btn16.setText(String.valueOf("*"));
   
        while (posicion <= 15)
        {
            
            condicion = 0;
            posicion2 = 0;
            aleatorio = (int)(Math.random()*8);  
          
            while(posicion > posicion2)
            {
                if(aleatorio == numeros[posicion2])
                {
                    condicion++;
                }  
             
                posicion2++;
            }
            
            if(condicion < 2)
            {
      
                numeros[posicion2] = aleatorio;
                posicion++;
            }
        }
        
        System.out.print(" Valores el vector: ");
        for (x=0;x<16;x++)
        {
            System.out.print(numeros[x]);
        }
       
    }
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        jButton17.setText("Restart");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        btn1.setText(String.valueOf(numeros[0]));
        click+=1;
        
        
        if (click==1)
        {
            valor=numeros[0];
            anterior=numeros[0];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[0]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn1.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            if (numeros[0]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            
            btn1.setEnabled(true);
            anterior=numeros[0];
        }
        
        
        
        
        
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        btn2.setText(String.valueOf(numeros[1]));
        click+=1;
        
                if (click==1)
        {
            valor=numeros[1];
            anterior=numeros[1];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[1]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn2.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[1];
        }
        
        
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        btn3.setText(String.valueOf(numeros[2]));
        click+=1;
        
        if (click==1)
        {
            valor=numeros[2];
            anterior=numeros[2];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[2]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn3.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[2];
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        btn4.setText(String.valueOf(numeros[3]));
        click++;
        
                if (click==1)
        {
            valor=numeros[3];
            anterior=numeros[3];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[3]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn4.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[3];
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        btn5.setText(String.valueOf(numeros[4]));
        click++;
        
                if (click==1)
        {
            valor=numeros[4];
            anterior=numeros[4];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[4]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn5.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[4];
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        btn6.setText(String.valueOf(numeros[5]));
        click++;
        
        if (click==1)
        {
            valor=numeros[5];
            anterior=numeros[5];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[5]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn6.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[5];
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        btn7.setText(String.valueOf(numeros[6]));
        click++;
        
                if (click==1)
        {
            valor=numeros[6];
            anterior=numeros[6];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[6]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn7.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[6];
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        btn8.setText(String.valueOf(numeros[7]));
        click++;
        
                if (click==1)
        {
            valor=numeros[7];
            anterior=numeros[7];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[7]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn8.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[7];
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        btn9.setText(String.valueOf(numeros[8]));
        click++;
        
                if (click==1)
        {
            valor=numeros[8];
            anterior=numeros[8];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[8]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn9.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[8];
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        btn10.setText(String.valueOf(numeros[9]));
        click++;
        
        if (click==1)
        {
            valor=numeros[0];
            anterior=numeros[0];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[0]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn10.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[0];
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        btn11.setText(String.valueOf(numeros[10]));
        click++;
        
                if (click==1)
        {
            valor=numeros[10];
            anterior=numeros[10];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[10]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn11.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[10];
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        btn12.setText(String.valueOf(numeros[11]));
        click++;
        
        if (click==1)
        {
            valor=numeros[11];
            anterior=numeros[11];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[11]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn12.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[11];
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        btn13.setText(String.valueOf(numeros[12]));
        click++;
        
                if (click==1)
        {
            valor=numeros[12];
            anterior=numeros[12];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[12]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn13.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[12];
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        btn14.setText(String.valueOf(numeros[13]));
        click++;
        
                if (click==1)
        {
            valor=numeros[13];
            anterior=numeros[13];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[13]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn14.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[13];
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        btn15.setText(String.valueOf(numeros[14]));
        click++;
        
                if (click==1)
        {
            valor=numeros[14];
            anterior=numeros[14];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[14]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn15.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[14];
        }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        btn16.setText(String.valueOf(numeros[15]));
        click++;
        
                if (click==1)
        {
            valor=numeros[15];
            anterior=numeros[15];
            btn1.setEnabled(false);
        }
        
        if (click ==2)
        {
            if (numeros[15]==anterior)
            {
                
                btn1.setEnabled(false);
                click=0;
                anterior=0;
            }
            else
            {
                btn16.setText(String.valueOf("*"));
            }
            
        }
        
        if (click == 3)
        {
            btn1.setEnabled(true);
            anterior=numeros[15];
        }
    }//GEN-LAST:event_btn16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        btn1.setText(String.valueOf("*"));
        btn2.setText(String.valueOf("*"));
        btn3.setText(String.valueOf("*"));
        btn4.setText(String.valueOf("*"));
        btn5.setText(String.valueOf("*"));
        btn6.setText(String.valueOf("*"));
        btn7.setText(String.valueOf("*"));
        btn8.setText(String.valueOf("*"));
        btn9.setText(String.valueOf("*"));
        btn10.setText(String.valueOf("*"));
        btn11.setText(String.valueOf("*"));
        btn12.setText(String.valueOf("*"));
        btn13.setText(String.valueOf("*"));
        btn14.setText(String.valueOf("*"));
        btn15.setText(String.valueOf("*"));
        btn16.setText(String.valueOf("*"));
        
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
    }//GEN-LAST:event_jButton17ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton jButton17;
    // End of variables declaration//GEN-END:variables
}
