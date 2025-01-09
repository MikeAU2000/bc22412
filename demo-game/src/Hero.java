public abstract class Hero {
  private String name;
  private int hp;
  private int mp;
  private int level;

  // Child Class Archer, Mage, Warrior

  // Level
  // attackPower

  // attackPower
  // Weapon

  public Hero() {}

  public Hero(String name) {
    this.name = name;
    this.level = 1;
  }

  public static Hero create(char ref, String naem) {
    switch (ref) {
      case 'W':
        return new Warrior(naem);
      case 'A':
        return new Archer(naem);
      case 'M':
        return new Mage(naem);
      default:
      return null;
        //rthrow new IllegalArgumentException("Invalid hero type: " + ref);
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHp() {
    return this.hp;
  }

  public void setHp(int hp) {
    this.hp = hp;
  }

  public int getMp() {
    return this.mp;
  }

  public void setMp(int mp) {
    this.mp = mp;
  }

  public int getLevel() {
    return this.level;
  }

  public void setLevel(int level) {
    this.level = level;
  }



  public boolean isAlive() {
    if (this.hp <= 0) {
      System.out.println(this.getName() + "is die");
    }
    return this.hp > 0;
  }

  abstract void levelUp();

  abstract void attack(Hero hero);

  abstract void attacked(Hero hero, int demand);

  abstract void magicalAttack(Hero hero);

  abstract void magicalAttacked(Hero hero, int demand);


  }
