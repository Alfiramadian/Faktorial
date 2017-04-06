public class jurnalno2 {
public static void main(String[]args){
System.out.println("Alfiyah Ramadian (6706154161)");
System.out.println("");
int l = 1;
int tingkat = 10;
int n = 12/2;
for(int i=1;i<=n;i++){
for(int k=n;k>i;k--){
System.out.print(" ");
}
for(int j=1;j<=l;j++){
System.out.print("+");
}
l+=2;
 
System.out.println("");
}
l -= 4;
 
for(int i=(n-1);i>=1;i--){
for(int k=i;k<=(n-1);k++){
System.out.print(" ");
}
for(int j=l;j>=1;j--){
System.out.print("+");
}
l-=2;
 
System.out.println("");
}

 
 public static void mengambilSpecialKarakter(String kalimat){
        String kalimatBaru = kalimat.replaceAll("[a-zA-Z0-9 ]*", "");
        System.out.println("Spesial Karakter : " + kalimatBaru);
        String [] splitKalimat = kalimatBaru.split("");
        System.out.println("Jumlah special karakter : " + splitKalimat.length);
        
    }
}
