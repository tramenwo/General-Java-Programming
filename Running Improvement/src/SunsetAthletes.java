import java.io.*;
import java.util.*;


public class SunsetAthletes {

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
	
	public SunsetAthletes (String name) {
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
		return String.format("%-25s%-4d%-10d%-10d%-10s%-10s%-5.1f",Name,Grade,Year,YearRank,Time,Date,TimeinSeconds);
		/**"SunsetAthlete [Name = " + Name + ", Grade = " + Grade + ", Year = " + Year + ", YearRank = " + YearRank
		+ ", Time = " + Time + ", PR = " + PR + ", Date = " + Date + ", GivenID = " + GivenID
		+ ", toString() = " + super.toString() + "]";*/
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
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		//Scanner fileScanner = new Scanner();
		
		
		scanner.close();
	}

}
