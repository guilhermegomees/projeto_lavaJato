package lavajato;

public class LavaJato {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Volksvagen", "Gol", "KRS-2831");
        Carro carro2 = new Carro("Fiat", "Uno", "EEF-3183");
        Carro carro3 = new Carro("Chevrolet", "Camaro", "BYK-7140");
        
        Agenda agenda1 = new Agenda(carro3, 07, 04, "14:30");
        
        agenda1.agendamento();
    }
    
}
