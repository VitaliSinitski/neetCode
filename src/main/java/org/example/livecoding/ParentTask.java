package org.example.livecoding;

/**
 * Что выведется в этом классе?
 *
 * В данной программе создается экземпляр класса Child,
 * но он присваивается переменной object типа Parent.
 * В Java вызов методов происходит на основе типа переменной компилятором,
 * а не на основе типа объекта, на который она ссылается.
 * Поля также используются на основе типа переменной,
 * если они не являются переопределенными в подклассе.
 *
 * Следовательно, вывод в консоль будет следующим:
 *
 * child method work
 * Cannot resolve method 'printAge' in 'Parent'
 * 50
 *
 * Пояснение:
 * object.method() вызывает метод method() класса Child,
 * так как переменная object ссылается на объект типа Child.
 * Поэтому выводится "child method work".
 *
 * object.printAge() определен только в классе Child,
 * и его нельзя вызвать на переменной object,
 * которая имеет тип Parent.
 *
 * System.out.println(object.age) выводит значение поля age из класса Parent,
 * так как поле age не было переопределено в классе Child. Это значение равно 50.
 */


public class ParentTask {
    public static void main(String[] args) {
        Parent object = new Child();
        object.method();    // child method work
//        object.printAge();  // Cannot resolve method 'printAge' in 'Parent'
        System.out.println(object.age); // 50
    }
}

class Parent {
    public int age = 50;

    public void method() {
        System.out.println("parent method work");
    }
}

class Child extends Parent {
    public int age = 20;

    @Override
    public void method() {
        System.out.println("child method work");
    }

    public void printAge() {
        System.out.println(age);
    }
}

