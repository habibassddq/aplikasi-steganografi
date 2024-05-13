package Stegano;

/**
 *
 * @author acer
 */
import java.io.BufferedReader;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import SteganoIkhsan.Coding;
 
 
public class Main extends javax.swing.JFrame {
   Steganografi model;
    String pesan = "";
    File dirGambarKom;
    String sPath= "";
    String sName ="";
    Coding vig;
    /**
     * Creates new form UserInterface
     */
    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        txtGambar.setText("");
        txtTeks.setText("");
        vig = new Coding();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        tabMenu = new javax.swing.JTabbedPane();
        pnlKompres = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblGambar = new javax.swing.JLabel();
        lblTeks = new javax.swing.JLabel();
        lblKunci = new javax.swing.JLabel();
        txtGambar = new javax.swing.JTextField();
        txtTeks = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        btnTeks = new javax.swing.JButton();
        btnEncode = new javax.swing.JButton();
        txtKunci = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        spImageKompres = new javax.swing.JScrollPane();
        lblImageKompres = new javax.swing.JLabel();
        pnlEkstrak = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblGambar1 = new javax.swing.JLabel();
        lblKunci1 = new javax.swing.JLabel();
        txtGambarEkstrak = new javax.swing.JTextField();
        btnGambarBrowseEkstrak = new javax.swing.JButton();
        btnEkstrak = new javax.swing.JButton();
        lblNamFile = new javax.swing.JLabel();
        txtFileNama = new javax.swing.JTextField();
        txtKunciEkstrak = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        spImageEkstrak = new javax.swing.JScrollPane();
        lblImageEkstrak = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Steganography");

