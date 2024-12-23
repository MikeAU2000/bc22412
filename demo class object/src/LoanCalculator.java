import java.math.BigDecimal;

public class LoanCalculator {
  private double principle;
  private double annualInterestRate;
  private int numOfYears;

  public LoanCalculator(double principle, double annualInterestRate, int numOfYears){
    this.principle= principle;
    this.annualInterestRate= annualInterestRate;
    this.numOfYears= numOfYears;
  }

  public double getPrinciple(){
    return this.principle;
  }

  public double getAnnualInterestRate(){
    return this.annualInterestRate;
  }

  public int getNumOfYears(){
    return this.numOfYears;
  }

  public void setPrinciple(double principle){
    this.principle= principle;
  }

  public void setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate= annualInterestRate;
  }

  public void setNumOfYears(int numOfYears){
    this.numOfYears= numOfYears;
  }

  public static double totallInterestAfterYears2(double principle, double annualInterestRate, int numOfYears){
    double totallInterestAfterYears2=     BigDecimal.valueOf(principle).multiply(BigDecimal.valueOf(annualInterestRate)).multiply(BigDecimal.valueOf( numOfYears)).doubleValue();
    // -BigDecimal.valueOf(principle).multiply(BigDecimal.valueOf(numOfYears)).doubleValue()
    return totallInterestAfterYears2;
  }
  public double totallInterestAfterYears2(){
    double totallInterestAfterYears2=BigDecimal.valueOf(this.principle).multiply(BigDecimal.valueOf(Math.pow(1+this.annualInterestRate/100.0,this.numOfYears))).subtract(BigDecimal.valueOf(this.principle)).doubleValue();
    return totallInterestAfterYears2;
  }

  public static void main(String[] args) {
    LoanCalculator l1= new LoanCalculator(20000.0, 5, 2);
    System.out.println(l1.totallInterestAfterYears2());
    System.out.println(totallInterestAfterYears2(20000.0, 0.05, 2));
  }

}
