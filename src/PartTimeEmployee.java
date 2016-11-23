/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donshua
 */
public class PartTimeEmployee extends EmployeeInfo // PartTImeEmployee is a
//subclass of EmployeeInfo
{
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    public PartTimeEmployee(int ID, String fName, String lName, int gender, int location, double dedRate, double wage,
            double hrsPerWeek, double weeks)
    {
        super(ID, fName, lName, gender, location,dedRate);
        hourlyWage = wage;
        hoursPerWeek = hrsPerWeek;
        weeksPerYear = weeks;
    }

    public double calcAnnualIncome()
    {
        return ((hourlyWage * hoursPerWeek * weeksPerYear) * (1 - deductionsRate));
    }
}
