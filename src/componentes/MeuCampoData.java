package componentes;

import java.text.SimpleDateFormat;

public class MeuCampoData extends MeuJFormattedTextField {
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public MeuCampoData(String dica, Boolean obrigatorio) {
        super(6, "##/##/####", dica, obrigatorio);
    }

    @Override
    public Boolean eValido() {
        try {
            sdf.setLenient(false);
            sdf.parse(getText());

            return true;
        } catch (Exception e) {
            e.printStackTrace();

            return false;
        }
    }
}
