package shilian;

/**
 * Author:  blithe.xwj
 * Date:    2020/11/15 21:23
 * Description:
 */

class xuwrntao {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int year;
        int month;
        int day;

        do {
            System.out.println("在这里输入正确的年份：");
            year = scanner.nextInt();


        } while (year < 0);

        do {
            System.out.println("在这里输入正确的月份：");
            month = scanner.nextInt();
        } while (month < 0 || month > 12);

        do {
            System.out.println("在这里输入正确的日：");
            day = scanner.nextInt();
        } while (!checkDay(year, month, day));

        Date date = new Date(year, month, day);
        date.print();
    }

    /**
     * 判断当前输入的年是否合法
     */
    private static boolean checkYear(int year) {
        return year > 0;
    }

    /**
     * 判断当前输入的月份是否合法
     */
    private static boolean checkMoth(int month) {
        return month > 0 && month <= 12;
    }

    private static boolean checkDay(int year, int month, int day) {
        if (month == 1
                || month == 3
                || month == 5
                || month == 7
                || month == 8
                || month == 10
                || month == 12) {
            if (day < 0 || day > 31) {
                System.out.println("不好意思" + month + "月只有31天，您输入的日期有误");
                return false;
            }
        } else if (month == 4
                || month == 6
                || month == 9
                || month == 11) {
            if (day < 0 || day > 30) {
                System.out.println("不好意思" + month + "月只有30天，您输入的日期有误");
                return false;
            }
        } else if (month == 2) {
            //判断是否是闰年
            boolean isRunYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
            if ((day < 0 || day > 29) && isRunYear) {
                System.out.println("不好意思，闰年的二月只有29天，您输入的日期有误");
                return false;
            } else if ((day < 0 || day > 28) && !isRunYear) {
                System.out.println("不好意思，闰年的二月只有28天，您输入的日期有误");
                return false;
            }
        }

        return true;
    }
}