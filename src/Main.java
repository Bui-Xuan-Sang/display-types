import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int height;
        int width;
        int i;
        int j, k = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter the choice: ");
        int choice = scanner.nextInt();
        System.out.println("Enter Height: ");
        height = scanner.nextInt();
        System.out.println("Enter Width: ");
        width = scanner.nextInt();
      switch (choice){
           case 1:
               System.out.println("Print the rectangle:");
                for (i = 1; i <= height; i++) {
                    for (j = 1; j <= width; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
          case 2:
              System.out.println("Print the square triangle botton-left");
              for (i = 1; i <= height; i++ ){
                  for (j = 1; j <= i; j++){
                      System.out.print("*");
                  }
                  System.out.println("");
              }
              System.out.println("Print the square triangle top-left");
              for (i = height; i >= 1; --i){
                  for (j = 1; j <= i; ++j){
                      System.out.print("*");
                  }
                  System.out.println("");
              }
              break;
          case 3:
              System.out.println("Print isosceles triangle");
              for (i = 1; i <= height; ++i,k = 0){
                  for (j = 1; j <= height - i; ++j){
                      System.out.print(" ");
                     }
                  while ( k != 2*i -1){
                      System.out.print("*");
                      ++k;
                  }
                  System.out.println("");
              }
          case 4:
              System.exit(0);
          default:
              System.out.println("No choice!");

        }
    }

}

