package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Before
    public void setUp() {

    }

    @After
    public void tearDown(){

    }
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Sophie";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    // TODO - Create tests for `speak`
    public void speakTest(){
        Dog dog = new Dog("Sophie", new Date(), 0);
        String actual = dog.speak();
        String expected = "bark!";
        Assert.assertEquals(expected, actual);
    }

    @Test
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    public void setBirthDateTest() {
        Dog dog = new Dog("Sophie", new Date(), 0);
        Date actual = dog.getBirthDate();
        Date expected = new Date();
        Assert.assertEquals(expected, actual);
    }

    @Test
    // TODO - Create tests for `void eat(Food food)`
    public void eatTest() {
        Dog dog = new Dog("Sophie", new Date(), 0);
        dog.eat(new Food());
        Integer actual = dog.getNumberOfMealsEaten();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    // TODO - Create tests for `Integer getId()`
    public void getIdTest() {
        Dog dog = new Dog("Sophie", new Date(), 0);
        Integer actual = dog.getId();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    public void animalInheritanceTest() {
        Dog dog = new Dog("Sophie", new Date(), 0);
        Boolean actual = dog instanceof Animal;
        Boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    public void mammalInheritanceTest() {
        Dog dog = new Dog("Sophie", new Date(), 0);
        Boolean actual = dog instanceof  Mammal;
        Boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
