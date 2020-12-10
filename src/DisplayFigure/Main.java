package DisplayFigure;

public class Main {

    public static void main(String[] args) {
        int choice = 1;
        java.util.Scanner input = new java.util.Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (5. top-left ,7. top-right, 6. bottom-left,8. bottom-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 2:
                    int choiceTriangle;
                    System.out.println("Enter your choice Triangle: ");
                    choiceTriangle = input.nextInt();
                    switch (choiceTriangle) {
                        case 5:
                            System.out.println("Draw the rectangle top-left ");
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 6:
                            System.out.println("Draw the rectangle bottom-left ");
                            for (int i = 0; i < 5; i++) {
                                for (int j = 5; j > i; j--) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 7:
                            System.out.println("Draw the rectangle top-right ");
                            for (int i = 1; i <= 5; i++) {
                                for (int k = 1; k <= 5 - i; k++) {
                                    System.out.print(" ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 8:
                            System.out.println("Draw the rectangle bottom-right ");
                            for (int i = 5; i > 0; i--) {
                                for (int k = 1; k <= 5 - i; k++) {
                                    System.out.print(" ");
                                }
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle ");
                    for (int i = 1; i <= 5; i++) {
                        for (int k = 5 - i + 1; k >= 1; k--) {
                            System.out.print(" ");
                        }
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        for (int j = i - 1; j >= 1; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
