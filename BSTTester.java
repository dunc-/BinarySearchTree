/*
 * Place results of experiments here:
 * 
 * RANDOM ADD:
 * 
 * BinarySearchTree:
 * 
 * For inserting 1000 elements in 10 runs:
 * 
 * Average time : 7.464701999999999E-4 seconds
 * Average height: 21.9
 * Average size: 1000
 * 
 * For inserting 2000 elements in 10 runs:
 * 
 * Average time: 0.0010121286000000001 seconds
 * Average height: 23.7
 * Average size: 2000
 * 
 * For inserting 4000 elements in 10 runs:
 * 
 * Average time: 0.0016912002999999998 seconds
 * Average height: 26.2
 * Average size: 4000
 * 
 * For inserting 8000 elements in 10 runs:
 * 
 * Average time: 0.0027359593 seconds
 * Average height: 29.8
 * Average size: 8000
 * 
 * For inserting 16000 elements in 10 runs:
 * 
 * Average time: 0.0057816682 seconds
 * Average height: 32.5
 * Average size: 16000
 * 
 * For inserting 32000 elements in 10 runs:
 * 
 * Average time: 0.0128277806 seconds
 * Average height: 34.9
 * Average size: 32000
 * 
 * For inserting 64000 elements in 10 runs:
 * 
 * Average time: 0.0222856482 seconds
 * Average height: 38.5
 * Average size: 63999.1
 * 
 * For inserting 128000 elements in 10 runs:
 * 
 * Average time: 0.052506800900000004 seconds
 * Average height: 40.5
 * Average size: 127997.8
 * 
 * For inserting 256000 elements in 10 runs:
 * 
 * Average time: 0.15163374500000001 seconds
 * Average height: 43.1
 * Average size: 255992.4
 * 
 * For inserting 512000 elements in 10 runs:
 * 
 * Average time: 0.4361288505 seconds
 * Average height: 45.8
 * Average size: 511969.1
 * 
 * For inserting 1024000 elements in 10 runs:
 * 
 * Average time: 1.0436511556999999 seconds
 * Average height: 49.2
 * Average size: 1023880.1
 * 
 * The minimum height for a binary search tree where n items are inserted is log(n+1)-1
 * 
 * TreeSet:
 * 
 * For inserting 1000 elements in 10 runs: 0.0022348770999999997 seconds
 * For inserting 2000 elements in 10 runs: 0.0040948723999999995 seconds
 * For inserting 4000 elements in 10 runs: 0.006236007900000001 seconds
 * For inserting 8000 elements in 10 runs: 0.0096356428 seconds
 * For inserting 16000 elements in 10 runs: 0.0205381254 seconds
 * For inserting 32000 elements in 10 runs: 0.031685482599999995 seconds
 * For inserting 64000 elements in 10 runs: 0.08137806349999999 seconds
 * For inserting 128000 elements in 10 runs: 0.13112688109999998 seconds
 * For inserting 256000 elements in 10 runs: 0.3008366192 seconds
 * For inserting 512000 elements in 10 runs: 0.7234290235999998 seconds
 * For inserting 1024000 elements in 10 runs: 1.6987428256999997 seconds
 * 
 * The times between my BinarySearchTree class and the TreeSet class are similar.
 * 
 * SORTED ADD:
 * 
 * BinarySearchTree:
 * 
 * For inserting 1000 elements in 10 runs:
 * 
 * Average time: 0.0050148418 seconds
 * Average height: 999.0
 * Average size: 1000.0
 * 
 * For inserting 2000 elements in 10 runs:
 * 
 * Average time: 0.0156231838 seconds
 * Average height: 1999.0
 * Average size: 2000.0
 * 
 * For inserting 4000 elements in 10 runs:
 * 
 * Average time: 0.06882214279999999 seconds
 * Average height: 3999.0
 * Average size: 4000.0
 * 
 * For inserting 8000 elements in 10 runs:
 * 
 * Average time: 0.29899775 seconds
 * Average height: 7999.0
 * Average size: 8000.0
 * 
 * For inserting 16000 elements in 10 runs:
 * 
 * Average time: 1.3036659354999998 seconds
 * Average height: 15999.0
 * Average size: 16000.0
 * 
 * For inserting 32000 elements in 10 runs:
 * 
 * Average time: 5.684139333433 seconds
 * Average height: 31999.0
 * Average size: 32000.0
 * 
 * For inserting 64000 elements in 10 runs:
 * 
 * Average time: 24.78352703 seconds
 * Average height: 63999.0
 * Average size: 64000.0
 * 
 * 4.3601195510668551853651072625128
 * 
 * Estimate for inserting 128000 elements in 10 runs: 108.05914078 seconds
 * Estimate for inserting 256000 elements in 10 runs: 471.15077238 seconds
 * Estimate for inserting 512000 elements in 10 runs: 2054.27369418 seconds
 * 
 * TreeSet:
 * 
 * For inserting 1000 elements in 10 runs: 0.0012064976 seconds
 * For inserting 2000 elements in 10 runs: 0.0018572584999999998 seconds
 * For inserting 4000 elements in 10 runs: 0.0023712130999999997 seconds
 * For inserting 8000 elements in 10 runs: 0.0037927348999999997 seconds
 * For inserting 16000 elements in 10 runs: 0.005603037000000001 seconds
 * For inserting 32000 elements in 10 runs: 0.009753033900000001 seconds
 * For inserting 64000 elements in 10 runs: 0.0196369304 seconds
 * For inserting 128000 elements in 10 runs: 0.03936576359999999 seconds
 * For inserting 256000 elements in 10 runs: 0.060893352 seconds
 * For inserting 512000 elements in 10 runs: 0.1422138537 seconds
 * 
 * In comparison, the TreeSet is much faster than the BinarySearchTree.
 * 
 * This is because, when added in order the BinarySearch tree requires the creation
 * of a new node each time.
 * 
 */

