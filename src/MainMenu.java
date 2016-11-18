/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ljn
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainMenu() {
        initComponents();
        addPan.setVisible(false);
        mainPan.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        genderSelectionRadButGroup = new javax.swing.ButtonGroup();
        empTypeSelectionRadButGroup = new javax.swing.ButtonGroup();
        mainPan = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        addBut = new javax.swing.JButton();
        removeBut = new javax.swing.JButton();
        searchBut = new javax.swing.JButton();
        displayBut = new javax.swing.JButton();
        modifyBut = new javax.swing.JButton();
        loadBut = new javax.swing.JButton();
        addPan = new javax.swing.JPanel();
        homeButFromAddPan = new javax.swing.JButton();
        addTitle = new javax.swing.JLabel();
        empNumLabel = new javax.swing.JLabel();
        empNumInput = new javax.swing.JTextField();
        fNameLabel = new javax.swing.JLabel();
        fNameInput = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        lNameInput = new javax.swing.JTextField();
        sexLabel = new javax.swing.JLabel();
        maleRadBut = new javax.swing.JRadioButton();
        femaleRadBut = new javax.swing.JRadioButton();
        otherRadBut = new javax.swing.JRadioButton();
        workLocationLabel = new javax.swing.JLabel();
        workLocationDropdown = new javax.swing.JComboBox<>();
        fullTimeRadBut = new javax.swing.JRadioButton();
        partTimeRadBut = new javax.swing.JRadioButton();
        deductionsRateLabel = new javax.swing.JLabel();
        deductionsRateInput = new javax.swing.JFormattedTextField();
        saveButFromAddPan = new javax.swing.JButton();
        cancelButFromAddPan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fullTimeInputsPan = new javax.swing.JPanel();
        hourlyWageLabel = new javax.swing.JLabel();
        hoursPerWeekLabel = new javax.swing.JLabel();
        weeksPerYearLabel = new javax.swing.JLabel();
        hourlyWageInput = new javax.swing.JFormattedTextField();
        hoursPerWeekInput = new javax.swing.JFormattedTextField();
        weeksPerYearInput = new javax.swing.JFormattedTextField();
        partTimeInputsPan = new javax.swing.JPanel();
        annualSalaryLabel = new javax.swing.JLabel();
        annualSalaryInput = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPan.setMaximumSize(new java.awt.Dimension(600, 450));
        mainPan.setMinimumSize(new java.awt.Dimension(600, 450));
        mainPan.setPreferredSize(new java.awt.Dimension(600, 450));
        mainPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        Title.setText("Employee Database System");
        mainPan.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 360, 40));

        addBut.setText("Add");
        addBut.setMaximumSize(new java.awt.Dimension(50, 20));
        addBut.setMinimumSize(new java.awt.Dimension(50, 20));
        addBut.setPreferredSize(new java.awt.Dimension(50, 20));
        addBut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clickedAddFromMainPan(evt);
            }
        });
        mainPan.add(addBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, 60));

        removeBut.setText("Remove");
        mainPan.add(removeBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 120, 60));

        searchBut.setText("Search");
        searchBut.setMaximumSize(new java.awt.Dimension(50, 20));
        searchBut.setMinimumSize(new java.awt.Dimension(50, 20));
        searchBut.setPreferredSize(new java.awt.Dimension(50, 20));
        mainPan.add(searchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 60));

        displayBut.setText("Display");
        mainPan.add(displayBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 120, 60));

        modifyBut.setText("Modify");
        mainPan.add(modifyBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 120, 60));

        loadBut.setText("Load");
        mainPan.add(loadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 120, 60));

        getContentPane().add(mainPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        addPan.setMaximumSize(new java.awt.Dimension(600, 450));
        addPan.setMinimumSize(new java.awt.Dimension(600, 450));
        addPan.setPreferredSize(new java.awt.Dimension(600, 450));
        addPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButFromAddPan.setText("Home");
        homeButFromAddPan.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                clickedHomeButFromAddPan(evt);
            }
        });
        addPan.add(homeButFromAddPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        addTitle.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        addTitle.setText("Add");
        addPan.add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        empNumLabel.setText("Employee Number:");
        addPan.add(empNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, 20));
        addPan.add(empNumInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 110, -1));

        fNameLabel.setText("First Name:");
        addPan.add(fNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 90, 20));
        addPan.add(fNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 110, -1));

        lNameLabel.setText("Last Name:");
        addPan.add(lNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 90, 20));
        addPan.add(lNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 110, -1));

        sexLabel.setText("Sex:");
        addPan.add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 30, 20));

        genderSelectionRadButGroup.add(maleRadBut);
        maleRadBut.setText("Male");
        addPan.add(maleRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        genderSelectionRadButGroup.add(femaleRadBut);
        femaleRadBut.setText("Female");
        addPan.add(femaleRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, -1, -1));

        genderSelectionRadButGroup.add(otherRadBut);
        otherRadBut.setText("Other");
        addPan.add(otherRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        workLocationLabel.setText("Work Location:");
        addPan.add(workLocationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 90, 20));

        workLocationDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mississauga", "Ottawa", "Chicago" }));
        addPan.add(workLocationDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        empTypeSelectionRadButGroup.add(fullTimeRadBut);
        fullTimeRadBut.setText("Full Time");
        fullTimeRadBut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                fullTimeRadButClicked(evt);
            }
        });
        addPan.add(fullTimeRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        empTypeSelectionRadButGroup.add(partTimeRadBut);
        partTimeRadBut.setText("Part Time");
        partTimeRadBut.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                partTimeRadButClicked(evt);
            }
        });
        addPan.add(partTimeRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));

        deductionsRateLabel.setText("Deductions Rate:");
        addPan.add(deductionsRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 110, 20));

        deductionsRateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        addPan.add(deductionsRateInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 70, -1));

        saveButFromAddPan.setText("Save");
        addPan.add(saveButFromAddPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 70, -1));

        cancelButFromAddPan.setText("Cancel");
        cancelButFromAddPan.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                canelButFromAddPanClicked(evt);
            }
        });
        addPan.add(cancelButFromAddPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        jLabel1.setText("Employee Type:");
        addPan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 100, 20));

        fullTimeInputsPan.setMaximumSize(new java.awt.Dimension(200, 200));

        hourlyWageLabel.setText("Hourly Wage:");

        hoursPerWeekLabel.setText("Hours Per Week:");

        weeksPerYearLabel.setText("Weeks Per Year:");

        hourlyWageInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        hoursPerWeekInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        weeksPerYearInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout fullTimeInputsPanLayout = new javax.swing.GroupLayout(fullTimeInputsPan);
        fullTimeInputsPan.setLayout(fullTimeInputsPanLayout);
        fullTimeInputsPanLayout.setHorizontalGroup(
            fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullTimeInputsPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fullTimeInputsPanLayout.createSequentialGroup()
                        .addComponent(weeksPerYearLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weeksPerYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fullTimeInputsPanLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(hourlyWageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hourlyWageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fullTimeInputsPanLayout.createSequentialGroup()
                        .addComponent(hoursPerWeekLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hoursPerWeekInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fullTimeInputsPanLayout.setVerticalGroup(
            fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fullTimeInputsPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hourlyWageLabel)
                    .addComponent(hourlyWageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoursPerWeekInput, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoursPerWeekLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksPerYearLabel)
                    .addComponent(weeksPerYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        addPan.add(fullTimeInputsPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 170, 100));

        annualSalaryLabel.setText("Annual Salary:");

        annualSalaryInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout partTimeInputsPanLayout = new javax.swing.GroupLayout(partTimeInputsPan);
        partTimeInputsPan.setLayout(partTimeInputsPanLayout);
        partTimeInputsPanLayout.setHorizontalGroup(
            partTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partTimeInputsPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(partTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annualSalaryLabel)
                    .addComponent(annualSalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        partTimeInputsPanLayout.setVerticalGroup(
            partTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partTimeInputsPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(annualSalaryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annualSalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        addPan.add(partTimeInputsPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 130, 70));

        getContentPane().add(addPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickedAddFromMainPan(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clickedAddFromMainPan
    {//GEN-HEADEREND:event_clickedAddFromMainPan
        // TODO add your handling code here:
        mainPan.setVisible(false);
        addPan.setVisible(true);
        fullTimeInputsPan.setVisible(false);
        partTimeInputsPan.setVisible(false);
    }//GEN-LAST:event_clickedAddFromMainPan

    private void clickedHomeButFromAddPan(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clickedHomeButFromAddPan
    {//GEN-HEADEREND:event_clickedHomeButFromAddPan
        // TODO add your handling code here:
        addPan.setVisible(false);
        mainPan.setVisible(true);
    }//GEN-LAST:event_clickedHomeButFromAddPan

    private void fullTimeRadButClicked(java.awt.event.ActionEvent evt)//GEN-FIRST:event_fullTimeRadButClicked
    {//GEN-HEADEREND:event_fullTimeRadButClicked
        // TODO add your handling code here:
    fullTimeInputsPan.setVisible(true);
    partTimeInputsPan.setVisible(false);
    }//GEN-LAST:event_fullTimeRadButClicked

    private void partTimeRadButClicked(java.awt.event.ActionEvent evt)//GEN-FIRST:event_partTimeRadButClicked
    {//GEN-HEADEREND:event_partTimeRadButClicked
        // TODO add your handling code here:
        partTimeInputsPan.setVisible(true);
        fullTimeInputsPan.setVisible(false);
    }//GEN-LAST:event_partTimeRadButClicked

    private void canelButFromAddPanClicked(java.awt.event.ActionEvent evt)//GEN-FIRST:event_canelButFromAddPanClicked
    {//GEN-HEADEREND:event_canelButFromAddPanClicked
        // TODO add your handling code here:
        addPan.setVisible(false);
        mainPan.setVisible(true);
    }//GEN-LAST:event_canelButFromAddPanClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton addBut;
    private javax.swing.JPanel addPan;
    private javax.swing.JLabel addTitle;
    private javax.swing.JFormattedTextField annualSalaryInput;
    private javax.swing.JLabel annualSalaryLabel;
    private javax.swing.JButton cancelButFromAddPan;
    private javax.swing.JFormattedTextField deductionsRateInput;
    private javax.swing.JLabel deductionsRateLabel;
    private javax.swing.JButton displayBut;
    private javax.swing.JTextField empNumInput;
    private javax.swing.JLabel empNumLabel;
    private javax.swing.ButtonGroup empTypeSelectionRadButGroup;
    private javax.swing.JTextField fNameInput;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JRadioButton femaleRadBut;
    private javax.swing.JPanel fullTimeInputsPan;
    private javax.swing.JRadioButton fullTimeRadBut;
    private javax.swing.ButtonGroup genderSelectionRadButGroup;
    private javax.swing.JButton homeButFromAddPan;
    private javax.swing.JFormattedTextField hourlyWageInput;
    private javax.swing.JLabel hourlyWageLabel;
    private javax.swing.JFormattedTextField hoursPerWeekInput;
    private javax.swing.JLabel hoursPerWeekLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lNameInput;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JButton loadBut;
    private javax.swing.JPanel mainPan;
    private javax.swing.JRadioButton maleRadBut;
    private javax.swing.JButton modifyBut;
    private javax.swing.JRadioButton otherRadBut;
    private javax.swing.JPanel partTimeInputsPan;
    private javax.swing.JRadioButton partTimeRadBut;
    private javax.swing.JButton removeBut;
    private javax.swing.JButton saveButFromAddPan;
    private javax.swing.JButton searchBut;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JFormattedTextField weeksPerYearInput;
    private javax.swing.JLabel weeksPerYearLabel;
    private javax.swing.JComboBox<String> workLocationDropdown;
    private javax.swing.JLabel workLocationLabel;
    // End of variables declaration//GEN-END:variables
}
