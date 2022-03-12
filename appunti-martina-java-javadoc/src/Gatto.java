public class Gatto {
  String name;
  byte age;

  public Gatto(String name, byte age) {
    this.name = name;
    this.age = age;
  }

  public byte getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public boolean isPlaying() {
    return true;
  }
}
