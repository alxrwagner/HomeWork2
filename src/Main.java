public class Main {
   public static void main(String[] args) {
      int startPointSegment1 = 4;
      int endPointSegment1 = 10;
      int startPointSegment2 = 5;
      int endPointSegment2 = 8;

      if (startPointSegment1 > startPointSegment2 && endPointSegment1 > endPointSegment2) {
         System.out.println("Начальная точка пересечения: " + startPointSegment1 + ", конечная точка пересечения: " + endPointSegment2);
      } else if (startPointSegment1 < startPointSegment2 && endPointSegment1 < startPointSegment2 && endPointSegment1 < endPointSegment2) {
         System.out.println("Не пересекаются");
      } else if (startPointSegment2 < startPointSegment1 && endPointSegment2 > endPointSegment1) {
         System.out.println("Начальная точка пересечения: " + startPointSegment1 + ", конечная точка пересечения: " + endPointSegment1);
      } else if (startPointSegment2 > startPointSegment1 && endPointSegment2 < endPointSegment1) {
         System.out.println("Начальная точка пересечения: " + startPointSegment2 + ", конечная точка пересечения: " + endPointSegment2);
      } else if (startPointSegment1 < startPointSegment2 && endPointSegment1 == startPointSegment2 && endPointSegment1 < endPointSegment2) {
         System.out.println("Точка пересечения: " + startPointSegment2);
      }
   }
}