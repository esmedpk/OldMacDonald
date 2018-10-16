class NamedCow extends Cow
{
	private String myName;
     public Cow(String type, String name, String sound)
     {
     	myType = type;
     	mySound = sound;
     	myName = name;
     }
     public Cow()
     {
     	myType = "unknown";
     	mySound = "unknown";
     	myName = "unknown";
     }
     public String getName(){return myName;}
}