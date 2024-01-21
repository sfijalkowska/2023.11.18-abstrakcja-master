package pl.comarch.camp.it.abstrakcja;

public class UserRepository implements IUserRepository {
    @Override
    public String[] getAllUsers() {
        String[] tab = {"janusz", "wiesiek"};
        return tab;
    }

    @Override
    public String getUserById(int id) {
        return "admin";
    }

    @Override
    public void addUser(String user) {
        System.out.println("user dodany !!");
    }

    @Override
    public void updateUser(String user) {
        System.out.println("user zupdateowany !!!");
    }
}
