package lesson32;

import java.util.Objects;

public class Person {
    String name;
    int age;

   public Person(String name, int age) {
       this.name = name;
       this.age = age;
   }


   @Override
   public boolean equals(Object obj) {
       if (this == obj) {
       	return true;
       }else {
       	return false;
       }
   }

   @Override
   public int hashCode() {
       return Objects.hash(name, age);
   }
}