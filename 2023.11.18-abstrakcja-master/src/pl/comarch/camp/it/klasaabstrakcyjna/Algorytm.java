package pl.comarch.camp.it.klasaabstrakcyjna;

public abstract class Algorytm {

    public void wylicz() {
        wczytajDane();
        krok1();
        krok2();
        krok3();
        zapiszWyniki();
    }

    public abstract void wczytajDane();

    private void krok1() {
        System.out.println("1 krok liczenia !!");
    }

    private void krok2() {
        System.out.println("2 krok liczenia !!");
    }

    private void krok3() {
        System.out.println("3 krok liczenia !!");
    }

    public abstract void zapiszWyniki();
}
