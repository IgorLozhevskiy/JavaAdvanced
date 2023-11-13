package telran.company.service;

import telran.company.dto.DepartmentAverageSalary;
import telran.company.dto.Employee;
import telran.company.dto.SalaryIntervalDistribution;

import java.awt.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class CompanyServiceImpl implements CompanyService {
    HashMap<Long, Employee> employeesMap = new HashMap<>();
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
        long id = empl.id();
        if (employeesMap.containsKey(id)) {
            throw new IllegalStateException("Employee already exists " + id);
        }
        employeesMap.put(id, empl);
        addEmployeeSalary(empl);
        addEmployeeAge(empl);
        addEmployeeDepartment(empl);
        return empl;
    }

    private void addEmployeeDepartment(Employee empl) {
        String department = empl.department();
//        Set<Employee> set = employeesDepartment.computeIfAbsent(department, k -> new HashSet<>());
//        set.add(empl);
//        объяснение как работает computeIfAbsent
        Set<Employee> set = employeesDepartment.get(department);
        if (set == null) {
            set = new HashSet<>();
            employeesDepartment.put(department, set);
        }
    }

    private void addEmployeeAge(Employee empl) {
        LocalDate birthDate = empl.birthDate();
        Set<Employee> set = employeesAge.computeIfAbsent(birthDate, k -> new HashSet<>());
        set.add(empl);
    }

    private void addEmployeeSalary(Employee empl) {
        int salary = empl.salary();
        Set<Employee> set = employeesSalary.computeIfAbsent(salary, k -> new HashSet<>());
        set.add(empl);
    }


    /*
    removes employee object from company according to a given ID
    in the case an employee with the given ID doesn't exists
    the method  must throw IllegalStateException
    */
    @Override
    public Employee fireEmployee(long id) {
        Employee empl = employeesMap.remove(id);
        if (empl == null) {
            throw new IllegalStateException("Employee not found " + id);
        }
        removeEmployeesDepartment(empl);
        removeEmployeesSalary(empl);
        removeEmployeesAge(empl);
        return null;
    }

    private void removeEmployeesAge(Employee empl) {
        LocalDate birthDate = empl.birthDate();
        Set<Employee> set = employeesAge.get(birthDate);
//      removing reference to being removed employee from the set of employees with the given birthdate
        set.remove(empl);
        if (set.isEmpty()) {
            employeesAge.remove(birthDate);
        }
    }

    private void removeEmployeesSalary(Employee empl) {
        int salary = empl.salary();
        Set<Employee> set = employeesSalary.get(salary);
        set.remove(empl);
        if (set.isEmpty()) {
            employeesSalary.remove(salary);
        }
    }

    private void removeEmployeesDepartment(Employee empl) {
        String department = empl.department();
        Set<Employee> set = employeesDepartment.get(department);
        set.remove(empl);
        if (set.isEmpty()) {
            employeesDepartment.remove(department);
        }
    }

    /*
    returns reference to Employee object with a given ID value
    in the case employee with the ID doesn't exist
    the method returns null
     */
    @Override
    public Employee getEmployee(long id) {
        return employeesMap.get(id);
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
