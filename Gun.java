package weaponGame;

public class Gun extends Weapon{
	int noOfBullets=100;

	public void use()
{
		
		System.out.println("Use Gun");
		System.out.println("Reload");
		System.out.println("Shoot");
		}
	
	public void fire() {
		noOfBullets--;
	}
}
