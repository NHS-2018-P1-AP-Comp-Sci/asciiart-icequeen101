/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOUR CODE GOES HERE :)

public class ASCIIArt {

	public static void main(String[] args) {
		drawDiamond();
		drawSparkle();
		drawHead();
		drawBody();
		drawLeg();
		drawGround();
		drawSparkle();
		drawDiamond();
		System.out.println("\t    Good Morning!");
		drawGround();
	}
	public static void drawHead() {
		System.out.println("                   ////^\\");
		System.out.println("                 ////`   %==--") ;
		System.out.println("                ///` ( ' |");
		System.out.println("               ///`  /\\__/");
		System.out.println("              ////`  @");
	}
	public static void drawBody() {
		System.out.println("     //\"-------       |");
		System.out.println("    //\"(              |");
		System.out.println("   ///\" \\         \\  /");
	}
	public static void drawLeg(){
		System.out.println("        | |-------| |");
		System.out.println("        | |       | |");
		System.out.println("        )_\\       )_\\");
	}
	public static void drawGround(){
		System.out.println("--------------------------------------");
	}
	public static void drawDiamond(){
		System.out.println("/\\                                  /\\");
		System.out.println("\\/                                  \\/");
	}
	public static void drawSparkle(){
		System.out.println(" *                                   *");
	}
	}
