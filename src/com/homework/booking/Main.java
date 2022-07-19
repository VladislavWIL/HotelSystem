package com.homework.booking;

import com.homework.booking.empty.*;
import com.homework.booking.interfaces.IWorker;
import com.homework.booking.service.BookingService;

/**
 * В данном домешнем задании нужно написать систему бронирования номеров в отеле.
 * Сущности: Client, Hotel, Room, Bill
 *
 * Client будет содержать поля: имя, фамилию, номер телефона, почту, ссылку на Bill
 * В Bill будет сумма денег
 * Hotel будет содержать поля: имя отеля, список номеров
 * Room будет содежрать количество человек, которых можно разместить, стоимость этого номера и сободен ли этот номер
 *
 * Сценраии:
 * Нужно создать несколько клиентов с счетами и внести им первоначальную сумму. Так же нужно создать
 * несколько отелей, с разными наборами номеров (В списке внутри сущности Hotel)
 * Клиент должен попробывать забронировать номер, для этого он так же указывает
 * сколько человек в номере ему нужно разместить. После успешного бронирования списывать сумму со счета клиента.
 *
 * Так же при бронировании проверять есть ли свободные номера
 *
 * В одном из сценариев, клиенту должно не хватить денег для бронирования номера
 *
 * В методе main не нужно проводить никаких операция, кроме создания начальных объектов, сервисов и вызова их методами
 */

public class Main {

    public static void main(String[] args) {

        //create clients
        Bill vladBill = new Bill(9999);
        Client vlad = new Client("Vlad", "Family", "8992", "post@mail.ru", vladBill);

        Bill svetaBill = new Bill(14044);
        Client sveta = new Client("Sveta", "Family2", "1234", "google@mail.ru", svetaBill);

        //create RoomsOfHotel
        Room[] moskovHotelRoom = new Room[]{new Room(1, 1300, true), new Room(3, 4000, true),
        new Room(2, 2100, true)};
        IWorker[] moskovHotelWorker = new IWorker[] {new CleanerWorker("Ira", 2), new CleanerWorker("Sveta", 5)};
        Hotel moskovHotel = new Hotel("Moscow", moskovHotelRoom);
        moskovHotel.setWorkers(moskovHotelWorker);
        moskovHotel.getWorker();

        Room[] orenburgHotelRoom = new Room[]{new Room(5, 4300, true), new Room(2, 1000, true),
                new Room(4, 2100, true)};
        Hotel orenburgHotel = new Hotel("Orenburg", orenburgHotelRoom);

        moskovHotel.getFreeRooms();
        BookingService bookingService = new BookingService();
        bookingService.book(moskovHotel, vlad, 2);
        /**/
        System.out.println("\n");
        moskovHotel.getFreeRooms();
    }
}
