package Animals;

public abstract class Animals {
    private int id;
    private int age;
    private int weight;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animals(int id, int age, int weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    abstract void talk();

}
class Fish extends Animals{

    public Fish(int id, int age, int weight, String color) {
        super(id, age, weight, color);
    }

    @Override
    void talk() {
        System.out.print("....");
    }
}
class Dog extends Domestic{

    public Dog(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void talk() {
        super.talk();
        System.out.print("Woof! ");
    }
}
class Cat extends Domestic{

    public Cat(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }

    @Override
    public void talk() {
        super.talk();
        System.out.print("Meow!");
    }
}
class Wolf extends Wild{

    public Wolf(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

}
class Giraffe extends Wild {

    public Giraffe(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }


}
class Lion extends Wild {

    public Lion(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

}
class Wild extends Animals{
    private boolean isPredator;

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public Wild(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    @Override
    public void talk() {
        if (isPredator){
            System.out.print("Hello! I'm a wild animal. And I'm angry.");
        }
        else{
            System.out.print("Hello! I'm a wild animal. ");
        }
    }
}
class Crocodile extends Wild{

    public Crocodile(int id, int age, int weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

}

abstract class Domestic extends Animals {
  private String name;
  private boolean isVaccinated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public Domestic(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color);
        this.isVaccinated = isVaccinated;
        this.name = name;
    }

    @Override
    public void talk() {
        System.out.print("Hello! My name is "+getName()+". ");
    }
}
class Hamster extends Domestic{

    public Hamster(int id, int age, int weight, String color, String name, boolean isVaccinated) {
        super(id, age, weight, color, name, isVaccinated);
    }


}

class GuideDog extends Dog{
    boolean isTrained;

    public GuideDog(int id, int age, int weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    @Override
    public void talk() {
        super.talk();
        if (isTrained){
            System.out.print("I can take you home.");
        }
    }
}