public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
  }
  public void clear() {
    size = 0;
  }
  public int size() {
    return data.length;
  }
  public boolean isEmpty() {
    if (size() == 0) {
      return true;
    }
    return false;
  }
  public boolean add(String elem) {
    for (int idx = 0; idx < this.size(); idx++) {
      if (data[idx] == null) {
        data[idx] = elem;
        return true;
      }
    }
    return true;
  }
  
}
