public class StudentClass{
    String firstname;
    String lastname;
    String course;

    public String getfirstname() 
    {
      return firstname;
    }

    public void setfirstname(String firstname) 
    {
      this.firstname = firstname;
    }

  public String getlastname() 
  {
   return lastname;
  }

  public void setlastname(String lastname) 
  {
   this.lastname = lastname;
  }

  public String getcourse() 
  {
   return course;
  }

  public void setcourse(String course) 
  {
   this.course = course;
  }

  public StudentClass(String firstname, String lastname, String course) {
   super();
   this.firstname = firstname;
   this.lastname = lastname;
   this.course= course;
  }
   

public StudentClass()
{

}

@Override
public String toString() {
   return "firstname=" + firstname + ", "
           + "lastname=" + lastname + ", course="
           + course + "]";
}


}



