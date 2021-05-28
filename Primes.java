class Primes{
	//Diese Funktion bekommt eine Int-Array @arr und gib ein String @ausgabe zurück, die das Inhalt von @arr entspricht.
	static String arrayToString(int[] arr ){
		String ausgabe = "";
		//Wird überprüft, ob die Array leer ist.
		if(arr == null){
			ausgabe = "null";
		//Fall wenn das Array nur eine Zahl enthält.
		}else if(arr.length<2){
			int erstZahl = arr[0];
			ausgabe = "[" + Integer.toString(erstZahl) + "]";
		//Fall wenn das Array mehr als eine Zahl hat
		}else{
			int erstZahl = arr[0];
			ausgabe = ausgabe + "[" + Integer.toString(erstZahl);
			for(int i = 1; i<arr.length-1; i++){
				int zahl = arr[i];
				ausgabe = ausgabe + ", " + Integer.toString(zahl);
			}
			int letzteZahl = arr[arr.length-1];
			ausgabe = ausgabe + ", " + Integer.toString(letzteZahl) + "]"; 
		}
		return ausgabe;
	}
	//Diese Funktion erstellt ein int-Array, die die Zahlen von 2 bis n(Wird in dem Parameter gegeben) enthält
	static int[] fillArray(int n){
		int arrayInt[] = new int [n-1];
		int zahl = 2;
		//hier wird das Array erfüllt.
		for(int i=0;i<arrayInt.length; i++){
			arrayInt[i] = zahl;
			zahl++;
		}
		return arrayInt;
	}
	//diese Funktion wird alle Zahlen von dem Array @arr, die durch @index(Int, der in dem Parameter gegeben wird) teilbar sind, durch ein -1 ersetzt
	static void filterArray(int[] arr, int index){
		index = arr[index];
		for(int i = 0;i<arr.length; i++){
			if(arr[i] != index){
				if( arr[i] % index == 0){
					arr[i] = -1;
				}
			}
		}
	}
	//Diese Funktion drückt ein Int-Array von 2 bis der Zahl @n aus, aber dieses enthält nur Primzahlen.
	static void primes(int n){
		int neuGrosse = n;
		//Hier wird das Array von 2 bis der Zahl n produziert
		int[] arrayP = fillArray(n);
		//Hier wird die Primzahlen filtriert.
		filterArray(arrayP, 0);
		filterArray(arrayP, 1);
		filterArray(arrayP, 3);
		filterArray(arrayP, 5);
		//Zahlen wir, wie viel Zahl gibt, die nicht -1 sind.
		for(int i = 0;i<arrayP.length;i++){
			if(arrayP[i] == -1){
				neuGrosse--;
			}
		}
		int arrayEnd[] = new int [neuGrosse-1];
		int counter = 0;
		//Füllen wir das Array mit dem Primzahlen.
		for(int j = 0;j<arrayP.length;j++){
			if(arrayP[j] != -1){
				arrayEnd[counter] = arrayP[j];
				counter++;
			}
		}
		System.out.println(arrayToString(arrayEnd));	
	}
	public static void main(String[] args){
		primes(50);
		primes(100);
		primes(20);
	}
}