
package tictactoe.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import tictactoe.Board;
import tictactoe.Cell;
import tictactoe.Player;
import tictactoe.zeki;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;



public class MainForm extends javax.swing.JFrame {
    
   
    public String resimX="";
    public  String resimO="";
    private int rows = 4, columns = 4;
    private Board board;
    private JLabel[][] map;
    private Player player;
    Timer timer;
    TimerTask hatirlat;
    int saat=0,dakika=0,saniye=0;
    String zaman="";
    String kazanan="";
    int berabere;
    int PuanX=0,PuanXX=0;
    int PuanO=0, PuanOO=0;
    int tur=1;
    
    public MainForm() {
        initComponents();
          
       // GridLayout layout = new GridLayout(rows, columns);
        
         File f=new File("skor.txt");
         if(f.exists()){}
         else{
             try {
                f.createNewFile();
            } catch (IOException ex) {
               
            }
}
       
       
    }
    public void newGame()
    {
       mainPanel.removeAll();
        
    GridLayout layout = new GridLayout(rows, columns);
    mainPanel.setLayout(layout);
        map = new JLabel[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                map[i][j] = new JLabel();
                map[i][j].setBackground(Color.white);
                map[i][j].setOpaque(true);
                map[i][j].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
                map[i][j].setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                map[i][j].addMouseListener(new java.awt.event.MouseAdapter() {

                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        testLabelMouseClicked(evt);
                    }
                });
                mainPanel.add(map[i][j]);
            }
        }
         board = new Board(rows, columns);
        testLabel.setText("Oyun devam ediyor...");
        testLabel.setIcon(null);
        sure();
        player=new zeki();
        updateView();
    }
    public void sure(){
       
        timer=new Timer();
         
        timer.schedule(new hatirlat(), 1000);
    }
    
    class hatirlat extends TimerTask{
        
   public void run(){
       saniye++;
       String saatS="";
       String dakikaS="";
       String saniyeS="";
       
   if(saniye>60){
   dakika++;
   saniye=0; 
   }
   if(dakika>60){
   saat++;
   dakika=0;
   }
   if(saniye<10){saniyeS="0"+Integer.toString(saniye);}
   else{saniyeS=Integer.toString(saniye);}
   if(dakika<10){dakikaS="0"+Integer.toString(dakika);}
   else{dakikaS=Integer.toString(dakika);}
   if(saat<10){saatS="0"+Integer.toString(saat);}
   else{saatS=Integer.toString(saat);}
   zaman=saatS+" : "+dakikaS+" : "+saniyeS;
  testLabel1.setText(zaman);
   sure();
   }
    
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        newGameButton = new javax.swing.JButton();
        testLabel = new javax.swing.JLabel();
        testLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cbox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tur1 = new javax.swing.JLabel();
        tur2 = new javax.swing.JLabel();
        tur3 = new javax.swing.JLabel();
        tur4 = new javax.swing.JLabel();
        tur5 = new javax.swing.JLabel();
        skor = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        mainPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setPreferredSize(new java.awt.Dimension(500, 500));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 354, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 403, Short.MAX_VALUE)
        );

        newGameButton.setText("Yeni Oyun");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        testLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        testLabel.setText("Başlama bekleniyor...");
        testLabel.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        testLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testLabelMouseClicked(evt);
            }
        });

        testLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        testLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        testLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testLabel1MouseClicked(evt);
            }
        });

        jButton1.setText("Skorlar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cbox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4x4", "5x5", "6x6", "7x7", "8x8", "9x9", "10x10" }));

        jLabel1.setText("1.Tur");

        jLabel2.setText("2.Tur");

        jLabel3.setText("3.Tur");

        jLabel4.setText("4.Tur");

        jLabel5.setText("5.Tur");

        tur1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tur1.setText("Başlama bekleniyor...");
        tur1.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        tur1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tur1MouseClicked(evt);
            }
        });

        tur2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tur2.setText("Başlama bekleniyor...");
        tur2.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        tur2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tur2MouseClicked(evt);
            }
        });

        tur3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tur3.setText("Başlama bekleniyor...");
        tur3.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        tur3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tur3MouseClicked(evt);
            }
        });

        tur4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tur4.setText("Başlama bekleniyor...");
        tur4.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        tur4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tur4MouseClicked(evt);
            }
        });

        tur5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tur5.setText("Başlama bekleniyor...");
        tur5.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        tur5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tur5MouseClicked(evt);
            }
        });

        skor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skor.setText("Başlama bekleniyor...");
        skor.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));
        skor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                skorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(skor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(testLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(10, 10, 10)
                                        .addComponent(tur2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tur1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4))
                                                .addGap(10, 10, 10)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(tur4, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(tur3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(tur5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(testLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(testLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))
                        .addComponent(testLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tur1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tur2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tur3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tur4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tur5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(skor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateView() {
        if (board != null) {
            for (int i = 0; i < board.getNumberOfRows(); i++) {
                for (int j = 0; j < board.getNumberOfColumns(); j++) {
                    if (board.getCell(i, j) == null) {
                        map[i][j].setBackground(Color.black);
                        map[i][j].setIcon(null);
                    } else {
                        map[i][j].setBackground(Color.white);
                        if (board.getCell(i, j) == Cell.CIRCLE) {
                            map[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/gui/circle"+resimO.toString()+".png")));
                        } else {
                            map[i][j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/gui/cross"+resimX.toString()+".png")));
                        }
                    }
                }
            }
        }
    }
    public void tur(){
    switch(tur)
            {
                case 1:
                {tur1.setText("X :"+PuanX+" vs "+"O :"+PuanO);
                 
                 tur++;
                 PuanX=0; PuanO=0;
                 JOptionPane.showMessageDialog(null,Integer.toString(tur)+".tur başlıyor", "Yeni Tur", JOptionPane.INFORMATION_MESSAGE);
                 newGame();
                }
                break;
                case 2:
                    {tur2.setText("X :"+PuanX+" vs "+"O :"+PuanO);
                 
                 tur++;
                 PuanX=0; PuanO=0;
                  JOptionPane.showMessageDialog(null,Integer.toString(tur)+".tur başlıyor", "Yeni Tur", JOptionPane.INFORMATION_MESSAGE);
                newGame();
                    }
                break;
                case 3: 
                    {tur3.setText("X :"+PuanX+" vs "+"O :"+PuanO);
                        tur++;
                        PuanX = 0;
                        PuanO = 0;
                        JOptionPane.showMessageDialog(null, Integer.toString(tur) + ".tur başlıyor", "Yeni Tur", JOptionPane.INFORMATION_MESSAGE);
                        newGame();
                }
                break;
                case 4:
                    {tur4.setText("X :"+PuanX+" vs "+"O :"+PuanO);
                   tur++;
                 PuanX=0; PuanO=0;
                  JOptionPane.showMessageDialog(null,Integer.toString(tur)+".tur başlıyor", "Yeni Tur", JOptionPane.INFORMATION_MESSAGE);
                newGame();
                }
                break;
                
                case 5:
                    {   tur5.setText("X :"+PuanX+" vs "+"O :"+PuanO);
                        skor.setText("X :"+PuanXX+" vs "+"O :"+PuanOO);
                        String kazanan="";
                 if(PuanXX<PuanOO){kazanan="Kazanan bilgisayar oyuncu";}
                 else if(PuanXX>PuanOO){kazanan="Kazanan insan oyuncu";}
                 else{kazanan="Drurum Berabere";}
               JOptionPane.showMessageDialog(null,"skor = "+skor.getText()+" "+kazanan, "Oyun bitti... ", JOptionPane.INFORMATION_MESSAGE);
                 skorYaz();
               PuanX=0; PuanO=0;
                 timer.cancel();
                 board=null;
                 tur=1;
                 PuanXX=0;PuanOO=0;
                 
                }
                break;
            
            
            
            }
        
    
    }
    
    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        dakika=0;
        saniye=0;
        saat=0;
        skor.setText("");
        tur1.setText("");
        tur2.setText("");
        tur3.setText("");
        tur4.setText("");
        tur5.setText("");
        tur=1;
        mainPanel.removeAll();
        
        switch(cbox1.getSelectedIndex())
        {
            case 0:rows=4;columns=4; berabere=16;
                break;
            case 1:rows=5;columns=5; berabere=25;
                break;
            case 2:rows=6;columns=6; berabere=36; resimX="1"; resimO="1";
                break;
            case 3:rows=7;columns=7;berabere=49;  resimX="1"; resimO="1";
                break;
            case 4:rows=8;columns=8;berabere=64;  resimX="2"; resimO="2";
                break;
            case 5:rows=9;columns=9;berabere=81;  resimX="3"; resimO="3";
                break;
            case 6:rows=10;columns=10;berabere=100;  resimX="3"; resimO="3";
                break;
        }
       // rows=5;
       //columns=5;
        newGame();
       
      
       
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void testLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testLabelMouseClicked
        if (board != null) {
            for (int i = 0; i < board.getNumberOfRows(); i++) {
                for (int j = 0; j < board.getNumberOfColumns(); j++) {
                    if (evt.getSource() == map[i][j]) {
                         if(board.getCell(i,j) ==null){
                        board.setCell(i, j, Cell.CROSS);
                        updateView();
                        if (testWinner()==1) {
                            kazanan="insan oyuncu";
                            testLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/gui/cross.png")));
                            testLabel.setText("kazandı...");
                           // testLabel2.setText(testLabel2.getText()+"\n X = "+PuanX+" O = "+PuanO);
                           tur();
                          //  board = null;
                            timer.cancel();
                            //skorYaz();
                                    
                            
                            return;
                        } 
                        else if(testWinner()==0){  
                            kazanan="berabere"; 
                            testLabel.setText("berabere"); 
                           board = null;
                            timer.cancel();
                            tur();
                        return;}
                        else {
                            Point p = player.makeMove(board, Cell.CIRCLE);
                            board.setCell(p.x, p.y, Cell.CIRCLE);
                            updateView();
                            
                            if (testWinner()==1) {
                                kazanan="bilgisayar oyuncu";
                               testLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tictactoe/gui/circle.png")));
                                testLabel.setText("kazandı");
                               // testLabel2.setText(testLabel2.getText()+"\n X = "+PuanX+" O = "+PuanO);
                                board = null;
                            timer.cancel();
                                tur();
                               
                                
                                return;
                            }
                            else if(testWinner()==0){  
                            kazanan="berabere"; 
                            testLabel.setText("berabere"); 
                          //  testLabel2.setText(testLabel2.getText()+"\n X = "+PuanX+" O = "+PuanO);
                             board = null;
                            timer.cancel();
                            tur();
                          
                            
                        return;}
                        }
                    }
                    }
                }
            }
          
        }
    }//GEN-LAST:event_testLabelMouseClicked

    private void testLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_testLabel1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Skor().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tur1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tur1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tur1MouseClicked

    private void tur2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tur2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tur2MouseClicked

    private void tur3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tur3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tur3MouseClicked

    private void tur4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tur4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tur4MouseClicked

    private void tur5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tur5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tur5MouseClicked

    private void skorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_skorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_skorMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox cbox1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel skor;
    private javax.swing.JLabel testLabel;
    private javax.swing.JLabel testLabel1;
    private javax.swing.JLabel tur1;
    private javax.swing.JLabel tur2;
    private javax.swing.JLabel tur3;
    private javax.swing.JLabel tur4;
    private javax.swing.JLabel tur5;
    // End of variables declaration//GEN-END:variables

   private int testWinner()
   {   boolean durum=false;
       int k=0;
   for (int i = 0; i < board.getNumberOfRows(); i++) {
        for (int j = 0; j < board.getNumberOfColumns(); j++) {
                 Cell c=board.getCell(i,j);
                
                
                if(c!=null){
              for(int m=1;m<4;m++){ 
                if(checkCell(i, j+m, c)){
                  durum=true;
                }else{durum=false; break;}
              }
              if(durum==true){if(c==Cell.CROSS){PuanX=1;PuanXX+=1;}
                else{PuanO=1;PuanOO+=1;}return 1;}
              
              
                 for(int m=1;m<4;m++){ 
                if(checkCell(i+m, j, c)){
                    durum=true;
               }else{durum=false; break;}
                 }
                 if(durum==true){if(c==Cell.CROSS){PuanX=2;PuanXX+=2;}
                else{PuanO=2;PuanOO+=2;}return 1;}
                 
               for(int m=1;m<4;m++){ 
                if(checkCell(i+m, j+m, c)){
                    durum=true;
               }else{durum=false; break;}
                 }
                 if(durum==true){if(c==Cell.CROSS){PuanX=3;PuanXX+=3;}
                else{PuanO=3;PuanOO+=3;}return 1;}
                 
                 
               for(int m=1;m<4;m++){ 
                if(checkCell(i-m, j+m, c)){
                    durum=true;
               }else{durum=false; break;}
                 }
                 if(durum==true){if(c==Cell.CROSS){PuanX=3;PuanXX+=3;}
                else{PuanO=3;PuanOO+=3;}return 1;}
                k++;
            }       
        
       }
                
   }
       if(k==berabere){return 0;}
 return 2;
   }
    
  
    private boolean checkCell(int i, int j, Cell cell) {
        if (i<0 || i>=board.getNumberOfRows()) return false;
        if (j<0 || j>=board.getNumberOfColumns()) return false;
        return board.getCell(i, j)==cell;
    }
 private void skorYaz()
 {
     Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String tarih=dateFormat.format(calendar.getTime()).toString();
         try{
        File dosya = new File("skor.txt");
        FileWriter yazici = new FileWriter(dosya,true);
        BufferedWriter yaz = new BufferedWriter(yazici);
         String yazi ="    "+tarih+"             "+zaman+"            "+skor.getText()+"\n";
        yaz.write(yazi);
        yaz.close();
        
    }
    catch (Exception hata){
    }

   }
}