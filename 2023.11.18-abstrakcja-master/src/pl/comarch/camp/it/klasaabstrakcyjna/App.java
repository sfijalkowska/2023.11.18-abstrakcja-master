package pl.comarch.camp.it.klasaabstrakcyjna;

public class App {
    public static void main(String[] args) {
        Algorytm algorytm = new AlgorytmBazowy();
        algorytm.wylicz();

        Algorytm algorytm2 = new AlgorytmZPlikuDoExcela();
        algorytm2.wylicz();
    }
}
