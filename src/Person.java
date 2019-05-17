public class Person {

    private String name;

    //returns person's name
    public String getName() {
        return name;
    }

    //changes name property to passed value
    public void setName(String name) {
        this.name = name;
    }

    // prints a message with person's name
    public void sayHello() {
        System.out.printf("\nHello from %s\n", this.name);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Nic");
        System.out.printf("\n" + p.getName());
        p.sayHello();

    }
}

// Control and Enter will give a short-cut to make a constructor.