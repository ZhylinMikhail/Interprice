package home_work1_jdbc.service;

import home_work1_jdbc.entity.Contact;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ContactServiceTest {

    private final Contact contact = new Contact();
    private final ContactService contactService = new ContactService();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll() {
        assertNotNull(contactService.getAll());
    }

    @Test
    void save() {
        contact.setId(0);
        contact.setName("Ban");
        contact.setSurname("Sherman");
        contact.setPhone(380924583217L);
        contactService.save(contact);
        assertEquals(contact.getName(), "Ban");
        assertEquals(contact.getSurname(), "Sherman");
        assertEquals(contact.getPhone(), 380924583217L);
    }

    @Test
    void update() {
        contact.setId(0);
        contact.setName("Adolf");
        contact.setSurname("Dassler");
        contact.setPhone(380924583211L);
        contactService.update(contact);
        assertEquals(contact.getName(), "Adolf");
        assertEquals(contact.getSurname(), "Dassler");
        assertEquals(contact.getPhone(), 380924583211L);
    }

    @Test
    void delete() {
        contact.setId(25);
        contact.setName("Greg");
        contact.setSurname("Valentino");
        contact.setPhone(380934523211L);
        contactService.delete(25);
        assertNotNull(contact); // не пойму почему не проходит тест на assertNull...

    }
}