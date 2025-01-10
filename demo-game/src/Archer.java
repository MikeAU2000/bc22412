public class Archer extends Hero{
  private Bow bow;

  public Archer(){}
  
  public Archer(String name,Bow bow) {
    super(name);
    this.setHp(Archers.HP_ARR[this.getLevel()]);
    this.setMp(Archers.MP_ARR[this.getLevel()]);
    this.setBow(bow);
  }

  public Bow getBow() {
    return bow;
  }

  public void setBow(Bow bow) {
    this.bow = bow;
  }

  public int getPa(){
    return Archers.PA_ARR[this.getLevel()];
  }

  public void attack(Hero hero){
    hero.attacked(this,this.getPa()+this.getBow().getWeaponPa());
  }

  public void attacked(Hero hero,int demand){
    this.setHp(this.getHp()-(demand-Archers.PD_ARR[this.getLevel()]));
    System.out.println(this.getName()+" under attack from "+ hero.getName()+" the total demand is "+(demand-Archers.MD_ARR[this.getLevel()]));
    isAlive();
  }

  public void magicalAttack(Hero hero){
    hero.attacked(this,this.getMa());
  }

  public void magicalAttacked(Hero hero,int demand){
    this.setHp(this.getHp()-(demand-Archers.MD_ARR[this.getLevel()]));
    System.out.println(this.getName()+" under magical attack from "+ hero.getName()+",the total demand is "+(demand-Archers.MD_ARR[this.getLevel()]));
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
    Bow bow= new Bow();
    Archer archer1= new Archer("archer1",bow);
    Archer archer2= new Archer("archer2",bow);
    Warrior warrior1= new Warrior("warrior1");
    archer1.attack(archer2);
    System.out.println(archer2.getHp());
    System.out.println(archer1.getHp());

  }
}
