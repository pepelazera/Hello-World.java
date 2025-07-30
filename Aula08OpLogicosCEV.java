package aulas;

public class Aula08OpLogicosCEV {
    public static void main(String[] arg) {
        int x, y, z;
        x = 4;
        y = 7;
        z = 12;

        boolean r;
        //    V   e  V   = true
        r = (x<y && y<z)?true:false;
        System.out.println(r);

        boolean r2;
        //    V   ^  V  = false (XOU) (Ou um, Ou outro)
        r2 = (x<y ^ y<z)?true:false;
        System.out.println(r2);
    }
}
