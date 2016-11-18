/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donshua
 */
public class FullTimeEmployee extends EmployeeInfo
{

    private double annualSalary;

    public FullTimeEmployee(int ID, String fName, String lName, int gender, int location, double salary)
    {
        super(ID, fName, lName, gender, location);
        annualSalary = salary;
    }

    public double calcAnnualIncome()
    {
        return (annualSalary * (1 - deductionsRate));
    }
}
