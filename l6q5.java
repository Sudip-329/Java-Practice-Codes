 class multiply {
    static int multi(int a, int b) {
        return a * b;
    }
    static int multi(int a, int b, int c){
        return a * b * c;
    }
    static double multi(double a, int b, int c){
        return a * b * c;
    }
}

class l6q5{
    public static void main(String[] args) {
        System.out.println(multiply.multi(11, 11));
        System.out.println(multiply.multi(13, 2, 3));
        System.out.println(multiply.multi(13.12, 2, 3));
    }
}
