package com.homework.booking.service;

import com.homework.booking.empty.Client;
import com.homework.booking.empty.Hotel;
import com.homework.booking.empty.Room;
import com.homework.booking.empty.Bill;

public class BookingService {

    public void book(Hotel hotel, Client client, int numberOfPerson) {

        int tempNumber = 0;

        Room[] rooms = hotel.getRooms();

        for (Room room : rooms) {
            boolean statusRoom = room.isFree();
            int numberOfPersonRoom = room.getNumberOfPerson();
            tempNumber++;

            if ((statusRoom == true) && (numberOfPersonRoom == numberOfPerson)) {

                int priceHotel = room.getCost();
                Bill bill = client.getBill();
                int amountBill = bill.getAmount();

                if ((amountBill - priceHotel) > 0) {
                    System.out.println("Вы успешно арендовали комнату №" + tempNumber + " in " + hotel.getNameHotel() + " : Стоимость комнаты - " + priceHotel + " : " +
                            " количество спальных мест в комнате " + numberOfPersonRoom);
                    room.setFree(false);

                    break;
                } else {
                    System.out.println("Для аренды комнаты № " + tempNumber + " у Вас не хватает " + ((amountBill - priceHotel) * (-1)) + " руб." );
                }
            }

        }
    }
}
