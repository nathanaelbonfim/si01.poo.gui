package componentes;

public interface MeuComponente {
    public void limpar();

    public void habilitar(Boolean status);

    public String getDica();

    public Boolean eObrigatorio();

    public Boolean eValido();
}
