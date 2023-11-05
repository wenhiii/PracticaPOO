import java.util.ArrayList;
public class Juego {
    //Atributos
    public int[][]mapa;
    private int numJugadores;
    private ArrayList<Activables>entidadesActivables;
    private int ronda;
    private int numMuertesJugadores;

    //Metodos get y set

    public ArrayList<Activables> getEntidadesActivables() {
        return this.entidadesActivables;
    }
    public int getNumJugadores() {
        return this.numJugadores;
    }
    public int getNumMuertesJugadores() {
        return this.numMuertesJugadores;
    }
    public int getRonda() {
        return this.ronda;
    }
    public int[][] getMapa() {
        return this.mapa;
    }

    public void setEntidadesActivables(ArrayList<Activables> entidadesActivables) {
        this.entidadesActivables = entidadesActivables;
    }
    public void setMapa(int[][] mapa) {
        this.mapa = mapa;
    }
    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }
    public void setNumMuertesJugadores(int numMuertesJugadores) {
        this.numMuertesJugadores = numMuertesJugadores;
    }
    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    //Constructores

    //Metodos
    public void visualizar(Superviviente jugador){
        System.out.println(jugador.getNombre());
        System.out.println(jugador.getAccionesRestantes());
        if (jugador.getInventario().isEmpty()){
            System.out.println("No tiene objetos el pobre");
        }else{
            ArrayList<Equipo> equipoJugador=jugador.getInventario();
            for (int i=1; i<=equipoJugador.size(); i++){
                System.out.print(equipoJugador.get(i).getNombre()+", ");
            }
        }
        if (jugador.getArmasActivas().isEmpty()){
            System.out.println("No tiene armas activas el pobre");
        }else{
            ArrayList<Equipo> armasActivasJugador=jugador.getArmasActivas();
            for (int i=1; i<=armasActivasJugador.size(); i++){
                System.out.println(armasActivasJugador.get(i).getNombre());
            }
        }
        System.out.println(jugador.getZombiesEliminados());
        System.out.println(jugador.getHeridas());
    }

}