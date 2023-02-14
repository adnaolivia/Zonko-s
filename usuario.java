import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Usuario {
  private String nome;
  private String email;
  private int senha;
  private int id;

  public Usuario(String nome, String email, int senha, int id) {
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getSenha() {
    return senha;
  }

  public void setSenha(int senha) {
    this.senha = senha;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean verificarEmail() {
    String padrao = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)+$";
    Pattern pattern = Pattern.compile(padrao);
    Matcher matcher = pattern.matcher(email);
    return matcher.matches();
  }

  public boolean verfUsuario() {
    return true;
  }
}
