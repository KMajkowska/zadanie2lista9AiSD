import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("UWAGA: PRGRAM TESTOWY, DANE S� TYPU FLOAT");
		Main main = new Main();
		PQueueBST<Float> queue = new PQueueBST();
		main.program(queue);
	}
	
	public void program(PQueueBST<Float> queue)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Co chcesz zrobi�? Wpisz prosze odpowiedni numer z wy�wietlanego menu:");
		char odp;
		int choice;
		do {
			menu();
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
			{
				char tmp;
				do {
					System.out.println("Podaj element do wstawienia");
					float elem = scan.nextFloat();
					queue.put(elem);
					System.out.println("Chcesz dalej dodawa� elementy? [t/n]");
					tmp = scan.next().charAt(0);
				}while(tmp == 't');
				break;
			}
			case 2:
			{
				char tmp;
				do {
					queue.deleteFirst();
					System.out.println("Chcesz dalej usuwa� elementy?[t/n]");
					tmp = scan.next().charAt(0);
				}while(tmp == 't');
				break;
			}
			case 3:
			{
				queue.Reset();
				break;
			}
			case 4:
			{
				float value = queue.getFirst();
				System.out.println(value);
				break;
			}
			case 5:
				queue.inorder();
				break;
			}
			System.out.println("Czy chcesz wykonac jeszcze jakies operacje na kolejce?[t/n]");
			odp = scan.next().charAt(0);
		}while(odp == 't');
	}
	
	public void menu()
	{
		System.out.println("Dost�pne operacje:");
		System.out.println("1.Dodaj element kolejki");
		System.out.println("2.Pobierz i usu� element z kolejki");
		System.out.println("3.Wyczy�� kolejk�");
		System.out.println("4.Pobierz pierwszy element z kolejki (bez usuwania)");
		System.out.println("5.(Nieprzewidziane dla kolejki, cel testowy) Wy�wietl elementy kolejki w kolejno�ci rosn�cej");
	}

}
