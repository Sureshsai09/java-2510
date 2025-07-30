public class Test {
    public static void main(String[] args) {
        //O TO 4 -Toddler
        //5to12-child
        //13 to19-teenager
        //20 to 26 -young Adult
        //27 to 64 -Adult
        int age = 25;
        if (age >= 20 && age <= 26) {
            System.out.println("Young Adult");
            } else if (age >= 27 && age <= 64) {
                System.out.println("Adult");
            } else if (age >= 13 && age <= 19) {
                System.out.println("Teenager");
            } else if (age >= 5 && age <= 12) {
                System.out.println("Child");
            } else if (age >= 0 && age <= 4) {
                System.out.println("Toddler");
            } else {
                System.out.println("Invalid age");
                
            }


            //switch  case
            String category;
            switch (age){
                case 0:
                    System.out.println("toddler");
                    break;
                    case 1:
                    System.out.println("toddler");
                    break;
                    case 2:
                    System.out.println("toddler");
                    break;
                    case 3:
                    break;
                    case 4:
                    System.out.println("toddler");
                    break;
                    case 5:
                    System.out.println("child");
                    break;
                    case 6:
                    System.out.println("child");
                    break;
                    case 7:
                    System.out.println("child");
                    break;
                    case 8:
                    System.out.println("child");
                    break;
                    case 9:
                    System.out.println("child");
                    break;
                    case 10:
                    System.out.println("child");
                    break;
                    case 11:
                    System.out.println("child");
                    break;
                    case 12:
                    System.out.println("child");
                    break;
                    case 13:
                    System.out.println("child");
                    break;
                    case 14:
                    System.out.println("child");
                    break;
                    case 15:
                    System.out.println("child");
                    break;
                    case 16:
                    System.out.println("child");
                    break;
                    case 17:
                    System.out.println("child");
                    break;
                    case 18:
                    System.out.println("child");
                    break;
                    case 19:
                    System.out.println("child");
                    break;
                    case 20:
                    System.out.println("young adult");
                    break;
                    case 21:
                    System.out.println("young adult");
                    break;
                    case 22:
                    System.out.println("young adult");
                    break;
                    case 23:
                    System.out.println("young adult");
                    break;
                    case 24:
                    System.out.println("young adult");
                    break;
                    case 25:
                    System.out.println("young adult");
                    break;
                    case 26:
                    System.out.println("young adult");
                    break;
                    default:
                    System.out.println("Adult");
                    break;
                    }
            //switch case-using arrow operator
            String category_age=switch(age){
                case 0,1,2,3,4 -> "Toddler";
                case 5,6,7,8,9,10,11,12 -> "child";
                case 13,14,15,16,17,18,19  -> "young Adult";
                default -> "Adult";
            };
            System.out.println(category_age);
            }
            }



            }



