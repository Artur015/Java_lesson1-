package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Duck extends Animal implements Flyable, Swimable, Goable{

    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
        
    }

    @Override
    public double fly() {
        return 7;
    }

    @Override
    public double swim() {
        return 4;
    }

    @Override
    public double toGo() {
        return 3;
    }
    
}
