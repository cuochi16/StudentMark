/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public interface Action<T> {

    public Object add();
    public boolean edit(ArrayList<T> items);
    public boolean delete(ArrayList<T> items);
    public void show(ArrayList<T> items);
    
}
