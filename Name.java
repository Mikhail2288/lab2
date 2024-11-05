public class Name {
    private String lastName, firstName, middleName;//свойства

    public Name(String firstName, String lastName, String middleName) {//конструктор для  имени фамилии и отчества
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    public Name(String firstName) {//конструктор для имени
        this.firstName = firstName;
    }
    public Name(String firstName, String lastName) {//конструктор для имени и фамилии
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {//метод toString
        String result = "";
        if (firstName != null) result += firstName ;
        if (middleName != null) result += " " + middleName;
        if (lastName != null) result += " " + lastName;
        return result;
    }
}