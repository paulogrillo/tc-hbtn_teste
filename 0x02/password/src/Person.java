public class Person {
    public boolean checkUser(String user) {
        return user.length() >= 8 && !user.contains("!@#$%&*");
    }
    public boolean checkPassword(String password) {
        return password.length() >= 8 && password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$^&*., ?]).+$");
    }
}