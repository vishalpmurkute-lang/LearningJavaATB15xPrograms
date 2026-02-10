package Test_Practice_10th_feb2026;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

     class Main{
        public static void main(String[] args){
            Person person1 = new Person("Alice", 22);
            Person person2 = new Person("Vishal", 23);

            System.out.println(person1);
            System.out.println(person2);


        }
    }