        pnlBackground.setBackground(new java.awt.Color(255, 255, 255));
        pnlBackground.setToolTipText("Steganography");
        pnlBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlKompres.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));

        lblGambar.setText("Gambar Cover");

        lblTeks.setText("Pesan Teks");

        lblKunci.setText("Password");

        txtGambar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGambarActionPerformed(evt);
            }
        });

        txtTeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeksActionPerformed(evt);
            }
        });

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnTeks.setText("Browse");
        btnTeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeksActionPerformed(evt);
            }
        });

        btnEncode.setText("Encode");
        btnEncode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGambar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(lblTeks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblKunci, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGambar)
                    .addComponent(txtTeks)
                    .addComponent(txtKunci))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTeks, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncode, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGambar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGambar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse))
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeks, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTeks))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKunci, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEncode)
                    .addComponent(txtKunci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        lblImageKompres.setBackground(new java.awt.Color(204, 204, 255));
        spImageKompres.setViewportView(lblImageKompres);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(spImageKompres, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spImageKompres, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlKompresLayout = new javax.swing.GroupLayout(pnlKompres);
        pnlKompres.setLayout(pnlKompresLayout);
        pnlKompresLayout.setHorizontalGroup(
            pnlKompresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKompresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKompresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlKompresLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlKompresLayout.setVerticalGroup(
            pnlKompresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKompresLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabMenu.addTab("Encode", pnlKompres);

        pnlEkstrak.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setBackground(new java.awt.Color(153, 255, 153));

        lblGambar1.setText("Gambar Encode");

        lblKunci1.setText("Password");

        txtGambarEkstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGambarEkstrakActionPerformed(evt);
            }
        });

        btnGambarBrowseEkstrak.setText("Pilih");
        btnGambarBrowseEkstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGambarBrowseEkstrakActionPerformed(evt);
            }
        });

        btnEkstrak.setText("Ekstrak");
        btnEkstrak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEkstrakActionPerformed(evt);
            }
        });

        lblNamFile.setText("Nama File Ekstrak");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNamFile, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGambar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblKunci1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(txtGambarEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGambarBrowseEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(217, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFileNama, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKunciEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGambar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGambarEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGambarBrowseEkstrak))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKunci1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKunciEkstrak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamFile, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEkstrak)
                    .addComponent(txtFileNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        spImageEkstrak.setViewportView(lblImageEkstrak);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spImageEkstrak)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spImageEkstrak, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlEkstrakLayout = new javax.swing.GroupLayout(pnlEkstrak);
        pnlEkstrak.setLayout(pnlEkstrakLayout);
        pnlEkstrakLayout.setHorizontalGroup(
            pnlEkstrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEkstrakLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEkstrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlEkstrakLayout.setVerticalGroup(
            pnlEkstrakLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEkstrakLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabMenu.addTab("Ekstrak", pnlEkstrak);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );

        tabMenu.addTab("tab3", jPanel5);

        pnlBackground.add(tabMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, 430));

        jLabel1.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Steganography By Habib Silvia Shilla ");
        pnlBackground.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 630, 40));

        jLabel2.setText("jLabel2");
        pnlBackground.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtGambarEkstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGambarEkstrakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGambarEkstrakActionPerformed

    private void btnGambarBrowseEkstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGambarBrowseEkstrakActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser("./");
        jfc.showOpenDialog(null);
        File file= null;
        try{
           jfc.setFileFilter(new FilterGambar());
           file = jfc.getSelectedFile();
           String dir = file.getAbsolutePath(); 
           txtGambarEkstrak.setText(dir);
        }catch(Exception E){
           JOptionPane.showMessageDialog(null, "Silahkan Pilih file gambar");
        }
       try {
        String image = file.getPath();
        sPath =file.getPath();
        sName = file.getName();
        sPath = sPath.substring(0, sPath.length()-sName.length()-1);
        sName = sName.substring(0, sName.length()-4);
       
        lblImageEkstrak.setIcon(new ImageIcon(ImageIO.read(new File(image))));
       } catch (IOException ex) {
           System.out.println("gagal!!!");
       }
    }//GEN-LAST:event_btnGambarBrowseEkstrakActionPerformed

    private void btnEkstrakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEkstrakActionPerformed
        // TODO add your handling code here:
        if (txtGambarEkstrak.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Pilih Gambar terlebih dahulu!!!");
        }else{
            model = new Steganografi();
            String cipher = model.decode(sPath, sName);
            //di sini masih bug
            if(cipher != ""){
                System.out.println("ciphertext :\n" + cipher);
                JOptionPane.showMessageDialog(null, "Ekstrak Pesan Berhasil!\n"
                        + "Pesan di simpan pada " + sPath + "\\" + txtFileNama.getText() + ".txt", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }
            String key = txtKunciEkstrak.getText();
            String psn=null;
            if(key.equals("")){
                psn = cipher;
            }else{
                String file = sPath + "/"+txtFileNama.getText()+".txt";
                vig.setPath(file);
                try {
//                    vig.Dekrip(cipher, key);
                psn = vig.Dekrip(cipher, key);
                } catch (IOException ex) {
                    System.out.println("Gagal");
                }
            }
            System.out.println("plain \n" + psn);
        }
    }//GEN-LAST:event_btnEkstrakActionPerformed

    
    private void btnEncodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncodeActionPerformed
        // TODO add your handling code here:
        if (txtGambar.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Pilih Gambar terlebih dahulu!!!");
        }else if(txtTeks.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Pilih Teks Pesan terlebih dahulu!!!");
        }else{
            if(txtKunci.getText().equals("")){
                //do Nothing
            }else
            pesan = new Coding().Enkrip(pesan, txtKunci.getText());
            File directory = dirGambarKom;
            try{
                model = new Steganografi();
                String text = pesan;
                String ext  = FilterGambar.getExtension(directory);
                String name = directory.getName();
                String path = directory.getPath();
                path = path.substring(0,path.length()-name.length()-1);

                name = name.substring(0, name.length()-4);
                String stegan = JOptionPane.showInputDialog(null,
                    "Masukkan nama file image yang disisipkan :", "File name",
                    JOptionPane.PLAIN_MESSAGE);
                if(stegan != ""){
                    if(model.encode(path,name,ext,stegan,text)){
                        JOptionPane.showMessageDialog(null, "Proses Sisip pesan berhasil! \n"
                            + "File di simpan pada " + path + "\\" + stegan + ".png", 
                            "Success!", JOptionPane.INFORMATION_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Gambar tidak dapat dikompres!",
                        "Error!", JOptionPane.INFORMATION_MESSAGE);
                }
                //display the new image
                lblImageKompres.setIcon(new ImageIcon(ImageIO.read(new File(path + "/" + stegan + ".png"))));
                //                txtGambar.setText("");
                //                txtTeks.setText("");
                //                txtKunci.setText("");
            }catch(Exception except) {
                //Pesan Jika proses gagal
                JOptionPane.showMessageDialog(null, "File tidak dapat dibuka!",
                    "Error!", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEncodeActionPerformed

    private void btnTeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeksActionPerformed
        // TODO add your handling code here:
        String dir1 = null;
        JFileChooser jfc = new JFileChooser("./");
        jfc.showOpenDialog(null);
        try{
            jfc.addChoosableFileFilter(new FileNameExtensionFilter("text file", ".txt"));
            File file = jfc.getSelectedFile();
            String dir = file.getAbsolutePath();
            dir1=dir;
            txtTeks.setText(dir);
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, "Pilih file text");
        }
        if(txtTeks.getText().equals("")){

        }else{
            File file ;
            BufferedReader br = null;
            try {
                file = new File(dir1);
                br = new BufferedReader(new FileReader(file));
            } catch (FileNotFoundException ex) {
                System.out.println("Gagal!!!");
            }

            String st;
            try {
                while ((st = br.readLine()) != null){
                    pesan += st+"\n";
                }
            } catch (IOException ex) {
                System.out.println("Gagal!!!");
            }
            System.out.println("Plainteks :\n " + pesan );
        }
    }//GEN-LAST:event_btnTeksActionPerformed

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser jfc = new JFileChooser("./");
        jfc.showOpenDialog(null);
        try{
            jfc.setFileFilter(new FilterGambar());
            File file = jfc.getSelectedFile();
            dirGambarKom = file;
            String dir = file.getAbsolutePath();
            txtGambar.setText(dir);
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, "Silahkan Pilih file gambar");
        }
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void txtGambarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGambarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGambarActionPerformed

    private void txtTeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeksActionPerformed
    
    
    
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnEkstrak;
    private javax.swing.JButton btnEncode;
    private javax.swing.JButton btnGambarBrowseEkstrak;
    private javax.swing.JButton btnTeks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblGambar;
    private javax.swing.JLabel lblGambar1;
    private javax.swing.JLabel lblImageEkstrak;
    private javax.swing.JLabel lblImageKompres;
    private javax.swing.JLabel lblKunci;
    private javax.swing.JLabel lblKunci1;
    private javax.swing.JLabel lblNamFile;
    private javax.swing.JLabel lblTeks;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlEkstrak;
    private javax.swing.JPanel pnlKompres;
    private javax.swing.JScrollPane spImageEkstrak;
    private javax.swing.JScrollPane spImageKompres;
    private javax.swing.JTabbedPane tabMenu;
    private javax.swing.JTextField txtFileNama;
    private javax.swing.JTextField txtGambar;
    private javax.swing.JTextField txtGambarEkstrak;
    private javax.swing.JPasswordField txtKunci;
    private javax.swing.JPasswordField txtKunciEkstrak;
    private javax.swing.JTextField txtTeks;
    // End of variables declaration//GEN-END:variables
}
