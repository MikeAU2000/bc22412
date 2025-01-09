public class Archer extends Hero{

  public Archer(){}
  
  public Archer(String name) {
    super(name);
    this.setHp(Archers.HP_ARR[this.getLevel()]);
    this.setMp(Archers.MP_ARR[this.getLevel()]);
  }

  public int getPa(){
    return Archers.PA_ARR[this.getLevel()];
  }

  public void attack(Hero hero){
    hero.attacked(this,this.getPa());
  }

  public void attacked(Hero hero,int demand){
    this.setHp(this.getHp()-(demand-Archers.PD_ARR[this.getLevel()]));
    System.out.println(this.getName()+" under attack from "+ hero.getName());
    isAlive();
  }

  public void magicalAttack(Hero hero){
    hero.attacked(this,this.getMa());
  }

  public void magicalAttacked(Hero hero,int demand){
    this.setHp(this.getHp()-(demand-Archers.MD_ARR[this.getLevel()]));
    System.out.println(this.getName()+" under magical attack from "+ hero.getName());
    isAlive();
  }

  public int getMa(){
    return Archers.MA_ARR[this.getLevel()];
  }

  public void levelUp(){
    
    this.setLevel(this.getLevel()+1);
    this.setHp(Archers.HP_ARR[this.getLevel()]);
    this.setMp(Archers.MP_ARR[this.getLevel()]);
    System.out.println(this.getName()+" level up to "+this.getLevel());
  }

  public static void main(String[] args) {
    Archer archer1= new Archer("archer1");
    Archer archer2= new Archer("archer2");
    Warrior warrior1= new Warrior("warrior1");
    archer1.attack(archer2);
    archer2.magicalAttack(archer1);
    System.out.println(archer2.getHp());
    System.out.println(archer1.getHp());
    archer2.levelUp();
    archer2.levelUp();
    archer2.magicalAttack(archer1);
    System.out.println(archer2.getHp());
    System.out.println(archer1.getHp());

  }
}
