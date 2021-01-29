package Composition.Example1;

import java.util.ArrayList;
import java.util.List;

public class ComputerMain {
    public static void main(String[] args) {

        ComputerSet computerSet = new ComputerSet();
        Monitor monitor = new Monitor(25);
        computerSet.setMonitor(monitor);

        Mouse mouse = new Mouse(true);
        computerSet.setMouse(mouse);

        Keyboard keyboard = new Keyboard(20, "Logitech");
        computerSet.setKeyboard(keyboard);

        computerSet.setTotalPrice(500);

        ComputerSet cheaperComputerSet = new ComputerSet(300, new Monitor(15), new Mouse(true), new Keyboard(20, "Fake") );

        List<ComputerSet> order = new ArrayList<>();
        order.add(computerSet);
        order.add(cheaperComputerSet);

        System.out.println(order);

        for(ComputerSet singleOrder : order){
            System.out.println("Computer set");
            System.out.println(singleOrder.getTotalPrice());
            System.out.println(singleOrder.getMonitor().getDisplaySize());
            System.out.println(singleOrder.getKeyboard().getBrand());
            System.out.println(singleOrder.getMouse().isOptical());
        }

    }
}
