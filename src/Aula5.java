public class Aula5 {
    public static void main(String[] args) {
//        Personagem guerreiro = new Guerreiro(100);
//        Personagem mago = new Mago();
//
//        guerreiro.atacar();
//        mago.atacar();

        //classe base
        class Forma{
            public double calcularArea(){
                return 0;
            }

        }

        //Classe Herança Circulo
        class Circulo extends Forma{
            private double raio = 10;
            @Override
            public double calcularArea(){
                return Math.PI * Math.pow(raio, 2);
            }
        }

        //Classe Herança Quadrado
        class Quadrado extends Forma{
            private double lado = 10;
            @Override
            public double calcularArea(){
                return lado * lado;
            }

        }

        //Polimorfismo em ação
        Forma circulo = new Circulo();
        Forma quadrado = new Quadrado();
        System.out.println("Area do circulo: " + circulo.calcularArea());
        System.out.println("Area do quadrado: " + quadrado.calcularArea());


    }
}
