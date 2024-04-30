package view;

import br.edu.fateczl.list.List;
import util.Sort;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Integer> list = new List<>();

		list.addLast(10);
		list.addLast(5);
		list.addLast(8);
		list.addLast(1);
		list.addLast(9);
		list.addLast(2);
		list.addLast(4);
		list.addLast(7);
		list.addLast(3);
		list.addLast(6);
		
		int size = list.size();
		
		for(int i = 0; i < size; i++) {
			System.out.print(list.get(i) + " ");
		}
		
		Sort.bubbleSort(list);
		
		System.out.println();
		for(int i = 0; i < size; i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}

}
