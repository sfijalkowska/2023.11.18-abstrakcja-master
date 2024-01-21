package pl.comarch.camp.it.abstrakcja;

public interface IUserRepository {

    String[] getAllUsers();
    String getUserById(int id);
    void addUser(String user);
    void updateUser(String user);

    default void jakasMetoda() {
        System.out.println("cos robie !");
    }
}
