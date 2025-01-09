public enum Currency {
  USD("US Dolloar"),
  CNY("Chinese Yuan Dolloar"),
  HKD("Hong KOng Dolloar");

  private String desc;

  private Currency(String desc) {
    this.desc = desc;
  }

  public static String getDescription(Currency currency){
    switch(currency){
      case HKD:
        return "Hong Kong Dollar";
      case CNY:
        return "Chinese Yuan Renminbi";
      case USD:
        return "US Dolloar";
      default:
        return "";
    }
  }

  public String getDesc(){
    return this.desc;
  }
  public static void main(String[] args) {
    Currency.getDescription(CNY);
    System.out.println(Currency.getDescription(Currency.CNY));
    System.out.println(Currency.HKD.getDesc());
    Currency hkd= Currency.HKD;
    System.out.println(hkd.getDesc());
    
  }
}
