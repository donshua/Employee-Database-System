/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donshua
 */
import java.util.ArrayList;

public class OpenHashTable
{

    private ArrayList<EmployeeInfo>[] buckets;
    // buckets is an array of ArrayList.
    //Each item in an ArrayList is an EmployeeInfo object.

    //CONSTRUCTOR for OpenHashtable class
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
    //calcBucket method that returns the bucket number the value that's passed
    public int calcBuckets(int empNumber)
    {
        return (empNumber % buckets.length);
    }
    
    //method to add an employee into the hash table
    public void add(EmployeeInfo itemToAdd)
    {
        int targetBucket = calcBuckets(itemToAdd.getEmpNum()); //use calcBucket to determine which bucket the employee belong to
        if (search(itemToAdd.getEmpNum()) ==-1)  //if there is not this employee, add to according bucket
             buckets[targetBucket].add(itemToAdd);  //in the ArrayList haning off it
        else
        return;                           //if the employee already exits, just return
    }

    public ArrayList<EmployeeInfo>[] getBuckets()
    {
        return buckets;
    }

    //method that display all of the employee in the hash table
    //print the employee numbers in each bucket's ArrayList, starting with bucket 0, then 1 and so on.
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

    //method that returns full information of one employee, used for write to file
public String displayOneEmp (int theNumber)
    {     //get all the attrubites of an employee
     int empNumForOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getEmpNum();
     String empNumOut = Integer.toString(empNumForOut);
     String fNameOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getFirstName();
     String lNameOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getLastName();
     int sexCode = buckets[calcBuckets(theNumber)].get(search(theNumber)).getSex();
     String sexOut =Integer.toString(sexCode);
     int workLocCode =  buckets[calcBuckets(theNumber)].get(search(theNumber)).getWorkLocation();
     String workLocOut = Integer.toString(workLocCode);
     double dedRateForOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getDeductionsRate();
     String dedRateOut = Double.toString(dedRateForOut);    //put the info in a string that can be returned
     if (buckets[calcBuckets(theNumber)].get(search(theNumber)) instanceof FullTimeEmployee)
     {
     FullTimeEmployee fullTimeEmpOut = (FullTimeEmployee) buckets[calcBuckets(theNumber)].get(search(theNumber));
     String annualSalOut= Double.toString(fullTimeEmpOut.getAnnualSalary());
     String fullTimeOutPut = ("F"+";"+empNumOut+";"+fNameOut+";"+lNameOut+";"+sexOut+";"+workLocOut+";"+dedRateOut+";"+annualSalOut);
     return(fullTimeOutPut);
     }
     else if (buckets[calcBuckets(theNumber)].get(search(theNumber)) instanceof PartTimeEmployee)
     {
     PartTimeEmployee partTimeEmpOut = (PartTimeEmployee) buckets[calcBuckets(theNumber)].get(search(theNumber));
     String hourlyWageOut = Double.toString(partTimeEmpOut.getHourlyWage());
     String hrsPerWeekOut = Double.toString(partTimeEmpOut.getHoursPerWeek());
     String weeksPerYrOut = Double.toString(partTimeEmpOut.getWeeksPerYear());
     String partTimeOutPut=("P"+";"+empNumOut+";"+fNameOut+";"+lNameOut+";"+sexOut+
             ";"+workLocOut+";"+dedRateOut+";"+hourlyWageOut+";"+hrsPerWeekOut+";"+weeksPerYrOut);
     return(partTimeOutPut); 
     }
     return(null);
    }
    
    //method that search the employee by employee number
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

    //method that removes an employee from the hash table by employee number
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
            return (employeeToRemove);  //by using the remove method from ArrayList, return the item that wanted to delete
        }
    }
    
    //clear the whole Hash Table so it's fresh and ready to be used again
    public void clearHashTable()
    {
        buckets=null;
    }

}               //end of OpenHashTable class