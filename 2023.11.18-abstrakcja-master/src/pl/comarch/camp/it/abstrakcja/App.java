package pl.comarch.camp.it.abstrakcja;

public class App {

    public static void main(String[] args) {
        IUserRepository userRepository = null; //TODO wstawic wlasciwy obiekt jak Sylwia go napisze
        userRepository.addUser("admin");
        String[] users = userRepository.getAllUsers();

        String user = userRepository.getUserById(1);
        System.out.println(user);

        userRepository.updateUser("janusz");

        //JakisInterfejs jakisInterfejs = new JakisInterfejs();

        System.out.println(Constants.PATH);

        KlasaAbstrakcyjna klasaAbstrakcyjna = new ImplementacjaKlasyAbstrakcyjnej();
    }
}
