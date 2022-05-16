package ase.cts.Decorator;

import java.util.ArrayList;

public class MainDecorator {
    public static void main(String[] args) {
        ArrayList<MasinaClasica> masini = new ArrayList<>();
        ArrayList<MasinaDecorator> masiniii=new ArrayList<>();

        MasinaClasica masinaClasica=new MasinaClasica(true);
        MasinaDecorator masina=new MasinaDecorator(false);

        masini.add(masinaClasica);
        masiniii.add(masina);

        masini.get(0).pornesteMotor(false);
        masiniii.get(0).pornesteMotor(true);
    }
}
