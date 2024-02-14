package Part2;

public class Student {

	private String name;
	private int roll_no;
	private int mark1;
	private int mark2;
	private int mark3;
	private int mark4;
	private int mark5;
	public Student(String name, int roll_no, int mark1, int mark2, int mark3, int mark4, int mark5) {
		super();
		this.name = name;
		this.roll_no = roll_no;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
		this.mark5 = mark5;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	public int getMark4() {
		return mark4;
	}
	public void setMark4(int mark4) {
		this.mark4 = mark4;
	}
	public int getMark5() {
		return mark5;
	}
	public void setMark5(int mark5) {
		this.mark5 = mark5;
	}
	
	

}

package Part2;

public interface Exam {
    int percent_cal();
}

package Part2;

public class Result extends Student implements Exam {

    // Constructor
    public Result(String name, int roll_no, int mark1, int mark2, int mark3, int mark4, int mark5) {
        super(name, roll_no, mark1, mark2, mark3, mark4, mark5);
    }

    @Override
    public int percent_cal() {
        return (getMark1() + getMark2() + getMark3() + getMark4() + getMark5()) / 5;
    }

    public static void main(String[] args) {
        // Create a Result object
        Result studentResult = new Result("Doe", 123, 80, 85, 90, 78, 92);

        // Display student information
        System.out.println("Student Name: " + studentResult.getName());
        System.out.println("Roll Number: " + studentResult.getRoll_no());


        // Display updated marks
        System.out.println("Marks:");
        System.out.println("Mark 1: " + studentResult.getMark1());
        System.out.println("Mark 2: " + studentResult.getMark2());
        System.out.println("Mark 3: " + studentResult.getMark3());
        System.out.println("Mark 4: " + studentResult.getMark4());
        System.out.println("Mark 5: " + studentResult.getMark5());

        // Calculate and display the percentage
        int percentage = studentResult.percent_cal();
        System.out.println("Percentage: " + percentage + "%");
    }
}
