package lmsprojects2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Account {

    private String  password;
    private String email;
    public static Map<String,String> regMap = new LinkedHashMap<>();

    public Account(String email, String password ) {
        this.email = email;
        this.password = password;
    }

    public Account() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Pojo{" +
                "password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
