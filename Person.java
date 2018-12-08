
/**
 * Write a description of interface Person here.
 *
 * @author Nick Coyle
 * @version 12/10/2018
 */
public interface Person
{
    public abstract String getFirstName();
    public abstract String getLastName();
    public abstract String getID();
    
    public abstract Sex getSex();
    
    public abstract int getDay();
    public abstract int getMonth();
    public abstract int getYear();
 
    public abstract void setFirstName(String firstName);
    public abstract void setLastName(String lastName);
    public abstract void setID(String id);
    
    public abstract void setSex(Sex sex);
    
    public abstract void setDay(int day);
    public abstract void setMonth(int month);
    public abstract void setYear(int year);
}
