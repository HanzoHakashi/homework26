package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import exception.CustomException;
import model.Data;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileService implements DataBase{
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("data/data.json");
    private static final String HEADER = "\n Key        |         Value                |";
    private static final String LINE = " %-10s | %-28s |";
    private static final String NEW_LINE = "\n";

    public static Data[] getData() {
        String json = "";
        try {
            json = Files.readString(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return GSON.fromJson(json, Data[].class);
    }

    public void action(Data[] data){
        data = getData();

        int choice = choice("1 - Выбрать даннные по индексу;\n" +
                "2 - ;\n" +
                "3 - ;\n" +
                "4 - ;\n" +
                "5 - ;\n" +
                "6 - ;" + NEW_LINE);
        switch (choice){
            case 1:
                readDataByIndex();
                break;
        }
    }
    private int choice(String message) {
        print(message);
        Scanner scanner = new Scanner(System.in);
        try {
           int answer = scanner.nextInt();
            return answer;
       }catch (Exception e){

            return choice("Такого элемента нет\nПопробуйте еще раз\n");
        }

    }


    //    Методы
    private void print(String message) {
        System.out.print(message);
    }

    public void printData(){
        Data[] data = getData();
        StringBuilder sb = new StringBuilder(HEADER).append(NEW_LINE);
        for (int i = 0; i < data.length; i++) {
            sb.append(String.format(LINE, data[i].getKey(), data[i].getValue()));
            sb.append(NEW_LINE);
        }
        print(sb+NEW_LINE);
    }

    @Override
    public void openConnection() {
        java.util.Random r = new java.util.Random();
        System.out.println("Идет подключение к базе данных ....");
        int connection = r.nextInt(100)+1;
        if (connection > 10){
            System.out.println("Подключение прошло успешно");
            printData();
            action(getData());
        }else {
            System.out.println("Не удалось подключится к серверу");
        }
    }

    @Override
    public void closeConnection() {

    }

    @Override
    public void checkConnection() {

    }

    @Override
    public void readDataByIndex()  {
        Data[] data = getData();
        try {
            int choice = choice("Укажите индекс\n");
            StringBuilder sb = new StringBuilder(String.format(LINE,data[choice-1].getKey(),data[choice-1].getValue())).append(NEW_LINE);
            print(sb+NEW_LINE);
            action(data);
        }catch (Exception e){
            print("Такого элемента нет");
            readDataByIndex();
        }

    }

    @Override
    public void checkData() {

    }

    @Override
    public void checkDataByKey() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void checkAmount() {

    }

    @Override
    public void addEntryToBase() {

    }

    @Override
    public void uploadEntryByIndex() {

    }

    @Override
    public void uploadByKey() {

    }
}
