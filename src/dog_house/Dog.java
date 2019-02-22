package dog_house;

public class Dog {
	private int numTimesFed = 0;
	private boolean sleeping = false;
	private String name = "Tim";
	
	public String getName()
	   {
		return name;
	   }

	   public void wakeUp()
	   {
        System.out.println("Waking up");
        sleeping=false;
        numTimesFed = 0;
	   }

	   public void sleep()
	   {
		   this.sleeping=true;
		   System.out.println("Sleeping");
	   }

	   public void hear(String sound)
	   {
		    if (sleeping==true) {
		    return;
		    }
		   	if(sound.equals(name)) {
		   		System.out.println("Wag Tail");
		   	}
		   	if(sound.equals("ding-dong")) {
		   		System.out.println("Bark");
		   		
		   	}
	   }

	   public void feed()
	   {
		   if (sleeping==true) {
			    return;
		   }
		   numTimesFed+=1;
		  if( numTimesFed >2) {
		  System.out.println("YAWN");
		  }else {
			  System.out.println("YUMMY");
		  }
	   }

}
