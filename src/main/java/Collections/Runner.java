package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {


        Map<String, Employee> map = new HashMap<>();
        map.put("Ahmet", new Employee("Ahmet", "IT", 40000));
        map.put("Ayşe", new Employee("Ayşe", "HR", 35000));
        map.put("Mehmet", new Employee("Mehmet", "Sales", 38000));
        map.put("Zeynep", new Employee("Zeynep", "IT", 42000));
        map.put("Ali", new Employee("Ali", "Finance", 39000));

        Set<Map.Entry<String, Employee>> set = map.entrySet();

        for (Map.Entry<String, Employee> w : set) {
            if (w.getValue().salary > 39000) {
                System.out.println(w.getKey());
            }
        }


        for (Map.Entry<String, Employee> w : set) {
            if (w.getValue().department.equalsIgnoreCase("IT")) {
                System.out.println(w.getKey() + " - " + w.getValue().salary);
            }
        }


        Map<Integer, ArrayList<String>> listMap = new HashMap<>();


        for (Map.Entry<String, Employee> w : set) {
            int salary = w.getValue().salary;
            String name = w.getKey();
            if (!listMap.containsKey(salary)) {
                listMap.put(salary, new ArrayList<>());


            }
            listMap.get(salary).add(name);
        }
        System.out.println(listMap);


        Map<String, ArrayList<Employee>> depts = new HashMap<>();

        for (Map.Entry<String, Employee> w : set) {

            String dept = w.getValue().department;

            if (!depts.containsKey(dept)) {
                depts.put(dept, new ArrayList<>());

            }
            depts.get(dept).add(w.getValue());
        }
        System.out.println("depts = " + depts);


    }
}