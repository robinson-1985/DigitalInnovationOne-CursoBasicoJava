package heranca.exemplo003_heranca;

public class Exemplo003 {

    public static void main(String[] args) {

        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto()); // 10.0

        Veiculo carro = new Carro();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto()); // 70.0

        Veiculo moto = new Motocicleta();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto()); // 30.0
    }
}
