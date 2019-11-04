public class Account {

    private String id = "Conta1";
    private String nome = "Joao";
    private int balance = 0;

    public Account(){

    }

    public Account (String id) {
        this.id = id;
    }

    public Account (String id , String nome){
        this.id = id;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credito(int ammount){
        balance = balance + ammount;
        return balance ;
    }

    public int getcredito(){
        return credito(500);
    }

    public int debito(int ammount){
        balance = balance -ammount;
        return balance ;
    }

    public int getdebito(){
        return debito(0);
    }

    public String toString(){
        return String.format ("Account: ID: %s , Name: %s , Balance: %d , Debito: %d",
                id , nome , credito(500), debito(100));
    }

}
