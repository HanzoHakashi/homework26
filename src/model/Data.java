package model;

import java.util.Scanner;

public class Data {
    private String key;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

//    Методы
    private String read(String message){
        print(message);
        Scanner sc = new Scanner(System.in);
        String key = sc.nextLine();
        return key;
    }
    private void writeKey(){
        String key = read("Впишите ключ");
        setKey(key);
    }

    private void print(String message){
        System.out.println(message);
    }

    private  void writeValue(String message){
        String value = read("Впишите значение");
        setValue(value);
    }

}

