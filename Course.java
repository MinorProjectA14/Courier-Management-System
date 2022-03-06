class Course{
String courseName;
Course (String courseName)
{
this.courseName = courseName;
}
public int courseFee ()
{
return 2500;
}
public double calculateFee (){
double totalFee = 0.0;
if (courseName.equalsIgnoreCase ("Java"))
{
totalFee = this.courseFee() - (this.courseFee() * 0.05) ;}
return totalFee;
}
}
class PGCourse extends Course{
int courseWorkFee;
PGCourse (String courseName, int courseWorkFee) {
super (courseName);
this.courseworkFee = courseWorkFee;
}
public int pgCourseFee (){
return this.courseWorkFee + 1500;
}
public double calculateFee () {
return super.calculateFee () + this.pgcourse Fee ();}
public static void main (String args[]) {
PGCourse pgobj = new PGCourse (" JAVA", 2500);
System.out.println (pgobj.calculateFee ());
}
}
