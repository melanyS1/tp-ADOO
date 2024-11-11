import TPO_ADO.src.entidades.*;

public class Main {

	public static void main(String[] args) {
		
		TeatroSingleton singleton = TeatroSingleton.getInstance();
        TeatroSingleton anotherSingleton = TeatroSingleton.getInstance();
        System.out.println(singleton);
        System.out.println(anotherSingleton);

	}

}