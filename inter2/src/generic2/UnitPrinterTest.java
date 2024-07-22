package generic2;

public class UnitPrinterTest {
	public static void main(String[] args) {
		Shuttle<Marine> shuttle1 = new Shuttle<>();
		shuttle1.in(new Marine("마린", 40));

		Shuttle<Zealot> shuttle2 = new Shuttle<>();
		shuttle2.in(new Zealot("질럿", 100));

		Shuttle<Zergling> shuttle3 = new Shuttle<>();
		shuttle3.in(new Zergling("저글링", 35));

		UnitPrinter.printV1(shuttle1);
		UnitPrinter.printV2(shuttle1);
	}
}
