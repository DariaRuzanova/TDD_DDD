import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();
    @BeforeEach
    public void testStarted(){
        System.out.println("Старт теста");
    }
    @AfterEach
    public void testFinished(){
        System.out.println("Окончание теста");
    }
    @Test
    public void addTest(){
        String name1 = "Petya";
        String phone1 = "89171456678";
        String name2 = "Olya";
        String phone2 = "89681497863";
        String name3 = "Vasya";
        String phone3 = "89271112233";
        int expected = 3;
        phoneBook.add(name1,phone1);
        phoneBook.add(name2,phone2);
        int res = phoneBook.add(name3,phone3);
        assertEquals(expected,res);
    }
}