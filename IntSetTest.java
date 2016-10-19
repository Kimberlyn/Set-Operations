public class IntSetTest {

	//METHOD: MAIN
	public static void main(String[] args) {
		IntSet case1A = new IntSet();
		IntSet case1B = new IntSet();
		IntSet case2A = new IntSet();
                IntSet case2B = new IntSet();
		IntSet case3A = new IntSet();
                IntSet case3B = new IntSet();
		IntSet case4A = new IntSet();
                IntSet case4B = new IntSet();
		IntSet case5A = new IntSet();
                IntSet case5B = new IntSet();


		// Case 1:
		System.out.println("Case: 1");
		case1A.addElement(1);
		case1A.addElement(2);
		case1A.addElement(3);
		case1B.addElement(2);
                case1B.addElement(1);
                case1B.addElement(3);

		System.out.println("A: " + case1A);
                System.out.println("B: " + case1B);
                System.out.println("Is B a subset of A?: " + case1A.subsetOf(case1B));
                System.out.println("Is B equal to A?: " + case1A.isEqual(case1B));
                System.out.println("Intersection of A and B: " + case1A.intersection(case1B));
                System.out.println("Union of A and B: " + case1A.union(case1B));
                System.out.println("Complement of A and B: " + case1A.complement(case1B));
		System.out.println();

		// Case 2:
		System.out.println("Case: 2");
                case2A.addElement(1);
                case2B.addElement(1);
                case2B.addElement(2);

                System.out.println("A: " + case2A);
                System.out.println("B: " + case2B);
                System.out.println("Is B a subset of A?: " + case2A.subsetOf(case2B));
                System.out.println("Is B equal to A?: " + case2A.isEqual(case2B));
                System.out.println("Intersection of A and B: " + case2A.intersection(case2B));
                System.out.println("Union of A and B: " + case2A.union(case2B));
                System.out.println("Complement of A and B: " + case2A.complement(case2B));
		System.out.println();

		// Case 3:
                System.out.println("Case: 3");
                case3A.addElement(1);
                case3A.addElement(2);
                case3A.addElement(3);
                case3B.addElement(2);
                case3B.addElement(3);
                case3B.addElement(4);
		case3B.addElement(5);

                System.out.println("A: " + case3A);
                System.out.println("B: " + case3B);
                System.out.println("Is B a subset of A?: " + case3A.subsetOf(case3B));
                System.out.println("Is B equal to A?: " + case3A.isEqual(case3B));
                System.out.println("Intersection of A and B: " + case3A.intersection(case3B));
                System.out.println("Union of A and B: " + case3A.union(case3B));
                System.out.println("Complement of A and B: " + case3A.complement(case3B));
                System.out.println();

		// Case 4:
                System.out.println("Case: 4");
                case4A.addElement(1);
                case4B.addElement(2);
                case4B.addElement(3);

                System.out.println("A: " + case4A);
                System.out.println("B: " + case4B);
                System.out.println("Is B a subset of A?: " + case4A.subsetOf(case4B));
                System.out.println("Is B equal to A?: " + case4A.isEqual(case4B));
                System.out.println("Intersection of A and B: " + case4A.intersection(case4B));
                System.out.println("Union of A and B: " + case4A.union(case4B));
                System.out.println("Complement of A and B: " + case4A.complement(case4B));
                System.out.println();

		// Case 5:
                System.out.println("Case: 5");
                case5A.addElement(1);
                case5A.addElement(2);
                case5A.addElement(3);

                System.out.println("A: " + case5A);
                System.out.println("B: " + case5B);
                System.out.println("Is B a subset of A?: " + case5A.subsetOf(case5B));
                System.out.println("Is B equal to A?: " + case5A.isEqual(case5B));
                System.out.println("Intersection of A and B: " + case5A.intersection(case5B));
                System.out.println("Union of A and B: " + case5A.union(case5B));
                System.out.println("Complement of A and B: " + case5A.complement(case5B));
                System.out.println();


	}

}
