import java.util.Random;

public class EmployeeWageComputation {
   static final int IS_PART_TIME = 1;
   static final int IS_FULL_TIME = 2;
   static final int EMP_RATE_PER_HOUR = 20;
   static final int NUM_OF_WORKING_DAYS = 20;
   static final int MAX_HOURS_IN_MONTH = 100;

   public EmployeeWageComputation() {
   }

   public static void main(String[] var0) {
      System.out.println("Welcome to Employee Wage Computation Program");
      Random var1 = new Random();
      int var2 = var1.nextInt(2);
      if (var2 == 1) {
         System.out.println("UC1: Employee is Present");
      } else {
         System.out.println("UC1: Employee is Absent");
      }

      boolean var3 = false;
      var2 = var1.nextInt(2);
      byte var11;
      if (var2 == 1) {
         var11 = 8;
      } else {
         var11 = 0;
      }

      int var4 = var11 * 20;
      System.out.println("UC2: Daily Employee Wage = " + var4);
      var2 = var1.nextInt(3);
      if (var2 == 2) {
         var11 = 8;
      } else if (var2 == 1) {
         var11 = 8;
      } else {
         var11 = 0;
      }

      int var5 = var11 * 20;
      System.out.println("UC3: Employee Wage (Full/Part Time) = " + var5);
      var2 = var1.nextInt(3);
      switch (var2) {
         case 1:
            var11 = 8;
            break;
         case 2:
            var11 = 8;
            break;
         default:
            var11 = 0;
      }

      int var6 = var11 * 20;
      System.out.println("UC4: Employee Wage using Switch Case = " + var6);
      int var7 = 0;

      int var8;
      for(var8 = 1; var8 <= 20; ++var8) {
         var2 = var1.nextInt(3);
         switch (var2) {
            case 1:
               var11 = 8;
               break;
            case 2:
               var11 = 8;
               break;
            default:
               var11 = 0;
         }

         var7 += var11 * 20;
      }

      System.out.println("UC5: Monthly Employee Wage = " + var7);
      var8 = 0;

      for(int var9 = 0; var8 <= 100 && var9 < 20; var8 += var11) {
         ++var9;
         var2 = var1.nextInt(3);
         switch (var2) {
            case 1:
               var11 = 8;
               break;
            case 2:
               var11 = 8;
               break;
            default:
               var11 = 0;
         }
      }

      int var10 = var8 * 20;
      System.out.println("UC6: Total Employee Wage = " + var10);
   }
}
