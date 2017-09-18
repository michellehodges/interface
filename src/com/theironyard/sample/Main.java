package com.theironyard.sample;

public class Main {

    public static void main(String[] args) {
	    Army armyBoy123 = new Army("Jeb","General",98743 );
        System.out.println(armyBoy123.speak());
        System.out.println(armyBoy123.swing());
        System.out.println(armyBoy123.knife());
        System.out.println(armyBoy123.fire());

        System.out.println(armyBoy123.sleep());
        System.out.println(armyBoy123.eat());
        System.out.println(armyBoy123.walk());

        Marines marineMan324 = new Marines("Bobby", "Infantry", 98343);
        System.out.println(marineMan324.speak());
        System.out.println(marineMan324.swing());
        System.out.println(marineMan324.knife());
        System.out.println(marineMan324.fire());

        Navy seaMan90 = new Navy("Chad", "Mid-Level", 8767);
        System.out.println(seaMan90.speak());
        System.out.println(seaMan90.swing());
        System.out.println(seaMan90.knife());
        System.out.println(seaMan90.fire());
    }

    class ExtendedVersion extends Soldier implements DoublePunch {
        public ExtendedVersion(String name, String rank, int serialNumber) {
            super(name, rank, serialNumber);
        }

        public String swing(){
            return "Whoosh!";
        }
        public String speak(){
            return "Hello, its me!";
        }
        public Bomb doublePunch (){
            return new Bomb();
        }
    }
}


//TODO: Extras
//Create two new interfaces such that each defines the identical method.
//Create a new class that extends Soldier and implements these interfaces. This is allowed.

//Now add another identical method except the return types are different. Uh oh,
//this is not allowed. Comment out the two new methods.