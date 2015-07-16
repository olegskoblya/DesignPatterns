package designpatternstest;

import com.company.managedcollections.second.Menu;
import com.company.managedcollections.second.MenuComponent;
import com.company.managedcollections.second.MenuItem;
import com.company.managedcollections.second.Waitress;
import com.company.singleton.Singleton;
import com.company.singleton.chocolate1.ChocolateBoiler;
import com.company.state.state1.GumballMachine;
import com.company.templatemethod.exercise1.Coffee;
import com.company.templatemethod.exercise1.Tea;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

/**
 * Created by oleg on 18.06.15.
 */
public class PatternsTest extends Assert {
    @Before
    public void before() {
        System.out.println("Before test");
    }

    @After
    public void after() {
        System.out.println("After Test!");
    }

    @Test
    public void shouldCreateSingleton() {
        Exception ex = null;
        try {
            ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        } catch (Exception e) {
            ex = e;
        }
        assertEquals(null, ex);
    }

    @Test
    public void menuComponentTestDrive() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);



        dinerMenu.add(new MenuItem("Pasta", "Spagetti with Marinara Sauce, and slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItem("Meat", "Bloody meat", false, 100.00));
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
        waitress.printVegetarianMenu();
    }

    @Test
    public void gumballTestDrive() {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }

}
