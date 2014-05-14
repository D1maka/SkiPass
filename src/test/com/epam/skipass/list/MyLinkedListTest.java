package test.com.epam.skipass.list;
import static org.junit.Assert.*;
import main.com.epam.skipass.list.MyLinkedList;

import org.junit.Test;


public class MyLinkedListTest {

	@Test
	public void testAddItemSizeEqualsOne() {
		MyLinkedList<Integer> intList = new MyLinkedList<>();
		intList.add(new Integer(5));
		int neededSize = 1;
		assertEquals(neededSize, intList.getSize());
	}

	@Test
	public void testEmpyListIsEmptyTrue() {
		MyLinkedList<Integer> intList = new MyLinkedList<>();
		
		assertTrue(intList.isEmpty());
	}
	
	@Test
	public void testEmpyListSizeEqualsZero() {
		MyLinkedList<Integer> intList = new MyLinkedList<>();
		int size = 0;
		
		assertEquals(size, intList.getSize());
	}
}
