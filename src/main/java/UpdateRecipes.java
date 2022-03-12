import java.util.Map;

public class UpdateRecipes extends Recipes{
    /**
     * Changes the description of specific item in the hashmap
     * @param name Key
     * @param description Value
     */
    public void update(String name, String description) {
        for(Map.Entry<String, String> entry : recipes.entrySet()){
            if(entry.getKey().equals(name)){
                entry.setValue(description);
            }
        }
    }
}
