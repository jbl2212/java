//dumb java stuff you have to set up first
import java.util.Scanner;
import java.util.Random;
class Main {
  public static void main(String[] args) {
    Random rand = new Random();
    Scanner Doggo = new Scanner(System.in); // create this thing to get user input
   
    System.out.println("Java Text Based Game!"); //prints to screen

    //game variables
    int room = 1;
    String input = "glurbaburbal!"; //dummy value for game loop
    String[] inventory = {" ", " ", " ", " "}; //use this to hold player items
    int money = 0;
    int rand_int1 = rand.nextInt(50);
    int rand_int2 = rand.nextInt(50);
    int rand_int3 = rand.nextInt(50);
    int rand_int4 = rand.nextInt(50);
    int rand_int5 = rand.nextInt(50);

    while (input != "quit") { //OMG GAME LOOP-----------------------------------------

      //print inventory
      System.out.println("Your inventory:");
      for(int i = 0; i<=3; i++)
        System.out.println(inventory[i]);
      System.out.println("Your bank account holds:");
      System.out.println(money+ "dollars");
     
      switch (room) {
        case 1:
          System.out.println("You're in room 1, you can go East");
          System.out.println("You have found"+rand_int5+ "dollars");
          money+=rand_int5;
          input = Doggo.nextLine();
          if(input.equals("East"))
            room = 2;
          break;
        case 2:
          System.out.println("You're in room 2, you can go West or South");
          input = Doggo.nextLine();
          if(input.equals("South"))
            room = 3;
          else if (input.equals("West"))
            room = 1;
          break;
        case 3:
          System.out.println("You're in room 3, you can go North or West.");
          System.out.println("You have found"+rand_int4+ "dollars");
          money+=rand_int4;
          //check if they already have the gun, if not tell them they got it
          if (!inventory[0].equals("marshmallow gun")){
            System.out.println("OMG you got the marshmallow gun!");
            inventory[0] = "marshmallow gun";
          }
          input = Doggo.nextLine();
          if(input.equals("North"))
            room = 2;
          else if (input.equals("West"))
            room = 4;
          break;
        case 4:
          System.out.println("You're in room 4, you can go East or West");
          input = Doggo.nextLine();
         
          if (input.equals("East"))
            room = 3;
          else if (input.equals("West"))
            room = 5;
          break;
        case 5:
          System.out.println("You are in room 5, you can go East, North, or South");
          System.out.println("You have found"+rand_int1+ "dollars");
          money+=rand_int1;
          input = Doggo.nextLine();
           if (!inventory[2].equals("Cheese")){
            System.out.println("You discover cheese");
            inventory[2] = "Cheese";
           }
          if (input.equals("East"))
            room = 4;
          else if (input.equals("North"))
            room = 6;
          else if (input.equals("South"))
            room = 7;
          break;
        case 6:
          System.out.println("You are in room 6, you can go South");
          System.out.println("You have found"+rand_int3 + "dollars");
          money+=rand_int3;
          input = Doggo.nextLine();
             if (!inventory[1].equals("rusty key")){
            System.out.println("You discover a rusty old key.");
            inventory[1] = "rusty key";
             }
          if (input.equals("South"))
            room = 5;
          break;
        case 7:
          System.out.println("You are in room 7, you can go North or South");
          input = Doggo.nextLine();
          if (input.equals("North"))
            room = 5;
          else if (input.equals("South"))
            if (!inventory[1].equals("rusty key"))
              System.out.println("You don't have the key to unlock this room yet.");
            else
              room = 8;
          break;
        case 8:
          System.out.println("You are in room 8, you can go North");
          System.out.println("You have found"+rand_int2 + "dollars");
          money+=rand_int2;
          input = Doggo.nextLine();
           if (!inventory[3].equals("a gnome statue")){
            System.out.println("You discover a goofy gnome statue.");
            inventory[3] = "a gnome statue";
           }
          if (input.equals("North"))
            room = 7;
          break;

              
        
      }// end bracket for switch
    Doggo.close();
    } // end bracket for OMG GAME LOOP----------------------------------------------------
  }// end bracket for public static void main
}// end bracket for class main
