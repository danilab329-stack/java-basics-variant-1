// java-basics-variant-1
public class Main {
    public static void main(String[] args) {
        int[] attendance = {1, 0, 1, 0, 0, 1, 0};
        int missed = 0;
        
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == 0) {
                missed++;
            }
        }
        
        System.out.println("Всего пропущено дней: " + missed);
        
        if (missed > 3) {
            System.out.println("Студент не допущен к зачету автоматически!");
        } else {
            System.out.println("Студент допущен к зачету.");
        }
        
        System.out.println("Модуль успешно инициализирован в Git!");
    }
}
