package com.ajgaonkar.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.mockito.Matchers.*;

import static org.junit.Assert.*;

public class LC341_Flatten_Nested_List_IteratorTest {
	@Mock
	private LC341_Flatten_Nested_List_Iterator.NestedInteger n1;
	@Mock
	private LC341_Flatten_Nested_List_Iterator.NestedInteger n2;
	@Mock
	private LC341_Flatten_Nested_List_Iterator.NestedInteger n3;
	@Mock
	private LC341_Flatten_Nested_List_Iterator.NestedInteger n4;
	@Mock
	private LC341_Flatten_Nested_List_Iterator.NestedInteger n5;
	@Mock
	private LC341_Flatten_Nested_List_Iterator.NestedInteger n6;
	@Mock
	private LC341_Flatten_Nested_List_Iterator.NestedInteger n7;
	@Mock
	private LC341_Flatten_Nested_List_Iterator.NestedInteger n8;

	@Mock
	private Iterator<LC341_Flatten_Nested_List_Iterator.NestedInteger> i1;
	@Mock
	private Iterator<LC341_Flatten_Nested_List_Iterator.NestedInteger> i2;
	@Mock
	private Iterator<LC341_Flatten_Nested_List_Iterator.NestedInteger> i3;

	@Before
	public void init(){
		MockitoAnnotations.initMocks(this);
		when(n1.isInteger()).thenReturn(false);
		when(n1.getList()).thenReturn(Arrays.asList(n2, n3, n4));

		when(n2.isInteger()).thenReturn(false);
		when(n2.getList()).thenReturn(Arrays.asList(n5, n6));

		when(n3.isInteger()).thenReturn(true);
		when(n3.getInteger()).thenReturn(2);

		when(n4.isInteger()).thenReturn(false);
		when(n4.getList()).thenReturn(Arrays.asList(n7, n8));

		when(n5.isInteger()).thenReturn(true);
		when(n5.getInteger()).thenReturn(1);

		when(n6.isInteger()).thenReturn(true);
		when(n6.getInteger()).thenReturn(1);

		when(n7.isInteger()).thenReturn(true);
		when(n7.getInteger()).thenReturn(1);

		when(n8.isInteger()).thenReturn(true);
		when(n8.getInteger()).thenReturn(1);
	}

	@Test
	public void test(){
		List<Integer> expected = Arrays.asList(1,1,2,1,1);
		LC341_Flatten_Nested_List_Iterator test = new LC341_Flatten_Nested_List_Iterator(Arrays.asList(n2, n3, n4));
		for(int i=0; i< 5; i++){
			assertTrue(test.hasNext());
			assertTrue(test.hasNext());
			assertEquals(expected.get(i), test.next());
		}
		assertFalse(test.hasNext());
	}



}