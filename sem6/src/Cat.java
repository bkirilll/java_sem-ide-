import java.util.List;

public class Cat {

    private String name;
    private String breed;
    private int age;
    private String owner;
    private List<String> healthHistory;

    public Cat(String name, String breed, int age, String owner) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    public List<String> getHealthHistory() {
        return healthHistory;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name:" + name + ", breed:" + breed + ", age:" + age + ", owner:" + owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && breed.equals(cat.breed) && age == cat.age && owner.equals(cat.owner);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7 * age + 11 * breed.hashCode() + 17 * owner.hashCode();
    }
}
