package Controller;
public class Person {

// PRIVATE INSTANCE FIELDS 
private String username;
private String password;
private String Name;
private String LastName;

    public Person(String username, String password, String Name, String LastName) {
        this.username = username;
        this.password = password;
        this.Name = Name;
        this.LastName = LastName;
    }
    public String getUsername() {
        return username;
    }
    @Override
    public String toString() {
        return "Person{" + "username=" + username + ", password=" + password + ", Name=" + Name + ", LastName=" + LastName + '}';
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return Name;
    }
    public String getLastName() {
        return LastName;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setLastName(String LastName) {
        this.LastName = LastName;
    } 
}