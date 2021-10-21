import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {
    private static ContactManager contactManager;

    @BeforeAll
    public static void setup(){
        System.out.println("Instantiating contact before the all test cases ");
    }
    @BeforeEach
    public void setupAll(){
        System.out.println("Instantiating contact Manager");
    }
    @Test
    @DisplayName("Should create contact")
    public void shouldCreateContact() {
        ContactManager contactManager = new ContactManager();
        contactManager.addContact("Hanumanth", "S", "0810664053");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }

    @Test
    @DisplayName("Should not create contact when first name is null")
    public void throwErrorWhenFirstNameIsNull() {
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact(null, "s", "0810664053");
        });

    }

    @Test
    @DisplayName("Should not create contact when last name is null")
    public void throwErrorWhenLastNameIsNull() {
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("hanu", null, "0810664053");
        });
    }

    @Test
    @DisplayName("Should not create contact when phone number is null")
    public void throwErrorWhenPhoneNumberIsNull() {
        ContactManager contactManager = new ContactManager();
        Assertions.assertThrows(RuntimeException.class, () -> {
            contactManager.addContact("Hanumanth", "s", null);
        });

    }
    @AfterEach
    public void finish(){
        System.out.println("Should execute after each test case");
    }
    @AfterAll
    public static void finishAll(){
        System.out.println("Should execute at the end of the test case");
    }
}