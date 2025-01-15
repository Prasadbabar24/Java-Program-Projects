package Practice_Setters_Getters;

class Employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class Cellphone {
    public void vibrate() {
        System.out.println("vibrating.....");
    }

    public void ringing() {
        System.out.println("Ringing....");
    }

    public void calling() {
        System.out.println("calling.....");
    }
}

class area {
    int side;

    public int squre() {
        return side * side;
    }

    public int perimeter() {
        return 4 * side;
    }
}

class game {
    public void fire() {
        System.out.println("fire the enemy ...");
    }

    public void run() {
        System.out.println("run towards the enemy..");
    }

    public void hit() {
        System.out.println(" hitting the enemy...");
    }
}

public class ps_propertise_method {
    public static void main(String[] args) {
//        problem 1
//        Practice_Setters_Getters.Employee prasad = new Practice_Setters_Getters.Employee();
//        prasad.name = "CodeWithPrasad";
//        prasad.salary = 4556;
//        System.out.println(prasad.getSalary());
//        System.out.println(prasad.getName());
//
//          problem 2
//        Practice_Setters_Getters.Cellphone asus=new Practice_Setters_Getters.Cellphone();
//        asus.ringing();
//        asus.calling();
//        asus.vibrate();

//        problem 3
//        Practice_Setters_Getters.area sq = new Practice_Setters_Getters.area();
//        sq.side= 5;
//        System.out.println(sq.squre());
//        System.out.println(sq.perimeter());

//        problem no 4
        game pubg = new game();
        pubg.fire();
        pubg.hit();
        pubg.run();
    }
}
