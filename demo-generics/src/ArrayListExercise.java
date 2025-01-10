import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class ArrayListExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    // 1c. Print all the elements in the list.
    // 1d. Remove the number 30 from the list.
    // 1e. Print the size of the list.

    ArrayList<Integer> arrayList1 = new ArrayList<>();
    arrayList1.add(10);
    arrayList1.add(20);
    arrayList1.add(30);
    arrayList1.add(40);
    arrayList1.add(50);
    for (int i = 0; i < arrayList1.size(); i++) {
      System.out.print(arrayList1.get(i) + " ");
    }

    for (int i = 0; i < arrayList1.size(); i++) {
      if (arrayList1.get(i) == 30) {
        arrayList1.remove(i);
      }
    }

    System.out.println();
    System.out.println(arrayList1.size());



    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    // 2b. Check if "Grapes" exists in the list.
    // 2c. If it doesn’t exist, add it to the list.
    // 2d. Update "Mango" to "Peach".
    // 2e. Print the final list.

    ArrayList<String> arrayList = new ArrayList<>();
    arrayList.add("Apple");
    arrayList.add("Banana");
    arrayList.add("Mango");
    arrayList.add("Orange");
    System.out.println(arrayList.contains("Grapes"));
    if (arrayList.contains("Grapes") == false) {
      arrayList.add("Grapes");
    }
    for (int i = 0; i < arrayList.size(); i++) {
      if (arrayList.get(i) == "Mango") {
        arrayList.set(i, "Peach");
      }
    }

    for (String string : arrayList) {
      System.out.println(string);
    }

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    // 3b. Remove duplicates from the list using a HashSet.
    // 3c. Print the list after removing duplicates.
    ArrayList<Integer> arrayList2 = new ArrayList<>();
    arrayList2.add(10);
    arrayList2.add(20);
    arrayList2.add(10);
    arrayList2.add(30);
    arrayList2.add(40);
    arrayList2.add(20);
    arrayList2.add(50);

    HashSet<Integer> hashSet = new HashSet<>();
    for (Integer integer : arrayList2) {
      hashSet.add(integer);
    }

    for (Integer integer : hashSet) {
      System.out.println(integer);
    }



    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    // 4b. Add "Canada" to the set.
    // 4c. Add "India" again. Print the result.
    // 4d. Print all elements in the set.
    HashSet<String> hashSet2 = new HashSet<>();
    hashSet2.add("USA");
    hashSet2.add("India");
    hashSet2.add("China");
    hashSet2.add("Japan");
    hashSet2.add("Canada");
    hashSet2.add("India");
    for (String string : hashSet2) {
      System.out.println(string);
    }


    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of integers: 1.1, 2.2, 3.3, 4.4, 5.5
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.
    HashSet<Double> hashSe3 = new HashSet<>();
    hashSe3.add(1.1);
    hashSe3.add(2.2);
    hashSe3.add(3.3);
    hashSe3.add(4.4);
    hashSe3.add(5.5);
    System.out.println(hashSe3.contains(3.3));
    hashSe3.remove(2.2);
    System.out.println(hashSe3.size());


    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> hashSet4 = new HashSet<>();
    HashSet<Integer> hashSet5 = new HashSet<>();
    HashSet<Integer> hashSetCommon = new HashSet<>();

    hashSet4.add(10);
    hashSet4.add(20);
    hashSet4.add(30);
    hashSet4.add(40);

    hashSet5.add(30);
    hashSet5.add(40);
    hashSet5.add(50);
    hashSet5.add(60);

    for (Integer integer : hashSet4) {
      if (hashSet5.contains(integer)) {
        hashSetCommon.add(integer);
      }
    }

    for (Integer integer : hashSetCommon) {
      System.out.println(integer);
    }



    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    HashSet<String> hashSet6 = new HashSet<>();
    hashSet6.add("Cherry");
    hashSet6.add("Steve");
    hashSet6.add("Chole");
    hashSet6.add("Jenny");
    hashSet6.add("Vicky");
    ArrayList<String> arrayList4 = new ArrayList<>();
    for (String string : hashSet6) {
      arrayList4.add(string);

    }
    for (String string : arrayList4) {
      System.out.println(string);
    }



    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    Student student1 = new Student(1, "Alice");
    Student student2 = new Student(2, "Bob");
    Student student3 = new Student(3, "Charlie");

    ArrayList<Student> stuList = new ArrayList<>();
    stuList.add(student1);
    stuList.add(student2);
    stuList.add(student3);

    for (Student student : stuList) {
      System.out.println(student.getId() + " " + student.getName());
    }

    for (Student student : stuList) {
      if (student.getName() == "Bob") {
        stuList.remove(student);
      }
    }

    System.out.println(Student.searchById(1, stuList).getName());

    ArrayList<Student> stuList2=new ArrayList<>();
    for (Student student : stuList) {
      if (student.getName().charAt(0)=='A') {
        stuList2.add(student);
      }
    }


    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

    HashSet<Student>stuSet= new HashSet<>();
    HashSet<Student>stuSet2= new HashSet<>();

    Student stu1= new Student(1, "Alice");
    Student stu2= new Student(2, "Bob");
    Student stu3= new Student(3, "Charlie");
    Student stu4= new Student(4, "David");

    stuSet.add(stu1);
    stuSet.add(stu2);
    stuSet.add(stu3);

    stuSet2.add(stu2);
    stuSet2.add(stu3);
    stuSet2.add(stu4);
    System.out.println("q9");
    for (Student student : stuSet) {
      if (stuSet2.contains(student)) {
        System.out.print(student.getName()+" ");
      }
    }







  }

  public static class Student {
    private int id;
    private String name;

    @Override
    public boolean equals(Object obj){
      if(this==obj)
      return true;
      if(!(obj instanceof Student))
      return false;
      Student student= (Student)obj;
      return Objects.equals(student.getId(), this.getId()) && Objects.equals(student.getName(), this.getName());
    }

    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return this.id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public String getName() {
      return this.name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public static Student searchById(int id, ArrayList<Student> stuList) {
      for (Student student : stuList) {
        if (student.getId() == id) {
          return student;
        }
      }
      return null;
    }



    // Constructor
    // getter, setter, etc.
  }
}
