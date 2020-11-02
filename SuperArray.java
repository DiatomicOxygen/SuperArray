public class SuperArray {

  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size < data.length) {
      data[size] = element;
      size ++;
      return true;
    }
    return false;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    data[index] = element;
    return data[index];
  }

  private void resize() {
    String[] tempData = data;
    data = new String[size+10];
    for (int i = 0; i < tempData.length; i++) {
      data[i] = tempData[i];
    }
  }
}
