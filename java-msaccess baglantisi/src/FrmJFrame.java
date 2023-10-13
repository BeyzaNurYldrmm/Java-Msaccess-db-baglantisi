import java.io.File;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
public class FrmJFrame extends javax.swing.JFrame {
     Connection conn;
     ResultSet rs;
     File file=null;
     String[] paths;
     String yol;
     String db="//C:\\Program Files (x86)\\db\\";//***Sadece burada db dosyasının yolunu yazın diğer yerleri dinamik olarak ayarlanacaktır.
       
    public  FrmJFrame() {
        initComponents();
    }
    
    public void  msConnectDB(JTable JTable1) throws SQLException{
       int i=0;       
        try{         
            String uzanti="accdb";//hangi uzantıyı kontrol ettirmek isyorsanız 
            file=new File("C:\\Program Files (x86)\\db");
            paths=file.list();
            
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
             jcmb.removeAllItems();
             jcmb1.removeAllItems();
            for(String path:paths)
            { 
                String dosyaUzantisi = path.substring(path.lastIndexOf(".") + 1);
                if(dosyaUzantisi.equals(uzanti)){
                conn=DriverManager.getConnection("jdbc:ucanaccess:"+db+path);    
                yol=path.replaceAll(".accdb", "");
                jcmb.addItem(yol.trim());
                jcmb1.addItem(yol.trim());
                Statement st=conn.createStatement();
                rs=st.executeQuery("Select * from "+yol.trim());
                     if(i==0){
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                        i++;
                     }
             /*
             if(i>0){
             jTable1.addModel
             i++;
             }*/
            conn.close(); 
            
               }
            }
            jlblvt.setText( Integer.toString(jcmb.getItemCount())+ " adet vt bulundu.");               
            }catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, e);
        }
    } 
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTc = new javax.swing.JScrollPane();
        txttc = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        txtAd = new javax.swing.JScrollPane();
        txtad = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtKod = new javax.swing.JScrollPane();
        txtid = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtsinif = new javax.swing.JTextPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        txttel = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        txtAdres = new javax.swing.JScrollPane();
        txtadres = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnCıkıs = new javax.swing.JButton();
        btnEkle = new javax.swing.JButton();
        btnGuncel = new javax.swing.JButton();
        btnSil = new javax.swing.JButton();
        btnYaz1 = new javax.swing.JButton();
        btnYenile = new javax.swing.JButton();
        jcmb1 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtAra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jcmb = new javax.swing.JComboBox<>();
        btnBaglan = new javax.swing.JButton();
        jlblvt = new javax.swing.JLabel();
        vt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 8));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MS ACCSEES PROJESİ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1080, 70));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 8));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("TC:");
        jLabel2.setName(""); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        txtTc.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        txttc.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtTc.setViewportView(txttc);

        jPanel2.add(txtTc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 240, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setText("Ad Soyad:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        txtAd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        txtad.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtAd.setViewportView(txtad);

        jPanel2.add(txtAd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 240, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel7.setText("Id:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel8.setText("Sınıf:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel9.setText("Telefon:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 20));

        txtKod.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        txtid.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtKod.setViewportView(txtid);

        jPanel2.add(txtKod, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 240, 30));

        jScrollPane7.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        txtsinif.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jScrollPane7.setViewportView(txtsinif);

        jPanel2.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 240, 30));

        jScrollPane8.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        txttel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jScrollPane8.setViewportView(txttel);

        jPanel2.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 240, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel10.setText("Eklenecek VT:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        txtAdres.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        txtadres.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtAdres.setViewportView(txtadres);

        jPanel2.add(txtAdres, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 240, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "TC", "Ad Soyad", "Sınıf", "Telefon", "Adres", "Bulunduğu VT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTable1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 700, 460));

        btnCıkıs.setBackground(new java.awt.Color(255, 204, 204));
        btnCıkıs.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCıkıs.setText("Çıkış");
        btnCıkıs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCıkısActionPerformed(evt);
            }
        });
        jPanel2.add(btnCıkıs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 120, 40));

        btnEkle.setBackground(new java.awt.Color(204, 255, 204));
        btnEkle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEkle.setLabel("Ekle");
        btnEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkleActionPerformed(evt);
            }
        });
        jPanel2.add(btnEkle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 120, 40));

        btnGuncel.setBackground(new java.awt.Color(204, 255, 204));
        btnGuncel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnGuncel.setLabel("Güncelle");
        btnGuncel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuncel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 120, 40));

        btnSil.setBackground(new java.awt.Color(255, 204, 204));
        btnSil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });
        jPanel2.add(btnSil, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 430, 120, 40));

        btnYaz1.setBackground(new java.awt.Color(204, 243, 229));
        btnYaz1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnYaz1.setText("Yazdır");
        btnYaz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYaz1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnYaz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 120, 40));

        btnYenile.setBackground(new java.awt.Color(204, 255, 255));
        btnYenile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnYenile.setText("Yenile");
        btnYenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYenileActionPerformed(evt);
            }
        });
        jPanel2.add(btnYenile, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 120, 40));

        jcmb1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jcmb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmb1ActionPerformed(evt);
            }
        });
        jPanel2.add(jcmb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setText("Adres:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1080, 500));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 8));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("VT:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 50, 30));

        txtAra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAraActionPerformed(evt);
            }
        });
        txtAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAraKeyReleased(evt);
            }
        });
        jPanel3.add(txtAra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 230, 30));

        jLabel12.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Arama:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 30));

        jcmb.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jcmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbActionPerformed(evt);
            }
        });
        jPanel3.add(jcmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 250, 30));

        btnBaglan.setBackground(new java.awt.Color(204, 255, 255));
        btnBaglan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBaglan.setText("DB Bağlan");
        btnBaglan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaglanActionPerformed(evt);
            }
        });
        jPanel3.add(btnBaglan, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 110, 30));

        jlblvt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlblvt.setForeground(new java.awt.Color(255, 0, 51));
        jlblvt.setText("Geçerli VT bulunamadı...");
        jPanel3.add(jlblvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1080, 60));
        getContentPane().add(vt, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 70, -1));

        jLabel4.setText("Bulunduğu VT:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JFrame frame;
    private void btnCıkısActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCıkısActionPerformed
      frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame,"Çıkış yapmak üzeresiniz, işleme devam edilsin mi?","Projeden Çıkış",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_btnCıkısActionPerformed

    private void btnBaglanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaglanActionPerformed
         txtAra.setText("".trim());// try bloğuna kadar silirsek ve kullanıcı kendi textFieldi temizler ise hata oluşmaz.
         DefaultTableModel obj=(DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj1=new TableRowSorter<>(obj);
        jTable1.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(txtAra.getText()));
               
        try {
             
             try {
                 Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
             }             
             
             try {
                 conn=DriverManager.getConnection("jdbc:ucanaccess:"+db+jcmb.getSelectedItem()+".accdb");
             } catch (SQLException ex) {
                 Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
             
             Statement st=conn.createStatement();
             rs=st.executeQuery("Select * from "+jcmb.getSelectedItem());
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
             //vt.setText((String) jcmb.getSelectedItem());
             conn.close();
             try {
                 conn.close();
             } catch (SQLException ex) {
                 try {
                     conn.close();
                 } catch (SQLException ex1) {
                     Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex1);
                 }
                 System.out.println("msConnectDB bağlantısında hata oluştu.");
             }

         } catch (SQLException ex) {
             Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
    }//GEN-LAST:event_btnBaglanActionPerformed

    private void btnEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkleActionPerformed
       // ImageIcon icon = new ImageIcon("C:/Users/06bey/Downloads/ekle.png"); mesaj kutusu görseli
         DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
         int selectRows=jTable1.getSelectedRow();
         String q1,q2,q3,q4,q5,q6;
         q1=txtid.getText();
         q2=txttc.getText();
         q3=txtad.getText();
         q4=txtsinif.getText();
         q5=txttel.getText();
         q6=txtadres.getText(); 
         file=new File(db);
         paths=file.list();
         
         try {
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
                           
               try {
                   conn=DriverManager.getConnection("jdbc:ucanaccess:"+db+jcmb1.getSelectedItem()+".accdb");       
                   Statement st=conn.createStatement();
                   st.executeUpdate("insert into "+jcmb1.getSelectedItem()+"(Id, TC, AdSoyad, Sınıf, Telefon, Adres)"+ " values('"+q1+"','"+q2+"','"+q3+"','"+q4+"','"+q5+"','"+q6+"')");
                   Statement stt=conn.createStatement();
                   rs=stt.executeQuery("Select * from "+jcmb1.getSelectedItem());
                   jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                   conn.close();
                   // JOptionPane.showMessageDialog(frame,null,"Kayıt işlemi başarılı.", JOptionPane.PLAIN_MESSAGE,icon);
                   JOptionPane.showMessageDialog(frame,"Kayıt işlemi başarılı.");
                   //msConnectDB(jTable1);               
              }catch(SQLException e){
                    try {
                       conn.close();
                    } catch (SQLException ex) {
                 Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
             }
                JOptionPane.showMessageDialog(this,"Kayıt işlemi gerçekleşirken bir sorun meydana geldi.");
                //JOptionPane.showMessageDialog(null, e);
        }           
    }//GEN-LAST:event_btnEkleActionPerformed

    private void btnGuncelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelActionPerformed
         DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
         int selectRows=jTable1.getSelectedRow();
         //int id= Integer.parseInt(RecordTable.getValueAt(selectRows,0).toString());
         String q1,q2,q3,q4,q5,q6;        
         q1=txtid.getText();
         q2=txttc.getText();
         q3=txtad.getText();
         q4=txtsinif.getText();
         q5=txttel.getText();
         q6=txtadres.getText(); 
         file=new File(db);
         paths=file.list();
         
         try {
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
                           
               try {
                   conn=DriverManager.getConnection("jdbc:ucanaccess:"+db+vt.getText()+".accdb");     
                   Statement st=conn.createStatement();
                   st.execute("update "+vt.getText()+" set TC='"+q2+"', AdSoyad='"+q3+"', Sınıf='"+q4+"', Telefon='"+q5+"', Adres='"+q6+"' where Id="+q1);
                   Statement stt=conn.createStatement();
                   rs=stt.executeQuery("Select * from "+vt.getText());
                   jTable1.setModel(DbUtils.resultSetToTableModel(rs));             
                   conn.close();
                   JOptionPane.showMessageDialog(frame,"Güncelleme işlemi başarılı.");
                }catch(SQLException e){
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            //JOptionPane.showMessageDialog(this,"Güncelleme işlemi gerçekleşirken bir sorun meydana geldi.");
            JOptionPane.showMessageDialog(this, e);
            }                
    }//GEN-LAST:event_btnGuncelActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed
         String q1;
         q1=txtid.getText();
         int sor=JOptionPane.showConfirmDialog(null,"Kişiyi veritabanından silmek üzeresiniz, işleme devam edilsin mi?","Uyarı",JOptionPane.YES_NO_OPTION);
       
        if(sor== JOptionPane.YES_NO_OPTION){            
         try {
             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
            try {
              conn=DriverManager.getConnection("jdbc:ucanaccess:"+db+vt.getText()+".accdb");  
              Statement st=conn.createStatement();
              st.executeUpdate("delete from "+vt.getText()+" where Id="+q1);             
              txttc.setText("");        
              txtad.setText("");
              txtid.setText("");
              txtsinif.setText("");
              txttel.setText("");        
              txtadres.setText("");
              Statement stt=conn.createStatement();
              rs=stt.executeQuery("Select * from "+vt.getText());
              jTable1.setModel(DbUtils.resultSetToTableModel(rs));
              conn.close();
              JOptionPane.showMessageDialog(frame,"Silme işlemi başarılı.");            
            }catch(SQLException e){
               try {
                   conn.close();
               } catch (SQLException ex) {
                   Logger.getLogger(FrmJFrame.class.getName()).log(Level.SEVERE, null, ex);
               }
             //JOptionPane.showMessageDialog(this,"Silme işlemi gerçekleşirken bir sorun meydana geldi.");
             JOptionPane.showMessageDialog(this, e);
        }       
       }
    }//GEN-LAST:event_btnSilActionPerformed

    private void btnYaz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYaz1ActionPerformed
       MessageFormat header=new MessageFormat("Yazdırma işlemi");
       MessageFormat footer=new MessageFormat("Sayfa{0,number,integer}");
       try{
           jTable1.print(JTable.PrintMode.NORMAL,header,footer);
           }catch(java.awt.print.PrinterException e){
                JOptionPane.showMessageDialog(null, e);
           }
       
    }//GEN-LAST:event_btnYaz1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
         try {
             msConnectDB(jTable1);
         } catch (SQLException ex) {
             System.out.println(ex);
         }
    }//GEN-LAST:event_formWindowActivated

    private void btnYenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYenileActionPerformed
        txttc.setText("");        
        txtad.setText("");
        txtid.setText("");
        txtsinif.setText("");
        txttel.setText("");        
        txtadres.setText("");  
        txtAra.setText("");
    }//GEN-LAST:event_btnYenileActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       DefaultTableModel RecordTable=(DefaultTableModel)jTable1.getModel();
       int selectRows=jTable1.getSelectedRow();
        txtid.setText(RecordTable.getValueAt(selectRows,0).toString());
        txttc.setText(RecordTable.getValueAt(selectRows,1).toString());
        txtad.setText(RecordTable.getValueAt(selectRows,2).toString());       
        txtsinif.setText(RecordTable.getValueAt(selectRows,3).toString());
        txttel.setText(RecordTable.getValueAt(selectRows,4).toString());        
        txtadres.setText(RecordTable.getValueAt(selectRows,5).toString()); 
        vt.setText((String) jcmb.getSelectedItem());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyReleased
        
    }//GEN-LAST:event_jTable1KeyReleased

    private void txtAraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyReleased
       DefaultTableModel obj=(DefaultTableModel)jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj1=new TableRowSorter<>(obj);
        jTable1.setRowSorter(obj1);
        obj1.setRowFilter(RowFilter.regexFilter(txtAra.getText()));
        
    }//GEN-LAST:event_txtAraKeyReleased

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jcmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmbActionPerformed

    private void jcmb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcmb1ActionPerformed

    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAraActionPerformed

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
            java.util.logging.Logger.getLogger(FrmJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            new FrmJFrame().setVisible(true);
       
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaglan;
    private javax.swing.JButton btnCıkıs;
    private javax.swing.JButton btnEkle;
    private javax.swing.JButton btnGuncel;
    private javax.swing.JButton btnSil;
    private javax.swing.JButton btnYaz1;
    private javax.swing.JButton btnYenile;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private static final javax.swing.JTable jTable1 = new javax.swing.JTable();
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> jcmb;
    private javax.swing.JComboBox<String> jcmb1;
    private javax.swing.JLabel jlblvt;
    private javax.swing.JScrollPane txtAd;
    private javax.swing.JScrollPane txtAdres;
    private javax.swing.JTextField txtAra;
    private javax.swing.JScrollPane txtKod;
    private javax.swing.JScrollPane txtTc;
    private javax.swing.JTextPane txtad;
    private javax.swing.JTextPane txtadres;
    private javax.swing.JTextPane txtid;
    private javax.swing.JTextPane txtsinif;
    private javax.swing.JTextPane txttc;
    private javax.swing.JTextPane txttel;
    private javax.swing.JLabel vt;
    // End of variables declaration//GEN-END:variables
}
