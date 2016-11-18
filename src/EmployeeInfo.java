/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author donshua
 */

    public class EmployeeInfo    //EmployeeInfo class, that contains the employee info
    {   //attributes
        protected int empNumber;
        protected String firstName;
        protected String lastName;
        protected int sex;             //0-Male, 1-Female, 2-Other
        protected int workLocation;    //0-Mississauga, 1-Ottawa, 2-Chicago
        protected double deductionsRate = 0.02;     //fixed deductions rate, protected since other
        //subclasses have to access it    
        //CONSTRUCTOR for EmployeeInfo class, to assign passed values to the attributes

        public EmployeeInfo(int ID, String fName, String lName, int gender, int location)
        {                             //set the variables
            empNumber = ID;
            firstName = fName;
            lastName = lName;
            sex = gender;
            workLocation = location;
        }

        //getter method for getting employee number
        public int getEmpNum()
        {
            return (empNumber);
        }

        //setter method for empNumber attribute
        public void setEmpNum(int empNo)
        {
            if (empNo < 0)
            {
                return;
            } else
            {
                empNumber = empNo;
            }
        }
    }				//end of EmployeeInfo class
