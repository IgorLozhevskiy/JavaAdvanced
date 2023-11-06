package telran.company.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public record Employee(long id, String name, int salary, String department, LocalDate birthDate)
        implements Serializable {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
