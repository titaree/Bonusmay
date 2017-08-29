
public abstract class Employee {
	BonusCalculator bonusCalculator;
	void setC(int n){

		System.out.println("Salary : "+n+" Bonus "+(bonusCalculator.computeBonus(n)));
	}
}
