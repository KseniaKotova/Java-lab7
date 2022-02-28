package bsu.rfe.java.group10.lab6.Kotova.B13;
import java.util.ArrayList;

public class User {
    private String name;
    private String addres;

    public User (String name, String addres) {
        this.name = name;
        this.addres = addres;
    }
    public String getName() {
        return name;
    }
    // public ArrayList<User> getUsers() { return UserInfo; }
    public String getAddres(){
        return addres;
    }
}
