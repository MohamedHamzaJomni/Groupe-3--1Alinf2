public class AymenBenRached {
    public int trouverPGCD(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        return trouverPGCD(num2, num1 % num2);}
    public int longChaine(String ch){
        return ch.length();
    }
}
