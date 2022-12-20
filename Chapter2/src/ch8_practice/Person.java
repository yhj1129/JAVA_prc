package ch8_practice;

public class Person {
	
	public String personName;
	public int personWeight;
	public int personHeight;
	public int personAge;
	public String personSex;
	
	public Person(String personName, int personWeight, int personHeight, int personAge, String personSex) {
		this.personName = personName;
		this.personWeight = personWeight;
		this.personHeight = personHeight;
		this.personAge = personAge;
		this.personSex = personSex;
		
	}
	
	public String showPersonInfo() {
		return "키가 " + personHeight + "이고 몸무게가 " + personWeight + "인 " + personSex + "이 있습니다. 이름은 " 
	+ personName + "이고 나이는 " + personAge + "입니다. ";
	}
}

