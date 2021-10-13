/**
 * Interface class that enable to select shapes
 * 
 * @author melihobut
 * @date 10.03.2020
 */
public interface Selectable {
   boolean isSelected();
   Shape contains(int paramInt1, int paramInt2);
   void setSelected(boolean paramBoolean);
}

