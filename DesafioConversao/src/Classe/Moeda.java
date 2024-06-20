package Classe;

public class Moeda {
    private String base_code;
    private String target_code;
    private double conversion_rate;
    private double conversion_result;


    public Moeda(String base_code, String target_code) {
        this.base_code = base_code;
        this.target_code = target_code;
    }

    public Moeda(API api){
    this.base_code = api.base_code();
    this.target_code = api.target_code();
    this.conversion_rate = api.conversion_rate();
    this.conversion_result = api.conversion_result();
}

    public Moeda() {

    }


    //GETTER & SETTERS
    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public double getConversion_rate() {
        return conversion_rate;
    }

    public void setConversion_rate(double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(double conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return "Moeda Base: " + base_code + "\nMoeda Escolhida: " + target_code + "\nValor atual: " + conversion_rate
                + "\nValor da Conversão: " + conversion_result;
    }
}
