class Chick implements Animal 
{     
     private String myType;
     private String mySound;
     public Chick(String type, String sound, String sound2)
     {
     	myType = type;
     	mySound = chooseSound();
     }
     public Chick()
     {
     	myType = "unknown";
     	mySound = "unknown";
     }
     public chooseSound()
     {
     	int chance = (Math.random()*2)+1;
     	if (chance == 1)
     	{
     		return sound;
     	} else {
     		return sound2;
     	}
     }

     public String getSound() {return mySound;}
     public String getType() {return myType;}
}
