package pattern.design.factory.abstractmethod.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee {

    private String id;
    private String name;
    private float salary;
    private boolean married;
}
