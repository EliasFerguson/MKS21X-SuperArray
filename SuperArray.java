public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public void clear() {
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean isEmpty() {
    if (size() == 0) {
      return true;
    }
    return false;
  }
  public boolean add(String elem) {
    if (size == data.length) {
      resize();
    }
    else {
      data[size] = elem;
      size++;
    }
    return true;
  }
  public String toString() {
    String output = "[";
    if (size() == 0) {
      return "[]";
    }
    for (int idx = 0; idx < size() - 1; idx ++) {
      output += data[idx] + ", ";
    }
    output += data[size() - 1] + "]";
    return output;
  }
  public String toStringDebug(){
    if (data.length == 0) {
      return "[]";
    }
    String output = "[";
   for (int idx = 0; idx < data.length - 1; idx++) {
     output += data[idx] + ", ";
   }
   output += data[data.length - 1] + "]";
   return output;
  }
  public String get(int index) {
    if (index < 0 || index >= size()) {
      return null;
    }
    return data[index];
  }
  public String set(int index, String element) {
    if (index < 0 || index >= size()) {
      return null;
    }
    String old = data[index];
    data[index] = element;
    return old;
  }
  private void resize() {
    String[] newSA = new String[data.length * 2];
    for (int idx = 0; idx < data.length; idx++) {
      newSA[idx] = data[idx];
    }
    data = newSA;
  }
  public boolean contains(String target) {
    for (int idx = 0; idx < size(); idx++) {
      if (data[idx].equals(target)) {
        return true;
      }
    }
    return false;
  }
  public int indexOf(String target) {
    int idx = 0;
    while (idx < size()) {
      if (data[idx].equals(target)) {
        return idx;
      }
      idx++;
    }
    return -1;
  }
  public int lastIndexOf(String target) {
    int idx = size() - 1;
    while (idx > -1) {
      if (data[idx].equals(target)) {
        return idx;
      }
      idx--;
    }
    return -1;
  }
  public void add(int index, String element) {
    if (size() + 1 >= data.length) {
      resize();
    }
    for (int idx = index + 1; idx < size(); idx++) {
      data[idx] = data[idx - 1];
    }
    data[index] = element;
  }
  public String remove(int index) {
    String removed = data[index];
    data[index] = null;
    for (int idx = index + 1; idx > size(); idx++) {
      data[idx] = data[idx + 1];
    }
    return removed;
  }
 }
