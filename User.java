public class User {
    private String FirstName;
    private String LastName;

    public User(String FirstName, String LastName) {
        this.FirstName = FirstName;
        this.LastName = LastName;
    }

    public void PrintNames() {
        System.out.print(LastName + ", " + FirstName + "; ");
    }
}
