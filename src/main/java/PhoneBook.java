import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    public Map<String, String> contactList = new HashMap<>();

    public int add(String name, String phoneNumber) {
        if (!contactList.containsValue(phoneNumber)) {
            contactList.put(name, phoneNumber);
        } else {
            System.out.println("Контакт с таким номером существует в телефонной книге");
        }
        return contactList.size();
    }
    public String findByNumber(String phoneNumber){
        return null;
    }
}
