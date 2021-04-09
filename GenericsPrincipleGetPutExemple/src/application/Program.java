package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);

		List<? extends Number> list = intList;

		Number x = list.get(0);

//		list.add(20); // erro de compilacao - o compilados não sabe qual tipo de number queremos
						// utilizar pois namber é um tip generico

		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
//		Number x = myNums.get(0); // erro de compilacao - Ao tentar obter o valor ele pode não ser um tipo Number (pode ser algum tipo de sua super classe -> Object e por sua vez String, Boolean)
	}
}