import java.util.Scanner;

public class Menu {
  Scanner s = new Scanner(System.in);

  int arr[] = new int[100];
  int numberOfElements = 0;


  

  public void removeFirst() {
    if (numberOfElements > 0) {
      for (int i = 0; i < numberOfElements - 1; i++) {
        arr[i] = arr[i + 1];
      }
      numberOfElements--;
      System.out.println("First element removed successfully ");
      System.out.println("----------");
    } else {
            System.out.println("Array is Empty");
      System.out.println("----------");
    }
  }



  

  public void removeLast() {
    if (numberOfElements > 0) {
      numberOfElements--;
      System.out.println("Last element removed successfully");
      System.out.println("----------");
    } else {
      System.out.println("Array is Empty");
      System.out.println("----------");
    }
  }


  

  public void removeSpecific() {
    System.out.println("Enter index value to remove:");
    int index = s.nextInt();
    if (index < numberOfElements) {
      for (int i = index; i < numberOfElements - 1; i++) {
        arr[i] = arr[i + 1];
      }
      numberOfElements--;
      System.out.println("Element removed successfully ");
      System.out.println("----------");
    } else {
      System.out.println("Invalid index");
      System.out.println("----------");
    }
  }


  

  public void removeFirstOccurance() {
    System.out.println("Enter element to remove :");
    int value = s.nextInt();
    int index = -1;
    for (int i = 0; i < numberOfElements; i++) {
      if (arr[i] == value) {
        index = i;
        break;
      }
    }
    if (index != -1) {
      for (int i = index; i < numberOfElements - 1; i++) {
        arr[i] = arr[i + 1];
      }
      numberOfElements--;
      System.out.println("First occurence of element " + value + "  removed successfully");
      System.out.println("----------");
    } else {
      System.out.println("Element not found in the array");
      System.out.println("----------");
    }
  }




  

  public void removeLastOccurance() {
    System.out.println("Enter element to remove :");
    int value = s.nextInt();
    int index = -1;
    for (int i = numberOfElements - 1; i >= 0; i--) {
      if (arr[i] == value) {
        index = i;
        break;
      }
    }
    if (index != -1) {
      for (int i = index; i < numberOfElements - 1; i++) {
        arr[i] = arr[i + 1];
      }
      numberOfElements--;
      System.out.println("Last occurence of element " + value + "  removed successfully");
      System.out.println("----------");
    } else {
      System.out.println("Element not found in the array");
      System.out.println("----------");
    }
  }
  


  

  public void removeAllOccurance() {
    System.out.println("Enter the element to be remove :");
    int value = s.nextInt();
    int no_of_times = 0;
    for (int i = 0; i < numberOfElements; i++) {
      if (arr[i] == value) {
        no_of_times++;
      } else {
        arr[i - no_of_times] = arr[i];
      }
    }
    numberOfElements -= no_of_times;
    System.out.println(no_of_times + " occurances of " + value + " removed successfully ");
    System.out.println("----------");
  }
  


  

  public void insertLast() {
    System.out.println("Enter new value");
    int value = s.nextInt();

    arr[numberOfElements] = value;
    numberOfElements++;
    System.out.println("----------");

  }
  

  

  public void insertFirst() {
    System.out.println("Enter new value");
    int value = s.nextInt();
    if (numberOfElements == 0) {
      arr[0] = value;
      numberOfElements++;
      System.out.println("----------");
    } else {
      for (int i = numberOfElements; i > 0; i--) {
        arr[i] = arr[i - 1];
      }
      System.out.println("----------");
      arr[0] = value;
      numberOfElements++;
    }

  }

  

  

  public void display() {
    for (int i = 0; i < numberOfElements; i++) {
      System.out.print(arr[i] + "  ");
      
    }
  }

  

  public void insertSpecific() {
    System.out.println("Enter new value");
    int value = s.nextInt();
    System.out.println("enter index value");
    int index = s.nextInt();
    if (index <= numberOfElements) {
      for (int i = numberOfElements; i > index; i--) {
        arr[i] = arr[i - 1];
      }
      arr[index] = value;
      numberOfElements++;
      System.out.println("----------");
    } else {
      System.out.println("Invalid index");
      System.out.println("----------");
    }

  }


  

  public void viewOptions() {
    int option = 0;
    do {
      System.out.println("\n1. Insert first");
      System.out.println("2. Insert Last ");
      System.out.println("3. Insert specific");

      System.out.println("4. Remove first element");
      System.out.println("5. Remove last element");
      System.out.println("6. remove element from specific index");

      System.out.println("7. remove first occurance of search element");
      System.out.println("8. remove last occurance of search element");
      System.out.println("9. remove all occurances of search element");

      

      System.out.println("Choose your option :");
      option = s.nextInt();
      switch (option) {
        case 1: {
          insertFirst();
          display();
          break;
        }
        case 2: {
          insertLast();
          display();
          break;
        }
        case 3: {
          insertSpecific();
          display();
          break;
        }
        case 4: {
          removeFirst();
          display();
          break;
        }
        case 5: {
          removeLast();
          display();
          break;
        }
        case 6: {
          removeSpecific();
          display();
          break;
        }
        case 7: {
          removeFirstOccurance();
          display();
          break;
        }
        case 8: {
          removeLastOccurance();
          display();
          break;
        }
        case 9: {
          removeAllOccurance();
          display();
          break;
        }

        default: {
          System.out.println("Invalid option");
        }
      }
    } while (option != 0);

  }

  public static void main(String args[]) {

    Menu obj = new Menu();
    obj.viewOptions();

  }
}