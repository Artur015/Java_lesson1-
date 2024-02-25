package clients;

import java.time.LocalDate;

public class Cat extends Animal{

    public Cat(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    
    }
    public void CatlifeCycle(){
        fly();
        swim();
    }
    private void fly(){
        System.out.println(getType() + " cant fly");
    }
    private void swim(){
        System.out.println(getType() + " cant swim");
    }
}
