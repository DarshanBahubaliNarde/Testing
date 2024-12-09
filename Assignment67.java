package allassignments;



interface Cycle {
    void gearCycle();
}


interface Bikes extends Cycle {
    void gearBike();
}


interface Car extends Bikes {
    void gearCars();
}


class Vehical implements Car {
    @Override
    public void gearCycle() {
        System.out.println("ride gear cycle");
    }

    @Override
    public void gearBike() {
        System.out.println("ride gear bike");
    }

    @Override
    public void gearCars() {
        System.out.println("ride gear cars");
    }
}


public class Assignment67 {
    public static void main(String[] args) {

        Car C1 = new Vehical();


        C1.gearCycle();
		C1.gearBike();
		C1.gearCars();
    }
}

