package com.ajgaonkar.leetcode;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LC127_Word_LadderTest {
	LC127_Word_Ladder test = new LC127_Word_Ladder();

	@Test
	public void test1(){
		String beginWord = "hit";
		String endWord = "cog";
		List<String> dict = Arrays.asList("hot","dot","dog","lot","log","cog");
		assertEquals(5, test.ladderLength(beginWord, endWord, dict));
	}

	@Test
	public void test2(){
		String beginWord = "hit";
		String endWord = "cog";
		List<String> dict = Arrays.asList("hot","dot","dog","lot","log");
		assertEquals(0, test.ladderLength(beginWord, endWord, dict));
	}

	@Test
	public void test3(){
		String beginWord = "a";
		String endWord = "c";
		List<String> dict = Arrays.asList("a","b","c");
		assertEquals(2, test.ladderLength(beginWord, endWord, dict));
	}

	@Test
	public void test4(){
		String beginWord = "hot";
		String endWord = "dog";
		List<String> dict = Arrays.asList("hot","dog");
		assertEquals(0, test.ladderLength(beginWord, endWord, dict));
	}

	@Test
	public void test5(){
		String beginWord = "ta";
		String endWord = "if";
		List<String> dict = Arrays.asList("ts","sc","ph","ca","jr","hf","to","if","ha","is","io","cf","ta");
		assertEquals(4, test.ladderLength(beginWord, endWord, dict));
	}

	@Test
	public void test6(){
		String beginWord = "qa";
		String endWord = "sq";
		List<String> dict = Arrays.asList("si","go","se","cm","so","ph","mt","db","mb","sb","kr","ln","tm","le","av",
				"sm","ar","ci","ca","br","ti","ba","to","ra","fa","yo","ow","sn","ya","cr","po","fe","ho","ma","re","or",
				"rn","au","ur","rh","sr","tc","lt","lo","as","fr","nb","yb","if","pb","ge","th","pm","rb","sh","co","ga",
				"li","ha","hz","no","bi","di","hi","qa","pi","os","uh","wm","an","me","mo","na","la","st","er","sc","ne",
				"mn","mi","am","ex","pt","io","be","fm","ta","tb","ni","mr","pa","he","lr","sq","ye");
		assertEquals(5, test.ladderLength(beginWord, endWord, dict));
	}

}