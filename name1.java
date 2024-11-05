public class name1 {
    private String lastName;
    private String firstName;
    private String middleName;

    public name1(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String toString() {
        String result = "";
        if (lastName != null) result += lastName + " ";
        if (firstName != null) result += firstName;
        if (middleName != null)  result += " " + middleName;
        return result;
    }
}