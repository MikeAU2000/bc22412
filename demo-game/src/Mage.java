public class Mage extends Hero {
  public Mage() {}

  public Mage(String name) {
    super(name);
    this.setHp(Mages.HP_ARR[this.getLevel()]);
    this.setMp(Mages.MP_ARR[this.getLevel()]);
  }

  public int getPa(){
    return Mages.PA_ARR[this.getLevel()];
  }

  public void attack(Hero hero) {
    hero.attacked(this, this.getPa());
  }

  public void attacked(Hero hero, int demand) {
    this.setHp(this.getHp() - (demand - this.getPa()));
    System.out.println(this.getName() + " under attack from " + hero.getName());
    isAlive();
  }

  public void magicalAttack(Hero hero){
    hero.attacked(this,this.getMa());
  }

  public void magicalAttacked(Hero hero,int demand){
    this.setHp(this.getHp()-(demand-Mages.MD_ARR[this.getLevel()]));
    System.out.println(this.getName()+" under magical attack from "+ hero.getName());
    isAlive();
  }

  public int getMa(){
    return Mages.MA_ARR[this.getLevel()];
  }

  public void levelUp() {
    this.setLevel(this.getLevel() + 1);
    this.setHp(Mages.HP_ARR[this.getLevel()]);
    this.setMp(Mages.MP_ARR[this.getLevel()]);
    System.out.println(this.getName() + " level up to " + this.getLevel());
  }
}