/**
 * Test class for binary search tree
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class BSTTester {

	public static void main(String[] args) {
		BinarySearchTree<String> t = new BinarySearchTree<String>();

		// Test 1 - constructor & size
		if (t.size() == 0)
			System.out.println("Passed test 1 - constructor & size");
		else
			System.out.println("FAILED test 1 - constructo & size");

		// Test 2 - constructor & remove
		if (t.remove("hello") != false)
			System.out.println("FAILED test 2 - constructor & remove");
		else
			System.out.println("Passed test 2 - constructor & remove");

		// Test 3 - add & isPresent
		t.add("hello");
		if (t.isPresent("hello"))
			System.out.println("Passed test 3 - add & isPresent");
		else
			System.out.println("FAILED test 3 - add & isPresent");

		// Test 4 - add & isPresent
		t.add("world");
		if (t.isPresent("world"))
			System.out.println("Passed test 4 - add & isPresent");
		else
			System.out.println("FAILED test 4 - add & isPresent");

		// Test 5 - remove & isPresent
		t.remove("hello");
		if (t.isPresent("hello"))
			System.out.println("FAILED test 5 - remove & isPresent");
		else
			System.out.println("Passed test 5 - remove & isPresent");

		// Test 6 - remove & isPresent
		t.remove("world");
		if (t.isPresent("world"))
			System.out.println("FAILED test 6 - remove & isPresent");
		else
			System.out.println("Passed test 6 - remove & isPresent");

		// Test 7 - size
		if (t.size() == 0)
			System.out.println("Passed test 7 - size");
		else
			System.out.println("FAILED test 7 - size");

		// Test 8 - size
		t.add("hello");
		if (t.size() == 1)
			System.out.println("Passed test 8 - size");
		else
			System.out.println("FAILED test 8 - size");

		// Test 9 - height
		if (t.height() == 0)
			System.out.println("Passed test 9 - height");
		else
			System.out.println("FAILED test 9 - height");

		// Test 10 - height
		t.add("world");
		if (t.height() == 1)
			System.out.println("Passed test 10 - height");
		else
			System.out.println("FAILED test 10 - height");

		// Test 11 - getAll
		ArrayList<String> result = (ArrayList<String>) t.getAll();
		ArrayList<String> expected = new ArrayList<String>();
		expected.add("hello");
		expected.add("world");
		if (result.equals(expected))
			System.out.println("Passed test 11 - getAll");
		else
			System.out.println("FAILED test 11 - getAll");

		// Test 12 - getAll
		t.add("program");
		result = (ArrayList<String>) t.getAll();
		expected.remove("world");
		expected.add("program");
		expected.add("world");
		if (result.equals(expected))
			System.out.println("Passed test 12 - getAll");
		else
			System.out.println("FAILED test 12 - getAll");

		// Test 13 - max
		String result1 = t.max();
		if (result1.equals("world"))
			System.out.println("Passed test 13 - max");
		else
			System.out.println("FAILED test 13 - max");

		// Test 14 - max
		t.remove("world");
		result1 = t.max();
		if (result1.equals("program"))
			System.out.println("Passed test 14 - max");
		else
			System.out.println("FAILED test 14 - max");

		// Test 15 - min
		result1 = t.min();
		if (result1.equals("hello"))
			System.out.println("Passed test 15 - min");
		else
			System.out.println("FAILED test 15 - min");

		// Test 16 - min
		t.add("aaa");
		result1 = t.min();
		if (result1.equals("aaa"))
			System.out.println("Passed test 16 - min");
		else
			System.out.println("FAILED test 16 - min");

		// Test 17 - iterativeAdd
		t.iterativeAdd("world");
		if (t.isPresent("world"))
			System.out.println("Passed test 17 - iterativeAdd");
		else
			System.out.println("FAILED test 17 - iterativeAdd");

		// Test 18 - iterativeAdd
		t.iterativeAdd("bbb");
		if (t.isPresent("bbb"))
			System.out.println("Passed test 18 - iterativeAdd");
		else
			System.out.println("FAILED test 18 - iterativeAdd");

		// Test 19 - get
		if (t.get(0).equals("aaa"))
			System.out.println("Passed test 19 - get");
		else
			System.out.println("FAILED test 19 - get");

		// Test 20 - get
		if (t.get(1).equals("bbb"))
			System.out.println("Passed test 20 - get");
		else
			System.out.println("FAILED test 20 - get");

		// Test 21 - getAllLessThan
		result = (ArrayList<String>) t.getAllLessThan("bbb");
		expected.clear();
		expected.add("aaa");
		if (result.equals(expected))
			System.out.println("Passed test 21 - getAllLessThan");
		else
			System.out.println("FAILED test 21 - getAllLessThan");

		// Test 22 - getAllLessThan
		result = (ArrayList<String>) t.getAllLessThan("world");
		expected.add("bbb");
		expected.add("hello");
		expected.add("program");
		if (result.equals(expected))
			System.out.println("Passed test 22 - getAllLessThan");
		else
			System.out.println("FAILED test 22 - getAllLessThan");

		// Test 23 - getAllGreaterThan
		result = (ArrayList<String>) t.getAllGreaterThan("program");
		expected.clear();
		expected.add("world");
		if (result.equals(expected))
			System.out.println("Passed test 23 - getAllLessThan");
		else
			System.out.println("FAILED test 23 - getAllLessThan");

		// Test 24 - getAllGreaterThan
		result = (ArrayList<String>) t.getAllGreaterThan("world");
		expected.clear();
		if (result.equals(expected))
			System.out.println("Passed test 24 - getAllLessThan");
		else
			System.out.println("FAILED test 24 - getAllLessThan");

		// Test 25 - numNodesAtDepth
		int num = t.numNodesAtDepth(0);
		if (num == 1)
			System.out.println("Passed test 25 - numNodesAtDepth");
		else
			System.out.println("FAILED test 25 - numNodesAtDepth");

		// Test 26 - numNodesAtDepth
		num = t.numNodesAtDepth(1);
		if (num == 2)
			System.out.println("Passed test 26 - numNodesAtDepth");
		else
			System.out.println("FAILED test 26 - numNodesAtDepth");

//		Stopwatch s = new Stopwatch();
//		int n = 512000;
//		double height = 0;
//		double size = 0;
//		double time = 0;
//		int[] insert = new int[n];
//		for (int i=1; i<=n; i++)
//			insert[i-1] = i;
//		TreeSet<Integer> b = new TreeSet<Integer>();
//		for (int k=0; k<10; k++) {
//			s.start();
//			for(int i=0; i<n; i++) {
//				b.add(insert[i]); 
//			}
//			s.stop();
//			time += s.time();
//        	height += b.height();
//        	size += b.size();
//			b = new TreeSet<Integer>();
//		}
//		s.stop();
//		System.out.println(time/10);
//      System.out.println(height/10);
//      System.out.println(size/10);
	}
}
