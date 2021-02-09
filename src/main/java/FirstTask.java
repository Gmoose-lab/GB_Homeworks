import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class FirstTask {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {

    }

        // 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        public static void NewMetod () {
            // целочисленные переменные
            byte a = 120;
            int b = 1;
            short c = 2;
            long d = 987L;
            // числа с плавающей точкой
            float f = 3.4f;
            double v = 6.4;
            // символьные переменные
            char g = 'A';
            // логические
            boolean l = true;
            String G = "Молодец";
        }
    /* Написать метод, вычисляющий выражение a * (b + (c / d))
     и возвращающий результат где a, b, c, d – аргументы этого метода, имеющие тип float.
     */
        public static float New ( float a, float b, float c, float d){
            float result = a * (b + (c / d));
            return result;
        }
    /* 4. Написать метод, принимающий на вход два целых числа и проверяющий,
     что их сумма лежит в пределах от 10 до 20 (включительно),
      если да – вернуть true, в противном случае – false.  */
        public static boolean Sum ( int a, int b){
            if (a + b >= 10 && a + b <= 20) {
                return true;
            } else {
                return false;
            }
        }
        /* 5. Написать метод, которому в качестве параметра передается целое число,
         метод должен напечатать в консоль, положительное ли число передали или отрицательное.
          Замечание: ноль считаем положительным числом. */
        public static void plusminus () {
            int a = -1;
            if (a >= 0) {
                System.out.println("Положительное");
            } else {
                System.out.println("Отрицательное");
            }
                  }
                  /*6. Написать метод, которому в качестве параметра передается целое число.
                   Метод должен вернуть true, если число отрицательное,
                    и вернуть false если положительное.*/
    public static boolean UznatPravdu (int a) {
                if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
    /* 7. Написать метод, которому в качестве параметра передается строка,
     обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!». */
    public static void Name() {
        String name = new String("Леопольд");
        String Fin = "Привет," + name + "!";
        System.out.println(Fin);
    }
    /*8. * Написать метод, который определяет, является ли год високосным,
    и выводит сообщение в консоль. Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный.  */
    public static void VisokosnyGod(){
        int god=1766;
        int sto=god%100;
        if (god%4==0 && sto!=0){
            System.out.println("високосный");
                }else if (god%400==0){
            System.out.println("високосный");
        }else{
            System.out.println("не високосный");
        }
    }





}



