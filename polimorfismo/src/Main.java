

public class Main{
    public static void main(String[] args) {
        auto tsuru = new auto();
        tsuru.cambiarPuertas(7);
        //tsuru.showData();
        Deportivo camaro = new Deportivo();
        camaro.acelearAuto();
        //camaro.showData();
        auto nisan = new Deportivo();
        //nisan.showData();
        Deportivo cam2 = (Deportivo)nisan;
        //cam2.showData();

        auto normal = (auto)cam2;
        normal.showData();
    }
}