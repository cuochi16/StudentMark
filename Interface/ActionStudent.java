/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.ArrayList;

/**
 *
 * @author H
 */
public interface ActionStudent<T1,T2> extends Action<T1> {
    public Object add(ArrayList<T1> items, ArrayList<T2> items1);
    public boolean edit(ArrayList<T1> items, ArrayList<T2> items1);
}
