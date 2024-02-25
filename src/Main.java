import clients.Animal;
import clients.Bird;
import clients.Cat;
import clients.Dog;
import clients.Fish;
import clients.Lion;
import clients.Owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion liova = new Lion("Лёва", 200, LocalDate.of
                (2007, 2, 3), new Owner());
        Lion liova2 = new Lion("Кусака", 175, LocalDate.of
                (2007, 2, 3), new Owner());
        System.out.println(liova);
        System.out.println(liova2);
        System.out.println(liova.getType());
        liova2.eat();



        Dog pes = new Dog("Тошка", 25, LocalDate.now
        (), new Owner());
        System.out.println(pes); 

        Cat koshka = new Cat("Барсик", 11, LocalDate.of(2015, 4, 25), new Owner());
        Cat koshka1 = new Cat("Пушок ", 11, LocalDate.of(2015, 4, 25), new Owner());
        System.out.println(koshka);
        System.out.println(koshka1);

        Bird ptica = new Bird("Кеша", 1 ,LocalDate.of(2019,6, 14), new Owner());
        Bird ptica1 = new Bird("Гоша", 1,LocalDate.of(2011,5, 14), new Owner());
        System.out.println(ptica);  
        System.out.println(ptica1);

        Fish riba = new Fish("Брызгун", 1, LocalDate.of(2021,4,15), new Owner());
        Fish riba1 = new Fish("Зубастик", 1, LocalDate.of(2021,4,15), new Owner());
        System.out.println(riba);
        System.out.println(riba1);

        List<Animal> animals = new ArrayList<>();
        animals.add(liova);
        animals.add(liova2);
        animals.add(pes);
        animals.add(koshka);
        animals.add(koshka1);
        animals.add(ptica);
        animals.add(ptica1);
        animals.add(riba);
        animals.add(riba1);
        // System.out.println(animals);
    }
}