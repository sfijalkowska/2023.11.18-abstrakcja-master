package pl.comarch.camp.it.abstrakcja;

public interface JakisInterfejs {
    default void metoda1() {
        System.out.println("metoda1");
    }

    default void metoda2() {
        System.out.println("metoda2");
    }
}
