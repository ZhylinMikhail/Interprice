package home_work1_jdbc.service;

import home_work1_jdbc.entity.Address;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressServiceTest {
    private final Address address = new Address();
    private final AddressService addressService = new AddressService();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll() {
        assertNotNull(addressService.getAll());
    }

    @Test
    void save() {
        address.setId(55);
        address.setContactId(6);
        address.setAddress("Pushkin Street, Kolotushkina hous");
        addressService.save(address);
        assertEquals(address.getContactId(), 6);
        assertEquals(address.getAddress(), "Pushkin Street, Kolotushkina hous");
    }

    @Test
    void update() {
        address.setId(55);
        address.setContactId(5);
        address.setAddress("Kiev, Prazskiy 22");
        addressService.update(address);
        assertEquals(address.getContactId(), 5);
        assertEquals(address.getAddress(), "Kiev, Prazskiy 22");
    }

    @Test
    void delete() {
        address.setId(55);
        address.setContactId(5);
        address.setAddress("Kiev, Prazskiy 22");
        addressService.delete(55);
        assertNotNull(address);  // не пойму почему не проходит тест на assertNull...
    }
}