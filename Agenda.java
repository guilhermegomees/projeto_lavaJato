package lavajato;

public class Agenda {
    
    private Carro carro;
    private int dia;
    private int mes;
    private String hora;
    
    public Agenda(Carro carro, int dia, int mes, String hora){
        this.carro = carro;
        this.dia = dia;
        this.mes = mes;
        this.hora = hora;
    }
    
     public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
     public void agendamento(){
        String x =  "Informações do Carro:\n   Marca: " + this.carro.getMarca() + "\n   Modelo: " + this.carro.getModelo() + "\n   Placa: " + this.carro.getPlaca() + " " + "\nData: " + this.dia + "/" + this.mes + "\nHora: " + this.hora;
        System.out.println(x);
    }
}
