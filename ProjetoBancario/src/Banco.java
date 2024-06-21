import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    protected List<Cliente> contas = new ArrayList<Cliente>();

    public Banco(){
    }

    public String getNome(){
        return nome;
    }

}
