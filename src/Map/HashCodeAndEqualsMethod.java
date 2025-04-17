package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person,String> map = new HashMap<>();
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Bob",2);
        Person p3 = new Person("Alice",1);
        map.put(p1,"Engineer");//hashcode1 -->index1
        map.put(p2,"Designer");//hashcode2 -->index2
        map.put(p3,"Manager");//hashcode1 -->index1 --> equals --> replace

        System.out.println("HashMap Size: "+map.size());
        System.out.println("Value for p1: "+map.get(p1));
        System.out.println("Value for p3: "+map.get(p3));

        System.out.println(p1);


        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Shubham",90);//hashcode1 --> index1
        map1.put("Neha",92);//hashcode2 --> index1
        map1.put("Shubham",99);//hashcode1 --> index1 -->equals() -->replace
    }
}
class Person{
    private String name;
    private int id;

    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o; //object ko cast kr rahe hai
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
