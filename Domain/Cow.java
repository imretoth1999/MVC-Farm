package Domain;

public class Cow implements IEnt {
    int age;
    String name;
    int weight;

    public Cow(int a,String n,int w) {
        this.age = a;
        this.name = n;
        this.weight = w;
    }

    public String toString() {
        return "Cow has age=" + age +" the name:"+ name+" and the weight:"+weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
