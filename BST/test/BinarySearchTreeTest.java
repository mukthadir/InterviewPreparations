import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

	BinarySearchTree binarySearchTree;
	
	@Before
	public void setUp() throws Exception {
		binarySearchTree = new BinarySearchTree();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsEmpty() {
		Boolean expectedResult = true;
		Boolean actualResult;
		actualResult = binarySearchTree.isEmpty();
		assertEquals(expectedResult, actualResult);
		
		binarySearchTree.insert(5);
		actualResult = binarySearchTree.isEmpty();
		assertEquals(!expectedResult, actualResult);
		
	}

	@Test
	public void testPostOrderTraversal() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testInOrderTraversal() {
		fail("Not yet implemented");
	}

	@Test
	public void testPreOrderTraversal() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearch() {
		fail("Not yet implemented");
	}

	@Test
	public void testCountNodes() {
		fail("Not yet implemented");
	}

	@Test
	public void testLargest() {
		fail("Not yet implemented");
	}

	@Test
	public void testSmallest() {
		fail("Not yet implemented");
	}
}
