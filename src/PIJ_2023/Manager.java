package PIJ_2023;

import java.util.ArrayList;

public class Manager extends Worker {
    private String name, role;
    ArrayList<Worker> subordinate;
    public Manager(String name) {
        super(name, "Manager");
        subordinate = new ArrayList<>();
    }

    public void addSubordinate(Worker w) {
        subordinate.add(w);
    }

    public boolean hasSubordinate(Worker w) {
        if (subordinate.contains(w)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder listofSubordinates = new StringBuilder();
        for (Worker w: subordinate) {
            listofSubordinates.append(w.getName());
            listofSubordinates.append(", ");
        }
        listofSubordinates.delete(listofSubordinates.length()-2,listofSubordinates.length());
        return getName() + ", " + getRole() + " with subordinates: " + listofSubordinates;

    }
}
