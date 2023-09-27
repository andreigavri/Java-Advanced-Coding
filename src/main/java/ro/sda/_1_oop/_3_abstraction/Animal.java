package ro.sda._1_oop._3_abstraction;

  /*  Create an abstract class animal that has one instance variable "name" which is a string
            - the class also has a constructor which initialize name
            - a getter for the name
            - 2 abstract methods - void eat() and void breath();

   */
public abstract class Animal {
    private String name;
      public Animal(String name) {
          this.name = name;
      }

      public String getName() {
          return name;
      }

      public abstract void eat();
      public abstract void breath();

  }
