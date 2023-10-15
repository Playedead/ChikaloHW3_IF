public class Main {

  public static void main(String[] args) {
    System.out.println("Задача №1");
    int age = 10;
    if (age >= 18) {
      System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
    } else {
      System.out.println("Если возраст человека равен " + age
          + ", то он не достиг совершеннолетия, нужно немного подождать.");
    }
    System.out.println();

    System.out.println("Задача №2");
    int temperature = 6;
    if (temperature <= 5) {
      System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
    }
    if (temperature > 5) {
      System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
    }
    System.out.println();

    System.out.println("Задача №3");
    int speed = 59;
    if (speed >= 60) {
      System.out.println("Если скорость " + speed + ", то придется выплатить штраф.");
    } else {
      System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
    }
    System.out.println();

    System.out.println("Задача №4");
    int personage = 25;
    boolean kindergarden = personage >= 2 && personage <= 6;
    if (kindergarden) {
      System.out.println(
          "Если возраст человека равен " + personage + ", то ему нужно ходить в детский сад.");
    }
    boolean school = personage >= 7 && personage <= 17;
    if (school) {
      System.out.println(
          "Если возраст человека равен " + personage + ", то ему нужно ходить в школу.");
    }
    boolean university = personage >= 18 && personage <= 24;
    if (university) {
      System.out.println(
          "Если возраст человека равен " + personage + ", то ему нужно ходить в университет.");
    } else if (personage > 24) {
      System.out.println(
          "Если возраст человека равен " + personage + ", то ему нужно ходить на работу.");
    }
    System.out.println();

    System.out.println("Задача №5");
    int childAge = 14;
    if (childAge < 5) {
      System.out.println(
          "Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
    }
    if (childAge >= 5 && childAge < 14) {
      System.out.println("Если возраст ребенка равен " + childAge
          + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
    } else if (childAge >= 14) {
      System.out.println("Если возраст ребенка равен " + childAge
          + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
    }
    System.out.println();

    System.out.println("Задача №6");
    int totalCapasity = 102;
    int sitQuantity = 60;
    int standQuantity = totalCapasity - sitQuantity;
    int passengersQuantity = 59;
    boolean freeSeats = passengersQuantity >= 1 && passengersQuantity < sitQuantity;
    boolean freeStanding = passengersQuantity >= 60 && passengersQuantity < totalCapasity;
    if (freeSeats) {
      System.out.println("В вагоне есть сидячие и стоячие места");
    }
    if (freeStanding) {
      System.out.println("В вагоне остались только стоячие места");
    } else if (passengersQuantity > 101) {
      System.out.println("Мест нет");
    }
    System.out.println();

    System.out.println("Задача №7");
    int one = 15;
    int two = 12;
    int three = 10;
    if (one > two && one > three) {
      System.out.println("Самым большим числом является первое (" + one + ")");
    }
    if (two > one && two > three) {
      System.out.println("Самым большим числом является второе (" + two + ")");
    } else if (three > one && three > two) {
      System.out.println("Самым большим числом является третье (" + three + ")");
    }
  }
}