import java.util.ArrayList;

public class Arma extends Equipo {
    private int potencia, alcanceMaximo, numeroDados, valorExito;
    private boolean estaActiva;
    String[] nombresArmasCuerpo={"Cuchilla letal",
            "Garra sangrienta",
            "Puñal sombrío",
            "Mazo triturador",
            "Hacha de guerra",
            "Espada relámpago",
            "Lanza emboscada",
            "Daga sigilosa",
            "Garrote aplastante",
            "Cadenas mortales"};
    String[] nombresArmasCortaDistancia={
            "Ballesta asesina",
            "Arco de tormenta",
            "Lanzagranadas estruendoso",
            "Cañón de plasma",
            "Rifle de francotirador furtivo",
            "Cerbatana venenosa",
            "Lanzallamas infernal",
            "Cañón gauss devastador",
            "Látigo eléctrico",
            "Lanzacohetes destructor"
    };
    String[] getNombresArmasLargaDistancia={
            "Rifle de precisión",
            "Fusil de francotirador",
            "Cañón de partículas",
            "Ballesta de largo alcance",
            "Cañón láser",
            "Rifle electromagnético",
            "Arco de energía",
            "Rifle de plasma",
            "Mosquete gravitatorio",
            "Cañón gauss de largo alcance"
    };
    public Arma(){
        int numeroRamdon=(int)(Math.random()*11);
    }
}
