import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    PhoneBook phoneBook = new PhoneBook();

    @BeforeAll
    public static void testsStarted() {
        System.out.println("Тесты запущены");
    }

    @AfterAll
    public static void testsFinished() {
        System.out.println("Тесты закончены");
    }

    @BeforeEach
    public void testStarted() {
        System.out.println("Старт теста");
    }

    @AfterEach
    public void testFinished() {
        System.out.println("Окончание теста");
    }

    @Test
    public void addTest() {
        String name1 = "Petya";
        String phone1 = "89171456678";
        String name2 = "Olya";
        String phone2 = "89681497863";
        String name3 = "Vasya";
        String phone3 = "89271112233";
        int expected = 3;
        phoneBook.add(name1, phone1);
        phoneBook.add(name2, phone2);
        int res = phoneBook.add(name3, phone3);
        assertEquals(expected, res);
    }

    @Test
    public void findByNumberTest() {
        String name1 = "Petya";
        String phone1 = "89171456678";
        phoneBook.add(name1, phone1);
        String expected = "Petya";
        String res = phoneBook.findByNumber(phone1);
        assertEquals(expected, res);
    }

    @Test
    public void findByNameTest() {
        String name1 = "Petya";
        String phone1 = "89171456678";
        phoneBook.add(name1, phone1);
        String expected = "89171456678";
        String res = phoneBook.findByName(name1);
        assertEquals(expected, res);
    }

    @Test
    public void printAllNamesTest() {
        phoneBook.add("Petya", "89171456678");
        phoneBook.add("Olya", "89681497863");
        phoneBook.add("Vasya", "89271112233");
        String expected = "[Olya, Petya, Vasya]";
        String res = phoneBook.printAllNames();
        assertEquals(expected, res);
    }
}