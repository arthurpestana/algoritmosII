public class Main {
    public static void main(String[] args) {
        Loja loja = new Loja("Comércio do Zé", "123123132123");

        Funcionario funcionario1 = new Funcionario("Arthur", "12312123123", 20000.00);
        Funcionario funcionario2 = new Funcionario("Heitor", "53224123123", 5000.00);

        CheckIn checkIn1 = new CheckIn(funcionario1);
        checkIn1.setHoraEntrada(7, 30);
        checkIn1.setHoraSaida(18, 0);
        CheckIn checkIn2 = new CheckIn(funcionario2);
        checkIn2.setHoraEntrada(8, 0);
        checkIn2.setHoraSaida(14, 0);

        loja.setCheckIns(checkIn1);
        loja.setCheckIns(checkIn2);

        for (CheckIn checkIn : loja.getCheckIns()) {
            System.out.println("Quantidade de horas trabalhadas do funcionário "+checkIn.getFuncionario().getNome()+": "+checkIn.calcHorasTrabalhadas());
        }
    }
}