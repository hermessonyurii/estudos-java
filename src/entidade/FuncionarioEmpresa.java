package entidade;

public class FuncionarioEmpresa {
    public double salario = 6250.00;

    // void significa (vazio)
    public double SalarioFinal(double bonus){
        /*
        * FGTS
        * HORAS EXTRAS
        *
         */

        return salario - 60 + bonus;
    }
}
