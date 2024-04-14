package week07;

import java.util.Arrays;

public class MobilePhone extends OldPhone {
    private String[] calledNumbers;
    int memorySpace = 10;

    MobilePhone(String brand) {
        super(brand);
        calledNumbers = new String[memorySpace];
    }
    public void call(String number) {
        super.call(number);
        addCalledNumber(number);
    }

    void addCalledNumber(String number) {
        boolean memoryFull = true;
        for (int i = 0; i < memorySpace; i++) { // adding number to first empty space in 10 space array
            if (calledNumbers[i] == null) {
                calledNumbers[i] = number;
                memoryFull = false;
                break;
            }
        }
        if (memoryFull) {
            for (int i = 0; i < memorySpace; i++) {
                if (i == memorySpace - 1) {
                    calledNumbers[i] = number;
                } else {
                    calledNumbers[i] = calledNumbers[i + 1];
                }
            }
        }
    }
    public void ringAlarm(String alarm) {
        System.out.println("Alarm is on... " + alarm);
    }

    public void playGame(String game) {
        System.out.println("Playing " + game);
    }

    public void printLastNumbers() {
        System.out.println("Previously called numbers: ");
        int descending = memorySpace - 1;
        for (int i = 0; i < memorySpace; i++) {
            String memspace = calledNumbers[descending - i];
            if (memspace != null) {
                System.out.println(memspace);
            }
        }
    }
//    public String[] callHistory() {
//        return calledNumbers;
//    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Arrays.equals(((MobilePhone)obj).calledNumbers,calledNumbers);
        }
        return false;
    }
}
