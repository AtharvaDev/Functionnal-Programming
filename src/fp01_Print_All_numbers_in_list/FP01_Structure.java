package fp01_Print_All_numbers_in_list;

import java.util.List;

public class FP01_Structure {

//	print All Numbers In the List in functional programming way
	public static void main(String[] args) {
		System.out.println("Functional Programming: ");
		printAllNumbersInListFunctional(List.of(12, 9, 12, 7, 8, 14, 8, 1, 2, 3));
	}
	
	private static void print(int num) {
		System.out.println(num);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
//		What to do?
//		Convert to stream
		
		numbers.stream().forEach(FP01_Structure::print);

//		numbers.stream().forEach(FP01_Structure::print);
	}

}
