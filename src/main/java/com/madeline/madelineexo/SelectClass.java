package com.madeline.madelineexo;

import com.madeline.madelineexo.classPlayer.ClassP;

public class SelectClass {

    public void chooseAClass(String myVar) {
        ClassP playerClasse = ClassP.NINJA;
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
    }
}
