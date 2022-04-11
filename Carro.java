package lavajato;

public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    
    public Carro(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    
     public String getMarca() {
         //System.out.println("Marca: " + this.marca);
         return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        //System.out.println("Marca: " + this.marca);
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        //System.out.println(": " + this.marca);
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
