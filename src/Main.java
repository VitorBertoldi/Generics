import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Honda honda = new Honda("Honda", 224,2022,139000);
        Ferrari ferrari = new Ferrari("Ferrari", 550, 2023, 2100000);
        Porsche porsche = new Porsche("Porsche", 400, 1996,3000000);
        addToList(honda);
        addToList(ferrari);
        addToList(porsche);

    }

    public static <T> void addToList(T carro) {
        ArrayList<T> cars = new ArrayList<T>();
        cars.add(carro);
        System.out.println(cars);
    }

}