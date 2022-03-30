/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guifordecoder;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.CardLayout;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EZEN
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    ArrayList<File> files = new ArrayList<>();
    public MainFrame() {
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

        jFileChooser1 = new javax.swing.JFileChooser();
        panelFiles = new javax.swing.JPanel();
        subPanelTool = new javax.swing.JPanel();
        buttonOF = new javax.swing.JButton();
        buttonRemoveAll = new javax.swing.JButton();
        buttonRemove = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        panelFileFilters = new javax.swing.JPanel();
        panelCard = new javax.swing.JPanel();
        subPanelDragDrop = new javax.swing.JPanel();
        DropFile = new javax.swing.JLabel();
        subPanelFilesScroll = new javax.swing.JScrollPane();
        tableFiles = new javax.swing.JTable();
        panelFunctions = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        subPanelDecode = new javax.swing.JPanel();
        buttonDecode = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        subPanelDetectEncoding = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("File Decoder\n");
        setLocationByPlatform(true);

        buttonOF.setText("Open File(s)");
        buttonOF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOFActionPerformed(evt);
            }
        });

        buttonRemoveAll.setText("Remove All");
        buttonRemoveAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveAllActionPerformed(evt);
            }
        });

        buttonRemove.setText("Remove");
        buttonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoveActionPerformed(evt);
            }
        });

        jCheckBox2.setText("Select All");

        javax.swing.GroupLayout subPanelToolLayout = new javax.swing.GroupLayout(subPanelTool);
        subPanelTool.setLayout(subPanelToolLayout);
        subPanelToolLayout.setHorizontalGroup(
            subPanelToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelToolLayout.createSequentialGroup()
                .addComponent(buttonOF)
                .addGap(34, 34, 34)
                .addComponent(buttonRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRemoveAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox2)
                .addContainerGap())
        );
        subPanelToolLayout.setVerticalGroup(
            subPanelToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelToolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(buttonOF)
                .addComponent(buttonRemoveAll)
                .addComponent(buttonRemove)
                .addComponent(jCheckBox2))
        );

        panelFileFilters.setBorder(javax.swing.BorderFactory.createTitledBorder("File filters\n"));

        javax.swing.GroupLayout panelFileFiltersLayout = new javax.swing.GroupLayout(panelFileFilters);
        panelFileFilters.setLayout(panelFileFiltersLayout);
        panelFileFiltersLayout.setHorizontalGroup(
            panelFileFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelFileFiltersLayout.setVerticalGroup(
            panelFileFiltersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        panelCard.setLayout(new java.awt.CardLayout());

        DropFile.setText("DropFile");

        javax.swing.GroupLayout subPanelDragDropLayout = new javax.swing.GroupLayout(subPanelDragDrop);
        subPanelDragDrop.setLayout(subPanelDragDropLayout);
        subPanelDragDropLayout.setHorizontalGroup(
            subPanelDragDropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelDragDropLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(DropFile)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        subPanelDragDropLayout.setVerticalGroup(
            subPanelDragDropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelDragDropLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(DropFile)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        panelCard.add(subPanelDragDrop, "cardDragDrop");

        tableFiles.setAutoCreateRowSorter(true);
        tableFiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type", "Date modified", "Size", "Encoding", " "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFiles.setToolTipText("");
        tableFiles.setColumnSelectionAllowed(true);
        tableFiles.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableFiles.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tableFiles.setShowGrid(false);
        tableFiles.setShowHorizontalLines(true);
        tableFiles.getTableHeader().setReorderingAllowed(false);
        subPanelFilesScroll.setViewportView(tableFiles);
        tableFiles.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tableFiles.getColumnModel().getColumnCount() > 0) {
            tableFiles.getColumnModel().getColumn(0).setPreferredWidth(300);
            tableFiles.getColumnModel().getColumn(1).setPreferredWidth(50);
            tableFiles.getColumnModel().getColumn(2).setPreferredWidth(150);
            tableFiles.getColumnModel().getColumn(3).setPreferredWidth(50);
            tableFiles.getColumnModel().getColumn(4).setPreferredWidth(70);
            tableFiles.getColumnModel().getColumn(5).setResizable(false);
            tableFiles.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        panelCard.add(subPanelFilesScroll, "cardFile");

        javax.swing.GroupLayout panelFilesLayout = new javax.swing.GroupLayout(panelFiles);
        panelFiles.setLayout(panelFilesLayout);
        panelFilesLayout.setHorizontalGroup(
            panelFilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFilesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subPanelTool, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFileFilters, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelFilesLayout.setVerticalGroup(
            panelFilesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFilesLayout.createSequentialGroup()
                .addComponent(subPanelTool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCard, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelFileFilters, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelCardAddDropAndDrag();

        subPanelDecode.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        buttonDecode.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        buttonDecode.setText("Decode");
        buttonDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecodeActionPerformed(evt);
            }
        });

        jLabel1.setText("Source Encoding");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("(replace with icon");

        jLabel3.setText("Target Encoding");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("txt");

        jRadioButton2.setText("other:");

        jCheckBox1.setText("all");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout subPanelDecodeLayout = new javax.swing.GroupLayout(subPanelDecode);
        subPanelDecode.setLayout(subPanelDecodeLayout);
        subPanelDecodeLayout.setHorizontalGroup(
            subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subPanelDecodeLayout.createSequentialGroup()
                .addGroup(subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelDecodeLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDecode, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subPanelDecodeLayout.createSequentialGroup()
                        .addGroup(subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(subPanelDecodeLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(subPanelDecodeLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(subPanelDecodeLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(52, 52, 52)
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCheckBox1))))
                            .addGroup(subPanelDecodeLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)))
                        .addGap(0, 286, Short.MAX_VALUE)))
                .addContainerGap())
        );
        subPanelDecodeLayout.setVerticalGroup(
            subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subPanelDecodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)
                        .addComponent(jCheckBox1)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(subPanelDecodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDecode, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subPanelDecodeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabbedPane.addTab("Decode", subPanelDecode);

        subPanelDetectEncoding.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout subPanelDetectEncodingLayout = new javax.swing.GroupLayout(subPanelDetectEncoding);
        subPanelDetectEncoding.setLayout(subPanelDetectEncodingLayout);
        subPanelDetectEncodingLayout.setHorizontalGroup(
            subPanelDetectEncodingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        subPanelDetectEncodingLayout.setVerticalGroup(
            subPanelDetectEncodingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 182, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Detect Encoding", subPanelDetectEncoding);

        javax.swing.GroupLayout panelFunctionsLayout = new javax.swing.GroupLayout(panelFunctions);
        panelFunctions.setLayout(panelFunctionsLayout);
        panelFunctionsLayout.setHorizontalGroup(
            panelFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        panelFunctionsLayout.setVerticalGroup(
            panelFunctionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFunctionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuFile.setText("File");
        menuBar.add(menuFile);

        menuEdit.setText("Edit");
        menuBar.add(menuEdit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelFunctions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFiles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void panelCardAddDropAndDrag() {
        new DropTarget(subPanelDragDrop, new DropTargetListener() {
            @Override
            public void dragEnter(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragOver(DropTargetDragEvent dtde) {
            }

            @Override
            public void dropActionChanged(DropTargetDragEvent dtde) {
            }

            @Override
            public void dragExit(DropTargetEvent dte) {
            }

            @Override
            public void drop(DropTargetDropEvent dtde) {
                dtde.acceptDrop(DnDConstants.ACTION_COPY);
                Transferable transferable = dtde.getTransferable();
                DataFlavor[] flavors = transferable.getTransferDataFlavors();
                for (DataFlavor f : flavors){
                    if(f.isFlavorJavaFileListType()){
                        try {
                            files.addAll((List)transferable.getTransferData(f));
                        } catch (UnsupportedFlavorException | IOException ex) {
                            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                for(File fl : files){
                    System.out.println(fl.getAbsolutePath());
                }
                dtde.dropComplete(true);
                if(!files.isEmpty()){
                    System.out.println("not empty");
                    CardLayout c = (CardLayout) panelCard.getLayout();
                    c.show(panelCard, "cardFile");
                }
                updateTable();
            }
        });
    }
    
    private void buttonOFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOFActionPerformed
        jFileChooser1 = new JFileChooser();
        jFileChooser1.setMultiSelectionEnabled(true);
        if(jFileChooser1.showOpenDialog(subPanelTool) == JFileChooser.APPROVE_OPTION){
            files.addAll(Arrays.asList(jFileChooser1.getSelectedFiles()));
        }
        updateTable();
    }//GEN-LAST:event_buttonOFActionPerformed
    private void updateTable(){
        DefaultTableModel model = (DefaultTableModel) tableFiles.getModel();
        for(File f : files){
            model.addRow(new Object[]{f.getName(),1,2,3,4,true});
        }
    }
    private void buttonDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDecodeActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void buttonRemoveAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveAllActionPerformed
        files.clear();
        //clear model
    }//GEN-LAST:event_buttonRemoveAllActionPerformed

    private void buttonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonRemoveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DropFile;
    private javax.swing.JButton buttonDecode;
    private javax.swing.JButton buttonOF;
    private javax.swing.JButton buttonRemove;
    private javax.swing.JButton buttonRemoveAll;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JPanel panelCard;
    private javax.swing.JPanel panelFileFilters;
    private javax.swing.JPanel panelFiles;
    private javax.swing.JPanel panelFunctions;
    private javax.swing.JPanel subPanelDecode;
    private javax.swing.JPanel subPanelDetectEncoding;
    private javax.swing.JPanel subPanelDragDrop;
    private javax.swing.JScrollPane subPanelFilesScroll;
    private javax.swing.JPanel subPanelTool;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tableFiles;
    // End of variables declaration//GEN-END:variables
}
