import java.util.ArrayList;
import java.util.Scanner;

public class MyClass {
	private int number;
	ArrayList<Integer> numberList;

	MyClass(){

	}
	MyClass(int number){
		this.number = number;
		this.numberList = new ArrayList<>();
	}

	public void addNumber(int number){
		this.number = this.number + number;
		numberList.add(number);
	}
	public int getNumber(){

		return this.number;
	}
	public ArrayList<Integer> getList(){

		return this.numberList;
	}

}
