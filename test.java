public class test {
    public static void main(String[] args) {
    A f=new A();
    A test=new A(3,4,50);
    f.a=1;
    f.b=2;
    f.c=3;
        System.out.println(f.a +" "+f.b+" "+f.c);
        System.out.println(test.a +" "+test.b+" "+test.c);
    }
}
