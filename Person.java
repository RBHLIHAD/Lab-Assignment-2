public class Person {
    private String name;
    private int age;
    private String country;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Rifat");
        p.setAge(20);
        p.setCountry("Bangladesh");

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());
    }
}