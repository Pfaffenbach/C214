import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaInimigo {

    InimigoService inimigoService;

    public BuscaInimigo(InimigoService inimigoService) {
        this.inimigoService = inimigoService;
    }

    public Inimigo buscaInimigo(int id){
        String inimigoJSON = inimigoService.busca(id);

        // convertendo a string inimigojson para um JsonObject
        JsonObject jsonObject = JsonParser.parseString(inimigoJSON).getAsJsonObject();

        return new Inimigo(jsonObject.get("nome").getAsString(),
                jsonObject.get("qtdVida").getAsDouble(),
                jsonObject.get("arma").getAsString());
    }
}
