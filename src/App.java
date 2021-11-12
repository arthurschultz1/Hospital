import java.time.LocalDate;
import java.time.Month;

public class App {
    
    public static void main(String[] args){
        // Tipo nome = new Tipo()
        Medico paulo = new Medico();
        Medico joana = new Medico();

        paulo.CRM = "1234";
        paulo.nome = "Paulo Almeida Prado";
        paulo.dataDeNascimento = LocalDate.of(1967, Month.APRIL, 26);
        paulo.telefoneDeContato = "(051) 99999 9999";

        joana.CRM = "5678";
        joana.nome = "Joana Silva Da Silva";
        joana.telefoneDeContato = "(051) 88888 8888";
         // Imprimir os nomes
         System.out.println(paulo.nome);
         System.out.println(joana.nome);
    }

}