package it.unibo.pslab.oop.p13advanced.enums.polymorphism;

interface Region {
   String getName();
}
 
class Sicilia implements Region {
   public String getName() {
      return "Sicilia";
   }
   // tweak equals to equate all objects of the same class
   public boolean equals(Object obj) {
      return obj instanceof Sicilia;
   }
}
 
class Sardegna implements Region {
   public String getName() {
      return "Sardegna";
   }
   // tweak equals to equate all objects of the same class
   public boolean equals(Object obj) {
      return obj instanceof Sardegna;
   }
}
//... and so on

class Person {
   private String name;
   private String surname;
   private Region region;

   public Person(String name, String surname, Region region) {
      this.name = name;
      this.surname = surname;
      this.region = region;
   }

   public boolean isIslander() { 
      return this.region == new Sicilia() || this.region == new Sardegna();
   }
   // and so on...
}
 
public class UseRegionWithPolymorphism {
   public static void main(String[] args) {
      Person p = new Person("mario", "rossi", new Sicilia());
      // and so on...
   }
}
