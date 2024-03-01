package clients.impl;



import java.time.LocalDate;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

public class Dog extends Animal implements Swimable, Goable{

    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    
    }
    @Override
    public double swim() {
        return 3;
    }
    @Override
    public double toGo() {
        return 10;
    }
        
    
        
}
    

