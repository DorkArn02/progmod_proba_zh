import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Recipes
{
    HashMap<String, String> recipes = new HashMap<>();

    /**
     * Puts a specified element into the hashmap
     * @param name Key
     * @param description Value
     */
    public void add(String name, String description){
        recipes.put(name, description);
    }

    /**
     * Deletes a specified element from the hashmap
     * @param name Key
     */
    public void delete(String name){
        recipes.remove(name);
    }

    /**
     * Returns an arraylist which is containing array of strings
     * @return ArrayList<String[]>
     */
    public ArrayList<String[]> getItems(){
        ArrayList<String[]> t = new ArrayList<>();

        for(Map.Entry<String, String> entry : recipes.entrySet()){
            String k = entry.getKey();
            String v = entry.getValue();

            t.add(new String[]{k, v});
        }
        return t;
    }

}
