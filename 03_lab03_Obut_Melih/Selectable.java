/**
 * Interface class that enable to select shapes
 * 
 * @author melihobut
 * @date 10.03.2020
 */
public interface Selectable {
 boolean getSelected();
 void setSelected(boolean selected);
 void contains(int x, int y);
}
