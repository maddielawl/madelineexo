package com.madeline.madelineexo;

import com.madeline.madelineexo.classPlayer.ClassP;

public class SelectClass {

    public String chooseAClass() {
        ClassP playerClasse = ClassP.NINJA;
        String Ninja = ClassP.NINJA.toString();
        String Mage = ClassP.MAGE.toString();
        String Warrior = ClassP.WARRIOR.toString();
        switch(playerClasse) 
        {
          case MAGE:
            System.out.println("Tu as choisit Magicien!");
            break;
          case NINJA:
             System.out.println("Tu as chosiit Ninja!");
            break;
          case WARRIOR:
            System.out.println("Tu as choisit Warrior!");
            break;
        }

        return playerClasse.toString();
    }
}
