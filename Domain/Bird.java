package Domain;

public class Bird implements IEnt{
    int age;
    String species;
    int weight;
    public Bird(int a,String s,int w)
    {
        this.age = a;
        this.species = s;
        this.weight = w;
    }
    public String toString()
    {
     return this.species+" has age:"+this.age+" and weight:"+this.weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
