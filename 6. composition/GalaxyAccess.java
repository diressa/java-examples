/**
 * 
 * Created By: Beza Nigatu
 * Composition
 * October 14, 2021
 *
 **/
public class GalaxyAccess {
	public static void main(String[] args) {
		Galaxy milky_way = new Galaxy("Milky Way", 400, 100000 );
		Galaxy androdema = new Galaxy("Androdema", 1000, 220000);
		Galaxy whirlpool = new Galaxy("Whirlpool", 5000000, 76000);
	
		//Milky Way Stars
		Star sun = new Star("Sun", 1390000, 4.600, 15700000);
		Star sirius = new Star("Sirius B", 12000, 0.230, 25200);
		Star canopus = new Star("Canopus", 99000000, 0.025, 7400);
		
		//Androdema Stars
		Star alpheratz= new Star("Alpheratz (Alpha Andromedae)", 12200000, 1, 12000);
		Star mirach = new Star("Mirach (Beta Andromedae)", 70000000, 3, 4500);
		Star almach = new Star("Almach A (Gamma Andromedae)", 63000000, 1, 5200);
		
		//Whirlpool Stars
		Star cor = new Star("Cor Caroli (Alpha Canum Venaticorum)", 12200000, 1.5, 7500);
		Star chara = new Star("Chara (Beta Canum Venaticorum)", 70000000, 2.5, 6000);
		Star superba = new Star("La Superba (Y Canum Venaticorum)", 63000000, 0.85, 2800);


		//Prints MW Galaxy
		System.out.println(milky_way.toString());  
		//Prints its stars
		System.out.println(sun.toString()); 
		System.out.println(sirius.toString());
		System.out.println(canopus.toString());
		
		
		//Prints Androdema Galaxy
		System.out.println(androdema.toString());
		//Its stars
		System.out.println(alpheratz.toString());
		System.out.println(mirach.toString());
		System.out.println(almach.toString());
		
		
		//Prints Whirlpool Galaxy
		System.out.println(whirlpool.toString());
		//Its stars
		System.out.println(cor.toString());
		System.out.println(chara.toString());
		System.out.println(superba.toString());
		
	}
}

