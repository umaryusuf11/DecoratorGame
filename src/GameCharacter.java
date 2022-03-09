
public class GameCharacter 
{
	private String name;
	private int healthPoints;
	
	private int fireVulnerability;
	private int lightningVulnerability;
	
	private boolean onFire;

	private boolean dead;
	
	
	public GameCharacter(String name,int healthPoints, int fireVulnerability,int lightningVulnerability, boolean onFire, boolean dead) 
	{
		this.name = name;
		this.healthPoints = healthPoints;
		
		this.fireVulnerability = fireVulnerability;
		this.lightningVulnerability = lightningVulnerability;
		
		this.onFire = onFire;

		this.dead = dead;
	}
	
	
	public void takeWeaponDamage(int damage)
	{
		System.out.println(name +" takes " + damage +" weapon damage");
		takeDamage(damage); 
	}
	
	public void takeFireDamage(int fireDamage)
	{
		if(!onFire)
		{
			onFire=true;
			System.out.println(name+ " is set on fire and takes "+ fireDamage + " fire damage");
			takeDamage(fireDamage);
		}
		else 
		{
			System.out.println(name +" takes " + (fireDamage + fireVulnerability) + " fire damage");
			takeDamage(fireDamage+fireVulnerability);
		}
	}
	
	
	public void takeLightningDamage(int lightningDamage)
	{
		System.out.println(name +" takes " + (lightningDamage*lightningVulnerability) + " lightning damage");
		takeDamage(lightningDamage*lightningVulnerability);
		lightningVulnerability++;
	}
	
	
	private void takeDamage(int damage) 
	{
		if (!dead)
		{
			healthPoints-=damage;
			if(healthPoints<=0)
			{
				dead = true;
				System.out.println(name+ " is dead");
			}
			else 
			{
				System.out.println(name + " has "+ healthPoints +" health points remaining");
			}
		}
		else 
		{
			System.out.println("Stop, stop, they're already dead!");
		}
	}


	public int getHealthPoints() {
		return healthPoints;
	}


	public int getFireVulnerability() {
		return fireVulnerability;
	}

	public void setFireVulnerability(int fireVulnerability) {
		this.fireVulnerability = fireVulnerability;
	}


	
	public static void main(String args[])
	{
		GameCharacter orcCharacter = new GameCharacter("Orc", 100, 10, 0, false, false);
		SillySwordSetup sillySword = new SillySwordSetup(0);
		sillySword.setLesserLightningGem(true);
		sillySword.setLightingGem(true);
		sillySword.setGreaterLightningGem(true);
		System.out.println("------------");
		sillySword.attack(orcCharacter);
		System.out.println("------------");
		sillySword.attack(orcCharacter);
		System.out.println("------------");
	}
	
	
}
