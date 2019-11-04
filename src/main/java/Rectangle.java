public class Rectangle {

        private float altura = 1.0f;
        private float largura = 1.0f;

    public Rectangle(){

    }

    public Rectangle(float altura) {
        this.altura = altura;
    }

    public Rectangle (float altura , float largura){
        this.largura = largura;
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public double getArea(){
        return altura * largura;
    }

    public double getPerimetro(){
        return 2*altura + 2*largura;
    }

        public String toString(){
        return String.format ("Rectangle: Altura: %.2f , Largura: %.2f , Area: %.2f , Perimetro: %.2f",
         altura, largura , getArea() , getPerimetro());
    }
    }

