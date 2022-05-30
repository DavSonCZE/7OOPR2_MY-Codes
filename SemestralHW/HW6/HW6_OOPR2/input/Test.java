package eng.task;

public interface Parseable {
  void parse(String param);
}

public interface Formatable {
  String format();
}

public class Id {
  private int id;

  public int getId() {
    return this.id;
  }
}

public class Record extends Id implements Parseable, Formatable {
  @Override
  public String format() {
    throw new UnsupportedOperationException();
  }

  @Override
  public void parse(String param) {
    throw new UnsupportedOperationException();
  }

  public void updateId(int newId) {
    this.updateId(newId, false);
  }

  public void updateId(int newId, boolean forceUpdate) {
    throw new UnsupportedOperationException();
  }
}