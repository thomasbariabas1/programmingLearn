import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


    	MyClass classe = new MyClass(10);
		Random r = new Random();
//		for(int i=0;i<=10;i++){
//
//			int randomint = r.nextInt(10);
//
//			classe.addNumber(randomint);
//		}
		while(classe.getNumber()<100){
			int randomint = r.nextInt(20);

			classe.addNumber(randomint);
		}

		ArrayList<Integer> list = classe.getList();
    	int number = classe.getNumber();
        System.out.println("number "+number);
        System.out.println("list "+list);
    }
}
