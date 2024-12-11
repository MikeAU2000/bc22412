public class DemoConparison {
  public static void main(String []args){
    // >,<,>=,<=,!=,==

    int age = 20;
    boolean isAdult = age>18;
    double pi= 3.14159;
    boolean isCorrect = (pi== 3.14159);

    System.out.println(isAdult);
    System.out.println(isCorrect);

    char gender = 'F';
    boolean isMale = gender =='M';
    System.out.println(isMale);

    float price = 10.2f;
    System.out.println(price != 10f);
    
    if (! (price == 10.2f)){
      System.out.println("hi");
    }

    int age2= 30;
    char gender2='F';
    boolean result2= age2 >= 30 && gender2 =='M';
    System.out.println(result2);

    age2= 30;
    gender2='F';
    boolean result3= age2 >= 30 || gender2 =='M';
    System.out.println(result3);

    age2= 29;
    gender2='F';
    boolean result4= age2 >= 30 || gender2 =='M';
    System.out.println(result4);

    //And Or (true And (faise Or true))

    age2= 30;
    gender2= 'F';
    boolean loveCat = true;
    boolean result5 = age2>=30 &&(gender2=='M' ||loveCat==true);
    System.out.println(result5);

    // And Or (true And (false Or true))
    result5 = age2 >= 30 &&(gender2 =='M'||age >18);
    System.out.println(result5);

    boolean result6 = age2 >18 || age2 >= 30 && gender 

  }
}
