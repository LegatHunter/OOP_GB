import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserDataApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите данные в формате: Фамилия Имя Отчество дд.мм.гггг НомерТелефона Пол (f/m)");

        String userData = scanner.nextLine();

        String[] userDataArray = userData.split("\\s+");

        if (userDataArray.length != 6) {
            System.out.println("Неверное количество данных. Введите данные в указанном формате.");
            return;
        }

        try {
            validateAndWriteToFile(userDataArray);
        } catch (IOException | ParseException | IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }

    private static void validateAndWriteToFile(String[] userDataArray) throws IOException, ParseException {
        String surname = userDataArray[0];
        String name = userDataArray[1];
        String patronymic = userDataArray[2];

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date dateOfBirth = dateFormat.parse(userDataArray[3]);

        String phoneNumber = userDataArray[4];

        String gender = userDataArray[5];
        if (!gender.equals("f") && !gender.equals("m")) {
            throw new IllegalArgumentException("Некорректное значение пола. Используйте 'f' или 'm'.");
        }

        String fileName = surname + ".txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));

        String userData = surname + " " + name + " " + patronymic + " " + dateFormat.format(dateOfBirth) + " " +
                phoneNumber + " " + gender;

        writer.write(userData);
        writer.newLine();
        writer.close();

        System.out.println("Данные успешно записаны в файл " + fileName);
    }
}