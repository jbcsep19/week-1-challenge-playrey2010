import java.util.Scanner;

public class ChooseYourAdventure {

    public static void main(String[] args) {
        String choice = "";
        Scanner sc = new Scanner(System.in);
        String welcome = "Welcome to Ifland, where your choice matters to me!\n\n";


        System.out.println(welcome + "You find yourself in an unknown house. Do you go to the \"kitchen\", \"upstairs\"," +
                "to the \"patio\", into the \"living room\", or into the \"basement\"?");
        choice = sc.nextLine();

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
                        " where you can lay down for a while, and a closed \"drawer\" on the side of the bed. " +
                        "Take a nap(\"bed\") or sate your curiosity (\"drawer\")? ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("bed")) {
                    System.out.println("You decide to take a nap... The police wakes you up and escort you to jail. What were you doing in a stranger's house to begin with?" +
                            "\nGAME OVER!");
                } else if (choice.equalsIgnoreCase("drawer")) {
                    System.out.println("You open the drawer and find a ten thousand dollars cash. You take them and hurry outside, and no one notices you." +
                            "\nCongrats!");
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
                            " The police wants to know what you are doing in a stranger's bathroom.\nGAME OVER!");
                }
            }
        }
        else if (choice.equalsIgnoreCase("patio")) {
            System.out.println("The patio is very spacious. On one side you see a \"pool\", to the other side you see a \"shed\". " +
                    "Which of the two do you go to? ");
            choice = sc.next();
            if (choice.equalsIgnoreCase("pool")) {
                System.out.println("As you approach the pool, you notice it is quite dirty and full of leaves." +
                        " Do you want to \"swim\" in the pool regardless of the filth, or do you \"clean\" it instead?");
                choice = sc.next();
                if (choice.equalsIgnoreCase("swim")) {
                    System.out.println("You swim in the pool and eventually get infected with a weird bacteria. \nGAME OVER.");
                } else if (choice.equalsIgnoreCase("clean")) {
                    System.out.println("You start cleaning the pool and time passes you by." +
                            " The owners of the house mistake you for a cleaning person and pay you $200. \nCongrats!");
                }
            }
            else if (choice.equalsIgnoreCase("shed")) {
                System.out.println("You open the shed and discover a set of tools. To the left, a mighty \"axe\", " +
                        "to the right, a \"hammer\" with a magical aura surrounding it. ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("axe")) {
                    System.out.println("As you pick up the axe, you feel full of energy. Something inside you tells you to either" +
                            " \"chop\" a tree to test your strength, or to \"throw\" the axe to test your accuracy: ");
                    choice = sc.next();
                    if (choice.equalsIgnoreCase("chop")) {
                        System.out.println("You start chopping and chopping as time passes you by. One last chop and the tree falls..." +
                                " on top of you.\nGAME OVER.");
                    } else if (choice.equalsIgnoreCase("throw")) {
                        System.out.println("You throw the axe at a target again and again until you hone your skill to perfection. " +
                                "A movie producer notices your prowess and decides to hire you for a few action films. \nCongrats!");
                    }
                } else if (choice.equalsIgnoreCase("hammer")) {
                    System.out.println("As you grab the hammer, its powerful aura begins to overwhelm you. You cannot hold on to the hammer much longer." +
                            " Do you hammer a \"nail\" or do you \"break\" the hammer? ");
                    choice = sc.next();
                    if (choice.equalsIgnoreCase("nail")) {
                        System.out.println("You decide to hammer a nail before you let go of it. It unlocks a magical portal to Asgard, where Thor thanks" +
                                " you for keeping his hammer safe. You are now protected under his power.\nCongrats!");
                    } else if (choice.equalsIgnoreCase("break")) {
                        System.out.println("You throw the hammer and it breaks. A moment later, Thor appears to look for his hammer, which he finds next to you. " +
                                "He unleashes his wrath upon you.\nGAME OVER!");
                    }
                }
            }
        }
        else if (choice.equalsIgnoreCase("living room")) {
            System.out.println("You walk to the living room and notice a big-screen \"TV\", and a very comfortable \"couch\". Do you turn on the " +
                    "\"TV\" or do you sit on the \"couch\"? ");
            choice = sc.next();
            if (choice.equalsIgnoreCase("TV")) {
                System.out.println("As you turn on the TV, a very disturbing channel is on. Do you \"change\" the channel or do you \"stay\" on it?");
                choice = sc.next();
                if (choice.equalsIgnoreCase("change")) {
                    System.out.println("You change to a channel with cute puppies running around. You can barely hear the TV, but you notice the audio" +
                            " doesn't seem to match the video. Do you \"increase\" or \"decrease\" the volume? ");
                    choice = sc.next();
                    if (choice.equalsIgnoreCase("increase")) {
                        System.out.println("Oh no! The volume is up and the controller no longer works. All you hear is \"INTRUDER ALERT!! INTRUDER ALERT!!\"" +
                                "The police meet you at the door. \nGAME OVER!");
                    } else if (choice.equalsIgnoreCase("decrease")) {
                        System.out.println("You decrease the volume. You hear footsteps approaching, and you decide to make a run for it. " +
                                "That was close, but you survived.\nCongrats!");
                    }
                } else if (choice.equalsIgnoreCase("stay")) {
                    System.out.println("Perhaps you have seen even worse. I won't judge you... but act quick, as someone is knocking on the door! " +
                            "Do you \"open\" the door or do you \"ignore\" it? ");
                    choice = sc.next();
                    if (choice.equalsIgnoreCase("open")) {
                        System.out.println("As you open the door, you see... yourself! But that version of you is stuck on a loop. He doesn't seem to do anything besides knock on the door... weird." +
                                "\nGAME OVER.");
                    } else if (choice.equalsIgnoreCase("ignore")){
                        System.out.println("Good idea. You take it as a sign to make a run for it. You end up safely at your place, wondering what went on, " +
                                "but at least you're alive.\nCongrats!");
                    }

                }
            }
            else if (choice.equalsIgnoreCase("couch")) {
                System.out.println("You're not one to deny yourself the pleasure of sitting on a nice couch. There's a couple of slices of pizza to your left, " +
                        "but you also notice a shadowy figure from outside the window.\nDo you look out the \"window\" or \"eat\" a slice? ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("window")) {
                    System.out.println("As you look out the window, you notice the Police were watching you the whole time. You have no time to escape.\n" +
                            "GAME OVER!");
                } else if (choice.equalsIgnoreCase("eat")) {
                    System.out.println("You keep it simple and eat a pizza. Nothing else happens, but at least you got pizza.\n" +
                            "Congrats!");
                }
            }
        }
        else if (choice.equalsIgnoreCase("basement")) {
            System.out.println("As you head down the basement, you notice it is completely dark. You see the switch to your right. " +
                    "Do you want to turn on the \"lights\" or walk in the \"dark\"? ");
            choice = sc.next();
            if (choice.equalsIgnoreCase("lights")) {
                System.out.println("You turn on the lights and you notice a laundry machine with clothes inside," +
                        " and another switch for the light at the end of the basement. Do you turn the \"laundry\"" +
                        " on or do you turn the lights back \"off\"?");
                choice = sc.next();
                if (choice.equalsIgnoreCase("laundry")) {
                    System.out.println("You turn the laundry machine on as someone comes into the basement. Although confused, the person" +
                            " thanks you for finishing the laundry. You get $5 and then leave.\nCongrats!");
                } else if (choice.equalsIgnoreCase("off")) {
                    System.out.println("As you turn the lights off, you realize the basement is bigger than you thought. You get lost and eventually..." +
                            " you die of hunger.\nGAME OVER!");
                }
            }
            else if (choice.equalsIgnoreCase("dark")) {
                System.out.println("You walk in the dark and keep bumping into everything. Fine, I'll help you out. " +
                        "There is a \"chest\" to your left and a \"closet\" to your right. Which of the two do you open? ");
                choice = sc.next();
                if (choice.equalsIgnoreCase("chest")) {
                    System.out.println("That was the obvious choice. There are thousands of golden coins inside. You take what you can and leave." +
                            " Now you're very rich :).\nCongrats!");
                } else if (choice.equalsIgnoreCase("closet")) {
                    System.out.println("Not the obvious choice. As you open the closet, a corpse falls down and you start to run away. " +
                            "You could have opened a chest full of gold... but you didn't. \nGAME OVER!");
                }
            }
        }
    }
}
