package KaNNaT.first;

public class Main {

    public static void main(String[] args) {
	// write your code here
    var box = 5;
    System.out.println(box);
    box = box + 2;
    System.out.println(box);
    box = box - 3;
    System.out.println(box);
    box = box * 3;
    System.out.println(box);
    box = box / 4;
    System.out.println(box);

    var liftingCapasity = 50;
    var staffWeight = 20;
    var capasityLeft = liftingCapasity - staffWeight;
    System.out.println("Еще можно положить " + capasityLeft + " кг вещей");

    var appleWeight = 2;
    var orangesWeight = 3;
    var fruitWeight = appleWeight + orangesWeight;
    System.out.println("Общий вес фруктов " + fruitWeight);

    }
}
