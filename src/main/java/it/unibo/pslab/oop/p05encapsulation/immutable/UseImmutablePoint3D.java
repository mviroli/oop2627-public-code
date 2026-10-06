package it.unibo.pslab.oop.p05encapsulation.immutable;

public class UseImmutablePoint3D {

   public static void main(String[] args) {
      final ImmutablePoint3D p = new ImmutablePoint3D(10, 20, 30);
      // the object referenced from p won't be modified

      ImmutablePoint3D q = p.translate(1, 1, 1);
      // q refers to a new object

      System.out.println(p.getX() + " " + p.getY() + " " + p.getZ());
      // 10,20,30
      System.out.println(q.getX() + " " + q.getY() + " " + q.getZ());
      // 11,21,31

      q = q.translate(1, 1, 1);
      // q refers to another object again: the old one removed by the GC

      System.out.println(q.getX() + " " + q.getY() + " " + q.getZ());
      // 12,22,32
   }
}
