package SeleniumWebDriversDemo;

public class HSC_Pojo_c {
		public static void main(String[] args) {
			Pojo_A mark = new Pojo_A();
			
			mark.setStudentName("RAJESH");
			System.out.println("STUDENTNAME " +  mark.getStudentName());
			int id = mark.getId();
			mark.setId(345678);
			System.out.println("STUDENT ID  " +  mark.getId());
			
			mark.setSubjectName("TAMIL");
			System.out.println("SUBJECTNAME " + mark.getSubjectName());
			int tamil = mark.getTamil();
			mark.setTamil(199);
			System.out.println("MARK        " +  mark.getTamil());
			mark.setTamil1("VeryGood");
			System.out.println("GRADE       " + mark.getTamil1());
			
			mark.setSubjectName("ENGLISH");
			System.out.println("SUBJECTNAME " + mark.getSubjectName());;
			int english = mark.getEnglish();
			mark.setEnglish(186);
			System.out.println("MARK        " +  mark.getEnglish());
			mark.setEnglish1("Better");
			System.out.println("GRADE       " +  mark.getEnglish1());
			
			mark.setSubjectName("MATHS");
			System.out.println("SUBJECTNAME " + mark.getSubjectName());
			int maths = mark.getMaths();
			mark.setMaths(155);
			System.out.println("MARK        " + mark.getMaths());
			mark.setMaths1("Good");
			System.out.println("GRADE       " +  mark.getMaths1());
			
			mark.setSubjectName("COMPUTERSCIENCE");
			System.out.println("SUBJECTNAME " + mark.getSubjectName());
			int computerscience = mark.getComputerscience();
			mark.setComputerscience(189);
			System.out.println("MARK        " + mark.getComputerscience());
			mark.setComputerscience1("Good");
			System.out.println("GRADE       " +  mark.getComputerscience1());
			
			mark.setSubjectName("PHYSICS");
			System.out.println("SUBJECTNAME " + mark.getSubjectName());
			int physics = mark.getPhysics();
			mark.setPhysics(124);
			System.out.println("MARK        " + mark.getPhysics());
			mark.setPhysics1("Enough");
			System.out.println("GRADE       " +  mark.getPhysics1());
			
			mark.setSubjectName("CHEMISTRY");
			System.out.println("SUBJECTNAME " + mark.getSubjectName());
			int chemistry = mark.getChemistry();
			mark.setChemistry(155);
			System.out.println("MARK        " + mark.getChemistry());
			mark.setChemistry1("Good");
			System.out.println("GRADE       " +  mark.getChemistry1());
			
			 int Tot = mark.getTotal();
			 int Totmark = mark.getTamil() + mark.getEnglish() +mark.getMaths() +mark.getComputerscience() +mark.getPhysics() +mark.getChemistry();
			 System.out.println("Total Marks   "  + Totmark);
			 
			 mark.setTotal1("***** GOOD******");
			 System.out.println(mark.getTotal1());
		}

		}

