package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        CatHouse.clear();
    }

    @Test
    // TODO - Create tests for `void add(Cat cat)`
    public void addTest() {
        Cat cat = new Cat("Zula", new Date(), 0);
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(0);
        Assert.assertEquals(cat, actual);
    }

    @Test
    // TODO - Create tests for `void remove(Integer id)`
    public void remove1Test() {
        Cat catA = new Cat("Zula", new Date(), 0);
        Cat catB = new Cat("Allie", new Date(), 1);
        CatHouse.add(catA);
        CatHouse.add(catB);
        CatHouse.remove(0);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    // TODO - Create tests for `void remove(Cat cat)`
    public void remove2Test() {
        Cat catA = new Cat("Zula", new Date(), 0);
        Cat catB = new Cat("Allie", new Date(), 1);
        CatHouse.add(catA);
        CatHouse.add(catB);
        CatHouse.remove(catA);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    // TODO - Create tests for `Cat getCatById(Integer id)`
    public void getCatByIdTest() {
        Cat catA = new Cat("Zula", new Date(), 0);
        Cat catB = new Cat("Allie", new Date(), 1);
        CatHouse.add(catA);
        CatHouse.add(catB);
        Cat actual = CatHouse.getCatById(0);
        //Cat expected = catA;
        Assert.assertEquals(catA, actual);
    }

    @Test
    // TODO - Create tests for `Integer getNumberOfCats()`
    public void getNumberOfCatsTest() {
        Cat catA = new Cat("Zula", new Date(), 0);
        Cat catB = new Cat("Allie", new Date(), 1);
        CatHouse.add(catA);
        CatHouse.add(catB);
        Integer actual = CatHouse.getNumberOfCats();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }

}
