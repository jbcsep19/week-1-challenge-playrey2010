import java.util.Scanner;

public class ChooseYourAdventure {

    public static void main(String[] args) {
        String choice = "";
        Scanner sc = new Scanner(System.in);
        String welcome = "Welcome to Ifland, where your choice matters to me!\n\n";


        System.out.println(welcome + "You find yourself in an unknown house. Do you go to the \"kitchen\", \"upstairs\"," +
                "to the \"patio\", into the \"living room\", or into the \"basement\"?");
        choice = sc.next();

        if (choice.equalsIgnoreCase("kitchen")) {
            System.out.println("Predictable. You looked hungry the second I saw you. As you enter the kitchen, you see a \"refrigerator\"" +
                    " and a half open \"cabinet\". Which one do you dare open?");
            choice = sc.next();
            if (choice.equalsIgnoreCase("refrigerator")) {
                System.out.println("I like how you think: Go big or go home. Unfortunately, the fridge is mostly empty, except for a strange" +
                        " \"milk\" and some \"leftovers\". ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("milk")) {
                    System.out.println("You drank rotten milk.\nGAME OVER...");
                } else if (choice.equalsIgnoreCase("leftovers")) {
                    System.out.println("You ate the leftovers. That's a pretty good ending if you ask me. \nCongrats!");
                }
            }
            else if (choice.equalsIgnoreCase("cabinet")) {
                System.out.println("While you look into the cabinet, you hear footsteps approaching. " +
                        "There's a \"can\" of beans and an expensive-looking \"plate\". Take one and leave!: ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("can")) {
                    System.out.println("You take the can of beans and eat it. Your stomach is not happy... \nGAME OVER!");
                } else if (choice.equalsIgnoreCase("plate")) {
                    System.out.println("You take the plate and make a run for it. You sell it online for a million dollars. \nCongrats!");
                }
            }



        }
        else if (choice.equalsIgnoreCase("upstairs")) {
            System.out.println("You decide to go upstairs even though you don't know whose house this is. You nonchalantly proceed, " +
                    "as you find yourself before a \"bedroom\" next to a \"bathroom\". Which one do you enter? ");
            choice = sc.next();
            if (choice.equalsIgnoreCase("bedroom")) {
                System.out.println("I see you have no boundaries. As you enter the bedroom, you see a queen-size \"bed\"" +
                        "where you can lay down for a while, and a closed \"drawer\" on the side of the bed. " +
                        "Take a nap(\"bed\") or sate your curiosity (\"drawer\")? ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("bed")) {
                    System.out.println("You decide to take a nap... The police wakes you up and escort you to jail. What were you doing in a stranger's house to begin with?" +
                            "GAME OVER!");
                } else if (choice.equalsIgnoreCase("drawer")) {
                    System.out.println("You open the drawer and find a ten thousand dollars cash. You take them and hurry outside, and no one notices you." +
                            "Congrats!");
                }
            }
            else if (choice.equalsIgnoreCase("bathroom")) {
                System.out.println("Weird choice but ok. As you enter the bathroom, you see a steamy \"mirror\" you can wipe," +
                        " and a \"toilet\" that seems to have been used recently. Do you wipe the \"mirror\" or do you use the \"toilet\"?");
                choice = sc.next();
                if (choice.equalsIgnoreCase("mirror")) {
                    System.out.println("You wipe the mirror only to see your reflexion. You are looking good!! \nCongrats!");
                } else if (choice.equalsIgnoreCase("toilet")) {
                    System.out.println("You use the toilet and take your sweet time. As time goes by, you finally hear a knock on the door." +
                            " The police wants to know what you are doing in a stranger's home.\nGAME OVER!");
                }
            }



        }
        else if (choice.equalsIgnoreCase("patio")) {
            System.out.println("The patio is very spacious. On one side you see a \"pool\", to the other side you see a \"shed\". " +
                    "Which of the two do you go to? ");
            choice = sc.next();
            if (choice.equalsIgnoreCase("pool")) {
                System.out.println("As you approach the pool, you notice it is quite dirty and full of leaves." +
                        " Do you decide to \"swim\" in the pool regardless of the filth, or do you \"clean\" it instead?");
                choice = sc.next();
                if (choice.equalsIgnoreCase("swim")) {
                    System.out.println("You swim in the pool and eventually get infected with a weird bacteria. \nGAME OVER.");
                } else if (choice.equalsIgnoreCase("clean")) {
                    System.out.println("You start cleaning the pool and time passes you by." +
                            " The owners of the house mistake you for a cleaning person and pay you $200. \nCongrats!");
                }
            }
            else if (choice.equalsIgnoreCase("shed")) {
                System.out.println("While you look into the cabinet, you hear footsteps approaching. " +
                        "There's a \"can\" of beans and an expensive-looking \"plate\". Take one and leave!: ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("can")) {
                    System.out.println("You take the can of beans and eat it. Your stomach is not happy... \nGAME OVER!");
                } else if (choice.equalsIgnoreCase("plate")) {
                    System.out.println("You take the plate and make a run for it. You sell it online for a million dollars. \nCongrats!");
                }
            }



        }
        else if (choice.equalsIgnoreCase("living room")) {
            System.out.println("Predictable. You looked hungry the second I saw you. As you enter the kitchen, you see a \"refrigerator\"" +
                    " and a half open \"cabinet\". Which one do you dare open?");
            choice = sc.next();
            if (choice.equalsIgnoreCase("refrigerator")) {
                System.out.println("I like how you think: Go big or go home. Unfortunately, the fridge is mostly empty, except for a strange" +
                        " \"milk\" and some \"leftovers\". ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("milk")) {
                    System.out.println("You drank rotten milk.\nGAME OVER...");
                } else if (choice.equalsIgnoreCase("leftovers")) {
                    System.out.println("You ate the leftovers. That's a pretty good ending if you ask me. \nCongrats!");
                }
            }
            else if (choice.equalsIgnoreCase("cabinet")) {
                System.out.println("While you look into the cabinet, you hear footsteps approaching. " +
                        "There's a \"can\" of beans and an expensive-looking \"plate\". Take one and leave!: ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("can")) {
                    System.out.println("You take the can of beans and eat it. Your stomach is not happy... \nGAME OVER!");
                } else if (choice.equalsIgnoreCase("plate")) {
                    System.out.println("You take the plate and make a run for it. You sell it online for a million dollars. \nCongrats!");
                }
            }



        }
        else if (choice.equalsIgnoreCase("basement")) {
            System.out.println("Predictable. You looked hungry the second I saw you. As you enter the kitchen, you see a \"refrigerator\"" +
                    " and a half open \"cabinet\". Which one do you dare open?");
            choice = sc.next();
            if (choice.equalsIgnoreCase("refrigerator")) {
                System.out.println("I like how you think: Go big or go home. Unfortunately, the fridge is mostly empty, except for a strange" +
                        " \"milk\" and some \"leftovers\". ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("milk")) {
                    System.out.println("You drank rotten milk.\nGAME OVER...");
                } else if (choice.equalsIgnoreCase("leftovers")) {
                    System.out.println("You ate the leftovers. That's a pretty good ending if you ask me. \nCongrats!");
                }
            }
            else if (choice.equalsIgnoreCase("cabinet")) {
                System.out.println("While you look into the cabinet, you hear footsteps approaching. " +
                        "There's a \"can\" of beans and an expensive-looking \"plate\". Take one and leave!: ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("can")) {
                    System.out.println("You take the can of beans and eat it. Your stomach is not happy... \nGAME OVER!");
                } else if (choice.equalsIgnoreCase("plate")) {
                    System.out.println("You take the plate and make a run for it. You sell it online for a million dollars. \nCongrats!");
                }
            }



        }



    }
}
