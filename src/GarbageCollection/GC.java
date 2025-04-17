package GarbageCollection;

public class GC {
    public static void main(String[] args) {
        Phone phone = new Phone("Apple","16 pro max");
        System.out.println(phone);
    }
}
class Phone{
    String model;
    String brand;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone {" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
