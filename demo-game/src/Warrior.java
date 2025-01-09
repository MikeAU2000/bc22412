public class Warrior extends Hero {

  public Warrior() {}

  public Warrior(String name) {
    super(name);
    this.setHp(Warriors.HP_ARR[this.getLevel()]);
    this.setMp(Warriors.MP_ARR[this.getLevel()]);
  }

  public int getPa(){
    return Warriors.PA_ARR[this.getLevel()];
  }

  public void attack(Hero hero) {
    hero.attacked(this, Warriors.PA_ARR[this.getLevel()]);
  }

  public void attacked(Hero hero, int demand) {
    this.setHp(this.getHp() - (demand - Warriors.PD_ARR[this.getLevel()]));
    System.out.println(this.getName() + " under attack from " + hero.getName());
    isAlive();
  }

  public void levelUp() {
    this.setLevel(this.getLevel() + 1);
    this.setHp(Warriors.HP_ARR[this.getLevel()]);
    this.setMp(Warriors.MP_ARR[this.getLevel()]);
    System.out.println(this.getName() + " level up to " + this.getLevel());
  }

  public void magicalAttack(Hero hero){
    hero.attacked(this,this.getMa());
  }

  public void magicalAttacked(Hero hero,int demand){
    this.setHp(this.getHp()-(demand-Warriors.MD_ARR[this.getLevel()]));
    System.out.println(this.getName()+" under magical attack from "+ hero.getName());
    isAlive();
  }

  public int getMa(){
    return Warriors.MA_ARR[this.getLevel()];
  }
}
