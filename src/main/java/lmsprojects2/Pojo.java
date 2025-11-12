package lmsprojects2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pojo {

    private String  password;
    private String email;
    public static Map<String,String> regMap = new LinkedHashMap<>();

    public Pojo(String password, String email, Map<String, String> regMap) {
        this.password = password;
        this.email = email;
        this.regMap = regMap;
    }

    public Pojo() {
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

    public Map<String, String> getRegMap() {
        return regMap;
    }

    public void setRegMap(Map<String, String> regMap) {
        this.regMap = regMap;
    }
}
