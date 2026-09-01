package V11;

interface Nsam{
    void cal(int a,int b);


}

public class test {
    public static void main(String[] args) {
        Nsam n=(int a,int b)->{

                 System.out.println("sum:"+(a+b));
            };
        n.cal(10,20);

        Nsam n1=(int a,int b)->{
            System.out.println("pro:"+(a*b));
        };
        n1.cal(10,20);


    }
}
