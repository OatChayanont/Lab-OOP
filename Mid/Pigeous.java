/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sasimai
 */
public class Pigeous extends Bird{
    public Pigeous(){
        this("", 0);
    }
    public Pigeous(String name, int age){
        super(name, age);
    }
    public void wingAttack(Animal a){
        a.setPower(a.getPower()-5);
    }
    public void wingAttack(Animal a, int times){
        for (int i = 0; i < times; i++){
            a.setPower(a.getPower()-5);
        }
    }
    public void eat(Food f){
        super.setPower(super.getPower()+(f.getPower()*2));
    }
    public void fly(){
        System.out.println(getName()+" fly fly ....");
    }
}
