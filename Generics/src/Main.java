import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Honda honda = new Honda("Honda", 224,2022,139000);
        Ferrari ferrari = new Ferrari("Ferrari", 550, 2023, 2100000);
        Porsche porsche = new Porsche("Porsche", 400, 1996,3000000);

        ArrayList<Carro> carros = new ArrayList<>();
        carros.add(honda);
        carros.add(ferrari);
        carros.add(porsche);
    }

}