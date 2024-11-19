public class Employee {//класс сотрудника
    private String name;
    private Department department;

    public Employee(String name, Department department) {//конструктор
        this.name = name;
        this.department = department;
        department.addEmployee(this);//занесение в список отдела
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() 
        return department;
    }

    @Override
    public String toString() {//вывод
        if (this == department.getHead()) {
            return name + " начальник отдела " + department.getName();
        } else {
            return name + " работает в отделе " + department.getName() + ", начальник которого " + department.getHead().getName();
        }
    }
}
