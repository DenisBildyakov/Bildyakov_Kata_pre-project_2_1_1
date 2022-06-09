public class Cat {
    private String name;
    private String owner;
    private String breed;
    private int healthInsuranceId;

    public Cat () {}

    public Cat(String name, String owner, String breed, int healthInsuranceId) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.healthInsuranceId = healthInsuranceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHealthInsuranceId() {
        return healthInsuranceId;
    }

    public void setHealthInsuranceId(int healthInsuranceId) {
        this.healthInsuranceId = healthInsuranceId;
    }
}
