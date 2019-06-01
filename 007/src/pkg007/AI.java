package pkg007;

public class AI {
     
     public static int getAiChoice(int playerAmmo, int aiAmmo) {
         
         int aiChoice=0;
         int  random = (int )(Math.random() * 100 + 1);
                if (playerAmmo==0) {
                    if (aiAmmo==0) {
                        aiChoice = 0 ; //AI Reloads
                    }                
                                                          
                    if (aiAmmo==1) {
                        if (random>=50) {
                            aiChoice = 1; //AI Shoots with one Pistol
                        } else if (random<=49) {
                            aiChoice = 0; //AI Reloads
                        }
                    }
                    if (aiAmmo==2) {
                        if (random>=65) {
                            aiChoice = 1 ; //AI Shoots with one Pistol
                        } else if (random>=30 && random <= 64) {
                            aiChoice = 2 ; //AI Shoots with Dual Pistols
                        } else if (random<=29) {
                            aiChoice = 0;  //AI Reloads
                        }
                    }
                    if (aiAmmo>=3) {
                        if (random>=75) {
                            aiChoice = 1 ; //AI Shoots with one Pistol
                        } else if (random>=50 && random<=74) {
                            aiChoice = 2 ; //AI Shoots with Dual Pistols
                        } else if (random>=10 && random<=49) {
                            aiChoice = 3 ; //AI Shoots with RPG
                        } else if (random>=1 && random<=9)
                            aiChoice = 0 ; //AI Reloads
                    }
                }
                if (playerAmmo==1) {
                    random = (int )(Math.random() * 100 + 1);
                    if (aiAmmo==0) {
                        if (random>=60) {
                            aiChoice = 4 ; //AI Defends One
                        } else {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    if (aiAmmo==1) {
                        if (random>=68) {
                            aiChoice = 4 ; //AI Defends One
                        } else if (random>=31 && random  <= 67) {
                            aiChoice = 1 ; //AI Shoots with one Pistol
                        } else if (random>=1 && random<=30) {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    if (aiAmmo==2) {
                        if (random>=75) {
                            aiChoice = 4 ; //AI Defends One
                        } else if (random>=50 && random<=74) {
                            aiChoice = 1 ; //AI Shoots with one Pistol
                        } else if (random>=25 && random<=49) {
                            aiChoice = 2 ; //Ai Shoots with Dual Pistols
                        } else if (random>=1 && random <=24) {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    
                    if (aiAmmo>=3) {
                        if (random>=90) {
                            aiChoice = 0 ; //Ai Reloads
                        } else if (random>=60 && random <=89){
                            aiChoice = 3 ; //AI shoots with RPG
                        } else if (random>=40 && random<=59) {
                            aiChoice = 2 ; //AI Shoots with Dual Pistols
                        } else if (random>=20 && random<=39) {
                            aiChoice = 1 ; //AI shoots with one Pistol
                        } else if (random>=1 && random <=19) {
                            aiChoice = 4 ; //AI Defends ONe
                        }
                    }
                } else if (playerAmmo==2) {
                    if (aiAmmo==0) {
                        if (random>=60) {
                            aiChoice = 4 ; //AI Defends One
                        } else if (random>=20 && random<=59) {
                            aiChoice = 5 ; //AI Defends Two
                        } else if (random>=1 && random<=19) {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    if (aiAmmo==1) {
                        if (random>=75) {
                            aiChoice = 4 ; //AI Defends
                        } else if (random>=45 && random  <= 74) {
                            aiChoice = 1 ; //AI Shoots with one Pistol
                        } else if (random>=25 && random<=44) {
                            aiChoice = 5 ; //AI Defends Two
                        } else if (random>=1 && random<=18) {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    if (aiAmmo==2) {
                        if (random>=80) {
                            aiChoice = 4 ; //AI Defends One
                        } else if (random>=50 && random<=79) {
                            aiChoice = 5 ; //AI Defends Two
                        } else if (random>=30 && random<=49) {
                            aiChoice = 2 ; //Ai Shoots with Dual Pistols
                        } else if (random>=10 && random <=29) {
                            aiChoice = 1 ; //AI Shoots with one Pistol
                        } else if (random>=1 && random<=9) {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    
                    if (aiAmmo>=3) {
                        if (random>=95) {
                            aiChoice = 0 ; //Ai Reloads
                        } else if (random>=75 && random <=94){
                            aiChoice = 3 ; //AI shoots with RPG
                        } else if (random>=60 && random<=74) {
                            aiChoice = 2 ; //AI Shoots with Dual Pistols
                        } else if (random>=45 && random<=59) {
                            aiChoice = 1 ; //AI shoots with one Pistol
                        } else if (random>=20 && random <=44) {
                            aiChoice = 4 ; //AI Defends ONe
                        } else if (random>=1 && random<=19) {
                            aiChoice = 5 ; //AI Defends Two
                        }
                }
           } else if (playerAmmo>=3) {
               random = (int )(Math.random() * 100 + 1);
                    if (aiAmmo==0) {
                        if (random>=75) {
                            aiChoice = 4 ; //AI Defends One
                        } else if (random>=50 && random <=74) {
                            aiChoice = 5 ; //AI Defends Two
                        } else if (random>=25 && random <=49) {
                            aiChoice = 6 ; //AI Defends Three
                        } else if (random>=1 && random<=24) {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    if (aiAmmo==1) {
                        if (random>=80) {
                            aiChoice = 4 ; //AI Defends One
                        } else if (random>=60 && random  <= 79) {
                            aiChoice = 5 ; //AI Defends Two
                        } else if (random>=40 && random<=59) {
                            aiChoice = 6 ; //AI Defends Three
                        } else if (random>=20 && random<=39) {
                            aiChoice = 1 ; //AI Shoots
                        } else if (random>=1 && random<=19) {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    if (aiAmmo==2) {
                        if (random>=83) {
                            aiChoice = 4 ; //AI Defends One
                        } else if (random>=67 && random<=82) {
                            aiChoice = 5 ; //AI Defends Two
                        } else if (random>=51 && random<=66) {
                            aiChoice = 6 ; //Ai Defends Three
                        } else if (random>=35 && random <=50) {
                            aiChoice = 1 ; //AI Shoots with one Pistol
                        } else if (random>=19 && random <=34) {
                            aiChoice = 2 ; //AI Shoots with Dual Pistols
                        } else if (random>=1 && random<=18) {
                            aiChoice = 0 ; //AI Reloads
                        }
                    }
                    
                    if (aiAmmo>=3) {
                        if (random>=95) {
                            aiChoice = 0 ; //Ai Reloads
                        } else if (random>=79 && random <=94){
                            aiChoice = 3 ; //AI shoots with RPG
                        } else if (random>=64 && random<=78) {
                            aiChoice = 2 ; //AI Shoots with Dual Pistols
                        } else if (random>=49 && random<=63) {
                            aiChoice = 1 ; //AI shoots with one Pistol
                        } else if (random>=34 && random <=48) {
                            aiChoice = 4 ; //AI Defends ONe
                        } else if (random>=15 && random <=33) {
                            aiChoice = 5 ; //AI Defends Two
                        } else if (random>=1 && random<=14) {
                            aiChoice = 6 ; //AI Defends Three
                        }
                    
                            }
                    }
         
         
         
         return aiChoice;
         
     }
     public static String getAiAction(int aiChoice) {
       String aiAction= Data007.aiActions[aiChoice];
       return aiAction;
     }
     public static int getDamage(int aiChoice) {
          int Damage=0;
       switch (aiChoice) {
           case 1: Damage=1;
                   break;
           case 2: Damage=2;
                   break;
           case 3: Damage=3;
                   break;
           default:break;
       }
       return Damage;
     }
     public static int getDefend(String aiAction ) {
         int aiDefence=0;
         if (aiAction.equals("Defend One")) {
            aiDefence=1;
        } else if (aiAction.equals("Defend Two")) {
            aiDefence=2;
        } else if (aiAction.equals("Defend Three")) {
            aiDefence=3;
        }
         return aiDefence;
     }
     public static int reload(int aiAmmo){
         aiAmmo = aiAmmo + 1 ;
         
         return aiAmmo;
     }
     public static int shootPistol(int aiAmmo) {
         aiAmmo -= 1;
         return aiAmmo;
     }
     public static int shootDualPistol(int aiAmmo) {
         aiAmmo -= 2;
         return aiAmmo;
     }
     public static int shootRPG(int aiAmmo) {
         aiAmmo -= 3;
         return aiAmmo;
     }
}