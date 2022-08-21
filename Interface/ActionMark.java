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
public interface ActionMark<T,T1,T2> extends Action<T> {
    public Object add(ArrayList<T> items, ArrayList<T1> items1, ArrayList<T2> items2);
    public boolean edit(ArrayList<T> items, ArrayList<T1> items1, ArrayList<T2> items2);
}
