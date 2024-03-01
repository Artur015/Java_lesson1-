package clients.impl;

import java.time.LocalDate;

import clients.Animal;
import clients.Goable;
import clients.Owner;

public class Cat extends Animal implements Goable{

    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    
    }
   
    @Override
    public double toGo() {
        return 5;
    }
}
