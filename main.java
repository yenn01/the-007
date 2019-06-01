
package pkg007;
import java.util.Scanner;
// Created by Ooi Yenn Miing :D // 
// Inspired by the childhood game named "007"

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static int defaultDefense = 0;
    static int defaultAiDefense = 0;
    static int playerLife = 2 ;
    static int aiLife = 2 ;
    static int defaultAmmo = 0 ;
    static int defaultAiAmmo = 0 ;
    static int count = 0 ;
    static int damage = 0 ;
    
    //This is the main
    public static void main(String[] args) {
        System.out.print("");
        boolean playAgain=false;
        do {
        Game(playerLife, aiLife, count , defaultAmmo, defaultAiAmmo, defaultDefense, defaultAiDefense );
        boolean validplayAgain=false;
        do {
        System.out.println("Great game! Do you want to play again?");
        char YnN = scanner.next().charAt(0);
        switch (YnN) {
            case 'y': 
            case 'Y': validplayAgain=true;
                      playAgain=true;
                      break;
            case 'N':
            case 'n': validplayAgain=true;
                      playAgain=false;
                      break;
            default: validplayAgain=false;
                     System.out.println("Invalid Choice, please try again");
        }
                } while(validplayAgain==false);
        } while (playAgain==true);
    }
   
   //This is the code which is the interface of the game
   public static void Game(int playerLife, int aiLife, int count, int playerAmmo, int aiAmmo, int playerDefend, int aiDefend) {
       do {
           count = count + 1;
           boolean errorKeyin = false;
           int playerChoice=-1;
           playerDefend=0;
           aiDefend=0;
           int aiDamage=0;
           int playerDamage=0;
           
           String playerWeapon = "None" ;
           
           System.out.println("------------------------------------------------");
           System.out.println("            Round " + count);
           System.out.println("------------------------------------------------");
           System.out.println("Your Health = " + playerLife);
           System.out.println("Your amount of ammo : " + playerAmmo);
           System.out.println("");
           System.out.println("Computer's Health = " + aiLife );
           System.out.println("Computer's Ammo = " + aiAmmo);
           System.out.println("");
           System.out.println("State your choice");
           System.out.println("1 - Defend");
           System.out.println("2 - Refill Ammo");
           
           //Test if the player has the necessary Ammo and displays to it accordingly
           if (playerAmmo>=1) {
               System.out.println("3 - Shoot with Pistol");
           } 
           if (playerAmmo>=2) {
               System.out.println("4 - Shoot with Dual Pistol");
           }
           if (playerAmmo>=3) {
               System.out.println("5 - Shoot with Rocket Propelled Grenade");
           }           
                       
           boolean validChoice=false;
           do {
               validChoice=true;
               System.out.println("");
           System.out.print("Choice: ");
           boolean intTest = true;
           while (intTest) {
               if (scanner.hasNextInt()) 
                   playerChoice = scanner.nextInt();
               else {
                   scanner.next();
               }
               intTest=false;
          
}
           
           
           
   //Handle how you choose. 
 
           
               if (playerChoice==1) {
               playerDefend = getDefend();
               validChoice=true;
               }
           
           
           if (playerChoice==2) {
               validChoice=true;
               System.out.println("You have chosen to reload");
               } 
           
           if (playerChoice==3) {
               if (playerAmmo>=1) {
                   System.out.println("You have chosen to shoot with One Pistol");
                   playerWeapon = playerWeapon(playerChoice);
                   validChoice=true;
               } else {
                   validChoice=false;
                   System.out.println("You do not have enough ammo");
               }
           }
           
           if (playerChoice==4){
               if (playerAmmo>=2) {
                   System.out.println("You have chosen to shoot with Dual Pistol");
                   playerWeapon = playerWeapon(playerChoice);
                   validChoice=true;
               } else if (playerAmmo<2){
                   System.out.println("You do not have enough ammo");
                   validChoice=false;
               }
           }
           
            if (playerChoice==5){
               if (playerAmmo>=3) {
                   System.out.println("You have chosen to shoot with Rocket Propelled Grenade");
                   playerWeapon = playerWeapon(playerChoice);
                   validChoice=true;
               } else if (playerAmmo<3){
                   System.out.println("You do not have enough ammo");
                   validChoice=false;
               }
           }
            if (playerChoice<=0 || playerChoice>=6) {
                System.out.println("Inputted Choice is invalid");
                validChoice=false;
            }
           } while (validChoice==false);
           
           //Whole AI Procedure
           int aiChoice = 0 ; 
            AI AI = new AI();
            aiChoice = AI.getAiChoice(playerAmmo, aiAmmo);
            String aiAction = AI.getAiAction(aiChoice);
            aiDamage = AI.getDamage(aiChoice);
            System.out.println("");
            System.out.println("Computer has decided to " + aiAction);
            int aiDefence= AI.getDefend(aiAction);
            
            if (aiAction.equals("Reload")) {
            aiAmmo = AI.reload(aiAmmo);
            } else if (aiAction.equals("Shoot with Pistol")) {
                aiAmmo = AI.shootPistol(aiAmmo);
            } else if (aiAction.equals("Shoot with Dual Pistols")) {
                aiAmmo = AI.shootDualPistol(aiAmmo);
            } else if (aiAction.equals("Shoot with RPG")) {
                aiAmmo = AI.shootRPG(aiAmmo);
            }
            //AI Procedure Ends
            
            if (playerChoice==2) {
                playerAmmo += 1;
            } else if (playerChoice==3) {
                playerDamage=1;
                playerAmmo -= 1;
            } else if (playerChoice==4) {
                playerDamage=2;
                playerAmmo -=2;
            } else if (playerChoice==5) {
                playerDamage=3;
                playerAmmo -=3;
            }
           if (playerDamage!=0 && playerDamage-aiDefence!=0) {
             aiLife -=1;
         }
       if (aiDamage-playerDefend!=0 && aiDamage!=0) {
           playerLife -=1;
       } 
       if (aiDamage>playerDamage && playerDamage!=0 && aiDamage!=0) {
           aiLife += 1;
       }
       if (playerDamage>aiDamage && playerDamage!=0 && aiDamage!=0) {
           playerLife +=1;
       } 
       if (playerDamage==aiDamage && playerDamage!=0 && aiDamage!=0) {
           System.out.println("The bullets countered each other in mid-air!!");
           playerLife +=1;
           aiLife +=1;
       }
       
       

       
       
           
           
           
       } while (playerLife>=1 && aiLife>=1);
       
       if (playerLife>=1 && aiLife <=0) {
           Player();
       } else if (playerLife<=0 && aiLife >=1) {
           Computer();
       } else if (playerLife<=0 && aiLife <=0) {
           Draw();
       }
       
       
   }
    
   //This is the code used to determine the player's weapon based on the player's choice  
   public static String playerWeapon(int playerChoice) {
       String playerWeapon;
        switch (playerChoice) {
            case 3:
                {
                    playerWeapon = Data007.Weapons[0];
                    return playerWeapon;
                }
            case 4:
                {
                    playerWeapon = Data007.Weapons[1];
                    return playerWeapon;
                }
            case 5:
                {
                    playerWeapon = Data007.Weapons[2];
                   return playerWeapon;                  
                }
            default: playerWeapon = "None";
                break;
        }
        return playerWeapon;
   }
   
   //This is used to determine the player's defend level based on the player's defend input
   public static String playerDefend(int amtDefend) {
       String playerDefend = "Null";
        switch (amtDefend) {
            case 1:
                playerDefend = "Defend One" ;
                break;
            case 2:
                playerDefend = "Defend Two";
                break;
            case 3:
                playerDefend = "Defend Three" ;
                break;
            default:
                break;
        }
   return playerDefend;
   } 
   
   //This is used to request for the defend level input of the player
   public static int getDefend() {
       int amtDefend=-1;
       boolean errorKeyin=false;
       while (errorKeyin!=true) {
               System.out.print("You chose to defend, enter value of defence, 1,2 or 3 : ");
               boolean intTest = true;
           while (intTest) {
               if (scanner.hasNextInt()) 
                   amtDefend = scanner.nextInt();
               else {
                   scanner.next();
               }
               intTest=false;
               if (amtDefend>0 && amtDefend <=3) {
                   errorKeyin=true;
               } else {
                   errorKeyin=false;
                   System.out.println("Invalid amount of defence, please re-input");
               }
   }
       }
       return amtDefend;
   }
   
   //This is used to display the message for if the game results in a draw
   public static void Draw() {
       System.out.println("The game ended in a draw");
   }
   
   //This is used to display the winning message if the player won
   public static void Player() {
       System.out.println("Congratulations, you've won");
   }
   
   //This is used to display the losing message if the computer won
   public static void Computer() {
       System.out.println("You Lost. Better luck next time");
   }     
}
