import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Timer {
    /**
     * Метод получает от пользователя номер минуты (double)
     * @return время прошеднее с начала работы светофора (>0)
     */
    public  double getHoursNumber() {
        boolean TrueTime = false;
        String getTime;
        double numberOfHours = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (!TrueTime) {

            try {

                System.out.println("Введите номер минуты: ");
                getTime = reader.readLine();
                numberOfHours = Double.parseDouble(getTime);

                if (numberOfHours < 0) {
                    throw new NumberFormatException();
                }

                TrueTime = true;
                reader.close();
            }
            catch (NumberFormatException  | IOException e) {
                System.err.println("Введены некорректные данные!");
            }
        }
        return numberOfHours;
    }

}
