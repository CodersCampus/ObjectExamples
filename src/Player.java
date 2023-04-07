
public class Player {
	private String name;
	private Integer health;
	private Double damage;
	private Integer armor;
	
	public Player(String name, Integer health, Double damage, Integer armor) {
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.armor = armor;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHealth() {
		return health;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public Double getDamage() {
		return damage;
	}
	public void setDamage(Double damage) {
		this.damage = damage;
	}
	public Integer getArmor() {
		return armor;
	}
	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", health=" + health + ", damage=" + damage + ", armor=" + armor + "]";
	}
}

