public class Student   
{
    private String name;
    private int alter;
    private String religion;
    
    public Student(String name, int alter, String religion)
    {
        setName(name);
        setAlter(alter);
        setReligion(religion);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAlter(int alter)
    {
        this.alter = alter;
    }
    
    public void setReligion(String religion)
    {
        this.religion = religion;
    }
    
    public String getName()
    {
        return name;
    }

    public int getAlter()
    {
        return alter;
    }

    public String getReligion()
    {
         return religion;   
    }
    
    public void printStudent()
    {
        System.out.println("Student:\t" + name + "\t" + alter + "\t" + religion);
    }
}
