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

    public void displayContents()
    {
        for (int a = 0; a < buckets.length; a++)  //first to loop through the buckets
        {
            System.out.println("Bucket " + a);
            for (int b = 0; b < buckets[a].size(); b++)  //then loop through each bucket's arraylist to print 
            {                                            //out all the employee's empNumber
                System.out.print(buckets[a].get(b).getEmpNum() + " ");
                System.out.println((buckets[a].get(b) instanceof FullTimeEmployee));
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
     String sexOut = null;
     if (sexCode==0)
     sexOut="M";
     else if (sexCode ==1)
     sexOut="F";
     else if(sexCode ==2)
     sexOut="O";
     double dedRateForOut=buckets[calcBuckets(theNumber)].get(search(theNumber)).getDeductionsRate();
     String dedRateOut = Double.toString(dedRateForOut);
     String outPut=String.format("%3s %20s %20s %10s %10s",empNumOut,fNameOut,lNameOut,sexOut,dedRateOut);
     return(outPut);
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
