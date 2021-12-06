/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.pt2;

/**
 *
 * @author PacoElJefe
 */
class Employee {
    private String name;
    private String position;
    private int salary;
    
    
    
    public Employee(String Name, String Position, int Salary)
    {
        name = Name;
        position = Position;
        salary = Salary;
    }

    public String getEmployeeName()
    {
        return name ;
    }
    public String getEmployeePostion()
    {
        return position;
    }
    public int getsalary()
    {
      return salary;
    }
public void showEmployeeData()
    {
        System.out.println("Employee Info: "+ name +" is a "+position+" with a salary of "+ salary);
    }


}


