package atmproject;

import java.util.HashMap;
import java.util.Map.Entry;
import java.io.IOException;
import java.text.DecimalFormat;
//import java.lang;//
import java.util.*;

public class Optionmenu extends Account {

	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##.00");

  HashMap<Integer,Integer> data = new HashMap<Integer ,Integer>();

 public void getlogin() throws IOException {
 int x=1;
 do {
      try 
      {
    	  
            data.put(12345 ,123);
            data.put(67890 ,678);
            data.put(92901 ,929);
         System.out.println( "wellcome to ATM \n");
        System.out.println("enter your Identity number");
              setCustomerNumber(menuInput.nextInt());
        System.out.println("enter your pin number");
               setPinNumber(menuInput.nextInt());

       }
catch (Exception e)
{
System.out.println("\n" + "Invalid  Charecters .enter only  numbers");
x=2; 
}
      int i=0;
for ( Entry<Integer,Integer > entry : data.entrySet())
{
   if(entry.getKey() == getCustomerNumber() && entry.getValue()==getPinNumber()) {
         getAccountType();
  ++i;
   }
}
  if(i==1)
	  continue;
  else {
	   //if(data.size()==i)
	   System.out.println(" Invalid Identity or pin number\n");
  }
   
}while(x==1);
}

public void getAccountType() {
    	System.out.println("select the account you want to  access");
    	System.out.println("Type 1- Current account");
    	System.out.println("Type 2- Savings account");
	System.out.println("Type 3- Exit");
	System.out.println("choice :  ");
	
	
      int select = menuInput.nextInt();
   switch (select) {
    case 1: getCurrent();
 		break;
    case 2: getSavings();
	        break;
    case 3: System.out.println(" \n Thank you for visiting this ATM, bye") ;
	      break;
  default :System.out.println("Invalid choice \n");
              getAccountType() ;
	}
	}
     public void getCurrent() {
         System.out.println("Current Account");
	System.out.println("Type 1- View balance ");
	System.out.println("Type 2- withdraw money");
	System.out.println("Type 3- Deposit money");
	System.out.println("Type 4- exit");
	System.out.println("enter your choice : ");
        int select = menuInput.nextInt();
          switch(select) {
            case 1: System.out.println("Checking account Balance:"+moneyFormat.format(getCurrentBalance())+"\n");
			getAccountType(); 
			break;
            case 2:    getCurrentWithdrawInput();
			getAccountType();
			break;
	    case 3:   getCurrentDepositInput();
			getAccountType();
			break;
	    case 4: System.out.println("Thank you for visiting ATM , bye");
			break;
	   default: System.out.println("Invalid choice");
                     getCurrent() ;

}             	

}
 	public void getSavings() {
    		System.out.println("Savings Account");
	System.out.println("Type 1- View balance ");
	System.out.println("Type 2- withdraw money");
	System.out.println("Type 3- Deposit money");
	System.out.println("Type 4- exit");
	System.out.println("enter your choice : ");
        int select = menuInput.nextInt();
          switch(select) {
	case 1: System.out.println("Savings account Balance:"+moneyFormat.format(getSavingsBalance())+"\n");
			getAccountType(); 
			break;
            case 2:    getSavingsWithdrawInput();
			getAccountType();
			break;
	        case 3:   getSavingsDepositInput();
			getAccountType();
			break;
	    case 4: System.out.println("Thank you for visiting ATM , bye");
			break;
	   default: System.out.println("Invalid choice");
                     getSavings() ;
	}
	}
    }