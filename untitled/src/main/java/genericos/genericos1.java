package genericos;

public class genericos1 {
    public static void main(String[] args) {
        double nEntero= (double) Calc.suma(3.4, 4.7);
        System.out.println(nEntero);
        String cocatendado = Calc.concatenar(2,3);
        System.out.println(cocatendado);
        int a[]={4,12};
        int b[]={13,56};
        String nArray[] = Calc.concatenarArrays(a,b);
        for(int i=0;i<nArray.length;i++){
            System.out.print(nArray[i]+" ");
        }

    }
}
