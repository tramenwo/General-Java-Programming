import java.util.*;
import java.io.*;

public class JesuitAthlete {
	
	String Name; //Ethan Reese 
	int Grade; //9,10,11,12
	int Year; //2015,2016,2017,2018
	int YearRank; 
	String Time; // 16:18, 16:05, 15:38, 15:18
	boolean PR; // false, false, false, true
	String Date; //Date which Ran
	String GivenID;
	float TimeinSeconds;//Time ran in Seconds
	float Speed;//Speed given in Miles Per Hour
	String Pace;//Pace per Mile
	
	public JesuitAthlete (String name) {
		Name = name;
	}
	
	public String getName() {
		return Name;
	}
	
	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public int getYearRank() {
		return YearRank;
	}

	public void setYearRank(int yearRank) {
		YearRank = yearRank;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public boolean isPR() {
		return PR;
	}

	public void setPR(boolean pR) {
		PR = pR;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public int getGrade() {
		return Grade;
	}

	public void setGrade (int grade) {
		Grade = grade;
	}
	
	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return /**"SunsetAthlete [Name = " + Name + ", Grade = " + Grade + ", Year = " + Year + ", YearRank = " + YearRank
				+ ", Time = " + Time + ", PR = " + PR + ", Date = " + Date + ", GivenID = " + GivenID
				+ ", toString() = " + super.toString() + "]";*/
		String.format("%-25s%-4d%-10d%-10d%-10s%-10s%-5.1f",Name,Grade,Year,YearRank,Time,Date,TimeinSeconds);
	}
		
	public void setGivenID() {
		GivenID = Name + "" + Year;
	}

	public String getGivenID() {
		return GivenID;
	}
	
	public float getTimeinSeconds() {
		return TimeinSeconds;
	}
	
	public void setTimeinSeconds() {
		TimeinSeconds = 0;
		for (int i = 0; i < Time.length(); i++) {
			if (Time.charAt(i) == ':') {
				TimeinSeconds = Integer.parseInt(Time.charAt(i-2) + "" + Time.charAt(i-1)) * 60 + Integer.parseInt(Time.charAt(i+1) + "" + Time.charAt(i+2));
			}
			if (Time.charAt(i) == '.') {
				TimeinSeconds += .1*Integer.parseInt(Character.toString(Time.charAt(i+1)));
			}
		}	
	}
	
	public void setSpeed() {
		//Distance = 5000 meters = 3.106856 miles
		//1 mile = 1609.34 meters
		Speed = (float)3.106856/TimeinSeconds*3600;
	}
	
	public float getSpeed() {
		return Speed;
	}
	
	public void setPace() {
		float PaceinSeconds;
		PaceinSeconds = (float)(TimeinSeconds/3.106856);
		if (Integer.toString((int)PaceinSeconds%60).length() == 1) {
			Pace = (int)PaceinSeconds/60 + ":0" + (int)PaceinSeconds%60;
		}
		else{
			Pace = (int)PaceinSeconds/60 + ":" + (int)PaceinSeconds%60;
		}
	}
	
	public String getPace() {
		return Pace;
	}
	
	public static ArrayList <JesuitAthlete> JesuitAllTime = new ArrayList<JesuitAthlete>();
	public static ArrayList<JesuitAthlete> AllTimeFresh = new ArrayList<JesuitAthlete>();
	public static ArrayList<JesuitAthlete> AllTimeSoph = new ArrayList<JesuitAthlete>();
	public static ArrayList<JesuitAthlete> AllTimeJuniors = new ArrayList<JesuitAthlete>();
	public static ArrayList<JesuitAthlete> AllTimeSeniors = new ArrayList<JesuitAthlete>();
	public static ArrayList<ArrayList<JesuitAthlete>> Individuals = new ArrayList<ArrayList<JesuitAthlete>>();
	//ArrayList of Athletes
	@SuppressWarnings({ "unused", "resource" })
	public static void main (String[] args) throws Exception{
		//Scanner scanner = new Scanner(System.in);	
		PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter ("JesuitTimes.txt")));
		for (int i = 2000; i <= 2018; i++) {
			String yearString = i + " SZN.txt";
			Scanner fileScanner = new Scanner(new File(yearString));
			if (i == 2000) {
				for (int j = 0; j < 7; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2001) {
				for (int j = 0; j < 7; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2002) {
				for (int j = 0; j < 7; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2003) {
				for (int j = 0; j < 7; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2004) {
				for (int j = 0; j < 7; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2005) {
				for (int j = 0; j < 65; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2006) {
				for (int j = 0; j < 74; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2007) {
				for (int j = 0; j < 68; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2008) {
				for (int j = 0; j < 104; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2009) {
				for (int j = 0; j < 78; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2010) {
				for (int j = 0; j < 81; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2011) {
				for (int j = 0; j < 78; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2012) {
				for (int j = 0; j < 73; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2013) {
				for (int j = 0; j < 76; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2014) {
				for (int j = 0; j < 80; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2015) {
				for (int j = 0; j < 85; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2016) {
				for (int j = 0; j < 81; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2017) {
				for (int j = 0; j < 76; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
			else if (i == 2018) {
				for (int j = 0; j < 68; j++) {
					out.println(getLine(fileScanner,i));
				}
			}
		}
		/**for (int i = 0; i < JesuitAllTime.size(); i++) {
			System.out.println(JesuitAllTime.get(i).toString());
		}*/
		out.close();
		AllTimesNoAthletes(JesuitAllTime,"ALLTIME");
		Fill();
		AllTimesNoAthletes(AllTimeFresh,"FRESHMEN");
		AllTimesNoAthletes(AllTimeSoph,"SOPHS");
		AllTimesNoAthletes(AllTimeJuniors,"JUNIORS");
		AllTimesNoAthletes(AllTimeSeniors, "SENIORS");
		createIndividuals();
		/*System.out.println(Individuals.size());
		for (int j = 0; j < Individuals.size(); j++) {
			System.out.printf("%-25s",Individuals.get(j).get(0).getName());
			for (int j2 = 0; j2 < Individuals.get(j).size(); j2++) {
				System.out.print("Year: " + Individuals.get(j).get(j2).getGrade());
			}
			System.out.println();
		}*/
		float[] RateofChangeperYear = new float[Individuals.size()];
	}
	
	public static void Fill() {
		for (int i = 0; i < JesuitAllTime.size(); i++) {
			if(JesuitAllTime.get(i).getGrade() == 9) {
				AllTimeFresh.add(JesuitAllTime.get(i));
			}
			else if(JesuitAllTime.get(i).getGrade() == 10) {
				AllTimeSoph.add(JesuitAllTime.get(i));
			}
			else if(JesuitAllTime.get(i).getGrade() == 11) {
				AllTimeJuniors.add(JesuitAllTime.get(i));
			}
			else if(JesuitAllTime.get(i).getGrade() == 12) {
				AllTimeSeniors.add(JesuitAllTime.get(i));
			}
		}
	}
	
	public static void createIndividuals() {
		for (int i = 0; i < JesuitAllTime.size(); i++) {
			//Check if Individuals Contains the specified Athlete Already
			//JesuitAllTime.get(i);//Find if this athlete exists in this two dimensional arraylist
			boolean ContainsAlready = false;
			int index = 0;
			for (int j = 0; j < Individuals.size(); j++) {
				//System.out.println("ENTERED 1");
				if (Individuals.get(j).get(0).getName().equals(JesuitAllTime.get(i).getName())) {
					ContainsAlready = true;
					index = j;
					//System.out.println("ENTERED 2");
					break;
				}
			}
			if (ContainsAlready == true) {
				Individuals.get(index).add(JesuitAllTime.get(i));
				//System.out.println("ENTERED 3");
			}
			if(ContainsAlready == false) {
				ArrayList<JesuitAthlete> adding = new ArrayList<JesuitAthlete>();
				adding.add(JesuitAllTime.get(i));
				Individuals.add(adding);
				//System.out.println("ENTERED 4");
			}
			//If No create that individual
			//If Yes add to that individuals
		}
	}
	
	public static String getLine(Scanner fileScanner, int Year) throws Exception{
		char[] Yearrank = fileScanner.next().toCharArray();
		int YearRank;
		if (Yearrank.length == 3) {
			YearRank = Integer.parseInt(Yearrank[0] + "" + Yearrank[1]);
		}
		else {
			YearRank = Integer.parseInt(Yearrank[0] + "");
		}
		//Grade
		String grade = fileScanner.next();
		//Name
		String firstname = fileScanner.next();
		String lastname = fileScanner.next();
		String time = fileScanner.next();
		JesuitAthlete newStudent = new JesuitAthlete(firstname + " " + lastname);
		if (grade.charAt(0) == '9' || grade.charAt(0) == '1') {
			newStudent.setGrade(Integer.parseInt(grade));
		}
		newStudent.setYearRank(YearRank);
		newStudent.setTime(time);
		String DateOrPR = fileScanner.next();
		String Date;
		if (DateOrPR.charAt(0) == 'P') {
			newStudent.setPR(true);
			Date = fileScanner.next() + " " + fileScanner.next();
		}
		else {
			newStudent.setPR(false);
			Date = DateOrPR + " " + fileScanner.next();
		}
		newStudent.setDate(Date);
		newStudent.setYear(Year);
		newStudent.setGivenID();
		newStudent.setTimeinSeconds();
		newStudent.setPace();
		newStudent.setSpeed();
		//System.out.println(newStudent.toString());
		JesuitAllTime.add(newStudent);
		fileScanner.nextLine();
		return newStudent.toString();
	}
	
	
	public static void BasicStats(float[] AllTimesInt,String Name) throws IOException{
		//Mean
		PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter ("Statistics" + Name + ".txt")));
		float sum = 0;
		for (int i = 0; i < JesuitAllTime.size(); i++) {
			sum += JesuitAllTime.get(i).getTimeinSeconds();
		}
		/*System.*/out.printf("Mean is: %.2f\n",sum/JesuitAllTime.size());	
		//Mode
		/*System.*/out.printf("Mode is: %.2f\n", mode(AllTimesInt));
		//Range
		float Range = AllTimesInt[AllTimesInt.length-1] - AllTimesInt[0];
		/*System.*/out.printf("Range is: %.2f\nSmallest is: %.2f\nLargest is: %.2f\n",Range,AllTimesInt[0],AllTimesInt[AllTimesInt.length-1]);
		//InterQuartile Ranges and Median
		/*System.*/out.printf("Q1 is: %.2f\nQ2/Median is: %.2f\nQ3 is: %.2f\n",AllTimesInt[(int)AllTimesInt.length/4],AllTimesInt[(int)AllTimesInt.length/2],AllTimesInt[3*(int)AllTimesInt.length/4]);
		//Standard Deviation
		/*System.*/out.printf("Standard Deviation is: %.2f\n", calculateSD(AllTimesInt));
		//Population Variance
		/*System.*/
		//out.printf("Population Variance is: %.2f\n",variance());
		out.close();
	}
	
	public static float mode(float[] sequence) 
    {
        float maxValue = 0;
        int maxCount = 0;
 
        for (int i = 0; i < sequence.length; ++i) 
        {
            int count = 0;
            for (int j = 0; j < sequence.length; ++j) 
            {
                if (sequence[j] == sequence[i])
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = sequence[i];
            }
        }
 
        return maxValue;
    }
	
	public static double calculateSD(float numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }

	public static int sum() {
		int sum = 0;
		for (int i = 0; i < JesuitAllTime.size(); i++) {
			sum += JesuitAllTime.get(i).getTimeinSeconds();
		}
		return sum;
   }

	public static double average() {
       double average = sum() / JesuitAllTime.size();
       return average;
    }
	
	public static double variance() {
	    double sumMinusAverage = sum() - average();
	    return sumMinusAverage * sumMinusAverage / (JesuitAllTime.size()-1);
	}
	
	public static void AllTimesNoAthletes (ArrayList<JesuitAthlete> Name,String OutName) throws IOException{
		float[] AllTimesInt = new float[Name.size()];
		float[] AllTimesIntNonSorted = new float[Name.size()];
		String[] AllTimesString = new String[Name.size()];
		String[] AllTimesNames = new String[Name.size()];
		int[] AllTimesYears = new int[Name.size()];
		int[] AllTimesGrade = new int[Name.size()];
		String[] AllTimesPace = new String[Name.size()];
		for (int i = 0; i < Name.size(); i++) {
			AllTimesInt[i] = Name.get(i).getTimeinSeconds();
			AllTimesString[i] = Name.get(i).getTime();
			AllTimesNames[i] = Name.get(i).getName(); 
			AllTimesIntNonSorted[i] = Name.get(i).getTimeinSeconds();
			AllTimesYears[i] = Name.get(i).getYear();
			AllTimesPace[i] = Name.get(i).getPace();
			AllTimesGrade[i] = Name.get(i).getGrade();
			//System.out.print("Time: " + JesuitAllTime.get(i).getTime() + "\tIn Seconds: ");
			//System.out.println(AllTimes[i]);
		}
		PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter ("AllTimesNoAthlete" + OutName + ".txt")));
		for (int i = 0; i < AllTimesInt.length; i++) {
			if (AllTimesInt[i] != 0) {
				out.printf("%-25s%-10s%-6.1f\n",AllTimesNames[i],AllTimesString[i],AllTimesInt[i]);
			}
		}
		out.close();
		PrintWriter out2 = new PrintWriter (new BufferedWriter (new FileWriter ("AllTimesSortedAthlete" + OutName + ".txt")));
		Arrays.sort(AllTimesInt);
		BasicStats(AllTimesInt,OutName);
		//Percentage(AllTimesInt,OutName);
		for (int i = 0; i < AllTimesInt.length; i++) {
			out2.printf("Rank %3d:%10.1f",i,AllTimesInt[i]);
			for (int j = 0; j < AllTimesIntNonSorted.length; j++) {
				if (AllTimesInt[i] == AllTimesIntNonSorted[j]) {
					out2.printf("%10s%25s%10d%10s%10d\n",AllTimesString[j],AllTimesNames[j],AllTimesYears[j],AllTimesPace[j],AllTimesGrade[j]);
					break;
				}
			}
		}
		out2.close();
		PrintWriter out3 = new PrintWriter (new BufferedWriter (new FileWriter ("AllTimes" + OutName + ".txt")));
		for (int i = 0; i < AllTimesInt.length; i++) {
			out3.println(AllTimesInt[i]);
		}
		out3.close();
	}
	
	public static void Percentage (float[] AllTimesIn,String Name) throws IOException{		
		for (int i = 16; i < 25; i++) {
			PrintWriter out = new PrintWriter (new BufferedWriter (new FileWriter ("SUB " + i + Name + ".txt")));
			Sub(i,out,AllTimesIn,Name);
			out.close();
		}
		
	}
	
	public static void Sub(int SubNum,PrintWriter out,float[] AllTimesIn,String Name) throws IOException{
		out.println("SUB " + SubNum);
		int Seconds = SubNum*60;
		int counter = 0;
		for (int i = 0; i < AllTimesIn.length; i++) {
			if (AllTimesIn[i] < Seconds) {
				counter = counter + 1;
			}
		}
		//float Percentage = counter/AllTimesIn.length*100;
		out.println("There are " + counter + " people below " + SubNum + " minutes.");
		//out.println("That is " + Percentage + " percent of the total " + Name + " Population");
	}
}
