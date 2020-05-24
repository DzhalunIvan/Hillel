package Animals;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(9,7,60,"White","Tuzik",true);
        Fish fish = new Fish(1,1,1,"Gold");
        Cat cat = new Cat(2,2,5,"Black","Barsik",true);
        Wolf wolf = new Wolf(3,5,35,"Grey",true);
        Lion lion =  new Lion(4,4,60,"Yellow",true);
        Giraffe giraffe = new Giraffe(5,10,100, "Brown", false);
        Crocodile croco = new Crocodile(6,6,50,"Green",true);
        Hamster ham = new Hamster(7,1,1,"Brown", "Khoma", true);
        GuideDog guideDog = new GuideDog(8,4,40,"Black", "Polkan",true,true);

        Animals[]animals = {dog,fish,cat,wolf,lion,giraffe,croco,ham,guideDog};
        for (Animals animal:animals) {
            animal.talk();
            System.out.println();
        }
    }
}
