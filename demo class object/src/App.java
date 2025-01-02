public class App {
    public static String multiply(String num1, String num2) {
        char[] num1Arr=num1.toCharArray();
        char[] num2Arr=num2.toCharArray();

        int numInt1=0;
        int numInt2=0;
        String str="";

        for(int i=0;i<num1Arr.length;i++){
            int newNum=num1Arr[num1Arr.length-1-i]-'0'*
            (int)Math.pow(10,i);;
            numInt1+=newNum;
            System.out.println(num1Arr[num1Arr.length-1-i]-'0'*
            (int)Math.pow(10,i));
            System.out.println(i);
            System.out.println(num1Arr[num1Arr.length-1-i]-'0');
            System.out.println((int)Math.pow(10,i));
        }

        for(int i=0;i<num2Arr.length;i++){
            numInt2+=num2Arr[num2Arr.length-1-i]-'0'*
            (int)Math.pow(10,i);
        }

        int result= numInt1*numInt2;
        System.out.println(result);
        str+=result;

        return str;
        
        
    }

    public static void main(String[] args) {
        String num1= "123";
        String num2= "456";
        String n= App.multiply(num1, num2);
        //System.out.println(n);
    }
}
