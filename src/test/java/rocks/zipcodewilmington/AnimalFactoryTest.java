package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    @Before
    public void setUp() {

    }

    @After
    public void tearDown(){
    }

    @Test
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    public void createDogTest(){
        Dog dog = AnimalFactory.createDog("Sophie", new Date(1));
        String actualName = dog.getName();
        String expectedName = "Sophie";
        Date actualDate = dog.getBirthDate();
        Date expectedDate = new Date(1);

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }


    @Test
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    public void createCatTest(){
        Cat cat = AnimalFactory.createCat("Zula", new Date(1));
        String actualName = cat.getName();
        String expectedName = "Zula";
        Date actualDate = cat.getBirthDate();
        Date expectedDate = new Date(1);

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);

    }
}
