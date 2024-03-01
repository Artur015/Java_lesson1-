package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Owner;

public class Bird extends Animal implements Flyable, Goable{

    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }


    @Override
    public double fly() {
        return 30;
    }

    @Override
    public double toGo() {
        return 3;
    }
    
}
