package SeleniumWebDriversDemo;

public class SSLC_Pojo_B {
	public static void main(String[] args) {
		Pojo_A mark = new Pojo_A();
		
		mark.setStudentName("RAJESH");
		System.out.println("STUDENTNAME " +  mark.getStudentName());
		int id = mark.getId();
		mark.setId(9876543);
		System.out.println("STUDENT ID  " +  mark.getId());
		
		mark.setSubjectName("TAMIL");
		System.out.println("SUBJECTNAME " + mark.getSubjectName());
		int tamil = mark.getTamil();
		mark.setTamil(100);
		System.out.println("MARK        " +  mark.getTamil());
		mark.setTamil1("VeryGood");
		System.out.println("GRADE       " + mark.getTamil1());
		
		mark.setSubjectName("ENGLISH");
		System.out.println("SUBJECTNAME " + mark.getSubjectName());;
		int english = mark.getEnglish();
		mark.setEnglish(75);
		System.out.println("MARK        " +  mark.getEnglish());
		mark.setEnglish1("Better");
		System.out.println("GRADE       " +  mark.getEnglish1());
		
		mark.setSubjectName("MATHS");
		System.out.println("SUBJECTNAME " + mark.getSubjectName());
		int maths = mark.getMaths();
		mark.setMaths(89);
		System.out.println("MARK        " + mark.getMaths());
		mark.setMaths1("Good");
		System.out.println("GRADE       " +  mark.getMaths1());
		
		mark.setSubjectName("SCIENCE");
		System.out.println("SUBJECTNAME " + mark.getSubjectName());
		int science = mark.getScience();
		mark.setScience(65);
		System.out.println("MARK        " + mark.getScience());
		mark.setScience1("Average");
		System.out.println("GRADE       " +  mark.getScience1());
		
		mark.setSubjectName("SOCIAL");
		System.out.println("SUBJECTNAME " + mark.getSubjectName());
		int social = mark.getSocial();
		mark.setSocial(45);
		System.out.println("MARK        " + mark.getSocial());
		mark.setSocial1("NotEnough");
		System.out.println("GRADE       " +  mark.getSocial1());
		
		 int Tot = mark.getTotal();
		 int Totmark = mark.getTamil() + mark.getEnglish() +mark.getMaths() +mark.getScience() +mark.getSocial();
		 System.out.println("Total Marks   "  + Totmark);
		 
		 mark.setTotal1("***** Average******");
		 System.out.println(mark.getTotal1());
	}
}
