package telran.company.dto;

import java.io.Serializable;

public record DepartmentAverageSalary(String department, int salary) implements Serializable {
}
