import clients.Animal;
import clients.Flyable;
import clients.Owner;
import clients.impl.Dog;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Тошка", 25, LocalDate.now(), new Owner());
        List <Animal> flyables = new ArrayList<>();
        for (Animal animal : flyables) {
            if (animal instanceof Flyable) {
                ((Flyable)animal).fly();
            }
        }
    }
}
    