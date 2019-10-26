package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`

   @Before
   public void setUp() {

   }

   @After
   public void tearDown(){

   }

    @Test
    public void setNameTest() {
        Cat cat = new Cat("Zula", new Date(), 0);
        String actual = cat.getName();
        String expected = "Zula";
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Cat cat = new Cat("Zula", new Date(), 0);
        String actual = cat.speak();
        String expected = "meow!";
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        //Date givenBirthDate = new Date();
        Cat cat = new Cat("Zula", new Date(), 0);
        Date actual = cat.getBirthDate();
        Date expected = new Date();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        Cat cat = new Cat("Zula", new Date(), 0);
        cat.eat(new Food());
        Integer actual = cat.getNumberOfMealsEaten();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        Cat cat = new Cat("Zula", new Date(), 0);
        Integer actual = cat.getId();
        Integer expected = 0;
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        Cat cat = new Cat("Zula", new Date(), 0);
        Boolean actual = cat instanceof Animal;
        Boolean expected = true;
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        Cat cat = new Cat("Zula", new Date(), 0);
        Boolean actual = cat instanceof Mammal;
        Boolean expected = true;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
