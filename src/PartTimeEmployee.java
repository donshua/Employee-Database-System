/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donshua
 */
public class PartTimeEmployee extends EmployeeInfo // PartTimeEmployee is a
//subclass of EmployeeInfo
{
    //attributes for this subclasss
    private double hourlyWage;
    private double hoursPerWeek;
    private double weeksPerYear;

    //comstructors
    public PartTimeEmployee(int ID, String fName, String lName, int gender, int location, double dedRate, double wage,
            double hrsPerWeek, double weeks)
    {
        super(ID, fName, lName, gender, location,dedRate);
        hourlyWage = wage;
        hoursPerWeek = hrsPerWeek;
        weeksPerYear = weeks;
    }

    //getter method to get the hourly wage
    public double getHourlyWage()
    {
        return hourlyWage;
    }

    //getter method to get the number of hours working per week
    public double getHoursPerWeek()
    {
        return hoursPerWeek;
    }

    //getter method to get the number of weeks working per year
    public double getWeeksPerYear()
    {
        return weeksPerYear;
    }

    //to calculate annual income
    public double calcAnnualIncome()
    {
        return ((hourlyWage * hoursPerWeek * weeksPerYear) * (1 - deductionsRate));
    }
}
