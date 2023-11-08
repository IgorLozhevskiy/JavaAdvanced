package telran.company.service;

import telran.company.dto.DepartmentAverageSalary;
import telran.company.dto.Employee;
import telran.company.dto.SalaryIntervalDistribution;

import java.awt.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class CompanyServiceImpl implements CompanyService{
    HashMap<Long, Employee> employeeMap = new HashMap<>();
    HashMap<String, Set<Employee>> employeesDepartment = new HashMap<>();
    /*
    key - department, value - Set of employees working on the department
    */
    TreeMap<Integer, Set<Employee>> employeesSalary = new TreeMap<>();
    /*
    key - salary, value - set of employees having the salary value
    */
    TreeMap<LocalDate, Set<Employee>> employeesAge = new TreeMap<>();
    /*
    key - date of birth, value - set of employees born at the date
     */


    /*
    adds new Employee into a company
    In the case an employee with the given ID already exists,
    the exception IllegalStateException must be thrown
    returns reference to the being added Employee object
     */
    @Override
    public Employee hireEmployee(Employee empl) {
        return null;
    }
    /*
    removes employee object from company according to a given ID
    in the case an employee with the given ID doesn't exists
    the method  must throw IllegalStateException
    */
    @Override
    public Employee fireEmployee(long id) {
        return null;
    }
    /*
    returns reference to Employee object with a given ID value
    in the case employee with the ID doesn't exist
    the method returns null
     */
    @Override
    public Employee getEmployee(long id) {
        return null;
    }
    /*
    returns list of employee objects working in a given department
    in the case none employees in the department,
    the method returns empty list
    */
    @Override
    public List<Employee> getEmployeesByDepartment(String department) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }

    @Override
    public List<Employee> getEmploeesBySalary(int salaryFrom, int salaryTo) {
        return null;
    }

    @Override
    public List<Employee> getEmploeeByAge(int ageFrom, int ageTo) {
        return null;
    }

    @Override
    public List<DepartmentAverageSalary> salaryDistributionByDepartments() {
        return null;
    }

    @Override
    public List<SalaryIntervalDistribution> getSalaryDistribution(int interval) {
        return null;
    }

    @Override
    public Employee updateDepartment(long id, String newDepartment) {
        return null;
    }

    @Override
    public Employee updateSalary(long id, int newSalary) {
        return null;
    }

    @Override
    public void save(String filePath) {

    }

    @Override
    public void restore(String file) {

    }
}
