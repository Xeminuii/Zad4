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
    System.out.println("1 - add student, 2 - show students");
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
          s.addStudent(new Student(name, age, surname));
          break;
          
          case 2:
          var students = s.getStudents();
          for(Student current : students) {
            System.out.println(current.ToString());
            }
          break;
      }
    } catch (IOException e) {

    }
  }
}