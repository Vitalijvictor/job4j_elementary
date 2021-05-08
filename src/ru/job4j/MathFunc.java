package ru.job4j;

public class MathFunc { //если метод ,,void,, то он ,,пустой,, не возможно воспользоваться вычисленным результатом.. Чтобы вывести в консоль надо написать System.out.print(y);

    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static void func2(int x) {
        int y = 1 / x;        
    }

    public static void main(String[] args) {
        MathFunc.func1(3);
        MathFunc.func1(5);
    }
}


/*public class MathFunc2 {

    public static int func1(int x) { // перед  названием метода func1 написан его тип int, это значит мы можем воспользоваться результатом. (return y;)
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static void main(String[] args) {
        int result1 = MathFunc2.func1(3);
        int result2 = MathFunc2.func1(5);
        int total = result1 + result2;
        System.out.println(total);
    }
}*/