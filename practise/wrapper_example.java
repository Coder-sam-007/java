class Int_wrapper {
  private int value;

  public Int_wrapper(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}

public class wrapper_example {
  public static void main(String[] args) {
    Int_wrapper wrapper = new Int_wrapper(42);

    int value = wrapper.getValue();
    System.out.println("Initial value: " + value);

    wrapper.setValue(100);
    System.out.println("New value: " + wrapper.getValue());

  }
}
