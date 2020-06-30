package be.vdab;

public abstract class Animals {
    private String name;
    private double weight;
    private String sex;
    private int age;

    private String diet;




    enum Diet {CARNIVORE, OMNIVORE, HERBIVORE}

    public Animals(String name, double weight, String sex) {
        this.name = name;
        this.weight = weight;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }


    public void showAnimals(String name, double weight, String sex){

    }
public String toString(){
return String.format("From the class %s %s is a %s and weighs %.2fkg",this.getClass().getSimpleName(), this.getName(), this.getSex(),this.getWeight());
}

}
