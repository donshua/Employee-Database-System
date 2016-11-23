/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ljn
 */
public class MainMenu extends javax.swing.JFrame
{
OpenHashTable theTable = new OpenHashTable(2);
    /**
     * Creates new form NewJFrame
     */
    public MainMenu()
    {
        initComponents();
        addPan.setVisible(false);
        removePan.setVisible(false);
        mainPan.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        exitBut = new javax.swing.JButton();
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
        employeeTypeLabel = new javax.swing.JLabel();
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
        exitBut1 = new javax.swing.JButton();
        errorEmpNum = new javax.swing.JLabel();
        removePan = new javax.swing.JPanel();
        removeTitle = new javax.swing.JLabel();
        homeButFromRemovePan = new javax.swing.JButton();
        employeeNumberLabel = new javax.swing.JLabel();
        empNumRemoveSearchInput = new javax.swing.JTextField();
        removeNoteLabel = new javax.swing.JLabel();
        note2Label = new javax.swing.JLabel();
        searchButToRemove = new javax.swing.JButton();
        exitBut2 = new javax.swing.JButton();
        notFoundPanel = new javax.swing.JPanel();
        removeResultPanel = new javax.swing.JPanel();
        notFoundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));
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
        addBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedAddFromMainPan(evt);
            }
        });
        mainPan.add(addBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 120, 60));

        removeBut.setText("Remove");
        removeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedRemoveFromMainPan(evt);
            }
        });
        mainPan.add(removeBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 120, 60));

        searchBut.setText("Search");
        searchBut.setMaximumSize(new java.awt.Dimension(50, 20));
        searchBut.setMinimumSize(new java.awt.Dimension(50, 20));
        searchBut.setPreferredSize(new java.awt.Dimension(50, 20));
        mainPan.add(searchBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 120, 60));

        displayBut.setText("Display");
        mainPan.add(displayBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 120, 60));

        modifyBut.setText("Modify");
        mainPan.add(modifyBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 120, 60));

        loadBut.setText("Load");
        mainPan.add(loadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 120, 60));

        exitBut.setText("Exit");
        exitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButActionPerformed(evt);
            }
        });
        mainPan.add(exitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, -1, -1));

        getContentPane().add(mainPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        addPan.setMaximumSize(new java.awt.Dimension(600, 450));
        addPan.setMinimumSize(new java.awt.Dimension(600, 450));
        addPan.setPreferredSize(new java.awt.Dimension(600, 450));
        addPan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homeButFromAddPan.setText("Home");
        homeButFromAddPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedHomeButFromAddPan(evt);
            }
        });
        addPan.add(homeButFromAddPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        addTitle.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        addTitle.setText("Add");
        addPan.add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        empNumLabel.setText("Employee Number:");
        addPan.add(empNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 20));
        addPan.add(empNumInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 140, -1));

        fNameLabel.setText("First Name:");
        addPan.add(fNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 90, 20));
        addPan.add(fNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, -1));

        lNameLabel.setText("Last Name:");
        addPan.add(lNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 90, 20));
        addPan.add(lNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 140, -1));

        sexLabel.setText("Sex:");
        addPan.add(sexLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 40, 20));

        genderSelectionRadButGroup.add(maleRadBut);
        maleRadBut.setText("Male");
        addPan.add(maleRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        genderSelectionRadButGroup.add(femaleRadBut);
        femaleRadBut.setText("Female");
        addPan.add(femaleRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        genderSelectionRadButGroup.add(otherRadBut);
        otherRadBut.setText("Other");
        addPan.add(otherRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        workLocationLabel.setText("Work Location:");
        addPan.add(workLocationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 120, 20));

        workLocationDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mississauga", "Ottawa", "Chicago" }));
        addPan.add(workLocationDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        empTypeSelectionRadButGroup.add(fullTimeRadBut);
        fullTimeRadBut.setText("Full Time");
        fullTimeRadBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeRadButClicked(evt);
            }
        });
        addPan.add(fullTimeRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        empTypeSelectionRadButGroup.add(partTimeRadBut);
        partTimeRadBut.setText("Part Time");
        partTimeRadBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeRadButClicked(evt);
            }
        });
        addPan.add(partTimeRadBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, -1, -1));

        deductionsRateLabel.setText("Deductions Rate:");
        addPan.add(deductionsRateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 160, 20));

        deductionsRateInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        addPan.add(deductionsRateInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 70, -1));

        saveButFromAddPan.setText("Save");
        saveButFromAddPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedSaveButFromAddPan(evt);
            }
        });
        addPan.add(saveButFromAddPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 70, -1));

        cancelButFromAddPan.setText("Cancel");
        cancelButFromAddPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClickedcanelButFromAddPan(evt);
            }
        });
        addPan.add(cancelButFromAddPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        employeeTypeLabel.setText("Employee Type:");
        addPan.add(employeeTypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 130, 20));

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
                    .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(hourlyWageInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fullTimeInputsPanLayout.createSequentialGroup()
                            .addComponent(weeksPerYearLabel)
                            .addGap(24, 24, 24)
                            .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(weeksPerYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hoursPerWeekInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(hourlyWageLabel)
                        .addComponent(hoursPerWeekLabel)))
                .addContainerGap(50, Short.MAX_VALUE))
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
                    .addComponent(hoursPerWeekInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hoursPerWeekLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(weeksPerYearLabel)
                    .addComponent(weeksPerYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addPan.add(fullTimeInputsPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 230, 120));

        annualSalaryLabel.setText("Annual Salary:");

        annualSalaryInput.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout partTimeInputsPanLayout = new javax.swing.GroupLayout(partTimeInputsPan);
        partTimeInputsPan.setLayout(partTimeInputsPanLayout);
        partTimeInputsPanLayout.setHorizontalGroup(
            partTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partTimeInputsPanLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(annualSalaryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(annualSalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        partTimeInputsPanLayout.setVerticalGroup(
            partTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partTimeInputsPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(partTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annualSalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annualSalaryLabel))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        addPan.add(partTimeInputsPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 240, 50));

        exitBut1.setText("Exit");
        exitBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBut1ActionPerformed(evt);
            }
        });
        addPan.add(exitBut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        errorEmpNum.setForeground(new java.awt.Color(255, 0, 51));
        errorEmpNum.setText("The field you entered is not valid");
        addPan.add(errorEmpNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 180, 20));

        getContentPane().add(addPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        removePan.setMaximumSize(new java.awt.Dimension(600, 450));
        removePan.setMinimumSize(new java.awt.Dimension(600, 450));
        removePan.setPreferredSize(new java.awt.Dimension(600, 450));
        removePan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        removeTitle.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        removeTitle.setText("Remove");
        removePan.add(removeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 32, -1, -1));

        homeButFromRemovePan.setText("Home");
        homeButFromRemovePan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButFromRemovePanclicked(evt);
            }
        });
        removePan.add(homeButFromRemovePan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        employeeNumberLabel.setText("Employee Number:");
        removePan.add(employeeNumberLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 84, -1, -1));
        removePan.add(empNumRemoveSearchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 81, 80, -1));

        removeNoteLabel.setText("* You must enter the exact employee number.");
        removePan.add(removeNoteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 112, -1, -1));

        note2Label.setText(" Otherwise it will not find the employee.");
        removePan.add(note2Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 132, -1, -1));

        searchButToRemove.setText("Search");
        searchButToRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButToRemoveActionPerformed(evt);
            }
        });
        removePan.add(searchButToRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        exitBut2.setText("Exit");
        exitBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBut2ActionPerformed(evt);
            }
        });
        removePan.add(exitBut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 40, -1, -1));

        javax.swing.GroupLayout notFoundPanelLayout = new javax.swing.GroupLayout(notFoundPanel);
        notFoundPanel.setLayout(notFoundPanelLayout);
        notFoundPanelLayout.setHorizontalGroup(
            notFoundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        notFoundPanelLayout.setVerticalGroup(
            notFoundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        removePan.add(notFoundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 181, -1, -1));

        javax.swing.GroupLayout removeResultPanelLayout = new javax.swing.GroupLayout(removeResultPanel);
        removeResultPanel.setLayout(removeResultPanelLayout);
        removeResultPanelLayout.setHorizontalGroup(
            removeResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 329, Short.MAX_VALUE)
        );
        removeResultPanelLayout.setVerticalGroup(
            removeResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        removePan.add(removeResultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 329, -1));

        notFoundLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notFoundLabel.setText("* The employee is not in the database.");
        removePan.add(notFoundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 309, 20));

        getContentPane().add(removePan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

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
        fullTimeInputsPan.setVisible(false);
        partTimeInputsPan.setVisible(true);
    }//GEN-LAST:event_fullTimeRadButClicked

    private void partTimeRadButClicked(java.awt.event.ActionEvent evt)//GEN-FIRST:event_partTimeRadButClicked
    {//GEN-HEADEREND:event_partTimeRadButClicked
        // TODO add your handling code here:
        partTimeInputsPan.setVisible(false);
        fullTimeInputsPan.setVisible(true);
    }//GEN-LAST:event_partTimeRadButClicked

    private void ClickedcanelButFromAddPan(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ClickedcanelButFromAddPan
    {//GEN-HEADEREND:event_ClickedcanelButFromAddPan
        // TODO add your handling code here:
        addPan.setVisible(false);
        mainPan.setVisible(true);
    }//GEN-LAST:event_ClickedcanelButFromAddPan

    private void homeButFromRemovePanclicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButFromRemovePanclicked
        // TODO add your handling code here:
        removePan.setVisible(false);
        mainPan.setVisible(true);
    }//GEN-LAST:event_homeButFromRemovePanclicked

    private void searchButToRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButToRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButToRemoveActionPerformed

    private void exitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButActionPerformed

    private void exitBut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBut1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBut1ActionPerformed

    private void exitBut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBut2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBut2ActionPerformed

    private void clickedRemoveFromMainPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickedRemoveFromMainPan
        // TODO add your handling code here:
        removePan.setVisible(true);
        mainPan.setVisible(false);
    }//GEN-LAST:event_clickedRemoveFromMainPan

    private void clickedSaveButFromAddPan(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clickedSaveButFromAddPan
    {//GEN-HEADEREND:event_clickedSaveButFromAddPan
        // TODO add your handling code here:
        int tempEmpNum = Integer.parseInt(empNumInput.getText());
        String tempFName = fNameInput.getText();
        String tempLName = lNameInput.getText();
        int tempSex = 0;
        if (maleRadBut.isSelected() == true)
        {
            tempSex = 0;
        } else if (femaleRadBut.isSelected() == true)
        {
            tempSex = 1;
        } else if (otherRadBut.isSelected() == true)
        {
            tempSex = 2;
        }
        int tempWorkLocation = 0;
        if (workLocationDropdown.getSelectedIndex() == 1)
        {
            tempWorkLocation = 0;
        } else if (workLocationDropdown.getSelectedIndex() == 2)
        {
            tempWorkLocation = 1;
        } else if (workLocationDropdown.getSelectedIndex() == 3)
        {
            tempWorkLocation = 2;
        }
        double tempDeductionsRate = Double.parseDouble(deductionsRateInput.getText());

        double tempAnnualSalary =0;
        double tempHourlyWage =0;
        int tempHoursPerWeek =0;
        int tempWeeksPerYear =0;
        
        if (fullTimeRadBut.isSelected() == true)
        {
             tempAnnualSalary = Double.parseDouble(annualSalaryInput.getText());
        }
        else if (partTimeRadBut.isSelected() == true)
        {
            tempHourlyWage = Double.parseDouble(hourlyWageInput.getText());
            tempHoursPerWeek  = Integer.parseInt(hoursPerWeekInput.getText());
            tempWeeksPerYear  = Integer.parseInt(weeksPerYearInput.getText());
        }
        FullTimeEmployee tempFullEmp = new FullTimeEmployee(tempEmpNum, tempFName, tempLName, tempSex, tempWorkLocation,tempDeductionsRate,tempAnnualSalary);
        PartTimeEmployee tempPartEmp = new PartTimeEmployee(tempEmpNum, tempFName, tempLName, tempSex, tempWorkLocation,tempDeductionsRate,tempHourlyWage,tempHoursPerWeek,tempWeeksPerYear);
        
        theTable.add(tempFullEmp);
        theTable.displayContents();
        
        
        
    }//GEN-LAST:event_clickedSaveButFromAddPan

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
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
    private javax.swing.JTextField empNumRemoveSearchInput;
    private javax.swing.ButtonGroup empTypeSelectionRadButGroup;
    private javax.swing.JLabel employeeNumberLabel;
    private javax.swing.JLabel employeeTypeLabel;
    private javax.swing.JLabel errorEmpNum;
    private javax.swing.JButton exitBut;
    private javax.swing.JButton exitBut1;
    private javax.swing.JButton exitBut2;
    private javax.swing.JTextField fNameInput;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JRadioButton femaleRadBut;
    private javax.swing.JPanel fullTimeInputsPan;
    private javax.swing.JRadioButton fullTimeRadBut;
    private javax.swing.ButtonGroup genderSelectionRadButGroup;
    private javax.swing.JButton homeButFromAddPan;
    private javax.swing.JButton homeButFromRemovePan;
    private javax.swing.JFormattedTextField hourlyWageInput;
    private javax.swing.JLabel hourlyWageLabel;
    private javax.swing.JFormattedTextField hoursPerWeekInput;
    private javax.swing.JLabel hoursPerWeekLabel;
    private javax.swing.JTextField lNameInput;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JButton loadBut;
    private javax.swing.JPanel mainPan;
    private javax.swing.JRadioButton maleRadBut;
    private javax.swing.JButton modifyBut;
    private javax.swing.JLabel notFoundLabel;
    private javax.swing.JPanel notFoundPanel;
    private javax.swing.JLabel note2Label;
    private javax.swing.JRadioButton otherRadBut;
    private javax.swing.JPanel partTimeInputsPan;
    private javax.swing.JRadioButton partTimeRadBut;
    private javax.swing.JButton removeBut;
    private javax.swing.JLabel removeNoteLabel;
    private javax.swing.JPanel removePan;
    private javax.swing.JPanel removeResultPanel;
    private javax.swing.JLabel removeTitle;
    private javax.swing.JButton saveButFromAddPan;
    private javax.swing.JButton searchBut;
    private javax.swing.JButton searchButToRemove;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JFormattedTextField weeksPerYearInput;
    private javax.swing.JLabel weeksPerYearLabel;
    private javax.swing.JComboBox<String> workLocationDropdown;
    private javax.swing.JLabel workLocationLabel;
    // End of variables declaration//GEN-END:variables
}
