public class AdminUser extends User {
    private String permissionLevel;

    public AdminUser(String username, int age, String permissionLevel) {
        super(username, age);
        this.permissionLevel = permissionLevel;
    }

    @Override
    public String toString() {
        return "Admin: " + getUsername() + ", vârstă: " + getAge() + " | Permisiuni: " + permissionLevel;
    }
}