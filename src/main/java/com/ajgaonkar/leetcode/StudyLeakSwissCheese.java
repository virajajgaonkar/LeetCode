package com.ajgaonkar.leetcode;

import java.util.ArrayList;
import java.util.List;

public class StudyLeakSwissCheese {
	//Can't have swiss cheese without some holes
	public StudyLeakFactory.Leak[] myHoles;

	public StudyLeakSwissCheese()
	{//Now, let's get the holes and store them.
		myHoles = new StudyLeakFactory.Leak[1000];

		for (int i = 0; i<1000; i++)
		{//WOW! I don't even have to create a Factory...
			// This is SOOOO much prettier....
			myHoles[i] = new StudyLeakFactory().createLeak();
		}
	}

	public static void main(String[] args){
		List<StudyLeakSwissCheese> lst = new ArrayList<>();
		for(int i=0; i < 100; i++){
			lst.add(new StudyLeakSwissCheese());
		}
	}
}
