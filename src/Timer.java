import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Timer {
    /**
     * Метод получает от пользователя номер минуты (double)
     * @return время прошеднее с начала работы светофора (>0)
     */
    public static double getHoursNumber() {
        boolean TrueTime = false;
        String getTime;
        double numberOfHours = 0;

        while (!TrueTime) {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.println("Введите номер минуты: ");
                getTime = reader.readLine();
                numberOfHours = Double.parseDouble(getTime);

                if (numberOfHours < 0) {
                    throw new NumberFormatException();
                }

                TrueTime = true;
            } catch (NumberFormatException  | IOException e) {
                e.printStackTrace();
            }
        }
        return numberOfHours;
    }

}
