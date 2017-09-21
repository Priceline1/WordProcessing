/**
 * 
 * @author Justin Price
 * This class stores the information about the indexes of words surrounding a word in a given sentence
 * Essentially storing a reference to surrounding words.
 *
 */
public class IndexAssociation implements Comparable
{
/**
   * Orientation is true if the index of the word was to the right
   * otherwise it is false and the index was to the left
   */
  private boolean orientation;
  private int index;
  private int count;
  public IndexAssociation(int i, boolean o)
  {
    index = i;
    orientation = o;
  }
  public int getIndex()
  {
    return index;
  }
  public int getCount()
  {
    return count;
  }
  public boolean getOrientation()
  {
    return orientation;
  }
  @Override
  public String toString()
  {
   return orientation + " " + index + " " + count; 
  }
  @Override
  /**
  * Compares the object's (if aplicable) index to this object
  */
  public int compareTo(Object other)
  {
    if(other == null)
      throw new NullPointerException();
    IndexAssociation x;
    try
    {
      x = (IndexAssociation)other;
    }
    catch (ClassCastException e)
    {
      throw e;
    }
    if(index > x.getIndex())
    {
      return 1;
    }
    else if(index == x.getIndex())
    {
      return 0;
    }
    else
    {
      return -1;
    }
  }
}
