package Problema1;

public class PerecheNumere {

    private int numar1;
    private int numar2;

    public PerecheNumere() {
    }

    public PerecheNumere(int numar1, int numar2) {
        this.numar1 = numar1;
        this.numar2 = numar2;
    }

    public int getNumar1() {
        return numar1;
    }

    public int getNumar2() {
        return numar2;
    }

    public int setNumar1(int numarnou)
    {
        numar1=numarnou;
        return numar1;
    }

    public int setNumar2(int numarnou)
    {
        numar2=numarnou;
        return numar2;
    }

    public String toString()
    {
        return "Numar 1: " + numar1 + "\nNumar 2: " + numar2;
    }

    public boolean Fibonacci()
    {
        int a,b,c;
        a=1;
        b=1;
        c=a+b;
        while(c<numar2)
        {
            a=b;
            b=c;
            c=a+b;
        }
        if(numar1==b && numar2==c)
            return true;
        else
            return false;
    }

    public int cmmmc()
    {
        int cmmmc=0,m=1;
        while(cmmmc==0)
        {
            if(numar1*m==numar2*m)
                cmmmc=m;
            m++;
        }
        return cmmmc;
    }

    public boolean suma_cifrelor()
    {
        int suma1=0,suma2=0,nr1=numar1,nr2=numar2;
        while(nr1!=0)
        {
            suma1+=nr1%10;
            nr1=nr1/10;
        }
        while(nr2!=0)
        {
            suma2+=nr2%10;
            nr2=nr2/10;
        }

        if(suma1==suma2)
            return true;
        return false;
    }

}
