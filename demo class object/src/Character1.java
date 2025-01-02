public class Character1 {
  private int hp;
  private int mp;
  private int MaxHP;
  private int MaxMP;

  

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

  public int getMaxHP() {
    return this.MaxHP;
  }

  public void setMaxHP(int maxHP) {
    MaxHP = maxHP;
  }

  public int getMaxMP() {
    return this.MaxMP;
  }

  public void setMaxMP(int maxMP) {
    MaxMP = maxMP;
  }

  public Character1() {}

  public Character1(int hp, int mp, int maxHP, int maxMP) {
    this.hp = hp;
    this.mp = mp;
    MaxHP = maxHP;
    MaxMP = maxMP;
  }

  
  

  public boolean isAlive(){
    return hp>0;
  }

  public void levelUp(){
    this.MaxHP+=50;
    this.MaxMP+=50;
  }

  public static void main(String[] args) {
    Character1 character1= new Character1(50,50,50,50);
    character1.setHp(character1.getHp()-50);
    System.out.println(character1.getHp());
  }
  
}
