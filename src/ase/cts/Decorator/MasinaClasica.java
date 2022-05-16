package ase.cts.Decorator;

public class MasinaClasica implements iMasina {
    private boolean okMotor;

    //constructor
    public MasinaClasica(boolean okMotor) {
        this.okMotor = okMotor;
    }

    //getter
    public boolean isOkmotor() {
        return okMotor;
    }

    //setter
    public void setOkmotor(boolean okMotor) {
        this.okMotor = okMotor;
    }



    //implementare metoda
    @Override
    public void pornesteMotor(boolean okMotor) {
        if(okMotor)
            System.out.println("Motor pornit");
        else
            System.out.println("Motor oprit");

    }
}
