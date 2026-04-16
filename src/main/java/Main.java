public class Main {
    public static void main(String[] args) {
        UserRepository repo = new UserRepository();

        // Blocuri separate pentru a nu opri execuția la prima eroare
        try {
            repo.addUser(new User("testuser", 25));
        } catch (InvalidUserDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            repo.addUser(new AdminUser("admin", 30, "full_access"));
        } catch (InvalidUserDataException e) {
            System.err.println(e.getMessage());
        }

        try {
            repo.addUser(new User("ab", 22));
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare prinsă: " + e.getMessage());
        }

        try {
            repo.addUser(new User("baduser", -5));
        } catch (InvalidUserDataException e) {
            System.out.println("Eroare prinsă: " + e.getMessage());
        }

        System.out.println("\n--- Utilizatori Valizi Adăugați ---");
        repo.getUsers().forEach(System.out::println);
    }
}