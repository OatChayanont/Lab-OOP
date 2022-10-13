/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sasimai
 */
public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner(){
        this("", null);
    }
    public Owner(String name){
        this(name, null);
    }
    public Owner(Animal animal){
        this("", animal);
    }
    public Owner(String name, Animal animal){
        this.name = name;
        this.animal = animal;
    }
    public String getName(){
        return this.name;
    }
    public void setAnimal(Animal animal){
        this.animal = animal;
    }
    public Animal getAnimal(){
        return animal;
    }
    public void feedFood(Food f){
        animal.eat(f);
    }
    public String toString(){
        return "Owner : name = "+getName()+", Animal : name = "+animal.getName()+", power = "+animal.getPower()+", age = "+animal.getAge();
    }
    public void protectOwnerFrom(Animal a){
        if (animal instanceof Dog){
            ((Dog)animal).kick(a);
        }
        else if (animal instanceof Bird){
            ((Bird)animal).wingAttack(a);
        }
    }
}
