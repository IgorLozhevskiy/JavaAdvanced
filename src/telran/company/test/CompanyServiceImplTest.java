package telran.company.test;

import telran.company.dto.Employee;
import telran.company.service.CompanyServiceImpl;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CompanyServiceImplTest extends CompanyServiceImpl {
    private static final long ID1 = 0;
    private static final long ID2 = 0;
    private static final int SALARY1 = 0;
    private static final int SALARY2 = 0;
    private static final String DEPARTMENT1 = null;
    private static final LocalDate DATE1 = null;
    private static final LocalDate DATE2 = null;

    Employee empl1 = new Employee(ID1, "name1", SALARY1, DEPARTMENT1,DATE1);
    Employee empl2 = new Employee(ID2, "name2", SALARY2, DEPARTMENT1,DATE2);


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testHireEmployee() {
    }

    @org.junit.jupiter.api.Test
    void testFireEmployee() {
    }

    @org.junit.jupiter.api.Test
    void testGetEmployee() {
    }

    @org.junit.jupiter.api.Test
    void testGetEmployeesByDepartment() {
    }

    @org.junit.jupiter.api.Test
    void testGetAllEmployees() {
    }

    @org.junit.jupiter.api.Test
    void testGetEmploeesBySalary() {
    }

    @org.junit.jupiter.api.Test
    void testGetEmploeeByAge() {
    }

    @org.junit.jupiter.api.Test
    void testSalaryDistributionByDepartments() {
    }

    @org.junit.jupiter.api.Test
    void testGetSalaryDistribution() {
    }

    @org.junit.jupiter.api.Test
    void testUpdateDepartment() {
    }

    @org.junit.jupiter.api.Test
    void testUpdateSalary() {
    }

    @org.junit.jupiter.api.Test
    void testSave() {
    }

    @org.junit.jupiter.api.Test
    void testRestore() {
    }
}