package com.ajgaonkar.leetcode;

public class StudyInnerClasses {
	private static int outerStaticField = 100;
	private int outerNonStaticField = 100;

	public static class PubStatic{
		private final int pubStaticValue;

		public PubStatic(int pubStaticValue) {
			this.pubStaticValue = pubStaticValue;
		}

		public int psNSM(){
			return pubStaticValue;
		}

		public int nsFn(){
			//return outerStaticField + outerNonStaticField + pubStaticValue
			return outerStaticField + pubStaticValue;
		}
	}


	public class PubNonStatic{
		private final int pubNonStaticValue;

		public PubNonStatic(int pubNonStaticValue) {
			this.pubNonStaticValue = pubNonStaticValue;
		}

		public int psNSM(){
			return pubNonStaticValue;
		}

		public int nsFn(){
			return outerStaticField + outerNonStaticField + pubNonStaticValue;
		}

	}

	public void test(){
		PubStatic pubStatic1 = new PubStatic(1);
		PubNonStatic ns1 = new PubNonStatic(1);
	}

	public static void testStatic(){
		PubStatic pubStatic1 = new PubStatic(1);
		StudyInnerClasses outer1 = new StudyInnerClasses();
		PubNonStatic ns1 = outer1.new PubNonStatic(1);
	}

	public static void main(String [] args){

	}
}
