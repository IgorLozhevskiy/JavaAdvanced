package telran.company.service;
import telran.company.dto.DepartmentAverageSalary;
import telran.company.dto.Employee;
import telran.company.dto.SalaryIntervalDistribution;

import java.util.List;

public interface CompanyService {
    Employee hireEmployee(Employee empl);
    Employee fireEmployee(long id);
    Employee getEmployee(long id);
    List<Employee> getEmployeesByDepartment(String department);
    List<Employee> getAllEmployees();
    List<Employee> getEmploeesBySalary(int salaryFrom,int salaryTo);
    List<Employee> getEmploeeByAge (int ageFrom, int ageTo);
    List<DepartmentAverageSalary> salaryDistributionByDepartments();
    List<SalaryIntervalDistribution> getSalaryDistribution(int interval);
    Employee updateDepartment (long id, String newDepartment);
    Employee updateSalary(long id, int newSalary);
    void save(String filePath);
    void restore(String file);
}
