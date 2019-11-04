public class Employee {

    private int id = 1;
    private String primeiro = "Joao";
    private String ultimo = "Correia";
    private int salario = 1000;

    public Employee(){

    }

    public Employee (String primeiro) {
        this.primeiro = primeiro;
    }

    public Employee (String primeiro , String ultimo){
        this.primeiro = primeiro;
        this.ultimo = ultimo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(String primeiro) {
        this.primeiro = primeiro;
    }

    public String getUltimo() {
        return ultimo;
    }

    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getsalarioanual(){
        return salario * 12;
    }

    public int getsalario(){
        return salario + (salario * 10) / 100 ;
    }

    public String toString(){
        return String.format ("Employee: ID: %d , Primeiro Nome: %s , Ultimo Nome: %s , Salario: %d",
                id , primeiro , ultimo , getsalario());
    }

}
