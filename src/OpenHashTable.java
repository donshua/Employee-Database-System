/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donshua
 */
import static java.awt.image.ImageObserver.HEIGHT;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class OpenHashTable
{

    private ArrayList<EmployeeInfo>[] buckets;
    // buckets is an array of ArrayList.
    //Each item in an ArrayList is an EmployeeInfo object.

    //constructor
    public OpenHashTable(int howManyBuckets)
    {
        //instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[howManyBuckets];

        //for each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++)
        {
            buckets[i] = new ArrayList();
        }
    }

    public int calcBuckets(int empNumber)
    {
        return (empNumber % buckets.length);
    }

    public void add(EmployeeInfo itemToAdd)
    {
        int targetBucket = calcBuckets(itemToAdd.getEmpNum());
        buckets[targetBucket].add(itemToAdd);
    }

    public ArrayList<EmployeeInfo>[] getBuckets()
    {
        return buckets;
    }

    public void displayContents()
    {
        for (int a = 0; a < buckets.length; a++)  //first to loop through the buckets
        {
            System.out.println("Bucket " + a);
            for (int b = 0; b < buckets[a].size(); b++)  //then loop through each bucket's arraylist to print 
            {                                            //out all the employee's empNumber
                System.out.print(buckets[a].get(b).getEmpNum() + " ");
            }
            System.out.println("");
        }
    }

public String displayOneEmp (int theNumber)
    {
     int empNumForOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getEmpNum();
     String empNumOut = Integer.toString(empNumForOut);
     String fNameOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getFirstName();
     String lNameOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getLastName();
     int sexCode = buckets[calcBuckets(theNumber)].get(search(theNumber)).getSex();
     String sexOut =Integer.toString(sexCode);
     double dedRateForOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getDeductionsRate();
     String dedRateOut = Double.toString(dedRateForOut);
     if (buckets[calcBuckets(theNumber)].get(search(theNumber)) instanceof FullTimeEmployee)
     {
     FullTimeEmployee fullTimeEmpOut = (FullTimeEmployee) buckets[calcBuckets(theNumber)].get(search(theNumber));
     String annualSalOut= Double.toString(fullTimeEmpOut.getAnnualSalary());
     String fullTimeOutPut = ("F"+";"+empNumOut+";"+fNameOut+";"+lNameOut+";"+sexOut+";"+dedRateOut+";"+annualSalOut);
     return(fullTimeOutPut);
     }
     else if (buckets[calcBuckets(theNumber)].get(search(theNumber)) instanceof PartTimeEmployee)
     {
     PartTimeEmployee partTimeEmpOut = (PartTimeEmployee) buckets[calcBuckets(theNumber)].get(search(theNumber));
     String hourlyWageOut = Double.toString(partTimeEmpOut.getHourlyWage());
     String hrsPerWeekOut = Double.toString(partTimeEmpOut.getHoursPerWeek());
     String weeksPerYrOut = Double.toString(partTimeEmpOut.getWeeksPerYear());
     String partTimeOutPut=("P"+";"+empNumOut+";"+fNameOut+";"+lNameOut+";"+sexOut+
             ";"+dedRateOut+";"+hourlyWageOut+";"+hrsPerWeekOut+";"+weeksPerYrOut);
     return(partTimeOutPut); 
     }
     return(null);
    }
    
    public int search(int keyToFind)
    {
        int targetBucket = calcBuckets(keyToFind);
        for (int j = 0; j < buckets[targetBucket].size(); j++)
        {
            EmployeeInfo theEmployee;
            theEmployee = buckets[targetBucket].get(j);
            if (theEmployee.getEmpNum() == keyToFind)
            {
                return (j);  // Found the employee, so return its position in the list
            }
        }
        return (-1); // The search key does not match any employee in the list
    }

    public EmployeeInfo remove(int keyToRemove)
    {
        int positionInList = search(keyToRemove);
        if (positionInList < 0)
        {
            return (null);  // No employee for this key in the list
        } else
        {
            int targetBucket = calcBuckets(keyToRemove);
            EmployeeInfo employeeToRemove = buckets[targetBucket].remove(positionInList);
            return (employeeToRemove);
        }

    }

}
