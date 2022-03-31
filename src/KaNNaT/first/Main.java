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
    var stuffWeight = 20;
    var capasityLeft = liftingCapasity - stuffWeight;
    System.out.println("Еще можно положить " + capasityLeft + " кг вещей");

    var appleWeight = 2;
    var orangesWeight = 3;
    var fruitWeight = appleWeight + orangesWeight;
    System.out.println("Общий вес фруктов " + fruitWeight);

    var meatWeight = 4;
    var waterWeight = 5;
    var tomatoesWeight = 2;
    var cucumbersWeight = 2;
    var peppersWeight = 2;
    var zucchiniWeight = 2;
    var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
    var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
    System.out.println("Общий вес продуктов " + productsWeight +  " кг!");

    var leftWeight = liftingCapasity - stuffWeight - productsWeight;
    System.out.println("Места осталось " + leftWeight + " кг!");

    productsWeight = productsWeight * 2;
    System.out.println("Теперь вес продуктов " + productsWeight);

    leftWeight = liftingCapasity - stuffWeight - productsWeight;
    System.out.println("Места осталось " + leftWeight + " кг!");

    var overload = (stuffWeight + productsWeight) % liftingCapasity;
    System.out.println("Перегруз на " + overload + " кг!");

    var productsInOneCar = productsWeight / 2;
    System.out.println("Продуктов в одной машине " + productsInOneCar);

    short bananes = 270;
    System.out.println("Бананов " + bananes + " кг!");

    float sugar = 3;
    float onePortion = sugar / 4;
    System.out.println("Одна порция сахара весит " + onePortion + " кг");

    }
}
