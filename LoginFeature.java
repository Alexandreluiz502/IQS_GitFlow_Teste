import java.util.Scanner;

public class LoginFeature {
    private String nome;
    private String senha;

    // Construtor
    public LoginFeature(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }


    public boolean login(String nomeDigitado, String senhaDigitada) {
        if (this.nome.equals(nomeDigitado) && this.senha.equals(senhaDigitada)) {
            System.out.println("✅ Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("❌ Nome de usuário ou senha incorretos.");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um usuário pré-definido
        LoginFeature usuario = new LoginFeature("admin", "1234");

        // Solicita as credenciais ao usuário
        System.out.print("Digite o nome de usuário: ");
        String nomeDigitado = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        // Tenta fazer login
        usuario.login(nomeDigitado, senhaDigitada);

        scanner.close();
    }
}
