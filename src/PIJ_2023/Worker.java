package PIJ_2023;

public class Worker {
    private String name, role;
    public Worker(String name, String role) {
        this.name = name; this.role = role;
    }
    public String getName() {
        return this.name;
    }
    public String getRole() {
        return this.role;
    }
    @Override
    public String toString() {
        return this.name + ", " + this.role;
    }
}
