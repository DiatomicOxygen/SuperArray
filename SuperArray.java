public class SuperArray {
  //Assignment 14
  //Instance Variables (a)
  private String[] data;
  private int size;

  //Constructor (b)
  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  //Assignment 15 constructor
  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("Please set a positive initial capacity!");
    }

    data = new String[initialCapacity];
    size = 0;
  }

  // size method (c)
  public int size() {
    return size;
  }

  // add method (d) (modified)
  public boolean add(String element) {
    if (! (size < data.length)) {
      resize();
    }
    data[size] = element;
    size++;
    return true;

  }

  //get method (e)
  public String get(int index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Please use a positive index!");
    }
    if (index >= size) {
      if (size == 0) {
        throw new  IndexOutOfBoundsException("This is an empty SuperArray!");
      }
      throw new IndexOutOfBoundsException("Please use an index less than " + size + "!");
    }

    return data[index];
  }

  //set method (f)
  public String set(int index, String element) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Please use a positive index!");
    }
    if (index >= size) {
      if (size == 0) {
        throw new  IndexOutOfBoundsException("This is an empty SuperArray!");
      }
      throw new IndexOutOfBoundsException("Please use an index less than " + size + "!");
    }

    String old = data[index];
    data[index] = element;
    return old;
  }

  //resize method (g)
  private void resize() {
    String[] tempData = data;
    data = new String[size*2 + 1];
    for (int i = 0; i < tempData.length; i++) {
      data[i] = tempData[i];
    }
  }

  //Classwork and Homework 11/4/20
  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    size = 0;
    data = new String[10];
  }

  public String toString() {
    String ans = "[";
    for (int i = 0; i < size; i++) {
      ans += data[i];
      if (i != size - 1) {
        ans += ", ";
      }
    }
    ans += "]";
    return ans;
  }

  public boolean contains(String a) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(a)) {
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Please use a positive index!");
    }
    if (index > size) {
      throw new IndexOutOfBoundsException("Please use an index less than or equal to " + size + "!");
    }

    if (size + 1 >= data.length) {
      resize();
    }
    for (int i = size-1; i >= index; i--) {
      data[i+1] = data[i];
    }
    data[index] = element;
    size++;
  }

  public String remove(int index) {
    if (index < 0) {
      throw new IndexOutOfBoundsException("Please use a positive index!");
    }
    if (index >= size) {
      if (size == 0) {
        throw new  IndexOutOfBoundsException("This is an empty SuperArray!");
      }
      throw new IndexOutOfBoundsException("Please use an index less than " + size + "!");
    }

    String removed = data[index];
    for (int i = index; i < size ; i++ ) {
      if (i == size - 1) {
        data[i] = null;
      } else {
        data[i] = data[i+1];
      }
    }
    size--;
    return removed;
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] ans = new String[size];
    for (int i = 0; i < size; i++) {
      ans[i] = data[i];
    }
    return ans;
  }

  //Assignment 16
  //method for part c
  public int lastIndexOf(String value) {
    for (int i = size-1; i >= 0; i--) {
      if (data[i].equals(value)) {
        return i;
      }
    }
    return -1;
  }

  //method for part d
  public boolean equals(SuperArray other) {
    if (size != other.size()) {
      return false;
    }
    for (int i = 0; i < size; i++) {
      if (! get(i).equals(other.get(i))) {
        return false;
      }
    }
    return true;
  }
  //Assignment 17: edits are spread throughout the methods

}
