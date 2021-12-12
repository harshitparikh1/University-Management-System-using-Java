/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author jshar
 */
public class MenuDirectory {
    private ArrayList<Menu> menuDirectory;
    
    public MenuDirectory() {
        menuDirectory = new ArrayList();
    }

    public ArrayList<Menu> getMenuDirectory() {
        return menuDirectory;
    }

    public void setMenuDirectory(ArrayList<Menu> menuDirectory) {
        this.menuDirectory = menuDirectory;
    }
    
    public Menu newItem(String itemName, double price, String res, List<Ingredients> ingredients) {
        Menu menu = null;
        if(Objects.nonNull(ingredients)){
          menu = new Menu(itemName, price, res,ingredients);   
        }
        else{
          menu = new Menu(itemName, price, res, new ArrayList<Ingredients>());   
        }
        
        menuDirectory.add(menu);
        return menu;
    }
    
    public void removeMenu(Menu menu) {
        menuDirectory.remove(menu);
    }
}
