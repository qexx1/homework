public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        dog = dog + 3.5;
        cat = cat + 1.6;
        paper = paper + 7639;
        var friend = 19;
        System.out.println(friend );
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var differentWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println(differentWeight);
        differentWeight = secondBoxerWeight % firstBoxerWeight;
        System.out.println(differentWeight);
        var totalTime = 640;
        var oneWorkerTime = 8;
        var quantityWorkerTime = totalTime / oneWorkerTime;
        System.out.println("Всего работников в компании - " + quantityWorkerTime + " человек" );
        var anotherCompanyWorkers = quantityWorkerTime  + 94;
        var anotherCompanyWorkerTime = anotherCompanyWorkers * 8;
        System.out.println("если в комании работает " + anotherCompanyWorkers + " человек, то всего " + anotherCompanyWorkerTime + " часов работы может быть поделено между сотрудниками");
    }
}