package ase.cts.Decorator;

public class MasinaDecorator implements iMasina {
    private boolean okincalzire;

    //constructor
    public MasinaDecorator(boolean okincalzire) {
        this.okincalzire = okincalzire;
    }

    //GETTER
    public boolean isOkincalzire() {
        return okincalzire;
    }

    //SETTER
    public void setOkincalzire(boolean okincalzire) {
        this.okincalzire = okincalzire;
    }

    //suprascriere metoda din INTEFATA
    @Override
    public void pornesteMotor(boolean okMotor) {
        if(okMotor)
            System.out.println("Motor pornit");
        else
            System.out.println("Motor oprit");
        incalzireScaune(false);
    }

    //metoda noua
    private void incalzireScaune(boolean areIncalzire)
    {
        if(areIncalzire)
            System.out.println("Scaune incalzite");
        else
            System.out.println("Scaune neincalzite");

    }
}
