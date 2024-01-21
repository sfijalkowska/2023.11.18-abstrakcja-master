package pl.comarch.camp.it.klasaabstrakcyjna;

public class AlgorytmBazowy extends Algorytm {
    @Override
    public void wczytajDane() {
        System.out.println("Wczytuje z bazy !!");
    }

    @Override
    public void zapiszWyniki() {
        System.out.println("Zapisuje do bazy !!");
    }
}
