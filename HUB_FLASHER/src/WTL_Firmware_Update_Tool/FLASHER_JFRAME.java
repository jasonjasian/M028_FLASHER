/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WTL_Firmware_Update_Tool;

import java.io.BufferedReader;
import java.io.FileFilter;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author chinn
 */
public class FLASHER_JFRAME extends javax.swing.JFrame {

    /**
     * Creates new form FLASHER_JFRAME
     */
    public FLASHER_JFRAME() {
        initComponents();   // auto-generated function to init components
        initOthers();       // call function to initialise other components

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        instructionsMainTitle = new javax.swing.JLabel();
        instruction1 = new javax.swing.JLabel();
        instruction2 = new javax.swing.JLabel();
        instruction3 = new javax.swing.JLabel();
        instruction4 = new javax.swing.JLabel();
        serverDemo3Button = new javax.swing.JButton();
        serverQaButton = new javax.swing.JButton();
        serverUatButton = new javax.swing.JButton();
        serverFirmwareButton = new javax.swing.JButton();
        instructionNote = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        customFileChooser = new javax.swing.JFileChooser();
        selectedFilePathTextField = new javax.swing.JTextField();
        customFlashButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        helpLabel1 = new javax.swing.JLabel();
        helpLabel2 = new javax.swing.JLabel();
        helpLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        prerequisiteTextArea = new javax.swing.JTextArea();
        helpLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        featureUpdateTextField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Made By A Hardware Engineer - JW");
        setResizable(false);

        instructionsMainTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        instructionsMainTitle.setText("How To Flash A Hub");

        instruction1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instruction1.setText("Insert Eleksen Connector into Eleksen Hub");
        instruction1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "1.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        instruction2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instruction2.setText("Insert Eleksen Hubstation Cable into computer");
        instruction2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "2.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        instruction3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instruction3.setText("Ensure Eleksen Hub is in Hubstation mode (Charging symbol on screen)");
        instruction3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "3.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        instruction4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instruction4.setText("Click the \"T2S\" button to start firmware update");
        instruction4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "4.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        serverDemo3Button.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        serverDemo3Button.setText("T2S");
        serverDemo3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverDemo3ButtonActionPerformed(evt);
            }
        });

        serverQaButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        serverQaButton.setText("QA");
        serverQaButton.setEnabled(false);
        serverQaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverQaButtonActionPerformed(evt);
            }
        });

        serverUatButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        serverUatButton.setText("UAT");
        serverUatButton.setEnabled(false);
        serverUatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverUatButtonActionPerformed(evt);
            }
        });

        serverFirmwareButton.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        serverFirmwareButton.setText("Firmware");
        serverFirmwareButton.setEnabled(false);
        serverFirmwareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverFirmwareButtonActionPerformed(evt);
            }
        });

        instructionNote.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        instructionNote.setText("Ensure only one Eleksen Hub is connected to the computer");
        instructionNote.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Note.", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(serverDemo3Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serverQaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serverUatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serverFirmwareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionsMainTitle)
                            .addComponent(instruction2)
                            .addComponent(instruction3)
                            .addComponent(instruction4))
                        .addGap(615, 615, 615))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(instructionNote)
                            .addComponent(instruction1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(instructionsMainTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instructionNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(instruction4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(serverDemo3Button)
                    .addComponent(serverQaButton)
                    .addComponent(serverUatButton)
                    .addComponent(serverFirmwareButton))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("HOW TO FLASH ELEKSEN HUB", jPanel2);

        customFileChooser.setDialogTitle("");
        customFileChooser.setFileHidingEnabled(true);
        customFileChooser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select WTL Binary File", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        customFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customFileChooserActionPerformed(evt);
            }
        });

        selectedFilePathTextField.setEditable(false);
        selectedFilePathTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selected File Path:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        customFlashButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        customFlashButton.setText("Flash!");
        customFlashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customFlashButtonActionPerformed(evt);
            }
        });

        customTextArea.setColumns(20);
        customTextArea.setRows(5);
        jScrollPane1.setViewportView(customTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(selectedFilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customFlashButton, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addComponent(customFileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(customFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectedFilePathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customFlashButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("CUSTOM FIRMWARE LOADING", jPanel1);

        helpLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        helpLabel1.setText("Troubleshooting: ");

        helpLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        helpLabel2.setText("Hub is not being detected: 1. Unplug both single charge cable and loom connector, USB first. Then replug both and retry flashing.");

        helpLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        helpLabel3.setText("If this does not work, check Device Manager for COM port of Eleksen Hub (CP2104) ");

        prerequisiteTextArea.setColumns(20);
        prerequisiteTextArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        prerequisiteTextArea.setLineWrap(true);
        prerequisiteTextArea.setRows(5);
        prerequisiteTextArea.setText("1. Windows CP2104 driver, link: https://www.silabs.com/products/development-tools/software/usb-to-uart-bridge-vcp-drivers\n\n2. Python3, link: https://www.python.org/downloads/\n2.1 Enable full PATH to python in setup wizard\n2.2 Install pip in setup wizard\n\n3. esptool installation through \"pip3 install esptool\"\n");
        prerequisiteTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prerequisites", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N
        jScrollPane2.setViewportView(prerequisiteTextArea);

        helpLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        helpLabel4.setText("Hub requires two erases before successful flash: This is a known observation. Wait for Hub to enter Hubstation mode before flashing.");

        featureUpdateTextField.setColumns(20);
        featureUpdateTextField.setRows(5);
        featureUpdateTextField.setText("- Allow selectable bootloader and partition binaries for custom flashing\n- Add more stable versions to instant flashing\n- Make detection of failed erase/flash more robust");
        featureUpdateTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Future Updates", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jScrollPane3.setViewportView(featureUpdateTextField);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helpLabel1)
                            .addComponent(helpLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(helpLabel3)
                            .addComponent(helpLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 36, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(helpLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(helpLabel3)
                .addGap(18, 18, 18)
                .addComponent(helpLabel4)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("HELP", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 857, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initOthers() {
        customFileChooser.setControlButtonsAreShown(false);
        prerequisiteTextArea.setEditable(false);
        //jTabbedPane1.setEnabled(false);
        serverQaButton.setVisible(false);
        serverFirmwareButton.setVisible(false);
        serverUatButton.setVisible(false);
    }
    private void customFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customFileChooserActionPerformed
        selectedFilePathTextField.setText(customFileChooser.getSelectedFile().getAbsolutePath());
        chosenFilePath = customFileChooser.getSelectedFile().getAbsolutePath();
        //System.out.println(chosenFilePath);
    }//GEN-LAST:event_customFileChooserActionPerformed

    private void customFlashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customFlashButtonActionPerformed

        try {
            selectedFilePathTextField.setText(customFileChooser.getSelectedFile().getAbsolutePath());   // sets the text of the selectedFilePathTextField to the directory of the file chosen
            chosenFilePath = customFileChooser.getSelectedFile().getAbsolutePath();                     // sets the chosenFilePath string as the directory of the file
            //System.out.println("Chosen file: " + chosenFilePath);
            
            
            try {

                if (eraseFlash(4)) {
                    
                    try {
                        writeFlashCustom(chosenFilePath);
                    } catch (Exception ex) {
                        Logger.getLogger(FLASHER_JFRAME.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else{}
            } catch (Exception ex) {
                Logger.getLogger(FLASHER_JFRAME.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (NullPointerException ex) {
            Logger.getLogger(FLASHER_JFRAME.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("null pointer exception");
            customFlashButton.setText("No file chosen!");
            customFlashButton.update(customFlashButton.getGraphics());
        }


    }//GEN-LAST:event_customFlashButtonActionPerformed

    private void serverFirmwareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverFirmwareButtonActionPerformed
        try {

            if(eraseFlash(1))
            {
                try{
                    writeFirmware();
                }
                catch (Exception ex){
                    Logger.getLogger(FLASHER_JFRAME.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(FLASHER_JFRAME.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_serverFirmwareButtonActionPerformed

    private void serverUatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverUatButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverUatButtonActionPerformed

    private void serverQaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverQaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serverQaButtonActionPerformed

    private void serverDemo3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverDemo3ButtonActionPerformed

        try {

            if(eraseFlash(0))
            {
                try{
                    writeDemo3();
                }
                catch (Exception ex){
                    Logger.getLogger(FLASHER_JFRAME.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(FLASHER_JFRAME.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_serverDemo3ButtonActionPerformed

    private void writeDemo3() throws Exception {
        
        serverDemo3Button.setText("Updating Firmware...");
        serverDemo3Button.update(serverDemo3Button.getGraphics());

        String dir = System.getProperty("user.dir"); // get the directory up until the dist folder, this will be used for esptool to get file location correct

        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "esptool.py -b 1152000 write_flash 0x1000 " + dir
                + "\\015_fix3\\015_fix3-demo3\\bootloader_015_fix3-demo3.bin 0x8000 " + dir  //C:\Users\chinn\Documents\git_repositories\Hub_Flasher\HUB_FLASHER\015_fix3\015_fix3-demo3
                + "\\015_fix3\\015_fix3-demo3\\partitions_two_ota_015_fix3-demo3.bin 0x10000 " + dir 
                        
                + "\\015_fix3\\015_fix3-demo3\\wtl-firmware-16.32.0514-ESS-PWS-T2S.m.bin");    // GKD_T2S SPECIAL
                //+ "\\015_fix3\\015_fix3-demo3\\wtl-firmware_015_fix3-demo3.bin"); NORMAL USAGE
        //);
                //+ "\\wtl-fw-Neil_PreRel_015_fix1_QA\\wtl-firmware.bin");
        
        builder.redirectErrorStream(true);
        Process flashDemo3Process = builder.start();
        
        BufferedReader r = new BufferedReader(new InputStreamReader(flashDemo3Process.getInputStream()));
        String line;
        
        while (true) {

            line = r.readLine();
            System.out.println(line);

            if (line == null) {
                serverDemo3Button.setText("T2S");
                serverDemo3Button.update(serverDemo3Button.getGraphics());
                break;
            }
            else if (line.contains("error"))
            {
                serverDemo3Button.setText("Write Error!");
                serverDemo3Button.update(serverDemo3Button.getGraphics());
                break;
            }

        }
    }
    
    private void writeFirmware() throws Exception{
        serverFirmwareButton.setText("Writing...");
        serverFirmwareButton.update(serverFirmwareButton.getGraphics());

        String dir = System.getProperty("user.dir"); // get the directory up until the dist folder, this will be used for esptool to get file location correct
        
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "esptool.py -b 1152000 write_flash 0x1000 " + dir
                + "\\015_fix3\\015_fix3-firmware\\bootloader-NEIL_PREREL_015_fix3-firmware.bin 0x8000 " + dir
                + "\\015_fix3\\015_fix3-firmware\\partitions_two_ota-NEIL_PREREL_015_fix3-firmware.bin 0x10000 " + dir 
                + "\\015_fix3\\015_fix3-firmware\\wtl-firmware-NEIL_PREREL_015_fix3-firmware.bin"); 
        //);
                //+ "\\wtl-fw-Neil_PreRel_015_fix1_QA\\wtl-firmware.bin");
        
        builder.redirectErrorStream(true);
        Process flashDemo3Process = builder.start();
        
        BufferedReader r = new BufferedReader(new InputStreamReader(flashDemo3Process.getInputStream()));
        String line;
        
        while (true) {

            line = r.readLine();
            System.out.println(line);

            if (line == null) {
                serverFirmwareButton.setText("Firmware");
                serverFirmwareButton.update(serverFirmwareButton.getGraphics());
                break;
            }
            else if (line.contains("error"))
            {
                serverFirmwareButton.setText("Write Error!");
                serverFirmwareButton.update(serverFirmwareButton.getGraphics());
                break;
            }

        }
    }
    
    public boolean eraseFlash(int server_type) throws Exception {

        switch(server_type){
            case 0: serverDemo3Button.setText("Erasing...");
                    serverDemo3Button.update(serverDemo3Button.getGraphics());
                    break;
            case 1: serverFirmwareButton.setText("Erasing...");
                    serverFirmwareButton.update(serverFirmwareButton.getGraphics());
                    break;
            case 2: break;
            case 3: break;
            case 4: customFlashButton.setText("Erasing Previous Build...");
                    customFlashButton.update(customFlashButton.getGraphics());
                    customTextArea.setText(null);
                    customTextArea.update(customTextArea.getGraphics());
                    break;
        }
        
        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", "esptool.py erase_flash");
        builder.redirectErrorStream(true);
        Process eraseProcess = builder.start();
        
        if (!eraseProcess.waitFor(15, TimeUnit.SECONDS)) {
            
            switch(server_type){
            case 0: serverDemo3Button.setText("Retry");
                    serverDemo3Button.update(serverDemo3Button.getGraphics());
                    break;
            case 1: break;
            case 2: break;
            case 3: break;
            case 4: customFlashButton.setText("Time Out Error!");
                    customFlashButton.update(customFlashButton.getGraphics());
                    break;
            }
            System.out.println("Timed out");
            eraseProcess.destroyForcibly();
            return false;
        }
        
        BufferedReader r = new BufferedReader(new InputStreamReader(eraseProcess.getInputStream()));
        String line;

        while (true) {
            
            line = r.readLine();        // gets line of response from cmd line
            System.out.println(line);   // prints that line of response

            if (line == null) {
                break;
                //return true;
            }
            else if(line.contains("error")){
                return false;
            }
            
            if(server_type == 4){                   // Show this only for the custom flash
                customTextArea.append(line + "\r\n");
                customTextArea.update(customTextArea.getGraphics());
            }
        }
        return true;
    }

    public boolean writeFlashCustom(String chosenFilePath) throws Exception {
        System.out.println(chosenFilePath);
        customTextArea.append(chosenFilePath + "\r\n");
        customTextArea.update(customTextArea.getGraphics());
        
        customFlashButton.setText("Writing Selected Build...");              // Update button text
        customFlashButton.update(customFlashButton.getGraphics());  // Show updated button text
        
        String dir = System.getProperty("user.dir"); // get the directory up until the dist folder, this will be used for esptool to get file location correct
        //System.out.println("current dir = " + dir);
        
        customTextArea.append("DIR: " + dir);

        //customTextArea.append(dir);
        //customTextArea.update(customTextArea.getGraphics());
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "esptool.py -b 1152000 write_flash 0x1000 " + dir
                + "\\015_fix3\\015_fix3-demo3\\bootloader_015_fix3-demo3.bin 0x8000 " + dir
                + "\\015_fix3\\015_fix3-demo3\\partitions_two_ota_015_fix3-demo3.bin 0x10000 " + chosenFilePath); //
        //);
                //+ "\\wtl-fw-Neil_PreRel_015_fix1_QA\\wtl-firmware.bin");
        
        builder.redirectErrorStream(true);
        Process flashCustomProcess = builder.start();

        BufferedReader r = new BufferedReader(new InputStreamReader(flashCustomProcess.getInputStream()));
        String line;

        while (true) {
//            if (!flashCustomProcess.waitFor(20, TimeUnit.SECONDS)) {
//                //customFlashButton.setText("Erase Time Out, Retry");
//                System.out.println("Timed out");
//                flashCustomProcess.destroyForcibly();
//                break;
//            }
            line = r.readLine();
            System.out.println(line);
            customTextArea.append(line + "\r\n");
            customTextArea.update(customTextArea.getGraphics());
            
            if (line == null) {
                customFlashButton.setText("Finished.");
                customFlashButton.update(customFlashButton.getGraphics());
                return true;
            }
            else if (line.contains("error"))
            {
                customFlashButton.setText("Error occurred, Retry.");
                customFlashButton.update(customFlashButton.getGraphics());
                return false;
            }
        }
        //return false;
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FLASHER_JFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FLASHER_JFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FLASHER_JFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FLASHER_JFRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLASHER_JFRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser customFileChooser;
    private javax.swing.JButton customFlashButton;
    private javax.swing.JTextArea customTextArea;
    private javax.swing.JTextArea featureUpdateTextField;
    private javax.swing.JLabel helpLabel1;
    private javax.swing.JLabel helpLabel2;
    private javax.swing.JLabel helpLabel3;
    private javax.swing.JLabel helpLabel4;
    private javax.swing.JLabel instruction1;
    private javax.swing.JLabel instruction2;
    private javax.swing.JLabel instruction3;
    private javax.swing.JLabel instruction4;
    private javax.swing.JLabel instructionNote;
    private javax.swing.JLabel instructionsMainTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea prerequisiteTextArea;
    private javax.swing.JTextField selectedFilePathTextField;
    private javax.swing.JButton serverDemo3Button;
    private javax.swing.JButton serverFirmwareButton;
    private javax.swing.JButton serverQaButton;
    private javax.swing.JButton serverUatButton;
    // End of variables declaration//GEN-END:variables
    private String chosenFilePath;
}
