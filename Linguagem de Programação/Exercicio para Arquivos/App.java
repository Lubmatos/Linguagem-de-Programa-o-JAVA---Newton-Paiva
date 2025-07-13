import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void PreencherDados(Scanner ler) throws IOException {
        File arq = new File("Contatos.csv");

        System.out.println("Informe o nome:");
        String nome = ler.nextLine();
        System.out.print("Informe o telefone: ");
        String telefone = ler.nextLine();
        System.out.print("Informe o e-mail: ");
        String email = ler.nextLine();

        BufferedWriter arquivo = new BufferedWriter(new FileWriter(arq, true));
        arquivo.append(nome + ";" + telefone + ";" + email + "\n");
        arquivo.close();
    }

    public static void ExibirDados() throws IOException {
        String linha;
        File arquivo = new File("Contatos.csv");
        if (arquivo.exists()) {
            BufferedReader leitura = new BufferedReader(new FileReader(arquivo));
            while ((linha = leitura.readLine()) != null) {
                System.out.println(linha);
            }
            leitura.close();
        } else {
            throw new IOException("Arquivo inexistente");
        }
    }

    public static void exibirSelecionado(String nome) throws IOException {
        String linha;
        File arquivo = new File("Contatos.csv");
        boolean encontrado = false;
        if (arquivo.exists()) {
            BufferedReader leitura = new BufferedReader(new FileReader(arquivo));
            while ((linha = leitura.readLine()) != null) {
                if (linha.split(";")[0].equalsIgnoreCase(nome)) {
                    System.out.println(linha);
                    encontrado = true;
                }
            }
            leitura.close();
            if (!encontrado) {
                System.out.println("Contato não encontrado.");
            }
        } else {
            throw new IOException("Arquivo inexistente");
        }
    }

    public static void alterarDados(Scanner ler) throws IOException {
        File arquivo = new File("Contatos.csv");
        if (!arquivo.exists()) {
            throw new IOException("Arquivo inexistente");
        }

        System.out.println("Informe o nome do contato que deseja alterar:");
        String nomeBusca = ler.nextLine();

        BufferedReader leitura = new BufferedReader(new FileReader(arquivo));
        ArrayList<String> linhas = new ArrayList<>();
        String linha;
        boolean encontrado = false;

        while ((linha = leitura.readLine()) != null) {
            String[] dados = linha.split(";");
            if (dados[0].equalsIgnoreCase(nomeBusca)) {
                System.out.println("Contato encontrado: " + linha);
                System.out.print("Novo nome (ou pressione Enter para manter): ");
                String novoNome = ler.nextLine();
                if (novoNome.isEmpty()) {
                    novoNome = dados[0];
                }

                System.out.print("Novo telefone (ou pressione Enter para manter): ");
                String novoTelefone = ler.nextLine();
                if (novoTelefone.isEmpty()) {
                    novoTelefone = dados[1];
                }

                System.out.print("Novo e-mail (ou pressione Enter para manter): ");
                String novoEmail = ler.nextLine();
                if (novoEmail.isEmpty()) {
                    novoEmail = dados[2];
                }

                linhas.add(novoNome + ";" + novoTelefone + ";" + novoEmail);
                encontrado = true;
            } else {
                linhas.add(linha);
            }
        }
        leitura.close();

        if (encontrado) {
            BufferedWriter escrita = new BufferedWriter(new FileWriter(arquivo, false));
            for (String l : linhas) {
                escrita.write(l + "\n");
            }
            escrita.close();
            System.out.println("Dados alterados com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public static void excluirLinha(Scanner ler) throws IOException {
        File arquivo = new File("Contatos.csv");
        if (!arquivo.exists()) {
            throw new IOException("Arquivo inexistente");
        }

        System.out.println("Informe o nome do contato que deseja excluir:");
        String nomeBusca = ler.nextLine();

        BufferedReader leitura = new BufferedReader(new FileReader(arquivo));
        ArrayList<String> linhas = new ArrayList<>();
        String linha;
        boolean encontrado = false;

        while ((linha = leitura.readLine()) != null) {
            String[] dados = linha.split(";");
            if (dados[0].equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                System.out.println("Contato removido: " + linha);
            } else {
                linhas.add(linha);
            }
        }
        leitura.close();

        if (encontrado) {
            BufferedWriter escrita = new BufferedWriter(new FileWriter(arquivo, false));
            for (String l : linhas) {
                escrita.write(l + "\n");
            }
            escrita.close();
            System.out.println("Contato excluído com sucesso.");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }

    public static void menu(Scanner ler) throws IOException {
        System.out.println(
                "Digite qual opção:\nA) Escrever no Arquivo\nB) Exibir todo o Arquivo\nC) Exibir Selecionado\nD) Alterar Dados\nE) Excluir Dados");
        String x = ler.nextLine();

        if (x.equalsIgnoreCase("A")) {
            PreencherDados(ler);
        } else if (x.equalsIgnoreCase("B")) {
            ExibirDados();
        } else if (x.equalsIgnoreCase("C")) {
            System.out.println("Informe o nome desejado:");
            String y = ler.nextLine();
            exibirSelecionado(y);
        } else if (x.equalsIgnoreCase("D")) {
            alterarDados(ler);
        } else if (x.equalsIgnoreCase("E")) {
            excluirLinha(ler);
        } else {
            System.out.println("Opção inválida.");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        try {
            menu(ler);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            ler.close();
        }
    }
}
