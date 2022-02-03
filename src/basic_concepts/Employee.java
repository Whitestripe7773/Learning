package basic_concepts;

public class Employee {

    int empID;
    String empName;
    double empSalary;
    int empGrade;
    String empCompany;
    // We could also hardcode a default attribute like
    // String empCompany = "IBM";

    // If we don't set a constructor, there is always the default constructor
    // public Employee(){}

    public Employee(int empID, String empName){
        this.empID = empID;
        this.empName = empName;
    }

}
