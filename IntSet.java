/*
contains both the data and the related operations.
*/

public class IntSet {

	private Node head;
	private Node tail;
	private int size;

	// METHOD: constructor
	public IntSet() {
		size = 0;
	}

	// METHOD: size
	// returns an integer equal to the number of distinct nodes in the Set.
	public int size() {
		return size;
	}

	// METHOD: indexOf
	// returns the index of the inputted value
	public int indexOf(int value) {
		int index = 0;
		Node cursor = head;
		while(cursor != null) {
			if (cursor.getValue() == value) {
				return index;
			}
			cursor = cursor.getNext();
			index++;
		}
		return -1;
	}

	// METHOD: get
	// returns the value of the inputted index
	public int get(int index) {
		if (index < size()) {
			Node cursor = head;
			for(int i = 0 ; i < index; i++) {
				cursor = cursor.getNext();
			}
			return cursor.getValue();
		} else {
			throw new RuntimeException("Index out of bound.");
		}

	}

	// METHOD: toString
	// ​returns a string to represent the Set in the format of “[3,4,6,8]”
	public String toString() {
		String res = "[";
		Node cursor = head;
		while(cursor != null) {
			res += cursor.getValue();
			cursor = cursor.getNext();
			if (cursor != null) {
				res += ",";
			}
		}
		res += "]";
		return res;
	}

	// METHOD: contain
	// returns true if the given value is contained in the set and false otherwise.
        public boolean contain(int value) {
          boolean found = false;
          Node cursor = head;
          while (cursor != null && !found) {
    	    if (value == cursor.getValue()) {
    		  found = true;
    	    } else {
            cursor = cursor.getNext();
		found = false;
    	    }
           }
         return found;
        } // ends method contain

	// METHOD: remove
	// remove the node containing the value from the set. If the value is not contained in the Set, do nothing.
	public void remove(int value) {
          Node cursor = head;
          Node previous = null;
          boolean found = false;

          int index = indexOf(value);
          if (index < size()) {
          if (index == 0) {
           head = head.getNext();
            if (head == null) {
               tail = null;
            }
         } else {
         previous = head;
         for(int i = 0; i < index - 1; i++) {
           previous = previous.getNext();
          }
          previous.setNext(previous.getNext().getNext());

          if (index == size() - 1) {
          tail = previous;
          }
        }

        size--;
         } else {
         throw new RuntimeException("Value out of bound.");
        }
	} // ends remove

	// METHOD: addElement
	//​add a node with the given value to the Set. If there is already a node containing the same value, do nothing.
	public void addElement(int value) {
                Node newNode = new Node(value, null);
                // check if the list is empty
                if (head != null) {
                        tail.setNext(newNode);
                } else {
                        head = newNode;
                }
                tail = newNode;
                size++;
        }

	// METHOD: subsetOf
	//​returns a Boolean value true if every element ins the givenSet is in the current set and false otherwise
	public boolean subsetOf(IntSet givenSet) {
	boolean found = false;
        int index = 0;

        while (index < givenSet.size() ) {
        givenSet.get(index);
          if (this.contain(givenSet.get(index)) == true) {
          found = true;
       	  } else if (this.contain(givenSet.get(index)) == false)  {
          found = false;
	  break;
          }
        index++;
        }
        return found;
        }

	// METHOD: isEqual
	// ​returns true if both sets contain the same elements where order in either set does not count.
	public boolean isEqual(IntSet givenSet) {
	boolean found = false;
	int index = 0;
	  if ( givenSet.size() != this.size()) {
            found = false;
	  } else {
          while (index < givenSet.size()) {
	    if (this.contain(givenSet.get(index)) == true) {
            found = true;
            } else if (this.contain(givenSet.get(index)) == false)  {
            found = false;
            break;
            }
         index++;
         }
         }
 	 return found;
         }

	// METHOD: union
	// returns a Set that contains all the elements in set A and B, but only list duplicates once.
        public IntSet union(IntSet givenSet) {
        int index = 0;
        IntSet intLinkedList3 = new IntSet();

	while (index < givenSet.size()) {
	  if (intLinkedList3.contain(givenSet.get(index)) == false) {
	  intLinkedList3.addElement(givenSet.get(index));
	  }
	index++;
	}

	index = 0;
	while (index < this.size()) {
	  if ((intLinkedList3.contain(this.get(index)) == false) || (this.contain(givenSet.get(index)))){
          intLinkedList3.addElement(this.get(index));
          }
        index++;
        } // ends while
	return intLinkedList3;
        } //ends union

	// METHOD: intersection
	// returns a set containing only elements that are common to both A and B, but no duplicates
        public IntSet intersection(IntSet givenSet) {
        int index = 0;
        IntSet intLinkedList3 = new IntSet();

  	while (index < givenSet.size()) {
          if (this.contain(givenSet.get(index)) == true && intLinkedList3.contain(givenSet.get(index)) == false) {
          intLinkedList3.addElement(givenSet.get(index));
          }
          index++;
        }
	return intLinkedList3;
       } //ends intersection

	// METHOD: complement
	// returns a set containing only elements that are in A but not in B.
        public IntSet complement(IntSet givenSet) {
	IntSet intLinkedList3 = new IntSet();
	int index = 0;
	while (index < this.size()) {
	intLinkedList3.addElement(this.get(index));
          if (givenSet.contain(this.get(index))) {
	  intLinkedList3.remove(this.get(index));
	  }
	index++;
	} //ends while
	return intLinkedList3;
       } // ends complement


} // ends class
