//Задача 1:
//Создайте класс "Кот" (Cat) со следующими свойствами:
//Приватное поле "имя" (name) типа String для хранения имени кота.
//Приватное поле "возраст" (age) типа int для хранения возраста кота.
//Публичные методы доступа (геттеры и сеттеры) для полей "имя" и "возраст".
//Публичный метод "приветствие" (greet), который выводит на консоль приветствие вида "Мяу! Меня зовут <имя>. Мне <возраст> года(лет).".
//Дополнительное задание:
//Создайте класс "Владелец" (Owner) со свойством "имя" (name) типа String. Добавьте соответствующее поле в классе "Кот"
// и методы доступа для него. Измените метод "приветствие" класса "Кот", чтобы он выводил приветствие вида
// "Мяу! Меня зовут <имя>. Мне <возраст> года(лет). Мой владелец - <имя владельца>.".


public class OOP_DZ1_T1 {
    public static void main(String[] args) {
        Cat person = new Cat("Мяу!", "Барс", 4);
        Owner people = new Owner("Александр");
        System.out.println(person.getGreet() + "Меня зовут " + person.getName() + ". Мне " + person.getAge()
                + " года (лет)." + " Мой владелец " + people.getName());
    }
}

class Cat {
    private String name;
    private int age;
    private String greet;

    public Cat(String greet, String name, int age) {
        this.name = name;
        this.greet = greet;
        this.age = age;
    }
    public String getGreet() {
        return greet;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

class Owner {
    private String name_owner;

    public Owner(String name_owner) {
        this.name_owner = name_owner;
    }
    public String getName() {
        return name_owner;
    }
}