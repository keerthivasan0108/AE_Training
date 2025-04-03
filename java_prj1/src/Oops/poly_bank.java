package Oops;

public class poly_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b = new citi();
		System.out.println("The ROI of citi : "+b.getRateOfInterest());
		b = new bob();
		System.out.println("The ROI of bob : "+b.getRateOfInterest());
		b = new canara();
		System.out.println("The ROI of canara : "+b.getRateOfInterest());
	}

}

class bank{
	float getRateOfInterest() {
		return 8.5f;
	}
}

class bob extends bank{
	@Override
	float getRateOfInterest() {
		return 8f;
	}
}
class canara extends bank{
	@Override
	float getRateOfInterest() {
		return 7.5f;
	}
}
class citi extends bank{
	@Override
	float getRateOfInterest() {
		return 6.5f;
	}
}