//21CE097 Manav Patel 
/*Personal Loan Eligibility Criteria for Salaried Applicant is as follows:
Eligible Age Group - 21 years to 60 years
Minimum Net Monthly Income - Rs. 15,000
Minimum Total Work Experience - 1 year
Citizenship – Indian
Create a class AccountHolder to store above given information entered by a user. Create 5 objects of AccountHolder class and store them in an ArrayList. Display names of account holders , who are eligible to get a loan based on given criteria.
*/
import java.util.*;

class AccountHolder {
    int age, monthlyIncome, workExperience;
    String name, citizenship;

    AccountHolder(int age, int monthlyIncome, int workExperience, String name, String citizenship) {
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.workExperience = workExperience;
        this.name = name;
        this.citizenship = citizenship;
    }

    boolean checkEligibility() {
        if ((age >= 21 && age <= 60) && (monthlyIncome >= 15000) && (workExperience >= 1)
                && (citizenship == "Indian")) {
            return true;
        } else {
            return false;
        }
    }
}

public class prac3_7 {
    public static void main(String[] args) {
        AccountHolder a1 = new AccountHolder(17, 16000, 1, "AccountHolder0", "Indian");
        AccountHolder a2 = new AccountHolder(22, 16000, 2, "AccountHolder1", "Indian");
        AccountHolder a3 = new AccountHolder(21, 20000, 1, "AccountHolder2", "Canadian");
        AccountHolder a4 = new AccountHolder(25, 25000, 0, "AccountHolder3", "Indian");
        AccountHolder a5 = new AccountHolder(65, 20000, 1, "AccountHolder4", "Indian");
        ArrayList<AccountHolder> arrayList = new ArrayList<>();
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        arrayList.add(a4);
        arrayList.add(a5);
        for (int i = 0; i < 5; i++) {
            if (arrayList.get(i).checkEligibility()) {
                System.out.println("AccountHolder" + i + " is eligible for personal loan");
            } else {
                System.out.println("AccountHolder" + i + " is not eligible for personal loan");
            }
        }
        
    }
}