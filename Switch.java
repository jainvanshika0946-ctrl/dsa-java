import java.util.Scanner;

public class Switch{
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int empid=in.nextInt();
        String department=in.next();

        switch(empid){
            case 1:
                System.out.println("Vanshika");
                break;
            case 2:
                System.out.println("Rahul");
                break;
            case 3:
                System.out.println("Ved's Department");
                switch(department){
                    case "IT":
                        System.out.println("IT");
                        break;
                    case "CSE":
                        System.out.println("Computer Science");
                        break;
                    default:
                        System.out.println("No department");

                }
                break;
            default:
                System.out.println("Enter correct empID");
        }

    }
}

//public class Switch {
//    public static void main(String[] args){
//        Scanner in=new Scanner(System.in);
//        String fruit= in.next();
//
//        switch(fruit){
//
//            case "mango":
//                System.out.println("king of fruits");
//                break;
//            case "apple":
//                System.out.println("keeps doctor away");
//                break;
//            case "orange":
//                System.out.println("Name as color");
//                break;
//            case "Grapes":
//                System.out.println("Green color");
//                break;
//            default:
//                System.out.println("Enter a valid fruit");
//
//        }
//    }
//
//}

//case "mango" -> System.out.println("king of fruits");
//            case "apple" -> System.out.println("keeps doctor away");
//            case "orange" -> System.out.println("Name as color");
//            case "Grapes" -> System.out.println("Green color");
//default -> System.out.println("Enter a valid fruit");
