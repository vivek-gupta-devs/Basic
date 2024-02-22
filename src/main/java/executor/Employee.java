package executor;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Employee {


    private String name;
    private int age;
    private String email;
    private String address;
    private double salary;

    @Override
    public String toString() {
        return "Employee[" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ']';
    }
}
