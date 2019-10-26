package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        DogHouse.clear();
    }

    @Test
    // TODO - Create tests for `void add(Dog dog)`
    public void addTest() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Zula", new Date(), 0);
        DogHouse.add(dog);
        //Dog actual = dog;
        Dog expected = DogHouse.getDogById(0);
        Assert.assertEquals(expected, dog);
    }
    @Test
    // TODO - Create tests for `void remove(Integer id)`
    public void removeDogTest1() {
        Dog dogA = new Dog("Milo", new Date(), 0);
        Dog dogB = new Dog("Sophie", new Date(), 1);
        DogHouse.add(dogA);
        DogHouse.add(dogB);
        DogHouse.remove(0);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    // TODO - Create tests for `void remove(Dog dog)`
    public void removeDogTest2() {
        Dog dogA = new Dog("Milo", new Date(), 0);
        Dog dogB = new Dog("Sophie", new Date(), 1);
        DogHouse.add(dogA);
        DogHouse.add(dogB);
        DogHouse.remove(dogA);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    // TODO - Create tests for `Dog getDogById(Integer id)`
    public void getDogByIdTest() {
        Dog dogA = new Dog("Milo", new Date(), 0);
        Dog dogB = new Dog("Sophie", new Date(), 1);
        DogHouse.add(dogA);
        DogHouse.add(dogB);
        Dog actual = DogHouse.getDogById(0);
        //Dog expected = dogA;
        Assert.assertEquals(dogA, actual);
    }
@Test
    // TODO - Create tests for `Integer getNumberOfDogs()`
    public void getNumberOfDogsTest() {
        Dog dogA = new Dog("Milo", new Date(), 0);
        Dog dogB = new Dog("Sophie", new Date(), 1);
        DogHouse.add(dogA);
        DogHouse.add(dogB);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 2;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
