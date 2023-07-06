package entities;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override   // METODO DA SUPERCLASSE MODIFICADO
    public double payment() {       // IRÁ RECEBER O MESMO PAGAMENTO DO FUNCIONARIO NORMAL MAIS
        return super.payment() + additionalCharge * 1.1; // + 110% DA DESPESA ADICIONAL
    }
}
