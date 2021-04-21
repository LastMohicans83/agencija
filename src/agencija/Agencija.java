package agencija;

import java.util.List;
import logic.Racunovodstvo;
import modelOkoLista.Agencija;
import model.Zaposleni;

public class Agencija {
public static void main(String[] args) {
        
    Zaposleni zaposleni1 = new Zaposleni();
        zaposleni1.setId(1);
        zaposleni1.setIme("Pera");
        zaposleni1.setPrezime("Peric");
        zaposleni1.setPlata(100000);
        zaposleni1.setTarget(12);
        zaposleni1.daLiZaposleniImaBonus();
    zaposleni1.ispisiOsobu(zaposleni1.getId(), zaposleni1.getIme(), zaposleni1.getPrezime());
    
    System.out.println(".......................");
    
    Zaposleni zaposleni2 = new Zaposleni();
        zaposleni2.setId(2);
        zaposleni2.setIme("Miki");
        zaposleni2.setPrezime("Mikic");
        zaposleni2.setPlata(50000);
        zaposleni2.setTarget(9);
        zaposleni2.daLiZaposleniImaBonus();
    zaposleni1.ispisiOsobu(zaposleni2.getId(), zaposleni2.getIme(), zaposleni2.getPrezime());
    
    System.out.println("..........................");
    
    Zaposleni zaposleni3 = new Zaposleni(3, "Ana", "Anic", 100000, 11 ,false );
        zaposleni3.daLiZaposleniImaBonus();
        zaposleni3.ispisiOsobu(zaposleni3.getId(), zaposleni3.getIme(), zaposleni3.getPrezime());
        
    Agencija agencija = new Agencija();
        agencija.setBudzet(500000);
        
        
        
        double plate = Racunovodstvo.racunajTroskoveZarade(agencija.getListaZaposlenih());
        
        
               
        








    }

}
