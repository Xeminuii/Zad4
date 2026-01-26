/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("1 - add student, 2 - show students, 3 - find student by name, 4 - remove student");
    try {
      Service s = new Service();
      Scanner sc = new Scanner(System.in);
      int stud = sc.nextInt();
      switch(stud){
        case 1:
          System.out.println("Podaj imie");
          String name = sc.next();
          System.out.println("Podaj wiek");
          int age = sc.nextInt();
          System.out.println("Podaj nazwisko");
          String surname = sc.next();
          System.out.println("Podaj date urodzenia");
          String datauro = sc.next();
          s.addStudent(new Student(name, age, surname, datauro));
          break;
          
          case 2:
          var students = s.getStudents();
          for(Student current : students) {
            System.out.println(current.ToString());
            }
          break;

        case 3:
          System.out.println("Podaj imie");
          String name2 = sc.next();
          var students2 = s.getStudents();
          for(Student current : students2)
            if(current.GetName().equals(name2))
              System.out.println(current.ToString());
          break;

        case 4:
          System.out.println("Podaj imie");
          String name3 = sc.next();
          s.removeStudentByName(name3);
          break;
          
      }
    } catch (IOException e) {

    }
  }
}