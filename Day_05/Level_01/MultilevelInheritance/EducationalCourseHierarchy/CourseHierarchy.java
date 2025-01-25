package MultilevelInheritance.EducationalCourseHierarchy;

//course class - superclass
class Course {
    private String courseName;
    private int duration;

    //constructor of course class
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    //using method to display course details
    public void getCourseDetails() {
        System.out.println("Course Details:");
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

//OnlineCourse subclass
class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    //Constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    //overriding method
    public void getCourseDetails() {
        super.getCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + isRecorded);
    }
}

//PaidOnlineCourse subclass
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    //constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    // Overriding getCourseDetails
    @Override
    public void getCourseDetails() {
        super.getCourseDetails();
        double discountedFee = fee - (fee * discount / 100);
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Fee After Discount: $" + discountedFee);
    }
}

//main class
    public class CourseHierarchy {
        public static void main(String[] args) {

            //create obj of online course
            OnlineCourse onlineCourse = new OnlineCourse("Java Programming", 40, "Udemy", true);
            System.out.println("Online Course:");
            onlineCourse.getCourseDetails();
            System.out.println();

            //create obj of paid online course
            PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 50, "Coursera", true, 100.0, 20.0);
            System.out.println("Paid Online Course:");
            paidOnlineCourse.getCourseDetails();
        }
    }
