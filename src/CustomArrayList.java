import java.util.Arrays;
public class CustomArrayList<D> {

  private int size = 0;
  private static final int DEFAULT_CAPACITY = 2;
  private Object elements[];

  public CustomArrayList() {
    elements = new Object[DEFAULT_CAPACITY];
  }

  public D get(int i) {
    if (i >= size || i < 0) {
      throw new IndexOutOfBoundsException("Index" + i + " Size" + size);
    } else {
      D item = (D) elements[i];
      return item;
    }
  }

  public void add(D item) {
    if (size>=elements.length){
      biggerArray();
    }
    elements[size]=item;
    size++;
  }

  private void biggerArray(){
    Integer newSize=elements.length * 2;
    elements=Arrays.copyOf(elements,newSize );
  }

  public int size() {
    return size;
  }

}