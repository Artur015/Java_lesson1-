package clients;

import java.time.LocalDate;

public class Lion extends Animal {

    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
        
    }
    public void LionlifeCycle(){
        fly();
    }
    private void fly(){
        System.out.println(getType() + " cant fly");
    }
}    

