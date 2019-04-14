import java.util.ArrayList;
public class WorkClass {
    double S;

    public double triangle1(float a, float h) {
        S = (a * h) / 2;
        return S;
    }

    public double triangle2(float a, float b,float anglec) {
        S = (a * b * Math.sin(anglec)) / 2;
        return S;
    }

    public double triangle3(float a,float b,float c) {
        float p;
        p = (a + b + c) / 2;
        S = Math.sqrt(p * (p - a) * (p - b * (p - c)));
        return S;
    }

    public double triangle4(float a,float angleb,float anglec) {
        S = Math.pow(a, 2) / (2 * (1 / (Math.tan(angleb)) + 1 / (Math.tan(anglec))));
        return S;
    }
    public double square1(float a){
        S = Math.pow(a,2);
        return S;
    }
    public double square2(float d){
        S = Math.pow(d,2)/2;
        return S;
    }
    public double rectangle1(float a, float b){
        S = a*b;
        return S;
    }
    public double rectangle2(float d,float anglea){
        S = (Math.pow(d,2)/2)*Math.sin(anglea);
        return S;
    }
    public double rhombus1(float a, float h){
        S = a*h;
        return S;
    }
    public double rhombus2(float d, float d2){
        S = (d*d2)/2;
        return S;
    }
    public double rhombus3(float a, float anglea){
        S = Math.pow(a,2)*Math.sin(anglea);
        return S;
    }
    public double rhombus4(float a, float r){
        S = 2*a*r;
        return S;
    }
    public double circle(float r){
        S = Math.PI*Math.pow(r,2);
        return S;
    }
}