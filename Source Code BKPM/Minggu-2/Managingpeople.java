package BKPM2;
public class Managingpeople {
    public static void main(String[] args){
        Persons p1 = new Persons("Arial", 37);
        Persons p2 = new Persons ("Joseph", 15);
        
        if(p1.getAge()==p2.getAge()){
            System.out.println(p1.getName() + " is the same age as " + p2.getName());
        }
        else{
            System.out.println(p1.getName() + " is NOT the same age as " + p2.getName());
        }
    }
}