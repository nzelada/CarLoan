public class CarLoan {
  int carLoan;
  int loanLength;
  int interestRate;
  int downPayment;

  public CarLoan(int loan, int length, int interest, int down){
    carLoan = loan;
    loanLength = length;
    interestRate = interest;
    downPayment = down;
  }
  public void find(){
    if (loanLength <= 0 || interestRate <= 0){
      System.out.println("Error! You must take out a valid car loan.\n");
    }
    else if (downPayment >= carLoan){
      System.out.println("The car can be paid in full.\n");
    }
    else{
        payment();
    }
  }
public void payment(){
  int remainingBalance;
  remainingBalance = carLoan - downPayment;
  int months = loanLength * 12;
  int monthlyBalance = remainingBalance / months;
  int interest = (monthlyBalance *interestRate) / 100;
  int monthlyPayment = monthlyBalance + interest;
  System.out.println(monthlyPayment+"\n");
}

public static void main(String[] args) {
  CarLoan car = new CarLoan(10000,3,5,2000);
  car.find();
  CarLoan car2 = new CarLoan(0,3,5,2000);
  car2.find();
  CarLoan car3 = new CarLoan(10000,3,0,2000);
  car3.find();
	}
}