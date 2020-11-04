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
    return data[index];
  }

  //set method (f)
  public String set(int index, String element) {
    String old = data[index];
    data[index] = element;
    return old;
  }

  //resize method (g)
  private void resize() {
    String[] tempData = data;
    data = new String[size*2];
    for (int i = 0; i < tempData.length; i++) {
      data[i] = tempData[i];
    }
  }

  //Classwork 11/4/20
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
    if (size == data.length) {
      resize();
    }
    for (int i = size; i > index; i--) {
      data[i+1] = data[i];
    }
    data[index] = element;
    size++;
  }
}
