package fp01_Print_All_numbers_in_list;

import java.util.List;

public class FP01_Structure {

//	print All Numbers In the List in normal way
	public static void main(String[] args) {

		printAllNumbersInList(List.of(12, 9, 12, 7, 8, 14, 8, 1, 2, 3));
	}

	private static void printAllNumbersInList(List<Integer> numbers) {
		for (Integer integer : numbers) {
			System.out.println(integer);
		}	
	}

}
