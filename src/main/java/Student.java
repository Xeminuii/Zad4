public class Student {

  private String Name;
  private int Age;
  private String Surname;
  private String Datauro;

  public Student(String name, int age, String surname, String datauro) {
    Name = name;
    Age = age;
    Surname = surname;
    Datauro = datauro;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSurname() {return Surname;}
  public String GetDatauro() {return Datauro;}

  // public String ToString() {
  //   return Name + " " + Integer.toString(Age);
  // }
  public String ToString() {
    return Name + " " + Integer.toString(Age) + " " + Surname + " " +  Datauro;
  }

  
  public static Student Parse(String str){
    String[] data = str.split(" ");
    if(data.length != 4)
      return new Student("Parse Error", -1, "Parse Error", "Parse Error");
    return new Student(data[0], Integer.parseInt(data[1]), data[2], data[3]);
  }
  
  
  // public static Student Parse(String str) {
  //   String[] data = str.split(" ");
  //   if(data.length != 2) 
  //     return new Student("Parse Error", -1);
  //   return new Student(data[0], Integer.parseInt(data[1]));
  // }
}