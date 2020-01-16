package CadastroPet;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Responsavel dono = new Responsavel( //Cria o objeto
                "Victor",
                "Guarido",
                "08390-060",
                "20A",
                16,
                "vitoguarido123minecraft@gmail.com",
                "99999-9999"
        );

        Responsavel dono2 = new Responsavel(
                "",
                "",
                "",
                "",
                20,
                "novoemail@gmail.com",
                "111111111"
        );

        Pet animal = new Pet(
                "Pandora",
                "Cachorro",
                "Shit-zu",
                5,
                "Preta e Branca",
                dono,
                Pet.TiposCuidado.Vacina.toString()

        );

        System.out.println(dono.verificarMaiorIdade(dono.getIdade())); //Imprime buscando no objeto dono o metodo verificarMaiorIdade enviando getIdade do objeto dono
        animal.retornarDadosPet();
        animal.retornarDono();

    }

}
