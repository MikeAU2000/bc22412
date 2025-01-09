public class SuperBox<T extends Animal, U extends Hero, V extends Weapon> {
  private T animal;
  private U hero;
  private V weapon;

  public void setAnimal(T animal){
    this.animal=animal;
  }

  public void setHero(U hero){
    this.hero= hero;
  }

  public void setWeapon(V weapon){
    this.weapon= weapon;
  }

  public static void main(String[] args) {
    SuperBox <Animal, Hero, Weapon> s1=new SuperBox<>();
    s1.setAnimal(new Tiger());
    s1.setHero(new Mage());
    s1.setWeapon(new Bow());
  }
}
