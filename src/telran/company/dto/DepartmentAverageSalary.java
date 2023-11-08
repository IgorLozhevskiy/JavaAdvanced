package telran.company.dto;
import java.io.Serializable;

public record DepartmentAverageSalary(String department, int salary) implements Serializable,Comparable<DepartmentAverageSalary> {
    @Override
    public int compareTo(DepartmentAverageSalary o) {
        return department.compareTo(o.department);
    }
}
