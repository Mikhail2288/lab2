import java.util.ArrayList;
import java.util.List;

class Employee {//класс сотдруника
    String name;
    Department department;

    public Employee(String name, Department department) {//конструктор для сотрудников
        this.name = name;
        this.department = department;
        department.employees.add(this); //добавляем сотрудника в отдел
    }

    public String toString() {
        if (this == department.head) {
            return name + " начальник отдела " + department.name;
        } else {
            return name + " работает в отделе " + department.name + ", начальник которого " + department.head.name;
        }
    }
    public List<Employee> getDepartmentEmployees() {
        return department.employees; // Возвращает список сотрудников отдела
    }
}

class Department {//класс отдела
    String name;//название отдела
    Employee head;//начальник отдела
    List<Employee> employees = new ArrayList<>();//Список сотрудников отдела

    public Department(String name) {//конструктор для отделов
        this.name = name;
    }
}
