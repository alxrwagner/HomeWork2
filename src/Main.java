public class Main {
   public static void main(String[] args) {
      int startPointSegment1 = 0;
      int endPointSegment1 = 5;
      int startPointSegment2 = 0;
      int endPointSegment2 = 10;

      if (startPointSegment1 > startPointSegment2 && endPointSegment1 > endPointSegment2 && startPointSegment1 < endPointSegment2) {
         System.out.println("Начальная точка пересечения: " + startPointSegment1 + ", конечная точка пересечения: " + endPointSegment2);
      } else if (startPointSegment2 < startPointSegment1 && endPointSegment2 > endPointSegment1 || startPointSegment1 == startPointSegment2 && startPointSegment1 < endPointSegment1 &&
      endPointSegment1 < endPointSegment2) {
         System.out.println("Начальная точка пересечения: " + startPointSegment1 + ", конечная точка пересечения: " + endPointSegment1);
      } else if (startPointSegment1 < startPointSegment2 && startPointSegment1 < endPointSegment1 && endPointSegment2 < startPointSegment1 && endPointSegment2 < endPointSegment1) {
         System.out.println("Начальная точка пересечения: " + startPointSegment1 + ", конечная точка пересечения: " + startPointSegment2);
      } else if (startPointSegment2 > startPointSegment1 && endPointSegment2 < endPointSegment1 || startPointSegment2 > startPointSegment1 && endPointSegment2 == endPointSegment1
       || endPointSegment2 < endPointSegment1 && startPointSegment1 == startPointSegment2 && endPointSegment1 == endPointSegment2
      || startPointSegment1 == startPointSegment2 && endPointSegment1 == endPointSegment2) {
         System.out.println("Начальная точка пересечения: " + startPointSegment2 + ", конечная точка пересечения: " + endPointSegment2);
      } else if (startPointSegment1 < startPointSegment2 && endPointSegment1 == startPointSegment2 && endPointSegment1 < endPointSegment2) {
         System.out.println("Точка пересечения: " + startPointSegment2);
      }else if (startPointSegment2 < startPointSegment1 && endPointSegment2 == startPointSegment1 && endPointSegment2 < endPointSegment1) {
         System.out.println("Точка пересечения: " + startPointSegment2);
      } else if (startPointSegment2 < startPointSegment1 && startPointSegment2 == startPointSegment1 && endPointSegment2 > endPointSegment1) {
         System.out.println("Начальная точка пересечения: " + startPointSegment1 + ", конечная точка пересечения: " + endPointSegment1);
      } else if (startPointSegment1 > startPointSegment2 && endPointSegment1 == endPointSegment2) {
         System.out.println("Начальная точка пересечения: " + startPointSegment1 + ", конечная точка пересечения: " + endPointSegment2);
      } else if (startPointSegment1 < startPointSegment2 && startPointSegment1 < endPointSegment1 && startPointSegment2 < endPointSegment1 && endPointSegment1 < endPointSegment2) {
         System.out.println("Начальная точка пересечения: " + startPointSegment2 + ", конечная точка пересечения: " + endPointSegment1);
      } else {
         System.out.println("Не пересекаются ");
      }
   }
}