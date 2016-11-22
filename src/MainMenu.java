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
        RemovePan = new javax.swing.JPanel();
        removeTitle = new javax.swing.JLabel();
        homeButFromAddPan1 = new javax.swing.JButton();
        employeeNumberLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        noteLabel = new javax.swing.JLabel();
        note2Label = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        exitBut2 = new javax.swing.JButton();
        notFindPanel = new javax.swing.JPanel();
        notFindLabel = new javax.swing.JLabel();
        resultPanel = new javax.swing.JPanel();

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
                removeButActionPerformed(evt);
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
        addPan.add(empNumLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 20));
        addPan.add(empNumInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 140, -1));

        fNameLabel.setText("First Name:");
        addPan.add(fNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 90, 20));
        addPan.add(fNameInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 140, -1));

        lNameLabel.setText("Last Name:");
        addPan.add(lNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 90, 20));
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
        addPan.add(saveButFromAddPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 70, -1));

        cancelButFromAddPan.setText("Cancel");
        cancelButFromAddPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canelButFromAddPanClicked(evt);
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
                    .addComponent(hoursPerWeekLabel)
                    .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fullTimeInputsPanLayout.createSequentialGroup()
                            .addComponent(hourlyWageLabel)
                            .addGap(38, 38, 38)
                            .addComponent(hourlyWageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fullTimeInputsPanLayout.createSequentialGroup()
                            .addComponent(weeksPerYearLabel)
                            .addGap(18, 18, 18)
                            .addGroup(fullTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(weeksPerYearInput, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                                .addComponent(hoursPerWeekInput)))))
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
                .addContainerGap()
                .addComponent(annualSalaryLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(annualSalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        partTimeInputsPanLayout.setVerticalGroup(
            partTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(partTimeInputsPanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(partTimeInputsPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(annualSalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(annualSalaryLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addPan.add(partTimeInputsPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 240, 50));

        exitBut1.setText("Exit");
        exitBut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBut1ActionPerformed(evt);
            }
        });
        addPan.add(exitBut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, -1));

        getContentPane().add(addPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

        removeTitle.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        removeTitle.setText("Remove");

        homeButFromAddPan1.setText("Home");
        homeButFromAddPan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButFromAddPan1clickedHomeButFromAddPan(evt);
            }
        });

        employeeNumberLabel.setText("Employee Number:");

        jTextField1.setText("jTextField1");

        noteLabel.setText("* You must enter the exact employee number.");

        note2Label.setText(" Otherwise it will not find the employee.");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        exitBut2.setText("Exit");
        exitBut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBut2ActionPerformed(evt);
            }
        });

        notFindLabel.setText("* The employee is not in the database.");

        javax.swing.GroupLayout notFindPanelLayout = new javax.swing.GroupLayout(notFindPanel);
        notFindPanel.setLayout(notFindPanelLayout);
        notFindPanelLayout.setHorizontalGroup(
            notFindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notFindPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notFindLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                .addContainerGap())
        );
        notFindPanelLayout.setVerticalGroup(
            notFindPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(notFindLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RemovePanLayout = new javax.swing.GroupLayout(RemovePan);
        RemovePan.setLayout(RemovePanLayout);
        RemovePanLayout.setHorizontalGroup(
            RemovePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemovePanLayout.createSequentialGroup()
                .addGroup(RemovePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RemovePanLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(RemovePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noteLabel)
                            .addGroup(RemovePanLayout.createSequentialGroup()
                                .addComponent(employeeNumberLabel)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(note2Label)))
                    .addGroup(RemovePanLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RemovePanLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(RemovePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(notFindPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(RemovePanLayout.createSequentialGroup()
                        .addComponent(homeButFromAddPan1)
                        .addGap(142, 142, 142)
                        .addComponent(removeTitle))
                    .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(exitBut2)
                .addGap(44, 44, 44))
        );
        RemovePanLayout.setVerticalGroup(
            RemovePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RemovePanLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(RemovePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeButFromAddPan1)
                    .addComponent(removeTitle)
                    .addComponent(exitBut2))
                .addGap(18, 18, 18)
                .addGroup(RemovePanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeNumberLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(note2Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notFindPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        getContentPane().add(RemovePan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 450));

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

    private void canelButFromAddPanClicked(java.awt.event.ActionEvent evt)//GEN-FIRST:event_canelButFromAddPanClicked
    {//GEN-HEADEREND:event_canelButFromAddPanClicked
        // TODO add your handling code here:
        addPan.setVisible(false);
        mainPan.setVisible(true);
    }//GEN-LAST:event_canelButFromAddPanClicked

    private void homeButFromAddPan1clickedHomeButFromAddPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButFromAddPan1clickedHomeButFromAddPan
        // TODO add your handling code here:
        RemovePan.setVisible(false);
        mainPan.setVisible(true);
    }//GEN-LAST:event_homeButFromAddPan1clickedHomeButFromAddPan

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void removeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButActionPerformed
        // TODO add your handling code here:
        RemovePan.setVisible(true);
        mainPan.setVisible(false);
    }//GEN-LAST:event_removeButActionPerformed

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
    private javax.swing.JPanel RemovePan;
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
    private javax.swing.JLabel employeeNumberLabel;
    private javax.swing.JLabel employeeTypeLabel;
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
    private javax.swing.JButton homeButFromAddPan1;
    private javax.swing.JFormattedTextField hourlyWageInput;
    private javax.swing.JLabel hourlyWageLabel;
    private javax.swing.JFormattedTextField hoursPerWeekInput;
    private javax.swing.JLabel hoursPerWeekLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lNameInput;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JButton loadBut;
    private javax.swing.JPanel mainPan;
    private javax.swing.JRadioButton maleRadBut;
    private javax.swing.JButton modifyBut;
    private javax.swing.JLabel notFindLabel;
    private javax.swing.JPanel notFindPanel;
    private javax.swing.JLabel note2Label;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JRadioButton otherRadBut;
    private javax.swing.JPanel partTimeInputsPan;
    private javax.swing.JRadioButton partTimeRadBut;
    private javax.swing.JButton removeBut;
    private javax.swing.JLabel removeTitle;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JButton saveButFromAddPan;
    private javax.swing.JButton searchBut;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JFormattedTextField weeksPerYearInput;
    private javax.swing.JLabel weeksPerYearLabel;
    private javax.swing.JComboBox<String> workLocationDropdown;
    private javax.swing.JLabel workLocationLabel;
    // End of variables declaration//GEN-END:variables
}
