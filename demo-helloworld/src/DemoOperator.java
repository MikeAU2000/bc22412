public class DemoOperator{
  public static void main(String []args){
    //+1
    int x =3;
    x = x +1 ;
    x++;
    ++x;
    x +=1;
    System.out.println(x);//7

    // -1

    int y = 10;
    y = y-1;
    y--;
    --y;
    y -= 1;
    System.out.println(y);

    int b = 20;
    b = b +2;
    b +=2 ;
    System.out.println(b);

    //-2
    int c = 100;
    c = c -2;
    c -= 2;
    System.out.println(c);

    int m = 5;
    m = m *2;
    m*= 2;
    System.out.println(m);

    int u = 4;
    u = u/2;
    u/=2;
    System.out.println(u);

    int reminder = 10%3;
    System.out.println(reminder);

    // x++, ++x
    int a = 8;
    int result = ++a +3;
    System.out.println(result);

    int a1 = 8;
    int result2 = a1++ + 3;
    System.out.println(result2);

    int q= 8;
    int result3 = q++ + 3 +3;
    int result4 = q;
    System.out.println(result3);
    System.out.println(result4);

    //step 1: q+3(8+3)
    //step 2: q become 9
    //step 3: assign 11 to result2

    String s = "hello";
    s+="!";
    System.out.println(s);

    s+='a';
    System.out.println(s);

    int x10= 5;
    int y10= 10;
    int z10= x10 +=3 *y10;
    System.out.println(z10);

    int x11 = 3;
    int y11 = (x11++ +3)* x11++;
    System.out.println(y11);

    
  }
}